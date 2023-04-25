package Day1.three;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class three {
	@Value("${namevalue:hk}")
	public String name;
	@GetMapping("/hk3")
	@ResponseBody
	public String display()
	{
		return "thankyou"+name;
	}

}
