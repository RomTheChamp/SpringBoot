package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RTestController 
{
	private static final String template = "Hello friend, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public Greeting getGreeting(@RequestParam(value="name", defaultValue="World") String name)
    {
		return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    	
    }
}
