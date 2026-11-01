package org.bouncycastle.pqc.crypto.crystals.dilithium;

import p067l.C17588;
import p067l.C7470;

/* JADX INFO: loaded from: classes2.dex */
public class PolyVecMatrix {
    public final int dilithiumK;
    public final int dilithiumL;
    public final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i = 0; i < this.dilithiumK; i++) {
            this.mat[i] = new PolyVecL(dilithiumEngine);
        }
    }

    public void expandMatrix(byte[] bArr) {
        for (int i = 0; i < this.dilithiumK; i++) {
            for (int i2 = 0; i2 < this.dilithiumL; i2++) {
                this.mat[i].getVectorIndex(i2).uniformBlocks(bArr, (short) ((i << 8) + i2));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumK; i++) {
            polyVecK.getVectorIndex(i).pointwiseAccountMontgomery(this.mat[i], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }

    private String addString() {
        String strM40053 = "[";
        int i = 0;
        while (i < this.dilithiumK) {
            StringBuilder sbM17248 = C7470.m17248(strM40053 + "Outer Matrix " + i + " [");
            sbM17248.append(this.mat[i].toString());
            String string = sbM17248.toString();
            strM40053 = i == this.dilithiumK + (-1) ? C17588.m40053(string, "]\n") : C17588.m40053(string, "],\n");
            i++;
        }
        return C17588.m40053(strM40053, "]\n");
    }
}
