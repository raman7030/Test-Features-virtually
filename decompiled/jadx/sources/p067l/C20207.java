package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20207 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC6462 f62502;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C16852 f62503;

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
    public /* synthetic */ Predicate m45699or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    public C20207(C16852 c16852, AbstractC6462 abstractC6462) {
        this.f62503 = c16852;
        this.f62502 = abstractC6462;
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final boolean test(AbstractC7783 abstractC7783) {
        if (abstractC7783.f20405 != EnumC3600.f7343 || (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        long jMo18003 = abstractC7783.mo18003() & 4398046511104L;
        AbstractC6462 abstractC6462 = this.f62502;
        return (jMo18003 == 0 || abstractC7783.f20407 != abstractC6462.f16705) && abstractC7783.mo12937((AbstractC7783) abstractC6462.f16705, this.f62503.f49912) && !abstractC7783.m17994();
    }
}
