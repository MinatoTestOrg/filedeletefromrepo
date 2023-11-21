package com.minatoorgtestcase.filedeletefromrepo.base.controller;

import org.apache.commons.lang3.StringUtils;

import com.vs.rappit.base.rest.APIConstants;
import com.vs.rappit.base.dal.providers.PersistenceType;
import com.vs.rappit.jersey.base.webservice.BaseWebService;
import com.minatoorgtestcase.filedeletefromrepo.base.service.IFileDeleteFromRepoTable1MasterBaseService;
import com.minatoorgtestcase.filedeletefromrepo.base.model.FileDeleteFromRepoTable1MasterBase;
import java.util.Date;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.vs.rappit.base.util.FieldUtils;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.vs.rappit.base.model.Primary;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PostMapping;

import com.vs.rappit.base.model.PaginationRequest;

import com.vs.rappit.jersey.webservice.mapper.DatatableJson;

import com.vs.rappit.base.model.PaginationResponse;

import java.util.ArrayList;

import com.vs.rappit.base.dal.Filter;

import org.springframework.util.MultiValueMap;

import java.util.Map;

public abstract class FileDeleteFromRepoTable1MasterBaseController<SERVICE extends IFileDeleteFromRepoTable1MasterBaseService<M>, M extends FileDeleteFromRepoTable1MasterBase>
		extends BaseWebService<SERVICE, M> {
	
	
	public FileDeleteFromRepoTable1MasterBaseController(SERVICE logic) {
		super(logic);
	}
	
	
	@PreAuthorize("hasAccess('/filedeletefromrepotable1masters/{ids}')")
	@DeleteMapping("/{ids}")
	public ResponseEntity deleteRecords(@PathVariable("ids") String ids) {
		boolean isDeleted = super.delete(ids);
		if (isDeleted)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}


	@PreAuthorize("hasAccess('/filedeletefromrepotable1masters/autosuggest')")
	@GetMapping(path = "/autosuggest", produces = "application/json")
	public List<Object> autoSuggestService(@RequestParam MultiValueMap<String, Object> queryParams) 
	{
		Map<String, Object> params = queryParams.toSingleValueMap();
		List<Filter> filters = new ArrayList<>();
		return super.autosuggest(filters, params);
	}


	@PreAuthorize("hasAccess('/filedeletefromrepotable1masters/{sid}')")
	@GetMapping(path = "/{sid}", produces = "application/json")
	public M getById(@PathVariable("sid") Primary sid) {
		M model = super.getById(sid);
		if (model == null) {
			RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
			if (requestAttributes instanceof ServletRequestAttributes) {
				HttpServletResponse response = ((ServletRequestAttributes) requestAttributes).getResponse();
				if (response != null) {
					response.setStatus(HttpServletResponse.SC_NO_CONTENT);
				}
			}
		}
		return model;
	}


	@PreAuthorize("hasAccess('/filedeletefromrepotable1masters/')")
	@PutMapping
	public M update(@RequestBody M modelObj) {
		return super.update(modelObj);
	}



	@PreAuthorize("hasAccess('/filedeletefromrepotable1masters/')")
	@PostMapping
	public M create(@RequestBody M modelObj) {
		return super.save(modelObj);
	}


	@PreAuthorize("hasAccess('/filedeletefromrepotable1masters/datatable')")
	@PostMapping("/datatable")
	public PaginationResponse getDatatableData(@RequestBody DatatableJson datatableJson)
	{
		PaginationRequest dataTable = convertToPaginationRequest(datatableJson);
	 	return logic.getAllByPage(PersistenceType.SEARCH, dataTable);
	}
	



	
}
