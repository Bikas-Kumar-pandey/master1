package com.psa.location.locationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.location.entites.Location;
import com.psa.location.entites.dto.LocationData;
import com.psa.location.jpaRepository.LocationRepository;

@Controller
public class LocationController {

	@RequestMapping("/showLocation")
	public String showLocation() {
		return"showLocation";
	}
	
	@Autowired
	private LocationRepository locationRepo;
	
	
	
	@RequestMapping("/saveLocation")
	public String SaveLocation(LocationData data,ModelMap modelmap) {
		System.out.println(data.getId());
		System.out.println(data.getCode());
		System.out.println(data.getName());
		System.out.println(data.getType());
		
		Location location = new Location();
		location.setId(data.getId());
		location.setCode(data.getCode());
		location.setName(data.getName());
		location.setType(data.getType());
		
		locationRepo.save(location);
		modelmap.addAttribute("msg", "Location Record is Saved!!");
		return"showLocation";
		
	}}
		

