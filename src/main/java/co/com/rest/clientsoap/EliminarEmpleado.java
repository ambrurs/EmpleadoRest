
package co.com.rest.clientsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarEmpleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarEmpleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.empleado.war.com.co/}empelado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarEmpleado", propOrder = {
    "arg0"
})
public class EliminarEmpleado {

    protected Empelado arg0;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link Empelado }
     *     
     */
    public Empelado getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Empelado }
     *     
     */
    public void setArg0(Empelado value) {
        this.arg0 = value;
    }

}
