package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12373 implements InterfaceC6023 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6023 f37104;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6023 f37105;

    public /* synthetic */ C12373(InterfaceC6023 interfaceC6023, InterfaceC6023 interfaceC6024) {
        this.f37104 = interfaceC6023;
        this.f37105 = interfaceC6024;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C10257.m25988(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C10257.m25987(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C10257.m25990(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C10257.m25989(this, (Character) obj);
    }

    @Override // l.InterfaceC6023
    /* JADX INFO: renamed from: ֫ */
    public final C13078 mo9838(InterfaceC6023 interfaceC6023) {
        return new C13078(this, interfaceC6023);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C3201(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo4928negate() {
        return new C3201(this);
    }

    @Override // l.InterfaceC6023
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo9839(char c) {
        return this.f37104.mo9839(c) || this.f37105.mo9839(c);
    }

    @Override // l.InterfaceC6023
    /* JADX INFO: renamed from: ۧ */
    public final C12373 mo9840(InterfaceC6023 interfaceC6023) {
        return new C12373(this, interfaceC6023);
    }

    public final Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }
}
