package com.example.clipmaker;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("eureka-client-zuul-api-gateway-server")
@RibbonClient("eureka-client-film")
public interface FilmFeign {
    @GetMapping("/eureka-client-film/film")
    List<Clip> retrieveFilm();
}
