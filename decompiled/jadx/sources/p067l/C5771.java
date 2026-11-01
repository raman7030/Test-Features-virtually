package p067l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public class C5771 extends AbstractC7783 implements InterfaceC15755 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C19866 f14170 = new C19866(3);

    /* JADX INFO: renamed from: ۛ */
    public C4848 f14171;

    /* JADX INFO: renamed from: ۟ */
    public C4848 f14172;

    /* JADX INFO: renamed from: ۨ */
    public C3666 f14173;

    /* JADX INFO: renamed from: ܰ */
    public C4848 f14174;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC10564 f14175;

    /* JADX INFO: renamed from: ۙ֫ */
    public C5771 mo12940() {
        return this;
    }

    @Override // p067l.AbstractC7783
    public final String toString() {
        String string;
        if ((this.f20409 & 1048576) != 0) {
            return this.f20407.f20408.toString();
        }
        AbstractC12224 abstractC12224 = this.f20408;
        String string2 = abstractC12224 == abstractC12224.f34165.f40540.f21737 ? this.f20407.f20408.toString() : abstractC12224.toString();
        AbstractC6462 abstractC6462 = this.f20406;
        if (abstractC6462 == null) {
            return string2;
        }
        if (abstractC6462.m14777(EnumC11353.FORALL)) {
            string2 = "<" + ((C11945) this.f20406).f33323 + ">" + string2;
        }
        StringBuilder sbM21133 = C9179.m21133(string2, MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC6462 abstractC6463 = this.f20406;
        boolean z = (this.f20409 & 17179869184L) != 0;
        C4848 c4848Mo14797 = abstractC6463.mo14797();
        if (z) {
            StringBuilder sb = new StringBuilder();
            while (c4848Mo14797.f11035.m10293()) {
                sb.append(c4848Mo14797.f11034);
                c4848Mo14797 = c4848Mo14797.f11035;
                sb.append(',');
            }
            if (((AbstractC6462) c4848Mo14797.f11034).m14777(EnumC11353.ARRAY)) {
                sb.append(((C7251) c4848Mo14797.f11034).f18916);
                if (((AbstractC6462) c4848Mo14797.f11034).m14795().m10293()) {
                    sb.append(((AbstractC6462) c4848Mo14797.f11034).m14795());
                }
                sb.append("...");
            } else {
                sb.append(c4848Mo14797.f11034);
            }
            string = sb.toString();
        } else {
            string = c4848Mo14797.m10285(",");
        }
        return C10965.m25286(sbM21133, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // p067l.InterfaceC15755
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo12933() {
        return (this.f20409 & 17179869184L) != 0;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ܳ */
    public final Set mo12941() {
        long j = this.f20409;
        if ((8796093022208L & j) != 0) {
            j &= -1025;
        }
        return C21036.m47447(j);
    }

    /* JADX INFO: renamed from: ֨ */
    public C4848 mo9253() {
        return this.f20406.mo14794();
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC6462 mo9258() {
        return this.f20406.mo14787();
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
        return mo9259();
    }

    public C5771(long j, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783) {
        super(EnumC3600.f7343, j, abstractC12224, abstractC6462, abstractC7783);
        this.f14173 = null;
        this.f14174 = C4848.m10283();
        this.f14171 = C4848.m10283();
        this.f14172 = null;
        this.f14175 = null;
        if (abstractC7783.f20406.m14777(EnumC11353.TYPEVAR)) {
            C1446.m31702(abstractC7783 + "." + ((Object) abstractC12224));
            throw null;
        }
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۧ */
    public AbstractC7783 mo9256(AbstractC7783 abstractC7783) {
        C4430 c4430 = new C4430(this, this.f20409, this.f20408, this.f20406, abstractC7783, abstractC7783);
        c4430.f14173 = this.f14173;
        return c4430;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public int mo3348() {
        return this.f20407.m17989() ? 11 : 10;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public C17169 mo12943() {
        return new C17169(this, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m12934(C15828 c15828, C8374 c8374) {
        AbstractC21195 abstractC21195 = c15828;
        while (abstractC21195 != null) {
            for (AbstractC7783 abstractC7783 : abstractC21195.mo17983().m22456(this.f20408)) {
                EnumC3600 enumC3600 = abstractC7783.f20405;
                EnumC3600 enumC3601 = EnumC3600.f7343;
                if (enumC3600 == enumC3601) {
                    C5771 c5771 = (C5771) abstractC7783;
                    if (!c5771.m17994() && this.f20405 == enumC3601) {
                        if (c5771 != this) {
                            if (m12932((AbstractC21195) c5771.f20407)) {
                                if (c8374.m19467(this.f20407, c5771.f20407.f20406) == null || !c8374.m19490(c5771.mo18010(c8374), mo18010(c8374))) {
                                }
                            }
                            if ((c5771.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 || !m12932((AbstractC21195) c15828) || !c5771.m17986((AbstractC21195) c15828, c8374) || !c8374.m19490(c5771.mo18010(c8374), mo18010(c8374))) {
                            }
                        }
                        return c5771;
                    }
                }
            }
            abstractC21195 = c8374.m19502(abstractC21195.f20406).f16705;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12938(AbstractC7783 abstractC7783, AbstractC21195 abstractC21195, C8374 c8374, boolean z) {
        long j;
        AbstractC6462 abstractC6462M19483;
        AbstractC6462 abstractC6462M19484;
        C3686 c3686;
        C4848 c4848Mo14802;
        if (m17994() || abstractC7783.f20405 != EnumC3600.f7343) {
            return false;
        }
        if (this != abstractC7783) {
            C5771 c5771 = (C5771) abstractC7783;
            if (c5771.m12932((AbstractC21195) this.f20407)) {
                if (c8374.m19467(c5771.f20407, this.f20407.f20406) != null) {
                    AbstractC6462 abstractC6462M19485 = c8374.m19483(this, this.f20407.f20406);
                    AbstractC6462 abstractC6462M19486 = c8374.m19483(c5771, this.f20407.f20406);
                    if (!c8374.m19472(abstractC6462M19485, abstractC6462M19486, true) || (z && !c8374.m19501(abstractC6462M19485, abstractC6462M19486))) {
                        if ((this.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            return false;
                        }
                        j = c5771.f20409;
                        if (((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0 && (j & 8796093022208L) == 0) || !c5771.m12932(abstractC21195) || !m17986(abstractC21195, c8374)) {
                            return false;
                        }
                        abstractC6462M19483 = c8374.m19483(this, abstractC21195.f20406);
                        abstractC6462M19484 = c8374.m19483(c5771, abstractC21195.f20406);
                        if (!c8374.m19472(abstractC6462M19483, abstractC6462M19484, true)) {
                            return false;
                        }
                        if (z) {
                            c3686 = c8374.f22469;
                            c4848Mo14802 = abstractC6462M19483.mo14802();
                            if (!c8374.m19445(abstractC6462M19483.mo14787(), c8374.m19428(abstractC6462M19484.mo14787(), abstractC6462M19484.mo14802(), c4848Mo14802), c3686)) {
                                return false;
                            }
                        }
                    }
                } else {
                    if ((this.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        return false;
                    }
                    j = c5771.f20409;
                    if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                    }
                    abstractC6462M19483 = c8374.m19483(this, abstractC21195.f20406);
                    abstractC6462M19484 = c8374.m19483(c5771, abstractC21195.f20406);
                    if (!c8374.m19472(abstractC6462M19483, abstractC6462M19484, true)) {
                        return false;
                    }
                    if (z) {
                        c3686 = c8374.f22469;
                        c4848Mo14802 = abstractC6462M19483.mo14802();
                        if (!c8374.m19445(abstractC6462M19483.mo14787(), c8374.m19428(abstractC6462M19484.mo14787(), abstractC6462M19484.mo14802(), c4848Mo14802), c3686)) {
                            return false;
                        }
                    }
                }
            } else {
                if ((this.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                    return false;
                }
                j = c5771.f20409;
                if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                }
                abstractC6462M19483 = c8374.m19483(this, abstractC21195.f20406);
                abstractC6462M19484 = c8374.m19483(c5771, abstractC21195.f20406);
                if (!c8374.m19472(abstractC6462M19483, abstractC6462M19484, true)) {
                    return false;
                }
                if (z) {
                    c3686 = c8374.f22469;
                    c4848Mo14802 = abstractC6462M19483.mo14802();
                    if (!c8374.m19445(abstractC6462M19483.mo14787(), c8374.m19428(abstractC6462M19484.mo14787(), abstractC6462M19484.mo14802(), c4848Mo14802), c3686)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m12932(AbstractC21195 abstractC21195) {
        int i = (int) (this.f20409 & 7);
        if (i == 0) {
            return m18008() == abstractC21195.m18008() && (abstractC21195.mo18003() & 512) == 0;
        }
        if (i != 1) {
            return i == 4 && (abstractC21195.mo18003() & 512) == 0;
        }
        return !this.f20407.m17989() || (this.f20409 & 8) == 0;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12937(AbstractC7783 abstractC7783, C8374 c8374) {
        if (((int) (this.f20409 & 7)) != 1) {
            return super.mo12937(abstractC7783, c8374);
        }
        return !this.f20407.m17989() || abstractC7783 == this.f20407 || (this.f20409 & 8) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m12935(AbstractC21195 abstractC21195, C8374 c8374, boolean z) {
        C5771 c5771M19425 = c8374.m19425(this, abstractC21195, z, f14170);
        if (c5771M19425 != null) {
            return c5771M19425;
        }
        if (!c8374.m19497(abstractC21195.f20406) || abstractC21195.m17989()) {
            return null;
        }
        return m12935(c8374.m19502(abstractC21195.f20406).f16705, c8374, z);
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final C4848 m12939() {
        this.f20407.mo18020();
        if (this.f14172 == null) {
            C20271 c20271 = new C20271();
            Iterator it = this.f20406.mo14797().iterator();
            int i = 0;
            while (it.hasNext()) {
                c20271.m45777(new C13818(8589934592L, this.f20408.f34165.m32717("arg" + i), (AbstractC6462) it.next(), this));
                i++;
            }
            this.f14172 = c20271.m45783();
        }
        C1446.m31699(this.f14172);
        return this.f14172;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo12936(AbstractC6462 abstractC6462, C8374 c8374) {
        return new C5771(this.f20409, this.f20408, c8374.m19483(this, abstractC6462), this.f20407);
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final EnumC24473 mo3347() {
        AbstractC12224 abstractC12224 = this.f20408;
        C8200 c8200 = abstractC12224.f34165.f40540;
        if (abstractC12224 == c8200.f21737) {
            return EnumC24473.CONSTRUCTOR;
        }
        if (abstractC12224 == c8200.f21700) {
            return EnumC24473.STATIC_INIT;
        }
        if ((this.f20409 & 1048576) != 0) {
            return mo17483() ? EnumC24473.STATIC_INIT : EnumC24473.INSTANCE_INIT;
        }
        return EnumC24473.METHOD;
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public final boolean m12942() {
        return mo3347() == EnumC24473.STATIC_INIT || mo3347() == EnumC24473.INSTANCE_INIT;
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC10564 mo9254() {
        return this.f14175;
    }

    public C4848 getParameters() {
        return m12939();
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        return abstractC10412.mo12426(this, obj);
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo25475(this, (Object) locale);
    }
}
