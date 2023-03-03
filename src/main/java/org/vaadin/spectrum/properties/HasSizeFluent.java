package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasSizeFluent<T> extends HasElement {

    enum Size {XXS, XS, S, M, L, XL, XXL, XXXL};

    // ----- size -----
    PropertyDescriptor<String, String> sizeProperty =
            PropertyDescriptors.propertyWithDefault("size", "");

    default T setSize(String size) {
        sizeProperty.set(this, size);
        return (T) this;
    }
    default String getSize() {
        return sizeProperty.get(this);
    }
    // -----------------


    default T setSize(Size size) {
        assert size != null;
        this.setSize(size.name().toLowerCase());
        return (T) this;
    }

}
