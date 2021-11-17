package tn.esprit.spring.services;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.repository.TimesheetRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetServiceImplTest {
	@Autowired
	TimesheetRepository timeRepo;
	
	@Autowired
	TimesheetServiceImpl timerServ;
	
	@Autowired
	MissionRepository missionRepo;
	
	@Autowired
	DepartementRepository depReo;
	@Autowired
	EmployeRepository emprepo;
	
	@Test
	public void ajouterMissionTest(){
		 Mission m = new Mission("mission name", "desc mission");
		 int t = timerServ.ajouterMission(m);
		 assertEquals(m.getId(), t);
	
	}
	

	
	
	
	@Test
	public void findAllMissionByEmployeJPQLtest(){
		
		Timesheet timesheet  = new Timesheet();
		Employe emp = new Employe();
		timesheet.setEmploye(emp);
		timerServ.findAllMissionByEmployeJPQL(timesheet.getEmploye().getId());
		assertEquals(emp.getId(),timesheet.getEmploye().getId());	
		
	}
	
	@Test
	public void getAllEmployeByMission(){
		
		Timesheet timesheet  = new Timesheet();
		Mission mission = new Mission();
		timesheet.setMission(mission);
		timerServ.getAllEmployeByMission(timesheet.getMission().getId());
		assertEquals(mission.getId(),timesheet.getMission().getId());
		
		
	}
//	@Test
//	public void affecterMissionADepartementTest(){
//		List<Mission> missions  = new ArrayList<>();
//		Mission mission = new Mission();
//		missions.add(mission);
//		Departement dep = new Departement(1, "info",missions);
//		timerServ.affecterMissionADepartement(mission.getId(), dep.getId());
//		assertEquals(missions, dep.getMissions());
//	}


}
