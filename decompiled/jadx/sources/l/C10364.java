package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10364 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC19810 f31189;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f31190;

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
        if (abstractC5698.f17559 != EnumC1296.f4571 || (abstractC5698.mo16084() & 8796093023232L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            return false;
        }
        C6319 c6319 = this.f31190;
        AbstractC19810 abstractC19810 = this.f31189;
        return !c6319.m17508(abstractC19810, abstractC5698) && (((C3581) c6319.m17483(abstractC19810.f17560, (C3581) abstractC5698).f8240).f17563 & 8796093022208L) == 0;
    }

    public C10364(AbstractC19810 abstractC19810, C6319 c6319) {
        this.f31190 = c6319;
        this.f31189 = abstractC19810;
    }
}
