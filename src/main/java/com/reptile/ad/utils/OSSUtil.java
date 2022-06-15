package com.reptile.ad.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class OSSUtil {


    @Value("${oss.endpoint}")
    private  String endpoint;
    @Value("${oss.accessKeyId}")
    private  String accessKeyId;
    @Value("${oss.accessKeySecret}")
    private  String accessKeySecret;
    @Value("${oss.bucketName}")
    private  String bucketName;

    /**
     * 上传文件到阿里云
     *
     * @param ossClient    oss客户端
     * @param targetName   上传文件名称
     * @param resourcePath 源文件路径
     * @return 返回上传后的文件的完整路径
     */
    public static String uploadOSS(OSSClient ossClient, String targetName, String resourcePath, String bucketName) {
        String targetPath = "";
        try {
            if (ossClient == null) {
                System.out.println("ossClient不能为空");
                return targetPath.toString();
            }
            if (StringUtils.isBlank(targetName)) {
                System.out.println("targetName不能为空");
                return targetPath.toString();
            }
            if (StringUtils.isBlank(resourcePath)) {
                System.out.println("resourcePath不能为空");
                return targetPath.toString();
            }
            File file = new File(resourcePath);
            if (!file.exists()) {
                System.out.println("resourcePath不文件不存在");
                return targetPath.toString();
            }
            PutObjectResult result = ossClient.putObject(bucketName, targetName, new File(resourcePath));
            //设置URL过期时间为100年 3600l* 1000*24*365*20
            Date expiration = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 365 * 100);
            URL url = ossClient.generatePresignedUrl(bucketName, targetName, expiration);
            targetPath = url.toString();
            System.out.println("上传完成后的文件名称:" + url.toString());
        } catch (Exception e) {
            System.out.println("上传文件出现异常：" + e.getMessage());
        } finally {
            // 关闭client
            ossClient.shutdown();
        }
        return targetPath;

    }

    public static String uploadOSS(OSSClient ossClient, String targetName, byte[] bs, String bucketName) {
        String targetPath = "";
        try {
            PutObjectResult result = ossClient.putObject(bucketName, targetName, new ByteArrayInputStream(bs));
            //设置URL过期时间为100年 3600l* 1000*24*365*20
            Date expiration = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 365 * 100);
            URL url = ossClient.generatePresignedUrl(bucketName, targetName, expiration);
            targetPath = url.toString();
            System.out.println("上传完成后的文件名称:" + url);
        } catch (Exception e) {
            System.out.println("上传文件出现异常：" + e.getMessage());
        } finally {
            // 关闭client
            ossClient.shutdown();
        }
        return targetPath;

    }

    public static void main(String[] args) {
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // accessKey请登录https://ak-console.aliyun.com/#/查看
        String accessKeyId = "LTAI4Fj3DdhMLYDpFBDQdRpN";
        String accessKeySecret = "5VejVqiWYQ46j6x9V0xHejdZBfRju6";
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
//            String s = uploadOSS(ossClient, "a.txt", "D:\\Test.java", "qunling-test");
//            System.out.println(s.length());
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream("D:\\\\Test.java");
            System.out.println("文件大小（字节）=" + in.available());
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//            // 对字节数组进行Base64编码，得到Base64编码的字符串
//            BASE64Encoder encoder = new BASE64Encoder();
//            String base64Str = encoder.encode(data);
//            System.out.println(base64Str);
//            byte[] bytes = Base64Utils.decodeFromString(base64Str);
        String s = uploadOSS(ossClient, "m.txt", data, "qunling-test");
        System.out.println(s.length());


        System.out.println(getBase64("C:\\Users\\Administrator\\Documents\\地下城与勇士\\ScreenShot\\ScreenShot2020_0329_191218980.jpg"));
    }

    private static String getBase64(String filePath) {
        if (filePath == null) {
            return null;
        }
        try {
            byte[] b = Files.readAllBytes(Paths.get(filePath));
            return Base64.getEncoder().encodeToString(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    ;


}
