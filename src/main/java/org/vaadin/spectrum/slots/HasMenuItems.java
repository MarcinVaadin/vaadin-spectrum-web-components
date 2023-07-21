package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.HasElement;
import org.vaadin.spectrum.SpMenuItem;

import java.util.stream.Stream;

public interface HasMenuItems<T> extends HasElement {

    default T addMenuItem(SpMenuItem item) {
        getElement().appendChild(item.getElement());
        return (T) this;
    }

    default Stream<SpMenuItem> getMenuItems() {
        return getElement().getChildren().map(SpMenuItem.class::cast);
    }

    default T removeMenuItem(SpMenuItem item) {
        getElement().removeChild(item.getElement());
        return (T) this;
    }

}
