//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.08.01 a las 04:59:28 PM CDT 
//


package https.com_mx_uv_calculadora.calculadora;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Valora" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Valorb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valora",
    "valorb"
})
@XmlRootElement(name = "SumaRequest")
public class SumaRequest {

    @XmlElement(name = "Valora")
    protected int valora;
    @XmlElement(name = "Valorb")
    protected int valorb;

    /**
     * Obtiene el valor de la propiedad valora.
     * 
     */
    public int getValora() {
        return valora;
    }

    /**
     * Define el valor de la propiedad valora.
     * 
     */
    public void setValora(int value) {
        this.valora = value;
    }

    /**
     * Obtiene el valor de la propiedad valorb.
     * 
     */
    public int getValorb() {
        return valorb;
    }

    /**
     * Define el valor de la propiedad valorb.
     * 
     */
    public void setValorb(int value) {
        this.valorb = value;
    }

}
