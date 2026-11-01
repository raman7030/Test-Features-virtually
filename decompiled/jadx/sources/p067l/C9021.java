package p067l;

/* JADX INFO: renamed from: l.ۜ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J2NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C9021 {

    /* JADX INFO: renamed from: ֫ */
    public static final C22433 f24486;

    static {
        C22433 c22433 = null;
        try {
            c22433 = (C22433) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c22433 == null) {
            c22433 = new C22433();
        }
        f24486 = c22433;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C19750 m20895(Class cls) {
        f24486.getClass();
        return new C19750(cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8410 m20892(Class cls) {
        f24486.getClass();
        return new C8410(cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20891(AbstractC18408 abstractC18408) {
        f24486.getClass();
        String string = abstractC18408.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20890(InterfaceC9751 interfaceC9751) {
        f24486.getClass();
        String string = interfaceC9751.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20893(C4327 c4327) {
        f24486.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20894(C19079 c19079) {
        f24486.getClass();
    }
}
