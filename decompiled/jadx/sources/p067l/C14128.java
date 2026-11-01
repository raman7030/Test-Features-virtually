package p067l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14128 implements InterfaceC8093 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC8093 f40120;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC8093 f40121;

    public /* synthetic */ C14128(InterfaceC8093 interfaceC8093, InterfaceC8093 interfaceC8094) {
        this.f40120 = interfaceC8093;
        this.f40121 = interfaceC8094;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C12117.m28010(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C12117.m28009(this, intPredicate);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ IntPredicate m32146or(IntPredicate intPredicate) {
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
        return this.f40120.mo11886(c) || this.f40121.mo11886(c);
    }

    @Override // p067l.InterfaceC8093
    /* JADX INFO: renamed from: ۧ */
    public final C14128 mo11887(InterfaceC8093 interfaceC8093) {
        return new C14128(this, interfaceC8093);
    }

    /* JADX INFO: renamed from: or */
    public final Predicate m32147or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }
}
