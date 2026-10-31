package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public class C3581 extends AbstractC5698 implements InterfaceC14085 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C18411 f11365 = new C18411(3);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2609 f11366;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C2609 f11367;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1365 f11368;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2609 f11369;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC8624 f11370;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C3581 mo10964() {
        return this;
    }

    @Override // l.AbstractC5698
    public final String toString() {
        String string;
        if ((this.f17563 & 1048576) != 0) {
            return this.f17561.f17562.toString();
        }
        AbstractC10370 abstractC10370 = this.f17562;
        String string2 = abstractC10370 == abstractC10370.f31203.f37517.f18879 ? this.f17561.f17562.toString() : abstractC10370.toString();
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 == null) {
            return string2;
        }
        if (abstractC4308.m12913(EnumC9454.FORALL)) {
            string2 = "<" + ((C10077) this.f17560).f30362 + ">" + string2;
        }
        StringBuilder sbM19190 = C7166.m19190(string2, MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC4308 abstractC4309 = this.f17560;
        boolean z = (this.f17563 & 17179869184L) != 0;
        C2609 c2609Mo12933 = abstractC4309.mo12933();
        if (z) {
            StringBuilder sb = new StringBuilder();
            while (c2609Mo12933.f8241.m8249()) {
                sb.append(c2609Mo12933.f8240);
                c2609Mo12933 = c2609Mo12933.f8241;
                sb.append(',');
            }
            if (((AbstractC4308) c2609Mo12933.f8240).m12913(EnumC9454.ARRAY)) {
                sb.append(((C5138) c2609Mo12933.f8240).f16077);
                if (((AbstractC4308) c2609Mo12933.f8240).m12931().m8249()) {
                    sb.append(((AbstractC4308) c2609Mo12933.f8240).m12931());
                }
                sb.append("...");
            } else {
                sb.append(c2609Mo12933.f8240);
            }
            string = sb.toString();
        } else {
            string = c2609Mo12933.m8241(",");
        }
        return C9045.m23341(sbM19190, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.InterfaceC14085
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo10957() {
        return (this.f17563 & 17179869184L) != 0;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Set mo10965() {
        long j = this.f17563;
        if ((8796093022208L & j) != 0) {
            j &= -1025;
        }
        return C19642.m45151(j);
    }

    /* JADX INFO: renamed from: ֨ */
    public C2609 mo7174() {
        return this.f17560.mo12930();
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC4308 mo7179() {
        return this.f17560.mo12923();
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ۜ */
    public InterfaceC11970 mo7176() {
        return this.f17561;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC10370 mo960() {
        return this.f17562;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ᩷ */
    public /* bridge */ /* synthetic */ C2609 mo7180() {
        return mo7180();
    }

    public C3581(long j, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4571, j, abstractC10370, abstractC4308, abstractC5698);
        this.f11368 = null;
        this.f11369 = C2609.m8239();
        this.f11366 = C2609.m8239();
        this.f11367 = null;
        this.f11370 = null;
        if (abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
            C12171.m29640(abstractC5698 + "." + ((Object) abstractC10370));
            throw null;
        }
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۧ */
    public AbstractC5698 mo7177(AbstractC5698 abstractC5698) {
        C2170 c2170 = new C2170(this, this.f17563, this.f17562, this.f17560, abstractC5698, abstractC5698);
        c2170.f11368 = this.f11368;
        return c2170;
    }

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public int mo953() {
        return this.f17561.m16070() ? 11 : 10;
    }

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C15574 mo10967() {
        return new C15574(this, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m10958(C14163 c14163, C6319 c6319) {
        AbstractC19810 abstractC19810 = c14163;
        while (abstractC19810 != null) {
            for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(this.f17562)) {
                EnumC1296 enumC1296 = abstractC5698.f17559;
                EnumC1296 enumC1297 = EnumC1296.f4571;
                if (enumC1296 == enumC1297) {
                    C3581 c3581 = (C3581) abstractC5698;
                    if (!c3581.m16075() && this.f17559 == enumC1297) {
                        if (c3581 != this) {
                            if (m10956((AbstractC19810) c3581.f17561)) {
                                if (c6319.m17527(this.f17561, c3581.f17561.f17560) == null || !c6319.m17550(c3581.mo16091(c6319), mo16091(c6319))) {
                                }
                            }
                            if ((c3581.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 || !m10956((AbstractC19810) c14163) || !c3581.m16067((AbstractC19810) c14163, c6319) || !c6319.m17550(c3581.mo16091(c6319), mo16091(c6319))) {
                            }
                        }
                        return c3581;
                    }
                }
            }
            abstractC19810 = c6319.m17562(abstractC19810.f17560).f13890;
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
    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10962(AbstractC5698 abstractC5698, AbstractC19810 abstractC19810, C6319 c6319, boolean z) {
        long j;
        AbstractC4308 abstractC4308M17543;
        AbstractC4308 abstractC4308M17544;
        C1386 c1386;
        C2609 c2609Mo12938;
        if (m16075() || abstractC5698.f17559 != EnumC1296.f4571) {
            return false;
        }
        if (this != abstractC5698) {
            C3581 c3581 = (C3581) abstractC5698;
            if (c3581.m10956((AbstractC19810) this.f17561)) {
                if (c6319.m17527(c3581.f17561, this.f17561.f17560) != null) {
                    AbstractC4308 abstractC4308M17545 = c6319.m17543(this, this.f17561.f17560);
                    AbstractC4308 abstractC4308M17546 = c6319.m17543(c3581, this.f17561.f17560);
                    if (!c6319.m17532(abstractC4308M17545, abstractC4308M17546, true) || (z && !c6319.m17561(abstractC4308M17545, abstractC4308M17546))) {
                        if ((this.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            return false;
                        }
                        j = c3581.f17563;
                        if (((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0 && (j & 8796093022208L) == 0) || !c3581.m10956(abstractC19810) || !m16067(abstractC19810, c6319)) {
                            return false;
                        }
                        abstractC4308M17543 = c6319.m17543(this, abstractC19810.f17560);
                        abstractC4308M17544 = c6319.m17543(c3581, abstractC19810.f17560);
                        if (!c6319.m17532(abstractC4308M17543, abstractC4308M17544, true)) {
                            return false;
                        }
                        if (z) {
                            c1386 = c6319.f19598;
                            c2609Mo12938 = abstractC4308M17543.mo12938();
                            if (!c6319.m17505(abstractC4308M17543.mo12923(), c6319.m17488(abstractC4308M17544.mo12923(), abstractC4308M17544.mo12938(), c2609Mo12938), c1386)) {
                                return false;
                            }
                        }
                    }
                } else {
                    if ((this.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        return false;
                    }
                    j = c3581.f17563;
                    if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                    }
                    abstractC4308M17543 = c6319.m17543(this, abstractC19810.f17560);
                    abstractC4308M17544 = c6319.m17543(c3581, abstractC19810.f17560);
                    if (!c6319.m17532(abstractC4308M17543, abstractC4308M17544, true)) {
                        return false;
                    }
                    if (z) {
                        c1386 = c6319.f19598;
                        c2609Mo12938 = abstractC4308M17543.mo12938();
                        if (!c6319.m17505(abstractC4308M17543.mo12923(), c6319.m17488(abstractC4308M17544.mo12923(), abstractC4308M17544.mo12938(), c2609Mo12938), c1386)) {
                            return false;
                        }
                    }
                }
            } else {
                if ((this.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                    return false;
                }
                j = c3581.f17563;
                if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                }
                abstractC4308M17543 = c6319.m17543(this, abstractC19810.f17560);
                abstractC4308M17544 = c6319.m17543(c3581, abstractC19810.f17560);
                if (!c6319.m17532(abstractC4308M17543, abstractC4308M17544, true)) {
                    return false;
                }
                if (z) {
                    c1386 = c6319.f19598;
                    c2609Mo12938 = abstractC4308M17543.mo12938();
                    if (!c6319.m17505(abstractC4308M17543.mo12923(), c6319.m17488(abstractC4308M17544.mo12923(), abstractC4308M17544.mo12938(), c2609Mo12938), c1386)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m10956(AbstractC19810 abstractC19810) {
        int i = (int) (this.f17563 & 7);
        if (i == 0) {
            return m16089() == abstractC19810.m16089() && (abstractC19810.mo16084() & 512) == 0;
        }
        if (i != 1) {
            return i == 4 && (abstractC19810.mo16084() & 512) == 0;
        }
        return !this.f17561.m16070() || (this.f17563 & 8) == 0;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10961(AbstractC5698 abstractC5698, C6319 c6319) {
        if (((int) (this.f17563 & 7)) != 1) {
            return super.mo10961(abstractC5698, c6319);
        }
        return !this.f17561.m16070() || abstractC5698 == this.f17561 || (this.f17563 & 8) == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m10959(AbstractC19810 abstractC19810, C6319 c6319, boolean z) {
        C3581 c3581M17485 = c6319.m17485(this, abstractC19810, z, f11365);
        if (c3581M17485 != null) {
            return c3581M17485;
        }
        if (!c6319.m17557(abstractC19810.f17560) || abstractC19810.m16070()) {
            return null;
        }
        return m10959(c6319.m17562(abstractC19810.f17560).f13890, c6319, z);
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m10963() {
        this.f17561.mo16101();
        if (this.f11367 == null) {
            C18837 c18837 = new C18837();
            Iterator it = this.f17560.mo12933().iterator();
            int i = 0;
            while (it.hasNext()) {
                c18837.m43511(new C12048(8589934592L, this.f17562.f31203.m30652("arg" + i), (AbstractC4308) it.next(), this));
                i++;
            }
            this.f11367 = c18837.m43517();
        }
        C12171.m29637(this.f11367);
        return this.f11367;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 mo10960(AbstractC4308 abstractC4308, C6319 c6319) {
        return new C3581(this.f17563, this.f17562, c6319.m17543(this, abstractC4308), this.f17561);
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final EnumC23258 mo952() {
        AbstractC10370 abstractC10370 = this.f17562;
        C6136 c6136 = abstractC10370.f31203.f37517;
        if (abstractC10370 == c6136.f18879) {
            return EnumC23258.CONSTRUCTOR;
        }
        if (abstractC10370 == c6136.f18842) {
            return EnumC23258.STATIC_INIT;
        }
        if ((this.f17563 & 1048576) != 0) {
            return mo15572() ? EnumC23258.STATIC_INIT : EnumC23258.INSTANCE_INIT;
        }
        return EnumC23258.METHOD;
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final boolean m10966() {
        return mo952() == EnumC23258.STATIC_INIT || mo952() == EnumC23258.INSTANCE_INIT;
    }

    /* JADX INFO: renamed from: ۖ */
    public AbstractC8624 mo7175() {
        return this.f11370;
    }

    public C2609 getParameters() {
        return m10963();
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10387(this, obj);
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫ */
    public Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo23524(this, (Object) locale);
    }
}
