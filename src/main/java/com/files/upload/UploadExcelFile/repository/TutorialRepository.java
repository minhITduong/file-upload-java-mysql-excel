package com.files.upload.UploadExcelFile.repository;

import com.files.upload.UploadExcelFile.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
