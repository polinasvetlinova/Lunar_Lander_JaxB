//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.10.27 a las 06:24:54 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="config" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dificultad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="nave" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="luna" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "config"
})
@XmlRootElement(name = "configuraciones")
public class Configuraciones {

    protected List<Configuraciones.Config> config;

    /**
     * Gets the value of the config property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the config property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Configuraciones.Config }
     * 
     * 
     */
    public List<Configuraciones.Config> getConfig() {
        if (config == null) {
            config = new ArrayList<Configuraciones.Config>();
        }
        return this.config;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dificultad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="nave" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="luna" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "nom",
        "dificultad",
        "nave",
        "luna"
    })
    public static class Config {

        protected byte id;
        @XmlElement(required = true)
        protected String nom;
        protected byte dificultad;
        protected byte nave;
        protected byte luna;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public byte getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(byte value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad nom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNom() {
            return nom;
        }

        /**
         * Define el valor de la propiedad nom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNom(String value) {
            this.nom = value;
        }

        /**
         * Obtiene el valor de la propiedad dificultad.
         * 
         */
        public byte getDificultad() {
            return dificultad;
        }

        /**
         * Define el valor de la propiedad dificultad.
         * 
         */
        public void setDificultad(byte value) {
            this.dificultad = value;
        }

        /**
         * Obtiene el valor de la propiedad nave.
         * 
         */
        public byte getNave() {
            return nave;
        }

        /**
         * Define el valor de la propiedad nave.
         * 
         */
        public void setNave(byte value) {
            this.nave = value;
        }

        /**
         * Obtiene el valor de la propiedad luna.
         * 
         */
        public byte getLuna() {
            return luna;
        }

        /**
         * Define el valor de la propiedad luna.
         * 
         */
        public void setLuna(byte value) {
            this.luna = value;
        }

    }

}
