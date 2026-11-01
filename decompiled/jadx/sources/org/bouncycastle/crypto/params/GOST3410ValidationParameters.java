package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c */
    public int f81263c;

    /* JADX INFO: renamed from: cL */
    public long f81264cL;

    /* JADX INFO: renamed from: x0 */
    public int f81265x0;
    public long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f81265x0 = i;
        this.f81263c = i2;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f81264cL = j2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f81263c == this.f81263c && gOST3410ValidationParameters.f81265x0 == this.f81265x0 && gOST3410ValidationParameters.f81264cL == this.f81264cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f81263c;
    }

    public long getCL() {
        return this.f81264cL;
    }

    public int getX0() {
        return this.f81265x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f81265x0 ^ this.f81263c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f81264cL;
        return (i2 ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }
}
