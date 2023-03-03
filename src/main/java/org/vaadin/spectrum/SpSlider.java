package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;

/**
 * <a href="https://opensource.adobe.com/spectrum-web-components/components/slider/">sp-slider</a>
 */
@Tag("sp-slider")
@NpmPackage(value = "@spectrum-web-components/slider", version = "0.15.7")
@JsModule("@spectrum-web-components/slider/sp-slider.js")
public class SpSlider extends AbstractSinglePropertyField<SpSlider, Integer> implements HasSize,
        HasLabelFluent<SpSlider>, HasDisabledFluent<SpSlider> {

    public enum Variant {STANDARD, FILLED, TICK, RAMP;}

    public enum LabelVisibility {TEXT, VALUE, NONE;}

    // ----- dragging -----
    private static final PropertyDescriptor<Boolean, Boolean> draggingProperty =
            PropertyDescriptors.propertyWithDefault("dragging", false);

    public SpSlider setDragging(boolean dragging) {
        draggingProperty.set(this, dragging);
        return this;
    }
    public boolean isDragging() {
        return draggingProperty.get(this);
    }
    // -----------------

    // ----- editable -----
    private static final PropertyDescriptor<Boolean, Boolean> editableProperty =
            PropertyDescriptors.propertyWithDefault("editable", false);

    public SpSlider setEditable(boolean editable) {
        editableProperty.set(this, editable);
        return this;
    }
    public boolean isEditable() {
        return editableProperty.get(this);
    }
    // -----------------

    // TODO: formatOptions

    // ----- hideStepper -----
    private static final PropertyDescriptor<Boolean, Boolean> hideStepperProperty =
            PropertyDescriptors.propertyWithDefault("hideStepper", false);

    public SpSlider setHideStepper(boolean hideStepper) {
        hideStepperProperty.set(this, hideStepper);
        return this;
    }
    public boolean isHideStepper() {
        return hideStepperProperty.get(this);
    }
    // -----------------

    // ----- highlight -----
    private static final PropertyDescriptor<Boolean, Boolean> highlightProperty =
            PropertyDescriptors.propertyWithDefault("highlight", false);

    public SpSlider setHighlight(boolean highlight) {
        highlightProperty.set(this, highlight);
        return this;
    }
    public boolean isHighlight() {
        return highlightProperty.get(this);
    }
    // -----------------

    // ----- indeterminate -----
    private static final PropertyDescriptor<Boolean, Boolean> indeterminateProperty =
            PropertyDescriptors.propertyWithDefault("indeterminate", false);

    public SpSlider setIndeterminate(boolean indeterminate) {
        indeterminateProperty.set(this, indeterminate);
        return this;
    }
    public boolean isIndeterminate() {
        return indeterminateProperty.get(this);
    }
    // -----------------

    // ----- labelVisibility -----
    private static final PropertyDescriptor<String, String> labelVisibilityProperty =
            PropertyDescriptors.propertyWithDefault("labelVisibility", "");

    public SpSlider setLabelVisibility(String labelVisibility) {
        labelVisibilityProperty.set(this, labelVisibility);
        return this;
    }
    public String getLabelVisibility() {
        return labelVisibilityProperty.get(this);
    }
    // -----------------

    // ----- max -----
    private static final PropertyDescriptor<Integer, Integer> maxProperty =
            PropertyDescriptors.propertyWithDefault("max", -1);

    public SpSlider setMax(Integer max) {
        maxProperty.set(this, max);
        return this;
    }
    public Integer getMax() {
        return maxProperty.get(this);
    }
    // -----------------

    // ----- min -----
    private static final PropertyDescriptor<Integer, Integer> minProperty =
            PropertyDescriptors.propertyWithDefault("min", -1);

    public SpSlider setMin(Integer min) {
        minProperty.set(this, min);
        return this;
    }
    public Integer getMin() {
        return minProperty.get(this);
    }
    // -----------------

    // ----- name -----
    private static final PropertyDescriptor<String, String> nameProperty =
            PropertyDescriptors.propertyWithDefault("name", "");

    public SpSlider setName(String name) {
        nameProperty.set(this, name);
        return this;
    }
    public String getName() {
        return nameProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpSlider setQuiet(boolean quiet) {
        quietProperty.set(this, quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    // ----- step -----
    private static final PropertyDescriptor<Integer, Integer> stepProperty =
            PropertyDescriptors.propertyWithDefault("step", 1);

    public SpSlider setStep(Integer step) {
        stepProperty.set(this, step);
        return this;
    }
    public Integer getStep() {
        return stepProperty.get(this);
    }
    // -----------------

    // ----- tickLabels -----
    private static final PropertyDescriptor<Boolean, Boolean> tickLabelsProperty =
            PropertyDescriptors.propertyWithDefault("tickLabels", false);

    public SpSlider setTickLabels(boolean tickLabels) {
        tickLabelsProperty.set(this, tickLabels);
        return this;
    }
    public boolean isTickLabels() {
        return tickLabelsProperty.get(this);
    }
    // -----------------

    // ----- tickStep -----
    private static final PropertyDescriptor<Integer, Integer> tickStepProperty =
            PropertyDescriptors.propertyWithDefault("tickStep", 0);

    public SpSlider setTickStep(Integer tickStep) {
        tickStepProperty.set(this, tickStep);
        return this;
    }
    public Integer getTickStep() {
        return tickStepProperty.get(this);
    }
    // -----------------

    // ----- type -----
    private static final PropertyDescriptor<String, String> typeProperty =
            PropertyDescriptors.propertyWithDefault("type", "");

    public SpSlider setType(String type) {
        typeProperty.set(this, type);
        return this;
    }
    public String getType() {
        return typeProperty.get(this);
    }
    // -----------------

    // ----- variant -----
    private static final PropertyDescriptor<String, String> variantProperty =
            PropertyDescriptors.propertyWithDefault("variant", "");

    public SpSlider setVariant(String variant) {
        variantProperty.set(this, variant);
        return this;
    }
    public String getVariant() {
        return variantProperty.get(this);
    }
    // -----------------

    public SpSlider() {
        super("value", 0, false);
    }

    @Synchronize("change")
    @Override
    public Integer getValue() {
        return super.getValue();
    }

    public SpSlider setVariant(Variant variant) {
        assert variant != null;
        this.setVariant(variant.name().toLowerCase());
        return this;
    }

    public SpSlider setLabelVisibility(LabelVisibility labelVisibility) {
        assert labelVisibility != null;
        this.setLabelVisibility(labelVisibility.name().toLowerCase());
        return this;
    }

}
