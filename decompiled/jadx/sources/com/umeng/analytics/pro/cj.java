package com.umeng.analytics.pro;

/* JADX INFO: compiled from: N5KW */
/* JADX INFO: loaded from: classes.dex */
public class cj extends bb {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final long g = 1;
    public int f;

    public cj() {
        this.f = 0;
    }

    public cj(int i) {
        this.f = i;
    }

    public cj(int i, String str) {
        super(str);
        this.f = i;
    }

    public cj(String str) {
        super(str);
        this.f = 0;
    }

    public cj(int i, Throwable th) {
        super(th);
        this.f = i;
    }

    public cj(Throwable th) {
        super(th);
        this.f = 0;
    }

    public cj(String str, Throwable th) {
        super(str, th);
        this.f = 0;
    }

    public cj(int i, String str, Throwable th) {
        super(str, th);
        this.f = i;
    }

    public int a() {
        return this.f;
    }
}
