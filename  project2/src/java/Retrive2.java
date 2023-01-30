
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
@ManagedBean(name="tra")
@SessionScoped 

public class Retrive2 {
    private String train;

    public void setTrain(String train) {
        this.train = train;
    }

    public String getTrain() {
        return train;
    }

      public List<insert> singleL;

    /**
     *
     * @return
     */
    public List<insert> singlel(){
     singleL=new ArrayList<>();
      try {
            dbc ds=new dbc();
            Connection connection =ds.connMethod();
            PreparedStatement st;
            st = connection.prepareStatement("select * from TRAIN1 where STARTING_POINT=?");
             st.setString(1,train);
            ResultSet rs= st.executeQuery();
            
             while (rs.next()) {
             insert add=new insert();
             add.setTrainNo(rs.getString("TRAIN_NUMBER"));
             add.setStartingpoint(rs.getString("STARTING_POINT"));
             add.setDestination(rs.getString("DESTINATION"));
             add.setDate(rs.getString("DAY"));
             add.setDeparture(rs.getString("DEPARTURE"));
             
             
             singleL.add(add);
             }
        } catch (SQLException e) {
            
        }
         return singleL;   
        }
 
}
