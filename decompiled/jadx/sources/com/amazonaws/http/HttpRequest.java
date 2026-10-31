package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream f193;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f194;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f195;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public URI f196;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f197;

    public HttpRequest(String str, URI uri, HashMap map, InputStream inputStream) {
        String upperCase;
        Charset charset = StringUtils.f844;
        if (str == null) {
            upperCase = null;
        } else {
            upperCase = str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
        }
        this.f197 = upperCase;
        this.f196 = uri;
        this.f194 = C20195.unmodifiableMap(map);
        this.f193 = inputStream;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m264() {
        return this.f197;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final URI m263() {
        return this.f196;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map m262() {
        return this.f194;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m258() {
        return this.f193;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m260() {
        String str;
        Map map = this.f194;
        if (map == null || (str = (String) map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m261() {
        return this.f195;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m259(boolean z) {
        this.f195 = z;
    }
}
