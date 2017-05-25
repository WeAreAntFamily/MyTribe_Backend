package com.mytribe.db.mapper.strategy;

import com.mytribe.db.entity.strategy.PlayerArmyEntity;
import com.mytribe.db.entity.strategy.PlayerArmyEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayerArmyEntityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int countByExample(PlayerArmyEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int deleteByExample(PlayerArmyEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int insert(PlayerArmyEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int insertSelective(PlayerArmyEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	List<PlayerArmyEntity> selectByExample(PlayerArmyEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	PlayerArmyEntity selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") PlayerArmyEntity record, @Param("example") PlayerArmyEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") PlayerArmyEntity record, @Param("example") PlayerArmyEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PlayerArmyEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_playerarmy
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PlayerArmyEntity record);
}