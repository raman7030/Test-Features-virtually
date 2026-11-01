package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A7MK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5558 implements Predicate {
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
    public /* synthetic */ Predicate m12290or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC21062 abstractC21062 = (AbstractC21062) obj;
        return abstractC21062.mo32948() && C9268.m21395((AbstractC14355) abstractC21062);
    }
}
