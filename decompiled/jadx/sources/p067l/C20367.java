package p067l;

/* JADX INFO: renamed from: l.ᩴᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9PH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20367 implements InterfaceC21867 {

    /* JADX INFO: renamed from: ֫ */
    public static final C20367 f62962 = new C20367();

    /* JADX INFO: renamed from: ֫ */
    public static C20367 m45968() {
        return f62962;
    }

    @Override // p067l.InterfaceC21867
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6844(Class cls) {
        return AbstractC23049.class.isAssignableFrom(cls);
    }

    @Override // p067l.InterfaceC21867
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8455 mo6843(Class cls) {
        if (!AbstractC23049.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            AbstractC23049 abstractC23049M51428 = AbstractC23049.m51428(cls.asSubclass(AbstractC23049.class));
            EnumC10308 enumC10308 = EnumC10308.GET_MEMOIZED_IS_INITIALIZED;
            return (InterfaceC8455) abstractC23049M51428.m51429();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
