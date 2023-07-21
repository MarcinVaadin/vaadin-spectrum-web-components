package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.shared.SlotUtils;
import org.vaadin.spectrum.SpIcon;

public interface HasHeaderSlot<T> extends HasElement {

    default T setHeader(Component header) {
        SlotUtils.setSlot(this, "header", header);
        return (T) this;
    }

}
