package hello.helpers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import hello.beans.Vehicle;
import hello.beans.VehicleDetail;

public class VehicleDetailBuilder 
{
	
	public Vehicle buildVehicles(int count)
	{
		List<VehicleDetail> completeList = buildDetailsList();
		
		Vehicle myVehicle = new Vehicle(count, "car", completeList);
		
		System.out.println("Original list count after construction: \n");
    	System.out.format("Original list size is %d\n", completeList.size());
    	
		VehicleDetail detail = new VehicleDetail();
		detail.setModel("Nissan");
		detail.setPrice(new BigDecimal(17000.00).setScale(2, RoundingMode.CEILING));
		detail.setYear(2017);
		completeList.add(detail);		
		
		System.out.println("Original list count after addition: \n");
    	System.out.format("Original list size is %d\n", completeList.size());
    	
    	System.out.println("Vehicle detail list count after addition: \n");
    	System.out.format("Vehicle detail size is %d\n", myVehicle.getVehicleDetail().size());
    	
		return myVehicle;
	}

	private List<VehicleDetail> buildDetailsList() 
	{
		List<VehicleDetail> vehicleList = new ArrayList<>();
		VehicleDetail detail = new VehicleDetail();
		detail.setModel("Nissan");
		detail.setPrice(new BigDecimal(17000.00).setScale(2, RoundingMode.CEILING));
		detail.setYear(2017);
		vehicleList.add(detail);
		
		detail = new VehicleDetail();
		detail.setModel("Toyota");
		detail.setPrice(new BigDecimal(16056.789).setScale(2, RoundingMode.CEILING));
		detail.setYear(2016);
		vehicleList.add(detail);
		
		detail = new VehicleDetail();
		detail.setModel("Ford");
		detail.setPrice(new BigDecimal(15033.123).setScale(2, RoundingMode.CEILING));
		detail.setYear(2015);
		vehicleList.add(detail);
		
		return vehicleList;
	}
}
