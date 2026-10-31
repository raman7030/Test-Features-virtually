package l;

/* JADX INFO: renamed from: l.᩵֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAG5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19149 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44214(AbstractC0803 abstractC0803) {
        C0097 c0097Mo3027 = abstractC0803.mo3027();
        int iM26083 = c0097Mo3027.m26083();
        c0097Mo3027.m26097(abstractC0803.mo3028().mo14552());
        int iMo14554 = abstractC0803.mo3028().mo14554() - abstractC0803.mo3028().mo14552();
        byte[] bArr = new byte[iMo14554];
        try {
            c0097Mo3027.m26087(iMo14554, bArr);
            c0097Mo3027.m26097(iM26083);
            return bArr;
        } catch (C13146 e) {
            throw new C10951("Cannot read packet bytes from buffer", e);
        }
    }
}
