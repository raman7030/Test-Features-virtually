package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25078 extends C12338 {
    @Override // p067l.C12338
    /* JADX INFO: renamed from: ܽ */
    public final C16360 mo28414(AbstractC12224 abstractC12224) {
        C16360 c16360M28411 = m28411(abstractC12224, null);
        return c16360M28411.f48075 == null ? new C16360(this.f26587, null, null, null) : c16360M28411;
    }

    @Override // p067l.C12338, p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo22458(AbstractC12224 abstractC12224, Predicate predicate) {
        return m28411(abstractC12224, predicate).f48076;
    }

    @Override // p067l.C12338, p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22455(Predicate predicate, EnumC3620 enumC3620) {
        return new C21726(this, enumC3620, predicate);
    }

    @Override // p067l.C12338, p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo22457(AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        return new C6973(this, abstractC12224, predicate, enumC3620);
    }

    public C25078(C15828 c15828) {
        super(c15828);
    }

    @Override // p067l.C12338, p067l.AbstractC15689
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15689 mo28413(AbstractC7783 abstractC7783) {
        return new C25078(this, abstractC7783, this.f34435);
    }

    @Override // p067l.C12338, p067l.AbstractC15689
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC15689 mo28416(AbstractC7783 abstractC7783) {
        return new C25078(this, abstractC7783, (C16360[]) this.f34435.clone());
    }
}
