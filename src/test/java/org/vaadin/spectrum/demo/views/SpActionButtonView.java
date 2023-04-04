package org.vaadin.spectrum.demo.views;

import com.vaadin.flow.router.Route;
import org.vaadin.spectrum.SpActionButton;
import org.vaadin.spectrum.SpIcon;
import org.vaadin.spectrum.demo.DemoLayout;
import org.vaadin.spectrum.demo.DemoView;

//@Route(value = "sp-action-button", layout = DemoLayout.class)
public class SpActionButtonView extends DemoView {

    public SpActionButtonView() {
        super(SpActionButton.class);

        sectionDivider("Sizes");

        SpActionButton button1 = new SpActionButton().setText("Edit");
        SpActionButton button2 = new SpActionButton().setText("Edit")
                .setIcon(new SpIcon().setName("ui:edit"));
        SpActionButton button3 = new SpActionButton()
                .setIcon(new SpIcon().setName("ui:edit"));
//        SpActionButton button4 = new SpActionButton()
//                .setIcon(new SpIcon().setName("ui:edit"))
//                .setHoldAffordance(true);
        add(wrapHorizontal(button1, button2, button3));
    }

}