package l;

/* JADX INFO: renamed from: l.۬ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GAN8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13058 extends AbstractC19036 implements InterfaceC19410 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f39076;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f39077;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC14801 f39078;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC19036 f39079;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC19410 f39080;

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ܿ */
    public final StackTraceElement mo8685() {
        return null;
    }

    public C13058(InterfaceC19410 interfaceC19410, InterfaceC14801 interfaceC14801) {
        super(C20115.f65144, C23974.f77731);
        this.f39080 = interfaceC19410;
        this.f39077 = interfaceC14801;
        this.f39076 = ((Number) interfaceC14801.mo13850(0, C3181.f10038)).intValue();
    }

    @Override // l.AbstractC2808, l.InterfaceC19742
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC19742 mo3350() {
        AbstractC19036 abstractC19036 = this.f39079;
        if (C12354.m29972(abstractC19036)) {
            return abstractC19036;
        }
        return null;
    }

    @Override // l.AbstractC19036, l.InterfaceC11791
    public final InterfaceC14801 getContext() {
        InterfaceC14801 interfaceC14801 = this.f39078;
        return interfaceC14801 == null ? C23974.f77731 : interfaceC14801;
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8684(Object obj) {
        Throwable thM11584 = C3825.m11584(obj);
        if (thM11584 != null) {
            this.f39078 = new C22231(thM11584, getContext());
        }
        AbstractC19036 abstractC19036 = this.f39079;
        if (abstractC19036 != null) {
            abstractC19036.mo8683(obj);
        }
        return EnumC7041.COROUTINE_SUSPENDED;
    }

    @Override // l.AbstractC19036, l.AbstractC2808
    /* JADX INFO: renamed from: ᩻ */
    public final void mo8687() {
        super.mo8687();
    }

    @Override // l.InterfaceC19410
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7954(Object obj, AbstractC19036 abstractC19036) {
        try {
            Object objM31628 = m31628(abstractC19036, obj);
            return objM31628 == EnumC7041.COROUTINE_SUSPENDED ? objM31628 : C8058.f24861;
        } catch (Throwable th) {
            this.f39078 = new C22231(th, abstractC19036.getContext());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final Object m31628(AbstractC19036 abstractC19036, Object obj) {
        InterfaceC14801 context = abstractC19036.getContext();
        C13844.m33202(context);
        InterfaceC14801 interfaceC14801 = this.f39078;
        if (interfaceC14801 != context) {
            if (!(interfaceC14801 instanceof C22231)) {
                if (((Number) context.mo13850(0, new C6003(this))).intValue() == this.f39076) {
                    this.f39078 = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f39077 + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(C3016.m9247("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C22231) interfaceC14801).f72133 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f39079 = abstractC19036;
        Object objMo2797 = C10237.f30858.mo2797(this.f39080, obj, this);
        if (!C11233.m27802(objMo2797, EnumC7041.COROUTINE_SUSPENDED)) {
            this.f39079 = null;
        }
        return objMo2797;
    }
}
