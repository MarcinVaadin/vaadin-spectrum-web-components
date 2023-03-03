package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;

@Tag("sp-accordion-item")
@NpmPackage(value = "@spectrum-web-components/accordion", version = "0.7.9")
@JsModule("@spectrum-web-components/accordion/sp-accordion-item.js")
public class SpAccordionItem extends Component implements HasComponents, HasLabelFluent<SpAccordionItem>, HasDisabledFluent<SpAccordionItem> {

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpAccordionItem setOpen(boolean open) {
        boolean wasOpen = isOpen();
        openProperty.set(this, open);
        if (wasOpen != open) {
            fireEvent(new SpAccordionItemToggleEvent(this, false));
        }
        return this;
    }
    @Synchronize("sp-accordion-item-toggle")
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

    public Registration addItemToggleEventListener(ComponentEventListener<SpAccordionItemToggleEvent> listener) {
        return addListener(SpAccordionItemToggleEvent.class, listener);
    }

    @DomEvent("sp-accordion-item-toggle")
    public static class SpAccordionItemToggleEvent extends ComponentEvent<SpAccordionItem> {
        public SpAccordionItemToggleEvent(SpAccordionItem source, boolean fromClient) {
            super(source, fromClient);
        }
    }

}
