package za.co.dotze.lightcontroller.service;

import za.co.dotze.lightcontroller.dto.LightResponseDto;

public interface LightService {
    void doSwitch(String urlString);
}
