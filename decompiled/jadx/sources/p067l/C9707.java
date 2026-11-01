package p067l;

/* JADX INFO: renamed from: l.۟᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9707 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        int iM31222 = ((C13731) c17613.m40106()).m31222();
        byte[] bArr = (byte[]) ((C13731) c17613.m40106()).m31229();
        int[] iArr = (int[]) ((C13731) c17613.m40106()).m31229();
        int i = iM31222 * 4;
        while (iM31222 < iArr.length) {
            int i2 = ((bArr[i + 1] & 255) << 8) | ((~bArr[i]) & 255);
            int i3 = i + 3;
            int i4 = i2 | (((~bArr[i + 2]) & 255) << 16);
            i += 4;
            iArr[iM31222] = i4 | ((bArr[i3] & 255) << 24);
            iM31222++;
        }
    }
}
