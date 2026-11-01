package p067l;

/* JADX INFO: renamed from: l.ܽۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9K4 */
/* JADX INFO: loaded from: classes5.dex */
public class C18158 extends AbstractC3131 {

    /* JADX INFO: renamed from: ܽ */
    public C14648 f54222;

    /* JADX INFO: renamed from: ᩳ */
    public int f54223;

    /* JADX INFO: renamed from: ܳ */
    public C18158 mo10021() {
        return this;
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo10023() {
        return 65536;
    }

    public C18158() {
        super(new C24864());
    }

    public C18158(EnumC23366 enumC23366, EnumC24036 enumC24036) {
        this(25, enumC23366, enumC24036, 0L, 0L);
    }

    public C18158(EnumC23366 enumC23366, EnumC24036 enumC24036, long j) {
        this(4, enumC23366, enumC24036, j, 0L);
    }

    public C18158(int i, EnumC23366 enumC23366, EnumC24036 enumC24036, long j, long j2) {
        C24864 c24864 = new C24864();
        super(c24864);
        this.f54223 = i;
        c24864.m54601(enumC23366);
        ((C24864) this.f5707).m54602(enumC24036);
        ((C24864) this.f5707).m54615(j);
        ((C24864) this.f5707).m54618(j2);
    }

    @Override // p067l.AbstractC3131
    /* JADX INFO: renamed from: ֫ */
    public final C2460 mo5340() {
        return this.f5706;
    }

    @Override // p067l.InterfaceC2792
    /* JADX INFO: renamed from: ܽ, reason: merged with bridge method [inline-methods] */
    public void mo4380(C2460 c2460) {
        this.f5706 = c2460;
        ((C24864) this.f5707).m54609(c2460);
        mo10795(c2460);
        ((C24864) this.f5707).m54614(c2460.m28116());
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo10795(C2460 c2460) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41365(C19500 c19500) {
        this.f5706 = c19500.m23025();
        this.f5707 = c19500.m23026();
        mo9145(this.f5706);
        this.f5706.m28122(((C24864) this.f5707).mo16458());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41366(C19500 c19500) {
        this.f5706 = c19500.m23025();
        this.f5707 = c19500.m23026();
        C14648 c14648 = new C14648();
        c14648.m33517((C24864) this.f5707, this.f5706);
        this.f54222 = c14648;
        this.f5706.m28122(((C24864) this.f5707).mo16458());
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo9145(C2460 c2460) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m41368() {
        return this.f54222 == null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C14648 m41367() {
        return this.f54222;
    }

    public String toString() {
        return ((C24864) this.f5707).m54620() + " with message id << " + ((C24864) this.f5707).m54604() + " >>";
    }
}
