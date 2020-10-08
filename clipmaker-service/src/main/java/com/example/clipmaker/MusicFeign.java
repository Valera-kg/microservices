package com.example.clipmaker;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//Feign интерфейс для связи с методом контроллера MusicController
@FeignClient("eureka-client-zuul-api-gateway-server")
@RibbonClient("eureka-client-music")
public interface MusicFeign {
    @GetMapping("/eureka-client-music/music")
    List<Clip> retrieveMusic();
}
