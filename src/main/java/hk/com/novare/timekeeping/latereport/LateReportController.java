package hk.com.novare.timekeeping.latereport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LateReportController {

	@RequestMapping(value = "latereport")
	public String latereport() {
        return "latereport/latereport";
    }
}
