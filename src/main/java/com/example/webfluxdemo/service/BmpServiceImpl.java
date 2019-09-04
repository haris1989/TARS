package com.example.webfluxdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webfluxdemo.entity.Contract;
import com.example.webfluxdemo.schemas.inspection.CustomerInfoBO;
import com.example.webfluxdemo.schemas.inspection.InspectionRequest;
import com.example.webfluxdemo.schemas.inspection.StartProcess;
import com.example.webfluxdemo.schemas.inspection.StartProcessResponse;
import com.example.webfluxdemo.schemas.inspection.VehicleInfoBO;
import com.example.webfluxdemo.schemas.inspection.ViolationInfoBO;

@Service
public class BmpServiceImpl implements BpmService {
	

	@Autowired
	InspectionBpmService service;
	@Override
	public StartProcessResponse executeBpm(Contract contract) {
		StartProcessResponse InspectionResponse = null;
		try {

			StartProcess request = new StartProcess();
			InspectionRequest inspectionrequest = new InspectionRequest();
			CustomerInfoBO customer = new CustomerInfoBO();
			customer.setName(contract.getCustomerName());
			customer.setNationality("Pakistani");
			customer.setPassportID((!contract.getCustomerIDType().equals("Emirates Id")?contract.getCustomerIDNumber().toString():""));
			customer.setNationalID("423012456789");
			customer.setEmiratesID((contract.getCustomerIDType().equals("Emirates Id")?contract.getCustomerIDNumber().toString():""));
			customer.setContactNumber("090078601");
			customer.setAddress("613, The Exchange Tower");
			inspectionrequest.setCustomerInfo(customer);

			VehicleInfoBO vehicle = new VehicleInfoBO();
			vehicle.setBrand("Audi");
			vehicle.setModel("R8");
			vehicle.setColor("Black");
			vehicle.setPlateNum("AVS-556");
			vehicle.setVehicleLicenseNum("HHJJ2456");
			vehicle.setVehicleDateOfManufacture("2010-01-01 12:00:00");
			vehicle.setVehicleInsuranceCompanyName("A1 Insurance Company LLC");
			vehicle.setVehicleInsuranceStart("2019-08-26 12:00:00");
			vehicle.setVehicleInsuranceEnd("2019-08-26 12:00:00");
			vehicle.setVehicleInsuranceType("All");
			inspectionrequest.setVehicleInfo(vehicle);

			ViolationInfoBO violation = new ViolationInfoBO();
			violation.setViolationType(contract.getViolationType());
			violation.setViolationCode(contract.getViolationCode());
			violation.setIncidentZone("Sheikh Zayed");
			violation.setIncidentAddressCoordinates("100,559");
			violation.setViolationDetails("Over Speeding near Business Bay");
			inspectionrequest.setViolationInfo(violation);
			request.setInspectionRequest(inspectionrequest);
			InspectionResponse = service.verifyBuisnessProcess(request);
			
		}

		catch (Exception e) {

			e.printStackTrace();

		}
		return InspectionResponse;
	}

}
