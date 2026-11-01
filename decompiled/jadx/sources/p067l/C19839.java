package p067l;

/* JADX INFO: renamed from: l.ᩳ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 643C */
/* JADX INFO: loaded from: classes4.dex */
public class C19839 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m45083(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3];
            if (b == 47) {
                bArr2[i3] = 46;
            } else {
                bArr2[i3] = b;
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m45084(AbstractC12224 abstractC12224) {
        byte[] bArrMo5096 = abstractC12224.mo5096();
        int iMo5100 = abstractC12224.mo5100();
        int iMo5098 = abstractC12224.mo5098();
        byte[] bArr = new byte[iMo5098];
        for (int i = 0; i < iMo5098; i++) {
            byte b = bArrMo5096[iMo5100 + i];
            if (b == 46) {
                bArr[i] = 47;
            } else {
                bArr[i] = b;
            }
        }
        return bArr;
    }
}
