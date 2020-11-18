package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.essat.dao.IMagasinDao;
import tn.essat.dao.IProduitDao;
import tn.essat.model.Magasin;
@Controller
public class AppRest {
	@Autowired
 private IMagasinDao daom;
	@Autowired
 private IProduitDao daomp;
	
	public void setDaom(IMagasinDao daom) {
		this.daom = daom;
	}
	public void setDaomp(IProduitDao daomp) {
		this.daomp = daomp;
	}
	@GetMapping("/magasins")
	public List<Magasin>get(){
		return daom.findAll();	
				}
	@PostMapping("/addMagasin")
	public void get2(@RequestBody Magasin mag) {
		
	}

	
	
}
