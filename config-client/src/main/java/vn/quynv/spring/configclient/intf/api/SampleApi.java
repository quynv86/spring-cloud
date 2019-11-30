package vn.quynv.spring.configclient.intf.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleApi {

    @Value("${sampleApi.message}")
    private String message;

    @GetMapping("/")
    @ResponseBody
    public String getRequest(){
        return message;
    }
}
