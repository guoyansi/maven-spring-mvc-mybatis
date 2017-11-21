package com.gys.sm.fun.demo.result;

import java.util.List;

import com.gys.sm.fun.demo.bean.Student;
import com.gys.sm.item.bean.BaseResult;

public class List3Result extends BaseResult{
	private List<Student> list;

	
	
	public List3Result(int status, String msg) {
		super(status, msg);
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
}
