package p067l;

/* JADX INFO: renamed from: l.ۘۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A63D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6020 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        C13731 c13731 = new C13731();
        try {
            int iM31222 = ((C13731) c17613.m40106()).m31222();
            C10537 c10537 = (C10537) ((C13731) c17613.m40106()).m31229();
            c10537.getClass();
            byte[] bArr = new byte[iM31222];
            for (int i = 0; i < iM31222; i++) {
                bArr[i] = (byte) (c10537.m24275() & 255);
            }
            c13731.m31208(bArr);
        } catch (Exception unused) {
        }
        c17613.m40105(c13731);
    }
}
