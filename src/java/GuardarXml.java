
import generated.Configuraciones;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

@WebServlet(urlPatterns = {"/GuardarXml"})
public class GuardarXml extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
//data: {id: newId, nm: nombre, d: dificultad, n: modeloNave, l: modeloLuna}
            String nombre = request.getParameter("nm");
            byte d = (byte) Integer.parseInt(request.getParameter("d"));
            byte n = (byte) Integer.parseInt(request.getParameter("n"));
            byte l = (byte) Integer.parseInt(request.getParameter("l"));
            byte id = (byte) Integer.parseInt(request.getParameter("id"));

            ServletContext context = getServletContext();
            String fullPath = context.getRealPath("/configuraciones.xml");

            File f = new File(fullPath);

            Jaxb jaxb = new Jaxb();
            Configuraciones cnfs = jaxb.xmlToObject(f);

            Configuraciones.Config conf = new Configuraciones.Config();

            //creando objeto
            conf.setId(id);
            conf.setNom(nombre);
            conf.setDificultad(d);
            conf.setLuna(l);
            conf.setNave(n);

            cnfs.getConfig().add(conf);

            JAXBContext jaxbContext = JAXBContext.newInstance(Configuraciones.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(cnfs, f);

            response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.println("{\"mess\":\"Se ha guardado correctamente\"}");

        } catch (Exception e) {
             response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.println("{\"mess\":\"No se ha podido guardar correctamente\"}");

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
