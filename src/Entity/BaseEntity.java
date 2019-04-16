package Entity;

import java.util.ArrayList;
import java.util.List;

public class BaseEntity <T>{
private List<T> resultList= new ArrayList<>();

public List<T> getResultList() {
	return resultList;
}

public void setResultList(List<T> resultList) {
	this.resultList = resultList;
}

}
