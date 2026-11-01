package p067l;

/* JADX INFO: renamed from: l.ۚۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C7251 extends AbstractC6462 implements InterfaceC10057, InterfaceC20471 {

    /* JADX INFO: renamed from: ۤ */
    public AbstractC6462 f18916;

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo14772() {
        return true;
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 7;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean mo14800() {
        return true;
    }

    public C7251(AbstractC6462 abstractC6462, AbstractC21195 abstractC21195) {
        this(abstractC6462, abstractC21195, C22082.f69463);
    }

    public C7251(AbstractC6462 abstractC6462, AbstractC21195 abstractC21195, C22082 c22082) {
        super(abstractC21195, c22082);
        this.f18916 = abstractC6462;
    }

    public C7251(C7251 c7251) {
        this(c7251.f18916, c7251.f16705, c7251.f16704);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo3770(C22082 c22082) {
        return new C20663(this, this.f18916, this.f16705, c22082);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return EnumC11353.ARRAY;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo4508(this, obj);
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC6462 abstractC6462 = this.f18916;
        while (abstractC6462.mo5575() == EnumC3035.ARRAY) {
            abstractC6462 = ((C7251) abstractC6462).f18916;
        }
        sb.append(abstractC6462);
        AbstractC6462 abstractC6463 = this;
        do {
            abstractC6463.m14775(sb, true);
            sb.append("[]");
            abstractC6463 = ((C7251) abstractC6463).f18916;
        } while (abstractC6463.mo5575() == EnumC3035.ARRAY);
        return sb.toString();
    }

    @Override // p067l.AbstractC6462
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7251)) {
            return false;
        }
        C7251 c7251 = (C7251) obj;
        return this == c7251 || this.f18916.equals(c7251.f18916);
    }

    public final int hashCode() {
        return this.f18916.hashCode() + (EnumC11353.ARRAY.ordinal() << 5);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ܶ */
    public final C4848 mo14798() {
        return this.f18916.mo14798();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo14812() {
        return this.f18916.mo14812();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean mo14781() {
        return this.f18916.mo14781();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo14784() {
        return this.f18916.mo14784();
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final C7251 m16606() {
        return new C2556(this.f18916, this.f16705, this.f16704);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14776(AbstractC6462 abstractC6462) {
        return abstractC6462.m14793(this) || this.f18916.mo14776(abstractC6462);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo14782() {
        this.f18916.mo14782();
    }

    /* JADX INFO: renamed from: ܿ */
    public AbstractC6462 mo3771() {
        return this.f18916;
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3035 mo5575() {
        return EnumC3035.ARRAY;
    }
}
