package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import org.vaadin.spectrum.utils.SlotUtils;

public interface HasIconSlot<T> extends HasElement {

    default T setIcon(Component icon) {
        SlotUtils.setSlot(this, "icon", icon);
        return (T) this;
    }

}
