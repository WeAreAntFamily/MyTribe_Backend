package com.mytribe.db.mapper.strategy;

import com.mytribe.db.entity.strategy.PlayerBuildingEntity;
import com.mytribe.db.entity.strategy.PlayerBuildingEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayerBuildingEntityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int countByExample(PlayerBuildingEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int deleteByExample(PlayerBuildingEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int insert(PlayerBuildingEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int insertSelective(PlayerBuildingEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	List<PlayerBuildingEntity> selectByExample(PlayerBuildingEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	PlayerBuildingEntity selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") PlayerBuildingEntity record, @Param("example") PlayerBuildingEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") PlayerBuildingEntity record, @Param("example") PlayerBuildingEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PlayerBuildingEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_building
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PlayerBuildingEntity record);
}