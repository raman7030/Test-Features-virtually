package l;

import java.util.HashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5176 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16182;

    public /* synthetic */ C5176(int i, Object obj) {
        this.f16181 = i;
        this.f16182 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f16181) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f16181) {
            case 0:
                return ((C13732) obj).f41009.equals((String) this.f16182);
            case 1:
                return C2096.m6958((HashMap) this.f16182, (InterfaceC2869) obj);
            default:
                return C7260.m19462(((C21080) obj).f67987) == ((AbstractC10370) this.f16182);
        }
    }
}
