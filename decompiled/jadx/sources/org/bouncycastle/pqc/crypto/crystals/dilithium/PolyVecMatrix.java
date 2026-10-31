package org.bouncycastle.pqc.crypto.crystals.dilithium;

import l.C16014;
import l.C5368;

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
        String strM37867 = "[";
        int i = 0;
        while (i < this.dilithiumK) {
            StringBuilder sbM15339 = C5368.m15339(strM37867 + "Outer Matrix " + i + " [");
            sbM15339.append(this.mat[i].toString());
            String string = sbM15339.toString();
            strM37867 = i == this.dilithiumK + (-1) ? C16014.m37867(string, "]\n") : C16014.m37867(string, "],\n");
            i++;
        }
        return C16014.m37867(strM37867, "]\n");
    }
}
