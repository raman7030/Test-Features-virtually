package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes2.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    public BIKEEngine bikeEngine;
    public final int defaultKeySize;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77977l;
    public String name;
    public int nbIter;
    public int r;
    public int t;
    public int tau;
    public int w;

    public BIKEParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.name = str;
        this.r = i;
        this.w = i2;
        this.t = i3;
        this.f77977l = i4;
        this.nbIter = i5;
        this.tau = i6;
        this.defaultKeySize = i7;
        this.bikeEngine = new BIKEEngine(i, i2, i3, i4, i5, i6);
    }

    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f77977l;
    }

    public int getLByte() {
        return this.f77977l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.r;
    }

    public int getRByte() {
        return (this.r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.w;
    }
}
