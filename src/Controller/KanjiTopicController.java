package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.KanjiTopic;
import Model.DBConnection;
import Model.DAO.KanjiTopicDAOIml;



/**
 * Servlet implementation class KanjiTopicController
 */


@WebServlet("/KanjiTopicController")
public class KanjiTopicController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KanjiTopicController() {
        super();
        // TODO Auto-generated constructor stub
    }
    private DBConnection dbConn=new DBConnection();
    private KanjiTopicDAOIml kjTopicDAO=new KanjiTopicDAOIml(dbConn);
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
       
      
       String service= request.getParameter("service");
       
       //setting values default for service
       if(service==null)
       {
    	   service="getAll";
       }
       if(service.equals("getAll"))
       {
    	    KanjiTopic kjTopic= new KanjiTopic();
    	   kjTopic.setResultList(kjTopicDAO.findAll());
    	   request.setAttribute("kjTopic", kjTopic);
    	   RequestDispatcher rd=request.getRequestDispatcher("View/Admin/KanjiTopicAdmin/KanjiTopic.jsp");
      		rd.forward(request, response);
       }
       if(service.equals("home"))
       {
    	   RequestDispatcher rd=request.getRequestDispatcher("View/Admin/Home.jsp");
     		rd.forward(request, response);
       }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);

	}

}
