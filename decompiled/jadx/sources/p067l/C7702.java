package p067l;

/* JADX INFO: renamed from: l.ۚ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A9TM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7702 {
    /* JADX INFO: renamed from: ֫ */
    public static int m17837(InterfaceC3678 interfaceC3678, byte[] bArr) {
        int length = bArr.length;
        int i = interfaceC3678.read(bArr, 0, length);
        if (i == -1) {
            return -1;
        }
        int i2 = length - i;
        while (i2 > 0) {
            int i3 = interfaceC3678.read(bArr, i, i2);
            if (i3 == -1) {
                return i;
            }
            i += i3;
            i2 -= i3;
        }
        if (i != bArr.length) {
            throw new AssertionError();
        }
        return i;
    }
}
