package p067l;

/* JADX INFO: renamed from: l.ۛۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7877 {

    /* JADX INFO: renamed from: a */
    public static final C10500 f20679a = new C10500(4);

    /* JADX INFO: renamed from: b */
    public static final C10500 f20680b = new C10500(5);

    /* JADX INFO: renamed from: c */
    public static final C10500 f20681c = new C10500(6);

    /* JADX INFO: renamed from: d */
    public static final C10500 f20682d = new C10500(7);

    /* JADX INFO: renamed from: e */
    public static final C10500 f20683e = new C10500(8);

    /* JADX INFO: renamed from: f */
    public static final C10500 f20684f = new C10500(9);

    /* JADX INFO: renamed from: g */
    public static final C10500 f20685g = new C10500(10);

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m18197e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    /* JADX INFO: renamed from: d */
    public static C23970 m18196d(InterfaceC4524 interfaceC4524, InterfaceC11901 interfaceC11901) {
        if (!(interfaceC11901 instanceof EnumC19947)) {
            C12826.requireNonNull(interfaceC11901, "field");
            return interfaceC11901.mo3655m(interfaceC4524);
        }
        if (interfaceC4524.mo6951e(interfaceC11901)) {
            return ((EnumC19947) interfaceC11901).f60552b;
        }
        throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
    }

    /* JADX INFO: renamed from: a */
    public static int m18193a(InterfaceC4524 interfaceC4524, InterfaceC11901 interfaceC11901) {
        C23970 c23970Mo6953n = interfaceC4524.mo6953n(interfaceC11901);
        if (!c23970Mo6953n.m53124d()) {
            throw new C13242("Invalid field " + interfaceC11901 + " for get() method, use getLong() instead");
        }
        long jMo6949G = interfaceC4524.mo6949G(interfaceC11901);
        if (c23970Mo6953n.m53125e(jMo6949G)) {
            return (int) jMo6949G;
        }
        throw new C17796("Invalid value for " + interfaceC11901 + " (valid values " + c23970Mo6953n + "): " + jMo6949G);
    }

    /* JADX INFO: renamed from: c */
    public static Object m18195c(InterfaceC4524 interfaceC4524, C10500 c10500) {
        if (c10500 == f20679a || c10500 == f20680b || c10500 == f20681c) {
            return null;
        }
        return c10500.m24242h(interfaceC4524);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC17263 m18194b(InterfaceC17263 interfaceC17263, long j, InterfaceC5865 interfaceC5865) {
        long j2;
        if (j == Long.MIN_VALUE) {
            interfaceC17263 = interfaceC17263.mo7153d(C14849.FOREVER_NS, interfaceC5865);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return interfaceC17263.mo7153d(j2, interfaceC5865);
    }
}
