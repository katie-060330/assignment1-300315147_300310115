public class Address{
    private String street; 
    private int number; 
    private String postal; 


    public Address(String street, int number, String postal){
        this.number = number; 
        this.street = street; 
        this. postal = postal; 
    }

    public String getStreet(){
        return street; 
    }

    public String getPostal(){
        return postal; 
    }

    public int getNumber(){
        return number; 
    }

}