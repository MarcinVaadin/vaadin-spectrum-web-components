package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasDisabledFluent<T> extends HasElement {

    // ----- disabled -----
    PropertyDescriptor<Boolean, Boolean> disabledProperty =
            PropertyDescriptors.propertyWithDefault("disabled", false);

    default T setDisabled(boolean disabled) {
        disabledProperty.set(this, disabled);
        return (T) this;
    }
    default boolean isDisabled() {
        return disabledProperty.get(this);
    }
    // -----------------

}
