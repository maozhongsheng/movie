package com.reptile.ad.mapper;

import com.reptile.ad.vo.MovelTvnums;
import com.reptile.ad.vo.MovelTvnumsExample;
import com.reptile.ad.vo.response.MovieNum;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MovelTvnumsMapper {
    long countByExample(MovelTvnumsExample example);

    int deleteByExample(MovelTvnumsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MovelTvnums record);

    int insertSelective(MovelTvnums record);

    List<MovelTvnums> selectByExample(MovelTvnumsExample example);

    MovelTvnums selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MovelTvnums record, @Param("example") MovelTvnumsExample example);

    int updateByExample(@Param("record") MovelTvnums record, @Param("example") MovelTvnumsExample example);

    int updateByPrimaryKeySelective(MovelTvnums record);

    int updateByPrimaryKey(MovelTvnums record);

    List<MovieNum> selectNum(String id);

    Integer selectTotal(String id);

    List<Map> getMovieUrl(String id);

    List<Map> getMovieNums(String id);
}