package asia.axientstudio.teralone.quickattributeswap.integration;

import asia.axientstudio.teralone.quickattributeswap.gui.ConfigScreen;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import net.minecraft.client.gui.screen.Screen;

public class ModMenuEntry implements ModMenuApi {

    @Override
    public ConfigScreenFactory<Screen> getModConfigScreenFactory() {
        return parent -> new ConfigScreen(parent);
    }
}