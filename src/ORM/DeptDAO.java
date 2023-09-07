package ORM;

import java.util.List;

public interface DeptDAO {
	
	//有可能資料庫欄位是空值null，包裝類別為參考變數，故可以作為null參考變數
	void save(Dept dept);
	void update(Dept dept);
	void delete(Integer deptno);
	
	Dept findByDeptno(Integer deptno);
	List<Dept>getAll();
}
