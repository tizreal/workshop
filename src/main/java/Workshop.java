

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Workshop
 */
@WebServlet("/Workshop")
public class Workshop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Workshop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

        PrintWriter out = response.getWriter();
       /* out.println("<html>");
        out.println("<head>");
        out.println("<title>Coding Workshop</title>");
        out.println("<style>");
        out.println("body { font-family: 'Arial', sans-serif; margin: 20px; background-image: url('/CodingWorkshop/wallpaperflare.com_wallpaper.jpg'); background-size: cover; }");
        out.println("header { background-color: #333; color: #fff; padding: 10px; text-align: center; }");
        out.println("section { margin-bottom: 20px; }");
        out.println("ul { list-style-type: none; padding: 0; }");
        out.println("li { margin-bottom: 10px; }");
        out.println("footer { background-color: #333; color: #fff; padding: 10px; text-align: center; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        
        out.println("<h1>Welcome to the Coding Workshop!</h1>");
        out.println("<p>Learn coding without the need for advanced computer knowledge or a scientific background.</p>");
        out.println("</header>");
        out.println("<p><span style='font-size: 24px; color: #ff6600;'>Discover coding</span> in our beginner-friendly workshop, emphasizing that coding proficiency doesn't require advanced computer knowledge, mathematical expertise, or a scientific background.</p>");
        out.println("<p>No prior coding experience is required! We believe that anyone can learn to code, and our workshop is designed to make the journey enjoyable and accessible to all.</p>");  
        out.println("<p>Throughout the workshop, participants will engage in various activities, gaining practical experience in different coding languages and concepts.</p>");  
        out.println("<p>        Our goal is to help you create easy sites just like this one you're presently seeing and add some designs/styles, layouts and many more.</p>");
        out.println("<section>");
        
        out.println("<section class='Workshop Activities'>");
        out.println("<footer>");
        out.println("<h2>Workshop Activities</h2>");
        out.println("</section>");
        out.println("</footer>");
        
        //out.println("<h2>Workshop Activities</h2>");
        out.println("<ul>");
        out.println("<li>Generative Art with JavaScript</li>");
        out.println("<li>Python for Educators</li>");
        out.println("<li>Web making with HTML & CSS</li>");
        out.println("<li>Introduction to SQL</li>");
        out.println("</ul>");
        
        out.println("<p>The workshop will cover various topics and languages, allowing participants to explore coding concepts and basic techniques.</p>");
        out.println("</section>");
        out.println("<section>");
        out.println("<h2>Conclusion</h2>");
        out.println("<p>At the end of the workshop, participants will have hands-on experience with generative art, Python, web development, and SQL.</p>");
        out.println("</section>");
        out.println("</body>");
        out.println("</html>");
        
     // Additional designs
        out.println("<section class='additional-design'>");
        out.println("<h2>Additional Designs</h2>");
        out.println("<p>Explore more designs and styles to enhance your coding skills.</p>");
        out.println("</section>");

        // Repeat or add more content as needed to make the webpage longer

        out.println("<footer>");
        out.println("<p>Contact us for more information: workshopcoding54@gmail.com</p>");
        out.println("<p>Sponsored by NCCEEP: TolSo Microgrant</p>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");*/
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Coding Workshop</title>");
        out.println("<style>");
        out.println("body { font-family: 'Comic Sans MS', sans-serif; margin: 20px; background-image: url('/CodingWorkshop/wallpaperflare.com_wallpaper (1).jpg'); background-size: cover; }");
        out.println("header { background-color: #333; color: #fff; padding: 10px; text-align: center; }");
        out.println("section { margin-bottom: 20px; }");
        out.println("ul { list-style-type: none; padding: 0; }");
        out.println("li { margin-bottom: 10px; }");
        out.println("footer { background-color: #333; color: #fff; padding: 10px; text-align: center; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");

        // Using <font> tag for font face, size, and color
        out.println("<h1><font face='Comic Sans MS' size='5' color='lightcyan'>WELCOME TO THE CODING WORKSHOP!</font></h1>");
        out.println("<p><font face='Comic Sans MS' size='4' color='lightcyan'>Learn coding without the need for advanced computer knowledge or a scientific background.</font></p>");
        out.println("</header>");
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>Discover codingin our beginner-friendly workshop, emphasizing that coding proficiency doesn't require advanced computer knowledge, mathematical expertise, or a scientific background.</font> .</p>");
        out.println("<p> </p>");
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>No prior coding experience is required! We believe that anyone can learn to code, and our workshop is designed to make the journey enjoyable and accessible to all.</font></p>");  
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>Throughout the workshop, participants will engage in various activities, gaining practical experience in different coding languages and concepts.</font></p>");  
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>Our goal is to help you create easy sites just like this one you're presently seeing and add some designs/styles, layouts, and many more.</font></p>");
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>Throughout our time together, we'll explore the basics of coding in a way that's approachable and welcoming. We'll be focusing on problem-solving, critical thinking, and effective communication—skills that are universal and applicable, regardless of your background..</font></p>");
        out.println("<section>");

        out.println("<section class='WORKSHOP ACTIVITIES'>");
        out.println("<footer>");
        out.println("<h2><font face='Comic Sans MS' size='5' color='lightcyan'>WORKSHOP ACTIVITIES</font></h2>");
        out.println("</section>");
        out.println("</footer>");

        out.println("<ul>");
        out.println("<li><font face='Comic Sans MS' size='4' color='paleturquoise'>Generative Art with JavaScript</font></li>");
        out.println("<li><font face='Comic Sans MS' size='4' color='paleturquoise'>Python for Educators</font></li>");
        out.println("<li><font face='Comic Sans MS' size='4' color='paleturquoise'>Web making with HTML & CSS</font></li>");
        out.println("<li><font face='Comic Sans MS' size='4' color='paleturquoise'>Introduction to SQL</font></li>");
        out.println("</ul>");

        //out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>The workshop will cover various topics and languages, allowing participants to explore coding concepts and basic techniques.</font></p>");
        out.println("</section>");

        out.println("<section>");
        out.println("<section class='CONCLUSION'>");
        out.println("<footer>");
        out.println("<h2><font face='Comic Sans MS' size='5' color='lightcyan'>CONCLUSION</font></h2>");
        out.println("</footer>");
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>At the end of the workshop, participants will have hands-on experience with generative art, Python, web development, and SQL.</font></p>");
        out.println("</section>");

        // Additional designs
        out.println("<section class='Are You Excited!'>");
        out.println("<h2><font face='Comic Sans MS' size='5' color='lightcyan'>Are You Excited!</font></h2>");
        out.println("<p><font face='Comic Sans MS' size='4' color='paleturquoise'>Get ready for a fun, innovative experience to start up your coding journey!.</font></p>");
        out.println("</section>");

        out.println("<footer>");
        out.println("<p><font face='Comic Sans MS' size='4' color='lightcyan'>CONTACT US FOR MORE INFORMATION: codingworkshop076@gmail.com</font></p>");
        out.println("<p><font face='Comic Sans MS' size='4' color='lightcyan'>SPONSORED BY NCCEEP: TolSo Microgrant</font></p>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");

        
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
