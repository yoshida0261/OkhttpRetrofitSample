package com.starcompany.githubcontri.api.service;

import android.support.annotation.NonNull;

import com.starcompany.githubcontri.api.response.Contributor;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GithubService {

    @GET("/repos/{owner}/{repo}/contributors")
    List<Contributor> getContributors(@Path("owner") @NonNull String owner, @Path("repo") @NonNull String repo,
                                      @Query("anon") int anon, @Query("per_page") int perPage);

}
