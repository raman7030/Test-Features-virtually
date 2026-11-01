package p067l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14994 implements InterfaceC24382 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC24382 f42835;

    public /* synthetic */ C14994(InterfaceC24382 interfaceC24382) {
        this.f42835 = interfaceC24382;
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d) {
        return C13654.m31051(this, d);
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return C13654.m31050(this, doublePredicate);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ DoublePredicate m34347or(DoublePredicate doublePredicate) {
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
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo19088(float f) {
        return !this.f42835.mo19088(f);
    }

    @Override // p067l.InterfaceC24382
    /* JADX INFO: renamed from: ֫ */
    public final C8289 mo19086(InterfaceC24382 interfaceC24382) {
        return new C8289(this, interfaceC24382);
    }

    /* JADX INFO: renamed from: or */
    public final Predicate m34348or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }
}
