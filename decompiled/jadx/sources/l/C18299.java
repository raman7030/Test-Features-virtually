package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18299 implements Predicate {
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
        char c;
        C9127 c9127 = (C9127) obj;
        return (c9127.f27648 == 65535 || (c = c9127.f27647) == 65535 || c <= 0) ? false : true;
    }
}
