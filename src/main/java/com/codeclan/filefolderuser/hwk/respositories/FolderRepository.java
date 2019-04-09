package com.codeclan.filefolderuser.hwk.respositories;

import com.codeclan.filefolderuser.hwk.models.Folder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
