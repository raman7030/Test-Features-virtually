package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12627 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38052;

    public /* synthetic */ C12627(int i) {
        this.f38052 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f38052) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f38052) {
            case 0:
                return !((AbstractC4308) obj).m12913(EnumC9454.BOT);
            default:
                return ((C14163) obj).f17559 == EnumC1296.f4582;
        }
    }
}
