package Model.DAO;

import java.util.List;

import Entity.FlashCardEntity;
import Entity.KanjiTopic;
import Model.Mapper.FlashCardMapper;

import Model.DBConnection;

public class FlashCardDAOIml extends BaseDAOIml<FlashCardEntity> implements FlashCardDAO{

	public FlashCardDAOIml(DBConnection dbConn) {
		super(dbConn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public FlashCardEntity findOne(Integer id) {
		String sql = "SELECT * FROM tbl_flashcard WHERE flcard_id = ?";
		List<FlashCardEntity> result = Query(sql, new FlashCardMapper(), id);
		return result.isEmpty() ? null : result.get(0);
	
	}

	@Override
	public Integer save(FlashCardEntity flCardDetail) {
		String sql="insert into tbl_flashcard(flcard_name,flcard_img,flctopic_id,flcard_question1,flcard_question2) values(?,?,?)";
		return Insert(sql,flCardDetail.getFlcard_name(),flCardDetail.getFlcard_img(),flCardDetail.getFlcard_question1(),flCardDetail.getFlcard_question2());
	}

	@Override
	public void update(FlashCardEntity flCardDetail) {
		// TODO Auto-generated method stub
		String sql="UPDATE tbl_flashcard SET flcard_name=?,flcard_img=?,flctopic_id=?,flcard_question1=?,flcard_question2=? where flcard_id=?";		
		 Update(sql, flCardDetail.getFlcard_name(),flCardDetail.getFlcard_img(),flCardDetail.getFlcard_question1(),flCardDetail.getFlcard_question2(),flCardDetail.getFlcard_id());
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM tbl_flashcard WHERE flcard_id = ?";
		Delete(sql, id);
		
	}

}
