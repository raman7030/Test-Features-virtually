package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩻ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public class C24705 extends C15987 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C8769 f78201;

    /* JADX INFO: renamed from: ᩷ */
    public EnumSet f78202;

    public C24705(C8769 c8769, C3108 c3108, EnumC20544 enumC20544, EnumC20544... enumC20544Arr) {
        this(c8769, c3108, EnumSet.of(enumC20544, enumC20544Arr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24705(C8769 c8769, C3108 c3108, EnumSet enumSet) {
        super(c8769, c3108, c3108.m5300(), EnumC20544.f63507);
        this.f78201 = c8769;
        this.f78202 = enumSet;
    }

    @Override // p067l.C15987, p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public AbstractC22694 mo9673(C3108 c3108) {
        return new C24705(this.f78201, c3108, this.f78202);
    }

    @Override // p067l.C15987
    /* JADX INFO: renamed from: ֫ */
    public final EnumSet mo9672() {
        return this.f78202;
    }

    @Override // p067l.C15987
    /* JADX INFO: renamed from: ֫ */
    public final void mo36335(EnumC20544 enumC20544, EnumC20544 enumC20545) {
        C8005 c8005 = this.f78201.f23806;
        int i = C3918.f8503[enumC20545.ordinal()];
        C3108 c3108 = this.f71581;
        if (i == 1) {
            AbstractC6462 abstractC6462M5300 = c3108.m5300();
            C4848 c4848M5292 = c3108.m5292(enumC20545);
            C13370 c13370 = C13665.f38450;
            throw C8769.m20286(c8005.m18543(new C13370("compiler", "inferred.do.not.conform.to.eq.bounds", abstractC6462M5300, c4848M5292)));
        }
        if (i == 2) {
            AbstractC6462 abstractC6462M5301 = c3108.m5300();
            C4848 c4848M5293 = c3108.m5292(enumC20545);
            C13370 c13371 = C13665.f38450;
            throw C8769.m20286(c8005.m18543(new C13370("compiler", "inferred.do.not.conform.to.lower.bounds", abstractC6462M5301, c4848M5293)));
        }
        if (i != 3) {
            return;
        }
        AbstractC6462 abstractC6462M5302 = c3108.m5300();
        C4848 c4848M5294 = c3108.m5292(enumC20545);
        C13370 c13372 = C13665.f38450;
        throw C8769.m20286(c8005.m18543(new C13370("compiler", "inferred.do.not.conform.to.upper.bounds", abstractC6462M5302, c4848M5294)));
    }
}
