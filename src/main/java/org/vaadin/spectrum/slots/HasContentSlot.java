package org.vaadin.spectrum.slots;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.shared.SlotUtils;
import org.vaadin.spectrum.SpIcon;

public interface HasContentSlot<T> extends HasElement {

    default T setContent(Component content) {
        SlotUtils.setSlot(this, "content", content);
        return (T) this;
    }

}
