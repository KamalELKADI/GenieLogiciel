package com.esisa.projet.sport.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.esisa.projet.sport.business.ClubService;
import com.esisa.projet.sport.business.ClubServiceDefault;
import com.esisa.projet.sport.dao.MaterialDao;
import com.esisa.projet.sport.dao.MaterialDaoJdbc;
import com.esisa.projet.sport.dao.MembreDao;
import com.esisa.projet.sport.dao.MembreDaoJdbc;
import com.esisa.projet.sport.dao.MoniteurDao;
import com.esisa.projet.sport.dao.MoniteurDaoJdbc;
import com.esisa.projet.sport.dao.TypeAbonnementDao;
import com.esisa.projet.sport.dao.TypeAbonnementDaoJdbc;
import com.esisa.projet.sport.jdbc.DataSource;
import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.jdbc.MySQLDataSource;
import com.esisa.projet.sport.web.actions.MaterialAction;
import com.esisa.projet.sport.web.actions.MembreAction;
import com.esisa.projet.sport.web.actions.MoniteurAction;
import com.esisa.projet.sport.web.actions.TypeAbonnementAction;

@WebServlet({ "/ClubController", "/dbclub/*" })

public class ClubController extends HttpServlet {

	private MaterialAction materialAction;
	private TypeAbonnementAction typeAbonnementAction;
	private MembreAction membreAction;
	private MoniteurAction moniteurAction;

	
	public void init(ServletConfig config) throws ServletException {
		 
		
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
			
		 

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		String view = "/view/Error.jsp";
		if(uri.endsWith("/ajouterMaterial")) {
			System.out.println("tetgrgvbfdbfe");
			view = materialAction.addMaterial(request);
		}	
		else if(uri.endsWith("/listerMateriel")) {
			System.out.println("hELLO;");
			//view=materialAction.listMateriel(request);
		}
		else if(uri.endsWith("/AjouterMoniteur")) {
			System.out.println("hELLO;");
			view=moniteurAction.addMoniteur(request);
		}
		else if(uri.endsWith("/ListerMoniteur")) {
			view = moniteurAction.listerMoniteur(request);
			System.out.println(view);
		}
					
		request.getRequestDispatcher(view).forward(request, response);	
			
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
