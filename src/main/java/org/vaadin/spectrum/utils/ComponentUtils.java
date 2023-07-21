package org.vaadin.spectrum.utils;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Text;

public class ComponentUtils {

    public static HtmlContainer wrap(String tag, String text) {
        return new HtmlContainer(tag, new Text(text));
    }

    public static HtmlContainer divWrap(String text) {
        return wrap(Tag.DIV, text);
    }

}
