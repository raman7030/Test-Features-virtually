package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23461 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75292;

    public /* synthetic */ C23461(int i) {
        this.f75292 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f75292) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f75292) {
            case 0:
                return ((AbstractC19669) obj).mo30872();
            case 1:
                String str = (String) obj;
                return C16999.m39887(str) || C16999.m39877(str);
            case 2:
                return (((C21221) obj).f68391.f17563 & 16777216) != 0;
            default:
                return ((AbstractC19669) obj).m45215();
        }
    }
}
