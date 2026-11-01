package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: ֫ */
    public final InputStream f1353;

    /* JADX INFO: renamed from: ۧ */
    public final Map f1354;

    /* JADX INFO: renamed from: ܽ */
    public boolean f1355;

    /* JADX INFO: renamed from: ܿ */
    public URI f1356;

    /* JADX INFO: renamed from: ᩳ */
    public final String f1357;

    public HttpRequest(String str, URI uri, HashMap map, InputStream inputStream) {
        String upperCase;
        Charset charset = StringUtils.f2004;
        if (str == null) {
            upperCase = null;
        } else {
            upperCase = str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
        }
        this.f1357 = upperCase;
        this.f1356 = uri;
        this.f1354 = C21562.unmodifiableMap(map);
        this.f1353 = inputStream;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1430() {
        return this.f1357;
    }

    /* JADX INFO: renamed from: ܿ */
    public final URI m1429() {
        return this.f1356;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Map m1428() {
        return this.f1354;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m1424() {
        return this.f1353;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m1426() {
        String str;
        Map map = this.f1354;
        if (map == null || (str = (String) map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m1427() {
        return this.f1355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1425(boolean z) {
        this.f1355 = z;
    }
}
