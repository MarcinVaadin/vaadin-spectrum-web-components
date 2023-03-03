package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasLabelFluent<T> extends HasElement {

    // ----- label -----
    final PropertyDescriptor<String, String> labelProperty =
            PropertyDescriptors.propertyWithDefault("label", "");

    default T setLabel(String label) {
        labelProperty.set(this, label);
        return (T) this;
    }
    default String getLabel() {
        return labelProperty.get(this);
    }
    // -----------------

}
