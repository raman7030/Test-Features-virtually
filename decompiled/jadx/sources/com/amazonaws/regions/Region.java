package com.amazonaws.regions;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Region {

    /* JADX INFO: renamed from: ܽ */
    public final String f1567;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f1568 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f1565 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f1566 = new HashMap();

    public Region(String str) {
        this.f1567 = str;
    }

    public final int hashCode() {
        return this.f1567.hashCode();
    }

    public final String toString() {
        return this.f1567;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m1582() {
        return this.f1567;
    }

    /* JADX INFO: renamed from: ܿ */
    public final HashMap m1583() {
        return this.f1568;
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashMap m1580() {
        return this.f1565;
    }

    /* JADX INFO: renamed from: ۧ */
    public final HashMap m1581() {
        return this.f1566;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1584() {
        return (String) this.f1568.get("s3");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Region) {
            return this.f1567.equals(((Region) obj).f1567);
        }
        return false;
    }
}
