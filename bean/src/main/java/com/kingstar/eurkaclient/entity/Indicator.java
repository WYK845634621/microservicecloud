package com.kingstar.eurkaclient.entity;




import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yikai.wang
 * @since 2019-03-14
 */
@TableName("mn_alarm.indicator")
public class Indicator implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UUID主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 指标ID，对应的是indicator_val的主键
     */
    private String identifier;
    /**
     * 指标名称
     */
    private String name;
    /**
     * 指标来源对应字典identId
     */
    private String source;
    /**
     * 数据类型
     */
    private String type;
    /**
     * 指标单位
     */
    private String unit;
    /**
     * 创建者
     */
    private String createId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改者
     */
    private String modifyId;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 数据状态，系统全量数据采用逻辑删除
     */
    private Integer dataStatus;
    /**
     * 对应的字典项的标识,也作为Redis缓存key的一部分
     */
    private String identId;
    /**
     * 指标类型 1:服务器指标 0:应用指标
     */
    private Integer indicatorType;
    /**
     * 采集来源：0. snmpwalk 1.snmpget 2或其他 ：4硬件agent、301..
     */
    private Integer collectSource;
    /**
     * snmp采集的oid
     */
    private String oid;
    /**
     * 指标顺序
     */
    private Integer px;
    /**
     * 是否启用：1，启用，0，停用
     */
    private Integer state;
    /**
     * dbf类别
     */
    private String category;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getIdentId() {
        return identId;
    }

    public void setIdentId(String identId) {
        this.identId = identId;
    }

    public Integer getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(Integer indicatorType) {
        this.indicatorType = indicatorType;
    }

    public Integer getCollectSource() {
        return collectSource;
    }

    public void setCollectSource(Integer collectSource) {
        this.collectSource = collectSource;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
        this.px = px;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Indicator{" +
        ", id=" + id +
        ", identifier=" + identifier +
        ", name=" + name +
        ", source=" + source +
        ", type=" + type +
        ", unit=" + unit +
        ", createId=" + createId +
        ", createTime=" + createTime +
        ", modifyId=" + modifyId +
        ", modifyTime=" + modifyTime +
        ", dataStatus=" + dataStatus +
        ", identId=" + identId +
        ", indicatorType=" + indicatorType +
        ", collectSource=" + collectSource +
        ", oid=" + oid +
        ", px=" + px +
        ", state=" + state +
        ", category=" + category +
        "}";
    }
}
