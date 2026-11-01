package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7414 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f19394;

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
    public /* synthetic */ Predicate m17132or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        long jMo18003 = abstractC7783.mo18003();
        if (abstractC7783.f20405 == EnumC3600.f7343 && (ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & jMo18003) == 0) {
            return this.f19394 || (8796093022208L & jMo18003) != 0 || (jMo18003 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0;
        }
        return false;
    }
}
