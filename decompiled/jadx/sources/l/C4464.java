package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4464 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14229;

    public /* synthetic */ C4464(int i) {
        this.f14229 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f14229) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f14229) {
            case 0:
                return ((AbstractC13262) obj) != C15378.m36415();
            case 1:
                C4886 c4886 = (C4886) obj;
                return c4886.m14237() > 0 || c4886.m14236() > 0;
            case 2:
                return ((AbstractC4308) obj).mo12941();
            case 3:
                AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                return abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && (abstractC5698.mo16084() & 35184372088832L) == 0;
            case 4:
                return ((AbstractC5698) obj).f17559 == EnumC1296.f4571;
            default:
                return ((InterfaceC3109) obj) != null;
        }
    }
}
