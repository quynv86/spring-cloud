package vn.quynv.spring.zipkinclient.inf.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin-sample")
public class SampleApi {
    private static final Logger LOG = LoggerFactory.getLogger(SampleApi.class);

    @GetMapping(value="")
    public String sayHello(){
        LOG.debug("say hello method");
        return "Hello zipkin - sample";
    }
}
