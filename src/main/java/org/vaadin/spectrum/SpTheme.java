package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;

@Tag("sp-theme")
@NpmPackage(value = "@spectrum-web-components/theme", version = "0.14.11")
@JsModule("@spectrum-web-components/theme/sp-theme.js")
@JavaScript("@spectrum-web-components/theme/src/themes.js")
public class SpTheme extends Component implements HasComponents, HasSize, HasDirFluent<SpTheme> {

    public enum Color {LIGHTEST, LIGHT, DARK, DARKEST};

    public enum Scale {MEDIUM, LARGE};

    public enum Theme {SPECTRUM, EXPRESS};

    // ----- color -----
    private static final PropertyDescriptor<String, String> colorProperty =
            PropertyDescriptors.attributeWithDefault("color", "");
    public String getColor() {
        return get(colorProperty);
    }
    // -----------------
    
    // ----- scale -----
    private static final PropertyDescriptor<String, String> scaleProperty =
            PropertyDescriptors.attributeWithDefault("scale", "");
    public String getScale() {
        return get(scaleProperty);
    }
    // -----------------
    
    // ----- theme -----
    private static final PropertyDescriptor<String, String> themeProperty =
            PropertyDescriptors.attributeWithDefault("theme", "spectrum");
    public String getTheme() {
        return get(themeProperty);
    }
    // -----------------

    public SpTheme() {
        this(Color.LIGHT, Scale.MEDIUM, Theme.SPECTRUM);
    }

    public SpTheme(Color color, Scale scale, Theme theme) {
        assert color != null && scale != null && theme != null;
        colorProperty.set(this, color.name().toLowerCase());
        scaleProperty.set(this, scale.name().toLowerCase());
        themeProperty.set(this, theme.name().toLowerCase());
    }
    
}
