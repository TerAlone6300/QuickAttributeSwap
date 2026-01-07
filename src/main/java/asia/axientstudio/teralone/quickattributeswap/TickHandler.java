package asia.axientstudio.teralone.quickattributeswap;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class TickHandler {

    private static final MinecraftClient client = MinecraftClient.getInstance();
    private static final int SWAP_KEY = 82; // GLFW_KEY_R

    public static void tick() {
        if (client.player == null || client.currentScreen != null) return;

        if (isKeyPressed(SWAP_KEY)) {
            performSwap();
        }
    }

    private static boolean isKeyPressed(int key) {
        long window = client.getWindow().getHandle();
        return org.lwjgl.glfw.GLFW.glfwGetKey(window, key) == org.lwjgl.glfw.GLFW.GLFW_PRESS;
    }

    public static void performSwap() {
        if (client.player == null) return;

        int slot1 = 0; // ví dụ ô đầu
        int slot2 = 1; // ô thứ hai

        ItemStack stack1 = client.player.getInventory().getStack(slot1);
        ItemStack stack2 = client.player.getInventory().getStack(slot2);

        client.player.getInventory().setStack(slot1, stack2);
        client.player.getInventory().setStack(slot2, stack1);

        // thông báo nhẹ, không spam chat
        client.inGameHud.setOverlayMessage(Text.literal("Attributes swapped!"), false);
    }
}