package com.starcompany.githubcontri;

import android.content.Context;

import java.io.File;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public class HttpClientModule {

    static final String CACHE_FILE_NAME = "okhttp.cache";

    static final long MAX_CACHE_SIZE = 4 * 1024 * 1024;

    public OkHttpClient provideHttpClient(Context context, Interceptor interceptor) {
        File cacheDir = new File(context.getCacheDir(), CACHE_FILE_NAME);
        Cache cache = new Cache(cacheDir, MAX_CACHE_SIZE);

        OkHttpClient.Builder c = new OkHttpClient.Builder().cache(cache);//.addInterceptor(interceptor);
        return c.build();
    }
}
