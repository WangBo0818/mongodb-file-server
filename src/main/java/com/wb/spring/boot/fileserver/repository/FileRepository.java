package com.wb.spring.boot.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wb.spring.boot.fileserver.domain.File;
 

/**
 * File 存储库.
 */
public interface FileRepository extends MongoRepository<File, String> {
}
