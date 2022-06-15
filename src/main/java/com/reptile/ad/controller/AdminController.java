package com.reptile.ad.controller;

import com.reptile.ad.service.AdminService;
import com.reptile.ad.utils.LarkPageInfoVo;
import com.reptile.ad.vo.ResponseResult;
import com.reptile.ad.vo.RotationChart;
import com.reptile.ad.vo.request.AdminRotationRequest;
import com.reptile.ad.vo.response.AdminRotationResponseDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/6/6 18:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @ApiOperation(value = "查询轮播图列表")
    @RequestMapping(value = "/api/adminRotationList", method = RequestMethod.POST)
    public ResponseResult adminRotationList(@RequestBody AdminRotationRequest adminRotationRequest){
        LarkPageInfoVo<AdminRotationResponseDTO> list = adminService.adminRotationList(adminRotationRequest);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "根据id查询轮播图详情")
    @RequestMapping(value = "/api/adminRotationById", method = RequestMethod.POST)
    public ResponseResult adminRotationById(@RequestBody AdminRotationRequest adminRotationRequest){
        RotationChart result = adminService.adminRotationById(adminRotationRequest);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "轮播图添加")
    @RequestMapping(value = "/api/addAdminRotation", method = RequestMethod.POST)
    public ResponseResult addAdminRotation(@RequestBody AdminRotationRequest adminRotationRequest){
        Integer result = adminService.addAdminRotation(adminRotationRequest);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "轮播图修改")
    @RequestMapping(value = "/api/updateAdminRotation", method = RequestMethod.POST)
    public ResponseResult updateAdminRotation(@RequestBody AdminRotationRequest adminRotationRequest){
        Integer result = adminService.updateAdminRotation(adminRotationRequest);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "轮播图删除")
    @RequestMapping(value = "/api/deleteAdminRotation", method = RequestMethod.POST)
    public ResponseResult deleteAdminRotation(@RequestBody AdminRotationRequest adminRotationRequest){
        Integer result = adminService.deleteAdminRotation(adminRotationRequest);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "轮播热门列表")
    @RequestMapping(value = "/api/adminRotationListBox", method = RequestMethod.POST)
    public ResponseResult adminRotationListBox(){
        List<Map> result = adminService.adminRotationListBox();
        return new ResponseResult(result);
    }
    @ApiOperation(value = "热门展示列表")
    @RequestMapping(value = "/api/adminHotListBox", method = RequestMethod.POST)
    public ResponseResult adminHotListBox(){
        List<Map> result = adminService.adminHotListBox();
        return new ResponseResult(result);
    }
    @ApiOperation(value = "综合展示列表")
    @RequestMapping(value = "/api/adminAllListBox", method = RequestMethod.POST)
    public ResponseResult adminAllListBox(@RequestBody AdminRotationRequest adminRotationRequest){
        List<Map> result = adminService.adminAllListBox(adminRotationRequest);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "热门添加")
    @RequestMapping(value = "/api/addadminHotBox", method = RequestMethod.POST)
    public ResponseResult addadminHotBox(@RequestBody AdminRotationRequest adminRotationRequest){
        Integer result = adminService.addadminHotBox(adminRotationRequest);
        return new ResponseResult(result);
    }
    @ApiOperation(value = "热门删除")
    @RequestMapping(value = "/api/deleteadminHotBox", method = RequestMethod.POST)
    public ResponseResult deleteadminHotBox(@RequestBody AdminRotationRequest adminRotationRequest){
        Integer result = adminService.deleteadminHotBox(adminRotationRequest);
        return new ResponseResult(result);
    }
}
