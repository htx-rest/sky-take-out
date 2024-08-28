package com.htx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 微信搜索「二哈学习之路」
 * WebSocket配置类，用于注册WebSocket的Bean
 * @author htx
 * @date 2024/8/28 21:19
 */
@Configuration
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}

