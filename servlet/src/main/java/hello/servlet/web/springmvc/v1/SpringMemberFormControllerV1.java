package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //컴포넌트 스캔을 통해 스프링 빈으로 등록
/*
//다른 방법
//아래 방식은 '@Controller' 와 같은 기능을 한다
@Component
@RequestMapping
 */
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/member/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
