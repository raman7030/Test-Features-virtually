package org.bouncycastle.pqc.crypto.mayo;

import com.umeng.commonsdk.statistics.UMErrorCode;
import l.EnumC17734;

/* JADX INFO: loaded from: classes2.dex */
public class MayoParameters {
    public static final MayoParameters mayo1 = new MayoParameters("MAYO_1", 86, 78, 5, 8, 78, 81, 10, 39, 312, 39, 40, 120159, 24336, 24, 1420, 454, new int[]{8, 1, 1, 0}, 24, 32, 24);
    public static final MayoParameters mayo2 = new MayoParameters("MAYO_2", 81, 64, 4, 17, 64, 69, 4, 32, 544, 32, 34, 66560, 34816, 24, 4912, 186, new int[]{8, 0, 2, 8}, 24, 32, 24);
    public static final MayoParameters mayo3 = new MayoParameters("MAYO_3", 118, 108, 7, 10, 108, UMErrorCode.E_UM_BE_CREATE_FAILED, 11, 54, 540, 54, 55, 317844, 58320, 32, 2986, 681, new int[]{8, 0, 1, 7}, 32, 48, 32);
    public static final MayoParameters mayo5 = new MayoParameters("MAYO_5", EnumC17734.f54268, 142, 9, 12, 142, 145, 12, 71, 852, 71, 72, 720863, 120984, 40, 5554, 964, new int[]{4, 0, 8, 1}, 40, 64, 40);
    public static final int pkSeedBytes = 16;
    public final int ACols;
    public final int OBytes;
    public final int P1Bytes;
    public final int P2Bytes;
    public final int cpkBytes;
    public final int cskBytes;
    public final int digestBytes;
    public final int[] fTail;
    public final int k;
    public final int m;
    public final int mBytes;
    public final int mVecLimbs;
    public final int n;
    public final String name;
    public final int o;
    public final int rBytes;
    public final int saltBytes;
    public final int sigBytes;
    public final int skSeedBytes;
    public final int v;
    public final int vBytes;

    public MayoParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int i17, int i18, int i19) {
        this.name = str;
        this.n = i;
        this.m = i2;
        this.mVecLimbs = i3;
        this.o = i4;
        this.v = i5;
        this.ACols = i6;
        this.k = i7;
        this.mBytes = i8;
        this.OBytes = i9;
        this.vBytes = i10;
        this.rBytes = i11;
        this.P1Bytes = i12;
        this.P2Bytes = i13;
        this.cskBytes = i14;
        this.cpkBytes = i15;
        this.sigBytes = i16;
        this.fTail = iArr;
        this.saltBytes = i17;
        this.digestBytes = i18;
        this.skSeedBytes = i19;
    }

    public int getACols() {
        return this.ACols;
    }

    public int getCpkBytes() {
        return this.cpkBytes;
    }

    public int getCskBytes() {
        return this.cskBytes;
    }

    public int getDigestBytes() {
        return this.digestBytes;
    }

    public int[] getFTail() {
        return this.fTail;
    }

    public int getK() {
        return this.k;
    }

    public int getM() {
        return this.m;
    }

    public int getMBytes() {
        return this.mBytes;
    }

    public int getMVecLimbs() {
        return this.mVecLimbs;
    }

    public int getN() {
        return this.n;
    }

    public String getName() {
        return this.name;
    }

    public int getO() {
        return this.o;
    }

    public int getOBytes() {
        return this.OBytes;
    }

    public int getP1Bytes() {
        return this.P1Bytes;
    }

    public int getP1Limbs() {
        int i = this.v;
        return (((i + 1) * i) >> 1) * this.mVecLimbs;
    }

    public int getP2Bytes() {
        return this.P2Bytes;
    }

    public int getP2Limbs() {
        return this.v * this.o * this.mVecLimbs;
    }

    public int getP3Limbs() {
        int i = this.o;
        return (((i + 1) * i) >> 1) * this.mVecLimbs;
    }

    public int getPkSeedBytes() {
        return 16;
    }

    public int getRBytes() {
        return this.rBytes;
    }

    public int getSaltBytes() {
        return this.saltBytes;
    }

    public int getSigBytes() {
        return this.sigBytes;
    }

    public int getSkSeedBytes() {
        return this.skSeedBytes;
    }

    public int getV() {
        return this.v;
    }

    public int getVBytes() {
        return this.vBytes;
    }
}
