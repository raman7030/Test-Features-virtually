package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5559 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8381 f17191;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f17192;

    public /* synthetic */ C5559(C8381 c8381, long j) {
        this.f17191 = c8381;
        this.f17192 = j;
    }

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
        return C8381.m21980(this.f17191, this.f17192, (Map.Entry) obj);
    }
}
