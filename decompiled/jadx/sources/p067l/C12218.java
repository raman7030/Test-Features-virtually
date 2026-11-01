package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C12218 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC21195 f34151;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f34152;

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
    public /* synthetic */ Predicate m28198or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        if (abstractC7783.f20405 != EnumC3600.f7343 || (abstractC7783.mo18003() & 8796093023232L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return false;
        }
        C8374 c8374 = this.f34152;
        AbstractC21195 abstractC21195 = this.f34151;
        return !c8374.m19448(abstractC21195, abstractC7783) && (((C5771) c8374.m19423(abstractC21195.f20406, (C5771) abstractC7783).f11034).f20409 & 8796093022208L) == 0;
    }

    public C12218(AbstractC21195 abstractC21195, C8374 c8374) {
        this.f34152 = c8374;
        this.f34151 = abstractC21195;
    }
}
