package l;

/* JADX INFO: renamed from: l.۟᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7721 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        int iM29168 = ((C11955) c16040.m37919()).m29168();
        byte[] bArr = (byte[]) ((C11955) c16040.m37919()).m29175();
        int[] iArr = (int[]) ((C11955) c16040.m37919()).m29175();
        int i = iM29168 * 4;
        while (iM29168 < iArr.length) {
            int i2 = ((bArr[i + 1] & 255) << 8) | ((~bArr[i]) & 255);
            int i3 = i + 3;
            int i4 = i2 | (((~bArr[i + 2]) & 255) << 16);
            i += 4;
            iArr[iM29168] = i4 | ((bArr[i3] & 255) << 24);
            iM29168++;
        }
    }
}
