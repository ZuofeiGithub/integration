package com.jikewangluo.zzweb.config;

import com.github.wxpay.sdk.IWXPayDomain;
import com.github.wxpay.sdk.WXPayConfig;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @content:
 * @auther: 左飞
 * @date: 2019/8/22 17:14
 */
public class MyWxPayConfig extends WXPayConfig {
    private byte[] certData;

    public MyWxPayConfig() throws Exception {
        String certPath = "/path/to/apiclient_cert.p12";
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    @Override
    protected String getAppID() {
        return "";
    }



    public String getMchID() {
        return "12888888";
    }

    public String getKey() {
        return "88888888888888888888888888888888";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    @Override
    protected IWXPayDomain getWXPayDomain() {
        return null;
    }
}
