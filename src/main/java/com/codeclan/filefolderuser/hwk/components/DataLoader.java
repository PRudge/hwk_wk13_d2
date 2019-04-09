package com.codeclan.filefolderuser.hwk.components;


import com.codeclan.filefolderuser.hwk.respositories.FileRepository;
import com.codeclan.filefolderuser.hwk.respositories.FolderRepository;
import com.codeclan.filefolderuser.hwk.respositories.UserRespository;

import com.codeclan.filefolderuser.hwk.models.User;
import com.codeclan.filefolderuser.hwk.models.Folder;
import com.codeclan.filefolderuser.hwk.models.File;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component



public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRespository userRespository;

   @Autowired
    FolderRepository folderRepository;

   @Autowired
   FileRepository fileRepository;

    public void run(ApplicationArguments args) {


        User user = new User("Pauline");
        userRespository.save(user);

        User user2 = new User("Daniel");
        userRespository.save(user2);

        Folder folder1 = new Folder("Holidays", user2);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Money", user);
        folderRepository.save(folder2);

        File file1 = new File("Camino", "txt", 50, folder1);
        fileRepository.save(file1);

        File file2 = new File("Weekly Outgoings", "txt", 130, folder2);
        fileRepository.save(file2);

    }
}

