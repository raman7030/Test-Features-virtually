package p067l;

/* JADX INFO: renamed from: l.ۧ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C12497 extends AbstractC6462 implements InterfaceC10057 {

    /* JADX INFO: renamed from: ۛ */
    public AbstractC6462 f35029;

    /* JADX INFO: renamed from: ۤ */
    public C4848 f35030;

    /* JADX INFO: renamed from: ۨ */
    public AbstractC6462 f35031;

    /* JADX INFO: renamed from: ᩺ */
    public C4848 f35032;

    @Override // p067l.AbstractC6462, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 16;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC21195 mo14807() {
        return null;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩹ */
    public final C12497 mo14809() {
        return this;
    }

    public C12497(C4848 c4848, AbstractC6462 abstractC6462, C4848 c4849, AbstractC21195 abstractC21195) {
        super(abstractC21195, C22082.f69463);
        this.f35030 = c4848;
        this.f35031 = abstractC6462;
        this.f35032 = c4849;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo3770(C22082 c22082) {
        throw new AssertionError("Cannot add metadata to a method type");
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return EnumC11353.METHOD;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo9477(this, obj);
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m14775(sb, false);
        sb.append('(');
        sb.append(this.f35030);
        sb.append(')');
        sb.append(this.f35031);
        return sb.toString();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܰ */
    public final C4848 mo14797() {
        return this.f35030;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC6462 mo14787() {
        return this.f35031;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۧ֫ */
    public final C4848 mo14794() {
        return this.f35032;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo14812() {
        if (AbstractC6462.m14769(this.f35030)) {
            return true;
        }
        AbstractC6462 abstractC6462 = this.f35031;
        return abstractC6462 != null && abstractC6462.mo14812();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14776(AbstractC6462 abstractC6462) {
        return abstractC6462.m14793(this) || AbstractC6462.m14768(abstractC6462, this.f35030) || this.f35031.mo14776(abstractC6462) || AbstractC6462.m14768(abstractC6462, this.f35032);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo14782() {
        for (C4848 c4848 = this.f35030; c4848.m10293(); c4848 = c4848.f11035) {
            ((AbstractC6462) c4848.f11034).mo14782();
        }
        this.f35031.mo14782();
        this.f35029.mo14782();
        for (C4848 c4849 = this.f35032; c4849.m10293(); c4849 = c4849.f11035) {
            ((AbstractC6462) c4849.f11034).mo14782();
        }
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3035 mo5575() {
        return EnumC3035.EXECUTABLE;
    }
}
