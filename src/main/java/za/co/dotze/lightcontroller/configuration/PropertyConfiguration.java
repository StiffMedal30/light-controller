package za.co.dotze.lightcontroller.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "url")
public class PropertyConfiguration {

    private String url;

    public String getUrl() {
        return url;
    }

    public PropertyConfiguration setUrl(String url) {
        this.url = url;
        return this;
    }
}
