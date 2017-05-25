package com.mytribe.db.entity.strategy;

import java.util.ArrayList;
import java.util.List;

public class GradeExpTemplateExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public GradeExpTemplateExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mt_s_grade_exp
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mt_s_grade_exp
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

		public Criteria andNeedexpIsNull() {
			addCriterion("NeedExp is null");
			return (Criteria) this;
		}

		public Criteria andNeedexpIsNotNull() {
			addCriterion("NeedExp is not null");
			return (Criteria) this;
		}

		public Criteria andNeedexpEqualTo(Integer value) {
			addCriterion("NeedExp =", value, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpNotEqualTo(Integer value) {
			addCriterion("NeedExp <>", value, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpGreaterThan(Integer value) {
			addCriterion("NeedExp >", value, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpGreaterThanOrEqualTo(Integer value) {
			addCriterion("NeedExp >=", value, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpLessThan(Integer value) {
			addCriterion("NeedExp <", value, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpLessThanOrEqualTo(Integer value) {
			addCriterion("NeedExp <=", value, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpIn(List<Integer> values) {
			addCriterion("NeedExp in", values, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpNotIn(List<Integer> values) {
			addCriterion("NeedExp not in", values, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpBetween(Integer value1, Integer value2) {
			addCriterion("NeedExp between", value1, value2, "needexp");
			return (Criteria) this;
		}

		public Criteria andNeedexpNotBetween(Integer value1, Integer value2) {
			addCriterion("NeedExp not between", value1, value2, "needexp");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table mt_s_grade_exp
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
     * This class corresponds to the database table mt_s_grade_exp
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}