package com.amazonaws.regions;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Region {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f407;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f408 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f405 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f406 = new HashMap();

    public Region(String str) {
        this.f407 = str;
    }

    public final int hashCode() {
        return this.f407.hashCode();
    }

    public final String toString() {
        return this.f407;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m416() {
        return this.f407;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap m417() {
        return this.f408;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap m414() {
        return this.f405;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap m415() {
        return this.f406;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m418() {
        return (String) this.f408.get("s3");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Region) {
            return this.f407.equals(((Region) obj).f407);
        }
        return false;
    }
}
