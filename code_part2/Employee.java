public class Employee {

    private String name;
    private int hours; 
    private double rate; 
    private Address[] address; 
    
    public Employee(String name, int hours, double rate, int capacity){
        this.name = name; 
        this.hours = hours; 
        this.rate = rate; 
        address = new Address[capacity]; 
    }

    public String getName(){
        return name; 
    }

    public int getHours(){
        return hours; 
    }

    public double getRate(){
        return rate; 
    }

    public Address[] getAdress(){
        return address; 
    }

    public Address getAddressElement(int i){
        if (i >= address.length || i < 0){
            throw new IndexOutOfBoundsException();
        }
        return address[i];
    }

    public void insertElement(Address add){
        address[address.length -1 ] = add; 
    }




    
}
