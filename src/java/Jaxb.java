
import generated.Configuraciones;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Jaxb {

    Configuraciones xmlToObject(File f) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Configuraciones.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            //Do the job, return object
            return (Configuraciones) jaxbUnmarshaller.unmarshal(f);
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    

    private void objectToXml(Configuraciones cds, File rf) {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Configuraciones.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Optional
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Do the job
            jaxbMarshaller.marshal(cds, rf);

            //Optional: output pretty printed
            //jaxbMarshaller.marshal(cds, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
