package l;

/* JADX INFO: renamed from: l.ܳۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14249 extends AbstractC10494 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C17072 f42937 = new C17072();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C17072 f42935 = new C17072();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C17072 f42936 = new C17072();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33898(C5637 c5637) {
        if (c5637.f17415.size() == 0) {
            return false;
        }
        C10723 c10723 = new C10723();
        AbstractC1591 first = c5637.f17411.getFirst();
        boolean z = false;
        while (first != null) {
            try {
                c10723.mo26909(first);
                first = first.m5439();
            } catch (C17072 unused) {
                C17072 c17072 = f42937;
                C16366 c16366 = new C16366(c5637, first);
                try {
                    int i = C17778.f54387[first.f5633.ordinal()];
                    if (i == 2) {
                        c16366.mo25248(first.mo5442());
                    } else if (i == 3) {
                        EnumC7690 enumC7690 = first.f5638;
                        if (enumC7690 == EnumC7690.ASSIGN) {
                            int i2 = C17778.f54388[first.mo5445().f25745.ordinal()];
                            if (i2 == 4) {
                                c16366.mo25248(first.mo5445().mo2581());
                                c16366.mo25248(first.mo5445().mo2583());
                                c16366.mo25248(first.mo5444());
                            } else if (i2 == 5) {
                                c16366.mo25248(first.mo5445().mo21997());
                                c16366.mo25248(first.mo5444());
                            } else if (i2 == 10 || i2 == 11) {
                                c16366.mo25248(first.mo5444());
                            }
                        } else if (enumC7690 == EnumC7690.FILL_ARRAY_DATA) {
                            if (m33895(first.mo5445())) {
                                throw c17072;
                            }
                            c16366.mo25248(first.mo5445());
                        }
                    }
                } catch (C17072 e) {
                    if (e == c17072) {
                        c5637.f17411.m38666(first, C17819.m41745(C23275.m51588(new AbstractC8396[0], new String[0], "Ljava/lang/NullPointerException;")));
                    } else if (e == f42935) {
                        c5637.f17411.m38666(first, C17819.m41745(C23275.m51588(new AbstractC8396[]{new C11987("divide by zero")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/ArithmeticException;")));
                    } else if (e == f42936) {
                        c5637.f17411.m38666(first, C17819.m41745(C23275.m51588(new AbstractC8396[0], new String[0], "Ljava/lang/NegativeArraySizeException;")));
                    }
                }
                AbstractC1591 abstractC1591M5439 = first.m5439();
                c5637.f17411.m38667(first);
                first = abstractC1591M5439;
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33895(AbstractC8396 abstractC8396) {
        if (abstractC8396.f25745 == EnumC1340.CONSTANT) {
            C11987 c11987 = (C11987) abstractC8396;
            if (C11987.f35888.equals(c11987.f35889)) {
                return true;
            }
            Object obj = c11987.f35889;
            if ((obj instanceof Number) && ((Number) obj).intValue() == 0) {
                return true;
            }
        }
        return false;
    }
}
