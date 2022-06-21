package com.sumonsarder.cse.CRUD_Operation.repositroy;

import com.sumonsarder.cse.CRUD_Operation.model.Programmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer, Integer> {

}
