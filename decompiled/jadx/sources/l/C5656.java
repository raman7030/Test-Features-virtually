package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5656 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17446;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17447;

    public /* synthetic */ C5656(int i, Object obj) {
        this.f17446 = i;
        this.f17447 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f17446) {
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
        switch (this.f17446) {
            case 0:
                return ((C9378) obj).f28484 == ((C12048) this.f17447).f17562;
            default:
                C9869 c9869 = (C9869) this.f17447;
                c9869.getClass();
                if (((C16719) obj).m39353() == EnumC12986.ERROR) {
                    c9869.f29847 = true;
                }
                return true;
        }
    }
}
