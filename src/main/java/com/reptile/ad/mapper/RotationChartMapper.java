package com.reptile.ad.mapper;

import com.reptile.ad.vo.RotationChart;
import com.reptile.ad.vo.RotationChartExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RotationChartMapper {
    long countByExample(RotationChartExample example);

    int deleteByExample(RotationChartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RotationChart record);

    int insertSelective(RotationChart record);

    List<RotationChart> selectByExample(RotationChartExample example);

    RotationChart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RotationChart record, @Param("example") RotationChartExample example);

    int updateByExample(@Param("record") RotationChart record, @Param("example") RotationChartExample example);

    int updateByPrimaryKeySelective(RotationChart record);

    int updateByPrimaryKey(RotationChart record);

    List<Map> selectAll();
}