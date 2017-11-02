package hello.beans;

import java.util.ArrayList;
import java.util.List;

public class Vehicle 
{
	private final Integer vehicleCount;
	private final String vehicleType;
	private final List<VehicleDetail> vehicleDetail;
	
	public Vehicle(Integer count, String type, List<VehicleDetail> list)
	{
		this.vehicleCount = count;
		this.vehicleType = type;
		this.vehicleDetail = new ArrayList<>(list);
	}

	/**
	 * @return the vehicleCount
	 */
	public Integer getVehicleCount() {
		return vehicleCount;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @return the vehicleDetail
	 */
	public List<VehicleDetail> getVehicleDetail() {
		return new ArrayList<>(vehicleDetail);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle [vehicleCount=");
		builder.append(vehicleCount);
		builder.append(", vehicleType=");
		builder.append(vehicleType);
		builder.append(", vehicleDetail=");
		builder.append(vehicleDetail);
		builder.append("]");
		return builder.toString();
	}
}
