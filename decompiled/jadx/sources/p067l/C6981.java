package p067l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6981 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ long f18161;

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
    public /* synthetic */ Predicate m16004or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z;
        long j = this.f18161;
        C3767 c3767 = (C3767) ((Map.Entry) obj).getValue();
        synchronized (c3767) {
            z = c3767.f8012 && j - c3767.f8016 > 300000;
        }
        return z;
    }
}
