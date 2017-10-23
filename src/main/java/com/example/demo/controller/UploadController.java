package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.example.demo.utils.FileUploadUtil;

@Controller
public class UploadController {
	
	

//	@RequestMapping("UserControllers/progress")
//	public void uploadFile(HttpServletRequest request, HttpServletResponse response,
//			@RequestParam("file") CommonsMultipartFile file) throws IOException {
//		response.setContentType("text/html");
//		response.setCharacterEncoding("GBK");
//		PrintWriter out;
//		boolean flag = false;
//		if (file.getSize() > 0) {
//			// 文件上传的位置可以自定义
//			flag = FileUploadUtil.uploadFile(request, file);
//			String name = file.getName();
//			System.out.println("上传文件的名称为："+ name);
//		}
//		out = response.getWriter();
//		if (flag == true) {
//			out.print("1");
//		} else {
//			out.print("2");
//		}
//	}
//	
	
	
	@RequestMapping("/progress")
	public void progress(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") CommonsMultipartFile file) {
		
		System.out.println("progress...");
		response.setContentType("text/html");
		response.setCharacterEncoding("GBK");
		PrintWriter out = null;
		boolean flag = false;
		if (file.getSize() > 0) {
			// 文件上传的位置可以自定义
			flag = FileUploadUtil.uploadFile(request, file);
			String name = file.getName();
			System.out.println("上传文件的名称为："+ name);
		}
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag == true) {
			out.print("1");
		} else {
			out.print("2");
		}
		
	}
	
	
	@RequestMapping("/fileUpload")
	public String fileUploadPage() {
		return "fileupload/fileUpload";
	}

}
