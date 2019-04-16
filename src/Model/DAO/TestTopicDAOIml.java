package Model.DAO;

import java.util.List;

import Entity.KanjiTopic;
import Entity.TestTopicEntity;
import Model.Mapper.TestTopicMapper;
import Model.DBConnection;

public class TestTopicDAOIml extends BaseDAOIml<TestTopicEntity> implements TestTopicDAO{

	public TestTopicDAOIml(DBConnection dbConn) {
		super(dbConn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TestTopicEntity findOne(Integer id) {
		String sql = "SELECT * FROM tbl_test WHERE test_id = ?";
		List<TestTopicEntity> result = Query(sql, new TestTopicMapper(), id);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public Integer save(TestTopicEntity testTopicDetail) {
		String sql="insert into tbl_test(test_name,test_img) values(?,?)";
		return Insert(sql,testTopicDetail.getTest_name(),testTopicDetail.getTest_img());
	}

	@Override
	public void update(TestTopicEntity testTopicDetail) {
		String sql="UPDATE tbl_test SET test_name=?,test_img=? where test_id=?";		
		 Update(sql, testTopicDetail.getTest_name(),testTopicDetail.getTest_img(),testTopicDetail.getTest_id());
		
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM tbl_test WHERE test_id = ?";
		Delete(sql, id);
		
	}

}
