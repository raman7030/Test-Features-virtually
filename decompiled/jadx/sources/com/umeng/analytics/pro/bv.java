package com.umeng.analytics.pro;

/* JADX INFO: compiled from: N4IZ */
/* JADX INFO: loaded from: classes.dex */
public class bv extends bb {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final long h = 1;
    public int g;

    public bv() {
        this.g = 0;
    }

    public bv(int i) {
        this.g = i;
    }

    public bv(int i, String str) {
        super(str);
        this.g = i;
    }

    public bv(String str) {
        super(str);
        this.g = 0;
    }

    public bv(int i, Throwable th) {
        super(th);
        this.g = i;
    }

    public bv(Throwable th) {
        super(th);
        this.g = 0;
    }

    public bv(String str, Throwable th) {
        super(str, th);
        this.g = 0;
    }

    public bv(int i, String str, Throwable th) {
        super(str, th);
        this.g = i;
    }

    public int a() {
        return this.g;
    }
}
