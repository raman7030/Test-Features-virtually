package p067l;

/* JADX INFO: renamed from: l.ۨ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13781 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC15121 m31412(C14192 c14192) throws C14862 {
        int iM28125 = c14192.m28125();
        EnumC5734 enumC5734 = (EnumC5734) C16873.m38440(iM28125, EnumC5734.class, null);
        if (enumC5734 == null) {
            throw new IllegalStateException(C20778.m46922(iM28125, "Encountered unknown AvId: "));
        }
        switch (C8416.f22564[enumC5734.ordinal()]) {
            case 1:
                C12440 c12440 = new C12440();
                c14192.m28125();
                return c12440;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C9757 c9757 = new C9757(enumC5734);
                c9757.f43177 = c14192.m28098(c14192.m28125() / 2, C10169.f28135);
                return c9757;
            case 8:
                C24509 c24509 = new C24509();
                c14192.m28125();
                c24509.f43177 = Long.valueOf(c14192.m28107());
                return c24509;
            case 9:
                C4134 c4134 = new C4134();
                c14192.m28125();
                c4134.f43177 = C15494.m35260(c14192);
                return c4134;
            case 10:
                C15791 c15791 = new C15791(EnumC5734.MsvAvSingleHost);
                c15791.m35856(c14192);
                return c15791;
            case 11:
                C14451 c14451 = new C14451(EnumC5734.MsvAvChannelBindings);
                int iM28126 = c14192.m28125();
                byte[] bArr = new byte[iM28126];
                c14192.m28112(iM28126, bArr);
                c14451.f43177 = bArr;
                return c14451;
            default:
                throw new IllegalStateException("Encountered unhandled AvId: " + enumC5734);
        }
    }
}
