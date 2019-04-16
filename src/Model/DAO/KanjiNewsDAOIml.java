package Model.DAO;

import java.util.List;

import Entity.FlCardTopicEntity;
import Entity.KanjiWordNewsEntity;

import Model.Mapper.KanjiNewsMapper;
import Model.DBConnection;

public class KanjiNewsDAOIml extends BaseDAOIml<KanjiWordNewsEntity> implements KanjiNewsDAO{

	public KanjiNewsDAOIml(DBConnection dbConn) {
		super(dbConn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public KanjiWordNewsEntity findOne(Integer id) {
		String sql = "SELECT * FROM tbl_wordkanji WHERE word_id = ?";
		List<KanjiWordNewsEntity> result = Query(sql, new KanjiNewsMapper(), id);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public Integer save(KanjiWordNewsEntity wordDetail) {
		String sql="insert into tbl_wordkanji(word_name,word_img,word_info,word_animation,topic_id) values(?,?,?,?,?)";
		return Insert(sql,wordDetail.getWord_name(),wordDetail.getWord_img(),wordDetail.getWord_info(),wordDetail.getWord_animation(),wordDetail.getTopic_id() );
	}

	@Override
	public void update(KanjiWordNewsEntity wordDetail) {
		String sql="UPDATE tbl_wordkanji SET word_name=?,word_img=?,word_info=?,word_animation=?,topic_id=? where word_id=?";		
		 Update(sql,wordDetail.getWord_name(),wordDetail.getWord_img(),wordDetail.getWord_info(),wordDetail.getWord_animation(),wordDetail.getTopic_id(),wordDetail.getWord_id());
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM tbl_wordkanji WHERE word_id = ?";
		Delete(sql, id);
		
	}

}
