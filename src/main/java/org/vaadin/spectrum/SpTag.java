package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-tag")
@NpmPackage(value = "@spectrum-web-components/tags", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/tags/sp-tag.js")
public class SpTag extends Component implements HasTextFluent<SpTag>, HasDisabledFluent<SpTag> {

    // TODO invalid not working
    // ----- invalid -----
    private static final PropertyDescriptor<String, String> invalidProperty =
            PropertyDescriptors.attributeWithDefault("invalid", "");

    public SpTag setInvalid(boolean invalid) {
        invalidProperty.set(this, invalid ? "true" : "");
        return this;
    }
    public boolean isInvalid() {
        return Boolean.valueOf(invalidProperty.get(this));
    }
    // -----------------

    // ----- deletable -----
    private static final PropertyDescriptor<Boolean, Boolean> deletableProperty =
            PropertyDescriptors.propertyWithDefault("deletable", false);

    public SpTag setDeletable(boolean deletable) {
        deletableProperty.set(this, deletable);
        return this;
    }
    public boolean isDeletable() {
        return deletableProperty.get(this);
    }
    // -----------------

}
