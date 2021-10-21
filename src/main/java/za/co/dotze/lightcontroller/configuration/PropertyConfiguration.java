package za.co.dotze.lightcontroller.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "url")
public class PropertyConfiguration {

    private String base;
    private String light;
    private String on;
    private String off;

    public PropertyConfiguration setOn(String on) {
        this.on = on;
        return this;
    }

    public PropertyConfiguration setOff(String off) {
        this.off = off;
        return this;
    }

    public String getLight() {
        return light;
    }

    public PropertyConfiguration setLight(String light) {
        this.light = light;
        return this;
    }

    public String getBase() {
        return base;
    }

    public PropertyConfiguration setBase(String base) {
        this.base = base;
        return this;
    }
}
