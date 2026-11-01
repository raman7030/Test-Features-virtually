package p067l;

import java.util.EnumSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19484 extends AbstractC3390 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23663 f59361;

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC7783 mo19776(C4036 c4036, EnumC18298 enumC18298);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC19484(C23663 c23663, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        EnumC18298 enumC18298 = EnumC18298.f54637;
        this.f59361 = c23663;
        super(abstractC12224, abstractC6462, c4848, c4849, enumC18298);
    }

    @Override // p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo5930(C4036 c4036, EnumC18298 enumC18298) {
        AbstractC7783 abstractC7783Mo19776 = mo19776(c4036, enumC18298);
        if (abstractC7783Mo19776.f20405 != EnumC3600.f7338) {
            return abstractC7783Mo19776;
        }
        C13194 c13194 = (C13194) abstractC7783Mo19776.mo9143();
        AbstractC6462 abstractC6462 = this.f6711;
        return (AbstractC7783) c13194.f37078.f75323.m19437(c13194.f37079.m10294(), abstractC6462, true).orElse(c13194);
    }

    @Override // p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 mo5929(C4036 c4036, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        if (!abstractC7784.f20405.m6625()) {
            return abstractC7784;
        }
        AbstractC6462 abstractC6462 = this.f6711;
        C4848 c4848 = this.f6710;
        C23663 c23663 = this.f59361;
        return c23663.m52657(abstractC7784, interfaceC5323, abstractC7783, abstractC6462, this.f6709, true, this.f6707, c4848, (InterfaceC2719) c23663.f75336);
    }

    @Override // p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final void mo5931(InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783) {
        C18258 c18258M18543;
        C18258 c18258M18544;
        AbstractC6462 abstractC6462 = this.f6711;
        C23663 c23663 = this.f59361;
        C23623 c23623 = c23663.f75324;
        C22004 c22004 = c23663.f75331;
        C8005 c8005 = c23663.f75333;
        EnumSet enumSet = c23663.f75310;
        boolean zM6625 = abstractC7783.f20405.m6625();
        if (zM6625 || enumSet.contains(EnumC22993.SUCCESS)) {
            if (!zM6625 || enumSet.contains(EnumC22993.FAILURE)) {
                if (abstractC7783.f20408 == c23663.f75320.f21737 && abstractC7783.f20407 == c22004.f69208.f16705 && !enumSet.contains(EnumC22993.OBJECT_INIT)) {
                    return;
                }
                if (abstractC6462 != c22004.f69140.f20406 || enumSet.contains(EnumC22993.PREDEF)) {
                    if (!c23663.f75305.f40076 || enumSet.contains(EnumC22993.INTERNAL)) {
                        C20271 c20271 = new C20271();
                        int i = -1;
                        int i2 = 0;
                        for (C14789 c14789 : c23663.f75305.f40074) {
                            EnumC18298 enumC18298 = c23663.f75305.f40077;
                            EnumC18298 enumC18299 = c14789.f42189;
                            AbstractC7783 abstractC7784 = c14789.f42190;
                            if (enumC18298 != enumC18299 || ((c14789.m33755() && !enumSet.contains(EnumC22993.APPLICABLE)) || !(c14789.m33755() || enumSet.contains(EnumC22993.INAPPLICABLE)))) {
                                enumSet = enumSet;
                            } else {
                                if (c14789.m33755()) {
                                    AbstractC6462 abstractC6463 = c14789.f42188;
                                    if (abstractC7784.f20406.m14777(EnumC11353.FORALL)) {
                                        C13370 c13370 = C13665.f38450;
                                        c18258M18544 = c8005.m18543(new C13370("compiler", "partial.inst.sig", abstractC6463));
                                    } else {
                                        c18258M18544 = null;
                                    }
                                    c18258M18543 = c8005.m18548(c18258M18544 == null ? "applicable.method.found" : "applicable.method.found.1", Integer.valueOf(i2), abstractC7784, c18258M18544);
                                } else {
                                    C18258 c18258 = c14789.f42187;
                                    C13370 c13371 = C13665.f38450;
                                    c18258M18543 = c8005.m18543(new C13370("compiler", "not.applicable.method.found", Integer.valueOf(i2), abstractC7784, c18258));
                                }
                                c20271.m45777(c18258M18543);
                                if (abstractC7784 == abstractC7783) {
                                    i = i2;
                                }
                                i2++;
                            }
                            enumSet = enumSet;
                        }
                        String str = !zM6625 ? "verbose.resolve.multi" : "verbose.resolve.multi.1";
                        C14152 c14152 = c23663.f75332;
                        C12826.requireNonNull(c14152);
                        c23623.mo9356(new C24098(c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c23623.m9345(), interfaceC5323, c8005.m18549(str, this.f6709, abstractC6462.f16705, Integer.valueOf(i), c23663.f75305.f40077, c23663.m52638(this.f6707.m10287((Function) new C5435(c14152, EnumC15511.SPECULATIVE, abstractC7783, c23663.f75305.f40077))), c23663.m52638(this.f6710))), c20271.m45783()));
                    }
                }
            }
        }
    }
}
