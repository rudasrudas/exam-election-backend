package com.example.examelectionbackend.Controllers;

import com.example.examelectionbackend.Entities.Party;
import com.example.examelectionbackend.Services.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RestController
@RequestMapping("/parties")
@CrossOrigin(origins="*")
public class PartyController {
    PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService){
        this.partyService = partyService;
    }

    @GetMapping("")
    public List<Party> getAllParties(){
        return partyService.getAllParties();
    }

    @Bean
    public WebMvcConfigurer configure(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/*").allowedOrigins("https://cinema-backend1.herokuapp.com/");
            }
        };
    }
}
