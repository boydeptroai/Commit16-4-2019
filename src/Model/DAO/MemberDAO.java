package Model.DAO;

import Entity.KanjiTopic;
import Entity.MemberEntity;

public interface MemberDAO extends BaseDAO<MemberEntity>{
	MemberEntity findOne(Integer id);
	//List<KanjiTopic> findByCategoryId(Long categoryId);
	Integer save(MemberEntity memDetail);
	void update(MemberEntity memDetail);
	void delete(Integer id);
	//List<KanjiTopic> findAll(Pageble pageble);
	//int getTotalItem();

}
