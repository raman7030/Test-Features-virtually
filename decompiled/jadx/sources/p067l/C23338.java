package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩹ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23338 implements Predicate {
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
    public /* synthetic */ Predicate m51981or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((C13950) obj).f39346.isDone();
    }
}
