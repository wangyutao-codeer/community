package com.kaikeba.community.controller;

import com.kaikeba.community.pojo.AccessToken;
import com.kaikeba.community.pojo.GithubUser;
import com.kaikeba.community.provider.GithubProvider;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,
                           @RequestParam(name="state") String state){
        AccessToken accessTokenDto = new AccessToken();
        accessTokenDto.setClient_id("Iv1.38c318ed646369ac");
        accessTokenDto.setClient_secret("ca6649758badda23120d58995385dc11f5203f86");
        accessTokenDto.setCode(code);
        accessTokenDto.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDto.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDto);
        System.out.println(accessToken);
        GithubUser user = githubProvider.getUser(accessToken);
//        System.out.println(user.getId());
//        System.out.println(user.getName());
        return "index";
    }


}
