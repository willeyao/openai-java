package com.theokanning.openai.client.azure;

import com.theokanning.openai.client.AuthenticationInterceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * OkHttp Interceptor that adds an authorization token header
 */
public class AzureAuthenticationInterceptor extends AuthenticationInterceptor {

    public AzureAuthenticationInterceptor(String token) {
        super(token);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request()
                .newBuilder()
                .header("api-key", token)
                .build();
        return chain.proceed(request);
    }
}
