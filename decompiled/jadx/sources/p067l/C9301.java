package p067l;

/* JADX INFO: renamed from: l.۟ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8EC */
/* JADX INFO: loaded from: classes2.dex */
public final class C9301 {
    /* JADX INFO: renamed from: ֫ */
    public static int m21512(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i4 + i;
        int i6 = i3 + i;
        while (i6 < i5 && bArr[i6] == bArr[i6 - i2]) {
            i6++;
        }
        return i6 - i;
    }
}
