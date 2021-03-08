import java.util.Date;

public class Student {
    private int id;
    private String fullName;
    private boolean gender;
    private Date birthday;
    private String address;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public boolean isGender(){
        return gender;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public Date getBirthday(){
        return birthday;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    public String getAddress(){
        return address;
    }
    public void setString(String address){
        this.address = address;
    }
}
