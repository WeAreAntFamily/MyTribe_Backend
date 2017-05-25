package com.mytribe.db.mapper.strategy;

import com.mytribe.db.entity.strategy.EquipForgeTemplate;
import com.mytribe.db.entity.strategy.EquipForgeTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipForgeTemplateMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	int countByExample(EquipForgeTemplateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	int deleteByExample(EquipForgeTemplateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	int insert(EquipForgeTemplate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	int insertSelective(EquipForgeTemplate record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	List<EquipForgeTemplate> selectByExample(EquipForgeTemplateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") EquipForgeTemplate record, @Param("example") EquipForgeTemplateExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_equipforge
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") EquipForgeTemplate record, @Param("example") EquipForgeTemplateExample example);
}