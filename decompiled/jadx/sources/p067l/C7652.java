package p067l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7652 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10334 f20031;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ long f20032;

    public /* synthetic */ C7652(C10334 c10334, long j) {
        this.f20031 = c10334;
        this.f20032 = j;
    }

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
    public /* synthetic */ Predicate m17635or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return C10334.m23951(this.f20031, this.f20032, (Map.Entry) obj);
    }
}
