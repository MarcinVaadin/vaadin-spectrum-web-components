package org.vaadin.spectrum;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDirFluent;

import java.util.List;
import java.util.stream.Stream;

@Tag("sp-accordion")
@NpmPackage(value = "@spectrum-web-components/accordion", version = "0.7.9")
@JsModule("@spectrum-web-components/accordion/sp-accordion.js")
public class SpAccordion extends Div implements HasDirFluent<SpAccordion>, ComponentEventListener<SpAccordionItem.SpAccordionItemToggleEvent> {

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
        super.add(item);
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

    public Registration addItemToggleEventListener(ComponentEventListener<SpAccordionItem.SpAccordionItemToggleEvent> listener) {
        return addListener(SpAccordionItem.SpAccordionItemToggleEvent.class, listener);
    }

    @Override
    public void onComponentEvent(SpAccordionItem.SpAccordionItemToggleEvent spAccordionItemToggleEvent) {
        this.fireEvent(spAccordionItemToggleEvent);
    }
}
