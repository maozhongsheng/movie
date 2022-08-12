package com.reptile.ad.mapper;

import com.reptile.ad.vo.MovelTvdata;
import com.reptile.ad.vo.MovelTvdataExample;
import java.util.List;
import java.util.Map;

import com.reptile.ad.vo.response.MovieGetClassResponseDTO;
import com.reptile.ad.vo.response.MovieShowResponseDTO;
import com.reptile.ad.vo.response.MovieTopTypeResponseDTO;
import org.apache.ibatis.annotations.Param;

public interface MovelTvdataMapper {
    long countByExample(MovelTvdataExample example);

    int deleteByExample(MovelTvdataExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(MovelTvdata record);

    int insertSelective(MovelTvdata record);

    List<MovelTvdata> selectByExampleWithBLOBs(MovelTvdataExample example);

    List<MovelTvdata> selectByExample(MovelTvdataExample example);

    MovelTvdata selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") MovelTvdata record, @Param("example") MovelTvdataExample example);

    int updateByExampleWithBLOBs(@Param("record") MovelTvdata record, @Param("example") MovelTvdataExample example);

    int updateByExample(@Param("record") MovelTvdata record, @Param("example") MovelTvdataExample example);

    int updateByPrimaryKeySelective(MovelTvdata record);

    int updateByPrimaryKeyWithBLOBs(MovelTvdata record);

    int updateByPrimaryKey(MovelTvdata record);

    List<MovieGetClassResponseDTO> selectRotation();

    Map selectplayurl(String id);

    List<MovieTopTypeResponseDTO> selectTopType(Map param);

    List<MovieShowResponseDTO> selectDataAll();

    List<MovieShowResponseDTO> selectDataByTvType(String type);

    List<Map> topTypeName();

    List<Map> getMovieHotSearch();

    List<Map> selectDownBox(String tvtype);

    String selectMovelName(String name);

    List<Map> selectMovelNums(String id);

    List<Map> selectRotationBox();

    List<Map> adminHotListBox();

    List<Map> adminAllListBox(String type);

    Integer updateRotation(Map parame);

    Integer updateHotStatus(Map parame);

    Integer updateStatus(Map parame);

    Integer updateHotBox(String id);

    Integer updateRotationHotBox(String id);

    Integer updateAname(String id);

    List<MovieGetClassResponseDTO> selectTopRotation();


    Integer deleteSensitiveMovie(@Param("uuid")List<String> result);

    List<String> getSensitiveMovie();

    Integer deleteSensitiveMovieTvNum(@Param("tvuuid_id")List<String> result);
}