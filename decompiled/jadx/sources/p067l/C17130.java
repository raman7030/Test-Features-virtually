package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17130 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ EnumC19998 f50595;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f50596;

    public /* synthetic */ C17130(EnumC19998 enumC19998, int i) {
        this.f50595 = enumC19998;
        this.f50596 = i;
    }

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
    public /* synthetic */ Predicate m38768or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((C3088) obj).m5227(this.f50595) == this.f50596;
    }
}
