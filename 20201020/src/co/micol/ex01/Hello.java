package co.micol.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) // 매개변수로 request,와 response 를 사용. 
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); // 넘어온 객체의 요청의 character set 을 utf-8 로 하라 : 한글깨짐 방지를 위해 사용
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("id"); //넘어온 id 값
		String pw = request.getParameter("pw"); //넘어온 pw값
		
		String msq;
		if(id.equals("hong")) {
			msq = "홍길동 님 환영합니다.";
		}else {
			msq = "등록된 회원이 아닙니다.";
		}
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>First Servlet Program!!! </p>");
		out.print("<p>Java : 20201020 project </p>");
		out.print("<p>" + msq+"</p>");
		//out.print("<p> 패스워드" + pw+"</p>");
		out.print("</body>");
		out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
