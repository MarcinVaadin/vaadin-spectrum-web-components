package org.vaadin.spectrum.utils;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.shared.Registration;

public interface CloseNotifier<T extends Component> {

    Registration addCloseEventListener(ComponentEventListener<SpCloseEvent<T>> listener);

    @DomEvent("close")
    class SpCloseEvent<T extends Component> extends ComponentEvent<T> {
        public SpCloseEvent(T source, boolean fromClient) {
            super(source, fromClient);
        }
    }

}
