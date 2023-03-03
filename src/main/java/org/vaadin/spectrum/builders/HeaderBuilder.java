package org.vaadin.spectrum.builders;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.html.*;
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

    public H1 asH1() {
        return applyStyles(new H1(), HasSizeFluent.Size.XXL);
    }

    public H2 asH2() {
        return applyStyles(new H2(), HasSizeFluent.Size.XL);
    }

    public H3 asH3() {
        return applyStyles(new H3(), HasSizeFluent.Size.L);
    }

    public H4 asH4() {
        return applyStyles(new H4(), HasSizeFluent.Size.M);
    }

    public H5 asH5() {
        return applyStyles(new H5(), HasSizeFluent.Size.S);
    }

    public H6 asH6() {
        return applyStyles(new H6(), HasSizeFluent.Size.XS);
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