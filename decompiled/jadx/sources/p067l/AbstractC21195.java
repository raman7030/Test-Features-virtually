package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21195 extends AbstractC7783 {
    /* JADX INFO: renamed from: ᩶֫ */
    public boolean mo35946() {
        return false;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ۜ */
    public InterfaceC13745 mo9255() {
        return this.f20407;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC12224 mo3355() {
        return this.f20408;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ᩷ */
    public /* bridge */ /* synthetic */ C4848 mo9259() {
        return super.mo9259();
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC12224 m47864(AbstractC12224 abstractC12224, AbstractC7783 abstractC7783) {
        if (abstractC7783 == null) {
            return abstractC12224;
        }
        EnumC3600 enumC3600 = abstractC7783.f20405;
        if (enumC3600 != EnumC3600.f7353) {
            if (enumC3600.m6623(C17010.f50315)) {
                return abstractC12224;
            }
            if (abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.f20406.m14777(EnumC11353.TYPEVAR)) {
                return abstractC12224;
            }
        }
        AbstractC12224 abstractC12224Mo17995 = abstractC7783.mo17995();
        return (abstractC12224Mo17995 == null || abstractC12224Mo17995 == abstractC12224Mo17995.f34165.f40540.f21725) ? abstractC12224 : abstractC12224Mo17995.m28200('.', abstractC12224);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC12224 m47863(AbstractC12224 abstractC12224, AbstractC7783 abstractC7783) {
        if (abstractC7783 == null || abstractC7783.f20405.m6623(C17010.f50315)) {
            return abstractC12224;
        }
        EnumC3600 enumC3600 = abstractC7783.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7354;
        if (enumC3600 == enumC3601 && abstractC7783.f20406.m14777(EnumC11353.TYPEVAR)) {
            return abstractC12224;
        }
        char c = abstractC7783.f20405 == enumC3601 ? '$' : '.';
        AbstractC12224 abstractC12224Mo18002 = abstractC7783.mo18002();
        return (abstractC12224Mo18002 == null || abstractC12224Mo18002 == abstractC12224Mo18002.f34165.f40540.f21725) ? abstractC12224 : abstractC12224Mo18002.m28200(c, abstractC12224);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47865(AbstractC21195 abstractC21195, C8374 c8374) {
        if (this == abstractC21195) {
            return false;
        }
        if (this.f20406.m14777(abstractC21195.f20406.mo5577())) {
            if (this.f20406.m14777(EnumC11353.CLASS)) {
                if (c8374.m19457(abstractC21195.f20406) >= c8374.m19457(this.f20406)) {
                    if (c8374.m19457(abstractC21195.f20406) != c8374.m19457(this.f20406)) {
                        return false;
                    }
                    AbstractC12224 abstractC12224Mo17995 = abstractC21195.mo17995();
                    AbstractC12224 abstractC12224Mo17996 = mo17995();
                    abstractC12224Mo17995.getClass();
                    if (abstractC12224Mo17996.mo5099() - abstractC12224Mo17995.mo5099() >= 0) {
                        return false;
                    }
                }
                return true;
            }
            if (this.f20406.m14777(EnumC11353.TYPEVAR)) {
                return c8374.m19486(this.f20406, abstractC21195.f20406, true);
            }
        }
        return this.f20406.m14777(EnumC11353.TYPEVAR);
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ܺ */
    public C4848 mo3353() {
        C4848 c4848M10283 = C4848.m10283();
        if (this.f20405 == EnumC3600.f7354 && this.f20406.m14777(EnumC11353.TYPEVAR)) {
            return c4848M10283;
        }
        m18022();
        for (AbstractC7783 abstractC7783 : mo17983().mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            abstractC7783.m18022();
            if ((abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && abstractC7783.f20407 == this && abstractC7783.f20405 != EnumC3600.f7353) {
                c4848M10283 = c4848M10283.m10290(abstractC7783);
            }
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public C23147 mo35948() {
        C1446.m31702("Only on ClassSymbol");
        throw null;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo6264(this, (Object) locale);
    }
}
