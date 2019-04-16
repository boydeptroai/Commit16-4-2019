package Model.DAO;

import Entity.FlashCardEntity;
import Entity.MemberEntity;

public interface FlashCardDAO extends BaseDAO<FlashCardEntity>{
	FlashCardEntity findOne(Integer id);
	//List<KanjiTopic> findByCategoryId(Long categoryId);
	Integer save(FlashCardEntity flCardDetail);
	void update(FlashCardEntity flCardDetail);
	void delete(Integer id);
	//List<KanjiTopic> findAll(Pageble pageble);
	//int getTotalItem();
}
