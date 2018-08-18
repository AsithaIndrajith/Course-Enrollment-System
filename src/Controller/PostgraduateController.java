/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database_Connection.DBConnection;
import Model.Postgraduate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */

/**Postgraduate controller class */
public class PostgraduateController {
    
    /**Search postgraduate by postgraduate ID*/
    public static Postgraduate searchPostgraduateByPostgraduateID(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From postgraduate where id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                Postgraduate un=new Postgraduate();
                un.setName(rst.getString("name"));
                un.setNic(rst.getString("nic"));
                un.setDob(rst.getString("dob"));
                un.setAddress(rst.getString("address"));
                un.setTelephone(rst.getString("telephone"));
                un.setId(rst.getString("id"));
                un.setPassword(rst.getString("password"));
                un.setQualifications(rst.getString("qualifications"));
                un.setSecurity(rst.getString("security"));
                un.setAnswer(rst.getString("answer"));
                un.setInstitute(rst.getString("institute"));
                un.setDepartment(rst.getString("departmentID"));
                un.setYear(rst.getString("year"));
                return un;
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search postgraduate by year*/
    public static ArrayList<String> searchPostgraduateByYear(String yr) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From postgraduate where year=?";
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
    
    /**Search postgraduate by department ID*/
    public static ArrayList<Postgraduate> searchPostgraduateDepartmentID(String depid) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From postgraduate where departmentID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, depid);
            ResultSet rst = stm.executeQuery();
            ArrayList<Postgraduate>unList=new ArrayList<Postgraduate>();
            while(rst.next()){
                Postgraduate un=new Postgraduate();
                un.setId(rst.getString("id"));
                un.setName(rst.getString("name"));
                un.setNic(rst.getString("nic"));
                un.setDob(rst.getString("dob"));
                un.setAddress(rst.getString("address"));
                un.setTelephone(rst.getString("telephone"));
                un.setId(rst.getString("id"));
                un.setPassword(rst.getString("password"));
                un.setQualifications(rst.getString("qualifications"));
                un.setSecurity(rst.getString("security"));
                un.setAnswer(rst.getString("answer"));
                un.setInstitute(rst.getString("institute"));
                un.setDepartment(rst.getString("departmentID"));
                un.setYear(rst.getString("year"));
                unList.add(un);
            }
            return unList;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Search postgraduate by national identity card number*/
    public static String searchPostgraduateByNIC(String nic) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From postgraduate where nic=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, nic);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
                
                return rst.getString("id");
                
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    /**Insert postgraduate*/
    public static int insertPostgraduate(Postgraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO postgraduate (name, dob,nic, address, telephone,qualifications,password,security,answer,institute,departmentID,year)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getName());
            stm.setObject(2, un.getDob());
            stm.setObject(3, un.getNic());
            stm.setObject(4, un.getAddress());
            stm.setObject(5, un.getTelephone());
            stm.setObject(6, un.getQualifications());
            stm.setObject(7, un.getNic());
            stm.setObject(8, un.getSecurity());
            stm.setObject(9, un.getAnswer());
            stm.setObject(10, un.getInstitute());
            stm.setObject(11, un.getDepartment());
            stm.setObject(12, "1");
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
       /**Update postgraduate Personal details*/
    public static int updatePostgraduatePersonal(Postgraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE postgraduate SET name=?, dob=?,nic=?,address=?,telephone=? WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getName());
            stm.setObject(2, un.getDob());
            stm.setObject(3, un.getNic());
            stm.setObject(4, un.getAddress());
            stm.setObject(5, un.getTelephone());
            stm.setObject(6, un.getId());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
    /**Update postgraduate password*/
    public static int updatePostgraduatePassword(Postgraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE postgraduate SET password=? WHERE id=?";
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
    /**Update postgraduate*/
    public static int updatePostgraduate(Postgraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE postgraduate SET name=?,nic=?,dob=?,address=?,telephone=?, qualifications=?,password=?,institute=? WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, un.getName());
            stm.setObject(2, un.getNic());
            stm.setObject(3, un.getDob());
            stm.setObject(4, un.getAddress());
            stm.setObject(5, un.getTelephone());
            stm.setObject(6, un.getQualifications());
            stm.setObject(7, un.getPassword());
            stm.setObject(8, un.getInstitute());
            stm.setObject(9, un.getId());
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    /**Update undergraduate year*/
    public static int updatePostgraduateYear(String id,String year) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE postgraduate SET year=? WHERE id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, year);
            stm.setObject(2, id);
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
    /**Delete postgraduate*/
    public static int deletePostgraduate(Postgraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "DELETE FROM postgraduate WHERE id=?";
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
