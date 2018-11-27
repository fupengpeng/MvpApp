package com.st.c10.model.http.retrofit;


import com.st.c10.bean.UserBean;
import com.st.c10.bean.request.LoginRequest;
import com.st.c10.bean.response.IsOnlineRepBean;
import com.st.c10.bean.response.LoginResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * 网络请求
 */
public interface RetrofitService {


    //    String BASE_URL = "http://192.10.1.225:9001/LayerArchitecture/winpos/uf_stservice_term?";
    String BASE_URL = "https://yun.xiaojiangjiakao.com/";

    /**
     * 收银机联线检测
     *
     * @return
     */
    @FormUrlEncoded
    @POST("")
    Observable<IsOnlineRepBean> isOnline(String req);


    /**
     * 登录
     *
     * @param username
     * @param password
     * @param model
     * @param version_number
     * @param registrationid
     * @return
     */
    @FormUrlEncoded
    @POST("api/user/public/login")
    Observable<LoginResponse> login(
//            @Field("username") String username,
//            @Field("password") String password,
//            @Field("device_type") String model, //登录设备
//            @Field("version_number") String version_number,
//            @Field("registrationid") String registrationid // 极光推送id
            @Body LoginRequest loginRequest
    );

//    /*登录*/
//    @FormUrlEncoded
//    @POST("api/user/public/login")
//    Observable<Result<UserInfo>> login(
//            @Field("username") String username,
//            @Field("password") String password,
//            @Field("device_type") String model, //登录设备
//            @Field("version_number") String version_number,
//            @Field("registrationid") String registrationid // 极光推送id
//    );


    /**
     * 登录
     *
     * @return
     */
    @GET("news/latest")
    Observable<UserBean> initDevice();


}