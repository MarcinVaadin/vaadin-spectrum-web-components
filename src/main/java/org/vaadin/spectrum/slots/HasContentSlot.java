package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import org.vaadin.spectrum.utils.SlotUtils;

public interface HasContentSlot<T> extends HasElement {

    default T setContent(Component content) {
        SlotUtils.setSlot(this, "content", content);
        return (T) this;
    }

}
