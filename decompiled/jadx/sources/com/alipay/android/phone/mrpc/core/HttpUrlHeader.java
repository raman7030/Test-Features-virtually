package com.alipay.android.phone.mrpc.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class HttpUrlHeader implements Serializable {
    public static final long serialVersionUID = -6098125857367743614L;
    public Map headers = new HashMap();

    public String getHead(String str) {
        return (String) this.headers.get(str);
    }

    public Map getHeaders() {
        return this.headers;
    }

    public void setHead(String str, String str2) {
        this.headers.put(str, str2);
    }

    public void setHeaders(Map map) {
        this.headers = map;
    }
}
