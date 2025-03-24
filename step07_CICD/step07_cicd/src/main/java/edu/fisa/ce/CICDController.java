package edu.fisa.ce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRest() ******");
		return "요청 응답 성공";
	}
}
