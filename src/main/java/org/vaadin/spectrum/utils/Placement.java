package org.vaadin.spectrum.utils;

public enum Placement {
    AUTO, AUTO_START, AUTO_END, TOP, BOTTOM, RIGHT, LEFT, TOP_START, TOP_END, BOTTOM_START, BOTTOM_END, RIGHT_START, RIGHT_END, LEFT_START, LEFT_END, NONE;

    @Override
    public String toString() {
        return name().toLowerCase().replaceAll("_","-");
    }

}

