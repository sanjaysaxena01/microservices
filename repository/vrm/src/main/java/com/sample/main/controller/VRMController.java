package com.sample.main.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.main.model.CPMR;
import com.sample.main.model.VRM;
import com.sample.main.repository.CPMRRepository;
import com.sample.main.repository.VRMRepository;

@RestController
@RequestMapping("/vrm")
public class VRMController {
	@Autowired
	private VRMRepository vrmRepo;

	@Autowired
	private CPMRRepository cpmrRepo;

	@RequestMapping(value = "/getCPMRData", method = RequestMethod.GET, produces = "application/JSON")
	@ResponseBody
	public HashMap<String, Object> getJobCardDetails(@RequestParam String UCIC) {
		CPMR cpmrobj = new CPMR();

		HashMap<String, Object> map = new HashMap<String, Object>();
		if (UCIC != null) {
			int ucic = Integer.parseInt(UCIC);
			cpmrobj = cpmrRepo.findById(ucic).orElse(cpmrobj);
		}
		map.put("DATA", cpmrobj);
		map.put("STATUS", "200");
		return map;
	}

	@RequestMapping(value = "/UJobCardStatus", method = RequestMethod.POST, produces = "application/JSON", consumes = "application/JSON")
	@ResponseBody
	public Map<String, Object> UJobCardStatus(@RequestBody VRM vrmObj) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		vrmRepo.save(vrmObj);
		map.put("Message", "Current Status Updated Successfully .....");
		map.put("STATUS", "200");
		return map;

	}

	@GetMapping("/welcome")
	public String getValueAnnotationValues() {
		return "Welcome to application";
	}

}
