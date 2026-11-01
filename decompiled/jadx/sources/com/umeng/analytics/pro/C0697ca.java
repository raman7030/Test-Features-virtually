package com.umeng.analytics.pro;

import java.util.BitSet;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ca */
/* JADX INFO: compiled from: A5F3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697ca extends C0684bo {

    /* JADX INFO: renamed from: com.umeng.analytics.pro.ca$a */
    /* JADX INFO: compiled from: A5F3 */
    public class a implements InterfaceC0692bw {
        @Override // com.umeng.analytics.pro.InterfaceC0692bw
        /* JADX INFO: renamed from: a */
        public AbstractC0690bu mo2402a(AbstractC0705ci abstractC0705ci) {
            return new C0697ca(abstractC0705ci);
        }
    }

    public C0697ca(AbstractC0705ci abstractC0705ci) {
        super(abstractC0705ci);
    }

    @Override // com.umeng.analytics.pro.AbstractC0690bu
    /* JADX INFO: renamed from: D */
    public Class mo2427D() {
        return AbstractC0702cf.class;
    }

    /* JADX INFO: renamed from: a */
    public void m2435a(BitSet bitSet, int i) {
        for (byte b : m2434b(bitSet, i)) {
            mo2360a(b);
        }
    }

    /* JADX INFO: renamed from: b */
    public BitSet m2436b(int i) {
        int iCeil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i2 = 0; i2 < iCeil; i2++) {
            bArr[i2] = mo2396u();
        }
        return m2433a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static BitSet m2433a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < bArr.length * 8; i++) {
            if ((bArr[(bArr.length - (i / 8)) - 1] & (1 << (i % 8))) > 0) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m2434b(BitSet bitSet, int i) {
        int iCeil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int i3 = (iCeil - (i2 / 8)) - 1;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        return bArr;
    }
}
