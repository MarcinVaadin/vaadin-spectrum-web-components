package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasLabelFluent;

@Tag("sp-avatar")
@NpmPackage(value = "@spectrum-web-components/avatar", version = "0.11.0")
@JsModule("@spectrum-web-components/avatar/sp-avatar.js")
public class SpAvatar extends Component implements HasLabelFluent<SpAvatar>, HasStyle {

    // ----- size -----
    private static final PropertyDescriptor<Integer, Integer> sizeProperty =
            PropertyDescriptors.propertyWithDefault("size", -1);
    
    public SpAvatar setSize(Integer _size) {
        sizeProperty.set(this, _size);
        return this;
    }
    public Integer getSize() {
        return sizeProperty.get(this);
    }
    // -----------------
    
    // ----- src -----
    private static final PropertyDescriptor<String, String> srcProperty =
            PropertyDescriptors.propertyWithDefault("src", "");
    
    public SpAvatar setSrc(String _src) {
        srcProperty.set(this, _src);
        return this;
    }
    public String getSrc() {
        return srcProperty.get(this);
    }
    // -----------------

}
