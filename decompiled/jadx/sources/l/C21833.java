package l;

/* JADX INFO: renamed from: l.᩸᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes.dex */
public final class C21833 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f69944;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f69945;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f69946;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String[] f69947;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f69948;

    public C21833(C22538 c22538) {
        byte[] bArr = new byte[0];
        this.f69945 = bArr;
        this.f69944 = c22538.f72923.m23221();
        this.f69948 = new int[0];
        this.f69946 = new int[0];
        this.f69947 = new String[c22538.f72922.size()];
        System.arraycopy(c22538.f72919, 0, bArr, 0, 0);
        for (C15481 c15481 : c22538.f72921.values()) {
            int[] iArr = this.f69948;
            c15481.getClass();
            iArr[0] = 0;
            this.f69946[0] = 0;
        }
        c22538.f72922.toArray(this.f69947);
        for (Integer num : c22538.f72920) {
            int iIntValue = num.intValue();
            byte[] bArr2 = this.f69944;
            short s = (short) ((bArr2[iIntValue] & 255) | ((bArr2[iIntValue + 1] & 255) << 8));
            int iIntValue2 = num.intValue();
            ((C15481) c22538.f72921.get(Short.valueOf(s))).getClass();
            byte[] bArr3 = this.f69944;
            byte b = (byte) 0;
            bArr3[iIntValue2] = b;
            bArr3[iIntValue2 + 1] = b;
            bArr3[iIntValue2 + 2] = b;
            bArr3[iIntValue2 + 3] = b;
        }
    }

    public C21833(byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f69945 = bArr;
        this.f69944 = bArr2;
        this.f69948 = iArr;
        this.f69946 = iArr2;
        this.f69947 = strArr;
    }
}
