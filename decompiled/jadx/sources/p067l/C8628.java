package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8628 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23172;

    public /* synthetic */ C8628(int i) {
        this.f23172 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f23172) {
            case 0:
                break;
            case 1:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m20048or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f23172) {
            case 0:
                AbstractC17043 abstractC17043 = (AbstractC17043) obj;
                if (abstractC17043.mo25087()) {
                    AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("dex");
                    if (abstractC17043M38684.mo25087() && abstractC17043M38684.m38684(AbstractC0213e.f989m).mo25087()) {
                        return true;
                    }
                    AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("arsc");
                    if (abstractC17043M38685.mo25087() && abstractC17043M38685.m38684(AbstractC0213e.f989m).mo25087()) {
                        return true;
                    }
                }
                return false;
            case 1:
                String strM33650 = ((C14717) obj).m33650();
                C21424 c21424 = C14717.f41957;
                return !C21424.m48554(strM33650);
            default:
                return C12826.nonNull((InterfaceC10509) obj);
        }
    }
}
