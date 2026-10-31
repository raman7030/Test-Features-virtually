package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2562 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f8104;

    public /* synthetic */ C2562(int i) {
        this.f8104 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f8104) {
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
        switch (this.f8104) {
            case 0:
                return ((C17524) obj).f53522 == null;
            default:
                C16719 c16719 = (C16719) obj;
                return (c16719.mo29297() == EnumC6346.ERROR && c16719.m39346(EnumC20043.RECOVERABLE) && !c16719.m39346(EnumC20043.API)) ? false : true;
        }
    }
}
