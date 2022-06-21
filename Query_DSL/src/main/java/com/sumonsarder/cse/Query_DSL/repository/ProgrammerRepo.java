package com.sumonsarder.cse.Query_DSL.repository;

import com.sumonsarder.cse.Query_DSL.model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {

    //Method= findBy+VariableName;
    List<Programmer> findBypLang(String pLang);

    //Custom SQL;
    //select * from programmer where pName= ;
    @Query(value ="select p from Programmer p where p.pName IN :names")
    List<Programmer> findP(@Param("names")Collection<String> names);

   /* @Query("from Programmer where pName= ?1 and pLang=?2")
    List<Programmer> findP(String pName, String pLang);*/

    /*@Query("from Programmer where pName= ?1 and pLang=?2")
    List<Programmer> findP(String pName, String pLang);*/


}
