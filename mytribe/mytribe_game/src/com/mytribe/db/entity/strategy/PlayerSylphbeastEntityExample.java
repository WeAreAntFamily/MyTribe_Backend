package com.mytribe.db.entity.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlayerSylphbeastEntityExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public PlayerSylphbeastEntityExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andPlayeridIsNull() {
			addCriterion("PlayerID is null");
			return (Criteria) this;
		}

		public Criteria andPlayeridIsNotNull() {
			addCriterion("PlayerID is not null");
			return (Criteria) this;
		}

		public Criteria andPlayeridEqualTo(Integer value) {
			addCriterion("PlayerID =", value, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridNotEqualTo(Integer value) {
			addCriterion("PlayerID <>", value, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridGreaterThan(Integer value) {
			addCriterion("PlayerID >", value, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridGreaterThanOrEqualTo(Integer value) {
			addCriterion("PlayerID >=", value, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridLessThan(Integer value) {
			addCriterion("PlayerID <", value, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridLessThanOrEqualTo(Integer value) {
			addCriterion("PlayerID <=", value, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridIn(List<Integer> values) {
			addCriterion("PlayerID in", values, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridNotIn(List<Integer> values) {
			addCriterion("PlayerID not in", values, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridBetween(Integer value1, Integer value2) {
			addCriterion("PlayerID between", value1, value2, "playerid");
			return (Criteria) this;
		}

		public Criteria andPlayeridNotBetween(Integer value1, Integer value2) {
			addCriterion("PlayerID not between", value1, value2, "playerid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidIsNull() {
			addCriterion("SylphBeastID is null");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidIsNotNull() {
			addCriterion("SylphBeastID is not null");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidEqualTo(Integer value) {
			addCriterion("SylphBeastID =", value, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidNotEqualTo(Integer value) {
			addCriterion("SylphBeastID <>", value, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidGreaterThan(Integer value) {
			addCriterion("SylphBeastID >", value, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidGreaterThanOrEqualTo(Integer value) {
			addCriterion("SylphBeastID >=", value, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidLessThan(Integer value) {
			addCriterion("SylphBeastID <", value, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidLessThanOrEqualTo(Integer value) {
			addCriterion("SylphBeastID <=", value, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidIn(List<Integer> values) {
			addCriterion("SylphBeastID in", values, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidNotIn(List<Integer> values) {
			addCriterion("SylphBeastID not in", values, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidBetween(Integer value1, Integer value2) {
			addCriterion("SylphBeastID between", value1, value2, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSylphbeastidNotBetween(Integer value1, Integer value2) {
			addCriterion("SylphBeastID not between", value1, value2, "sylphbeastid");
			return (Criteria) this;
		}

		public Criteria andSkillidIsNull() {
			addCriterion("SkillID is null");
			return (Criteria) this;
		}

		public Criteria andSkillidIsNotNull() {
			addCriterion("SkillID is not null");
			return (Criteria) this;
		}

		public Criteria andSkillidEqualTo(Integer value) {
			addCriterion("SkillID =", value, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidNotEqualTo(Integer value) {
			addCriterion("SkillID <>", value, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidGreaterThan(Integer value) {
			addCriterion("SkillID >", value, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidGreaterThanOrEqualTo(Integer value) {
			addCriterion("SkillID >=", value, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidLessThan(Integer value) {
			addCriterion("SkillID <", value, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidLessThanOrEqualTo(Integer value) {
			addCriterion("SkillID <=", value, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidIn(List<Integer> values) {
			addCriterion("SkillID in", values, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidNotIn(List<Integer> values) {
			addCriterion("SkillID not in", values, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidBetween(Integer value1, Integer value2) {
			addCriterion("SkillID between", value1, value2, "skillid");
			return (Criteria) this;
		}

		public Criteria andSkillidNotBetween(Integer value1, Integer value2) {
			addCriterion("SkillID not between", value1, value2, "skillid");
			return (Criteria) this;
		}

		public Criteria andAttackspeedIsNull() {
			addCriterion("AttackSpeed is null");
			return (Criteria) this;
		}

		public Criteria andAttackspeedIsNotNull() {
			addCriterion("AttackSpeed is not null");
			return (Criteria) this;
		}

		public Criteria andAttackspeedEqualTo(BigDecimal value) {
			addCriterion("AttackSpeed =", value, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedNotEqualTo(BigDecimal value) {
			addCriterion("AttackSpeed <>", value, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedGreaterThan(BigDecimal value) {
			addCriterion("AttackSpeed >", value, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("AttackSpeed >=", value, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedLessThan(BigDecimal value) {
			addCriterion("AttackSpeed <", value, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedLessThanOrEqualTo(BigDecimal value) {
			addCriterion("AttackSpeed <=", value, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedIn(List<BigDecimal> values) {
			addCriterion("AttackSpeed in", values, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedNotIn(List<BigDecimal> values) {
			addCriterion("AttackSpeed not in", values, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("AttackSpeed between", value1, value2, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackspeedNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("AttackSpeed not between", value1, value2, "attackspeed");
			return (Criteria) this;
		}

		public Criteria andAttackIsNull() {
			addCriterion("Attack is null");
			return (Criteria) this;
		}

		public Criteria andAttackIsNotNull() {
			addCriterion("Attack is not null");
			return (Criteria) this;
		}

		public Criteria andAttackEqualTo(Integer value) {
			addCriterion("Attack =", value, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackNotEqualTo(Integer value) {
			addCriterion("Attack <>", value, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackGreaterThan(Integer value) {
			addCriterion("Attack >", value, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackGreaterThanOrEqualTo(Integer value) {
			addCriterion("Attack >=", value, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackLessThan(Integer value) {
			addCriterion("Attack <", value, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackLessThanOrEqualTo(Integer value) {
			addCriterion("Attack <=", value, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackIn(List<Integer> values) {
			addCriterion("Attack in", values, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackNotIn(List<Integer> values) {
			addCriterion("Attack not in", values, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackBetween(Integer value1, Integer value2) {
			addCriterion("Attack between", value1, value2, "attack");
			return (Criteria) this;
		}

		public Criteria andAttackNotBetween(Integer value1, Integer value2) {
			addCriterion("Attack not between", value1, value2, "attack");
			return (Criteria) this;
		}

		public Criteria andHpIsNull() {
			addCriterion("HP is null");
			return (Criteria) this;
		}

		public Criteria andHpIsNotNull() {
			addCriterion("HP is not null");
			return (Criteria) this;
		}

		public Criteria andHpEqualTo(Integer value) {
			addCriterion("HP =", value, "hp");
			return (Criteria) this;
		}

		public Criteria andHpNotEqualTo(Integer value) {
			addCriterion("HP <>", value, "hp");
			return (Criteria) this;
		}

		public Criteria andHpGreaterThan(Integer value) {
			addCriterion("HP >", value, "hp");
			return (Criteria) this;
		}

		public Criteria andHpGreaterThanOrEqualTo(Integer value) {
			addCriterion("HP >=", value, "hp");
			return (Criteria) this;
		}

		public Criteria andHpLessThan(Integer value) {
			addCriterion("HP <", value, "hp");
			return (Criteria) this;
		}

		public Criteria andHpLessThanOrEqualTo(Integer value) {
			addCriterion("HP <=", value, "hp");
			return (Criteria) this;
		}

		public Criteria andHpIn(List<Integer> values) {
			addCriterion("HP in", values, "hp");
			return (Criteria) this;
		}

		public Criteria andHpNotIn(List<Integer> values) {
			addCriterion("HP not in", values, "hp");
			return (Criteria) this;
		}

		public Criteria andHpBetween(Integer value1, Integer value2) {
			addCriterion("HP between", value1, value2, "hp");
			return (Criteria) this;
		}

		public Criteria andHpNotBetween(Integer value1, Integer value2) {
			addCriterion("HP not between", value1, value2, "hp");
			return (Criteria) this;
		}

		public Criteria andMovespeedIsNull() {
			addCriterion("MoveSpeed is null");
			return (Criteria) this;
		}

		public Criteria andMovespeedIsNotNull() {
			addCriterion("MoveSpeed is not null");
			return (Criteria) this;
		}

		public Criteria andMovespeedEqualTo(Integer value) {
			addCriterion("MoveSpeed =", value, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedNotEqualTo(Integer value) {
			addCriterion("MoveSpeed <>", value, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedGreaterThan(Integer value) {
			addCriterion("MoveSpeed >", value, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedGreaterThanOrEqualTo(Integer value) {
			addCriterion("MoveSpeed >=", value, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedLessThan(Integer value) {
			addCriterion("MoveSpeed <", value, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedLessThanOrEqualTo(Integer value) {
			addCriterion("MoveSpeed <=", value, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedIn(List<Integer> values) {
			addCriterion("MoveSpeed in", values, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedNotIn(List<Integer> values) {
			addCriterion("MoveSpeed not in", values, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedBetween(Integer value1, Integer value2) {
			addCriterion("MoveSpeed between", value1, value2, "movespeed");
			return (Criteria) this;
		}

		public Criteria andMovespeedNotBetween(Integer value1, Integer value2) {
			addCriterion("MoveSpeed not between", value1, value2, "movespeed");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mt_u_player_sylphbeast
	 * @mbggenerated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mt_u_player_sylphbeast
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}