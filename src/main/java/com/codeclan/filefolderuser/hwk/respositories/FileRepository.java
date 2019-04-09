package com.codeclan.filefolderuser.hwk.respositories;

import com.codeclan.filefolderuser.hwk.models.File;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
