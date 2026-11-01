package p067l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5411 implements InterfaceC8093 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC8093 f12887;

    public /* synthetic */ C5411(InterfaceC8093 interfaceC8093) {
        this.f12887 = interfaceC8093;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C12117.m28010(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C12117.m28009(this, intPredicate);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ IntPredicate m11883or(IntPredicate intPredicate) {
        return C12117.m28012(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C12117.m28011(this, (Character) obj);
    }

    @Override // p067l.InterfaceC8093
    /* JADX INFO: renamed from: ֫ */
    public final C14798 mo11885(InterfaceC8093 interfaceC8093) {
        return new C14798(this, interfaceC8093);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C5411(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo55838negate() {
        return new C5411(this);
    }

    @Override // p067l.InterfaceC8093
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11886(char c) {
        return !this.f12887.mo11886(c);
    }

    @Override // p067l.InterfaceC8093
    /* JADX INFO: renamed from: ۧ */
    public final C14128 mo11887(InterfaceC8093 interfaceC8093) {
        return new C14128(this, interfaceC8093);
    }

    /* JADX INFO: renamed from: or */
    public final Predicate m11884or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }
}
