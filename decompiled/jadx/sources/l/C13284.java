package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13284 implements InterfaceC23162 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23162 f39770;

    public /* synthetic */ C13284(InterfaceC23162 interfaceC23162) {
        this.f39770 = interfaceC23162;
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d) {
        return C11874.m29000(this, d);
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return C11874.m28999(this, doublePredicate);
    }

    public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return C11874.m29002(this, doublePredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C11874.m29001(this, (Float) obj);
    }

    @Override // l.InterfaceC23162
    /* JADX INFO: renamed from: ۧ */
    public final C10463 mo17153(InterfaceC23162 interfaceC23162) {
        return new C10463(this, interfaceC23162);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    public final DoublePredicate negate() {
        return new C13284(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo4928negate() {
        return new C13284(this);
    }

    @Override // l.InterfaceC23162
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo17154(float f) {
        return !this.f39770.mo17154(f);
    }

    @Override // l.InterfaceC23162
    /* JADX INFO: renamed from: ֫ */
    public final C6229 mo17152(InterfaceC23162 interfaceC23162) {
        return new C6229(this, interfaceC23162);
    }

    public final Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }
}
