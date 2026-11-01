package p067l;

/* JADX INFO: renamed from: l.ۡ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C10485 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۛ */
    public AbstractC6462 f29021;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC6462 f29022;

    /* JADX INFO: renamed from: ۨ */
    public int f29023;

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo14772() {
        return true;
    }

    /* JADX INFO: renamed from: ۫֫ */
    public boolean mo24195() {
        return false;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo14800() {
        return true;
    }

    public C10485(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224) {
        super(null, C22082.f69463);
        this.f29022 = null;
        this.f29023 = -1;
        C1446.m31699(abstractC6462);
        this.f16705 = new C6442(0L, abstractC12224, this, abstractC7783);
        mo23233((AbstractC6462) null);
        this.f29021 = abstractC6462;
    }

    public C10485(AbstractC21195 abstractC21195, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C22082 c22082) {
        super(abstractC21195, c22082);
        this.f29022 = null;
        this.f29023 = -1;
        C1446.m31699(abstractC6463);
        mo23233(abstractC6462);
        this.f29021 = abstractC6463;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public C10485 mo3770(C22082 c22082) {
        return new C11156(this, this.f16705, mo14803(), this.f29021, c22082);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return EnumC11353.TYPEVAR;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo4509(this, obj);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩳ֫ */
    public AbstractC6462 mo14803() {
        return this.f29022;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo23233(AbstractC6462 abstractC6462) {
        this.f29022 = abstractC6462;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC6462 mo14791() {
        return this.f29021;
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3035 mo5575() {
        return EnumC3035.TYPEVAR;
    }
}
