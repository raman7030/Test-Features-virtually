package p067l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12313 implements InterfaceC24382 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC24382 f34366;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC24382 f34367;

    public /* synthetic */ C12313(InterfaceC24382 interfaceC24382, InterfaceC24382 interfaceC24383) {
        this.f34366 = interfaceC24382;
        this.f34367 = interfaceC24383;
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d) {
        return C13654.m31051(this, d);
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return C13654.m31050(this, doublePredicate);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ DoublePredicate m28374or(DoublePredicate doublePredicate) {
        return C13654.m31053(this, doublePredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C13654.m31052(this, (Float) obj);
    }

    @Override // p067l.InterfaceC24382
    /* JADX INFO: renamed from: ۧ */
    public final C12313 mo19087(InterfaceC24382 interfaceC24382) {
        return new C12313(this, interfaceC24382);
    }

    @Override // p067l.InterfaceC24382
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo19088(float f) {
        return this.f34366.mo19088(f) && this.f34367.mo19088(f);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    public final DoublePredicate negate() {
        return new C14994(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo55838negate() {
        return new C14994(this);
    }

    @Override // p067l.InterfaceC24382
    /* JADX INFO: renamed from: ֫ */
    public final C8289 mo19086(InterfaceC24382 interfaceC24382) {
        return new C8289(this, interfaceC24382);
    }

    /* JADX INFO: renamed from: or */
    public final Predicate m28375or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }
}
