package com.mytribe.mgr.dbmgr;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytribe.db.mapper.strategy.AttackTypeTemplateMapper;
import com.mytribe.db.mapper.strategy.BuildingGradeTemplateMapper;
import com.mytribe.db.mapper.strategy.BuildingTypeTemplateMapper;
import com.mytribe.db.mapper.strategy.EquipForgeTemplateMapper;
import com.mytribe.db.mapper.strategy.EquipTypeTemplateMapper;
import com.mytribe.db.mapper.strategy.GradeExpTemplateMapper;
import com.mytribe.db.mapper.strategy.ItemTemplateMapper;
import com.mytribe.db.mapper.strategy.MainRoleBaseInfoTemplateMapper;
import com.mytribe.db.mapper.strategy.MedalRankEntityMapper;
import com.mytribe.db.mapper.strategy.PlayerArmyEntityMapper;
import com.mytribe.db.mapper.strategy.PlayerEquipEntityMapper;
import com.mytribe.db.mapper.strategy.PlayerInfoEntityMapper;
import com.mytribe.db.mapper.strategy.PlayerItemEntityMapper;
import com.mytribe.db.mapper.strategy.PlayerSoldierGradeEntityMapper;
import com.mytribe.db.mapper.strategy.PlayerSylphbeastEntityMapper;
import com.mytribe.db.mapper.strategy.SkillTypeTemplateMapper;
import com.mytribe.db.mapper.strategy.SoldierGradeInfoTemplateMapper;
import com.mytribe.db.mapper.strategy.SoldierTypeTemplateMapper;
import com.mytribe.db.mapper.strategy.SylphbeastTemplateMapper;
import com.mytribe.db.mapper.strategy.TypeStarColumnUnlockColumnTemplateMapper;
import com.mytribe.mgr.TemplateMgr;

@Service
public class StrategyDBManager {
	private static Logger logger = LoggerFactory.getLogger(StrategyDBManager.class);

	private AtomicInteger curDBPlayerCount = new AtomicInteger(-1);
	private static ConcurrentHashMap<String, TemplateMgr> map = new ConcurrentHashMap<String, TemplateMgr>();
	@Autowired
	private AttackTypeTemplateMapper attackTypeTemplateMapper;
	@Autowired
	private BuildingGradeTemplateMapper buildingGradeTemplateMapper;
	@Autowired
	private BuildingTypeTemplateMapper buildingTypeTemplateMapper;
	@Autowired
	private EquipForgeTemplateMapper equipForgeTemplateMapper;
	@Autowired
	private EquipTypeTemplateMapper equipTypeTemplateMapper;
	@Autowired
	private GradeExpTemplateMapper gradeExpTemplateMapper;
	@Autowired
	private ItemTemplateMapper itemTemplateMapper;
	@Autowired
	private MainRoleBaseInfoTemplateMapper mainRoleBaseInfoTemplateMapper;
	@Autowired
	private MedalRankEntityMapper medalRankEntityMapper;
	@Autowired
	private PlayerArmyEntityMapper playerArmyEntityMapper;
	@Autowired
	private PlayerInfoEntityMapper playerInfoEntityMapper;
	@Autowired
	private PlayerItemEntityMapper playerItemEntityMapper;
	@Autowired
	private PlayerSoldierGradeEntityMapper playerSoldierGradeEntityMapper;
	@Autowired
	private PlayerSylphbeastEntityMapper playerSylphbeastEntityMapper;
	@Autowired
	private SkillTypeTemplateMapper skillTypeTemplateMapper;
	@Autowired
	private SoldierGradeInfoTemplateMapper soldierGradeInfoTemplateMapper;
	@Autowired
	private SoldierTypeTemplateMapper soldierTypeTemplateMapper;
	@Autowired
	private SylphbeastTemplateMapper sylphbeastTemplateMapper;
	@Autowired
	private PlayerEquipEntityMapper playerEquipEntityMapper;
	@Autowired
	private TypeStarColumnUnlockColumnTemplateMapper typeStarColumnUnlockColumnTemplateMapper;

	private static StrategyDBManager instance;

	public PlayerEquipEntityMapper getPlayerEquipEntityMapper() {
		return playerEquipEntityMapper;
	}

	public void setPlayerEquipEntityMapper(PlayerEquipEntityMapper playerEquipEntityMapper) {
		this.playerEquipEntityMapper = playerEquipEntityMapper;
	}

	@PostConstruct
	public void init() {
		StrategyDBManager.instance = this;
	}

	public static StrategyDBManager getInstance() {
		return instance;
	}

	public AttackTypeTemplateMapper getAttackTypeTemplateMapper() {
		return attackTypeTemplateMapper;
	}

	public void setAttackTypeTemplateMapper(AttackTypeTemplateMapper attackTypeTemplateMapper) {
		this.attackTypeTemplateMapper = attackTypeTemplateMapper;
	}

	public BuildingGradeTemplateMapper getBuildingGradeTemplateMapper() {
		return buildingGradeTemplateMapper;
	}

	public void setBuildingGradeTemplateMapper(BuildingGradeTemplateMapper buildingGradeTemplateMapper) {
		this.buildingGradeTemplateMapper = buildingGradeTemplateMapper;
	}

	public BuildingTypeTemplateMapper getBuildingTypeTemplateMapper() {
		return buildingTypeTemplateMapper;
	}

	public void setBuildingTypeTemplateMapper(BuildingTypeTemplateMapper buildingTypeTemplateMapper) {
		this.buildingTypeTemplateMapper = buildingTypeTemplateMapper;
	}

	public EquipForgeTemplateMapper getEquipForgeTemplateMapper() {
		return equipForgeTemplateMapper;
	}

	public void setEquipForgeTemplateMapper(EquipForgeTemplateMapper equipForgeTemplateMapper) {
		this.equipForgeTemplateMapper = equipForgeTemplateMapper;
	}

	public EquipTypeTemplateMapper getEquipTypeTemplateMapper() {
		return equipTypeTemplateMapper;
	}

	public void setEquipTypeTemplateMapper(EquipTypeTemplateMapper equipTypeTemplateMapper) {
		this.equipTypeTemplateMapper = equipTypeTemplateMapper;
	}

	public GradeExpTemplateMapper getGradeExpTemplateMapper() {
		return gradeExpTemplateMapper;
	}

	public void setGradeExpTemplateMapper(GradeExpTemplateMapper gradeExpTemplateMapper) {
		this.gradeExpTemplateMapper = gradeExpTemplateMapper;
	}

	public ItemTemplateMapper getItemTemplateMapper() {
		return itemTemplateMapper;
	}

	public void setItemTemplateMapper(ItemTemplateMapper itemTemplateMapper) {
		this.itemTemplateMapper = itemTemplateMapper;
	}

	public MainRoleBaseInfoTemplateMapper getMainRoleBaseInfoTemplateMapper() {
		return mainRoleBaseInfoTemplateMapper;
	}

	public void setMainRoleBaseInfoTemplateMapper(MainRoleBaseInfoTemplateMapper mainRoleBaseInfoTemplateMapper) {
		this.mainRoleBaseInfoTemplateMapper = mainRoleBaseInfoTemplateMapper;
	}

	public MedalRankEntityMapper getMedalRankEntityMapper() {
		return medalRankEntityMapper;
	}

	public void setMedalRankEntityMapper(MedalRankEntityMapper medalRankEntityMapper) {
		this.medalRankEntityMapper = medalRankEntityMapper;
	}

	public PlayerArmyEntityMapper getPlayerArmyEntityMapper() {
		return playerArmyEntityMapper;
	}

	public void setPlayerArmyEntityMapper(PlayerArmyEntityMapper playerArmyEntityMapper) {
		this.playerArmyEntityMapper = playerArmyEntityMapper;
	}

	public PlayerInfoEntityMapper getPlayerInfoEntityMapper() {
		return playerInfoEntityMapper;
	}

	public void setPlayerInfoEntityMapper(PlayerInfoEntityMapper playerInfoEntityMapper) {
		this.playerInfoEntityMapper = playerInfoEntityMapper;
	}

	public PlayerItemEntityMapper getPlayerItemEntityMapper() {
		return playerItemEntityMapper;
	}

	public void setPlayerItemEntityMapper(PlayerItemEntityMapper playerItemEntityMapper) {
		this.playerItemEntityMapper = playerItemEntityMapper;
	}

	public PlayerSoldierGradeEntityMapper getPlayerSoldierGradeEntityMapper() {
		return playerSoldierGradeEntityMapper;
	}

	public void setPlayerSoldierGradeEntityMapper(PlayerSoldierGradeEntityMapper playerSoldierGradeEntityMapper) {
		this.playerSoldierGradeEntityMapper = playerSoldierGradeEntityMapper;
	}

	public PlayerSylphbeastEntityMapper getPlayerSylphbeastEntityMapper() {
		return playerSylphbeastEntityMapper;
	}

	public void setPlayerSylphbeastEntityMapper(PlayerSylphbeastEntityMapper playerSylphbeastEntityMapper) {
		this.playerSylphbeastEntityMapper = playerSylphbeastEntityMapper;
	}

	public SkillTypeTemplateMapper getSkillTypeTemplateMapper() {
		return skillTypeTemplateMapper;
	}

	public void setSkillTypeTemplateMapper(SkillTypeTemplateMapper skillTypeTemplateMapper) {
		this.skillTypeTemplateMapper = skillTypeTemplateMapper;
	}

	public SoldierGradeInfoTemplateMapper getSoldierGradeInfoTemplateMapper() {
		return soldierGradeInfoTemplateMapper;
	}

	public void setSoldierGradeInfoTemplateMapper(SoldierGradeInfoTemplateMapper soldierGradeInfoTemplateMapper) {
		this.soldierGradeInfoTemplateMapper = soldierGradeInfoTemplateMapper;
	}

	public SoldierTypeTemplateMapper getSoldierTypeTemplateMapper() {
		return soldierTypeTemplateMapper;
	}

	public void setSoldierTypeTemplateMapper(SoldierTypeTemplateMapper soldierTypeTemplateMapper) {
		this.soldierTypeTemplateMapper = soldierTypeTemplateMapper;
	}

	public SylphbeastTemplateMapper getSylphbeastTemplateMapper() {
		return sylphbeastTemplateMapper;
	}

	public void setSylphbeastTemplateMapper(SylphbeastTemplateMapper sylphbeastTemplateMapper) {
		this.sylphbeastTemplateMapper = sylphbeastTemplateMapper;
	}

	public TypeStarColumnUnlockColumnTemplateMapper getTypeStarColumnUnlockColumnTemplateMapper() {
		return typeStarColumnUnlockColumnTemplateMapper;
	}

	public void setTypeStarColumnUnlockColumnTemplateMapper(TypeStarColumnUnlockColumnTemplateMapper typeStarColumnUnlockColumnTemplateMapper) {
		this.typeStarColumnUnlockColumnTemplateMapper = typeStarColumnUnlockColumnTemplateMapper;
	}

	public static void registTemplateModule(TemplateMgr templateModule) {
		if (templateModule == null) {
			return;
		}
		if (StrategyDBManager.map.contains(templateModule.getClass().getName())) {
			logger.error("===================重复注册" + templateModule.getClass().getName());
		} else {
			StrategyDBManager.map.put(templateModule.getClass().getName(), templateModule);
		}
	}

	public AtomicInteger getCurDBPlayerCount() {
		return curDBPlayerCount;
	}

	public boolean serverStarting() {
		logger.info("==============加载db模板数据 begin ...===============");
		Collection<TemplateMgr> values = map.values();
		StringBuilder builder = new StringBuilder();
		int index = 0;
		for (TemplateMgr templateModule : values) {
			if (!templateModule.init()) {
				builder.append("[").append(templateModule.getClass().getName());
				if (index != values.size() - 1) {
					builder.append("],");
				}
			}
			index++;
		}
		try {
			int count = this.playerInfoEntityMapper.countByExample(null);
			curDBPlayerCount.set(count);
		} catch (Exception e) {
			e.printStackTrace();
			builder.append(",[本服player数量统计异常]");
		}
		if (!builder.toString().isEmpty()) {
			logger.info("                                  部分数据初始化失败:" + builder.toString());
		}
		logger.info("==============加载db模板数据 end ...===============");
		return true;
	}

	public boolean serverStarted() {
		logger.info("==============内存中db模板数据处理 begin ...===============");
		Collection<TemplateMgr> values = map.values();
		for (TemplateMgr templateModule : values) {
			if (!templateModule.afterinit()) {
				logger.error("                                        部分数据处理失败:" + templateModule.getClass().getName());
				return false;
			}
		}
		logger.info("==============内存中db模板数据处理 end ...===============");
		return true;
	}
	
	public void add(){
		curDBPlayerCount.getAndIncrement();
	}
}
