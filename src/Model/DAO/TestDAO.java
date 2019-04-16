package Model.DAO;

import Entity.MemberEntity;
import Entity.TestEntity;

public interface TestDAO extends BaseDAO<TestEntity>{
	TestEntity findOne(Integer id);
	//List<KanjiTopic> findByCategoryId(Long categoryId);
	Integer save(TestEntity testDetail);
	void update(TestEntity testDetail);
	void delete(Integer id);
	//List<KanjiTopic> findAll(Pageble pageble);
	//int getTotalItem();
}
