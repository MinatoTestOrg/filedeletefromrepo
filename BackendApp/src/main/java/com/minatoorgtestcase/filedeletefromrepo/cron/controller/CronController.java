package com.minatoorgtestcase.filedeletefromrepo.cron.controller;

import com.minatoorgtestcase.filedeletefromrepo.base.controller.CronBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping(path = "/rest/cronservices/", produces = "application/json")
public class CronController extends CronBaseController{	
}

