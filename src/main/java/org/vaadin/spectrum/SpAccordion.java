package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDirFluent;

import java.util.List;
import java.util.stream.Stream;

@Tag("sp-accordion")
@NpmPackage(value = "@spectrum-web-components/accordion", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/accordion/sp-accordion.js")
public class SpAccordion extends Component implements HasComponents, HasDirFluent<SpAccordion>, ComponentEventListener<SpAccordionItem.SpAccordionItemToggleEvent> {

    // ----- allowMultiple -----
    private static final PropertyDescriptor<Boolean, Boolean> allowMultipleProperty =
            PropertyDescriptors.propertyWithDefault("allowMultiple", false);

    public SpAccordion setAllowMultiple(boolean allowMultiple) {
        allowMultipleProperty.set(this, allowMultiple);
        return this;
    }
    public boolean isAllowMultiple() {
        return allowMultipleProperty.get(this);
    }
    // -----------------

    public SpAccordion addItem(SpAccordionItem item) {
        add(item);
        item.addItemToggleEventListener(this);
        return this;
    }
    
    public void openItem(SpAccordionItem item) {
        item.setOpen(true);
    }

    public void openAllItems() {
        if (isAllowMultiple()) {
            itemsStream().filter(item -> !item.isDisabled()).forEach(item -> item.setOpen(true));
        }
    }

    public void closeAllItems() {
        itemsStream().filter(item -> !item.isDisabled()).forEach(item -> item.setOpen(false));
    }
    
    public List<SpAccordionItem> getOpenItems() {
        return itemsStream()
                .filter(SpAccordionItem::isOpen)
                .toList();
    }

    public List<SpAccordionItem> getItems() {
        return itemsStream().toList();
    }

    protected Stream<SpAccordionItem> itemsStream() {
        return getChildren()
                .filter(SpAccordionItem.class::isInstance)
                .map(SpAccordionItem.class::cast);
    }

    public Registration addToggleEventListener(ComponentEventListener<SpAccordionToggleEvent> listener) {
        return addListener(SpAccordionToggleEvent.class, listener);
    }

    @Override
    public void onComponentEvent(SpAccordionItem.SpAccordionItemToggleEvent spAccordionItemToggleEvent) {
        this.fireEvent(new SpAccordionToggleEvent(this, spAccordionItemToggleEvent.isFromClient(), spAccordionItemToggleEvent.getSource()));
    }

    public static class SpAccordionToggleEvent extends ComponentEvent<SpAccordion> {

        private SpAccordionItem toggledItem;

        public SpAccordionToggleEvent(SpAccordion source, boolean fromClient, SpAccordionItem toggledItem) {
            super(source, fromClient);
            this.toggledItem = toggledItem;
        }

        public SpAccordionItem getToggledItem() {
            return toggledItem;
        }
    }
}
