package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();

	public PageResult findPage(int pageNum,int pageSize);

	/**
	 * 增加
	 */
	public void add(TbBrand brand);

	/**
	 * 更新
	 * @param brand
	 */
	public void update(TbBrand brand);

	/**
	 * 根据id查
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);

	/**
	 * 删除
	 */
	public void delete(Long [] ids);

	public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
	/**
	 * 返回下拉列表数据
	 * @return
	 */
	public List<Map> selectOptionList();

}
