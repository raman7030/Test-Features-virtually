package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6364 implements InterfaceC14124 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14124 f19692;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14124 f19693;

    public /* synthetic */ C6364(InterfaceC14124 interfaceC14124, InterfaceC14124 interfaceC14125) {
        this.f19692 = interfaceC14124;
        this.f19693 = interfaceC14125;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C23297.m51690(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C23297.m51689(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C23297.m51692(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C23297.m51691(this, (Byte) obj);
    }

    @Override // l.InterfaceC14124
    /* JADX INFO: renamed from: ֫ */
    public final C12009 mo4925(InterfaceC14124 interfaceC14124) {
        return new C12009(this, interfaceC14124);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C12714(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo4928negate() {
        return new C12714(this);
    }

    @Override // l.InterfaceC14124
    /* JADX INFO: renamed from: ۧ */
    public final C6364 mo4926(InterfaceC14124 interfaceC14124) {
        return new C6364(this, interfaceC14124);
    }

    @Override // l.InterfaceC14124
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4927(byte b) {
        return this.f19692.mo4927(b) || this.f19693.mo4927(b);
    }

    public final Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }
}
