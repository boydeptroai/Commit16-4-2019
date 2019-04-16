package Model.DAO;

import Entity.TestEntity;
import Entity.TestTopicEntity;

public interface TestTopicDAO extends BaseDAO<TestTopicEntity>{
	TestTopicEntity findOne(Integer id);
	//List<KanjiTopic> findByCategoryId(Long categoryId);
	Integer save(TestTopicEntity testTopicDetail);
	void update(TestTopicEntity testTopicDetail);
	void delete(Integer id);
	//List<KanjiTopic> findAll(Pageble pageble);
	//int getTotalItem();
}
