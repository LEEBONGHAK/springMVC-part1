package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller
 * - 반환 값이 String 이면 뷰 이름으로 인식
 * - 그래서 뷰를 찾고 뷰가 랜더링
 *
 * @RestController
 * - 반환 값으로 뷰를 찾는 것이 아니라, HTTP 메시지 바디에 바로 입력
 * - @ResponseBody 와 관련이 있음
 */
@RestController //Rest API Controller
@Slf4j //lombok 기능
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        System.out.println("name = " + name);
//        log.trace("trace log=" + name); //실제 연산이 발생 하기 때문에 필요 없는 리소스 사용됨 -> 사용X

        //아래로 갈수록 로그 레벨이 낮음
        //LEVEL: TRACE > DEBUG > INFO > WARN > ERROR
        log.trace("trace log={}", name);    //0
        log.debug("debug log={}", name);    //1
        log.info("info log={}", name);      //2
        log.warn("warn log={}", name);      //3
        log.error("error log={}", name);    //4

        return "ok";
    }
}
