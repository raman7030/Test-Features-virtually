package p067l;

/* JADX INFO: renamed from: l.᩵֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAG5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20567 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46508(AbstractC3131 abstractC3131) {
        C2460 c2460Mo5340 = abstractC3131.mo5340();
        int iM28108 = c2460Mo5340.m28108();
        c2460Mo5340.m28122(abstractC3131.mo5341().mo16456());
        int iMo16458 = abstractC3131.mo5341().mo16458() - abstractC3131.mo5341().mo16456();
        byte[] bArr = new byte[iMo16458];
        try {
            c2460Mo5340.m28112(iMo16458, bArr);
            c2460Mo5340.m28122(iM28108);
            return bArr;
        } catch (C14862 e) {
            throw new C12776("Cannot read packet bytes from buffer", e);
        }
    }
}
