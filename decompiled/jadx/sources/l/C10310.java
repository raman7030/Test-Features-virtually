package l;

/* JADX INFO: renamed from: l.ۤ۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10310 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26065(CharSequence charSequence, EnumC18531 enumC18531, C3463 c3463, C19237 c19237, boolean z, C19012 c19012) {
        try {
            C18757.m43430();
            C0411 c0411M26063 = m26063(charSequence, enumC18531, c19237);
            if (c0411M26063 == null) {
                c19012.append(charSequence);
            } else {
                C18757.m43430();
                new C15933(c0411M26063, c3463, c19237, z, c19012).m37712();
            }
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C3940 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0411 m26063(CharSequence charSequence, EnumC18531 enumC18531, C19237 c19237) {
        C12426 c12426M26064;
        C12426 c12426M26065 = m26064(charSequence, enumC18531, c19237, null);
        if (c12426M26065 != null && enumC18531 != EnumC18531.JSON && C18051.m42105(c12426M26065.f37416.m6210())) {
            C18051 c18051 = c12426M26065.f37413;
            int i = 0;
            while (true) {
                if (i >= 3 || (c12426M26064 = m26064(charSequence, enumC18531, c19237, c18051)) == null) {
                    c12426M26065 = null;
                    break;
                }
                C18051 c18052 = c12426M26064.f37413;
                if (c18051.m42108(c18052, c12426M26064.f37416.m6210())) {
                    c12426M26065 = c12426M26064;
                    break;
                }
                i++;
                c18051 = c18052;
            }
        }
        if (c12426M26065 == null) {
            return null;
        }
        C0411 c0411 = c12426M26065.f37414;
        c0411.m1933(c12426M26065.f37415);
        c0411.m1934(c0411.f1870);
        return c0411;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12426 m26064(CharSequence charSequence, EnumC18531 enumC18531, C19237 c19237, C18051 c18051) {
        C18757 c18757 = new C18757(charSequence);
        C0185 c0185 = new C0185(c18757);
        c0185.m52393(new C1117(c0185, c18757));
        EnumC18531 enumC18532 = EnumC18531.JSON;
        c0185.m21253(enumC18531 == enumC18532);
        c0185.m21252(c18051);
        c0185.m43458();
        C13131 c13131 = new C13131(c0185, charSequence.length());
        c13131.m6206();
        C0411 c0411 = new C0411(charSequence, c13131, enumC18531, c19237.m44372(), c18051);
        AbstractC3254 c1823 = enumC18531 == enumC18532 ? new C1823(c13131) : new C4665(c13131);
        c1823.m43457(new C8879(c1823, new C23695(c1823.mo1330())));
        c1823.m9952(enumC18531 == EnumC18531.TYPESCRIPT);
        c1823.m9951(c18051);
        c1823.m43458();
        c1823.m43456(c0411);
        c1823.m24564(new C14522());
        boolean z = enumC18531 != enumC18532 && C18051.m42105(c13131.m6210());
        C17345 c17345 = new C17345(enumC18531 == enumC18532, (c18051 == null && z) ? false : true, z);
        c1823.m24568();
        c1823.m24560(c17345);
        try {
            if (c1823 instanceof C1823) {
                ((C1823) c1823).m6048();
            } else {
                while (c13131.mo6203(1) != -1) {
                    int iIndex = c13131.index();
                    ((C4665) c1823).m13673();
                    if (c13131.index() == iIndex) {
                        c13131.mo6204();
                    }
                }
            }
            return new C12426(c13131, c0411, c17345);
        } catch (C19463 unused) {
            return null;
        }
    }
}
