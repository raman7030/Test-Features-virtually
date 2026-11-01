package p067l;

/* JADX INFO: renamed from: l.ܳۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15910 extends AbstractC12342 {

    /* JADX INFO: renamed from: ܽ */
    public static final C18593 f46029 = new C18593();

    /* JADX INFO: renamed from: ֫ */
    public static final C18593 f46027 = new C18593();

    /* JADX INFO: renamed from: ۧ */
    public static final C18593 f46028 = new C18593();

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36030(C7726 c7726) {
        if (c7726.f20261.size() == 0) {
            return false;
        }
        C12559 c12559 = new C12559();
        AbstractC3880 first = c7726.f20257.getFirst();
        boolean z = false;
        while (first != null) {
            try {
                c12559.mo28949(first);
                first = first.m7669();
            } catch (C18593 unused) {
                C18593 c18593 = f46029;
                C17922 c17922 = new C17922(c7726, first);
                try {
                    int i = C19264.f57581[first.f8412.ordinal()];
                    if (i == 2) {
                        c17922.mo27265(first.mo7672());
                    } else if (i == 3) {
                        EnumC9677 enumC9677 = first.f8417;
                        if (enumC9677 == EnumC9677.ASSIGN) {
                            int i2 = C19264.f57582[first.mo7675().f28658.ordinal()];
                            if (i2 == 4) {
                                c17922.mo27265(first.mo7675().mo4921());
                                c17922.mo27265(first.mo7675().mo4923());
                                c17922.mo27265(first.mo7674());
                            } else if (i2 == 5) {
                                c17922.mo27265(first.mo7675().mo23968());
                                c17922.mo27265(first.mo7674());
                            } else if (i2 == 10 || i2 == 11) {
                                c17922.mo27265(first.mo7674());
                            }
                        } else if (enumC9677 == EnumC9677.FILL_ARRAY_DATA) {
                            if (m36027(first.mo7675())) {
                                throw c18593;
                            }
                            c17922.mo27265(first.mo7675());
                        }
                    }
                } catch (C18593 e) {
                    if (e == c18593) {
                        c7726.f20257.m40882(first, C19303.m43991(C24489.m53984(new AbstractC10348[0], new String[0], "Ljava/lang/NullPointerException;")));
                    } else if (e == f46027) {
                        c7726.f20257.m40882(first, C19303.m43991(C24489.m53984(new AbstractC10348[]{new C13761("divide by zero")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/ArithmeticException;")));
                    } else if (e == f46028) {
                        c7726.f20257.m40882(first, C19303.m43991(C24489.m53984(new AbstractC10348[0], new String[0], "Ljava/lang/NegativeArraySizeException;")));
                    }
                }
                AbstractC3880 abstractC3880M7669 = first.m7669();
                c7726.f20257.m40883(first);
                first = abstractC3880M7669;
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36027(AbstractC10348 abstractC10348) {
        if (abstractC10348.f28658 == EnumC3642.CONSTANT) {
            C13761 c13761 = (C13761) abstractC10348;
            if (C13761.f38898.equals(c13761.f38899)) {
                return true;
            }
            Object obj = c13761.f38899;
            if ((obj instanceof Number) && ((Number) obj).intValue() == 0) {
                return true;
            }
        }
        return false;
    }
}
