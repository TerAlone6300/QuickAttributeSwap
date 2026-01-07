package asia.axientstudio.teralone.quickattributeswap;

public class QuickAttributeSwapClient {

    public static void init() {
        // Không cần Fabric API, key check trong TickHandler
    }

    public static void tick() {
        TickHandler.tick();
    }
}