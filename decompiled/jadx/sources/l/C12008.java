package l;

/* JADX INFO: renamed from: l.ۨ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12008 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13418 m29354(C12441 c12441) throws C13146 {
        int iM26100 = c12441.m26100();
        EnumC3541 enumC3541 = (EnumC3541) C15262.m36279(iM26100, EnumC3541.class, null);
        if (enumC3541 == null) {
            throw new IllegalStateException(C19370.m44628(iM26100, "Encountered unknown AvId: "));
        }
        switch (C6363.f19691[enumC3541.ordinal()]) {
            case 1:
                C10597 c10597 = new C10597();
                c12441.m26100();
                return c10597;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C7774 c7774 = new C7774(enumC3541);
                c7774.f40108 = c12441.m26073(c12441.m26100() / 2, C8208.f25225);
                return c7774;
            case 8:
                C23296 c23296 = new C23296();
                c12441.m26100();
                c23296.f40108 = Long.valueOf(c12441.m26082());
                return c23296;
            case 9:
                C1858 c1858 = new C1858();
                c12441.m26100();
                c1858.f40108 = C13811.m33143(c12441);
                return c1858;
            case 10:
                C14123 c14123 = new C14123(EnumC3541.MsvAvSingleHost);
                c14123.m33724(c12441);
                return c14123;
            case 11:
                C12713 c12713 = new C12713(EnumC3541.MsvAvChannelBindings);
                int iM26101 = c12441.m26100();
                byte[] bArr = new byte[iM26101];
                c12441.m26087(iM26101, bArr);
                c12713.f40108 = bArr;
                return c12713;
            default:
                throw new IllegalStateException("Encountered unhandled AvId: " + enumC3541);
        }
    }
}
