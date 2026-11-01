package org.bouncycastle.pqc.crypto.mldsa;

import p067l.C17588;
import p067l.C7470;

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
        String strM40053 = "[";
        int i = 0;
        while (i < this.matrix.length) {
            StringBuilder sbM17248 = C7470.m17248(strM40053 + "Outer Matrix " + i + " [");
            sbM17248.append(this.matrix[i].toString());
            String string = sbM17248.toString();
            strM40053 = i == this.matrix.length + (-1) ? C17588.m40053(string, "]\n") : C17588.m40053(string, "],\n");
            i++;
        }
        return C17588.m40053(strM40053, "]\n");
    }
}
