package p067l;

/* JADX INFO: renamed from: l.֨ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3586 extends AbstractC15655 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f7281;

    /* JADX INFO: renamed from: ۫ */
    public C4848 f7282;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C12955 f7283;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3586(C12955 c12955, EnumC13844 enumC13844, C13645 c13645) {
        super(c12955, enumC13844, c13645);
        this.f7283 = c12955;
        this.f7282 = C4848.m10283();
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591(C4848 c4848) {
        this.f7282 = this.f7282.m10292(c4848);
        boolean z = this.f7281;
        if (z) {
            return;
        }
        this.f7281 = true;
        while (this.f7282.m10293()) {
            try {
                C4848 c4849 = this.f7282;
                C4036 c4036 = (C4036) c4849.f11034;
                this.f7282 = c4849.f11035;
                super.mo6591(C4848.m10276of((Object) c4036));
            } catch (Throwable th) {
                this.f7281 = z;
                throw th;
            }
        }
        this.f7281 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6590(C15828 c15828, C4036 c4036) {
        C21333 c21333 = (C21333) c15828.f20406;
        C12955 c12955 = this.f7283;
        C13818 c13818 = new C13818(262160L, c12955.f36438.f21744, c15828.f20406, c15828);
        c13818.f39051 = 0;
        Object obj = c4036.f8849;
        ((C10545) obj).f29201.mo28415(c13818);
        if ((c15828.f20409 & 512) == 0 && c21333.f67259.m14777(EnumC11353.CLASS)) {
            C13818 c13819 = new C13818(262160L, c12955.f36438.f21756, c21333.f67259, c15828);
            c13819.f39051 = 0;
            ((C10545) obj).f29201.mo28415(c13819);
        }
    }
}
