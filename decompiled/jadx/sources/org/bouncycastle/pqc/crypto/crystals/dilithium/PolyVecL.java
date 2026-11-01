package org.bouncycastle.pqc.crypto.crystals.dilithium;

import p067l.C17588;
import p067l.C9179;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVecL {
    public int dilithiumK;
    public int dilithiumL;
    public DilithiumEngine engine;
    public int mode;
    public int polyVecBytes;
    public Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i = 0; i < this.dilithiumL; i++) {
            this.vec[i] = new Poly(dilithiumEngine);
        }
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).addPoly(polyVecL.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.dilithiumL; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            for (int i2 = 0; i2 < 256; i2++) {
                polyVecL.getVectorIndex(i).setCoeffIndex(i2, getVectorIndex(i).getCoeffIndex(i2));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.dilithiumL; i2++) {
            this.vec[i2].uniformBlocks(bArr, (short) ((i << 8) + i2));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        for (int i = 0; i < this.dilithiumL; i++) {
            this.vec[i].polyNtt();
        }
    }

    public void reduce() {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public String toString() {
        String strM40053 = "\n[";
        for (int i = 0; i < this.dilithiumL; i++) {
            strM40053 = strM40053 + "Inner Matrix " + i + " " + getVectorIndex(i).toString();
            if (i != this.dilithiumL - 1) {
                strM40053 = C17588.m40053(strM40053, ",\n");
            }
        }
        return C17588.m40053(strM40053, "]");
    }

    public String toString(String str) {
        StringBuilder sbM21133 = C9179.m21133(str, ": ");
        sbM21133.append(toString());
        return sbM21133.toString();
    }

    public void uniformEta(byte[] bArr, short s) {
        int i = 0;
        while (i < this.dilithiumL) {
            getVectorIndex(i).uniformEta(bArr, s);
            i++;
            s = (short) (s + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).uniformGamma1(bArr, (short) ((this.dilithiumL * s) + i));
        }
    }
}
