package com.reptile.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class MovelTvdata implements Serializable {
    private String uuid;

    private String name;

    private String alias;

    private String mainstar;

    private String director;

    private String type;

    private String area;

    private String year;

    private String site;

    private String image;

    private Integer param;

    private String sitename;

    private String tvtype;

    private String siteurl;

    private Date createtime;

    private Date updatetime;

    private Integer id;

    private String movel_status;

    private String seach_name;

    private String seach_rname;

    private String seach_aname;

    private String introduction;

    private String plot;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMainstar() {
        return mainstar;
    }

    public void setMainstar(String mainstar) {
        this.mainstar = mainstar;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getParam() {
        return param;
    }

    public void setParam(Integer param) {
        this.param = param;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getTvtype() {
        return tvtype;
    }

    public void setTvtype(String tvtype) {
        this.tvtype = tvtype;
    }

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovel_status() {
        return movel_status;
    }

    public void setMovel_status(String movel_status) {
        this.movel_status = movel_status;
    }

    public String getSeach_name() {
        return seach_name;
    }

    public void setSeach_name(String seach_name) {
        this.seach_name = seach_name;
    }

    public String getSeach_rname() {
        return seach_rname;
    }

    public void setSeach_rname(String seach_rname) {
        this.seach_rname = seach_rname;
    }

    public String getSeach_aname() {
        return seach_aname;
    }

    public void setSeach_aname(String seach_aname) {
        this.seach_aname = seach_aname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", name=").append(name);
        sb.append(", alias=").append(alias);
        sb.append(", mainstar=").append(mainstar);
        sb.append(", director=").append(director);
        sb.append(", type=").append(type);
        sb.append(", area=").append(area);
        sb.append(", year=").append(year);
        sb.append(", site=").append(site);
        sb.append(", image=").append(image);
        sb.append(", param=").append(param);
        sb.append(", sitename=").append(sitename);
        sb.append(", tvtype=").append(tvtype);
        sb.append(", siteurl=").append(siteurl);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", id=").append(id);
        sb.append(", movel_status=").append(movel_status);
        sb.append(", seach_name=").append(seach_name);
        sb.append(", seach_rname=").append(seach_rname);
        sb.append(", seach_aname=").append(seach_aname);
        sb.append(", introduction=").append(introduction);
        sb.append(", plot=").append(plot);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MovelTvdata other = (MovelTvdata) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getMainstar() == null ? other.getMainstar() == null : this.getMainstar().equals(other.getMainstar()))
            && (this.getDirector() == null ? other.getDirector() == null : this.getDirector().equals(other.getDirector()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
            && (this.getSite() == null ? other.getSite() == null : this.getSite().equals(other.getSite()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getParam() == null ? other.getParam() == null : this.getParam().equals(other.getParam()))
            && (this.getSitename() == null ? other.getSitename() == null : this.getSitename().equals(other.getSitename()))
            && (this.getTvtype() == null ? other.getTvtype() == null : this.getTvtype().equals(other.getTvtype()))
            && (this.getSiteurl() == null ? other.getSiteurl() == null : this.getSiteurl().equals(other.getSiteurl()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMovel_status() == null ? other.getMovel_status() == null : this.getMovel_status().equals(other.getMovel_status()))
            && (this.getSeach_name() == null ? other.getSeach_name() == null : this.getSeach_name().equals(other.getSeach_name()))
            && (this.getSeach_rname() == null ? other.getSeach_rname() == null : this.getSeach_rname().equals(other.getSeach_rname()))
            && (this.getSeach_aname() == null ? other.getSeach_aname() == null : this.getSeach_aname().equals(other.getSeach_aname()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getPlot() == null ? other.getPlot() == null : this.getPlot().equals(other.getPlot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getMainstar() == null) ? 0 : getMainstar().hashCode());
        result = prime * result + ((getDirector() == null) ? 0 : getDirector().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
        result = prime * result + ((getSite() == null) ? 0 : getSite().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getParam() == null) ? 0 : getParam().hashCode());
        result = prime * result + ((getSitename() == null) ? 0 : getSitename().hashCode());
        result = prime * result + ((getTvtype() == null) ? 0 : getTvtype().hashCode());
        result = prime * result + ((getSiteurl() == null) ? 0 : getSiteurl().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMovel_status() == null) ? 0 : getMovel_status().hashCode());
        result = prime * result + ((getSeach_name() == null) ? 0 : getSeach_name().hashCode());
        result = prime * result + ((getSeach_rname() == null) ? 0 : getSeach_rname().hashCode());
        result = prime * result + ((getSeach_aname() == null) ? 0 : getSeach_aname().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getPlot() == null) ? 0 : getPlot().hashCode());
        return result;
    }
}