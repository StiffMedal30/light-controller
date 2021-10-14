package za.co.dotze.lightcontroller.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import za.co.dotze.lightcontroller.dto.LightResponseDto;
import za.co.dotze.lightcontroller.service.LightService;

@RestController
public class LightController {

    private static final Logger LOG = LoggerFactory.getLogger(LightController.class);

    private final LightService lightService;

    @Value("${url.light.on}")
    private String urlOn;
    @Value("${url.light.off}")
    private String urlOff;


    @Autowired
    public LightController(LightService lightService) {
        this.lightService = lightService;
    }

    @GetMapping("/light/on")
    public ModelAndView turnOn() {
        final ModelAndView model = new ModelAndView();

        lightService.doSwitch(urlOn);

        model.setViewName("index");
        model.addObject("light", "The light is now on");
        return model;
    }

    @GetMapping("/light/off")
    public ModelAndView turnOff() {
        final ModelAndView model = new ModelAndView();

        lightService.doSwitch(urlOff);

        model.setViewName("index");
        model.addObject("light", "The light is now off");
        return model;
    }
}
