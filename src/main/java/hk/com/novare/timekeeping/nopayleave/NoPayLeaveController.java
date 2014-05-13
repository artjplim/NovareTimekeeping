package hk.com.novare.timekeeping.nopayleave;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoPayLeaveController {

	@RequestMapping(value = "nopayleave")
	public String nopayleave() {
        return "nopayleave/nopayleave";
    }
}
