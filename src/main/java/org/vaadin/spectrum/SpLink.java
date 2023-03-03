package org.vaadin.spectrum;

import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Anchor;
import org.vaadin.spectrum.properties.HasVariantFluent;

@Tag("sp-link")
@NpmPackage(value = "@spectrum-web-components/link", version = "0.14.4")
@JsModule("@spectrum-web-components/link/sp-link.js")
public class SpLink extends Anchor implements HasVariantFluent<SpLink> {

    public enum Variant { SECONDARY };

    public enum Static { BLACK, WHITE }

    // ----- static -----
    private static final PropertyDescriptor<String, String> staticProperty =
            PropertyDescriptors.propertyWithDefault("static", "false");

    public SpLink setStatic(String _static) {
        staticProperty.set(this, _static);
        return this;
    }
    public String getStatic() {
        return staticProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<String, String> quietProperty =
            PropertyDescriptors.attributeWithDefault("quiet", "");

    public SpLink setQuiet(boolean quiet) {
        quietProperty.set(this, String.valueOf(quiet));
        return this;
    }
    public boolean isQuiet() {
        return Boolean.valueOf(quietProperty.get(this));
    }
    // -----------------


    public SpLink() {
    }

    public SpLink(String href, String text) {
        super(href, text);
    }

    public SpLink setVariant(Variant variant) {
        assert variant != null;
        this.setVariant(variant.name().toLowerCase());
        return this;
    }

    public SpLink setStatic(Static _static) {
        assert _static != null;
        this.setStatic(_static.name().toLowerCase());
        return this;
    }

}
