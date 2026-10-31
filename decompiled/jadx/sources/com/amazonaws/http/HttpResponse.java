package com.amazonaws.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream f198;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f199;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream f200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f201;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f202;

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f201 = str;
        this.f202 = i;
        this.f199 = map;
        this.f200 = inputStream;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m267() {
        return this.f199;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m266() {
        if (this.f198 == null) {
            synchronized (this) {
                if (this.f200 != null && "gzip".equals(this.f199.get("Content-Encoding"))) {
                    this.f198 = new GZIPInputStream(this.f200);
                } else {
                    this.f198 = this.f200;
                }
            }
        }
        return this.f198;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream m268() {
        return this.f200;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m269() {
        return this.f201;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m270() {
        return this.f202;
    }

    public class Builder {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public InputStream f203;

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final HashMap f204 = new HashMap();

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public int f205;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public String f206;

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m274(String str) {
            this.f206 = str;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m272(int i) {
            this.f205 = i;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m273(InputStream inputStream) {
            this.f203 = inputStream;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m275(String str, String str2) {
            this.f204.put(str, str2);
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final HttpResponse m271() {
            return new HttpResponse(this.f206, this.f205, C20195.unmodifiableMap(this.f204), this.f203);
        }
    }
}
