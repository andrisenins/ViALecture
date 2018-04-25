package lv.va.sludinajumuportals.resource;

import lv.va.sludinajumuportals.domain.Response;
import lv.va.sludinajumuportals.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping(value = "/")
    @ResponseBody
    public String testEndpoint() {
        return "Hello!";
    }

    @GetMapping(value = "/hey")
    @ResponseBody
    public Response nextTestEndpoint() {
        return new Response("Hey Ya");
    }

    @RequestMapping("/main")
    public String getUI(Map<String, Object> model) {
        model.put("message", "Hello User!");
        model.put("advertisement", advertisementService.getAdvertisement());
        return "main";
    }

}