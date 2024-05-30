public class Test {

    public static void main(String[] args){
        
        String o1 = "Falco"; 

        Employee employee = new Employee(o1, 40, 15.50, 5);

        employee.insertElement(new Address("Queen", 48, "K1P1N2"));
        employee.insertElement(new Address("King Edward", 800, "K1N6N6"));
        
    }
    
}
