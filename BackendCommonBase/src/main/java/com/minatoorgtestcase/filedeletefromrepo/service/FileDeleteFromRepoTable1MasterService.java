package com.minatoorgtestcase.filedeletefromrepo.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatoorgtestcase.filedeletefromrepo.base.service.FileDeleteFromRepoTable1MasterBaseService;
import com.minatoorgtestcase.filedeletefromrepo.model.FileDeleteFromRepoTable1Master;
import com.minatoorgtestcase.filedeletefromrepo.service.FileDeleteFromRepoTable1MasterPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("FileDeleteFromRepoTable1Master")
public class FileDeleteFromRepoTable1MasterService extends FileDeleteFromRepoTable1MasterBaseService<FileDeleteFromRepoTable1Master> implements IFileDeleteFromRepoTable1MasterService<FileDeleteFromRepoTable1Master>{

		@Autowired
		private  FileDeleteFromRepoTable1MasterPerimeterImpl  filedeletefromrepotable1masterPerimeterImpl;

		public FileDeleteFromRepoTable1MasterService(ChangelogService changelogService) {
		super(FileDeleteFromRepoTable1Master.class);	
		setChangelogService(changelogService); 
		
	}
	
	
	protected IPerimeterManager<FileDeleteFromRepoTable1Master> getPerimeterManager() {
		return filedeletefromrepotable1masterPerimeterImpl;
	}
	
	protected boolean resolveCondition(T model, ComplexCondition when) {
		return true;
	}
}