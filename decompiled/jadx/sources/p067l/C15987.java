package p067l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/* JADX INFO: renamed from: l.ܳۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public class C15987 extends AbstractC22694 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C8769 f46311;

    /* JADX INFO: renamed from: ܿ */
    public BiPredicate f46312;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC20544 f46313;

    /* JADX INFO: renamed from: ᩻ */
    public BiFunction f46314;

    public C15987(C8769 c8769, C3108 c3108, AbstractC6462 abstractC6462, EnumC20544 enumC20544) {
        this(c8769, c3108, abstractC6462, new C18670(), null, enumC20544);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15987(C8769 c8769, C3108 c3108, AbstractC6462 abstractC6462, BiFunction biFunction, BiPredicate biPredicate, EnumC20544 enumC20544) {
        super(c8769, c3108, abstractC6462);
        this.f46311 = c8769;
        this.f46313 = enumC20544;
        this.f46314 = biFunction;
        this.f46312 = biPredicate;
    }

    @Override // p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public AbstractC22694 mo9673(C3108 c3108) {
        return new C15987(this.f46311, c3108, this.f71579, this.f46314, this.f46312, this.f46313);
    }

    @Override // p067l.AbstractC22694
    /* JADX INFO: renamed from: ֫ */
    public void mo36334(C2733 c2733, C3686 c3686) {
        boolean zM20301;
        AbstractC6462 abstractC6462 = this.f71579;
        BiFunction biFunction = this.f46314;
        AbstractC6462 abstractC6463 = (AbstractC6462) biFunction.apply(c2733, abstractC6462);
        this.f71579 = abstractC6463;
        BiPredicate biPredicate = this.f46312;
        if (biPredicate == null || !biPredicate.test(c2733, abstractC6463)) {
            for (EnumC20544 enumC20544 : mo9672()) {
                Iterator it = this.f71581.m5292(enumC20544).iterator();
                while (it.hasNext()) {
                    AbstractC6462 abstractC6464 = (AbstractC6462) biFunction.apply(c2733, (AbstractC6462) it.next());
                    if (biPredicate == null || !biPredicate.test(c2733, abstractC6464)) {
                        AbstractC6462 abstractC6465 = this.f71579;
                        EnumC20544 enumC20545 = this.f46313;
                        boolean zM46449 = enumC20545.m46449(enumC20544);
                        C8769 c8769 = this.f71580;
                        if (zM46449) {
                            zM20301 = c8769.m20301(EnumC5259.f12379, abstractC6465, abstractC6464, c3686);
                        } else {
                            zM20301 = enumC20544.m46449(enumC20545) ? c8769.m20301(EnumC5259.f12379, abstractC6464, abstractC6465, c3686) : c8769.m20301(EnumC5259.f12381, abstractC6465, abstractC6464, (C3686) null);
                        }
                        if (!zM20301) {
                            mo36335(enumC20545, enumC20544);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumSet mo9672() {
        EnumC20544 enumC20544 = EnumC20544.f63507;
        EnumC20544 enumC20545 = this.f46313;
        if (enumC20545 == enumC20544) {
            return EnumSet.allOf(EnumC20544.class);
        }
        return EnumSet.complementOf(EnumSet.of(enumC20545));
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo36335(EnumC20544 enumC20544, EnumC20544 enumC20545) {
        C3108 c3108 = this.f71581;
        C8769 c8769 = this.f46311;
        if (enumC20544 == enumC20545) {
            c8769.m20298(c3108, enumC20544);
        } else {
            if (enumC20544 == EnumC20544.f63505 || enumC20545 == EnumC20544.f63507) {
                c8769.m20299(c3108, enumC20545, enumC20544);
                throw null;
            }
            c8769.m20299(c3108, enumC20544, enumC20545);
            throw null;
        }
    }

    @Override // p067l.AbstractC22694
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", getClass().getSimpleName(), this.f71581.f16992, this.f71579, this.f46313);
    }
}
