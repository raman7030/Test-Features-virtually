package p067l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14452 implements InterfaceC15792 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC15792 f41292;

    public /* synthetic */ C14452(InterfaceC15792 interfaceC15792) {
        this.f41292 = interfaceC15792;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C24510.m54086(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C24510.m54085(this, intPredicate);
    }

    /* JADX INFO: renamed from: or */
    public final /* synthetic */ IntPredicate m33060or(IntPredicate intPredicate) {
        return C24510.m54088(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C24510.m54087(this, (Byte) obj);
    }

    @Override // p067l.InterfaceC15792
    /* JADX INFO: renamed from: ֫ */
    public final C13782 mo7169(InterfaceC15792 interfaceC15792) {
        return new C13782(this, interfaceC15792);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C14452(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo55838negate() {
        return new C14452(this);
    }

    @Override // p067l.InterfaceC15792
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7171(byte b) {
        return !this.f41292.mo7171(b);
    }

    @Override // p067l.InterfaceC15792
    /* JADX INFO: renamed from: ۧ */
    public final C8417 mo7170(InterfaceC15792 interfaceC15792) {
        return new C8417(this, interfaceC15792);
    }

    /* JADX INFO: renamed from: or */
    public final Predicate m33061or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }
}
