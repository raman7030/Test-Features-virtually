package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19774 implements Predicate {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C8374 f60160;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC7783 f60161;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC6462 f60162;

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
    public /* synthetic */ Predicate m44928or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        if (abstractC7783.f20405 != EnumC3600.f7343) {
            return false;
        }
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        AbstractC7783 abstractC7784 = this.f60161;
        if (abstractC12224 != abstractC7784.f20408 || (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        AbstractC6462 abstractC6462 = this.f60162;
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        C8374 c8374 = this.f60160;
        return abstractC7783.mo12937((AbstractC7783) abstractC21195, c8374) && c8374.m19456(c8374.m19483(abstractC7783, abstractC6462), c8374.m19483(abstractC7784, abstractC6462));
    }

    public C19774(C8374 c8374, C5771 c5771, AbstractC6462 abstractC6462) {
        this.f60160 = c8374;
        this.f60161 = c5771;
        this.f60162 = abstractC6462;
    }
}
