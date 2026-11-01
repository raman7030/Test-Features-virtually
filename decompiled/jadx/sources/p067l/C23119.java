package p067l;

/* JADX INFO: renamed from: l.᩸᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes.dex */
public final class C23119 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f72653;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f72654;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f72655;

    /* JADX INFO: renamed from: ܿ */
    public final String[] f72656;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f72657;

    public C23119(C23789 c23789) {
        byte[] bArr = new byte[0];
        this.f72654 = bArr;
        this.f72653 = c23789.f75650.m25165();
        this.f72657 = new int[0];
        this.f72655 = new int[0];
        this.f72656 = new String[c23789.f75649.size()];
        System.arraycopy(c23789.f75646, 0, bArr, 0, 0);
        for (C17082 c17082 : c23789.f75648.values()) {
            int[] iArr = this.f72657;
            c17082.getClass();
            iArr[0] = 0;
            this.f72655[0] = 0;
        }
        c23789.f75649.toArray(this.f72656);
        for (Integer num : c23789.f75647) {
            int iIntValue = num.intValue();
            byte[] bArr2 = this.f72653;
            short s = (short) ((bArr2[iIntValue] & 255) | ((bArr2[iIntValue + 1] & 255) << 8));
            int iIntValue2 = num.intValue();
            ((C17082) c23789.f75648.get(Short.valueOf(s))).getClass();
            byte[] bArr3 = this.f72653;
            byte b = (byte) 0;
            bArr3[iIntValue2] = b;
            bArr3[iIntValue2 + 1] = b;
            bArr3[iIntValue2 + 2] = b;
            bArr3[iIntValue2 + 3] = b;
        }
    }

    public C23119(byte[] bArr, byte[] bArr2, int[] iArr, int[] iArr2, String[] strArr) {
        this.f72654 = bArr;
        this.f72653 = bArr2;
        this.f72657 = iArr;
        this.f72655 = iArr2;
        this.f72656 = strArr;
    }
}
