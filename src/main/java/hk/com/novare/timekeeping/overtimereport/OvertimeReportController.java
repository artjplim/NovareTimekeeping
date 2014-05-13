package hk.com.novare.timekeeping.overtimereport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OvertimeReportController {

	@RequestMapping(value = "overtimereport")
	public String overtimereport() {
        return "overtimereport/overtimereport";
    }
}
