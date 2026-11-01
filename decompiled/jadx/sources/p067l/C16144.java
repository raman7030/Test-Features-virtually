package p067l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C16144 extends AbstractC22694 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C8769 f47499;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC20544 f47500;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16144(C8769 c8769, C3108 c3108, AbstractC6462 abstractC6462, EnumC20544 enumC20544) {
        super(c8769, c3108, abstractC6462);
        this.f47499 = c8769;
        this.f47500 = enumC20544;
    }

    @Override // p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22694 mo9673(C3108 c3108) {
        return new C16144(this.f47499, c3108, this.f71579, this.f47500);
    }

    @Override // p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public final void mo36334(C2733 c2733, C3686 c3686) {
        AbstractC6462 abstractC6462M4259 = c2733.m4259(this.f71579);
        boolean zM14777 = abstractC6462M4259.m14777(EnumC11353.UNDETVAR);
        C8769 c8769 = this.f47499;
        C3108 c3108 = this.f71581;
        EnumC20544 enumC20544 = this.f47500;
        if (zM14777) {
            C3108 c3109 = (C3108) abstractC6462M4259;
            if (!c3109.m5298()) {
                c3109.m5296(enumC20544.mo9305(), c3108, c8769.f23797);
                for (EnumC20544 enumC20545 : enumC20544 == EnumC20544.f63507 ? EnumSet.allOf(EnumC20544.class) : EnumSet.of(enumC20544)) {
                    Iterator it = c3109.m5292(enumC20545).iterator();
                    while (it.hasNext()) {
                        c3108.m5296(enumC20545, (AbstractC6462) it.next(), c8769.f23797);
                    }
                }
            }
        }
        EnumC20544 enumC20546 = EnumC20544.f63507;
        Iterator it2 = (enumC20544 == enumC20546 ? EnumSet.of(enumC20546) : EnumSet.complementOf(EnumSet.of(enumC20544))).iterator();
        while (it2.hasNext()) {
            Iterator it3 = c3108.m5292((EnumC20544) it2.next()).iterator();
            while (it3.hasNext()) {
                AbstractC6462 abstractC6462M42510 = c2733.m4259((AbstractC6462) it3.next());
                if (abstractC6462M42510.m14777(EnumC11353.UNDETVAR)) {
                    C3108 c31010 = (C3108) abstractC6462M42510;
                    if (!c31010.m5298()) {
                        c31010.m5296(enumC20544, c2733.m4250(this.f71579), c8769.f23797);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC22694
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", C16144.class.getSimpleName(), this.f71581.f16992, this.f71579, this.f47500);
    }
}
