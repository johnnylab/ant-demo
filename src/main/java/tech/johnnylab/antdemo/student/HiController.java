
package tech.johnnylab.antdemo.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @RequestMapping(value = "/hi")
    public String hello() {
        return "HiController " +
                "D:\\Project\\idea-starter\\ant-demo\\src\\main\\java\\tech\\johnnylab\\antdemo\\student\\HiController.java " +
                "hello,Spring Boot";
    }
}