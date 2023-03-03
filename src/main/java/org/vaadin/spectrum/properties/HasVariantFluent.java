package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasVariantFluent<T> extends HasElement {

    // ----- variant -----
    PropertyDescriptor<String, String> variantProperty =
            PropertyDescriptors.propertyWithDefault("variant", "");

    default T setVariant(String variant) {
        variantProperty.set(this, variant);
        return (T) this;
    }
    default String getVariant() {
        return variantProperty.get(this);
    }
    // -----------------

}
