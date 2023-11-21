package com.minatoorgtestcase.filedeletefromrepo.base.model;
import com.vs.rappit.base.model.BaseModel;
import com.vs.rappit.base.annotations.Table;
import com.vs.rappit.base.annotations.Searchable;


@Table(name="FileDeleteFromRepoTable1Master", keys={"sid"})
public class FileDeleteFromRepoTable1MasterBase extends BaseModel {

	@Searchable(index = true)
	private String filedeletefromrepotable1field1;

	public void setFiledeletefromrepotable1field1(String filedeletefromrepotable1field1) {
		this.filedeletefromrepotable1field1 = filedeletefromrepotable1field1;
	}

	public String getFiledeletefromrepotable1field1() {
		return filedeletefromrepotable1field1;
	}



}