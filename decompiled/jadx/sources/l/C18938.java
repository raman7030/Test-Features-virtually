package l;

/* JADX INFO: renamed from: l.ᩴᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9PH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18938 implements InterfaceC20517 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18938 f59731 = new C18938();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18938 m43702() {
        return f59731;
    }

    @Override // l.InterfaceC20517
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4612(Class cls) {
        return AbstractC21760.class.isAssignableFrom(cls);
    }

    @Override // l.InterfaceC20517
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6405 mo4611(Class cls) {
        if (!AbstractC21760.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            AbstractC21760 abstractC21760M49079 = AbstractC21760.m49079(cls.asSubclass(AbstractC21760.class));
            EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
            return (InterfaceC6405) abstractC21760M49079.m49080();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
