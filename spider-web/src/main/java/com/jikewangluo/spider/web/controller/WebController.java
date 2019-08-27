package com.jikewangluo.spider.web.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.jikewangluo.spider.web.utils.MatrixToImageWriter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @content:
 * @auther: 左飞
 * @date: 2019/8/22 16:31
 */
@Controller
public class WebController {


    /**
     * 引流页面
     * @return
     */
    @GetMapping("/wrap")
    public String wrap(){
        return "wap.html";
    }

    @GetMapping("/nodelaymenu")
    public String noDelayMenu(){
        return "no_delay_menu.html";
    }

    @GetMapping("/blur")
    public String blur(){
        return "blur.html";
    }

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("codeurl", "https://www.baidu.com");
        return "qr.html";
    }

    //显示二维码图片, 这个地址配在img的src下
    @RequestMapping("/qr-img")
    @ResponseBody
    public void getQRCode(String code_url, HttpServletResponse response) {
        encodeQrcode(code_url, response);
    }

    //不保存二维码图片,以流的形式返回
    private void encodeQrcode(String content, HttpServletResponse response) {
        if (StringUtils.isEmpty(content))        return;
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        Map hints = new HashMap();
        //设置字符集编码类型
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        //设置二维码四周的白色边框 ,默认是4,默认为4的时候白色边框实在是太粗了
        hints.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 169, 157, hints);
            BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);
            //输出二维码图片流
            try {
                ImageIO.write(image, "png", response.getOutputStream());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (WriterException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}
