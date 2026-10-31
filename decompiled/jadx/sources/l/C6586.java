package l;

import com.alipay.sdk.m.t.e;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6586 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20295;

    public /* synthetic */ C6586(int i) {
        this.f20295 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f20295) {
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
        switch (this.f20295) {
            case 0:
                AbstractC15440 abstractC15440 = (AbstractC15440) obj;
                if (abstractC15440.mo23113()) {
                    AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("dex");
                    if (abstractC15440M36526.mo23113() && abstractC15440M36526.m36526(e.m).mo23113()) {
                        return true;
                    }
                    AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("arsc");
                    if (abstractC15440M36527.mo23113() && abstractC15440M36527.m36526(e.m).mo23113()) {
                        return true;
                    }
                }
                return false;
            case 1:
                String strM31565 = ((C12993) obj).m31565();
                C20050 c20050 = C12993.f38911;
                return !C20050.m46238(strM31565);
            default:
                return C11003.nonNull((InterfaceC8566) obj);
        }
    }
}
