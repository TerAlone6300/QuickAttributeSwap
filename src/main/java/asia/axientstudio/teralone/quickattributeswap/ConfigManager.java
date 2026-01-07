package asia.axientstudio.teralone.quickattributeswap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ConfigManager {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File FILE = new File("config/quickattributeswap.json");

    public static Config load() {
        try {
            if (!FILE.exists()) {
                FILE.getParentFile().mkdirs();
                Config cfg = new Config();
                save(cfg);
                return cfg;
            }
            return GSON.fromJson(new FileReader(FILE), Config.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new Config();
        }
    }

    public static void save(Config cfg) {
        try (FileWriter writer = new FileWriter(FILE)) {
            GSON.toJson(cfg, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}