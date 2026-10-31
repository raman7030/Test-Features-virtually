package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18125 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f56405;

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

    public C18125(C6319 c6319) {
        this.f56405 = c6319;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        if (abstractC5698.f17559 != EnumC1296.f4571) {
            return false;
        }
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        C6136 c6136 = this.f56405.f19600;
        return (abstractC10370 == c6136.f18879 || abstractC10370 == c6136.f18842 || (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) ? false : true;
    }
}
