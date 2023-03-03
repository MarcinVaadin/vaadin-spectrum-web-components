package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;

public interface HasDirFluent<T> extends HasElement {

    // ----- dir -----
    PropertyDescriptor<String, String> dirProperty =
            PropertyDescriptors.propertyWithDefault("dir", "ltr");

    default T setDir(String dir) {
        dirProperty.set(this, dir);
        return (T) this;
    }
    default String getDir() {
        return dirProperty.get(this);
    }
    // -----------------

}
