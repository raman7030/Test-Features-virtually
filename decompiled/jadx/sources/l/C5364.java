package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5364 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f16705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f16706;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        return abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 8796093022208L) != 0 && abstractC5698.mo10961((AbstractC5698) this.f16705.f13890, this.f16706.f46788) && !abstractC5698.m16075();
    }

    public C5364(C15240 c15240, AbstractC4308 abstractC4308) {
        this.f16706 = c15240;
        this.f16705 = abstractC4308;
    }
}
