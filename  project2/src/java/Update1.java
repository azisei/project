
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Update1 {
     private String trainN;//combobox
    List<String>trNo;
    private String startingpoin;//combobox
    List<String>stp;
    private String destinatio;//combobox
    List<String>des;
    private String dat;//combobox
    List<String>da;
    private String departur;//combobox
    List<String>dep;

    public String getTrainN() {
        return trainN;
    }

    public List<String> getTrNo() {
        return trNo;
    }

    public String getStartingpoin() {
        return startingpoin;
    }

    public List<String> getStp() {
        return stp;
    }

    public String getDestinatio() {
        return destinatio;
    }

    public List<String> getDes() {
        return des;
    }

    public String getDat() {
        return dat;
    }

    public List<String> getDa() {
        return da;
    }

    public String getDepartur() {
        return departur;
    }

    public List<String> getDep() {
        return dep;
    }
    public Update1(){
       
        da=new ArrayList<>();
        stp=new ArrayList<>();
        trNo=new ArrayList<>();
        des=new ArrayList<>();
        dep=new ArrayList<>();
       
        trNo.add(" 15055");
        trNo.add(" 15066");
        trNo.add(" 15077");
        stp.add("Addis Ababa");
        stp.add("DiraDawa");
        stp.add("Dessie");
        stp.add("BaharDar");
        stp.add("Somali");
        stp.add("Mekelle ");
        stp.add("Wolkite");
        stp.add("Jimma");
        des.add("Addis Ababa");
        des.add("DiraDawa");
        des.add("Dessie");
        des.add("BaharDar");
        des.add("Somali");
        des.add("Mekelle ");
        des.add("Wolkite");
        des.add("Jimma");
        da.add("05/02/2023 ");
        da.add("06/02/2023 ");
        da.add("07/02/2023 ");
        da.add("09/02/2023 ");
        dep.add("8:30 AM");
        dep.add("12:30 PM");
        dep.add("6:30 PM");
          
    }
    
    
    public void lug(){
    try{
            dbc ds=new dbc();
            Connection connection =ds.connMethod();
            PreparedStatement p = connection.prepareStatement("UPDATE TRAIN SET TRAIN_NUMBER=?,DESTINATION=?,DAY=?,DEPARTURE=? WHERE STARTING_POINT=?");
            p.setString(1,trainN);
              p.setString(2,startingpoin);
            p.setString(3,destinatio);
            p.setString(4,dat);
            p.setString(5,departur);
         
      }
      catch(SQLException e) {
      
      }
     
}
}
