package org.bouncycastle.pqc.crypto.mldsa;

import l.C16014;
import l.C5368;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVecMatrix {
    public final PolyVecL[] matrix;

    public PolyVecMatrix(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.matrix = new PolyVecL[dilithiumK];
        for (int i = 0; i < dilithiumK; i++) {
            this.matrix[i] = new PolyVecL(mLDSAEngine);
        }
    }

    public void expandMatrix(byte[] bArr) {
        int i = 0;
        while (true) {
            PolyVecL[] polyVecLArr = this.matrix;
            if (i >= polyVecLArr.length) {
                return;
            }
            polyVecLArr[i].uniformBlocks(bArr, i << 8);
            i++;
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i = 0; i < this.matrix.length; i++) {
            polyVecK.getVectorIndex(i).pointwiseAccountMontgomery(this.matrix[i], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }

    private String addString() {
        String strM37867 = "[";
        int i = 0;
        while (i < this.matrix.length) {
            StringBuilder sbM15339 = C5368.m15339(strM37867 + "Outer Matrix " + i + " [");
            sbM15339.append(this.matrix[i].toString());
            String string = sbM15339.toString();
            strM37867 = i == this.matrix.length + (-1) ? C16014.m37867(string, "]\n") : C16014.m37867(string, "],\n");
            i++;
        }
        return C16014.m37867(strM37867, "]\n");
    }
}
