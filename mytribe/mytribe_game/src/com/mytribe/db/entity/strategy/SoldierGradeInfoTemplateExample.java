package com.mytribe.db.entity.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SoldierGradeInfoTemplateExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public SoldierGradeInfoTemplateExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_soldiergradeinfo
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mt_s_soldiergradeinfo
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

		public Criteria andSoldiertypeidIsNull() {
			addCriterion("SoldierTypeID is null");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidIsNotNull() {
			addCriterion("SoldierTypeID is not null");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidEqualTo(Integer value) {
			addCriterion("SoldierTypeID =", value, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidNotEqualTo(Integer value) {
			addCriterion("SoldierTypeID <>", value, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidGreaterThan(Integer value) {
			addCriterion("SoldierTypeID >", value, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("SoldierTypeID >=", value, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidLessThan(Integer value) {
			addCriterion("SoldierTypeID <", value, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidLessThanOrEqualTo(Integer value) {
			addCriterion("SoldierTypeID <=", value, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidIn(List<Integer> values) {
			addCriterion("SoldierTypeID in", values, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidNotIn(List<Integer> values) {
			addCriterion("SoldierTypeID not in", values, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidBetween(Integer value1, Integer value2) {
			addCriterion("SoldierTypeID between", value1, value2, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andSoldiertypeidNotBetween(Integer value1, Integer value2) {
			addCriterion("SoldierTypeID not between", value1, value2, "soldiertypeid");
			return (Criteria) this;
		}

		public Criteria andGradeIsNull() {
			addCriterion("Grade is null");
			return (Criteria) this;
		}

		public Criteria andGradeIsNotNull() {
			addCriterion("Grade is not null");
			return (Criteria) this;
		}

		public Criteria andGradeEqualTo(Integer value) {
			addCriterion("Grade =", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotEqualTo(Integer value) {
			addCriterion("Grade <>", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThan(Integer value) {
			addCriterion("Grade >", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
			addCriterion("Grade >=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThan(Integer value) {
			addCriterion("Grade <", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThanOrEqualTo(Integer value) {
			addCriterion("Grade <=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeIn(List<Integer> values) {
			addCriterion("Grade in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotIn(List<Integer> values) {
			addCriterion("Grade not in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeBetween(Integer value1, Integer value2) {
			addCriterion("Grade between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotBetween(Integer value1, Integer value2) {
			addCriterion("Grade not between", value1, value2, "grade");
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

		public Criteria andBloodIsNull() {
			addCriterion("Blood is null");
			return (Criteria) this;
		}

		public Criteria andBloodIsNotNull() {
			addCriterion("Blood is not null");
			return (Criteria) this;
		}

		public Criteria andBloodEqualTo(Integer value) {
			addCriterion("Blood =", value, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodNotEqualTo(Integer value) {
			addCriterion("Blood <>", value, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodGreaterThan(Integer value) {
			addCriterion("Blood >", value, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodGreaterThanOrEqualTo(Integer value) {
			addCriterion("Blood >=", value, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodLessThan(Integer value) {
			addCriterion("Blood <", value, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodLessThanOrEqualTo(Integer value) {
			addCriterion("Blood <=", value, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodIn(List<Integer> values) {
			addCriterion("Blood in", values, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodNotIn(List<Integer> values) {
			addCriterion("Blood not in", values, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodBetween(Integer value1, Integer value2) {
			addCriterion("Blood between", value1, value2, "blood");
			return (Criteria) this;
		}

		public Criteria andBloodNotBetween(Integer value1, Integer value2) {
			addCriterion("Blood not between", value1, value2, "blood");
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

		public Criteria andUpgradecoincostIsNull() {
			addCriterion("UpgradeCoinCost is null");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostIsNotNull() {
			addCriterion("UpgradeCoinCost is not null");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostEqualTo(Integer value) {
			addCriterion("UpgradeCoinCost =", value, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostNotEqualTo(Integer value) {
			addCriterion("UpgradeCoinCost <>", value, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostGreaterThan(Integer value) {
			addCriterion("UpgradeCoinCost >", value, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostGreaterThanOrEqualTo(Integer value) {
			addCriterion("UpgradeCoinCost >=", value, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostLessThan(Integer value) {
			addCriterion("UpgradeCoinCost <", value, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostLessThanOrEqualTo(Integer value) {
			addCriterion("UpgradeCoinCost <=", value, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostIn(List<Integer> values) {
			addCriterion("UpgradeCoinCost in", values, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostNotIn(List<Integer> values) {
			addCriterion("UpgradeCoinCost not in", values, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostBetween(Integer value1, Integer value2) {
			addCriterion("UpgradeCoinCost between", value1, value2, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradecoincostNotBetween(Integer value1, Integer value2) {
			addCriterion("UpgradeCoinCost not between", value1, value2, "upgradecoincost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostIsNull() {
			addCriterion("UpgradeTimeCost is null");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostIsNotNull() {
			addCriterion("UpgradeTimeCost is not null");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostEqualTo(Integer value) {
			addCriterion("UpgradeTimeCost =", value, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostNotEqualTo(Integer value) {
			addCriterion("UpgradeTimeCost <>", value, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostGreaterThan(Integer value) {
			addCriterion("UpgradeTimeCost >", value, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostGreaterThanOrEqualTo(Integer value) {
			addCriterion("UpgradeTimeCost >=", value, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostLessThan(Integer value) {
			addCriterion("UpgradeTimeCost <", value, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostLessThanOrEqualTo(Integer value) {
			addCriterion("UpgradeTimeCost <=", value, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostIn(List<Integer> values) {
			addCriterion("UpgradeTimeCost in", values, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostNotIn(List<Integer> values) {
			addCriterion("UpgradeTimeCost not in", values, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostBetween(Integer value1, Integer value2) {
			addCriterion("UpgradeTimeCost between", value1, value2, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andUpgradetimecostNotBetween(Integer value1, Integer value2) {
			addCriterion("UpgradeTimeCost not between", value1, value2, "upgradetimecost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostIsNull() {
			addCriterion("ProduceCoinCost is null");
			return (Criteria) this;
		}

		public Criteria andProducecoincostIsNotNull() {
			addCriterion("ProduceCoinCost is not null");
			return (Criteria) this;
		}

		public Criteria andProducecoincostEqualTo(Integer value) {
			addCriterion("ProduceCoinCost =", value, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostNotEqualTo(Integer value) {
			addCriterion("ProduceCoinCost <>", value, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostGreaterThan(Integer value) {
			addCriterion("ProduceCoinCost >", value, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostGreaterThanOrEqualTo(Integer value) {
			addCriterion("ProduceCoinCost >=", value, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostLessThan(Integer value) {
			addCriterion("ProduceCoinCost <", value, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostLessThanOrEqualTo(Integer value) {
			addCriterion("ProduceCoinCost <=", value, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostIn(List<Integer> values) {
			addCriterion("ProduceCoinCost in", values, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostNotIn(List<Integer> values) {
			addCriterion("ProduceCoinCost not in", values, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostBetween(Integer value1, Integer value2) {
			addCriterion("ProduceCoinCost between", value1, value2, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducecoincostNotBetween(Integer value1, Integer value2) {
			addCriterion("ProduceCoinCost not between", value1, value2, "producecoincost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostIsNull() {
			addCriterion("ProduceTimeCost is null");
			return (Criteria) this;
		}

		public Criteria andProducetimecostIsNotNull() {
			addCriterion("ProduceTimeCost is not null");
			return (Criteria) this;
		}

		public Criteria andProducetimecostEqualTo(Integer value) {
			addCriterion("ProduceTimeCost =", value, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostNotEqualTo(Integer value) {
			addCriterion("ProduceTimeCost <>", value, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostGreaterThan(Integer value) {
			addCriterion("ProduceTimeCost >", value, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostGreaterThanOrEqualTo(Integer value) {
			addCriterion("ProduceTimeCost >=", value, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostLessThan(Integer value) {
			addCriterion("ProduceTimeCost <", value, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostLessThanOrEqualTo(Integer value) {
			addCriterion("ProduceTimeCost <=", value, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostIn(List<Integer> values) {
			addCriterion("ProduceTimeCost in", values, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostNotIn(List<Integer> values) {
			addCriterion("ProduceTimeCost not in", values, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostBetween(Integer value1, Integer value2) {
			addCriterion("ProduceTimeCost between", value1, value2, "producetimecost");
			return (Criteria) this;
		}

		public Criteria andProducetimecostNotBetween(Integer value1, Integer value2) {
			addCriterion("ProduceTimeCost not between", value1, value2, "producetimecost");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mt_s_soldiergradeinfo
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
     * This class corresponds to the database table mt_s_soldiergradeinfo
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}