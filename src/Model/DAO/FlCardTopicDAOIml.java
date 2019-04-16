package Model.DAO;

import java.util.List;

import Entity.FlCardTopicEntity;
import Entity.KanjiTopic;
import Model.Mapper.FlCardTopicMapper;


import Model.DBConnection;

public class FlCardTopicDAOIml extends BaseDAOIml<FlCardTopicEntity>implements FlCardTopicDAO{

	public FlCardTopicDAOIml(DBConnection dbConn) {
		super(dbConn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public FlCardTopicEntity findOne(Integer id) {
		String sql = "SELECT * FROM tbl_flctopic WHERE flctopic_id = ?";
		List<FlCardTopicEntity> result = Query(sql, new FlCardTopicMapper(), id);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public Integer save(FlCardTopicEntity FlTopicDetail) {
		String sql="insert into tbl_flctopic(flctopic_name,flctopic_img) values(?,?)";
		return Insert(sql,FlTopicDetail.getFlctopic_name(),FlTopicDetail.getFlctopic_img() );
	}

	@Override
	public void update(FlCardTopicEntity FlTopicDetail) {
		// TODO Auto-generated method stub
		String sql="UPDATE tbl_flctopic SET flctopic_name=?,flctopic_img=? where flctopic_id=?";		
		 Update(sql,FlTopicDetail.getFlctopic_name(),FlTopicDetail.getFlctopic_img() ,FlTopicDetail.getFlctopic_id());
		
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM tbl_flctopic WHERE flctopic_id = ?";
		Delete(sql, id);
		
	}

}
