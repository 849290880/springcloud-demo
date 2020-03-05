package com.example.springclouddemoconfig.servlet;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author created by hai on 2020/2/28
 */
public class CustomHttpServletRequestWrapper extends HttpServletRequestWrapper {

    public CustomHttpServletRequestWrapper(HttpServletRequest servletRequest) {
        super(servletRequest);
    }


    @Override
    public ServletInputStream getInputStream() throws IOException {
        byte[] bytes = new byte[0];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        return new ServletInputStream() {
            @Override
            public boolean isFinished() {
                return byteArrayInputStream.read() == -1 ? true:false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read() throws IOException {
                return byteArrayInputStream.read();
            }
        };
    }



}
