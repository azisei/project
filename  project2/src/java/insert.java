
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class insert {
   
    private String username;
    private String phone;
    private String address;
    private String classes;//radio button
    List<String> cla;
    private String type;//radio button
    List<String> typ;
    private String adult;//radio button
    List<String> adul;
    private String trainNo;//combobox
    List<String>trNo;
    private String startingpoint;//combobox
    List<String>stp;
    private String destination;//combobox
    List<String>des;
    private String date;//combobox
    List<String>da;
    private String departure;//combobox
    List<String>dep;
    
    
    public insert(){
        cla= new ArrayList<>();
        typ= new ArrayList<>();
        adul= new ArrayList<>();
        da=new ArrayList<>();
        stp=new ArrayList<>();
        trNo=new ArrayList<>();
        des=new ArrayList<>();
        dep=new ArrayList<>();
        
        
        cla.add("Standard :$30");
        cla.add("Economy :$45");
        cla.add("VIP :$100");
        typ.add("Single");
        typ.add("Return");
        adul.add("Yes");
        adul.add("Yes");
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

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public List<String> getDep() {
        return dep;
    }

    public void setDep(List<String> dep) {
        this.dep = dep;
    }
   
    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public List<String> getTrNo() {
        return trNo;
    }

    public void setTrNo(List<String> trNo) {
        this.trNo = trNo;
    }

    public String getStartingpoint() {
        return startingpoint;
    }

    public void setStartingpoint(String startingpoint) {
        this.startingpoint = startingpoint;
    }

    public List<String> getStp() {
        return stp;
    }

    public void setStp(List<String> stp) {
        this.stp = stp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getDes() {
        return des;
    }

    public void setDes(List<String> des) {
        this.des = des;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getDa() {
        return da;
    }

    public void setDa(List<String> da) {
        this.da = da;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public List<String> getCla() {
        return cla;
    }

    public void setCla(List<String> cla) {
        this.cla = cla;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTyp() {
        return typ;
    }

    public void setTyp(List<String> typ) {
        this.typ = typ;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }
    

    public List<String> getAdul() {
        return adul;
    }

    public void setAdul(List<String> adul) {
        this.adul = adul;
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
            dbc d=new dbc();
            Connection connection =d.connMethod();
            PreparedStatement st=connection.prepareStatement("Insert into SIGN(USERNAME,PHONE,ADDRESS,CLASS,TYPE,ADULT) VALUES(?,?,?,?,?,?)");
            st.setString(1,username);
            st.setString(2,phone);
            st.setString(3,address);
            st.setString(4,classes);
            st.setString(5,type);
            st.setString(6,adult);
            st.executeUpdate();
            
            
        }
        catch (SQLException e){
            
        }
    }
 public void lag(){
     try{
            dbc b=new dbc();
            Connection connectio =b.connMethod();
            PreparedStatement s=connectio.prepareStatement("Insert into TRAIN1(TRAIN_NUMBER,STARTING_POINT,DESTINATION,DAY,DEPARTURE) VALUES (?,?,?,?,?)");
            s.setString(1,trainNo);
            s.setString(2,startingpoint);
            s.setString(3,destination);
            s.setString(4,date);
             s.setString(5,departure);
              
            s.executeUpdate();
     }
     catch (SQLException e){
            
        }
 }
} 
 
