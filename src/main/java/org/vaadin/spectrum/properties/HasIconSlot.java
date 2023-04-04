package org.vaadin.spectrum.properties;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.shared.SlotUtils;
import org.vaadin.spectrum.SpIcon;

public interface HasIconSlot<T> extends HasElement {

    default T setIcon(SpIcon icon) {
        SlotUtils.setSlot(this, "icon", icon);
        return (T) this;
    }

}
