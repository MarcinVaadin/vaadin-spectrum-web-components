package org.vaadin.spectrum.builders;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Paragraph;
import org.vaadin.spectrum.SpConstants;
import org.vaadin.spectrum.properties.HasSizeFluent;

public class ParagraphBuilder {

    private static final String TAG = SpConstants.BODY;

    private HasSizeFluent.Size size;

    private String text;

    private Component[] components;

    public ParagraphBuilder size(HasSizeFluent.Size size) {
        this.size = size;
        return this;
    }

    public ParagraphBuilder text(String text) {
        this.text = text;
        return this;
    }

    public ParagraphBuilder components(Component... components) {
        this.components = components;
        return this;
    }

    public Paragraph build() {
        Paragraph el = new Paragraph();
        el.getClassNames().add(TAG);
        el.getClassNames().add(TAG + "--size" + (size != null ? size : HasSizeFluent.Size.M));
        if (text != null) {
            el.setText(text);
        }
        if (components != null) {
            el.add(components);
        }
        return el;
    }

}
