package Model.DAO;

import java.util.List;

import Entity.ResultEntity;
import Entity.TestEntity;
import Model.Mapper.TestMapper;
import Model.DBConnection;

public class TestDAOIml extends BaseDAOIml<TestEntity>implements TestDAO{

	public TestDAOIml(DBConnection dbConn) {
		super(dbConn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TestEntity findOne(Integer id) {
		String sql = "SELECT * FROM tbl_testquestion WHERE testps_id = ?";
		List<TestEntity> result = Query(sql,new TestMapper(), id);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public Integer save(TestEntity testDetail) {
		StringBuilder sql = new StringBuilder("insert into tbl_testquestion(question,option1,");
		sql.append(" option2,option3,option4,optioncorrect,optionuselect,test_id values(?,?,?,?,?,?,?,?)");
		
		return Insert(sql.toString(),testDetail.getQuestion(),testDetail.getOption1(),testDetail.getOption2(),testDetail.getOption3(),testDetail.getOption4(),testDetail.getOptioncorrect(),testDetail.getOptionuselect(),testDetail.getTest_id());
	}

	@Override
	public void update(TestEntity testDetail) {
		StringBuilder sql = new StringBuilder("UPDATE tbl_testquestion SET question=?,option1=?,");
		sql.append(" option2=?,option3=?,option4=?,optioncorrect=?,optionuselect=?,test_id=? where testps_id=?");
		
		 Update(sql.toString(),testDetail.getQuestion(),testDetail.getOption1(),testDetail.getOption2(),testDetail.getOption3(),testDetail.getOption4(),testDetail.getOptioncorrect(),testDetail.getOptionuselect(),testDetail.getTest_id(),testDetail.getTestps_id());
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM tbl_testquestion WHERE testps_id = ?";
		Delete(sql, id);
	}

}
