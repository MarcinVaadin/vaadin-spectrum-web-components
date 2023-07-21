package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasVariantFluent;

@Tag("sp-coachmark")
@NpmPackage(value = "@spectrum-web-components/coachmark", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/coachmark/sp-coachmark.js")
public class SpCoachmark extends Component implements HasDirFluent, HasVariantFluent {

    public enum Variant { STANDARD, DARK, LIGHT }
    
    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpCoachmark setQuiet(boolean _quiet) {
        quietProperty.set(this, _quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    public SpCoachmark() {

    }

    public SpCoachmark(Variant variant) {
        setVariant(variant);
    }

    public SpCoachmark(boolean quiet) {
        setQuiet(quiet);
    }

    public SpCoachmark(Variant variant, boolean quiet) {
        setVariant(variant);
        setQuiet(quiet);
    }

    public SpCoachmark setVariant(Variant _variant) {
        assert _variant != null;
        this.setVariant(_variant.name().toLowerCase());
        return this;
    }


}
