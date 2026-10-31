package com.amazonaws.http;

import com.alipay.sdk.m.w.a;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import l.C22870;
import l.C7166;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestFactory {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HttpRequest m265(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z = true;
        String strM774 = HttpUtils.m774(defaultRequest.m188().toString(), defaultRequest.m195(), true);
        String strM773 = HttpUtils.m773(defaultRequest);
        HttpMethodName httpMethodNameM193 = defaultRequest.m193();
        boolean z2 = defaultRequest.m177() != null;
        if (httpMethodNameM193 == HttpMethodName.POST && !z2) {
            z = false;
        }
        if (strM773 != null && z) {
            strM774 = C22870.m50967(strM774, "?", strM773);
        }
        HashMap map = new HashMap();
        URI uriM188 = defaultRequest.m188();
        String host = uriM188.getHost();
        if (HttpUtils.m776(uriM188)) {
            StringBuilder sbM19190 = C7166.m19190(host, ":");
            sbM19190.append(uriM188.getPort());
            host = sbM19190.toString();
        }
        map.put("Host", host);
        for (Map.Entry entry : defaultRequest.m191().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || ((String) map.get("Content-Type")).isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.m789(a.D));
        }
        InputStream inputStreamM177 = defaultRequest.m177();
        HttpMethodName httpMethodName = HttpMethodName.PATCH;
        if (httpMethodNameM193 == httpMethodName) {
            httpMethodNameM193 = HttpMethodName.POST;
            map.put("X-HTTP-Method-Override", httpMethodName.toString());
        }
        if (httpMethodNameM193 == HttpMethodName.POST && defaultRequest.m177() == null && strM773 != null) {
            byte[] bytes = strM773.getBytes(StringUtils.f844);
            inputStreamM177 = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        map.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodNameM193.toString(), URI.create(strM774), map, inputStreamM177);
        httpRequest.m259(defaultRequest.m194());
        return httpRequest;
    }
}
