package org.vaadin.spectrum.builders;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;
import org.vaadin.spectrum.SpConstants;
import org.vaadin.spectrum.properties.HasSizeFluent;

public class HeaderBuilder {

    private static final String TAG = SpConstants.HEADER;

    private HasSizeFluent.Size size;

    private boolean serif;

    private String text;

    private Component[] components;

    public HeaderBuilder serif() {
        this.serif = true;
        return this;
    }

    public HeaderBuilder size(HasSizeFluent.Size size) {
        this.size = size;
        return this;
    }

    public HeaderBuilder text(String text) {
        this.text = text;
        return this;
    }

    public HeaderBuilder components(Component... components) {
        this.components = components;
        return this;
    }

    public Component asH1() {
        return applyStyles(new HtmlContainer("h1"), HasSizeFluent.Size.XXL);
    }

    public Component asH2() { return applyStyles(new HtmlContainer("h2"), HasSizeFluent.Size.XL); }

    public Component asH3() {
        return applyStyles(new HtmlContainer("h3"), HasSizeFluent.Size.L);
    }

    public Component asH4() {
        return applyStyles(new HtmlContainer("h4"), HasSizeFluent.Size.M);
    }

    public Component asH5() {
        return applyStyles(new HtmlContainer("h5"), HasSizeFluent.Size.S);
    }

    public Component asH6() {
        return applyStyles(new HtmlContainer("h6"), HasSizeFluent.Size.XS);
    }

    private <T extends HtmlContainer> T applyStyles(T el, HasSizeFluent.Size defaultSize) {
        el.getClassNames().add(TAG);
        el.getClassNames().add(TAG + "--size" + (size != null ? size : defaultSize));
        if (serif) {
            el.getClassNames().add(TAG + "--serif");
        }
        if (text != null) {
            el.setText(text);
        }
        if (components != null) {
            el.add(components);
        }
        return el;
    }

}