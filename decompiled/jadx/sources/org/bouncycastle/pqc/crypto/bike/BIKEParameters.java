package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes2.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    public BIKEEngine bikeEngine;
    public final int defaultKeySize;

    /* JADX INFO: renamed from: l */
    public int f81574l;
    public String name;
    public int nbIter;

    /* JADX INFO: renamed from: r */
    public int f81575r;

    /* JADX INFO: renamed from: t */
    public int f81576t;
    public int tau;

    /* JADX INFO: renamed from: w */
    public int f81577w;

    public BIKEParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.name = str;
        this.f81575r = i;
        this.f81577w = i2;
        this.f81576t = i3;
        this.f81574l = i4;
        this.nbIter = i5;
        this.tau = i6;
        this.defaultKeySize = i7;
        this.bikeEngine = new BIKEEngine(i, i2, i3, i4, i5, i6);
    }

    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f81574l;
    }

    public int getLByte() {
        return this.f81574l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f81575r;
    }

    public int getRByte() {
        return (this.f81575r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f81576t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f81577w;
    }
}
