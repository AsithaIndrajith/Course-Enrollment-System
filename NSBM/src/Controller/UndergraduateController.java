/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Course;
import Model.Undergraduate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asitha
 */
public class UndergraduateController {
    public static Undergraduate searchUndergraduate(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From undergraduate where id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                Undergraduate un=new Undergraduate();
                un.setName(rst.getString("name"));
                un.setNic(rst.getString("nic"));
                un.setDob(rst.getString("dob"));
                un.setAddress(rst.getString("address"));
                un.setTelephone(rst.getString("telephone"));
                un.setAlResult(rst.getString("alResult"));
                un.setAlIndex(rst.getString("alIndex"));
                un.setAlStream(rst.getString("alStream"));
                un.setId(rst.getString("id"));
                un.setPassword(rst.getString("password"));
                un.setSecurity(rst.getString("security"));
                un.setAnswer(rst.getString("answer"));
                un.setDepID(rst.getString("depID"));
                return un;
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static String searchUndergraduateID(String nic) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From undergraduate where nic=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, nic);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
                
                return rst.getString("id");
                
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static ArrayList<String> searchAll(String yr) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From undergraduate where year=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, yr);
            ResultSet rst = stm.executeQuery();
            ArrayList<String>unList=new ArrayList<String>();
            while(rst.next()){
                unList.add(rst.getString("id"));
            }
            return unList;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    //String name,String nic,String dob,String address,String telephone,String alResult,String alIndex,String alStream
    public static int insertUndergraduatePersonal(Undergraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO undergraduate (name, nic, dob, address, telephone, alResult, alIndex, alStream,password,security,answer,year,depID)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getName());
            stm.setObject(2, un.getNic());
            stm.setObject(3, un.getDob());
            stm.setObject(4, un.getAddress());
            stm.setObject(5, un.getTelephone());
            stm.setObject(6, un.getAlResult());
            stm.setObject(7, un.getAlIndex());
            stm.setObject(8, un.getAlStream());
            stm.setObject(9, un.getNic());
            stm.setObject(10, un.getSecurity());
            stm.setObject(11, un.getAnswer());
            stm.setObject(12, "1");
            stm.setObject(13, un.getDepID());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
   
    public static int updateUndergraduateCourse(String id,String course) throws SQLException{
        try {
            String sql="UPDATE undergraduate SET course=? WHERE id=?";
            Connection conn=DBConnection.getDBConnection().getConnection();
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setObject(1, course);
            stm.setObject(1, id);
            return stm.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public static int updateUndergraduatePersonal(Undergraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE undergraduate SET name=?,nic=?,dob=?,address=?,telephone=? WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getName());
            stm.setObject(2, un.getNic());
            stm.setObject(3, un.getDob());
            stm.setObject(4, un.getAddress());
            stm.setObject(5, un.getTelephone());
            stm.setObject(6, un.getId());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    public static int updateUndergraduatePassword(Undergraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE undergraduate SET password=? WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getPassword());
            stm.setObject(2, un.getId());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    //not complete
    public static int updateUndergraduateAll(Undergraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE undergraduate SET name=?,nic=?,dob=?,address=?,telephone=? ,alIndex=?, alResult=?,alStream=?,password=? WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getName());
            stm.setObject(2, un.getNic());
            stm.setObject(3, un.getDob());
            stm.setObject(4, un.getAddress());
            stm.setObject(5, un.getTelephone());
            stm.setObject(6, un.getAlIndex());
            stm.setObject(7, un.getAlResult());
            stm.setObject(8, un.getAlStream());
            stm.setObject(9, un.getPassword());
            stm.setObject(10, un.getId());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    public static int deleteUndergraduate(Undergraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM undergraduate WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getId());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
        
}
