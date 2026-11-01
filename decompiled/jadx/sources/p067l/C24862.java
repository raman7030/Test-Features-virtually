package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C24862 extends C24705 {

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C8769 f79412;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24862(C8769 c8769, C3108 c3108) {
        super(c8769, c3108, EnumC20544.f63505, EnumC20544.f63507, EnumC20544.f63504);
        this.f79412 = c8769;
    }

    @Override // p067l.C24705, p067l.C15987, p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22694 mo9673(C3108 c3108) {
        return new C24862(this.f79412, c3108);
    }

    @Override // p067l.C15987, p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final void mo36334(C2733 c2733, C3686 c3686) {
        AbstractC6462 abstractC6462M19493;
        C8769 c8769 = this.f79412;
        C8374 c8374 = c8769.f23797;
        Iterator it = c2733.f4591.iterator();
        while (it.hasNext()) {
            C3108 c3108 = (C3108) ((AbstractC6462) it.next());
            C3108 c3109 = this.f71581;
            c3108.m5294(c8374, C4848.m10276of((Object) c3109.f16992), C4848.m10276of((Object) c3109.m5300()));
            EnumC20544 enumC20544 = EnumC20544.f63504;
            C4848 c4848M14766 = AbstractC6462.m14766(c3108.m5292(enumC20544), new C19341(c2733));
            if (c4848M14766.isEmpty()) {
                abstractC6462M19493 = c8769.f23796.f69208;
            } else if (c4848M14766.f11035.isEmpty()) {
                abstractC6462M19493 = (AbstractC6462) c4848M14766.f11034;
            } else {
                abstractC6462M19493 = c8374.m19493(c4848M14766);
            }
            if (abstractC6462M19493 == null || abstractC6462M19493.mo14812()) {
                c8769.m20298(c3108, enumC20544);
            }
        }
        super.mo36334(c2733, c3686);
    }
}
