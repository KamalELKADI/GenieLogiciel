package com.esisa.projet.sport.dao;

import com.esisa.projet.sport.business.ClubService;
import com.esisa.projet.sport.business.ClubServiceDefault;
import com.esisa.projet.sport.jdbc.DataSource;
import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.jdbc.MySQLDataSource;
import com.esisa.projet.sport.web.actions.MaterialAction;
import com.esisa.projet.sport.web.actions.MembreAction;
import com.esisa.projet.sport.web.actions.MoniteurAction;
import com.esisa.projet.sport.web.actions.TypeAbonnementAction;

public class Test 
{
	private MaterialAction materialAction;
	private TypeAbonnementAction typeAbonnementAction;
	private  MembreAction membreAction;
	private  MoniteurAction moniteurAction;
	public Test() {
		exp01();
	}
	public void exp01()
	{
		DataSource ds =  new MySQLDataSource("dbclub");
		Database db = new Database(ds);
		MaterialDao materieldao = new MaterialDaoJdbc(db);
		TypeAbonnementDao typeAbonnementdao = new TypeAbonnementDaoJdbc(db);
		MembreDao membredao = new MembreDaoJdbc(db);
		MoniteurDao moniteurdao = new MoniteurDaoJdbc(db);
		ClubService service = new ClubServiceDefault(materieldao,typeAbonnementdao,membredao,moniteurdao);
		materialAction = new MaterialAction(service);
		typeAbonnementAction = new TypeAbonnementAction(service);
		membreAction = new MembreAction(service);
		moniteurAction = new MoniteurAction(service);
		System.out.println(service.moniteurs());
		System.out.println("hey");
	}
	public static void main(String[] args)
	{
		new Test();
	}
}
