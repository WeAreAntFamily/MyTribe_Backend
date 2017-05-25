package com.mytribe.db.mapper.strategy;

import com.mytribe.db.entity.strategy.PlayerSoldierGradeEntity;
import com.mytribe.db.entity.strategy.PlayerSoldierGradeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayerSoldierGradeEntityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int countByExample(PlayerSoldierGradeEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int deleteByExample(PlayerSoldierGradeEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int insert(PlayerSoldierGradeEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int insertSelective(PlayerSoldierGradeEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	List<PlayerSoldierGradeEntity> selectByExample(PlayerSoldierGradeEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	PlayerSoldierGradeEntity selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") PlayerSoldierGradeEntity record, @Param("example") PlayerSoldierGradeEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") PlayerSoldierGradeEntity record, @Param("example") PlayerSoldierGradeEntityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PlayerSoldierGradeEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_soldiergrade
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PlayerSoldierGradeEntity record);
}