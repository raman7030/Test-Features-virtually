package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5309 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f16557;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        long jMo16084 = abstractC5698.mo16084();
        if (abstractC5698.f17559 == EnumC1296.f4571 && (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & jMo16084) == 0) {
            return this.f16557 || (8796093022208L & jMo16084) != 0 || (jMo16084 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0;
        }
        return false;
    }
}
