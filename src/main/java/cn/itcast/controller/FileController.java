package cn.itcast.controller;

import cn.itcast.entity.Account;
import cn.itcast.entity.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/fileUpload")
    public String fileUpload(HttpServletRequest request, MultipartFile upload) throws Exception{
        /**本地服务器上传
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        */
        String path = "http://localhost:9090/SpringMVCFileUpload//uploads/";
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        fileName = uuid + "_" + fileName;
        //upload.transferTo(new File(path, fileName));本地服务器上传
        //创建客户端对象
        Client client = Client.create();
        //和文件服务器进行连接
        WebResource webResource =  client.resource(path + fileName);
        //上传文件
        webResource.put(upload.getBytes());
        return "success";
    }

}
