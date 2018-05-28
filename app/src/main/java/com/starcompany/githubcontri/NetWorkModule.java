package com.starcompany.githubcontri;

import com.starcompany.githubcontri.api.service.GithubService;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkModule {

    public GithubService provideGithubService(OkHttpClient client) {
        return new Retrofit.Builder().client(client)
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);
    }

}
