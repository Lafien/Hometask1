package com.nefedov.controller;

import com.nefedov.form.MyUploadForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

@Controller
public class MyFileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String uploadOneFileHandler(Model model) {

        MyUploadForm myUploadForm = new MyUploadForm();
        model.addAttribute("myUploadForm", myUploadForm);

        return "upload";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadOneFileHandlerPOST(HttpServletRequest request, Model model, @ModelAttribute("myUploadForm") MyUploadForm myUploadForm) throws IOException {
        return this.doUpload(request, model, myUploadForm);
    }

    private String doUpload(HttpServletRequest request, Model model, MyUploadForm myUploadForm) throws IOException {

        String uploadRootPath = request.getServletContext().getRealPath("upload");

        File uploadRootDir = new File(uploadRootPath);

        if (!uploadRootDir.exists()) {
            uploadRootDir.mkdirs();
        }
        MultipartFile[] fileDatas = myUploadForm.getFileDatas();

        for (MultipartFile fileData : fileDatas) {

            String name = fileData.getOriginalFilename();

            if (name != null && name.length() > 0) {
                    FileOutputStream outputStream = new FileOutputStream("output.txt", true);
                    outputStream.write(fileData.getBytes());
                    outputStream.close();
            }
        }
        return "uploadResult";
    }

}
