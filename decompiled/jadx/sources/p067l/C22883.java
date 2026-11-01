package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22883 implements Predicate {
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
    public /* synthetic */ Predicate m51115or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        InterfaceC2812 interfaceC2812 = (InterfaceC2812) obj;
        return interfaceC2812.mo17398() == interfaceC2812.mo17388() && interfaceC2812.mo17396() == interfaceC2812.mo17400() && interfaceC2812.mo4445() == interfaceC2812.mo4443() && interfaceC2812.mo4448() == interfaceC2812.mo4452();
    }
}
