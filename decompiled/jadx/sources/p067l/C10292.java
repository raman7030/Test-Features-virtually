package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10292 extends C16996 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C12955 f28471;

    /* JADX INFO: renamed from: ܳ */
    public C5771 f28472;

    /* JADX INFO: renamed from: ܿ */
    public boolean f28473;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC6462 f28474;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10292(C12955 c12955, AbstractC21195 abstractC21195, C5771 c5771, AbstractC14355 abstractC14355) {
        super(c12955, abstractC21195);
        this.f28471 = c12955;
        this.f28473 = false;
        this.f28472 = c5771;
        this.f28474 = abstractC14355 != null ? abstractC14355.f18925 : AbstractC6462.f16700;
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo22403() {
        if (this.f50257 == null) {
            C12955 c12955 = this.f28471;
            AbstractC6462 abstractC6462M19483 = c12955.f36442.m19483(this.f28472, this.f50258.f20406);
            EnumC11353 enumC11353 = EnumC11353.NONE;
            AbstractC6462 abstractC6462 = this.f28474;
            if (!abstractC6462.m14777(enumC11353)) {
                abstractC6462M19483 = c12955.f36442.m19427(abstractC6462M19483, abstractC6462M19483.mo14797().m10290(abstractC6462));
                this.f28473 = true;
            }
            this.f50257 = abstractC6462M19483;
        }
        return this.f50257;
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ᩳ */
    public final C5771 mo22405() {
        C5771 c5771Mo22405 = super.mo22405();
        long j = c5771Mo22405.f20409;
        C5771 c5771 = this.f28472;
        long j2 = j | (c5771.f20409 & 17179869184L) | 536870912;
        c5771Mo22405.f20409 = j2;
        c5771Mo22405.f20409 = j2 | (this.f28473 ? 144115188075855872L : 0L);
        C20271 c20271 = new C20271();
        C4848 c4848Mo14797 = mo22403().mo14797();
        if (!this.f28474.m14777(EnumC11353.NONE)) {
            C4848 c4848 = c4848Mo14797.f11035;
            c20271.m45781(new C13818(8589934592L, this.f28471.f36425.m42195(0), this.f28474, c5771Mo22405));
            c4848Mo14797 = c4848;
        }
        C4848<C13818> c4849 = c5771.f14172;
        if (c4849 != null) {
            C4848 c48410 = c4848Mo14797;
            for (C13818 c13818 : c4849) {
                c20271.m45777(new C13818(8589934592L | c13818.f20409, c13818.f20408, (AbstractC6462) c48410.f11034, c5771Mo22405));
                c48410 = c48410.f11035;
            }
        }
        c5771Mo22405.f14172 = c20271.m45783();
        return c5771Mo22405;
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462 mo23908() {
        return this.f28474;
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ۧ */
    public final C4848 mo23907() {
        C4848 c4848M42144 = this.f28471.f36425.m42144(mo22403().mo14797(), mo22405());
        if (!this.f28474.m14777(EnumC11353.NONE)) {
            c4848M42144 = c4848M42144.f11035;
        }
        return c4848M42144.m10287((Function) new C3286(1));
    }
}
