public class Customer {
    private int id;
    private String name;
    private String contactInfo;

    public Customer(int id, String name, String contactInfo){
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContactInfo(){
        return contactInfo;
    }

    public void setContactinfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Contact Info: " + contactInfo;
    }

}