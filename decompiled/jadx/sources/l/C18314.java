package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩳ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18314 implements Predicate {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f56942;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f56943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f56944;

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
        if (abstractC5698.f17559 != EnumC1296.f4571) {
            return false;
        }
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        AbstractC5698 abstractC5699 = this.f56943;
        if (abstractC10370 != abstractC5699.f17562 || (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        AbstractC4308 abstractC4308 = this.f56944;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        C6319 c6319 = this.f56942;
        return abstractC5698.mo10961((AbstractC5698) abstractC19810, c6319) && c6319.m17516(c6319.m17543(abstractC5698, abstractC4308), c6319.m17543(abstractC5699, abstractC4308));
    }

    public C18314(C6319 c6319, C3581 c3581, AbstractC4308 abstractC4308) {
        this.f56942 = c6319;
        this.f56943 = c3581;
        this.f56944 = abstractC4308;
    }
}
