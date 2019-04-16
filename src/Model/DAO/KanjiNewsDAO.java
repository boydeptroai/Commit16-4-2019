package Model.DAO;

import Entity.KanjiWordNewsEntity;
import Entity.MemberEntity;

public interface KanjiNewsDAO extends BaseDAO<KanjiWordNewsEntity>{
	KanjiWordNewsEntity findOne(Integer id);
	//List<KanjiTopic> findByCategoryId(Long categoryId);
	Integer save(KanjiWordNewsEntity wordDetail);
	void update(KanjiWordNewsEntity wordDetail);
	void delete(Integer id);
	//List<KanjiTopic> findAll(Pageble pageble);
	//int getTotalItem();

}
