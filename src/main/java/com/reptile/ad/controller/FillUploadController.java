package com.reptile.ad.controller;

import com.aliyun.oss.OSSClient;
import com.reptile.ad.utils.OSSUtil;
import com.reptile.ad.vo.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/6/6 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class FillUploadController {

    @Value("${oss.endpoint}")
    private  String endpoint;
    @Value("${oss.accessKeyId}")
    private  String accessKeyId;
    @Value("${oss.accessKeySecret}")
    private  String accessKeySecret;
    @Value("${oss.bucketName}")
    private  String bucketName;

    @ApiOperation(value = "oss提交图片")
    @RequestMapping(value = "fillUpload", method = RequestMethod.POST)
    public ResponseResult oss(@RequestParam("file") MultipartFile file) throws Exception {
        String result = "";
        //获取文件名称
        String fileName = file.getOriginalFilename();
        //获得文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        if (file.isEmpty()) {
            return new ResponseResult("上传文件不能为空");
        }
        try {
            OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
            ; //阿里云客户端
            String targetName = UUID.randomUUID() + prefix; //存储文件名
            result = OSSUtil.uploadOSS(ossClient, targetName, file.getBytes(), bucketName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = result.indexOf("?");
        String substring = result.substring(0, i);

        return new ResponseResult(substring);
    }
}
