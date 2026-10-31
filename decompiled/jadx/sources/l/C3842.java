package l;

/* JADX INFO: renamed from: l.ۘۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes3.dex */
public final class C3842 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        C11955 c11955 = new C11955();
        try {
            int iM29168 = ((C11955) c16040.m37919()).m29168();
            C8595 c8595 = (C8595) ((C11955) c16040.m37919()).m29175();
            c8595.getClass();
            byte[] bArr = new byte[iM29168];
            for (int i = 0; i < iM29168; i++) {
                bArr[i] = (byte) (c8595.m22306() & 255);
            }
            c11955.m29154(bArr);
        } catch (Exception unused) {
        }
        c16040.m37918(c11955);
    }
}
