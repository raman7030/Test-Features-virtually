package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18411 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57158;

    public /* synthetic */ C18411(int i) {
        this.f57158 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f57158) {
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
        switch (this.f57158) {
            case 0:
                return ((AbstractC15440) obj).mo23119();
            case 1:
                return ((AbstractC14346) obj) instanceof C16688;
            case 2:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
            case 3:
                AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                return abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0;
            case 4:
                AbstractC5698 abstractC5699 = (AbstractC5698) obj;
                return abstractC5699.f17559 == EnumC1296.f4567 && (abstractC5699.mo16084() & 2305843009213693952L) != 0;
            default:
                EnumC19920 enumC19920 = (EnumC19920) obj;
                return enumC19920 == EnumC19920.f64412 || enumC19920 == EnumC19920.f64437 || enumC19920 == EnumC19920.f64394 || enumC19920 == EnumC19920.f64388;
        }
    }
}
