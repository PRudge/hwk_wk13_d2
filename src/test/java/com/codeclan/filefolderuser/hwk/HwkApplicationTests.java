package com.codeclan.filefolderuser.hwk;

import com.codeclan.filefolderuser.hwk.respositories.FileRepository;
import com.codeclan.filefolderuser.hwk.respositories.FolderRepository;
import com.codeclan.filefolderuser.hwk.respositories.UserRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwkApplicationTests {


	@Autowired
	UserRespository userRespository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

}
