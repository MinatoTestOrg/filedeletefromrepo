package com.minatoorgtestcase.filedeletefromrepo.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatoorgtestcase.filedeletefromrepo.base.service.FileDeleteFromRepoTable1BaseService;
import com.minatoorgtestcase.filedeletefromrepo.model.FileDeleteFromRepoTable1;
import com.minatoorgtestcase.filedeletefromrepo.service.FileDeleteFromRepoTable1PerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("FileDeleteFromRepoTable1")
public class FileDeleteFromRepoTable1Service extends FileDeleteFromRepoTable1BaseService<FileDeleteFromRepoTable1> implements IFileDeleteFromRepoTable1Service<FileDeleteFromRepoTable1>{

		@Autowired
		private  FileDeleteFromRepoTable1PerimeterImpl  filedeletefromrepotable1PerimeterImpl;

		public FileDeleteFromRepoTable1Service(ChangelogService changelogService) {
		super(FileDeleteFromRepoTable1.class);	
		setChangelogService(changelogService); 
		
	}
	
	
	protected IPerimeterManager<FileDeleteFromRepoTable1> getPerimeterManager() {
		return filedeletefromrepotable1PerimeterImpl;
	}
	
	protected boolean resolveCondition(T model, ComplexCondition when) {
		return true;
	}
}