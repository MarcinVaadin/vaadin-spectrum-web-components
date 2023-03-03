package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;

public interface HasTextFluent<T> extends HasElement {

    default T setText(String text) {
        getElement().setText(text);
        return (T) this;
    }

    default String getText() {
        return getElement().getText();
    }

}
