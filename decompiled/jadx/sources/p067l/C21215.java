package p067l;

/* JADX INFO: renamed from: l.᩶֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C21215 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۛ */
    public boolean f66700;

    /* JADX INFO: renamed from: ۤ */
    public C10485 f66701;

    /* JADX INFO: renamed from: ۨ */
    public EnumC17268 f66702;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC6462 f66703;

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo14772() {
        return true;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo14800() {
        return true;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo4511(this, obj);
    }

    public C21215(AbstractC6462 abstractC6462, EnumC17268 enumC17268, AbstractC21195 abstractC21195) {
        this(abstractC6462, enumC17268, abstractC21195, null, C22082.f69463);
    }

    public C21215(AbstractC6462 abstractC6462, EnumC17268 enumC17268, AbstractC21195 abstractC21195, C10485 c10485) {
        this(abstractC6462, enumC17268, abstractC21195, c10485, C22082.f69463);
    }

    public C21215(AbstractC6462 abstractC6462, EnumC17268 enumC17268, AbstractC21195 abstractC21195, C10485 c10485, C22082 c22082) {
        super(abstractC21195, c22082);
        this.f66700 = false;
        C1446.m31699(abstractC6462);
        this.f66703 = abstractC6462;
        this.f66702 = enumC17268;
        this.f66701 = c10485;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo3770(C22082 c22082) {
        return new C23226(this, this.f66703, this.f66702, this.f16705, this.f66701, c22082);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return EnumC11353.WILDCARD;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14776(AbstractC6462 abstractC6462) {
        return this.f66702 != EnumC17268.UNBOUND && this.f66703.mo14776(abstractC6462);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo14788() {
        EnumC17268 enumC17268 = EnumC17268.SUPER;
        EnumC17268 enumC17269 = this.f66702;
        return enumC17269 == enumC17268 || enumC17269 == EnumC17268.UNBOUND;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean mo14786() {
        EnumC17268 enumC17268 = EnumC17268.EXTENDS;
        EnumC17268 enumC17269 = this.f66702;
        return enumC17269 == enumC17268 || enumC17269 == EnumC17268.UNBOUND;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo14808() {
        return this.f66702 == EnumC17268.UNBOUND;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 mo14801(AbstractC6462 abstractC6462) {
        if (this.f66701 == abstractC6462) {
            return this;
        }
        this.f66701 = (C10485) abstractC6462;
        return this;
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m14775(sb, false);
        EnumC17268 enumC17268 = this.f66702;
        sb.append(enumC17268.toString());
        if (enumC17268 != EnumC17268.UNBOUND) {
            sb.append(this.f66703);
        }
        if (AbstractC6462.f16703 && this.f66701 != null && !this.f66700) {
            try {
                this.f66700 = true;
                sb.append("{:");
                sb.append(this.f66701.mo14803());
                sb.append(":}");
            } finally {
                this.f66700 = false;
            }
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3035 mo5575() {
        return EnumC3035.WILDCARD;
    }
}
