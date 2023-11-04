package Service;

@webService(name="CalculatriceWS")
public class CalculatriceWS {
	
	@WebMethod(operationName="Somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}
