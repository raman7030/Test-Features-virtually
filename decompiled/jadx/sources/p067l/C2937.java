package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2937 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ String f5110;

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
    public /* synthetic */ Predicate m4818or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f5110.equals(((C16348) obj).f48031);
    }
}
