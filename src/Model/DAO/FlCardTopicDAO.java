package Model.DAO;

import Entity.FlCardTopicEntity;
import Entity.MemberEntity;

public interface FlCardTopicDAO extends BaseDAO<FlCardTopicEntity>{
	FlCardTopicEntity findOne(Integer id);
	//List<KanjiTopic> findByCategoryId(Long categoryId);
	Integer save(FlCardTopicEntity FlTopicDetail);
	void update(FlCardTopicEntity FlTopicDetail);
	void delete(Integer id);
	//List<KanjiTopic> findAll(Pageble pageble);
	//int getTotalItem();
}
