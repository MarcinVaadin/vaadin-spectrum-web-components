package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import org.vaadin.spectrum.utils.SlotUtils;

public interface HasHeaderSlot<T> extends HasElement {

    default T setHeader(Component header) {
        SlotUtils.setSlot(this, "header", header);
        return (T) this;
    }

}
