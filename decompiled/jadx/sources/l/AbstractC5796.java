package l;

/* JADX INFO: renamed from: l.ۛۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5796 {
    public static final C8556 a = new C8556(4);
    public static final C8556 b = new C8556(5);
    public static final C8556 c = new C8556(6);
    public static final C8556 d = new C8556(7);
    public static final C8556 e = new C8556(8);
    public static final C8556 f = new C8556(9);
    public static final C8556 g = new C8556(10);

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    public static C22729 d(InterfaceC2268 interfaceC2268, InterfaceC10030 interfaceC10030) {
        if (!(interfaceC10030 instanceof EnumC18496)) {
            C11003.requireNonNull(interfaceC10030, "field");
            return interfaceC10030.m(interfaceC2268);
        }
        if (interfaceC2268.e(interfaceC10030)) {
            return ((EnumC18496) interfaceC10030).b;
        }
        throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
    }

    public static int a(InterfaceC2268 interfaceC2268, InterfaceC10030 interfaceC10030) {
        C22729 c22729N = interfaceC2268.n(interfaceC10030);
        if (!c22729N.d()) {
            throw new C11441("Invalid field " + interfaceC10030 + " for get() method, use getLong() instead");
        }
        long jG = interfaceC2268.G(interfaceC10030);
        if (c22729N.e(jG)) {
            return (int) jG;
        }
        throw new C16232("Invalid value for " + interfaceC10030 + " (valid values " + c22729N + "): " + jG);
    }

    public static Object c(InterfaceC2268 interfaceC2268, C8556 c8556) {
        if (c8556 == a || c8556 == b || c8556 == c) {
            return null;
        }
        return c8556.h(interfaceC2268);
    }

    public static InterfaceC15672 b(InterfaceC15672 interfaceC15672, long j, InterfaceC3679 interfaceC3679) {
        long j2;
        if (j == Long.MIN_VALUE) {
            interfaceC15672 = interfaceC15672.d(C13132.FOREVER_NS, interfaceC3679);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return interfaceC15672.d(j2, interfaceC3679);
    }
}
