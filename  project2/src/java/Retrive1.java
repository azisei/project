import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.SessionScoped;

@ManagedBean(name="ret")
@SessionScoped  
public class Retrive1 {
private String username1;

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }
    public List<insert> singleList;

    /**
     *
     * @return
     */
    public List<insert> singlelist(){
     singleList=new ArrayList<>();
          
        try {
            dbc ds=new dbc();
            Connection connection =ds.connMethod();
            PreparedStatement st;
            st = connection.prepareStatement("select * from SIGN where USERNAME=?");
             st.setString(1,username1);
            ResultSet rs= st.executeQuery();
            
             while (rs.next()) {
             insert add=new insert();
             add.setUsername(rs.getString("USERNAME"));
             add.setPhone(rs.getString("PHONE"));
             add.setAddress(rs.getString("ADDRESS"));
             add.setClasses(rs.getString("CLASS"));
             add.setType(rs.getString("TYPE"));
             add.setAdult(rs.getString("ADULT"));
             
             singleList.add(add);
             }
        } catch (SQLException e) {
            
        }
         return singleList;   
        }
 
   
}
