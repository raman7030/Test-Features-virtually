package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22101 implements Predicate {
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
    public /* synthetic */ Predicate m49760or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return EnumC11372.m26327((InterfaceC19418) obj);
    }
}
