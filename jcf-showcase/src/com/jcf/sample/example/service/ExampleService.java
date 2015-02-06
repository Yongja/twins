package com.jcf.sample.example.service;

import java.util.List;

import jcf.upload.FileInfo;

import com.jcf.sample.example.model.AttachFiles;
import com.jcf.sample.example.model.Example;
import com.jcf.system.util.Root;

public interface ExampleService {

	List<Example> getExampleList();

	Example getExample(String applyId);

	int saveExample(Example example, AttachFiles file);

	FileInfo getFileInfo(String fileName);

	List<Example> getEmpList();
	
	List<Example> getWebService();
}
