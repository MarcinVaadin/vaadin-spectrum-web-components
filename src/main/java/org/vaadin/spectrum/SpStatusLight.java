package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-status-light")
@NpmPackage(value = "@spectrum-web-components/status-light", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/status-light/sp-status-light.js")
public class SpStatusLight extends Component implements HasSizeFluent<SpStatusLight>,
        HasDisabledFluent<SpStatusLight>, HasTextFluent<SpStatusLight> {

    // ----- variant -----
    private PropertyDescriptor<String, String> variantProperty =
            PropertyDescriptors.propertyWithDefault("variant", "info");

    public SpStatusLight setVariant(String variant) {
        variantProperty.set(this, variant);
        return this;
    }
    public String getVariant() {
        return variantProperty.get(this);
    }
    // -----------------

    public enum Variant { NEGATIVE, NOTICE, POSITIVE, INFO, NEUTRAL, YELLOW, FUCHSIA, INDIGO, SEAFOAM, CHARTREUSE, MAGENTA, CELERY, PURPLE}

    public SpStatusLight setVariant(Variant _variant) {
        assert _variant != null;
        this.setVariant(_variant.name().toLowerCase());
        return this;
    }

}
