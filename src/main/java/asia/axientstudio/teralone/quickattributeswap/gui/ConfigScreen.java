package asia.axientstudio.teralone.quickattributeswap.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class ConfigScreen extends Screen {

    public ConfigScreen(Screen parent) {
        super(Text.literal("Quick Attribute Swap"));
    }

    @Override
    protected void init() {
        int w = this.width;
        int h = this.height;

        addDrawableChild(ButtonWidget.builder(Text.literal("Done"), button -> this.client.setScreen(null))
                .dimensions(w / 2 - 40, h / 2, 80, 20)
                .build());
    }
}