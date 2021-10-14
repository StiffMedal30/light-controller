package za.co.dotze.lightcontroller.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import za.co.dotze.lightcontroller.exception.ConnectionFailedException;
import za.co.dotze.lightcontroller.service.LightService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class SimpleLightService implements LightService {

    private static final Logger log = LoggerFactory.getLogger(SimpleLightService.class);

    @Override
    public void doSwitch(String urlString) {
        URL url = null;
        HttpURLConnection con = null;
        try {
            url = new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json");
            con.getInputStream();
        } catch (IOException e) {
            log.error(String.format("An error occurred: %s", e));
            throw new ConnectionFailedException("An error occurred", e);
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
    }
}
