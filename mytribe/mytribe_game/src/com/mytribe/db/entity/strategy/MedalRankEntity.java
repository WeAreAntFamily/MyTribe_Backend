package com.mytribe.db.entity.strategy;

public class MedalRankEntity {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mt_u_medalrank.RankID
	 * @mbggenerated
	 */
	private Integer rankid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mt_u_medalrank.PlayerID
	 * @mbggenerated
	 */
	private String playerid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mt_u_medalrank.NickName
	 * @mbggenerated
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mt_u_medalrank.MedalNum
	 * @mbggenerated
	 */
	private Integer medalnum;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mt_u_medalrank.RankID
	 * @return  the value of mt_u_medalrank.RankID
	 * @mbggenerated
	 */
	public Integer getRankid() {
		return rankid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mt_u_medalrank.RankID
	 * @param rankid  the value for mt_u_medalrank.RankID
	 * @mbggenerated
	 */
	public void setRankid(Integer rankid) {
		this.rankid = rankid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mt_u_medalrank.PlayerID
	 * @return  the value of mt_u_medalrank.PlayerID
	 * @mbggenerated
	 */
	public String getPlayerid() {
		return playerid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mt_u_medalrank.PlayerID
	 * @param playerid  the value for mt_u_medalrank.PlayerID
	 * @mbggenerated
	 */
	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mt_u_medalrank.NickName
	 * @return  the value of mt_u_medalrank.NickName
	 * @mbggenerated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mt_u_medalrank.NickName
	 * @param nickname  the value for mt_u_medalrank.NickName
	 * @mbggenerated
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mt_u_medalrank.MedalNum
	 * @return  the value of mt_u_medalrank.MedalNum
	 * @mbggenerated
	 */
	public Integer getMedalnum() {
		return medalnum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mt_u_medalrank.MedalNum
	 * @param medalnum  the value for mt_u_medalrank.MedalNum
	 * @mbggenerated
	 */
	public void setMedalnum(Integer medalnum) {
		this.medalnum = medalnum;
	}
}