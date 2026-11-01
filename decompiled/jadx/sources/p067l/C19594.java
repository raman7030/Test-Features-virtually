package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19594 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f59620;

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
    public /* synthetic */ Predicate m44507or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    public C19594(C8374 c8374) {
        this.f59620 = c8374;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        if (abstractC7783.f20405 != EnumC3600.f7343) {
            return false;
        }
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        C8200 c8200 = this.f59620.f22471;
        return (abstractC12224 == c8200.f21737 || abstractC12224 == c8200.f21700 || (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) ? false : true;
    }
}
