package cn.running4light.demo.entity;

import com.xiaoleilu.hutool.date.DateTime;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author running4light
 * @description
 * @createTime 2021/6/25 14:19
 */
public class SimpleDetail {
    // 基金代码
    private String  fundcode;
    // 基金名称
    private String  name;
    // 截止日期
    private Date jzrq;
    // 估算时刻
    private DateTime gztime;
    // 单位净值
    private BigDecimal dwjz;
    // 估算净值
    private BigDecimal gsz;
    // 估算增长率
    private BigDecimal gszzl;

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJzrq() {
        return jzrq;
    }

    public void setJzrq(Date jzrq) {
        this.jzrq = jzrq;
    }

    public DateTime getGztime() {
        return gztime;
    }

    public void setGztime(DateTime gztime) {
        this.gztime = gztime;
    }

    public BigDecimal getDwjz() {
        return dwjz;
    }

    public void setDwjz(BigDecimal dwjz) {
        this.dwjz = dwjz;
    }

    public BigDecimal getGsz() {
        return gsz;
    }

    public void setGsz(BigDecimal gsz) {
        this.gsz = gsz;
    }

    public BigDecimal getGszzl() {
        return gszzl;
    }

    public void setGszzl(BigDecimal gszzl) {
        this.gszzl = gszzl;
    }

    /*"fundcode": "501057",
            "name": "汇添富中证新能源汽车A",
            "jzrq": "2021-06-24",
            "dwjz": "2.5562",
            "gsz": "2.5997",
            "gszzl": "1.70",
            "gztime": "2021-06-25 13:47"*/
}
