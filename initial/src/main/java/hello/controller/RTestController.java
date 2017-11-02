package hello.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.beans.Greeting;
import hello.beans.InputHolder;
import hello.beans.Vehicle;
import hello.beans.VehicleDetail;
import hello.helpers.BinarySearch;
import hello.helpers.NumbersGame;
import hello.helpers.VehicleDetailBuilder;


@RestController
public class RTestController 
{
	@Autowired
	private BinarySearch binarySearch;
	
	@Autowired
	private NumbersGame game;
	
	@Autowired
	private InputHolder holder;
	
	@Autowired
	private VehicleDetailBuilder builder;
	
	private static final String template = "Hello friend, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public Greeting getGreeting(@RequestParam(value="name", defaultValue="World") String name,
    		                    @RequestParam(value="number", defaultValue="3") int number)
{
    	int [] numbers = {2,7,23,27,32,33,37,55};
    	
    	Greeting gr = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    	
    	gr.setResultOfSort(binarySearch.sort(numbers, number));
    	gr.setPrimeNumber(game.isPrime( Integer.parseInt(holder.getInputText())));
    	
		return gr;
    	
    }
    
    @RequestMapping(value = "/advGreetings", method = RequestMethod.GET)
    public Greeting advancedGreeting(@RequestParam(value="name", defaultValue="World") String name,
    		                    @RequestParam(value="number", defaultValue="3") int number)
{
    	int [] numbers = {3,4,34,57,88,99,101,101,101,134,567,890};
    	
    	Greeting gr = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    	
    	gr.setResultOfSort(binarySearch.anotherSort(numbers, number, 0, numbers.length - 1));
    	
		return gr;
    	
    }
    
    @RequestMapping(value="/testIm/obj/{count}", method = RequestMethod.GET)
    public List<VehicleDetail> testImmutability (@PathVariable(value="count") Integer count)
    {
    	Vehicle vehicle = builder.buildVehicles(count);
    	
    	System.out.println("Vehicle contents before changes");
    	System.out.format("Vehicle count is: %d Vehicle type is: %s\n", vehicle.getVehicleCount(), vehicle.getVehicleType());
    	
    	System.out.println("Original list values are: \n");
    	
    	List<VehicleDetail> originalList = vehicle.getVehicleDetail();
    	System.out.format("Original list size is %d \n", originalList.size());
    	
    	VehicleDetail detail = new VehicleDetail();
    	detail.setModel("Pontiak");
    	detail.setPrice(new BigDecimal("15000.00").setScale(2, RoundingMode.CEILING));
    	detail.setYear(2014);
    	originalList.add(new VehicleDetail());
    	
    	System.out.println("Original list count after addition: \n");
    	System.out.format("Original list size is %d\n", originalList.size());
    	
    	System.out.println("Vehicle object list after addition: \n");
    	System.out.format("Vehicle list size is %d", vehicle.getVehicleDetail().size());
    	
    	VehicleDetail det = vehicle.getVehicleDetail().get(0);
    	return vehicle.getVehicleDetail();
    }
}
