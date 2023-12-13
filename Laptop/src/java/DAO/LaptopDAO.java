/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modal.Laptop;

/**
 *
 * @author Thanh
 */
public class LaptopDAO extends DBContext{

    public List<Laptop> getListLaptop() {
        List<Laptop> laptop = new ArrayList<>();
        try{
        String sql = "select*from Laptop";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Laptop l = new Laptop();
                l.setId(rs.getInt("id"));
                l.setName(rs.getString("name"));
                l.setPrice(rs.getDouble("price"));
                l.setColor(rs.getString("color"));
                
                laptop.add(l);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
    }
        return laptop;

    }
    
    public void deleteLaptopbyID (String id) {
        try{
        String str = "delete from Laptop\n"
                    + "where id=?";
            PreparedStatement pstm = connection.prepareStatement(str);
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Delete Laptop: " + e.getMessage());
        }
    
}
}
