package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Fors {
    public SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    public static int[] message_to_idxs(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i4] = iArr[i4] ^ (((bArr[i3 >> 3] >> (i3 & 7)) & 1) << i5);
                i3++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i2 = sPHINCSPlusEngine.K;
        byte[][] bArr4 = new byte[i2][];
        int i3 = sPHINCSPlusEngine.T;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, i2, sPHINCSPlusEngine.A);
        int i4 = 0;
        while (i4 < this.engine.K) {
            int i5 = iArrMessage_to_idxs[i4];
            byte[] sk = sig_forsArr[i4].getSK();
            adrs.setTreeHeight(0);
            int i6 = (i4 * i3) + i5;
            adrs.setTreeIndex(i6);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i4].getAuthPath();
            adrs.setTreeIndex(i6);
            int i7 = 0;
            while (i7 < this.engine.A) {
                int i8 = i7 + 1;
                adrs.setTreeHeight(i8);
                if ((i5 / (1 << i7)) % i == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i);
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i7]);
                } else {
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i7], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i = 2;
                i7 = i8;
            }
            bArr4[i4] = bArr3[0];
            i4++;
            i = 2;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.K, sPHINCSPlusEngine.A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.K];
        int i = sPHINCSPlusEngine2.T;
        int i2 = 0;
        int i3 = 0;
        while (i3 < fors.engine.K) {
            int i4 = iArrMessage_to_idxs[i3];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(i2);
            int i5 = i3 * i;
            adrs2.setTreeIndex(i5 + i4);
            byte[] bArrPRF = fors.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.changeType(3);
            byte[][] bArr4 = new byte[fors.engine.A][];
            int i6 = 0;
            while (i6 < fors.engine.A) {
                int i7 = 1 << i6;
                int i8 = i6;
                byte[][] bArr5 = bArr4;
                bArr5[i8] = treehash(bArr2, (((i4 / i7) ^ 1) * i7) + i5, i8, bArr3, adrs2);
                i6 = i8 + 1;
                bArrPRF = bArrPRF;
                bArr4 = bArr5;
                fors = this;
            }
            sig_forsArr[i3] = new SIG_FORS(bArrPRF, bArr4);
            i3++;
            i2 = 0;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        if (((i >>> i2) << i2) != i) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i3 = 0; i3 < (1 << i2); i3++) {
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i4 = i + i3;
            adrs2.setTreeIndex(i4);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] bArrF = this.engine.F(bArr2, adrs2, bArrPRF);
            adrs2.setTreeHeight(1);
            int i5 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i5) {
                i4 = (i4 - 1) / 2;
                adrs2.setTreeIndex(i4);
                bArrF = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrF);
                i5++;
                adrs2.setTreeHeight(i5);
            }
            linkedList.add(0, new NodeEntry(bArrF, i5));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
