
import generated.Configuraciones;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXB;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/LeerXml"})
public class LeerXml extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            ServletContext context = getServletContext();
            String fullPath = context.getRealPath("/configuraciones.xml");
            File f = new File(fullPath);

            Jaxb jaxb = new Jaxb();
            
            Configuraciones configs = jaxb.xmlToObject(f);  //En aquest punt podem modificar prs, es un objecte.

            StringWriter sw = new StringWriter();
            JAXB.marshal(configs, sw);
            String xmlString = sw.toString();

            response.setContentType("text/xml");
            PrintWriter pw = response.getWriter();
            pw.println(xmlString);

        } catch (Exception e) {
            
          

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
