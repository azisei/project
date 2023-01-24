 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
 import javax.faces.bean.ManagedBean;
 import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class insert1 {
   
    private String username;
    private String phone;
    private String address;
    
    public insert1(){
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void log(){
        try{
            dbc da=new dbc();
            Connection connection =da.connMethod();
            PreparedStatement st=connection.prepareStatement("Insert into SIGN(username,phone,address) VALUE(?,?,?)");
            st.setString(1,username);
            st.setString(2,phone);
            st.setString(3,address);
            st.executeUpdate();
        }
        catch (SQLException e){
            
        }
    }
}
