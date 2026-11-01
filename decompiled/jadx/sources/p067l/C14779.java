package p067l;

/* JADX INFO: renamed from: l.۬ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GAN8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14779 extends AbstractC20461 implements InterfaceC20816 {

    /* JADX INFO: renamed from: ۗ */
    public final int f42124;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16436 f42125;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC16436 f42126;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC20461 f42127;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC20816 f42128;

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ܿ */
    public final StackTraceElement mo10746() {
        return null;
    }

    public C14779(InterfaceC20816 interfaceC20816, InterfaceC16436 interfaceC16436) {
        super(C21486.f67783, C25154.f80484);
        this.f42128 = interfaceC20816;
        this.f42125 = interfaceC16436;
        this.f42124 = ((Number) interfaceC16436.mo15730(0, C5392.f12842)).intValue();
    }

    @Override // p067l.AbstractC5038, p067l.InterfaceC21132
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21132 mo5669() {
        AbstractC20461 abstractC20461 = this.f42127;
        if (C14110.m32033(abstractC20461)) {
            return abstractC20461;
        }
        return null;
    }

    @Override // p067l.AbstractC20461, p067l.InterfaceC13575
    public final InterfaceC16436 getContext() {
        InterfaceC16436 interfaceC16436 = this.f42126;
        return interfaceC16436 == null ? C25154.f80484 : interfaceC16436;
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    public final Object mo10745(Object obj) {
        Throwable thM13520 = C6004.m13520(obj);
        if (thM13520 != null) {
            this.f42126 = new C23497(thM13520, getContext());
        }
        AbstractC20461 abstractC20461 = this.f42127;
        if (abstractC20461 != null) {
            abstractC20461.mo10744(obj);
        }
        return EnumC9061.COROUTINE_SUSPENDED;
    }

    @Override // p067l.AbstractC20461, p067l.AbstractC5038
    /* JADX INFO: renamed from: ᩻ */
    public final void mo10748() {
        super.mo10748();
    }

    @Override // p067l.InterfaceC20816
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10002(Object obj, AbstractC20461 abstractC20461) {
        try {
            Object objM33715 = m33715(abstractC20461, obj);
            return objM33715 == EnumC9061.COROUTINE_SUSPENDED ? objM33715 : C10027.f27775;
        } catch (Throwable th) {
            this.f42126 = new C23497(th, abstractC20461.getContext());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final Object m33715(AbstractC20461 abstractC20461, Object obj) {
        InterfaceC16436 context = abstractC20461.getContext();
        C15526.m35320(context);
        InterfaceC16436 interfaceC16436 = this.f42126;
        if (interfaceC16436 != context) {
            if (!(interfaceC16436 instanceof C23497)) {
                if (((Number) context.mo15730(0, new C8074(this))).intValue() == this.f42124) {
                    this.f42126 = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f42125 + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(C5235.m11305("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C23497) interfaceC16436).f74858 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f42127 = abstractC20461;
        Object objMo5142 = C12098.f33819.mo5142(this.f42128, obj, this);
        if (!C13045.m29864(objMo5142, EnumC9061.COROUTINE_SUSPENDED)) {
            this.f42127 = null;
        }
        return objMo5142;
    }
}
