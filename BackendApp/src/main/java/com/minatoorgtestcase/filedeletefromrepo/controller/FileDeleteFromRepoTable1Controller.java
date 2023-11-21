package com.minatoorgtestcase.filedeletefromrepo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatoorgtestcase.filedeletefromrepo.base.controller.FileDeleteFromRepoTable1BaseController;
import com.minatoorgtestcase.filedeletefromrepo.service.IFileDeleteFromRepoTable1Service;
import com.minatoorgtestcase.filedeletefromrepo.service.FileDeleteFromRepoTable1Service;
import com.minatoorgtestcase.filedeletefromrepo.model.FileDeleteFromRepoTable1;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/filedeletefromrepotable1s/", produces = "application/json")
public class FileDeleteFromRepoTable1Controller extends FileDeleteFromRepoTable1BaseController<IFileDeleteFromRepoTable1Service<FileDeleteFromRepoTable1>, FileDeleteFromRepoTable1> {
	private static final Logger LOGGER = LoggerFactory.getLogger(FileDeleteFromRepoTable1Controller.class.getName());
	public FileDeleteFromRepoTable1Controller(FileDeleteFromRepoTable1Service filedeletefromrepotable1Service) {
		super(filedeletefromrepotable1Service);
	}
}
