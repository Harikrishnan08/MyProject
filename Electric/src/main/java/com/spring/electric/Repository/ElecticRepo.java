package com.spring.electric.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.electric.model.Electric;

import jakarta.transaction.Transactional;

public interface ElecticRepo extends JpaRepository<Electric, Integer> {
	
	@Query(value="select* from question",nativeQuery=true)
	public List<Electric> get();
	@Query(value="select * from question where qno = ?1", nativeQuery = true)

	public List<Electric> getD(@Param("qno") int qno);

	

	@Modifying

	@Transactional

	@Query(value="update question set qno =:qno where qname =:qname",nativeQuery=true)

	public void  update(@Param("qno") int qno,@Param("qname") String qname);
	
	@Modifying

	@Transactional

	@Query(value="delete from question where  qno =:qno where qname =:qname",nativeQuery=true)

	public void  deleteById(@Param("qno") int qno,@Param("qname") String qname);
	@Query(value="select c from question c where qno =?1",nativeQuery = false)
	public List<Electric> getDetails(@Param("qno") int qno);
	
	@Query(value="select q from question q where  qname like '%i'",nativeQuery = false)
	public List<Electric> getH();
	
	@Query(value="select q from question q where  qno between ?1 and ?2",nativeQuery=false)
	public List<Electric> getRange(@Param("qno") int qno,@Param("qno")int qid);

}



