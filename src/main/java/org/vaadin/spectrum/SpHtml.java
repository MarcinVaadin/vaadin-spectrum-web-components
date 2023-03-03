package org.vaadin.spectrum;

import org.vaadin.spectrum.builders.HeaderBuilder;
import org.vaadin.spectrum.builders.ParagraphBuilder;

public class SpHtml {

    public static HeaderBuilder header() {
        return new HeaderBuilder();
    }

    public static ParagraphBuilder paragraph() {return new ParagraphBuilder();}

}
