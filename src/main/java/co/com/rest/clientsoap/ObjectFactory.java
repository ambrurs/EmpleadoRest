
package co.com.rest.clientsoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.rest.clientsoap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditarEmpleadoResponse_QNAME = new QName("http://service.empleado.war.com.co/", "editarEmpleadoResponse");
    private final static QName _EliminarEmpleado_QNAME = new QName("http://service.empleado.war.com.co/", "eliminarEmpleado");
    private final static QName _ListarEmpleados_QNAME = new QName("http://service.empleado.war.com.co/", "listarEmpleados");
    private final static QName _Hello_QNAME = new QName("http://service.empleado.war.com.co/", "hello");
    private final static QName _EditarEmpleado_QNAME = new QName("http://service.empleado.war.com.co/", "editarEmpleado");
    private final static QName _CrearEmpleado_QNAME = new QName("http://service.empleado.war.com.co/", "crearEmpleado");
    private final static QName _HelloResponse_QNAME = new QName("http://service.empleado.war.com.co/", "helloResponse");
    private final static QName _CrearEmpleadoResponse_QNAME = new QName("http://service.empleado.war.com.co/", "crearEmpleadoResponse");
    private final static QName _EliminarEmpleadoResponse_QNAME = new QName("http://service.empleado.war.com.co/", "eliminarEmpleadoResponse");
    private final static QName _Empelado_QNAME = new QName("http://service.empleado.war.com.co/", "empelado");
    private final static QName _ListarEmpleadosResponse_QNAME = new QName("http://service.empleado.war.com.co/", "listarEmpleadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.rest.clientsoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarEmpleadoResponse }
     * 
     */
    public EliminarEmpleadoResponse createEliminarEmpleadoResponse() {
        return new EliminarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link Empelado }
     * 
     */
    public Empelado createEmpelado() {
        return new Empelado();
    }

    /**
     * Create an instance of {@link ListarEmpleadosResponse }
     * 
     */
    public ListarEmpleadosResponse createListarEmpleadosResponse() {
        return new ListarEmpleadosResponse();
    }

    /**
     * Create an instance of {@link EditarEmpleado }
     * 
     */
    public EditarEmpleado createEditarEmpleado() {
        return new EditarEmpleado();
    }

    /**
     * Create an instance of {@link CrearEmpleado }
     * 
     */
    public CrearEmpleado createCrearEmpleado() {
        return new CrearEmpleado();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CrearEmpleadoResponse }
     * 
     */
    public CrearEmpleadoResponse createCrearEmpleadoResponse() {
        return new CrearEmpleadoResponse();
    }

    /**
     * Create an instance of {@link EliminarEmpleado }
     * 
     */
    public EliminarEmpleado createEliminarEmpleado() {
        return new EliminarEmpleado();
    }

    /**
     * Create an instance of {@link ListarEmpleados }
     * 
     */
    public ListarEmpleados createListarEmpleados() {
        return new ListarEmpleados();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link EditarEmpleadoResponse }
     * 
     */
    public EditarEmpleadoResponse createEditarEmpleadoResponse() {
        return new EditarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "editarEmpleadoResponse")
    public JAXBElement<EditarEmpleadoResponse> createEditarEmpleadoResponse(EditarEmpleadoResponse value) {
        return new JAXBElement<EditarEmpleadoResponse>(_EditarEmpleadoResponse_QNAME, EditarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "eliminarEmpleado")
    public JAXBElement<EliminarEmpleado> createEliminarEmpleado(EliminarEmpleado value) {
        return new JAXBElement<EliminarEmpleado>(_EliminarEmpleado_QNAME, EliminarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpleados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "listarEmpleados")
    public JAXBElement<ListarEmpleados> createListarEmpleados(ListarEmpleados value) {
        return new JAXBElement<ListarEmpleados>(_ListarEmpleados_QNAME, ListarEmpleados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "editarEmpleado")
    public JAXBElement<EditarEmpleado> createEditarEmpleado(EditarEmpleado value) {
        return new JAXBElement<EditarEmpleado>(_EditarEmpleado_QNAME, EditarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "crearEmpleado")
    public JAXBElement<CrearEmpleado> createCrearEmpleado(CrearEmpleado value) {
        return new JAXBElement<CrearEmpleado>(_CrearEmpleado_QNAME, CrearEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "crearEmpleadoResponse")
    public JAXBElement<CrearEmpleadoResponse> createCrearEmpleadoResponse(CrearEmpleadoResponse value) {
        return new JAXBElement<CrearEmpleadoResponse>(_CrearEmpleadoResponse_QNAME, CrearEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "eliminarEmpleadoResponse")
    public JAXBElement<EliminarEmpleadoResponse> createEliminarEmpleadoResponse(EliminarEmpleadoResponse value) {
        return new JAXBElement<EliminarEmpleadoResponse>(_EliminarEmpleadoResponse_QNAME, EliminarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empelado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "empelado")
    public JAXBElement<Empelado> createEmpelado(Empelado value) {
        return new JAXBElement<Empelado>(_Empelado_QNAME, Empelado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpleadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.empleado.war.com.co/", name = "listarEmpleadosResponse")
    public JAXBElement<ListarEmpleadosResponse> createListarEmpleadosResponse(ListarEmpleadosResponse value) {
        return new JAXBElement<ListarEmpleadosResponse>(_ListarEmpleadosResponse_QNAME, ListarEmpleadosResponse.class, null, value);
    }

}
