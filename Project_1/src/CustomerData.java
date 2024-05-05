public class CustomerData {
    String Name,Surname,country,city,occupation;
    CustomerData(){
        Name=null;
        Surname=null;
        country=null;
        city=null;
        occupation=null;
    }

    CustomerData(String name,String surname,String country,String city,String occupation){
        setName(name);
        setSurname(surname);
        setCountry(country);
        setCity(city);
        setOccupation(occupation);
    }

    CustomerData(CustomerData copyCustomerData){
        setName(copyCustomerData.getName());
        setSurname(copyCustomerData.getSurname());
        setCountry(copyCustomerData.getCountry());
        setCity(copyCustomerData.getCity());
        setOccupation(copyCustomerData.getOccupation());
    }

    @Override
    public String toString() {
        return "Name: "+Name+"   Surname: "+Surname+"   Country: "+country+"   City: "+city+"   Occupation: "+occupation;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getOccupation() {
        return occupation;
    }
}
