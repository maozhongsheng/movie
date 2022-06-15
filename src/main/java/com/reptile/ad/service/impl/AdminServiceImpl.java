package com.reptile.ad.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.reptile.ad.mapper.MovelTvdataMapper;
import com.reptile.ad.mapper.RotationChartMapper;
import com.reptile.ad.service.AdminService;
import com.reptile.ad.utils.LarkPageInfoVo;
import com.reptile.ad.vo.PageImpl;
import com.reptile.ad.vo.RotationChart;
import com.reptile.ad.vo.RotationChartExample;
import com.reptile.ad.vo.request.AdminRotationRequest;
import com.reptile.ad.vo.response.AdminRotationResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author mzs
 * @version 1.0
 * @date 2022/6/6 14:45
 */
@Slf4j
@Service
@Repository
public class AdminServiceImpl implements AdminService {

    @Autowired
    private RotationChartMapper rotationChartMapper;

    @Autowired
    private MovelTvdataMapper movelTvdataMapper;

    @Override
    public LarkPageInfoVo<AdminRotationResponseDTO> adminRotationList(AdminRotationRequest adminRotationRequest) {

        RotationChartExample example = new RotationChartExample();
        RotationChartExample.Criteria criteria = example.createCriteria();

        example.setOrderByClause("create_time DESC");
        criteria.andIs_deleteEqualTo(0);

        PageHelper.startPage(adminRotationRequest.getPage(), adminRotationRequest.getLimit());
        List<RotationChart> rotationChart = rotationChartMapper.selectByExample(example);
        PageInfo<RotationChart> pageInfo = new PageInfo<>(rotationChart);
        List<AdminRotationResponseDTO> list = rotationChart.stream().map(msg -> {
            AdminRotationResponseDTO event = new AdminRotationResponseDTO();
            event.setId(msg.getId());
            event.setTitle(msg.getTitle());
            event.setUrl(msg.getUrl());
            event.setContent(msg.getContent());
            event.setCreate_time(msg.getCreate_time());
            event.setUpdate_time(msg.getUpdate_time());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<AdminRotationResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), adminRotationRequest.getLimit(), adminRotationRequest.getPage());
    }

    @Override
    public RotationChart adminRotationById(AdminRotationRequest adminRotationRequest) {
        RotationChart rotationChart = rotationChartMapper.selectByPrimaryKey(adminRotationRequest.getId());
        return rotationChart;
    }

    @Override
    public Integer addAdminRotation(AdminRotationRequest adminRotationRequest) {
        RotationChart rotationChart = new RotationChart();
        rotationChart.setTitle(adminRotationRequest.getTitle());
        rotationChart.setUrl(adminRotationRequest.getUrl());
        rotationChart.setContent(adminRotationRequest.getContent());
        rotationChart.setCreate_time(new Date());
        rotationChart.setIs_delete(0);
        return rotationChartMapper.insertSelective(rotationChart);
    }

    @Override
    public Integer updateAdminRotation(AdminRotationRequest adminRotationRequest) {
        RotationChart rotationChart = new RotationChart();
        rotationChart.setId(adminRotationRequest.getId());
        rotationChart.setTitle(adminRotationRequest.getTitle());
        rotationChart.setUrl(adminRotationRequest.getUrl());
        rotationChart.setContent(adminRotationRequest.getContent());
        rotationChart.setUpdate_time(new Date());
        return rotationChartMapper.updateByPrimaryKeySelective(rotationChart);
    }

    @Override
    public Integer deleteAdminRotation(AdminRotationRequest adminRotationRequest) {
        RotationChart rotationChart = new RotationChart();
        rotationChart.setId(adminRotationRequest.getId());
        rotationChart.setIs_delete(1);
        return rotationChartMapper.updateByPrimaryKeySelective(rotationChart);
    }

    @Override
    public List<Map> adminRotationListBox() {
        return movelTvdataMapper.selectRotationBox();
    }

    @Override
    public List<Map> adminHotListBox() {
        return movelTvdataMapper.adminHotListBox();
    }

    @Override
    public List<Map> adminAllListBox(AdminRotationRequest adminRotationRequest) {

        return movelTvdataMapper.adminAllListBox(adminRotationRequest.getType());
    }

    @Override
    public Integer addadminHotBox(AdminRotationRequest adminRotationRequest) {
        String type = adminRotationRequest.getType();
        Map parame = new HashMap();
        parame.put("id",adminRotationRequest.getUuid());
        Integer result = 0;
        if("1".equals(type)){
            parame.put("url",adminRotationRequest.getUrl());
            parame.put("name","轮播m147-"+adminRotationRequest.getName());
            result =  movelTvdataMapper.updateRotation(parame); //轮播
        }else if("2".equals(type)){
            parame.put("name","最新热门m147-"+adminRotationRequest.getName());
            result = movelTvdataMapper.updateHotStatus(parame);
        }else if("3".equals(type)){
            parame.put("tvtype","电影");
            parame.put("name","热门电影m147-"+adminRotationRequest.getName());
            result = movelTvdataMapper.updateStatus(parame);
        }else if("4".equals(type)){
            parame.put("tvtype","电视剧");
            parame.put("name","热门电视剧m147-"+adminRotationRequest.getName());
            result = movelTvdataMapper.updateStatus(parame);
        }else if("5".equals(type)){
            parame.put("tvtype","综艺");
            parame.put("name","热门综艺m147-"+adminRotationRequest.getName());
            result = movelTvdataMapper.updateStatus(parame);
        }else if("6".equals(type)){
            parame.put("tvtype","动漫");
            parame.put("name","热门动漫m147-"+adminRotationRequest.getName());
            result = movelTvdataMapper.updateStatus(parame);
        }
        return result;
    }

    @Override
    public Integer deleteadminHotBox(AdminRotationRequest adminRotationRequest) {
        String type = adminRotationRequest.getType();
        String id = adminRotationRequest.getUuid();
        Integer result = 0;
        if("1".equals(type)){
            result =  movelTvdataMapper.updateRotationHotBox(id); //轮播
        }else if("2".equals(type)){
            result = movelTvdataMapper.updateHotBox(id);
        }else if("3".equals(type)){
            result = movelTvdataMapper.updateAname(id);
        }
        return result;
    }

}
