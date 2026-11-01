package p067l;

/* JADX INFO: renamed from: l.ܶᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public class C16996 implements InterfaceC23033 {

    /* JADX INFO: renamed from: ֫ */
    public C5771 f50256;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6462 f50257;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC21195 f50258;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C12955 f50259;

    @Override // p067l.InterfaceC23033
    /* JADX INFO: renamed from: ֫ */
    public C10471 mo22404(C10471 c10471) {
        return c10471;
    }

    public C16996(C12955 c12955, AbstractC21195 abstractC21195) {
        this.f50259 = c12955;
        this.f50258 = abstractC21195;
    }

    @Override // p067l.InterfaceC23033
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo22403() {
        if (this.f50257 == null) {
            C4848 c4848M10283 = C4848.m10283();
            C12955 c12955 = this.f50259;
            this.f50257 = new C12497(c4848M10283, c12955.f36440.f69183, C4848.m10283(), c12955.f36440.f69163);
        }
        return this.f50257;
    }

    @Override // p067l.InterfaceC23033
    /* JADX INFO: renamed from: ᩳ */
    public C5771 mo22405() {
        if (this.f50256 == null) {
            AbstractC21195 abstractC21195 = this.f50258;
            long jMo18003 = abstractC21195.mo18003() & 16384;
            C12955 c12955 = this.f50259;
            this.f50256 = new C5771((jMo18003 == 0 || c12955.f36442.m19502(abstractC21195.f20406).f16705 != c12955.f36440.f69209) ? (abstractC21195.mo18003() & 7) | 68719476736L : 68719476738L, c12955.f36438.f21737, mo22403(), this.f50258);
        }
        return this.f50256;
    }

    @Override // p067l.InterfaceC23033
    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 mo23908() {
        return AbstractC6462.f16700;
    }

    @Override // p067l.InterfaceC23033
    /* JADX INFO: renamed from: ۧ */
    public C4848 mo23907() {
        return C4848.m10283();
    }
}
