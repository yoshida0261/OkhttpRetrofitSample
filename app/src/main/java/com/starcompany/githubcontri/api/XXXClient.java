package com.starcompany.githubcontri.api;

import com.starcompany.githubcontri.api.response.Contributor;
import com.starcompany.githubcontri.api.service.GithubService;

import java.util.List;

public class XXXClient {
    private static final int INCLUDE_ANONYMOUS = 1;

    private static final int MAX_PER_PAGE = 100;


    private GithubService mGithubService;

    /**
     *
     * @param githubService ここでinjection
     */
    public XXXClient(GithubService githubService){
        mGithubService = githubService;
    }

    public List<Contributor> getContributor(){
        return mGithubService.getContributors("DroidKaigi", "conference-app-2017", INCLUDE_ANONYMOUS, MAX_PER_PAGE);
    }


}
