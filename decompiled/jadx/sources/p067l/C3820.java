package p067l;

/* JADX INFO: renamed from: l.֫ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: KALN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3820 implements InterfaceC16931 {

    /* JADX INFO: renamed from: ֫ */
    public final C19243[] f8182;

    public C3820(C19243... c19243Arr) {
        C13045.m29867(c19243Arr, "initializers");
        this.f8182 = c19243Arr;
    }

    @Override // p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 mo7441(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 mo7442(Class cls, C17901 c17901) {
        AbstractC7545 abstractC7545 = null;
        for (C19243 c19243 : this.f8182) {
            if (C13045.m29864(c19243.m43827(), cls)) {
                Object objInvoke = c19243.m43828().invoke(c17901);
                abstractC7545 = objInvoke instanceof AbstractC7545 ? (AbstractC7545) objInvoke : null;
            }
        }
        if (abstractC7545 != null) {
            return abstractC7545;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
