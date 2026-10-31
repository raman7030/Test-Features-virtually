package org.bouncycastle.pqc.crypto.mldsa;

import l.C16014;
import l.C7166;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVecK {
    public final Poly[] vec;

    public PolyVecK(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.vec = new Poly[dilithiumK];
        for (int i = 0; i < dilithiumK; i++) {
            this.vec[i] = new Poly(mLDSAEngine);
        }
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).addPoly(polyVecK.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.vec.length; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).decompose(polyVecK.getVectorIndex(i));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i = 0; i < this.vec.length; i++) {
            iPolyMakeHint += getVectorIndex(i).polyMakeHint(polyVecK.getVectorIndex(i), polyVecK2.getVectorIndex(i));
        }
        return iPolyMakeHint;
    }

    public void packW1(MLDSAEngine mLDSAEngine, byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.vec.length; i2++) {
            getVectorIndex(i2).packW1(bArr, (mLDSAEngine.getDilithiumPolyW1PackedBytes() * i2) + i);
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].polyNtt();
            i++;
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).power2Round(polyVecK.getVectorIndex(i));
        }
    }

    public void reduce() {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public void setVectorIndex(int i, Poly poly) {
        this.vec[i] = poly;
    }

    public void shiftLeft() {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).subtract(polyVecK.getVectorIndex(i));
        }
    }

    public String toString() {
        String strM37867 = "[";
        for (int i = 0; i < this.vec.length; i++) {
            strM37867 = strM37867 + i + " " + getVectorIndex(i).toString();
            if (i != this.vec.length - 1) {
                strM37867 = C16014.m37867(strM37867, ",\n");
            }
        }
        return C16014.m37867(strM37867, "]");
    }

    public String toString(String str) {
        StringBuilder sbM19190 = C7166.m19190(str, ": ");
        sbM19190.append(toString());
        return sbM19190.toString();
    }

    public void uniformEta(byte[] bArr, short s) {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].uniformEta(bArr, s);
            i++;
            s = (short) (s + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i = 0; i < this.vec.length; i++) {
            getVectorIndex(i).polyUseHint(polyVecK.getVectorIndex(i), polyVecK2.getVectorIndex(i));
        }
    }
}
