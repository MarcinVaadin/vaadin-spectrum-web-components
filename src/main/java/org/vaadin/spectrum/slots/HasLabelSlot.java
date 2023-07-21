package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.HasElement;
import org.vaadin.spectrum.SpIcon;
import org.vaadin.spectrum.utils.SlotUtils;

public interface HasLabelSlot<T> extends HasElement {

    default T setLabel(SpIcon icon) {
        SlotUtils.setSlot(this, "label", icon);
        return (T) this;
    }

}
