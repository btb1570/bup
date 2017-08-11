package ben.bell.bup


import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class BupController {
	
	@RequestMapping(method=RequestMethod.GET)
	String sayHello() {
		return "Hello"
}
	
}