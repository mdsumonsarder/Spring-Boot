package com.example.UploadFileandDownloadFile.repository;

import com.example.UploadFileandDownloadFile.model.Doc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DocRepository extends JpaRepository<Doc,Integer> {

}
