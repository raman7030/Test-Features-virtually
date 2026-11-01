package p067l;

/* JADX INFO: renamed from: l.֫ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4028 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        int iM31222 = ((C13731) c17613.m40106()).m31222();
        int[] iArr = (int[]) ((C13731) c17613.m40106()).m31229();
        byte[] bArr = (byte[]) ((C13731) c17613.m40106()).m31229();
        int i = iM31222 * 4;
        while (iM31222 < iArr.length) {
            int i2 = iArr[iM31222];
            int i3 = ~i2;
            bArr[i] = (byte) (i3 & 255);
            bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
            int i4 = i + 3;
            bArr[i + 2] = (byte) ((i3 >>> 16) & 255);
            i += 4;
            bArr[i4] = (byte) ((i2 >>> 24) & 255);
            iM31222++;
        }
    }
}
