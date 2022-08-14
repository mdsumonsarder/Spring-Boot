package com.example.UploadFileandDownloadFile.service;

import com.example.UploadFileandDownloadFile.model.Doc;
import com.example.UploadFileandDownloadFile.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class DocStorageService {


    private final DocRepository docRepository;

     @Autowired
    public DocStorageService(DocRepository docRepository) {
        this.docRepository = docRepository;
    }

    public Doc saveFile(MultipartFile file){

         String docName = file.getOriginalFilename();
        try {
            Doc doc = new Doc(docName,file.getContentType(),file.getBytes());
            return docRepository.save(doc);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Optional<Doc> getFile(Integer fileId) {
        return docRepository.findById(fileId);
    }

    public List<Doc> getFiles(){
        return docRepository.findAll();
    }

}
