package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasTextFluent;
import org.vaadin.spectrum.properties.HasVariantFluent;
import org.vaadin.spectrum.slots.HasIconSlot;

@Tag("sp-badge")
@NpmPackage(value = "@spectrum-web-components/badge", version = "0.4.5")
@JsModule("@spectrum-web-components/badge/sp-badge.js")
public class SpBadge extends Component implements HasDirFluent<SpBadge>,
        HasVariantFluent<SpBadge>, HasIconSlot<SpBadge>, HasTextFluent<SpBadge>,
        HasSizeFluent<SpBadge> {

    public enum Fixed { INLINE_START, BLOCK_START, INLINE_END, BLOCK_END }

    public enum Variant { NEUTRAL, INFORMATIVE, POSITIVE, NEGATIVE }

    // ----- fixed -----
    private static final PropertyDescriptor<String, String> fixedProperty =
            PropertyDescriptors.propertyWithDefault("fixed", "");

    public SpBadge setFixed(String _fixed) {
        fixedProperty.set(this, _fixed);
        return this;
    }
    public String getFixed() {
        return fixedProperty.get(this);
    }
    // -----------------

    public SpBadge setFixed(Fixed _fixed) {
        assert _fixed != null;
        this.setFixed(_fixed.name().toLowerCase().replace("_", "-"));
        return this;
    }

    public SpBadge setVariant(Variant _variant) {
        assert _variant != null;
        this.setVariant(_variant.name().toLowerCase());
        return this;
    }

}