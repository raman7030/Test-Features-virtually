package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C17859 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0384 f54544;

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
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        return (abstractC4308.mo12948() || abstractC4308.m12928(this.f54544.f1817) || abstractC4308.m12913(EnumC9454.BOT)) ? false : true;
    }

    public C17859(C0384 c0384) {
        this.f54544 = c0384;
    }
}
