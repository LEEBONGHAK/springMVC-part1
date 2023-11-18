package hello.springmvc.basic.response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {

        ModelAndView mv = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mv;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {

        model.addAttribute("data", "hello!");

        return "response/hello";
    }

    /**
     * 권장 되지 않는 방법 (명시성이 떨어짐)
     */
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {

        model.addAttribute("data", "hello!");
    }
}
