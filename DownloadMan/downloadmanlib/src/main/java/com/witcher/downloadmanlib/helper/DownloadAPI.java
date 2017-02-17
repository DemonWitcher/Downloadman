package com.witcher.downloadmanlib.helper;


import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by witcher on 2017/2/9 0009.
 */

public interface DownloadAPI {
    @Streaming
    @GET
    Observable<Response<ResponseBody>> download(@Header("Range") String range, @Url String url);
    @HEAD
    Observable<Response<Void>> getHttpHeader(@Url String url);
}
