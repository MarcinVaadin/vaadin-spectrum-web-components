package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasTextFluent;
import org.vaadin.spectrum.properties.HasVariantFluent;

@Tag("sp-toast")
@NpmPackage(value = "@spectrum-web-components/toast", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/toast/sp-toast.js")
public class SpToast extends Component implements HasTextFluent<SpToast>, HasDirFluent<SpToast>, HasVariantFluent<SpToast> {

    public enum Variant {NEGATIVE, POSITIVE, INFO, ERROR, WARNING;}

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpToast setOpen(boolean open) {
        openProperty.set(this, open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

    // ----- timeout -----
    private static final PropertyDescriptor<Integer, Integer> timeoutProperty =
            PropertyDescriptors.propertyWithDefault("timeout", -1);
    
    public SpToast setTimeout(Integer timeout) {
        timeoutProperty.set(this, timeout);
        return this;
    }
    public Integer getTimeout() {
        return timeoutProperty.get(this);
    }
    // -----------------

    public SpToast setVariant(Variant variant) {
        assert variant != null;
        this.setVariant(variant.name().toLowerCase());
        return this;
    }

}
