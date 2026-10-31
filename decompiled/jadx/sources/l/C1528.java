package l;

/* JADX INFO: renamed from: l.֫ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: KALN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1528 implements InterfaceC15323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17756[] f5400;

    public C1528(C17756... c17756Arr) {
        C11233.m27805(c17756Arr, "initializers");
        this.f5400 = c17756Arr;
    }

    @Override // l.InterfaceC15323
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 mo5213(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // l.InterfaceC15323
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 mo5214(Class cls, C16344 c16344) {
        AbstractC5447 abstractC5447 = null;
        for (C17756 c17756 : this.f5400) {
            if (C11233.m27802(c17756.m41582(), cls)) {
                Object objInvoke = c17756.m41583().invoke(c16344);
                abstractC5447 = objInvoke instanceof AbstractC5447 ? (AbstractC5447) objInvoke : null;
            }
        }
        if (abstractC5447 != null) {
            return abstractC5447;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
