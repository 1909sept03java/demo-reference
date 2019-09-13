package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Cave;
import com.revature.util.ConnectionUtil;

public class CaveDAOImpl implements CaveDAO {

	@Override
	public List<Cave> getCaves() {
		List<Cave> cl = new ArrayList<>();
		// try-with-resources... resources included in the try args will be closed at the end of the block
		// works with all AutoCloseable resources
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM CAVE";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int caveId = rs.getInt("CAVE_ID");
				String caveName = rs.getString("CAVE_NAME");
				int maxBears = rs.getInt("MAX_BEARS");
				cl.add(new Cave(caveId, caveName, maxBears));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public Cave getCaveById(int id) {
		Cave c = null;
		// try-with-resources... resources included in the try args will be closed at the end of the block
		// works with all AutoCloseable resources
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM CAVE WHERE CAVE_ID = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int caveId = rs.getInt("CAVE_ID");
				String caveName = rs.getString("CAVE_NAME");
				int maxBears = rs.getInt("MAX_BEARS");
				c = new Cave(caveId, caveName, maxBears);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void createCave(Cave cave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCave(Cave cave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCave(Cave cave) {
		// TODO Auto-generated method stub
		
	}

}
