package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-meter")
@NpmPackage(value = "@spectrum-web-components/meter", version = "0.8.0")
@JsModule("@spectrum-web-components/meter/sp-meter.js")
public class SpMeter extends Component implements HasDirFluent<SpMeter>, HasLabelFluent<SpMeter>, HasSizeFluent<SpMeter>, HasTextFluent<SpMeter> {

    // ----- negative -----
    private static final PropertyDescriptor<Boolean, Boolean> negativeProperty =
            PropertyDescriptors.propertyWithDefault("negative", false);

    public SpMeter setNegative(boolean negative) {
        negativeProperty.set(this, negative);
        return this;
    }
    public boolean isNegative() {
        return negativeProperty.get(this);
    }
    // -----------------

    // ----- notice -----
    private static final PropertyDescriptor<Boolean, Boolean> noticeProperty =
            PropertyDescriptors.propertyWithDefault("notice", false);

    public SpMeter setNotice(boolean notice) {
        noticeProperty.set(this, notice);
        return this;
    }
    public boolean isNotice() {
        return noticeProperty.get(this);
    }
    // -----------------

    // ----- overBackground -----
    private static final PropertyDescriptor<Boolean, Boolean> overBackgroundProperty =
            PropertyDescriptors.propertyWithDefault("overBackground", false);

    public SpMeter setOverBackground(boolean overBackground) {
        overBackgroundProperty.set(this, overBackground);
        return this;
    }
    public boolean isOverBackground() {
        return overBackgroundProperty.get(this);
    }
    // -----------------

    // ----- positive -----
    private static final PropertyDescriptor<Boolean, Boolean> positiveProperty =
            PropertyDescriptors.propertyWithDefault("positive", false);

    public SpMeter setPositive(boolean positive) {
        positiveProperty.set(this, positive);
        return this;
    }
    public boolean isPositive() {
        return positiveProperty.get(this);
    }
    // -----------------

    // ----- progress -----
    private static final PropertyDescriptor<Integer, Integer> progressProperty =
            PropertyDescriptors.propertyWithDefault("progress", 0);

    public SpMeter setProgress(Integer progress) {
        progressProperty.set(this, progress);
        return this;
    }
    public Integer getProgress() {
        return progressProperty.get(this);
    }
    // -----------------

    // ----- sideLabel -----
    private static final PropertyDescriptor<Boolean, Boolean> sideLabelProperty =
            PropertyDescriptors.propertyWithDefault("sideLabel", false);

    public SpMeter setSideLabel(boolean sideLabel) {
        sideLabelProperty.set(this, sideLabel);
        return this;
    }
    public boolean isSideLabel() {
        return sideLabelProperty.get(this);
    }
    // -----------------

    // ----- static -----
    private static final PropertyDescriptor<String, String> staticProperty =
            PropertyDescriptors.propertyWithDefault("static", "");

    public SpMeter setStatic(String _static) {
        staticProperty.set(this, _static);
        return this;
    }
    public String getStatic() {
        return staticProperty.get(this);
    }
    // -----------------

}