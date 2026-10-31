package l;

/* JADX INFO: renamed from: l.ۜ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J2NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6999 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21111 f21605;

    static {
        C21111 c21111 = null;
        try {
            c21111 = (C21111) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c21111 == null) {
            c21111 = new C21111();
        }
        f21605 = c21111;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18288 m18938(Class cls) {
        f21605.getClass();
        return new C18288(cls);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6356 m18935(Class cls) {
        f21605.getClass();
        return new C6356(cls);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18934(AbstractC16876 abstractC16876) {
        f21605.getClass();
        String string = abstractC16876.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18933(InterfaceC7767 interfaceC7767) {
        f21605.getClass();
        String string = interfaceC7767.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18936(C2060 c2060) {
        f21605.getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18937(C17582 c17582) {
        f21605.getClass();
    }
}
