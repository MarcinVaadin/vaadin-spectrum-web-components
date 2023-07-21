package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

/**
 * <a href="https://opensource.adobe.com/spectrum-web-components/components/button/">sp-button</a>
 */
@Tag("sp-button")
@NpmPackage(value = "@spectrum-web-components/button", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/button/sp-button.js")
public class SpButton extends Component implements ClickNotifier<SpButton>,
        HasTextFluent<SpButton>, HasSizeFluent<SpButton>, HasDisabledFluent<SpButton> {

    public enum Variant {ACCENT, PRIMARY, SECONDARY, NEGATIVE, BLACK, WHITE};

    public enum Treatment {FILL, OUTLINE};

    // ----- active -----
    private static final PropertyDescriptor<Boolean, Boolean> activeProperty =
            PropertyDescriptors.propertyWithDefault("active", false);

    public SpButton setActive(boolean active) {
        activeProperty.set(this, active);
        return this;
    }
    public boolean isActive() {
        return activeProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpButton setQuiet(boolean quiet) {
        quietProperty.set(this, quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    // ----- static -----
    private static final PropertyDescriptor<String, String> staticProperty =
            PropertyDescriptors.propertyWithDefault("static", "");

    public SpButton setStatic(String _static) {
        staticProperty.set(this, _static);
        return this;
    }
    public String getStatic() {
        return staticProperty.get(this);
    }
    // -----------------

    // ----- treatment -----
    private static final PropertyDescriptor<String, String> treatmentProperty =
            PropertyDescriptors.propertyWithDefault("treatment", "fill");
    
    public SpButton setTreatment(String treatment) {
        treatmentProperty.set(this, treatment);
        return this;
    }
    public String getTreatment() {
        return treatmentProperty.get(this);
    }
    // -----------------

    // ----- type -----
    private static final PropertyDescriptor<String, String> typeProperty =
            PropertyDescriptors.propertyWithDefault("type", "button");

    public SpButton setType(String type) {
        typeProperty.set(this, type);
        return this;
    }
    public String getType() {
        return typeProperty.get(this);
    }
    // -----------------

    // ----- variant -----
    private static final PropertyDescriptor<String, String> variantProperty =
            PropertyDescriptors.propertyWithDefault("variant", "");

    public SpButton setVariant(String variant) {
        variantProperty.set(this, variant);
        return this;
    }
    public String getVariant() {
        return variantProperty.get(this);
    }
    // -----------------

    public SpButton() {

    }

    public SpButton(String text) {
        setText(text);
    }

    public SpButton setVariant(Variant variant) {
        assert variant != null;
        this.setVariant(variant.name().toLowerCase());
        return this;
    }

    public SpButton setTreatment(Treatment treatment) {
        assert treatment != null;
        this.setTreatment(treatment.name().toLowerCase());
        return this;
    }

}
