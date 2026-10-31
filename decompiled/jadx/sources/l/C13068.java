package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13068 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39137;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39138;

    public /* synthetic */ C13068(int i, Object obj) {
        this.f39137 = i;
        this.f39138 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f39137) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f39137) {
            case 0:
                return ((String) obj).startsWith((String) this.f39138);
            case 1:
                return ((String) this.f39138).equals(((C0244) obj).f1521);
            default:
                Predicate predicate = (Predicate) this.f39138;
                AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                return !abstractC5698.f17561.m16070() && (predicate == null || predicate.test(abstractC5698));
        }
    }
}
