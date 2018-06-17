/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Postgraduate;
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
public class PostgraduateController {
    public static Postgraduate searchPostgraduate(String id) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From postgraduate where id=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, id);
            ResultSet rst = stm.executeQuery();
            if(rst.next()){
            //Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
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
                return un;
            }else{
                return null;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    
    public static ArrayList<String> searchAllP(String yr) throws SQLException, ClassNotFoundException{
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
    
    public static String searchPostgraduateID(String nic) throws SQLException, ClassNotFoundException{
        try{
            String sql = "Select * From postgraduate where nic=?";
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
    //String name,String nic,String dob,String address,String telephone,String alResult,String alIndex,String alStream
    public static int insertPostgraduate(Postgraduate un) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO postgraduate (name, dob,nic, address, telephone,qualifications,password,security,answer,institute,departmentID)VALUES (?,?,?,?,?,?,?,?,?,?,?)";
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
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
       
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
    //not complete
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
