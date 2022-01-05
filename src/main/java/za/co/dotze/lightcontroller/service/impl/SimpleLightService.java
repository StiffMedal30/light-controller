package za.co.dotze.lightcontroller.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.co.dotze.lightcontroller.service.LightService;

import java.util.Map;

@Service
public class SimpleLightService implements LightService {
    @Value("${url.light.off}")
    private String urlOff;
    @Value("${url.light.on}")
    private String urlOn;
    @Value("${url.light.status}")
    private String urlStatus;

    final RestTemplate template = new RestTemplate();
    @Override
    public String getStatus() {
        final String forObject = template.getForObject(urlStatus, String.class);
        return forObject;
    }

    @Override
    public void turnOff() {
        template.getForObject(urlOff, String.class);
    }

    @Override
    public void turnOn() {
        template.getForObject(urlOn, String.class);
    }
}
