package com.amazonaws.http;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import p067l.C24104;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestFactory {
    /* JADX INFO: renamed from: ֫ */
    public static HttpRequest m1431(DefaultRequest defaultRequest, ClientConfiguration clientConfiguration) {
        boolean z = true;
        String strM1939 = HttpUtils.m1939(defaultRequest.m1354().toString(), defaultRequest.m1361(), true);
        String strM1938 = HttpUtils.m1938(defaultRequest);
        HttpMethodName httpMethodNameM1359 = defaultRequest.m1359();
        boolean z2 = defaultRequest.m1343() != null;
        if (httpMethodNameM1359 == HttpMethodName.POST && !z2) {
            z = false;
        }
        if (strM1938 != null && z) {
            strM1939 = C24104.m53357(strM1939, "?", strM1938);
        }
        HashMap map = new HashMap();
        URI uriM1354 = defaultRequest.m1354();
        String host = uriM1354.getHost();
        if (HttpUtils.m1941(uriM1354)) {
            StringBuilder sbM21133 = C9179.m21133(host, ":");
            sbM21133.append(uriM1354.getPort());
            host = sbM21133.toString();
        }
        map.put("Host", host);
        for (Map.Entry entry : defaultRequest.m1357().entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        if (map.get("Content-Type") == null || ((String) map.get("Content-Type")).isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.m1954(C0233a.f1077D));
        }
        InputStream inputStreamM1343 = defaultRequest.m1343();
        HttpMethodName httpMethodName = HttpMethodName.PATCH;
        if (httpMethodNameM1359 == httpMethodName) {
            httpMethodNameM1359 = HttpMethodName.POST;
            map.put("X-HTTP-Method-Override", httpMethodName.toString());
        }
        if (httpMethodNameM1359 == HttpMethodName.POST && defaultRequest.m1343() == null && strM1938 != null) {
            byte[] bytes = strM1938.getBytes(StringUtils.f2004);
            inputStreamM1343 = new ByteArrayInputStream(bytes);
            map.put("Content-Length", String.valueOf(bytes.length));
        }
        clientConfiguration.getClass();
        map.put("Accept-Encoding", "identity");
        HttpRequest httpRequest = new HttpRequest(httpMethodNameM1359.toString(), URI.create(strM1939), map, inputStreamM1343);
        httpRequest.m1425(defaultRequest.m1360());
        return httpRequest;
    }
}
