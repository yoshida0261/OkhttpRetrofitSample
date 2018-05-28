package com.starcompany.githubcontri;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.starcompany.githubcontri.api.XXXClient;
import com.starcompany.githubcontri.api.response.Contributor;
import com.starcompany.githubcontri.api.service.GithubService;

import java.util.List;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpClientModule httpClientModule = new HttpClientModule();
        OkHttpClient client = httpClientModule.provideHttpClient(this, null);
        NetWorkModule netWorkModule = new NetWorkModule();
        GithubService githubService = netWorkModule.provideGithubService(client);
        /*
        XXXClient xxxClient = new XXXClient(githubService);
        */
        XXXClient xxxClient = new XXXClient(new GithubService() {
            @Override
            public List<Contributor> getContributors(@NonNull String owner, @NonNull String repo, int anon, int perPage) {
                return null; // ダミーの値
            }
        });

        List<Contributor> result = xxxClient.getContributor();


    }
}
