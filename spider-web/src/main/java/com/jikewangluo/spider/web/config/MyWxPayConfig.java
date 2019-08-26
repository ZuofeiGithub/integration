package com.jikewangluo.spider.web.config;

import com.github.wxpay.sdk.WXPayConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @content:
 * @auther: 左飞
 * @date: 2019/8/22 17:14
 */
public class MyWxPayConfig implements WXPayConfig {
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
    public String getAppID() {
        return null;
    }

    @Override
    public String getMchID() {
        return null;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 0;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 0;
    }
}
