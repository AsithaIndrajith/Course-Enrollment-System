/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DBConnection;
import Model.Location;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asitha
 */
public class LocationController {
    public static ArrayList<Location> searchLoc(String depID) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM location WHERE depID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, depID);
        ResultSet rst = stm.executeQuery();
        ArrayList<Location> ls=new ArrayList<>();
        while(rst.next()){
            Location l=new Location();
            l.setLocationID(rst.getString("locationId"));
            l.setLocationName(rst.getString("locationName"));
            ls.add(l);
        }
        return ls;
    }
    public static Location searchLocID(String ID) throws SQLException, ClassNotFoundException{
        String sql="SELECT * FROM location WHERE locationID=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, ID);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Location l=new Location();
            l.setLocationID(rst.getString("locationId"));
            l.setLocationName(rst.getString("locationName"));
            return l;
        }
        return null;
        
    }
    
    public static int insertLoc(Location cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "INSERT INTO location (locationID,locationName,depID)VALUES (?,?,?)";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getLocationID());
            stm.setObject(2, cs.getLocationName());
            stm.setObject(3, cs.getDepId());
         
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
     public static int updateLoc(Location cs) throws SQLException, ClassNotFoundException{
        try{
            String sql = "UPDATE location SET locationID=?,locationName=?,depID=? WHERE locationID=?";
            Connection conn = DBConnection.getDBConnection().getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setObject(1, cs.getLocationID());
            stm.setObject(2, cs.getLocationName());
            stm.setObject(3, cs.getDepId());
            stm.setObject(4, cs.getLocationID());
            
            return stm.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
            
        }
        return 0;
    }
    
}
