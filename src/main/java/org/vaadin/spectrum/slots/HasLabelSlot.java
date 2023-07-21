package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.shared.SlotUtils;
import org.vaadin.spectrum.SpIcon;

public interface HasLabelSlot<T> extends HasElement {

    default T setLabel(SpIcon icon) {
        SlotUtils.setSlot(this, "label", icon);
        return (T) this;
    }

}
