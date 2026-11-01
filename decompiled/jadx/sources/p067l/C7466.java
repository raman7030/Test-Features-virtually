package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C7466 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC6462 f19543;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C16852 f19544;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m17234or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        return abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & 8796093022208L) != 0 && abstractC7783.mo12937((AbstractC7783) this.f19543.f16705, this.f19544.f49912) && !abstractC7783.m17994();
    }

    public C7466(C16852 c16852, AbstractC6462 abstractC6462) {
        this.f19544 = c16852;
        this.f19543 = abstractC6462;
    }
}
