package za.co.dotze.lightcontroller.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import za.co.dotze.lightcontroller.service.LightService;

@RestController()
public class LightController {
    private static final Logger LOG = LoggerFactory.getLogger(LightController.class);
    final ModelAndView view = new ModelAndView();
    @Autowired
    private LightService lightService;

    @GetMapping(value = "/off")
    public ModelAndView switchOff() {
        lightService.turnOff();
        return getStatus();
    }


    @GetMapping(value = "/on")
    public ModelAndView switchOn() {
        lightService.turnOn();
        return getStatus();
    }

    private ModelAndView getStatus() {
        final String message = "The light is " + lightService.getStatus();
        view.addObject("light", message);
        view.setViewName("index");
        LOG.debug("Light has been switched {}", message);
        return view;
    }

}
