package com.st.c10.model.http.retrofit;

/**
 *  基础网络访问
 */
public class Api extends BaseApiImpl {

    private static Api api = new Api(RetrofitService.BASE_URL);

    public Api(String baseUrl) {
        super(baseUrl);
    }

    public static RetrofitService getInstance() {
        return api.getRetrofit().create(RetrofitService.class);
    }
}
