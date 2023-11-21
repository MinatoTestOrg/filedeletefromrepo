package com.minatoorgtestcase.filedeletefromrepo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatoorgtestcase.filedeletefromrepo.base.controller.FileDeleteFromRepoTable1MasterBaseController;
import com.minatoorgtestcase.filedeletefromrepo.service.IFileDeleteFromRepoTable1MasterService;
import com.minatoorgtestcase.filedeletefromrepo.service.FileDeleteFromRepoTable1MasterService;
import com.minatoorgtestcase.filedeletefromrepo.model.FileDeleteFromRepoTable1Master;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/filedeletefromrepotable1masters/", produces = "application/json")
public class FileDeleteFromRepoTable1MasterController extends FileDeleteFromRepoTable1MasterBaseController<IFileDeleteFromRepoTable1MasterService<FileDeleteFromRepoTable1Master>, FileDeleteFromRepoTable1Master> {
	private static final Logger LOGGER = LoggerFactory.getLogger(FileDeleteFromRepoTable1MasterController.class.getName());
	public FileDeleteFromRepoTable1MasterController(FileDeleteFromRepoTable1MasterService filedeletefromrepotable1masterService) {
		super(filedeletefromrepotable1masterService);
	}
}
