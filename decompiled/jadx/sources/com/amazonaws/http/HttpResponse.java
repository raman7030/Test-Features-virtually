package com.amazonaws.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: ֫ */
    public InputStream f1358;

    /* JADX INFO: renamed from: ۧ */
    public final Map f1359;

    /* JADX INFO: renamed from: ܽ */
    public final InputStream f1360;

    /* JADX INFO: renamed from: ܿ */
    public final String f1361;

    /* JADX INFO: renamed from: ᩳ */
    public final int f1362;

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f1361 = str;
        this.f1362 = i;
        this.f1359 = map;
        this.f1360 = inputStream;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Map m1433() {
        return this.f1359;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m1432() {
        if (this.f1358 == null) {
            synchronized (this) {
                if (this.f1360 != null && "gzip".equals(this.f1359.get("Content-Encoding"))) {
                    this.f1358 = new GZIPInputStream(this.f1360);
                } else {
                    this.f1358 = this.f1360;
                }
            }
        }
        return this.f1358;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InputStream m1434() {
        return this.f1360;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m1435() {
        return this.f1361;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m1436() {
        return this.f1362;
    }

    public class Builder {

        /* JADX INFO: renamed from: ֫ */
        public InputStream f1363;

        /* JADX INFO: renamed from: ۧ */
        public final HashMap f1364 = new HashMap();

        /* JADX INFO: renamed from: ܽ */
        public int f1365;

        /* JADX INFO: renamed from: ᩳ */
        public String f1366;

        /* JADX INFO: renamed from: ֫ */
        public final void m1440(String str) {
            this.f1366 = str;
        }

        /* JADX INFO: renamed from: ֫ */
        public final void m1438(int i) {
            this.f1365 = i;
        }

        /* JADX INFO: renamed from: ֫ */
        public final void m1439(InputStream inputStream) {
            this.f1363 = inputStream;
        }

        /* JADX INFO: renamed from: ֫ */
        public final void m1441(String str, String str2) {
            this.f1364.put(str, str2);
        }

        /* JADX INFO: renamed from: ֫ */
        public final HttpResponse m1437() {
            return new HttpResponse(this.f1366, this.f1365, C21562.unmodifiableMap(this.f1364), this.f1363);
        }
    }
}
