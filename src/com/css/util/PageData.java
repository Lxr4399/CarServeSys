package com.css.util;


import java.util.List;

/**
 * 分页数据类
 * @param <t>
 */
public class PageData<t> {
	private List<t> data; // 查找的数据

	private Integer total; // 总数

	private Integer pageSize;// 每页几行

	private Integer page;// 页数
    
	private Integer totalPage;
	public PageData() {
		super();
	}

	public PageData(List<t> data, Integer total, Integer pageSize, Integer page) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.page = page;
	}

	public List<t> getData() {
		return data;
	}

	public void setData(List<t> data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public int getTotalPage() {
		int num = total / pageSize;
		if (num % pageSize != 0)
			num++;
		return num;
	}

	@Override
	public String toString() {
		return "{total:" + total + ",data:" + data + "}";
	}
}
