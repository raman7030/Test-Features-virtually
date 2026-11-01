package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11216 extends AbstractC2562 {

    /* JADX INFO: renamed from: ۘ֫ */
    public static final C6468 f31157 = new C6468();

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC11353[] f31158 = {EnumC11353.BYTE, EnumC11353.CHAR, EnumC11353.SHORT, EnumC11353.INT, EnumC11353.LONG, EnumC11353.FLOAT, EnumC11353.DOUBLE, EnumC11353.BOOLEAN};

    /* JADX INFO: renamed from: ֡ */
    public final C8005 f31159;

    /* JADX INFO: renamed from: ֨ */
    public C4036 f31160;

    /* JADX INFO: renamed from: ֫ */
    public boolean f31161;

    /* JADX INFO: renamed from: ֫֫ */
    public C24626 f31162;

    /* JADX INFO: renamed from: ۖ */
    public final C16852 f31163;

    /* JADX INFO: renamed from: ۖ֫ */
    public final C24626 f31164;

    /* JADX INFO: renamed from: ۗ */
    public final C4132 f31165;

    /* JADX INFO: renamed from: ۚ */
    public final C15492 f31168;

    /* JADX INFO: renamed from: ۛ */
    public final C12004 f31169;

    /* JADX INFO: renamed from: ۜ */
    public final C6383 f31170;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C18318 f31171;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC6462 f31172;

    /* JADX INFO: renamed from: ۠ */
    public final C12083 f31173;

    /* JADX INFO: renamed from: ۡ */
    public final C9874 f31174;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C24626 f31175;

    /* JADX INFO: renamed from: ۢ */
    public final C7664 f31176;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C24626 f31177;

    /* JADX INFO: renamed from: ۤ */
    public final C8200 f31178;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f31179;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C23663 f31180;

    /* JADX INFO: renamed from: ۨ */
    public final C24387 f31181;

    /* JADX INFO: renamed from: ۫ */
    public final C17920 f31182;

    /* JADX INFO: renamed from: ۬ */
    public final C18213 f31183;

    /* JADX INFO: renamed from: ܳ */
    public boolean f31185;

    /* JADX INFO: renamed from: ܺ */
    public final C6795 f31188;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f31189;

    /* JADX INFO: renamed from: ܽ */
    public boolean f31190;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f31191;

    /* JADX INFO: renamed from: ܿ */
    public boolean f31192;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C22004 f31193;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f31194;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C24626 f31195;

    /* JADX INFO: renamed from: ᩴ */
    public final C14152 f31196;

    /* JADX INFO: renamed from: ᩵ */
    public final C19694 f31197;

    /* JADX INFO: renamed from: ᩶ */
    public final C18537 f31198;

    /* JADX INFO: renamed from: ᩷ */
    public final C15099 f31199;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C8374 f31200;

    /* JADX INFO: renamed from: ᩸ */
    public final C8769 f31201;

    /* JADX INFO: renamed from: ᩹ */
    public final C23623 f31202;

    /* JADX INFO: renamed from: ᩺ */
    public final C15908 f31203;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f31204;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C18728 f31205;

    /* JADX INFO: renamed from: ܶ */
    public InterfaceC14249 f31187 = new C3839(this);

    /* JADX INFO: renamed from: ۙ */
    public C9755 f31167 = C4132.f9117;

    /* JADX INFO: renamed from: ܰ */
    public C24572 f31184 = new C23325();

    /* JADX INFO: renamed from: ܳ֫ */
    public C4351 f31186 = new C13937(this);

    /* JADX INFO: renamed from: ۘ */
    public HashMap f31166 = new HashMap();

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3808(C12483 c12483) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11216 m25910(C5127 c5127) {
        C11216 c11216 = (C11216) c5127.m10905(f31157);
        return c11216 == null ? new C11216(c5127) : c11216;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25943(final AbstractC7257 abstractC7257, final AbstractC6462 abstractC6462, final C17010 c17010, final C24626 c24626) {
        AbstractC6462 abstractC6462Mo15456;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        EnumC23995 enumC23995 = c24626.f77962;
        C17010 c17011 = c24626.f77963;
        AbstractC6462 abstractC6463 = c24626.f77965;
        final C2733 c2733Mo6098 = interfaceC6125.mo6098();
        boolean z = (abstractC6462.m14777(EnumC11353.ERROR) || abstractC6463.m14777(EnumC11353.METHOD) || abstractC6463.m14777(EnumC11353.FORALL)) ? false : true;
        if (z && !c17010.m38616(c17011)) {
            abstractC7257.getClass();
            EnumSet enumSetM38614 = c17011.m38614();
            EnumSet enumSetM38615 = c17010.m38614();
            C14040 c14040 = C8300.f21997;
            this.f31202.m9352(abstractC7257, new C14040("compiler", "unexpected.type", enumSetM38614, enumSetM38615));
            abstractC6462Mo15456 = this.f31200.m19475(abstractC6462);
        } else if (this.f31190 && abstractC6462.m14792(c2733Mo6098.f4594)) {
            AbstractC6462 abstractC6464 = z ? abstractC6463 : abstractC6462;
            if (enumC23995.mo30318()) {
                c2733Mo6098.m4255(C4848.m10276of((Object) abstractC6462), new InterfaceC5930() { // from class: l.۠᩶֨
                    @Override // p067l.InterfaceC5930
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6905(C2733 c2733) {
                        C11216 c11216 = this.f28651;
                        c11216.getClass();
                        C24626 c24627 = c24626;
                        AbstractC6462 abstractC6465 = c24627.f77965;
                        C2733 c2734 = c2733Mo6098;
                        C24626 c24626Mo40740 = c24627.mo40740(c2734.m4250(abstractC6465));
                        c11216.m25943(abstractC7257, c2734.m4250(abstractC6462), c17010, c24626Mo40740);
                    }
                });
            }
            abstractC6462Mo15456 = abstractC6464;
        } else {
            abstractC6462Mo15456 = z ? c24626.mo15456(abstractC7257, abstractC6462) : abstractC6462;
        }
        if (enumC23995.mo18248()) {
            abstractC7257.f18925 = abstractC6462Mo15456;
        }
        return abstractC6462Mo15456;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX INFO: renamed from: ֫ */
    public final void m25956(AbstractC14355 abstractC14355, C13818 c13818, AbstractC7257 abstractC7257, C4036 c4036) {
        boolean z;
        AbstractC12224 abstractC12224 = c13818.f20408;
        C8200 c8200 = this.f31178;
        AbstractC12224 abstractC12225 = c8200.f21744;
        C23623 c23623 = this.f31202;
        if (abstractC12224 != abstractC12225) {
            long j = c13818.f20409;
            if ((16 & j) != 0) {
                if ((j & 262144) == 0 && (abstractC7257 == null || C9268.m21419(abstractC7257))) {
                    AbstractC7783 abstractC7783 = ((C10545) c4036.f8849).f29201.f26587;
                    if (c13818.f20407 != abstractC7783) {
                        if ((abstractC7783.f20408 == c8200.f21737 || abstractC7783.f20405 == EnumC3600.f7339 || (abstractC7783.mo18003() & 1048576) != 0) && c13818.f20407 == abstractC7783.f20407) {
                            z = (((c13818.f20409 & 8) > 0L ? 1 : ((c13818.f20409 & 8) == 0L ? 0 : -1)) != 0) == C23663.m52631(c4036);
                        }
                    }
                    C10471 c10471 = c4036.f8853;
                    if (z & (!(c10471 != null && C9268.m21420(c10471)))) {
                        return;
                    }
                }
                if (c13818.m31484()) {
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(abstractC14355, new C14040("compiler", "try.resource.may.not.be.assigned", c13818));
                    return;
                } else {
                    C14040 c14041 = C8300.f21997;
                    c23623.m9352(abstractC14355, new C14040("compiler", "cant.assign.val.to.final.var", c13818));
                    return;
                }
            }
            return;
        }
        c23623.m9352(abstractC14355, C8300.f22100);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m25946(AbstractC14355 abstractC14355, C3626 c3626) {
        C4036 c4036M35244 = this.f31168.m35244(c3626);
        C18537 c18537 = this.f31198;
        C4436 c4436M42142 = c18537.m42142(0L);
        C22004 c22004 = this.f31193;
        C7650 c7650M42151 = c18537.m42151(c4436M42142, c22004.f69144.f20408, (C4848) null, (AbstractC14355) null, (C4848) null, (C4848) null);
        c4036M35244.f8855 = c7650M42151;
        c7650M42151.f20027 = c22004.f69144;
        return (AbstractC7783) abstractC14355.mo3380(this.f31187, c4036M35244);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25937(AbstractC7257 abstractC7257, C4036 c4036) {
        C6383 c6383 = this.f31170;
        C4036 c4037 = null;
        C24626 c24626 = null;
        c4037 = null;
        c4037 = null;
        c4037 = null;
        c4037 = null;
        c4037 = null;
        c4037 = null;
        if (!c6383.f16517.isEmpty() && !((C10545) c4036.f8849).f29199.f25979 && (abstractC7257 instanceof AbstractC13154) && !abstractC7257.m16617(EnumC19998.f60806) && !abstractC7257.m16617(EnumC19998.f60774) && !abstractC7257.m16617(EnumC19998.f60735) && !abstractC7257.m16617(EnumC19998.f60756)) {
            AbstractC7257 abstractC7258 = c4036.f8850;
            C10545 c10545 = (C10545) c4036.f8849;
            AbstractC15689 abstractC15689 = c10545.f29201;
            C4036 c4036M8087 = c4036.m8087(abstractC7258, c10545.m24327(abstractC15689.mo28416(abstractC15689.f26587)));
            C10545 c10546 = (C10545) c4036M8087.f8849;
            if (c10546.f29200 != null) {
                C11216 c11216 = c6383.f16521;
                C12826.requireNonNull(c11216);
                C24626 c24627 = c10546.f29200;
                c24626 = new C24626(c11216, c24627.f77963, c24627.f77965);
            }
            c10546.f29200 = c24626;
            c4037 = c4036M8087;
        }
        AbstractC6462 abstractC6462M25939 = m25939(abstractC7257, c4036, this.f31195);
        if (c4037 != null) {
            C17781 c17781 = new C17781(c6383, (AbstractC13154) abstractC7257, c4037);
            c17781.mo12739(c17781.f53088);
            if (!c17781.f53089.isEmpty()) {
                Iterator it = c17781.f53089.iterator();
                while (it.hasNext()) {
                    c6383.f16524.mo35816((C11748) it.next());
                }
            }
        }
        this.f31174.m23159();
        return abstractC6462M25939;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        AbstractC7783 abstractC7783M52643;
        AbstractC7783 abstractC7783;
        AbstractC7783 abstractC7783M52654;
        AbstractC12224 abstractC12224;
        boolean zM14777 = this.f31162.f77965.m14777(EnumC11353.METHOD);
        C23663 c23663 = this.f31180;
        if (zM14777 || this.f31162.f77965.m14777(EnumC11353.FORALL)) {
            C4036 c4036 = this.f31160;
            ((C10545) c4036.f8849).f29204 = null;
            AbstractC12224 abstractC12225 = c9661.f26610;
            C4848 c4848Mo14797 = this.f31162.f77965.mo14797();
            C4848 c4848Mo14802 = this.f31162.f77965.mo14802();
            c23663.getClass();
            C15828 c15828 = c4036.f8855.f20027;
            C7158 c7158 = c23663.f75311;
            C19228 c19228 = new C19228(c23663, abstractC12225, c15828.f20406, c4848Mo14797, c4848Mo14802);
            C14119 c14119 = new C14119(c23663);
            c14119.f40078 = c7158;
            abstractC7783M52643 = c23663.m52643(c4036, c9661, c15828, c14119, c19228);
        } else {
            abstractC7783M52643 = c9661.f26611;
            if (abstractC7783M52643 == null || abstractC7783M52643.f20405 == EnumC3600.f7339) {
                C4036 c4037 = this.f31160;
                AbstractC12224 abstractC12226 = c9661.f26610;
                AbstractC7783 abstractC7783M52662 = c23663.m52662(c9661, c4037, abstractC12226, this.f31162.f77963);
                AbstractC6462 abstractC6462 = c4037.f8855.f20027.f20406;
                abstractC7783M52643 = c23663.m52656(abstractC7783M52662, (InterfaceC5323) c9661, (AbstractC7783) abstractC6462.f16705, abstractC6462, abstractC12226, false);
            }
        }
        AbstractC7783 abstractC7784 = abstractC7783M52643;
        c9661.f26611 = abstractC7784;
        C4036 c4038 = this.f31160;
        EnumC3600 enumC3600 = c4038.f8855.f20027.f20407.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7351;
        C8200 c8200 = this.f31178;
        if (enumC3600 != enumC3601 && abstractC7784.f20405.m6623(C17010.f50315) && abstractC7784.f20407.f20405 == EnumC3600.f7354 && (abstractC12224 = c9661.f26610) != c8200.f21744 && abstractC12224 != c8200.f21756) {
            while (c4038.f8852 != null && !abstractC7784.m17986((AbstractC21195) c4038.f8855.f20027, this.f31200)) {
                c4038.f8855.f20027.mo18020();
                c4038 = c4038.f8852;
            }
        }
        EnumC3600 enumC3602 = abstractC7784.f20405;
        EnumC3600 enumC3603 = EnumC3600.f7339;
        if (enumC3602 == enumC3603) {
            C13818 c13818 = (C13818) abstractC7784;
            m25919((AbstractC14355) c9661, this.f31160, c13818, false);
            if (C17010.f50313.m38616(this.f31162.f77963)) {
                m25956(c9661, c13818, (AbstractC7257) null, this.f31160);
            }
        }
        boolean z = ((C10545) c4038.f8849).f29215;
        C16852 c16852 = this.f31163;
        if (z && abstractC7784.f20405.m6623(C17010.f50315) && abstractC7784.f20407.f20405 == EnumC3600.f7354 && (abstractC7784.mo18003() & 8) == 0) {
            if (abstractC7784.f20405 == enumC3603) {
                abstractC7783M52654 = abstractC7784;
            } else {
                C4036 c4039 = this.f31160;
                abstractC7783M52654 = c23663.m52654(c9661, c4039, c4039.f8855.f20027, c8200.f21744);
            }
            c16852.m38338(c9661, abstractC7783M52654);
        }
        C4036 c40310 = this.f31160;
        EnumC3600 enumC3604 = abstractC7784.f20405;
        if (enumC3604 != EnumC3600.f7353 && enumC3604 != EnumC3600.f7354 && (abstractC7783 = abstractC7784.f20407) != null && abstractC7783 != c40310.f8855.f20027) {
            while (c40310.f8852 != null && !c23663.m52668(this.f31160, c40310.f8855.f20027.f20406, abstractC7784)) {
                c40310 = c40310.f8852;
            }
        }
        C10545 c10545 = (C10545) this.f31160.f8849;
        if (c10545.f29203) {
            c16852.m38316(c9661, c10545.f29214);
        }
        this.f31172 = m25941(c9661, c40310.f8855.f20027.f20406, abstractC7784, this.f31160, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(final C15164 c15164) throws Throwable {
        C24626 c24626Mo40739;
        AbstractC6462 abstractC6462;
        EnumC21201 enumC21201 = (!this.f31162.f77965.m14777(EnumC11353.NONE) || (abstractC6462 = this.f31162.f77965) == AbstractC6462.f16699 || abstractC6462 == C8769.f23793) ? EnumC21201.POLY : EnumC21201.STANDALONE;
        c15164.f16661 = enumC21201;
        if (enumC21201 == EnumC21201.POLY && this.f31162.f77965.m14777(EnumC11353.VOID)) {
            this.f31162.f77961.mo3480(c15164, this.f31159.m18543(C13665.f38469));
            C13956 c13956M19475 = this.f31200.m19475(this.f31162.f77965);
            c15164.f18925 = c13956M19475;
            this.f31172 = c13956M19475;
            return;
        }
        EnumC21201 enumC21202 = c15164.f16661;
        EnumC21201 enumC21203 = EnumC21201.STANDALONE;
        if (enumC21202 == enumC21203) {
            c24626Mo40739 = this.f31177;
        } else {
            C24626 c24626 = this.f31162;
            c24626Mo40739 = c24626.mo40739(new C16618(this, c24626.f77961));
        }
        final C24626 c24627 = c24626Mo40739;
        final C20271 c20271 = new C20271();
        final C20271 c20272 = new C20271();
        m25912(c15164, c15164.f43267, c15164.f43269, new BiConsumer() { // from class: l.ᩳۙ֨
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C20391 c20391 = (C20391) obj;
                C4036 c4036 = (C4036) obj2;
                ((C10545) c4036.f8849).f29202 = c24627;
                C4848 c4848 = c20391.f63043;
                C11216 c11216 = this.f57655;
                c11216.m25965(c4848, c4036);
                new C9913(c11216, c15164, c20271, c20272).m35992(c20391.f63043);
            }
        });
        boolean zIsEmpty = c15164.f43269.isEmpty();
        C23623 c23623 = this.f31202;
        if (zIsEmpty) {
            c23623.m9352(c15164, C8300.f22156);
        } else if (c20272.isEmpty()) {
            c23623.m9352(c15164, C8300.f22161);
        }
        AbstractC6462 abstractC6462M25943 = m25943(c15164, c15164.f16661 == enumC21203 ? m25933(c20271.m45783(), c20272.m45783()) : this.f31162.f77965, C17010.f50311, this.f31162);
        c15164.f18925 = abstractC6462M25943;
        this.f31172 = abstractC6462M25943;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25939(AbstractC7257 abstractC7257, C4036 c4036, C24626 c24626) {
        AbstractC6462 abstractC6462M38271;
        C4036 c4037 = this.f31160;
        C24626 c24627 = this.f31162;
        try {
            try {
                this.f31160 = c4036;
                this.f31162 = c24626;
                if (c24626.mo8843(abstractC7257)) {
                    this.f31172 = this.f31176.m17746(abstractC7257, c4036);
                } else {
                    abstractC7257.mo3382(this);
                }
                C4132 c4132 = this.f31165;
                C9755 c9755 = this.f31167;
                c4132.getClass();
                switch (C15789.f45690[abstractC7257.mo3383().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        c9755 = C4132.f9117;
                        break;
                }
                this.f31167 = c9755;
                abstractC6462M38271 = this.f31172;
            } catch (C21865 e) {
                abstractC7257.f18925 = this.f31193.f69139;
                abstractC6462M38271 = this.f31163.m38271(abstractC7257, e);
            }
            return abstractC6462M38271;
        } finally {
            this.f31160 = c4037;
            this.f31162 = c24627;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4036 m25928(C4036 c4036) {
        AbstractC7257 abstractC7257 = c4036.f8850;
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        AbstractC15689 abstractC15689M35727 = AbstractC15689.m35727(abstractC15689.f26587);
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = abstractC15689.mo22455((Predicate) null, EnumC3620.RECURSIVE).iterator();
        while (it.hasNext()) {
            c4848M10283 = c4848M10283.m10290((AbstractC7783) it.next());
        }
        Iterator it2 = c4848M10283.iterator();
        while (it2.hasNext()) {
            abstractC15689M35727.mo28415((AbstractC7783) it2.next());
        }
        C4036 c4036M8087 = c4036.m8087(abstractC7257, c10545.m24327(abstractC15689M35727));
        C4036 c4037 = c4036M8087.f8852;
        if (c4037 != null) {
            c4036M8087.f8852 = m25928(c4037);
        }
        return c4036M8087;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25938(AbstractC7257 abstractC7257, C4036 c4036, AbstractC6462 abstractC6462) {
        C17010 c17010 = C17010.f50311;
        if (abstractC6462.m14777(EnumC11353.ERROR)) {
            abstractC6462 = AbstractC6462.f16700;
        }
        return m25939(abstractC7257, c4036, new C24626(this, c17010, abstractC6462));
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m25963(AbstractC7257 abstractC7257, C4036 c4036, AbstractC6462 abstractC6462) {
        return m25939(abstractC7257, c4036, new C24626(this, C17010.f50319, abstractC6462));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25965(C4848 c4848, C4036 c4036) {
        while (c4848.m10293()) {
            m25937((AbstractC7257) c4848.f11034, c4036);
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17010 m25949(C17010 c17010, C4848 c4848, C4036 c4036, C20271 c20271) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            AbstractC14355 abstractC14355 = (AbstractC14355) it.next();
            AbstractC6462 abstractC6462M38363 = this.f31163.m38363(abstractC14355, m25939(abstractC14355, c4036, this.f31190 ? this.f31182 : this.f31177));
            if (abstractC6462M38363.m14777(EnumC11353.DEFERRED)) {
                c17010 = C17010.m38613(C17010.f50310, c17010);
            }
            c20271.m45777(abstractC6462M38363);
        }
        return c17010;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m25932(C4848 c4848, C4036 c4036) {
        C20271 c20271 = new C20271();
        while (c4848.m10293()) {
            c20271.m45777(m25963((AbstractC7257) c4848.f11034, c4036, AbstractC6462.f16700));
            c4848 = c4848.f11035;
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25952(C4848 c4848, C4036 c4036, boolean z) {
        C4848 c4848M10276of;
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C15973 c15973 = (C15973) it.next();
            C10485 c10485 = (C10485) c15973.f18925;
            c10485.f16705.f20409 |= 268435456;
            C13286 c13286 = AbstractC6462.f16700;
            c10485.mo23233(c13286);
            boolean zIsEmpty = c15973.f46262.isEmpty();
            C8374 c8374 = this.f31200;
            if (!zIsEmpty) {
                C4848 c4848M10276of2 = C4848.m10276of((Object) m25963((AbstractC7257) c15973.f46262.f11034, c4036, c13286));
                Iterator it2 = c15973.f46262.f11035.iterator();
                while (it2.hasNext()) {
                    c4848M10276of2 = c4848M10276of2.m10290(m25963((AbstractC14355) it2.next(), c4036, AbstractC6462.f16700));
                }
                c4848M10276of = c4848M10276of2.m10294();
                c8374.getClass();
            } else {
                c4848M10276of = C4848.m10276of((Object) this.f31193.f69208);
                c8374.getClass();
            }
            c8374.m19441(c10485, c4848M10276of, ((AbstractC6462) c4848M10276of.f11034).f16705.m17989());
            c10485.f16705.f20409 &= -268435457;
        }
        if (z) {
            Iterator it3 = c4848.iterator();
            while (it3.hasNext()) {
                C15973 c15974 = (C15973) it3.next();
                c15974.getClass();
                this.f31163.m38320(c15974, (C10485) c15974.f18925);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m25930(C17249 c17249, C4036 c4036, C11281 c11281, AbstractC6462 abstractC6462) {
        C19694 c19694 = this.f31197;
        InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c11281);
        InterfaceC19740 interfaceC19740 = c17249.f8851.f7516;
        C23623 c23623 = this.f31202;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        try {
            m25917(c11281, c4036);
            AbstractC6462 abstractC6462M25938 = m25938((AbstractC7257) c11281.f31436, (C4036) c17249, abstractC6462);
            if (c11281.m26219()) {
                C13818 c13818 = c11281.f31438;
                abstractC6462 = this.f31163.m38268(c11281, abstractC6462M25938, c11281.f31433);
                c13818.f20406 = abstractC6462;
                c11281.f18925 = abstractC6462;
            }
            if (abstractC6462M25938.mo14779() != null) {
                return this.f31188.m15516(abstractC6462M25938, abstractC6462).mo14779();
            }
            return null;
        } finally {
            c23623.m9363(interfaceC19740M9363);
            c19694.m44730(interfaceC5323M44730);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25945(AbstractC14355 abstractC14355, C4036 c4036, boolean z, boolean z2, boolean z3) {
        AbstractC6462 abstractC6462M25963 = abstractC14355.f18925;
        if (abstractC6462M25963 == null) {
            abstractC6462M25963 = m25963(abstractC14355, c4036, AbstractC6462.f16700);
        }
        return m25935(abstractC6462M25963, abstractC14355, z, z2, z3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25935(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257, boolean z, boolean z2, boolean z3) {
        if (abstractC7257.m16617(EnumC19998.f60745)) {
            abstractC7257 = ((C17985) abstractC7257).f53722;
            abstractC7257.getClass();
        }
        boolean zIsEmpty = abstractC6462.f16705.f20408.isEmpty();
        C8374 c8374 = this.f31200;
        C23623 c23623 = this.f31202;
        if (zIsEmpty) {
            c23623.m9352(abstractC7257, C8300.f22157);
            return c8374.m19475(abstractC6462);
        }
        if (abstractC6462.mo14812()) {
            return abstractC6462;
        }
        boolean zM14777 = abstractC6462.m14777(EnumC11353.TYPEVAR);
        C16852 c16852 = this.f31163;
        if (zM14777 && !z && !z2) {
            if (abstractC6462.mo14803() == null) {
                c23623.m9352(abstractC7257, C8300.f22064);
                return c8374.m19475(abstractC6462);
            }
        } else {
            abstractC6462 = c16852.m38269(abstractC7257, abstractC6462, z3);
        }
        if (z2 && (abstractC6462.f16705.mo18003() & 512) == 0) {
            c23623.m9352(abstractC7257, C8300.f22005);
            return c8374.m19475(abstractC6462);
        }
        if (z3 && z && (abstractC6462.f16705.mo18003() & 512) != 0) {
            c23623.m9352(abstractC7257, C8300.f22060);
            return c8374.m19475(abstractC6462);
        }
        if (z3 && (abstractC6462.f16705.mo18003() & 16) != 0) {
            AbstractC21195 abstractC21195 = abstractC6462.f16705;
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC7257, new C14040("compiler", "cant.inherit.from.final", abstractC21195));
        }
        c16852.m38347(abstractC7257, abstractC6462);
        return abstractC6462;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC6462 m25906(C4036 c4036, C9661 c9661) {
        C7650 c7650 = c4036.f8855;
        Object obj = c4036.f8849;
        C15828 c15828 = c7650.f20027;
        c15828.mo18020();
        C1446.m31704((c15828.f20409 & 16384) != 0);
        C10545 c10545 = (C10545) obj;
        c9661.f18925 = c10545.f29201.f26587.m17990().f20406;
        c9661.f26611 = c10545.f29201.f26587.m17990();
        return c9661.f18925;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        C22417 c22417;
        C5831 c5831M13111;
        if (((C10545) this.f31160.f8849).f29199.f25979) {
            C7664 c7664 = this.f31176;
            c7664.getClass();
            c22417 = new C22417(c7664);
        } else {
            c22417 = null;
        }
        C18189 c18189OfNullable = C18189.ofNullable(c22417);
        try {
            boolean zM6623 = ((C10545) this.f31160.f8849).f29201.f26587.f20405.m6623(C17010.f50315);
            C15492 c15492 = this.f31168;
            if (zM6623) {
                c15492.m35242(c7650, this.f31160);
            } else if (this.f31160.f8850.m16617(EnumC19998.f60772) && (c5831M13111 = C5831.m13111(this.f31160.f8851, c7650)) != null) {
                Iterator it = c5831M13111.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC14919) it.next()).mo3381() == EnumC5532.ANNOTATION) {
                        c15492.m35242(c7650, this.f31160);
                        break;
                    }
                }
            }
            C15828 c15828 = c7650.f20027;
            if (c15828 == null) {
                this.f31172 = null;
            } else {
                c15828.mo18020();
                C4036 c4036 = this.f31160;
                if (((C10545) c4036.f8849).f29215 && c4036.f8850.m16617(EnumC19998.f60772)) {
                    c15828.f20409 |= 4194304;
                }
                try {
                    this.f31199.m34515();
                    m25957(c15828);
                } catch (C21865 e) {
                    this.f31163.m38271(c7650, e);
                }
                AbstractC6462 abstractC6462 = c15828.f20406;
                c7650.f18925 = abstractC6462;
                this.f31172 = abstractC6462;
            }
            c18189OfNullable.ifPresent(new C5652());
        } catch (Throwable th) {
            c18189OfNullable.ifPresent(new C5652());
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03c0  */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(final C10471 c10471) throws Throwable {
        C6953 c6953;
        C5771 c5771;
        C6953 c6954;
        C5771 c5772;
        C4036 c4036;
        C22004 c22004;
        C14040 c14040M19125;
        C11281 c11281;
        C15099 c15099 = this.f31199;
        C18213 c18213 = this.f31183;
        C18537 c18537 = this.f31198;
        C5771 c5773 = c10471.f28960;
        AbstractC12224 abstractC12224 = c10471.f28959;
        boolean z = (c5773.f20409 & 8796093022208L) != 0;
        C6953 c6953M15933 = ((C10545) this.f31160.f8849).f29205.m15933(c5773);
        C16852 c16852 = this.f31163;
        C6953 c6953M38273 = c16852.m38273(c6953M15933);
        C5771 c5771M38264 = c16852.m38264(c5773);
        try {
            this.f31197.m44731((AbstractC7257) c10471);
            c16852.m38305(c5773, c10471);
            C4036 c4036M41430 = c18213.m41430(c10471, this.f31160);
            Object obj = c4036M41430.f8849;
            ((C10545) obj).f29205 = c6953M15933;
            m25965(c10471.f28962, c4036M41430);
            if (c5773.mo17483()) {
                c16852.m38311(c10471, this.f31160.f8855.f18925, c5773);
            } else {
                c16852.m38342(c10471, this.f31160.f8855.f18925, c5773);
            }
            c16852.m38281(this.f31160, c10471, c5773);
            C8374 c8374 = this.f31200;
            C23623 c23623 = this.f31202;
            if (z) {
                c5772 = c5771M38264;
                try {
                    if (c8374.m19448(c5773.m17990(), c5773)) {
                        AbstractC12224 abstractC12225 = c5773.f20408;
                        EnumC10306 enumC10306M51425 = C23047.m51425(c5773.m17991());
                        AbstractC7783 abstractC7783M17991 = c5773.m17991();
                        C14040 c14040 = C8300.f21997;
                        c6954 = c6953M38273;
                        try {
                            c23623.m9352(c10471, new C14040("compiler", "default.overrides.object.member", abstractC12225, enumC10306M51425, abstractC7783M17991));
                        } catch (Throwable th) {
                            th = th;
                            c5771 = c5772;
                            c6953 = c6954;
                            c16852.m38273(c6953);
                            c16852.m38264(c5771);
                            throw th;
                        }
                    } else {
                        c6954 = c6953M38273;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c6954 = c6953M38273;
                    c5771 = c5772;
                    c6953 = c6954;
                    c16852.m38273(c6953);
                    c16852.m38264(c5771);
                    throw th;
                }
            } else {
                c6954 = c6953M38273;
                c5772 = c5771M38264;
            }
            for (C4848 c4848 = c10471.f28962; c4848.m10293(); c4848 = c4848.f11035) {
                ((C10545) obj).f29201.mo28412(((C15973) c4848.f11034).f18925.f16705);
            }
            C15828 c15828 = this.f31160.f8855.f20027;
            c15828.mo18020();
            if ((c15828.f20409 & 8192) != 0 && (c10471.f28963.m10293() || c10471.f28967 != null)) {
                if (c10471.f28963.m10293()) {
                    c11281 = (C11281) c10471.f28963.f11034;
                    c11281.getClass();
                } else {
                    c11281 = c10471.f28967;
                    c11281.getClass();
                }
                c23623.m9352(c11281, C8300.f22053);
            }
            for (C4848 c4849 = c10471.f28963; c4849.m10293(); c4849 = c4849.f11035) {
                m25937((AbstractC7257) c4849.f11034, c4036M41430);
            }
            c16852.m38308(c10471);
            c16852.m38283(c10471.f28962, c4036M41430);
            AbstractC14355 abstractC14355 = c10471.f28966;
            if (abstractC14355 != null && !abstractC14355.f18925.m14777(EnumC11353.VOID)) {
                c16852.m38298((AbstractC7257) c10471.f28966, c4036M41430, true);
            }
            if (c10471.f28967 != null) {
                C4036 c4036M41431 = c18213.m41430(c10471, this.f31160);
                m25963(c10471.f28967, c4036M41431, AbstractC6462.f16700);
                c16852.m38298((AbstractC7257) c10471.f28967, c4036M41431, true);
            }
            boolean zM35942 = this.f31160.f8855.f20027.m35942();
            C8200 c8200 = this.f31178;
            if (zM35942 && c10471.f28960.f20407.f20405 == EnumC3600.f7354) {
                C18189 c18189FindFirst = C7480.stream(this.f31160.f8855.f20027.m35943()).filter(new Predicate() { // from class: l.᩹᩶֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m52801or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        C5771 c5774 = ((C22536) obj2).f71074;
                        return c5774 == c10471.f28960 && (c5774.f20409 & 16777216) == 0;
                    }
                }).findFirst();
                if (c18189FindFirst.isPresent()) {
                    if (!c10471.f28960.m18018()) {
                        c23623.m9352(c10471, C8300.m19132(this.f31160.f8855.f20027, C13665.f38488));
                    }
                    if (!c8374.m19490(c10471.f28960.f20406.mo14787(), ((C22536) c18189FindFirst.get()).f20406)) {
                        c23623.m9352(c10471, C8300.m19132(this.f31160.f8855.f20027, C13665.m31064(c10471.f28960, (AbstractC7783) c18189FindFirst.get())));
                    }
                    if (c10471.f28960.f20406.mo14809().f35032 != null && !c10471.f28960.f20406.mo14809().f35032.isEmpty()) {
                        c23623.m9352(c10471, C8300.m19132(this.f31160.f8855.f20027, C13665.f38450));
                    }
                    if (!c10471.f28962.isEmpty()) {
                        c23623.m9352(c10471, C8300.m19132(this.f31160.f8855.f20027, C13665.f38480));
                    }
                    if (c10471.f28960.mo17483()) {
                        c23623.m9352(c10471, C8300.m19132(this.f31160.f8855.f20027, C13665.f38498));
                    }
                }
                AbstractC12224 abstractC12226 = c8200.f21737;
                AbstractC12224 abstractC12227 = c8200.f21744;
                if (abstractC12224 == abstractC12226) {
                    c4036 = c4036M41430;
                    long j = c10471.f28960.f20409;
                    if ((j & 2305843009213693952L) == 0) {
                        C17175 c17175M21432 = C9268.m21432(c10471);
                        if (c17175M21432 == null || C9268.m21428(c17175M21432.f51143) != abstractC12227 || !m25961(c17175M21432, c10471, false)) {
                            c23623.m9352(c10471, C8300.m19131(this.f31160.f8855.f20027));
                        }
                    } else {
                        if ((j & 68719476736L) == 0) {
                            if (C16852.m38211(c5773.f20409) > C16852.m38211(this.f31160.f8855.f20027.mo18003())) {
                                if ((this.f31160.f8855.f20027.mo18003() & 7) == 0) {
                                    c14040M19125 = C8300.m19125(C13665.f38491, this.f31160.f8855.f20027.f20408, C13665.m31061());
                                } else {
                                    C13370 c13370 = C13665.f38491;
                                    C15828 c15829 = this.f31160.f8855.f20027;
                                    c14040M19125 = C8300.m19125(c13370, c15829.f20408, new C13370("compiler", "canonical.must.not.have.stronger.access", C21036.m47446(c15829.mo18003() & 7)));
                                }
                                c23623.m9352(c10471, c14040M19125);
                            } else {
                                abstractC12224 = abstractC12224;
                                z = z;
                                obj = obj;
                            }
                            C17175 c17175M21433 = C9268.m21432(c10471);
                            if (c17175M21433 != null && ((C9268.m21428(c17175M21433.f51143) == abstractC12227 || C9268.m21428(c17175M21433.f51143) == c8200.f21756) && m25961(c17175M21433, c10471, false))) {
                                c23623.m9352(c10471, C8300.m19125(C13665.f38491, this.f31160.f8855.f20027.f20408, C13665.f38465));
                            }
                        } else {
                            abstractC12224 = abstractC12224;
                            z = z;
                            obj = obj;
                        }
                        if (!c10471.f28962.isEmpty()) {
                            c23623.m9352(c10471, C8300.m19125(C13665.f38491, this.f31160.f8855.f20027.f20408, C13665.f38513));
                        }
                        C4848 c4848M35943 = this.f31160.f8855.f20027.m35943();
                        C4848 c4848M10287 = C9268.m21402(this.f31160.f8855).m10287((Function) new C18144(6));
                        for (C11281 c11282 : c10471.f28963) {
                            boolean z2 = (c11282.f31438.f20409 & 17179869184L) != 0;
                            if (!c8374.m19490(c11282.f18925, (AbstractC6462) c4848M10287.f11034) || ((C22536) c4848M35943.f11034).m50506() != z2) {
                                c23623.m9352(c11282, C8300.m19125(C13665.f38491, this.f31160.f8855.f20027.f20408, C13665.f38452));
                            }
                            c4848M35943 = c4848M35943.f11035;
                            c4848M10287 = c4848M10287.f11035;
                        }
                    }
                } else {
                    c4036 = c4036M41430;
                }
                obj = obj;
            } else {
                c4036 = c4036M41430;
                obj = obj;
            }
            if ((c15828.mo18003() & 8192) != 0) {
                if (c10471.f28957.m10293()) {
                    AbstractC14355 abstractC14356 = (AbstractC14355) c10471.f28957.f11034;
                    abstractC14356.getClass();
                    c23623.m9352(abstractC14356, C8300.f22013);
                }
                if (c10471.f28962.m10293()) {
                    C15973 c15973 = (C15973) c10471.f28962.f11034;
                    c15973.getClass();
                    c23623.m9352(c15973, C8300.f22107);
                }
                c16852.m38340(c10471.f28966);
                c16852.m38309(c10471, c5773);
            }
            C4848 c48410 = c10471.f28957;
            while (true) {
                boolean zM10293 = c48410.m10293();
                c22004 = this.f31193;
                if (!zM10293) {
                    break;
                }
                AbstractC14355 abstractC14357 = (AbstractC14355) c48410.f11034;
                abstractC14357.getClass();
                c16852.m38267(abstractC14357, ((AbstractC14355) c48410.f11034).f18925, c22004.f69161, c16852.f49905);
                c48410 = c48410.f11035;
            }
            if (c10471.f28958 == null) {
                if (c10471.f28964 != null && (c15828.mo18003() & 8192) == 0) {
                    c23623.m9352(c10471, C8300.f22030);
                }
                if (z || (c10471.f28960.mo18003() & 1280) == 0) {
                    c23623.m9352(c10471, C8300.f22000);
                }
            } else {
                if ((c10471.f28960.mo18003() & 8796093023234L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                    if ((c15828.mo18003() & 512) != 0) {
                        C4968 c4968 = c10471.f28958;
                        c4968.getClass();
                        c23623.m9352(c4968, C8300.f22016);
                    } else {
                        c23623.m9352(c10471, C8300.f21997);
                    }
                } else if ((c10471.f28961.f9954 & 256) != 0) {
                    c23623.m9352(c10471, C8300.f22170);
                }
                if (abstractC12224 == c8200.f21737 && c15828.f20406 != c22004.f69208) {
                    C4968 c4969 = c10471.f28958;
                    if (c4969.f11316.isEmpty() || C9268.m21406(c4969.f11316, c8200) == c8200.f21725) {
                        c18537.m42188(c4969.f18924);
                        c4969.f11316 = c4969.f11316.m10290(c18537.m42196(c18537.m42172(c18537.m42194(c8200.f21756), C4848.m10283(), c18537.m42204(C4848.m10283()))));
                    } else if ((this.f31160.f8855.f20027.mo18003() & 16384) != 0 && (c10471.f28961.f9954 & 68719476736L) == 0 && C9268.m21417((AbstractC7257) c4969.f11316.f11034)) {
                        AbstractC13154 abstractC13154 = (AbstractC13154) c10471.f28958.f11316.f11034;
                        abstractC13154.getClass();
                        c23623.m9352(abstractC13154, C8300.m19121(this.f31160.f8855.f20027));
                    }
                    if (this.f31160.f8855.f20027.m35942() && (c10471.f28960.f20409 & 2305843009213693952L) != 0) {
                        if (!c10471.f28960.f14172.m10287((Function) new C8678(5)).equals(C9268.m21402(this.f31160.f8855).m10287((Function) new C22966(4)))) {
                            c23623.m9352(c10471, C8300.m19125(C13665.f38491, this.f31160.f8855.f20027.f20408, C13665.f38475));
                        }
                        if (c10471.f28960.f20406.mo14809().f35032 != null && !c10471.f28960.f20406.mo14809().f35032.isEmpty()) {
                            c23623.m9352(c10471, C8300.m19125(C9268.m21420(c10471) ? C13665.f38496 : C13665.f38491, this.f31160.f8855.f20027.f20408, new C13370("compiler", "throws.clause.not.allowed.for.canonical.constructor", C9268.m21420(c10471) ? C13665.f38496 : C13665.f38491)));
                        }
                    }
                }
                C4036 c4037 = c4036;
                c15099.m34510(c10471.f28958, c4037, c5773, (InterfaceC5323) null);
                c15099.m34515();
                m25937(c10471.f28958, c4037);
            }
            ((C10545) obj).f29201.mo28410();
            AbstractC6462 abstractC6462 = c5773.f20406;
            c10471.f18925 = abstractC6462;
            this.f31172 = abstractC6462;
            c16852.m38273(c6954);
            c16852.m38264(c5772);
        } catch (Throwable th3) {
            th = th3;
            c6953 = c6953M38273;
            c5771 = c5771M38264;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:39:0x00cf, B:41:0x00de, B:43:0x00e8, B:48:0x0122, B:50:0x0128, B:45:0x00f7, B:47:0x0118, B:51:0x012d, B:53:0x013f, B:55:0x0149, B:57:0x014f, B:59:0x0157), top: B:70:0x00cf }] */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C6953 c6953;
        boolean z;
        boolean z2;
        AbstractC14355 abstractC14355;
        C12850 c12850;
        AbstractC12224 abstractC12224 = c11281.f31433;
        C15099 c15099 = this.f31199;
        C4036 c4036 = this.f31160;
        AbstractC15689 abstractC15689 = ((C10545) c4036.f8849).f29201;
        EnumC3600 enumC3600 = abstractC15689.f26587.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7343;
        C18213 c18213 = this.f31183;
        C23623 c23623 = this.f31202;
        if (enumC3600 == enumC3601 || enumC3600 == EnumC3600.f7339) {
            C13818 c13818 = c11281.f31438;
            if (c13818 != null) {
                abstractC15689.mo28415(c13818);
            } else {
                if (c11281.m26219() && (c11281.f31435.f9954 & 8589934592L) == 0) {
                    AbstractC14355 abstractC14356 = c11281.f31436;
                    C18537 c18537 = this.f31198;
                    if (abstractC14356 == null) {
                        c23623.m9352(c11281, C8300.m19123(abstractC12224, C13665.f38471));
                        c11281.f31437 = c18537.m42191();
                    } else {
                        C12557 c12557 = new C12557();
                        c12557.f35279 = null;
                        c12557.f35280 = true;
                        c12557.mo12739(abstractC14356);
                        C13370 c13370 = c12557.f35279;
                        if (c13370 != null) {
                            c23623.m9352(c11281, C8300.m19123(abstractC12224, c13370));
                            c11281.f31437 = c18537.m42191();
                        }
                    }
                }
                try {
                    c15099.m34512();
                    c18213.m41432((AbstractC7257) c11281, this.f31160);
                    c15099.m34516();
                } catch (Throwable th) {
                    c15099.m34516();
                    throw th;
                }
            }
        } else {
            m25917(c11281, c4036);
        }
        C13818 c13819 = c11281.f31438;
        C6953 c6953M15933 = ((C10545) this.f31160.f8849).f29205.m15933(c13819);
        C16852 c16852 = this.f31163;
        C6953 c6953M38273 = c16852.m38273(c6953M15933);
        try {
            if (this.f31160.f8850.m16617(EnumC19998.f60747) && ((C15834) this.f31160.f8850).f45861 == EnumC18517.IMPLICIT) {
                c6953 = c6953M38273;
                z = (c11281.f31438.f20409 & 8589934592L) != 0;
                AbstractC14355 abstractC14357 = c11281.f31437;
                C4036 c4037 = this.f31160;
                if (!z || c11281.m26219()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                c16852.m38298(abstractC14357, c4037, z2);
                c13819.m31487();
                this.f31197.m44731((AbstractC7257) c11281);
                c16852.m38305(c13819, c11281);
                abstractC14355 = c11281.f31436;
                if (abstractC14355 != null) {
                    if ((c13819.f20409 & 16) != 0) {
                        c18213.getClass();
                        c12850 = new C12850();
                        abstractC14355.mo3382(c12850);
                        if (!c12850.f36154) {
                            C4036 c4038 = this.f31160;
                            c18213.getClass();
                            C17249 c17249M41429 = C18213.m41429(c11281, c4038);
                            Object obj = c17249M41429.f8849;
                            ((C10545) obj).f29205 = c6953M15933;
                            ((C10545) obj).f29209 = c13819;
                            m25938((AbstractC7257) c11281.f31436, (C4036) c17249M41429, c13819.f20406);
                            if (c11281.m26219()) {
                                c13819.f20406 = c16852.m38268(c11281, c11281.f31436.f18925, abstractC12224);
                            }
                        }
                    } else {
                        C4036 c4039 = this.f31160;
                        c18213.getClass();
                        C17249 c17249M414210 = C18213.m41429(c11281, c4039);
                        Object obj2 = c17249M414210.f8849;
                        ((C10545) obj2).f29205 = c6953M15933;
                        ((C10545) obj2).f29209 = c13819;
                        m25938((AbstractC7257) c11281.f31436, (C4036) c17249M414210, c13819.f20406);
                        if (c11281.m26219()) {
                            c13819.f20406 = c16852.m38268(c11281, c11281.f31436.f18925, abstractC12224);
                        }
                    }
                    if (c11281.m26219()) {
                        m25918(c11281, c13819.f20406);
                    }
                }
                AbstractC6462 abstractC6462 = c13819.f20406;
                c11281.f18925 = abstractC6462;
                this.f31172 = abstractC6462;
                if (this.f31160.f8855.f20027.m35942() && c11281.f31438.f20407.f20405 == EnumC3600.f7354 && !c13819.mo17483() && m25926(c13819.f20408)) {
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(c11281, new C14040("compiler", "illegal.record.component.name", c13819));
                }
                return;
            }
            c6953 = c6953M38273;
            c13819.m31487();
            this.f31197.m44731((AbstractC7257) c11281);
            c16852.m38305(c13819, c11281);
            abstractC14355 = c11281.f31436;
            if (abstractC14355 != null) {
                if ((c13819.f20409 & 16) != 0) {
                    c18213.getClass();
                    c12850 = new C12850();
                    abstractC14355.mo3382(c12850);
                    if (!c12850.f36154) {
                        C4036 c40310 = this.f31160;
                        c18213.getClass();
                        C17249 c17249M414211 = C18213.m41429(c11281, c40310);
                        Object obj3 = c17249M414211.f8849;
                        ((C10545) obj3).f29205 = c6953M15933;
                        ((C10545) obj3).f29209 = c13819;
                        m25938((AbstractC7257) c11281.f31436, (C4036) c17249M414211, c13819.f20406);
                        if (c11281.m26219()) {
                            c13819.f20406 = c16852.m38268(c11281, c11281.f31436.f18925, abstractC12224);
                        }
                    }
                } else {
                    C4036 c40311 = this.f31160;
                    c18213.getClass();
                    C17249 c17249M414212 = C18213.m41429(c11281, c40311);
                    Object obj4 = c17249M414212.f8849;
                    ((C10545) obj4).f29205 = c6953M15933;
                    ((C10545) obj4).f29209 = c13819;
                    m25938((AbstractC7257) c11281.f31436, (C4036) c17249M414212, c13819.f20406);
                    if (c11281.m26219()) {
                        c13819.f20406 = c16852.m38268(c11281, c11281.f31436.f18925, abstractC12224);
                    }
                }
                if (c11281.m26219()) {
                    m25918(c11281, c13819.f20406);
                }
            }
            AbstractC6462 abstractC6463 = c13819.f20406;
            c11281.f18925 = abstractC6463;
            this.f31172 = abstractC6463;
            if (this.f31160.f8855.f20027.m35942()) {
                C14040 c14041 = C8300.f21997;
                c23623.m9352(c11281, new C14040("compiler", "illegal.record.component.name", c13819));
            }
            return;
        } finally {
            c16852.m38273(c6953);
        }
        AbstractC14355 abstractC14358 = c11281.f31437;
        C4036 c40312 = this.f31160;
        if (z) {
            z2 = false;
        } else {
            z2 = false;
        }
        c16852.m38298(abstractC14358, c40312, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25917(C11281 c11281, C4036 c4036) {
        EnumC3600 enumC3600;
        AbstractC14355 abstractC14355 = c11281.f31436;
        if (abstractC14355 != null) {
            C4436 c4436 = c11281.f31435;
            long j = c4436.f9954;
            if ((j & 9007199254740992L) != 0 || (enumC3600 = ((C10545) c4036.f8849).f29201.f26587.f20405) == EnumC3600.f7343 || enumC3600 == EnumC3600.f7339) {
                return;
            }
            c4436.f9954 = j | 9007199254740992L;
            C13818 c13818 = c11281.f31438;
            C15099 c15099 = this.f31199;
            c15099.m34510(abstractC14355, c4036, c13818, c11281);
            c15099.m34515();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m25926(AbstractC12224 abstractC12224) {
        AbstractC15689 abstractC15689Mo17983 = this.f31193.f69208.f16705.mo17983();
        C21922 c21922 = new C21922(1);
        abstractC15689Mo17983.getClass();
        Iterator it = abstractC15689Mo17983.mo22457(abstractC12224, c21922, EnumC3620.RECURSIVE).iterator();
        while (it.hasNext()) {
            if (((AbstractC7783) it.next()).f20406.mo14797().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3793(C7789 c7789) {
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        C4036 c4036 = this.f31160;
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        AbstractC7783 abstractC7783 = abstractC15689.f26587;
        EnumC3600 enumC3600 = abstractC7783.f20405;
        if (enumC3600 == EnumC3600.f7354 || enumC3600 == EnumC3600.f7353) {
            long j = c4968.f11317;
            C5771 c5771 = new C5771(1048576 | j | (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX), this.f31178.f21725, null, ((C10545) this.f31160.f8849).f29201.f26587);
            C4036 c4037 = this.f31160;
            C10545 c10546 = (C10545) c4037.f8849;
            C4036 c4036M8087 = c4037.m8087(c4968, c10546.m24327(c10546.f29201.mo28416(c5771)));
            Object obj = c4036M8087.f8849;
            long j2 = j & 8;
            if (j2 != 0) {
                ((C10545) obj).f29213++;
            }
            C10545 c10547 = (C10545) obj;
            AbstractC7783 abstractC7784 = c10547.f29201.f26587;
            C15099 c15099 = this.f31199;
            c15099.m34510(c4968, c4036M8087, abstractC7784, (InterfaceC5323) null);
            c15099.m34515();
            m25965(c4968.f11316, c4036M8087);
            C15828 c15828 = (C15828) ((C10545) this.f31160.f8849).f29201.f26587;
            C4848 c4848Mo18000 = c10547.f29201.f26587.mo18000();
            if (j2 != 0) {
                c15828.m17998(c4848Mo18000);
            } else {
                c15828.m18011(c4848Mo18000);
            }
        } else {
            C4036 c4036M8088 = c4036.m8087(c4968, c10545.m24327(abstractC15689.mo28413(abstractC7783)));
            Object obj2 = c4036M8088.f8849;
            try {
                m25965(c4968.f11316, c4036M8088);
                ((C10545) obj2).f29201.mo28410();
            } catch (Throwable th) {
                ((C10545) obj2).f29201.mo28410();
                throw th;
            }
        }
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        AbstractC13154 abstractC13154 = c21732.f68446;
        C4036 c4036 = this.f31160;
        m25937(abstractC13154, c4036.m8087(c21732, c4036.f8849));
        m25938((AbstractC7257) c21732.f68447, this.f31160, (AbstractC6462) this.f31193.f69151);
        AbstractC13154 abstractC13155 = c21732.f68446;
        m25968(abstractC13155);
        if (!this.f31173.m27689(this.f31160, abstractC13155, this.f31198)) {
            C9755 c9755 = this.f31167;
            C4848 c4848 = c9755.f26938;
            AbstractC15689 abstractC15689 = ((C10545) this.f31160.f8849).f29201;
            C12826.requireNonNull(abstractC15689);
            C21230.forEach(c4848, new C5890(abstractC15689));
            C21230.forEach(c9755.f26938, new C19972());
        }
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        m25938((AbstractC7257) c10610.f29370, this.f31160, (AbstractC6462) this.f31193.f69151);
        C9755 c9755 = this.f31167;
        C4036 c4036 = this.f31160;
        C4848 c4848 = c9755.f26939;
        C4848 c4849 = c9755.f26938;
        C4036 c4036M25905 = m25905(c4036, c4036.f8850, c4848);
        Object obj = c4036M25905.f8849;
        try {
            m25937(c10610.f29369, c4036M25905.m8087(c10610, obj));
            ((C10545) obj).f29201.mo28410();
            AbstractC13154 abstractC13154 = c10610.f29369;
            m25968(abstractC13154);
            if (!this.f31173.m27689(this.f31160, abstractC13154, this.f31198)) {
                AbstractC15689 abstractC15689 = ((C10545) this.f31160.f8849).f29201;
                C12826.requireNonNull(abstractC15689);
                C21230.forEach(c4849, new C5890(abstractC15689));
                C21230.forEach(c4849, new C19972());
            }
            this.f31172 = null;
        } catch (Throwable th) {
            ((C10545) obj).f29201.mo28410();
            throw th;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        C4036 c4036 = this.f31160;
        AbstractC7257 abstractC7257 = c4036.f8850;
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        C4036 c4036M8087 = c4036.m8087(abstractC7257, c10545.m24327(abstractC15689.mo28413(abstractC15689.f26587)));
        Object obj = c4036M8087.f8849;
        C9755 c9755 = C4132.f9117;
        try {
            m25965(c13685.f38597, c4036M8087);
            AbstractC14355 abstractC14355 = c13685.f38598;
            if (abstractC14355 != null) {
                m25938((AbstractC7257) abstractC14355, c4036M8087, (AbstractC6462) this.f31193.f69151);
                c9755 = this.f31167;
            }
            C4848 c4848 = c9755.f26939;
            C4848 c4849 = c9755.f26938;
            C4036 c4036M25905 = m25905(c4036M8087, c4036M8087.f8850, c4848);
            try {
                c4036M25905.f8850 = c13685;
                m25965(c13685.f38596, c4036M25905);
                m25937(c13685.f38595, c4036M25905);
                ((C10545) c4036M25905.f8849).f29201.mo28410();
                this.f31172 = null;
                ((C10545) obj).f29201.mo28410();
                AbstractC13154 abstractC13154 = c13685.f38595;
                m25968(abstractC13154);
                if (this.f31173.m27689(this.f31160, abstractC13154, this.f31198)) {
                    return;
                }
                AbstractC15689 abstractC156810 = ((C10545) this.f31160.f8849).f29201;
                C12826.requireNonNull(abstractC156810);
                C21230.forEach(c4849, new C5890(abstractC156810));
                C21230.forEach(c4849, new C19972());
            } catch (Throwable th) {
                ((C10545) c4036M25905.f8849).f29201.mo28410();
                throw th;
            }
        } catch (Throwable th2) {
            ((C10545) obj).f29201.mo28410();
            throw th2;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        AbstractC6462 abstractC6462M19451;
        C22004 c22004 = this.f31193;
        C16852 c16852 = this.f31163;
        C8374 c8374 = this.f31200;
        C4036 c4036 = this.f31160;
        AbstractC7257 abstractC7257 = c4036.f8850;
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        C4036 c4036M8087 = c4036.m8087(abstractC7257, c10545.m24327(abstractC15689.mo28413(abstractC15689.f26587)));
        Object obj = c4036M8087.f8849;
        try {
            AbstractC6462 abstractC6462M25939 = m25939(c6979.f18158, c4036M8087, this.f31177);
            c8374.getClass();
            AbstractC6462 abstractC6462M19413 = C8374.m19413(abstractC6462M25939);
            c16852.m38363(c6979, abstractC6462M19413);
            AbstractC6462 abstractC6462M19455 = c8374.m19455(abstractC6462M19413);
            if (abstractC6462M19455 == null) {
                AbstractC6462 abstractC6462M19467 = c8374.m19467(c22004.f69188.f16705, abstractC6462M19413);
                C23623 c23623 = this.f31202;
                if (abstractC6462M19467 == null) {
                    AbstractC14355 abstractC14355 = c6979.f18158;
                    abstractC14355.getClass();
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(abstractC14355, new C14040("compiler", "foreach.not.applicable.to.type", abstractC6462M19413, C13665.f38482));
                    abstractC6462M19455 = c8374.m19475(abstractC6462M19413);
                } else {
                    C4848 c4848Mo14798 = abstractC6462M19467.mo14798();
                    if (c4848Mo14798.isEmpty()) {
                        abstractC6462M19451 = c22004.f69208;
                    } else {
                        abstractC6462M19451 = c8374.m19451((AbstractC6462) c4848Mo14798.f11034);
                    }
                    AbstractC6462 abstractC6462 = abstractC6462M19451;
                    if (c8374.m19467(c22004.f69194.f16705, this.f31180.m52640(c6979, c4036M8087, c8374.m19466(abstractC6462M19413, false), this.f31178.f21741, C4848.m10283(), C4848.m10283()).f20406.mo14787()) == null) {
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(c6979, new C14040("compiler", "foreach.not.applicable.to.type", abstractC6462M19413, C13665.f38482));
                    }
                    abstractC6462M19455 = abstractC6462;
                }
            }
            if (c6979.f18157.m26219()) {
                C11281 c11281 = c6979.f18157;
                m25918(c6979.f18157, c16852.m38268(c11281, abstractC6462M19455, c11281.f31433));
            }
            m25937((AbstractC7257) c6979.f18157, c4036M8087);
            AbstractC14355 abstractC14356 = c6979.f18158;
            abstractC14356.getClass();
            c16852.m38267(abstractC14356, abstractC6462M19455, c6979.f18157.f31438.f20406, c16852.f49905);
            c4036M8087.f8850 = c6979;
            m25937(c6979.f18156, c4036M8087);
            this.f31172 = null;
        } finally {
            ((C10545) obj).f29201.mo28410();
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        for (C4036 c4036 = this.f31160; c4036 != null && !c4036.f8850.m16617(EnumC19998.f60806); c4036 = c4036.f8848) {
            if (c4036.f8850.m16617(EnumC19998.f60756)) {
                AbstractC12224 abstractC12224 = ((C19188) c4036.f8850).f57352;
                AbstractC12224 abstractC12225 = c19188.f57352;
                if (abstractC12224 == abstractC12225) {
                    C14040 c14040 = C8300.f21997;
                    this.f31202.m9352(c19188, new C14040("compiler", "label.already.in.use", abstractC12225));
                    break;
                }
            }
        }
        AbstractC13154 abstractC13154 = c19188.f57351;
        C4036 c4037 = this.f31160;
        m25937(abstractC13154, c4037.m8087(c19188, c4037.f8849));
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) throws Throwable {
        m25912(c23882, c23882.f75829, c23882.f75828, new BiConsumer() { // from class: l.ܿۙ֨
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C11216 c11216 = this.f55625;
                c11216.getClass();
                c11216.m25965(((C20391) obj).f63043, (C4036) obj2);
            }
        });
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        c6309.f16360 = m25907(c6309, EnumC19998.f60780, c6309.f16359, this.f31160);
        this.f31172 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25912(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355, C4848 c4848, BiConsumer biConsumer) throws Throwable {
        Object obj;
        boolean zAnyMatch;
        boolean z;
        C16852 c16852;
        C24626 c24626;
        C9262 c9262;
        boolean z2;
        C24387 c24387;
        C20391 c20391;
        C8374 c8374;
        C16852 c16853;
        HashSet hashSet;
        C23663 c23663 = this.f31180;
        C22004 c22004 = this.f31193;
        C8374 c8375 = this.f31200;
        C4036 c4036 = this.f31160;
        C24626 c24627 = this.f31177;
        AbstractC6462 abstractC6462M25939 = m25939(abstractC14355, c4036, c24627);
        C4036 c4037 = this.f31160;
        C10545 c10545 = (C10545) c4037.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        C4036 c4036M8087 = c4037.m8087(abstractC7257, c10545.m24327(abstractC15689.mo28413(abstractC15689.f26587)));
        Object obj2 = c4036M8087.f8849;
        try {
            boolean z3 = (abstractC6462M25939.f16705.mo18003() & 16384) != 0;
            AbstractC6462 abstractC6462 = c22004.f69215;
            C9262 c9263 = c22004.f69134;
            boolean zM19490 = c8375.m19490(abstractC6462M25939, abstractC6462);
            C3686 c3686 = c8375.f22469;
            boolean zM21414 = C9268.m21414(abstractC14355, c4848);
            C24387 c24388 = this.f31181;
            if (!z3 && !zM19490 && !zM21414 && !c8375.m19471(abstractC6462M25939, c9263, c3686)) {
                c24388.m53742(abstractC14355, EnumC12477.f34960);
                zAnyMatch = true;
            } else {
                zAnyMatch = C7480.stream(c4848).flatMap(new C8466(8)).anyMatch(new C24665(0));
            }
            HashSet hashSet2 = new HashSet();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            C4848 c4849 = c4848;
            C4848 c4848M10283 = C4848.m10283();
            EnumC8690 enumC8690 = null;
            C9755 c9755 = null;
            while (true) {
                boolean zM10293 = c4849.m10293();
                z = zAnyMatch;
                c16852 = this.f31163;
                if (!zM10293) {
                    break;
                }
                obj = obj2;
                C4848 c48410 = c4849;
                C16852 c16854 = c16852;
                try {
                    C20391 c20392 = (C20391) c48410.f11034;
                    C23623 c23623 = this.f31202;
                    if (enumC8690 == null) {
                        enumC8690 = c20392.f63046;
                        c24626 = c24627;
                    } else {
                        c24626 = c24627;
                        if (enumC8690 != c20392.f63046 && !z7) {
                            c23623.m9352(c20392, C8300.f22145);
                            z7 = true;
                        }
                    }
                    Iterator it = c20392.f63044.iterator();
                    C9755 c9755M8371 = c9755;
                    EnumC8690 enumC8691 = enumC8690;
                    C4848 c4848M10290 = c4848M10283;
                    boolean z8 = z6;
                    boolean z9 = z5;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        AbstractC21062 abstractC21062 = (AbstractC21062) it.next();
                        if (abstractC21062.mo32948()) {
                            c20391 = c20392;
                            AbstractC14355 abstractC14356 = (AbstractC14355) abstractC21062;
                            if (C9268.m21395(abstractC14356)) {
                                c9262 = c9263;
                                c24388.m53742(abstractC14356, EnumC12477.f34966);
                                if (z8) {
                                    c23623.m9352(abstractC21062, C8300.f22162);
                                } else if (z5) {
                                    c23623.m9352(abstractC21062, C8300.f22023);
                                }
                                m25938((AbstractC7257) abstractC14356, c4036M8087, abstractC6462M25939);
                                C9755 c9756 = this.f31167;
                                c24387 = c24388;
                                this.f31167 = new C9755(c9756.f26939, c9756.f26938, true);
                                c23663 = c23663;
                                c8374 = c8375;
                                z8 = true;
                            } else {
                                c9262 = c9263;
                                C8374 c8376 = c8375;
                                c24387 = c24388;
                                if (z3) {
                                    AbstractC7783 abstractC7783M25908 = m25908(abstractC6462M25939, abstractC14356);
                                    if (abstractC7783M25908 == null) {
                                        c23623.m9352(abstractC14356, C8300.f22147);
                                    } else if (!hashSet2.add(abstractC7783M25908)) {
                                        c23623.m9352(abstractC21062, C8300.f22162);
                                    } else {
                                        m25922(abstractC21062, c4848M10290, abstractC7783M25908.f20406);
                                    }
                                } else if (zM21414) {
                                    InterfaceC2719 interfaceC2719 = c23663.f75335;
                                    try {
                                        c23663.f75335 = c23663.f75302;
                                        m25938((AbstractC7257) abstractC21062, c4036M8087, abstractC6462M25939);
                                        c23663.f75335 = interfaceC2719;
                                    } catch (Throwable th) {
                                        c23663.f75335 = interfaceC2719;
                                        throw th;
                                    }
                                } else {
                                    C17010 c17010 = C17010.f50308;
                                    EnumC11353 enumC11353 = EnumC11353.ERROR;
                                    AbstractC6462 abstractC6462M259310 = m25939(abstractC14356, c4036M8087, new C24626(this, c17010, !abstractC6462M25939.m14777(enumC11353) ? abstractC6462M25939 : AbstractC6462.f16700));
                                    if (!abstractC6462M259310.m14777(enumC11353)) {
                                        if (abstractC6462M259310.mo14779() == null) {
                                            AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC14356);
                                            if (abstractC7783M21438 != null && abstractC7783M21438.f20405 == EnumC3600.f7354 && this.f31179) {
                                                c23623.m9352(abstractC14356, C8300.f22012);
                                            } else {
                                                c23623.m9352(abstractC14356, zM19490 ? C8300.f21996 : C8300.f22084);
                                            }
                                        } else {
                                            if (zM19490) {
                                                c8374 = c8376;
                                            } else {
                                                c8374 = c8376;
                                                if (c8374.m19471(abstractC6462M25939, c9262, c3686)) {
                                                    c9262 = c9262;
                                                } else {
                                                    C14040 c14040 = C8300.f21997;
                                                    c9262 = c9262;
                                                    z2 = z3;
                                                    c23623.m9352(abstractC21062, new C14040("compiler", "constant.label.not.compatible", abstractC6462M259310, abstractC6462M25939));
                                                    c20391 = c20391;
                                                }
                                            }
                                            z2 = z3;
                                            if (!hashSet2.add(abstractC6462M259310.mo14779())) {
                                                c20391 = c20391;
                                                c23623.m9352(c20391, C8300.f22162);
                                            } else {
                                                c20391 = c20391;
                                                if (abstractC6462M259310.mo14805()) {
                                                    abstractC6462M259310 = c8374.m19436(abstractC6462M259310).f20406;
                                                }
                                                m25922(abstractC21062, c4848M10290, abstractC6462M259310);
                                            }
                                        }
                                    }
                                    c8374 = c8376;
                                }
                                c23663 = c23663;
                                c8374 = c8376;
                            }
                            z2 = z3;
                        } else {
                            c23663 = c23663;
                            c9262 = c9263;
                            z2 = z3;
                            c24387 = c24388;
                            c20391 = c20392;
                            c8374 = c8375;
                            if (!abstractC21062.m16617(EnumC19998.f60740)) {
                                C24626 c24628 = c24626;
                                m25939(abstractC21062, c4036M8087, c24628);
                                C11951 c11951M21423 = C9268.m21423((AbstractC23212) abstractC21062);
                                AbstractC6462 abstractC6462M27359 = c11951M21423.m27359();
                                if (abstractC6462M27359.m14777(EnumC11353.TYPEVAR)) {
                                    c16853 = c16854;
                                } else {
                                    c16853 = c16854;
                                    abstractC6462M27359 = c16853.m38265(abstractC21062, abstractC6462M27359);
                                }
                                m25925(abstractC21062, abstractC6462M25939, abstractC6462M27359);
                                AbstractC6462 abstractC6462M19459 = c8374.m19459(abstractC6462M27359);
                                if (!c11951M21423.m27360() || abstractC6462M19459.mo14812()) {
                                    hashSet = hashSet2;
                                    c24626 = c24628;
                                } else {
                                    hashSet = hashSet2;
                                    c24626 = c24628;
                                    if (c8374.m19486(c8374.m19459(abstractC6462M25939), abstractC6462M19459, true)) {
                                        if (z9) {
                                            c23623.m9352(abstractC21062, C8300.f22041);
                                        } else if (z4) {
                                            c23623.m9352(abstractC21062, C8300.f22083);
                                        }
                                        z9 = true;
                                    }
                                }
                                m25922(abstractC21062, c4848M10290, abstractC6462M19459);
                                if (c11951M21423.m27360() && !abstractC6462M19459.mo14812()) {
                                    c4848M10290 = c4848M10290.m10290(abstractC6462M19459);
                                }
                            } else {
                                if (z4) {
                                    c23623.m9352(abstractC21062, C8300.f22089);
                                } else if (z9) {
                                    c23623.m9352(abstractC21062, C8300.f22083);
                                }
                                this.f31167 = C4132.f9117;
                                z4 = true;
                            }
                            c9755M8371 = this.f31165.m8371(abstractC21062, c9755M8371, this.f31167);
                            hashSet2 = hashSet;
                            c8375 = c8374;
                            c20392 = c20391;
                            c16854 = c16853;
                            it = it2;
                            c9263 = c9262;
                            c24388 = c24387;
                            z3 = z2;
                            c23663 = c23663;
                        }
                        c16853 = c16854;
                        hashSet = hashSet2;
                        c9755M8371 = this.f31165.m8371(abstractC21062, c9755M8371, this.f31167);
                        hashSet2 = hashSet;
                        c8375 = c8374;
                        c20392 = c20391;
                        c16854 = c16853;
                        it = it2;
                        c9263 = c9262;
                        c24388 = c24387;
                        z3 = z2;
                        c23663 = c23663;
                    }
                    HashSet hashSet3 = hashSet2;
                    C23663 c23664 = c23663;
                    C9262 c9264 = c9263;
                    boolean z10 = z3;
                    C24387 c24389 = c24388;
                    C20391 c20393 = c20392;
                    C8374 c8377 = c8375;
                    C9755 c9757 = c9755M8371;
                    C4036 c4036M25905 = m25905(c4036M8087, c20393, c9757.f26939);
                    try {
                        biConsumer.accept(c20393, c4036M25905);
                        ((C10545) c4036M25905.f8849).f29201.mo28410();
                        AbstractC15689 abstractC156810 = ((C10545) obj).f29201;
                        for (C4848 c48411 = c20393.f63043; c48411.m10293(); c48411 = c48411.f11035) {
                            AbstractC7257 abstractC7258 = (AbstractC7257) c48411.f11034;
                            if (abstractC7258.m16617(EnumC19998.f60802)) {
                                abstractC156810.mo28415(((C11281) abstractC7258).f31438);
                            }
                        }
                        m25968(c20393);
                        boolean zM27688 = this.f31173.m27688(c4036M25905, c20393, this.f31198);
                        c20393.f63045 = zM27688;
                        if (c20393.f63046 != EnumC8690.STATEMENT || !zM27688) {
                            c9757 = null;
                        }
                        hashSet2 = hashSet3;
                        c4849 = c48410.f11035;
                        z5 = z9;
                        z6 = z8;
                        obj2 = obj;
                        c24627 = c24626;
                        c9263 = c9264;
                        c24388 = c24389;
                        z3 = z10;
                        c23663 = c23664;
                        c4848M10283 = c4848M10290;
                        enumC8690 = enumC8691;
                        c9755 = c9757;
                        c8375 = c8377;
                        zAnyMatch = z;
                    } catch (Throwable th2) {
                        ((C10545) c4036M25905.f8849).f29201.mo28410();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ((C10545) obj).f29201.mo28410();
                    throw th;
                }
            }
            Object obj3 = obj2;
            if (z) {
                c16852.m38282(c4848);
            }
            if (abstractC7257.m16617(EnumC19998.f60782)) {
                ((C23882) abstractC7257).f75831 = z4 || z5;
                ((C23882) abstractC7257).f75830 = z;
            } else if (abstractC7257.m16617(EnumC19998.f60779)) {
                ((C15164) abstractC7257).f43266 = z4 || z5;
                ((C15164) abstractC7257).f43265 = z;
            } else {
                C1446.m31702(abstractC7257.mo3383().name());
                throw null;
            }
            ((C10545) obj3).f29201.mo28410();
        } catch (Throwable th4) {
            th = th4;
            obj = obj2;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        c17036.f50377 = m25907(c17036, EnumC19998.f60743, c17036.f50376, this.f31160);
        this.f31172 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25922(AbstractC21062 abstractC21062, C4848 c4848, AbstractC6462 abstractC6462) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            if (this.f31200.m19486(abstractC6462, (AbstractC6462) it.next(), true)) {
                this.f31202.m9352(abstractC21062, C8300.f22023);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC7783 m25908(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        if (!abstractC14355.m16617(EnumC19998.f60790)) {
            return null;
        }
        C9661 c9661 = (C9661) abstractC14355;
        for (AbstractC7783 abstractC7783 : abstractC6462.f16705.mo17983().m22456(c9661.f26610)) {
            if (abstractC7783.f20405 == EnumC3600.f7339) {
                c9661.f26611 = abstractC7783;
                ((C13818) abstractC7783).m31487();
                c9661.f18925 = abstractC7783.f20406;
                if ((abstractC7783.f20409 & 16384) == 0) {
                    return null;
                }
                return abstractC7783;
            }
        }
        return null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3797(C9130 c9130) {
        AbstractC6462 abstractC6462;
        AbstractC21195 abstractC21195;
        this.f31163.m38362(c9130, m25939(c9130.f24711, this.f31160, this.f31177));
        C6953 c6953 = ((C10545) this.f31160.f8849).f29205;
        EnumC21706 enumC21706 = EnumC21706.SYNCHRONIZATION;
        if (c6953.m15935(enumC21706) && (abstractC6462 = c9130.f24711.f18925) != null && (abstractC21195 = abstractC6462.f16705) != null && (abstractC21195.mo18003() & 9007199254740992L) != 0) {
            this.f31202.m9365(enumC21706, c9130, C15675.f45425);
        }
        m25937(c9130.f24710, this.f31160);
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        C4036 c4036M8087;
        C22004 c22004;
        C16852 c16852 = this.f31163;
        C4036 c4036 = this.f31160;
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        C4036 c4036M8088 = c4036.m8087(c12622, c10545.m24327(abstractC15689.mo28413(abstractC15689.f26587)));
        Object obj = c4036M8088.f8849;
        try {
            boolean zM10293 = c12622.f35422.m10293();
            if (zM10293) {
                C4036 c4037 = this.f31160;
                AbstractC15689 abstractC156810 = ((C10545) obj).f29201;
                c4036M8087 = c4037.m8087(c12622, ((C10545) obj).m24327(abstractC156810.mo28413(abstractC156810.f26587)));
            } else {
                c4036M8087 = c4036M8088;
            }
            try {
                Iterator it = c12622.f35422.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    c22004 = this.f31193;
                    if (!zHasNext) {
                        break;
                    }
                    AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
                    C24626 c24626 = new C24626(this, C17010.f50309, c22004.f69213, new C22655(this, this.f31162.f77961));
                    if (abstractC7257.m16617(EnumC19998.f60802)) {
                        m25937(abstractC7257, c4036M8087);
                        c24626.mo15456(abstractC7257, abstractC7257.f18925);
                        m25953((InterfaceC5323) abstractC7257, c4036M8088, abstractC7257.f18925);
                        ((C11281) abstractC7257).f31438.m31483(EnumC24473.RESOURCE_VARIABLE);
                    } else {
                        m25939(abstractC7257, c4036M8087, c24626);
                    }
                }
                m25937(c12622.f35421, c4036M8087);
                if (zM10293) {
                    ((C10545) c4036M8087.f8849).f29201.mo28410();
                }
                for (C4848 c4848 = c12622.f35425; c4848.m10293(); c4848 = c4848.f11035) {
                    C2955 c2955 = (C2955) c4848.f11034;
                    AbstractC15689 abstractC156811 = ((C10545) obj).f29201;
                    C4036 c4036M8089 = c4036M8088.m8087(c2955, ((C10545) obj).m24327(abstractC156811.mo28413(abstractC156811.f26587)));
                    try {
                        AbstractC6462 abstractC6462M25937 = m25937(c2955.f5147, c4036M8089);
                        if (c2955.f5147.f31437.m16617(EnumC19998.f60727)) {
                            c2955.f5147.f31438.f20409 |= 549755813904L;
                        }
                        C13818 c13818 = c2955.f5147.f31438;
                        if (c13818.f20405 == EnumC3600.f7339) {
                            c13818.m31483(EnumC24473.EXCEPTION_PARAMETER);
                        }
                        AbstractC14355 abstractC14355 = c2955.f5147.f31437;
                        abstractC14355.getClass();
                        AbstractC14355 abstractC14356 = c2955.f5147.f31437;
                        abstractC14356.getClass();
                        c16852.m38267(abstractC14355, c16852.m38334(abstractC14356, abstractC6462M25937), c22004.f69161, c16852.f49905);
                        m25937(c2955.f5146, c4036M8089);
                        ((C10545) c4036M8089.f8849).f29201.mo28410();
                    } catch (Throwable th) {
                        ((C10545) c4036M8089.f8849).f29201.mo28410();
                        throw th;
                    }
                }
                AbstractC7257 abstractC7258 = c12622.f35424;
                if (abstractC7258 != null) {
                    m25937(abstractC7258, c4036M8088);
                }
                this.f31172 = null;
                ((C10545) obj).f29201.mo28410();
            } catch (Throwable th2) {
                if (zM10293) {
                    ((C10545) c4036M8087.f8849).f29201.mo28410();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            ((C10545) obj).f29201.mo28410();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25953(InterfaceC5323 interfaceC5323, C4036 c4036, AbstractC6462 abstractC6462) {
        if (abstractC6462.mo14812()) {
            return;
        }
        C22004 c22004 = this.f31193;
        AbstractC21195 abstractC21195 = c22004.f69213.f16705;
        C8374 c8374 = this.f31200;
        if (c8374.m19467(abstractC21195, abstractC6462) == null || c8374.m19490(abstractC6462, c22004.f69213)) {
            return;
        }
        C23623 c23623 = this.f31202;
        C10212 c10212 = new C10212(c23623);
        try {
            C23663 c23663 = this.f31180;
            AbstractC6462 abstractC6462M19466 = c8374.m19466(abstractC6462, false);
            AbstractC12224 abstractC12224 = this.f31178.f21709;
            C4848 c4848M10283 = C4848.m10283();
            C4848 c4848M10284 = C4848.m10283();
            c23663.getClass();
            AbstractC7783 abstractC7783M52653 = c23663.m52653(interfaceC5323, c4036, abstractC6462M19466.f16705, abstractC6462M19466, abstractC12224, c4848M10283, c4848M10284);
            c23623.m52452(c10212);
            if (abstractC7783M52653.f20405 == EnumC3600.f7343 && abstractC7783M52653.mo12938(c22004.f69178, abstractC6462.f16705, c8374, true)) {
                AbstractC6462 abstractC6463 = c22004.f69168;
                C4848 c4848Mo14794 = c8374.m19483(abstractC7783M52653, abstractC6462).mo14794();
                C16852 c16852 = this.f31163;
                if (c16852.m38345(abstractC6463) || c16852.m38361(abstractC6463, c4848Mo14794)) {
                    C6953 c6953 = ((C10545) c4036.f8849).f29205;
                    EnumC21706 enumC21706 = EnumC21706.TRY;
                    if (c6953.m15935(enumC21706)) {
                        C12895 c12895 = C15675.f45417;
                        c23623.m9365(enumC21706, interfaceC5323, new C12895("compiler", "try.resource.throws.interrupted.exc", abstractC6462));
                    }
                }
            }
        } catch (Throwable th) {
            c23623.m52452(c10212);
            throw th;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        C24626 c24626Mo40739;
        AbstractC6462 abstractC6462M15516;
        AbstractC6462 abstractC6462;
        AbstractC6462 abstractC6462M25938 = m25938((AbstractC7257) c10332.f28614, this.f31160, (AbstractC6462) this.f31193.f69151);
        C9755 c9755 = this.f31167;
        EnumC21201 enumC21201 = (!this.f31190 || !(!this.f31162.f77965.m14777(EnumC11353.NONE) || (abstractC6462 = this.f31162.f77965) == AbstractC6462.f16699 || abstractC6462 == C8769.f23793) || m25924(this.f31160, c10332)) ? EnumC21201.STANDALONE : EnumC21201.POLY;
        c10332.f16661 = enumC21201;
        if (enumC21201 == EnumC21201.POLY && this.f31162.f77965.m14777(EnumC11353.VOID)) {
            this.f31162.f77961.mo3480(c10332, this.f31159.m18543(C13665.f38453));
            C13956 c13956M19475 = this.f31200.m19475(this.f31162.f77965);
            c10332.f18925 = c13956M19475;
            this.f31172 = c13956M19475;
            return;
        }
        EnumC21201 enumC21202 = c10332.f16661;
        EnumC21201 enumC21203 = EnumC21201.STANDALONE;
        if (enumC21202 == enumC21203) {
            c24626Mo40739 = this.f31177;
        } else {
            C24626 c24626 = this.f31162;
            c24626Mo40739 = c24626.mo40739(new C21314(this, c24626.f77961));
        }
        C4036 c4036 = this.f31160;
        C4036 c4036M25905 = m25905(c4036, c4036.f8850, c9755.f26939);
        Object obj = c4036M25905.f8849;
        try {
            AbstractC6462 abstractC6462M25939 = m25939(c10332.f28612, c4036M25905, c24626Mo40739);
            ((C10545) obj).f29201.mo28410();
            C9755 c9756 = this.f31167;
            C4036 c4037 = this.f31160;
            C4036 c4036M25906 = m25905(c4037, c4037.f8850, c9755.f26938);
            Object obj2 = c4036M25906.f8849;
            try {
                AbstractC6462 abstractC6462M259310 = m25939(c10332.f28613, c4036M25906, c24626Mo40739);
                ((C10545) obj2).f29201.mo28410();
                C9755 c9757 = this.f31167;
                if (c10332.f16661 != enumC21203) {
                    abstractC6462M15516 = this.f31162.f77965;
                } else {
                    AbstractC14355 abstractC14355 = c10332.f28612;
                    abstractC14355.getClass();
                    AbstractC14355 abstractC14356 = c10332.f28613;
                    abstractC14356.getClass();
                    abstractC6462M15516 = m25933(C4848.m10277of((Object) abstractC14355, (Object) abstractC14356), C4848.m10277of((Object) abstractC6462M25939, (Object) abstractC6462M259310));
                }
                if (abstractC6462M25938.mo14779() != null && abstractC6462M25939.mo14779() != null && abstractC6462M259310.mo14779() != null && !abstractC6462M15516.m14777(EnumC11353.NONE)) {
                    if (!abstractC6462M25938.mo14799()) {
                        abstractC6462M25939 = abstractC6462M259310;
                    }
                    abstractC6462M15516 = this.f31188.m15516(abstractC6462M25939, abstractC6462M15516);
                }
                this.f31172 = m25943(c10332, abstractC6462M15516, C17010.f50311, this.f31162);
                this.f31167 = this.f31165.m8368(c10332, c9755, c9756, c9757);
            } catch (Throwable th) {
                ((C10545) obj2).f29201.mo28410();
                throw th;
            }
        } catch (Throwable th2) {
            ((C10545) obj).f29201.mo28410();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m25924(C4036 c4036, AbstractC14355 abstractC14355) {
        AbstractC6462 abstractC6462;
        int i = C3207.f6222[abstractC14355.mo3383().ordinal()];
        C24626 c24626 = this.f31177;
        C7664 c7664 = this.f31176;
        C14152 c14152 = this.f31196;
        switch (i) {
            case 1:
                EnumC11353 enumC11353 = ((C24552) abstractC14355).f77743;
                return enumC11353.m26309(EnumC11353.DOUBLE) || enumC11353 == EnumC11353.BOOLEAN || enumC11353 == EnumC11353.BOT;
            case 2:
            case 3:
                return false;
            case 4:
                return m25924(c4036, ((C16505) abstractC14355).f48507);
            case 5:
                C10332 c10332 = (C10332) abstractC14355;
                return m25924(c4036, c10332.f28612) && m25924(c4036, c10332.f28613);
            case 6:
                c7664.getClass();
                C17175 c17175 = (C17175) c14152.m32632(abstractC14355, c4036, c24626, c14152.f40354, null, EnumC9477.SPECULATIVE, new C22417(c7664));
                AbstractC7783 abstractC7783M21438 = C9268.m21438(c17175.f51143);
                if (c17175.f51143.m16617(EnumC19998.f60790)) {
                    abstractC6462 = c4036.f8855.f18925;
                } else {
                    abstractC6462 = ((C8320) c17175.f51143).f22261.f18925;
                }
                return m25967(this.f31200.m19483(abstractC7783M21438, abstractC6462).mo14787());
            case 7:
                AbstractC14355 abstractC14356 = (AbstractC14355) this.f31184.mo25569(((C20530) abstractC14355).f63429);
                c7664.getClass();
                return m25967(((AbstractC14355) c14152.m32632(abstractC14356, c4036, this.f31175, c14152.f40354, null, EnumC9477.SPECULATIVE, new C22417(c7664))).f18925);
            default:
                c7664.getClass();
                return m25967(c14152.m32632(abstractC14355, c4036, c24626, c14152.f40354, null, EnumC9477.SPECULATIVE, new C22417(c7664)).f18925);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m25967(AbstractC6462 abstractC6462) {
        return (abstractC6462.m14777(EnumC11353.TYPEVAR) || abstractC6462.mo14812() || !this.f31200.m19499(abstractC6462).mo14805()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25933(C4848 c4848, C4848 c4849) {
        boolean zIsEmpty = c4849.isEmpty();
        C22004 c22004 = this.f31193;
        if (zIsEmpty) {
            return c22004.f69208;
        }
        final AbstractC6462 abstractC6462 = (AbstractC6462) c4849.f11034;
        if (C7480.stream(c4849.f11035).allMatch(new Predicate() { // from class: l.۬᩶֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m34415or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f42958.f31200.m19490(abstractC6462, (AbstractC6462) obj);
            }
        })) {
            return abstractC6462.mo5302();
        }
        C4848<AbstractC6462> c48410 = (C4848) C7480.stream(c4849).map(new C12358(0, this)).collect(C4848.m10284());
        if (C7480.stream(c48410).allMatch(new C6611(2))) {
            for (final AbstractC6462 abstractC6463 : c48410) {
                if (abstractC6463.mo5577().m26307(EnumC11353.INT) && C7480.stream(c48410).filter(new Predicate() { // from class: l.ۛ᩶֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m19227or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((AbstractC6462) obj) != abstractC6463;
                    }
                }).allMatch(new C13699(0, this, abstractC6463))) {
                    return abstractC6463.mo5302();
                }
            }
            for (EnumC11353 enumC11353 : f31158) {
                final AbstractC6462 abstractC6464 = c22004.f69143[enumC11353.ordinal()];
                if (C7480.stream(c48410).allMatch(new Predicate() { // from class: l.᩺᩶֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C20697.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo55838negate() {
                        return C20697.$default$negate(this);
                    }

                    /* JADX INFO: renamed from: or */
                    public /* synthetic */ Predicate m53900or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return this.f77336.f31200.m19486((AbstractC6462) obj, abstractC6464, true);
                    }
                })) {
                    return abstractC6464;
                }
            }
        }
        C4848<AbstractC6462> c48411 = (C4848) C7480.stream(c4849).map(new C9675(0, this)).collect(C4848.m10284());
        for (final AbstractC6462 abstractC6465 : c48411) {
            if (C7480.stream(c48411).filter(new Predicate() { // from class: l.֫ۙ֨
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m7666or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((AbstractC6462) obj) != abstractC6465;
                }
            }).allMatch(new C12596(this, abstractC6465))) {
                return abstractC6465.mo5302();
            }
        }
        return this.f31200.m19488((C4848) C7480.stream((C4848) C7480.stream(c48411).map(new C17959(0, this, c4848.iterator())).collect(C4848.m10284())).map(new C9053(5)).filter(new C14369(0)).collect(C4848.m10284()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4036 m25905(C4036 c4036, AbstractC7257 abstractC7257, C4848 c4848) {
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        C4036 c4036M8087 = c4036.m8087(abstractC7257, c10545.m24327(abstractC15689.mo28413(abstractC15689.f26587)));
        AbstractC15689 abstractC156810 = ((C10545) c4036M8087.f8849).f29201;
        C12826.requireNonNull(abstractC156810);
        C21230.forEach(c4848, new C5890(abstractC156810));
        return c4036M8087;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        boolean zM27688;
        m25938((AbstractC7257) c3765.f7998, this.f31160, (AbstractC6462) this.f31193.f69151);
        C9755 c9755 = this.f31167;
        C4036 c4036 = this.f31160;
        C4848 c4848 = c9755.f26939;
        C4848 c4849 = c9755.f26938;
        C4036 c4036M25905 = m25905(c4036, c4036.f8850, c4848);
        Object obj = c4036M25905.f8849;
        try {
            m25937(c3765.f7999, c4036M25905);
            ((C10545) obj).f29201.mo28410();
            m25968(c3765.f7999);
            C4036 c4037 = this.f31160;
            AbstractC13154 abstractC13154 = c3765.f7999;
            C12083 c12083 = this.f31173;
            C18537 c18537 = this.f31198;
            boolean zM27689 = c12083.m27688(c4037, abstractC13154, c18537);
            if (c3765.f8000 != null) {
                C4036 c4038 = this.f31160;
                C4036 c4036M25906 = m25905(c4038, c4038.f8850, c4849);
                Object obj2 = c4036M25906.f8849;
                try {
                    m25937(c3765.f8000, c4036M25906);
                    ((C10545) obj2).f29201.mo28410();
                    m25968(c3765.f8000);
                    zM27688 = c12083.m27688(this.f31160, c3765.f8000, c18537);
                } catch (Throwable th) {
                    ((C10545) obj2).f29201.mo28410();
                    throw th;
                }
            } else {
                zM27688 = true;
            }
            this.f31163.m38279(c3765);
            C4848 c4848M10283 = C4848.m10283();
            if (zM27689 && !zM27688) {
                c4849 = c9755.f26939;
            } else if (!zM27688 || zM27689) {
                c4849 = c4848M10283;
            }
            AbstractC15689 abstractC15689 = ((C10545) this.f31160.f8849).f29201;
            C12826.requireNonNull(abstractC15689);
            C21230.forEach(c4849, new C5890(abstractC15689));
            C21230.forEach(c4849, new C19972());
            this.f31172 = null;
        } catch (Throwable th2) {
            ((C10545) obj).f29201.mo28410();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m25968(AbstractC7257 abstractC7257) {
        this.f31174.m23159();
        new C6561(this).mo12739(abstractC7257);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3807(C12344 c12344) {
        C4036 c4036 = this.f31160;
        m25939(c12344.f34446, c4036.m8087(c12344, c4036.f8849), this.f31177);
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        C14040 c14040;
        C4036 c4036 = this.f31160;
        C24626 c24626 = ((C10545) c4036.f8849).f29202;
        if (c24626 != null) {
            m25939(c4575.f10248, c4036, c24626);
            c4575.f10247 = m25907(c4575, EnumC19998.f60717, this.f31178.f21725, this.f31160);
        } else {
            if (c4575.f10248.m16617(EnumC19998.f60706)) {
                c14040 = C8300.f21990;
            } else {
                c14040 = C8300.f22138;
            }
            this.f31202.m9352(c4575, c14040);
            m25939(c4575.f10248, this.f31160, this.f31177);
        }
        this.f31172 = null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX INFO: renamed from: ֫ */
    private AbstractC7257 m25907(AbstractC13154 abstractC13154, EnumC19998 enumC19998, AbstractC12224 abstractC12224, C4036 c4036) {
        C24293 c24293;
        Object obj;
        int i;
        C14040 c14040 = null;
        while (true) {
            if (c4036 != null && (i = C3207.f6222[c4036.f8850.mo3383().ordinal()]) != 2) {
                switch (i) {
                    case 8:
                        C19188 c19188 = (C19188) c4036.f8850;
                        if (abstractC12224 != c19188.f57352) {
                            c4036 = c4036.f8848;
                        } else if (enumC19998 != EnumC19998.f60743) {
                            c24293 = new C24293(c19188, c14040);
                        } else {
                            if (!c19188.f57351.m16617(EnumC19998.f60718) && !c19188.f57351.m16617(EnumC19998.f60792) && !c19188.f57351.m16617(EnumC19998.f60737) && !c19188.f57351.m16617(EnumC19998.f60705)) {
                                C14040 c14041 = C8300.f21997;
                                c14040 = new C14040("compiler", "not.loop.label", abstractC12224);
                            }
                            c24293 = new C24293(C9268.m21407(c19188), c14040);
                        }
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        if (abstractC12224 != null) {
                            c4036 = c4036.f8848;
                        } else {
                            c24293 = new C24293(c4036.f8850, c14040);
                        }
                        break;
                    case 13:
                        if (abstractC12224 == null && enumC19998 == EnumC19998.f60780) {
                            c24293 = new C24293(c4036.f8850, null);
                        } else {
                            c4036 = c4036.f8848;
                        }
                        break;
                    case 14:
                        if (enumC19998 != EnumC19998.f60717) {
                            c14040 = enumC19998 == EnumC19998.f60780 ? C8300.f21987 : C8300.f22063;
                            c4036 = c4036.f8848;
                        } else {
                            c24293 = new C24293(c4036.f8850, null);
                        }
                        break;
                    case 15:
                    case 16:
                        break;
                    default:
                        c4036 = c4036.f8848;
                        break;
                }
                obj = c24293.f76953;
                if (obj != null) {
                    this.f31202.m9352(abstractC13154, (C14040) obj);
                }
                return (AbstractC7257) c24293.f76952;
            }
            if (abstractC12224 != null) {
                C14040 c14042 = C8300.f21997;
                c24293 = new C24293(null, new C14040("compiler", "undef.label", abstractC12224));
            } else if (c14040 != null) {
                c24293 = new C24293(null, c14040);
            } else {
                c24293 = enumC19998 == EnumC19998.f60743 ? new C24293(null, C8300.f22079) : new C24293(null, C8300.f22025);
            }
            obj = c24293.f76953;
            if (obj != null) {
                this.f31202.m9352(abstractC13154, (C14040) obj);
            }
            return (AbstractC7257) c24293.f76952;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        C10471 c10471;
        C4036 c4036 = this.f31160;
        C10545 c10545 = (C10545) c4036.f8849;
        C24626 c24626 = c10545.f29200;
        C23623 c23623 = this.f31202;
        if (c24626 == null) {
            c23623.m9352(c11813, C8300.f22040);
        } else if (c10545.f29202 != null) {
            c23623.m9352(c11813, C8300.f22151);
        } else if (!c10545.f29210 && !c10545.f29207 && (c10471 = c4036.f8853) != null && C9268.m21420(c10471)) {
            C10471 c10472 = this.f31160.f8853;
            c23623.m9352(c10472, C8300.m19125(C13665.f38496, c10472.f28960.f20408, C13665.f38522));
        } else {
            AbstractC14355 abstractC14355 = c11813.f32975;
            C8005 c8005 = this.f31159;
            if (abstractC14355 != null) {
                if (((C10545) this.f31160.f8849).f29200.f77965.m14777(EnumC11353.VOID)) {
                    InterfaceC6125 interfaceC6125 = ((C10545) this.f31160.f8849).f29200.f77961;
                    AbstractC14355 abstractC14356 = c11813.f32975;
                    abstractC14356.getClass();
                    interfaceC6125.mo3480(abstractC14356, c8005.m18543(C13665.f38467));
                }
                AbstractC14355 abstractC14357 = c11813.f32975;
                C4036 c4037 = this.f31160;
                m25939(abstractC14357, c4037, ((C10545) c4037.f8849).f29200);
            } else if (!((C10545) this.f31160.f8849).f29200.f77965.m14777(EnumC11353.VOID) && !((C10545) this.f31160.f8849).f29200.f77965.m14777(EnumC11353.NONE)) {
                C24626 c24627 = ((C10545) this.f31160.f8849).f29200;
                c24627.f77961.mo3480(c11813, c8005.m18543(C13665.m31062(c24627.f77965)));
            }
        }
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        AbstractC14355 abstractC14355 = c3904.f8460;
        C4036 c4036 = this.f31160;
        C22004 c22004 = this.f31193;
        boolean z = this.f31190;
        AbstractC6462 abstractC6462M25938 = m25938((AbstractC7257) abstractC14355, c4036, z ? AbstractC6462.f16700 : c22004.f69161);
        if (z) {
            AbstractC6462 abstractC6462 = c22004.f69161;
            C16852 c16852 = this.f31163;
            c16852.m38267(c3904, abstractC6462M25938, abstractC6462, c16852.f49905);
        }
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3796(C8991 c8991) {
        m25938((AbstractC7257) c8991.f24356, this.f31160, (AbstractC6462) this.f31193.f69151);
        AbstractC14355 abstractC14355 = c8991.f24357;
        if (abstractC14355 != null) {
            this.f31163.m38363(abstractC14355, m25939(abstractC14355, this.f31160, this.f31177));
        }
        this.f31172 = null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        AbstractC6462 abstractC6462;
        char c;
        AbstractC6462 abstractC6462M19502;
        C22004 c22004;
        C4036 c4036 = this.f31160;
        C10545 c10545 = (C10545) c4036.f8849;
        C4036 c4036M8087 = c4036.m8087(c17175, c10545.m24327(c10545.f29201));
        Object obj = c4036M8087.f8849;
        AbstractC12224 abstractC12224M21428 = C9268.m21428(c17175.f51143);
        C8200 c8200 = this.f31178;
        AbstractC12224 abstractC12224 = c8200.f21744;
        AbstractC12224 abstractC12225 = c8200.f21756;
        boolean z = abstractC12224M21428 == abstractC12224 || abstractC12224M21428 == abstractC12225;
        C20271 c20271 = new C20271();
        C16852 c16852 = this.f31163;
        if (z) {
            m25961(c17175, this.f31160.f8853, true);
            C10545 c10546 = (C10545) obj;
            c10546.f29215 = true;
            C17010 c17010M25949 = m25949(C17010.f50317, c17175.f51144, c4036M8087, c20271);
            C4848 c4848M45783 = c20271.m45783();
            C4848 c4848 = c17175.f51142;
            C4848 c4848M25932 = m25932(c4848, c4036M8087);
            c16852.m38284(c4848, c4848M25932);
            AbstractC6462 abstractC6463 = this.f31160.f8855.f20027.f20406;
            C23623 c23623 = this.f31202;
            C22004 c22005 = this.f31193;
            if (abstractC12224M21428 == abstractC12225) {
                AbstractC6462 abstractC6464 = c22005.f69208;
                C8374 c8374 = this.f31200;
                if (abstractC6463 == abstractC6464) {
                    AbstractC14355 abstractC14355 = c17175.f51143;
                    abstractC14355.getClass();
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(abstractC14355, new C14040("compiler", "no.superclass", abstractC6463));
                    abstractC6462M19502 = c8374.m19475(c22005.f69208);
                } else {
                    abstractC6462M19502 = c8374.m19502(abstractC6463);
                }
                c = 0;
            } else {
                c17010M25949 = c17010M25949;
                c4848M25932 = c4848M25932;
                c = 0;
                abstractC6462M19502 = abstractC6463;
            }
            if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
                AbstractC6462 abstractC6462Mo7201 = abstractC6462M19502.mo7201();
                while (abstractC6462Mo7201 != null && abstractC6462Mo7201.m14777(EnumC11353.TYPEVAR)) {
                    abstractC6462Mo7201 = abstractC6462Mo7201.mo14803();
                }
                if (abstractC6462Mo7201.m14777(EnumC11353.CLASS)) {
                    if (c17175.f51143.m16617(EnumC19998.f60805)) {
                        AbstractC14355 abstractC14356 = ((C8320) c17175.f51143).f22261;
                        abstractC14356.getClass();
                        c16852.m38362(abstractC14356, m25938((AbstractC7257) abstractC14356, c4036M8087, abstractC6462Mo7201));
                    } else if (abstractC12224M21428 == abstractC12225) {
                        AbstractC14355 abstractC14357 = c17175.f51143;
                        abstractC14357.getClass();
                        this.f31180.m52642((InterfaceC5323) abstractC14357, c4036M8087, abstractC6462M19502, true);
                    }
                } else if (c17175.f51143.m16617(EnumC19998.f60805)) {
                    AbstractC14355 abstractC14358 = c17175.f51143;
                    abstractC14358.getClass();
                    AbstractC21195 abstractC21195 = abstractC6462M19502.f16705;
                    C14040 c14041 = C8300.f21997;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC21195;
                    c23623.m9352(abstractC14358, new C14040("compiler", "illegal.qual.not.icls", objArr));
                    m25938((AbstractC7257) ((C8320) c17175.f51143).f22261, c4036M8087, abstractC6462M19502);
                }
                if (abstractC6462M19502.f16705 == c22005.f69209) {
                    c4848M45783 = c4848M45783.m10290(c22005.f69134).m10290(c22005.f69215);
                }
                boolean z2 = c10546.f29212;
                c10546.f29212 = true;
                c10546.f29204 = null;
                AbstractC14355 abstractC14359 = c17175.f51143;
                abstractC14359.getClass();
                C4848 c4849 = c4848M25932;
                AbstractC7783 abstractC7783M52652 = this.f31180.m52652(abstractC14359, c4036M8087, abstractC6462M19502, c4848M45783, c4849);
                c10546.f29212 = z2;
                C9268.m21425(abstractC7783M52652, c17175.f51143);
                c22004 = c22005;
                m25941(c17175.f51143, abstractC6462M19502, abstractC7783M52652, c4036M8087, new C24626(this, c17010M25949, m25934(this.f31162.f77965, c4848M45783, c4849)));
            } else {
                c22004 = c22005;
                if (abstractC6462M19502.m14777(EnumC11353.ERROR) && c17175.f51143.m16617(EnumC19998.f60805)) {
                    m25938((AbstractC7257) ((C8320) c17175.f51143).f22261, c4036M8087, abstractC6462M19502);
                }
            }
            C3779 c3779 = c22004.f69183;
            c17175.f18925 = c3779;
            this.f31172 = c3779;
        } else {
            C17010 c17010 = C17010.f50311;
            C17010 c17010M259410 = m25949(c17010, c17175.f51144, c4036M8087, c20271);
            C4848 c4848M45784 = c20271.m45783();
            C4848 c4848M25933 = m25932(c17175.f51142, c4036M8087);
            AbstractC6462 abstractC6462M25934 = m25934(this.f31162.f77965, c4848M45784, c4848M25933);
            ((C10545) obj).f29204 = null;
            AbstractC6462 abstractC6462M25939 = m25939(c17175.f51143, c4036M8087, new C24626(this, c17010M259410, abstractC6462M25934, this.f31162.f77961));
            AbstractC6462 abstractC6462Mo14787 = abstractC6462M25939.mo14787();
            if (abstractC6462Mo14787.m14777(EnumC11353.WILDCARD)) {
                throw new AssertionError(abstractC6462M25939);
            }
            if (c17175.f51143.m16617(EnumC19998.f60805)) {
                abstractC6462 = ((C8320) c17175.f51143).f22261.f18925;
            } else {
                abstractC6462 = this.f31160.f8855.f20027.f20406;
            }
            AbstractC6462 abstractC6462M25944 = m25944(C9268.m21438(c17175.f51143), abstractC6462, abstractC12224M21428, c4848M45784, abstractC6462Mo14787);
            c16852.m38284(c17175.f51142, c4848M25933);
            this.f31172 = m25943(c17175, this.f31162.f77961.mo6098().m4251((AbstractC7257) c17175, abstractC6462M25944, true), c17010, this.f31162);
        }
        c16852.m38283(c17175.f51142, c4036M8087);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25944(AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, AbstractC6462 abstractC6463) {
        C8374 c8374 = this.f31200;
        C8200 c8200 = this.f31178;
        C22004 c22004 = this.f31193;
        if (abstractC7783 != null && abstractC7783.f20407 == c22004.f69208.f16705 && abstractC12224 == c8200.f21686 && c4848.isEmpty()) {
            return new C21333(abstractC6463.mo7201(), C4848.m10276of((Object) new C21215(c8374.m19459(abstractC6462.mo5302()), EnumC17268.EXTENDS, c22004.f69162)), abstractC6463.f16705, abstractC6463.m14785());
        }
        return (abstractC7783 != null && abstractC7783.f20407 == c22004.f69187 && abstractC12224 == c8200.f21760 && c8374.m19452(abstractC6462)) ? abstractC6462 : abstractC6463;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25961(C17175 c17175, C10471 c10471, boolean z) {
        if (c10471 != null && c10471.f28959 == this.f31178.f21737) {
            C4968 c4968 = c10471.f28958;
            if (((AbstractC13154) c4968.f11316.f11034).m16617(EnumC19998.f60702) && ((C12344) c4968.f11316.f11034).f34446 == c17175) {
                return true;
            }
        }
        if (z) {
            AbstractC12224 abstractC12224M21428 = C9268.m21428(c17175.f51143);
            C14040 c14040 = C8300.f21997;
            this.f31202.m9352(c17175, new C14040("compiler", "call.must.be.first.stmt.in.ctor", abstractC12224M21428));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25934(AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        C12497 c12497 = new C12497(c4848, abstractC6462, C4848.m10283(), this.f31193.f69163);
        return c4849 == null ? c12497 : new C11945(c12497, c4849);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0330  */
    /* JADX WARN: Code duplicated, block: B:102:0x0345  */
    /* JADX WARN: Code duplicated, block: B:104:0x0355  */
    /* JADX WARN: Code duplicated, block: B:106:0x0363  */
    /* JADX WARN: Code duplicated, block: B:108:0x0370  */
    /* JADX WARN: Code duplicated, block: B:109:0x0372  */
    /* JADX WARN: Code duplicated, block: B:112:0x038b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0408  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a4  */
    /* JADX WARN: Not found block with instruction: 0x01af: MOVE (r6v3 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(final C20530 c20530) {
        AbstractC14355 abstractC14355;
        C19720 c19720;
        AbstractC14355 abstractC14356;
        AbstractC14355 abstractC14357;
        AbstractC14355 abstractC14355M42155;
        C4848 c4848;
        C8374 c8374;
        C4848 c4849;
        boolean z;
        C4848 c48410;
        C4848 c48411;
        boolean zM21415;
        C22004 c22004;
        C4036 c4036;
        C7650 c7650;
        C16852 c16852;
        AbstractC14355 abstractC14358;
        AbstractC6462 abstractC6462M38269;
        C4036 c4036M8087;
        C10545 c10545;
        boolean z2;
        AbstractC7783 abstractC7783M52652;
        EnumC18298 enumC18298;
        boolean z3;
        AbstractC7783 abstractC7783;
        AbstractC6462 abstractC6462;
        boolean z4;
        C8374 c8375;
        AbstractC6462 abstractC6462M25941;
        C2733 c2733Mo6098;
        AbstractC6462 abstractC6463;
        AbstractC6462 abstractC6464 = c20530.f18925;
        C4848 c48412 = c20530.f63431;
        C8374 c8376 = this.f31200;
        C13956 c13956M19475 = c8376.m19475(abstractC6464);
        C4036 c4037 = this.f31160;
        C10545 c10546 = (C10545) c4037.f8849;
        C4036 c4036M8088 = c4037.m8087(c20530, c10546.m24327(c10546.f29201));
        Object obj = c4036M8088.f8849;
        C7650 c7651 = c20530.f63428;
        AbstractC14355 abstractC14359 = c20530.f63429;
        EnumC19998 enumC19998 = EnumC19998.f60745;
        if (abstractC14359.m16617(enumC19998)) {
            abstractC14355 = ((C17985) abstractC14359).f53722;
            if (abstractC14355.m16617(EnumC19998.f60721)) {
                c19720 = (C19720) abstractC14355;
                abstractC14356 = c19720.f59996;
            } else {
                abstractC14356 = abstractC14355;
                c19720 = null;
            }
        } else if (abstractC14359.m16617(EnumC19998.f60721)) {
            c19720 = (C19720) abstractC14359;
            abstractC14356 = c19720.f59996;
        } else {
            abstractC14355 = abstractC14359;
            abstractC14356 = abstractC14355;
            c19720 = null;
        }
        AbstractC7257 abstractC7257 = c20530.f63432;
        C16852 c16853 = this.f31163;
        if (abstractC7257 != null) {
            AbstractC6462 abstractC6462M38362 = c16853.m38362(abstractC7257, m25939(abstractC7257, this.f31160, this.f31177));
            int i = abstractC14359.f18924;
            C18537 c18537 = this.f31198;
            c18537.f55352 = i;
            abstractC14355M42155 = c18537.m42155(c18537.m42208(abstractC6462M38362), ((C9661) abstractC14356).f26610);
            AbstractC13884 abstractC13884 = this.f31160.f8851.f7514;
            abstractC14356.getClass();
            abstractC13884.mo8721(abstractC14355M42155, C9268.m21397(abstractC14356, abstractC13884));
            if (abstractC14359.m16617(EnumC19998.f60721)) {
                C19720 c19721 = (C19720) abstractC14359;
                C4848 c48413 = c19721.f59995;
                if (c19721.f59996.m16617(enumC19998)) {
                    c18537.f55352 = c20530.f18924;
                    abstractC14355M42155 = c18537.m42203(abstractC14355M42155, ((C17985) abstractC14359).f53721);
                }
                c18537.f55352 = c20530.f18924;
                abstractC14355M42155 = c18537.m42180(abstractC14355M42155, c48413);
            } else if (abstractC14359.m16617(enumC19998)) {
                c18537.f55352 = c20530.f18924;
                abstractC14355M42155 = c18537.m42203(abstractC14355M42155, ((C17985) abstractC14359).f53721);
            }
            abstractC14357 = abstractC14355M42155;
        } else {
            abstractC14357 = abstractC14359;
            abstractC14355M42155 = abstractC14356;
        }
        try {
            C4036 c4038 = this.f31160;
            ((C10545) c4038.f8849).f29207 = true;
            AbstractC6462 abstractC6462M25906 = C9268.m21416(c4038.f8850) ? m25906(this.f31160, (C9661) abstractC14357) : m25963(abstractC14357, this.f31160, AbstractC6462.f16700);
            ((C10545) this.f31160.f8849).f29207 = false;
            AbstractC6462 abstractC6462M38272 = c16853.m38272(c20530, abstractC6462M25906);
            c16853.m38298((AbstractC7257) abstractC14357, c4036M8088, true);
            AbstractC14355 abstractC143510 = c20530.f63432;
            C23663 c23663 = this.f31180;
            AbstractC14355 abstractC143511 = abstractC14357;
            C23623 c23623 = this.f31202;
            if (abstractC143510 != null) {
                c20530.f63429.f18925 = abstractC6462M38272;
                C9268.m21425(C9268.m21438(abstractC14355M42155), abstractC14356);
                AbstractC6462 abstractC6465 = ((C9661) abstractC14356).f26611.f20406;
                abstractC14356.f18925 = abstractC6465;
                if (c19720 != null) {
                    c19720.f18925 = abstractC6465;
                }
                if (!abstractC6462M38272.mo14812()) {
                    if (c7651 != null && abstractC6462M38272.f16705.m17989()) {
                        AbstractC14355 abstractC143512 = c20530.f63432;
                        abstractC143512.getClass();
                        c23623.m9352(abstractC143512, C8300.f22057);
                    } else if (abstractC6462M38272.f16705.mo17483()) {
                        AbstractC14355 abstractC143513 = c20530.f63432;
                        abstractC143513.getClass();
                        AbstractC21195 abstractC21195 = abstractC6462M38272.f16705;
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(abstractC143513, new C14040("compiler", "qualified.new.of.static.class", abstractC21195));
                    }
                }
            } else if (!abstractC6462M38272.f16705.m17989() && abstractC6462M38272.mo7201().m14777(EnumC11353.CLASS)) {
                c23663.m52642((InterfaceC5323) c20530, this.f31160, abstractC6462M38272, false);
            }
            C20271 c20271 = new C20271();
            C17010 c17010 = C17010.f50311;
            C17010 c17010M25949 = m25949(c17010, c20530.f63430, c4036M8088, c20271);
            C4848 c4848M45783 = c20271.m45783();
            C4848 c4848M25932 = m25932(c48412, c4036M8088);
            c16853.m38284(c48412, c4848M25932);
            if (abstractC6462M38272.m14777(EnumC11353.CLASS) || abstractC6462M38272.m14777(EnumC11353.ERROR)) {
                if ((abstractC6462M38272.f16705.f20409 & 16384) != 0) {
                    if (this.f31160.f8850.m16617(EnumC19998.f60802)) {
                        C11281 c11281 = (C11281) this.f31160.f8850;
                        c4848 = c48412;
                        c8374 = c8376;
                        if ((c11281.f31435.f9954 & 16384) == 0 || c11281.f31436 != c20530) {
                        }
                    } else {
                        c4848 = c48412;
                        c8374 = c8376;
                    }
                    c23623.m9352(c20530, C8300.f22095);
                } else {
                    c4848 = c48412;
                    c8374 = c8376;
                }
                boolean z5 = C9268.m21415(c20530) && this.f31162.f77961.mo6101().f23845 == EnumC15511.SPECULATIVE;
                if (c7651 != null || z5 || (abstractC6462M38272.f16705.mo18003() & 1536) == 0) {
                    if (c7651 == null || !abstractC6462M38272.f16705.m17989()) {
                        c4849 = c4848;
                        z = false;
                    } else {
                        if (!c4848M45783.isEmpty()) {
                            AbstractC14355 abstractC143514 = (AbstractC14355) c20530.f63430.f11034;
                            abstractC143514.getClass();
                            c23623.m9352(abstractC143514, C8300.f22146);
                        }
                        c4849 = c4848;
                        if (!c4848M25932.isEmpty()) {
                            AbstractC14355 abstractC143515 = (AbstractC14355) c4849.f11034;
                            abstractC143515.getClass();
                            c23623.m9352(abstractC143515, C8300.f22051);
                        }
                        c4848M45783 = C4848.m10283();
                        c4848M25932 = C4848.m10283();
                    }
                    c48410 = c4848M45783;
                    c48411 = c4848M25932;
                    zM21415 = C9268.m21415(c20530);
                    c22004 = this.f31193;
                    if (zM21415) {
                        C21333 c21333 = new C21333(abstractC6462M38272.mo7201(), abstractC6462M38272.f16705.f20406.mo14802(), abstractC6462M38272.f16705, abstractC6462M38272.m14785());
                        C4036 c4036M8089 = c4036M8088.m8087(c20530, obj);
                        C10545 c10547 = (C10545) c4036M8089.f8849;
                        if (c7651 == null || c20530.m46331()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c10547.f29212 = z4;
                        c10547.f29204 = null;
                        c23663.getClass();
                        AbstractC21195 abstractC21196 = c21333.f16705;
                        C7158 c7158 = c23663.f75311;
                        c7650 = c7651;
                        c4036 = c4036M8088;
                        C8499 c8499 = new C8499(c23663, c23663.f75320.f21737, c21333, c48410, c48411, c20530);
                        C14119 c14119 = new C14119(c23663);
                        c14119.f40078 = c7158;
                        AbstractC7783 abstractC7783M52643 = c23663.m52643(c4036M8089, c20530, abstractC21196, c14119, c8499);
                        c20530.f63427 = abstractC7783M52643.mo9143();
                        C24626 c24626 = new C24626(this, c17010M25949, m25934(this.f31162.f77965, c48410, c48411), new C5220(this, this.f31162.f77961, c20530, abstractC6462M38272.f16705), EnumC23995.f76206);
                        c8375 = c8374;
                        c20530.f63425 = c8375.m19475(abstractC6462M38272);
                        abstractC6462M25941 = m25941(c20530, c21333, abstractC7783M52643, c4036M8089, c24626);
                        c20530.f63429.f18925 = c8375.m19475(abstractC6462M38272);
                        if (abstractC6462M25941.mo14812()) {
                            abstractC14358 = abstractC143511;
                        } else {
                            AbstractC14355 abstractC143516 = c20530.f63429;
                            AbstractC6462 abstractC6462Mo14787 = abstractC6462M25941.mo14787();
                            abstractC14358 = abstractC143511;
                            abstractC14358.f18925 = abstractC6462Mo14787;
                            abstractC143516.f18925 = abstractC6462Mo14787;
                            c20530.f63425 = c8375.m19482(abstractC6462M25941, c22004.f69183);
                        }
                        AbstractC14355 abstractC143517 = c20530.f63429;
                        c16852 = c16853;
                        abstractC6462M38269 = c16852.m38269((InterfaceC5323) abstractC143517, abstractC143517.f18925, true);
                    } else {
                        c4036 = c4036M8088;
                        c7650 = c7651;
                        c16852 = c16853;
                        abstractC14358 = abstractC143511;
                        if (!z) {
                            c4036M8087 = c4036.m8087(c20530, obj);
                            c10545 = (C10545) c4036M8087.f8849;
                            if (c7650 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c10545.f29212 = z2;
                            c10545.f29204 = null;
                            c4036 = c4036;
                            abstractC7783M52652 = this.f31180.m52652(c20530, c4036M8087, abstractC6462M38272, c48410, c48411);
                            c20530.f63427 = abstractC7783M52652;
                            if (c7650 == null) {
                                c20530.f63425 = m25941(c20530, abstractC6462M38272, abstractC7783M52652, c4036M8087, new C24626(this, c17010M25949, m25934(c22004.f69183, c48410, c48411), c16852.f49905, EnumC23995.f76206));
                                enumC18298 = c10545.f29204;
                                if (enumC18298 != null && enumC18298.m41672()) {
                                    if (c20530.f63425.mo14812() && c20530.f63426 == null) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C1446.m31704(z3);
                                }
                            }
                        }
                        abstractC6462M38269 = abstractC6462M38272;
                    }
                    if (c7650 != null) {
                        m25921(c20530, abstractC14358, abstractC6462M38269, c7650, c4036, c48410, c48411, c17010M25949);
                        return;
                    }
                    abstractC7783 = c20530.f63427;
                    if (abstractC7783 == null && abstractC7783.f20405 == EnumC3600.f7343) {
                        abstractC6462 = abstractC6462M38269;
                    }
                    this.f31172 = m25943(c20530, abstractC6462, c17010, this.f31162);
                    c2733Mo6098 = this.f31162.f77961.mo6098();
                    abstractC6463 = c20530.f63425;
                    if (abstractC6463 != null && abstractC6463.m14792(c2733Mo6098.f4594)) {
                        c2733Mo6098.m4255(C4848.m10276of((Object) c20530.f63425), new InterfaceC5930() { // from class: l.᩶᩶֨
                            @Override // p067l.InterfaceC5930
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6905(C2733 c2733) {
                                C20530 c20531 = c20530;
                                c20531.f63425 = c2733.m4250(c20531.f63425);
                            }
                        });
                    }
                    c16852.m38283(c4849, c4036);
                }
                AbstractC21195 abstractC21197 = abstractC6462M38272.f16705;
                C14040 c14041 = C8300.f21997;
                c23623.m9352(c20530, new C14040("compiler", "abstract.cant.be.instantiated", abstractC21197));
                c4849 = c4848;
                z = true;
                c48410 = c4848M45783;
                c48411 = c4848M25932;
                zM21415 = C9268.m21415(c20530);
                c22004 = this.f31193;
                if (zM21415) {
                    C21333 c21334 = new C21333(abstractC6462M38272.mo7201(), abstractC6462M38272.f16705.f20406.mo14802(), abstractC6462M38272.f16705, abstractC6462M38272.m14785());
                    C4036 c4036M80810 = c4036M8088.m8087(c20530, obj);
                    C10545 c10548 = (C10545) c4036M80810.f8849;
                    if (c7651 == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    c10548.f29212 = z4;
                    c10548.f29204 = null;
                    c23663.getClass();
                    AbstractC21195 abstractC21198 = c21334.f16705;
                    C7158 c7159 = c23663.f75311;
                    c7650 = c7651;
                    c4036 = c4036M8088;
                    C8499 c84910 = new C8499(c23663, c23663.f75320.f21737, c21334, c48410, c48411, c20530);
                    C14119 c141110 = new C14119(c23663);
                    c141110.f40078 = c7159;
                    AbstractC7783 abstractC7783M52644 = c23663.m52643(c4036M80810, c20530, abstractC21198, c141110, c84910);
                    c20530.f63427 = abstractC7783M52644.mo9143();
                    C24626 c24627 = new C24626(this, c17010M25949, m25934(this.f31162.f77965, c48410, c48411), new C5220(this, this.f31162.f77961, c20530, abstractC6462M38272.f16705), EnumC23995.f76206);
                    c8375 = c8374;
                    c20530.f63425 = c8375.m19475(abstractC6462M38272);
                    abstractC6462M25941 = m25941(c20530, c21334, abstractC7783M52644, c4036M80810, c24627);
                    c20530.f63429.f18925 = c8375.m19475(abstractC6462M38272);
                    if (abstractC6462M25941.mo14812()) {
                        AbstractC14355 abstractC143518 = c20530.f63429;
                        AbstractC6462 abstractC6462Mo14788 = abstractC6462M25941.mo14787();
                        abstractC14358 = abstractC143511;
                        abstractC14358.f18925 = abstractC6462Mo14788;
                        abstractC143518.f18925 = abstractC6462Mo14788;
                        c20530.f63425 = c8375.m19482(abstractC6462M25941, c22004.f69183);
                    } else {
                        abstractC14358 = abstractC143511;
                    }
                    AbstractC14355 abstractC143519 = c20530.f63429;
                    c16852 = c16853;
                    abstractC6462M38269 = c16852.m38269((InterfaceC5323) abstractC143519, abstractC143519.f18925, true);
                } else {
                    c4036 = c4036M8088;
                    c7650 = c7651;
                    c16852 = c16853;
                    abstractC14358 = abstractC143511;
                    if (!z) {
                        c4036M8087 = c4036.m8087(c20530, obj);
                        c10545 = (C10545) c4036M8087.f8849;
                        if (c7650 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c10545.f29212 = z2;
                        c10545.f29204 = null;
                        c4036 = c4036;
                        abstractC7783M52652 = this.f31180.m52652(c20530, c4036M8087, abstractC6462M38272, c48410, c48411);
                        c20530.f63427 = abstractC7783M52652;
                        if (c7650 == null) {
                            c20530.f63425 = m25941(c20530, abstractC6462M38272, abstractC7783M52652, c4036M8087, new C24626(this, c17010M25949, m25934(c22004.f69183, c48410, c48411), c16852.f49905, EnumC23995.f76206));
                            enumC18298 = c10545.f29204;
                            if (enumC18298 != null) {
                                if (c20530.f63425.mo14812()) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                C1446.m31704(z3);
                            }
                        }
                    }
                    abstractC6462M38269 = abstractC6462M38272;
                }
                if (c7650 != null) {
                    m25921(c20530, abstractC14358, abstractC6462M38269, c7650, c4036, c48410, c48411, c17010M25949);
                    return;
                }
                abstractC7783 = c20530.f63427;
                if (abstractC7783 == null) {
                }
                this.f31172 = m25943(c20530, abstractC6462, c17010, this.f31162);
                c2733Mo6098 = this.f31162.f77961.mo6098();
                abstractC6463 = c20530.f63425;
                if (abstractC6463 != null) {
                    c2733Mo6098.m4255(C4848.m10276of((Object) c20530.f63425), new InterfaceC5930() { // from class: l.᩶᩶֨
                        @Override // p067l.InterfaceC5930
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6905(C2733 c2733) {
                            C20530 c20531 = c20530;
                            c20531.f63425 = c2733.m4250(c20531.f63425);
                        }
                    });
                }
                c16852.m38283(c4849, c4036);
            }
            c4849 = c48412;
            c4036 = c4036M8088;
            c16852 = c16853;
            abstractC6462 = c13956M19475;
            this.f31172 = m25943(c20530, abstractC6462, c17010, this.f31162);
            c2733Mo6098 = this.f31162.f77961.mo6098();
            abstractC6463 = c20530.f63425;
            if (abstractC6463 != null) {
                c2733Mo6098.m4255(C4848.m10276of((Object) c20530.f63425), new InterfaceC5930() { // from class: l.᩶᩶֨
                    @Override // p067l.InterfaceC5930
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6905(C2733 c2733) {
                        C20530 c20531 = c20530;
                        c20531.f63425 = c2733.m4250(c20531.f63425);
                    }
                });
            }
            c16852.m38283(c4849, c4036);
        } catch (Throwable th) {
            ((C10545) this.f31160.f8849).f29207 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25921(final C20530 c20530, final AbstractC14355 abstractC14355, AbstractC6462 abstractC6462, final C7650 c7650, final C4036 c4036, final C4848 c4848, final C4848 c4849, final C17010 c17010) {
        C4036 c4037;
        C8374 c8374;
        AbstractC6462 abstractC6462M19475;
        AbstractC6462 abstractC6462M19476;
        C16852 c16852;
        char c;
        C13370 c13370;
        AbstractC6462 abstractC6463;
        AbstractC6462 abstractC6464;
        C2733 c2733Mo6098 = this.f31162.f77961.mo6098();
        boolean zM21415 = C9268.m21415(c20530);
        C8374 c8375 = this.f31200;
        C16852 c16853 = this.f31163;
        if (zM21415 && (((abstractC6463 = c20530.f63425) != null && abstractC6463.m14792(c2733Mo6098.f4594)) || ((abstractC6464 = c20530.f63429.f18925) != null && abstractC6464.m14792(c2733Mo6098.f4594)))) {
            final C24626 c24626 = this.f31162;
            c2733Mo6098.m4255(C4848.m10277of((Object) c20530.f63425, (Object) c20530.f63429.f18925), new InterfaceC5930() { // from class: l.ܳۙ֨
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2733) {
                    C11216.m25915(this.f46159, c20530, abstractC14355, c24626, c7650, c4036, c4848, c4849, c17010, c2733);
                }
            });
            c4037 = c4036;
            abstractC6462M19476 = abstractC6462;
            c8374 = c8375;
            c16852 = c16853;
        } else {
            if (zM21415 && abstractC6462.m14777(EnumC11353.CLASS)) {
                c16853.getClass();
                C20271 c20271 = new C20271();
                for (AbstractC6462 abstractC6465 : ((C21333) abstractC6462).mo14798()) {
                    if (!C16852.m38253(abstractC6465)) {
                        c20271.m45777(abstractC6465);
                    }
                }
                C4848 c4848M45783 = c20271.m45783();
                if (!abstractC6462.mo14812() && c4848M45783.m10293()) {
                    AbstractC21195 abstractC21195 = abstractC6462.f16705;
                    C13370 c13371 = C13665.f38450;
                    C13370 c13372 = new C13370("compiler", "diamond", abstractC21195);
                    AbstractC14355 abstractC14356 = c20530.f63429;
                    abstractC14356.getClass();
                    if (c4848M45783.m10289() <= 1) {
                        c = 0;
                        c13370 = new C13370("compiler", "diamond.invalid.arg", c4848M45783, c13372);
                    } else {
                        c = 0;
                        c13370 = new C13370("compiler", "diamond.invalid.args", c4848M45783, c13372);
                    }
                    C14040 c14040 = C8300.f21997;
                    Object[] objArr = new Object[2];
                    objArr[c] = c13372;
                    objArr[1] = c13370;
                    this.f31202.m9352(abstractC14356, new C14040("compiler", "cant.apply.diamond.1", objArr));
                }
                Iterator it = abstractC6462.mo14802().iterator();
                while (it.hasNext()) {
                    this.f31180.f75301.m23807(this.f31160, (AbstractC6462) it.next());
                }
            }
            if (abstractC6462.f16705.m17989() || (abstractC6462.mo14812() && !abstractC6462.mo14811().m14777(EnumC11353.NONE) && abstractC6462.mo14811().f16705.m17989())) {
                c7650.f20024 = C4848.m10276of((Object) abstractC14355);
            } else {
                c7650.f20025 = abstractC14355;
            }
            if (this.f31162.f77961.mo6101().f23845 == EnumC15511.CHECK && m25960(abstractC6462)) {
                c4037 = c4036;
                ((C10545) c4037.f8849).f29203 = true;
            } else {
                c4037 = c4036;
            }
            m25937(c7650, c4037);
            C4848 c4848M10290 = (c20530.f63432 == null || abstractC6462.f16705.m17989()) ? c4848 : c4848.m10290(c20530.f63432.f18925);
            if (zM21415 && c17010.m38615(C17010.f50310)) {
                c4848M10290 = c4848M10290.m10287((Function) this.f31196.f40363);
            }
            C4848 c48410 = c4848M10290;
            if (abstractC6462.m14777(EnumC11353.ERROR)) {
                c8374 = c8375;
                abstractC6462M19475 = c8374.m19475(c7650.f20027.f20406);
            } else {
                c8374 = c8375;
                abstractC6462M19475 = c7650.f20027.f20406;
            }
            abstractC6462M19476 = abstractC6462M19475;
            AbstractC7783 abstractC7783M52652 = this.f31180.m52652(c20530, c4036, abstractC6462M19476, c48410, c4849);
            c20530.f63427 = abstractC7783M52652;
            C1446.m31704(!abstractC7783M52652.f20405.m6625());
            c20530.f63427 = abstractC7783M52652;
            c16852 = c16853;
            c20530.f63425 = m25941(c20530, abstractC6462M19476, abstractC7783M52652, c4036, new C24626(this, c17010, m25934(this.f31193.f69183, c48410, c4849), c16852.f49905, EnumC23995.f76206));
        }
        AbstractC7783 abstractC7783 = c20530.f63427;
        if (abstractC7783 == null || abstractC7783.f20405 != EnumC3600.f7343) {
            abstractC6462M19476 = c8374.m19475(c20530.f18925);
        }
        this.f31172 = m25943(c20530, abstractC6462M19476, C17010.f50311, this.f31162.mo40742(EnumC23995.f76207));
        c16852.m38283(c20530.f63431, c4037);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m25915(C11216 c11216, C20530 c20530, AbstractC14355 abstractC14355, C24626 c24626, C7650 c7650, C4036 c4036, C4848 c4848, C4848 c4849, C17010 c17010, C2733 c2733) {
        c20530.f63425 = c2733.m4250(c20530.f63425);
        AbstractC14355 abstractC14356 = c20530.f63429;
        AbstractC6462 abstractC6462M4250 = c2733.m4250(abstractC14355.f18925);
        abstractC14355.f18925 = abstractC6462M4250;
        abstractC14356.f18925 = abstractC6462M4250;
        C24626 c24627 = c11216.f31162;
        try {
            c11216.f31162 = c24626;
            c11216.m25921(c20530, abstractC14355, abstractC14355.f18925, c7650, c4036, c4848, c4849, c17010);
        } finally {
            c11216.f31162 = c24627;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m25948(AbstractC14355 abstractC14355) {
        if (abstractC14355.mo3383() != EnumC19998.f60772) {
            AbstractC12224 abstractC12224M21428 = C9268.m21428(abstractC14355);
            C8200 c8200 = this.f31178;
            if (abstractC12224M21428 != c8200.f21744 && abstractC12224M21428 != c8200.f21756) {
                EnumC19998 enumC19998 = EnumC19998.f60784;
                int i = abstractC14355.f18924;
                C18537 c18537 = this.f31198;
                c18537.f55352 = i;
                C8598 c8598M42156 = c18537.m42156(enumC19998, abstractC14355);
                c8598M42156.f5602 = this.f31169.m27497(abstractC14355, enumC19998, abstractC14355.f18925);
                c8598M42156.f18925 = abstractC14355.f18925;
                return c8598M42156;
            }
        }
        return abstractC14355;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        AbstractC6462 abstractC6462M19475;
        AbstractC7783 abstractC7783;
        AbstractC6462 c7251;
        AbstractC6462 abstractC6462M25963;
        AbstractC6462 abstractC6462 = c19859.f18925;
        C8374 c8374 = this.f31200;
        C13956 c13956M19475 = c8374.m19475(abstractC6462);
        C4036 c4036 = this.f31160;
        C4036 c4036M8087 = c4036.m8087(c19859, c4036.f8849);
        AbstractC14355 abstractC14355 = c19859.f60358;
        C23623 c23623 = this.f31202;
        C22004 c22004 = this.f31193;
        if (abstractC14355 != null) {
            abstractC6462M25963 = m25963(abstractC14355, c4036M8087, AbstractC6462.f16700);
            this.f31163.m38298((AbstractC7257) c19859.f60358, c4036M8087, true);
            C4848 c4848 = c19859.f60360;
            c7251 = abstractC6462M25963;
            while (c4848.m10293()) {
                m25938((AbstractC7257) c4848.f11034, c4036M8087, (AbstractC6462) c22004.f69134);
                C7251 c7252 = new C7251(c7251, c22004.f69187);
                c4848 = c4848.f11035;
                c7251 = c7252;
            }
        } else {
            if (this.f31162.f77965.m14777(EnumC11353.ARRAY)) {
                abstractC6462M19475 = c8374.m19455(this.f31162.f77965);
            } else {
                if (!this.f31162.f77965.m14777(EnumC11353.ERROR) && ((abstractC7783 = ((C10545) this.f31160.f8849).f29209) == null || !abstractC7783.f20406.mo14812())) {
                    AbstractC6462 abstractC6463 = this.f31162.f77965;
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(c19859, new C14040("compiler", "illegal.initializer.for.type", abstractC6463));
                }
                abstractC6462M19475 = c8374.m19475(this.f31162.f77965);
            }
            AbstractC6462 abstractC6464 = abstractC6462M19475;
            c7251 = c13956M19475;
            abstractC6462M25963 = abstractC6464;
        }
        C4848 c4849 = c19859.f60359;
        if (c4849 != null) {
            C20271 c20271 = new C20271();
            while (c4849.m10293()) {
                c20271.m45777(m25938((AbstractC7257) c4849.f11034, c4036M8087, abstractC6462M25963));
                c4849 = c4849.f11035;
            }
            c20271.m45783();
            c7251 = new C7251(abstractC6462M25963, c22004.f69187);
        }
        if (!c8374.m19417(abstractC6462M25963)) {
            c23623.m9352(c19859, C8300.f22158);
        }
        this.f31172 = m25943(c19859, c7251, C17010.f50311, this.f31162);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ea A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0212 A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x024f  */
    /* JADX WARN: Code duplicated, block: B:126:0x026f A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02d4 A[Catch: all -> 0x02e4, ᩷֡֨ -> 0x02e6, ۛܶ֨ -> 0x02ea, TryCatch #1 {all -> 0x02e4, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf, B:109:0x01f9, B:111:0x020c, B:120:0x0235, B:124:0x0250, B:126:0x026f, B:128:0x0281, B:130:0x0299, B:131:0x02b0, B:133:0x02c9, B:135:0x02da, B:134:0x02d4, B:112:0x0212, B:114:0x0218, B:117:0x0227, B:118:0x022f, B:119:0x0230), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0303  */
    /* JADX WARN: Code duplicated, block: B:167:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x034c A[DONT_GENERATE, PHI: r1 r15 r16
      0x034c: PHI (r1v33 l.ۙ֨֨) = (r1v32 l.ۙ֨֨), (r1v36 l.ۙ֨֨) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r15v6 l.ۡۗ֨) = (r15v12 l.ۡۗ֨), (r15v13 l.ۡۗ֨) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r16v5 boolean) = (r16v3 boolean), (r16v6 boolean) binds: [B:155:0x030e, B:170:0x034a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[Catch: ᩷֡֨ -> 0x008c, all -> 0x02e4, ۛܶ֨ -> 0x02ee, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[Catch: ᩷֡֨ -> 0x008c, all -> 0x02e4, ۛܶ֨ -> 0x02ee, TRY_LEAVE, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: ᩷֡֨ -> 0x008c, all -> 0x02e4, ۛܶ֨ -> 0x02ee, TRY_ENTER, TRY_LEAVE, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0176 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0186 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf A[Catch: ᩷֡֨ -> 0x008c, ۛܶ֨ -> 0x015e, all -> 0x02e4, TRY_LEAVE, TryCatch #0 {᩷֡֨ -> 0x008c, blocks: (B:24:0x0077, B:26:0x0081, B:29:0x008f, B:31:0x0095, B:33:0x00a2, B:35:0x00b2, B:50:0x00dc, B:52:0x00f6, B:56:0x010a, B:73:0x0163, B:75:0x0169, B:76:0x0170, B:78:0x0176, B:82:0x017f, B:84:0x018c, B:86:0x0198, B:87:0x019f, B:91:0x01af, B:90:0x01ad, B:83:0x0186, B:92:0x01b6, B:94:0x01bf), top: B:191:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd  */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) throws Throwable {
        boolean z;
        AbstractC7783 abstractC7783;
        boolean z2;
        Object obj;
        C8374 c8374;
        AbstractC6462 abstractC6462;
        C4848 c4848M21400;
        AbstractC6462 abstractC6463;
        AbstractC6462 abstractC6464;
        boolean z3;
        boolean zM14777;
        C8005 c8005;
        C23623 c23623;
        C24626 c24626M25950;
        C4968 c4968;
        C17010 c17010;
        boolean z4;
        AbstractC6462 abstractC6462M25943;
        C4848 c4848Mo14797;
        C4848 c4848;
        boolean z5;
        AbstractC6462 abstractC6465;
        C13286 c13286;
        AbstractC6462 abstractC6466;
        AbstractC6462 abstractC6467;
        C13286 c13287;
        AbstractC6462 abstractC6468;
        C13286 c13288;
        C18537 c18537 = this.f31198;
        C12083 c12083 = this.f31173;
        boolean zMo14812 = this.f31162.f77965.mo14812();
        C23623 c23624 = this.f31202;
        C15908 c15908 = this.f31203;
        if (zMo14812 || (this.f31162.f77965.m14777(EnumC11353.NONE) && this.f31162.f77965 != AbstractC6462.f16699)) {
            if (this.f31162.f77965.m14777(EnumC11353.NONE) && ((abstractC7783 = ((C10545) this.f31160.f8849).f29209) == null || !abstractC7783.f20406.mo14812())) {
                c23624.m9352(c15834, C8300.f22098);
            }
            this.f31162 = c15908;
            z = true;
        } else {
            z = false;
        }
        C4036 c4036M25931 = m25931(c15834, this.f31160);
        Object obj2 = c4036M25931.f8849;
        boolean z6 = this.f31162.f77961.mo6101().f23845 == EnumC15511.CHECK;
        C8374 c8375 = this.f31200;
        try {
            if (!z6) {
                if (c15834.f45861 == EnumC18517.EXPLICIT) {
                    m25965(c15834.f45863, c4036M25931);
                    c4848M21400 = C9268.m21400(c15834.f45863);
                } else {
                    c4848M21400 = null;
                }
                C8533 c8533M25947 = m25947(c15834, this.f31162, c4848M21400);
                abstractC6463 = c8533M25947.f22895;
                abstractC6464 = c8533M25947.f22894;
                if (abstractC6463.mo14812()) {
                    c15834.f18925 = abstractC6463;
                    this.f31172 = abstractC6463;
                    ((C10545) obj2).f29201.mo28410();
                    if (z6) {
                        AbstractC6462 abstractC6469 = this.f31172;
                        m25939(c15834, this.f31160, c15908);
                        if (abstractC6468 == c13288) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                C24626 c24626 = this.f31162;
                z3 = z;
                c8374 = c8375;
                m25911(c4036M25931, c15834, c24626.f77965, abstractC6464, abstractC6463, c24626.f77961);
                zM14777 = abstractC6464.m14777(EnumC11353.FORALL);
                c8005 = this.f31159;
                if (zM14777) {
                    EnumC10306 enumC10306M51425 = C23047.m51425(abstractC6463.f16705);
                    AbstractC21195 abstractC21195 = abstractC6463.f16705;
                    C13370 c13370 = C13665.f38450;
                    this.f31162.f77961.mo3480(c15834, c8005.m18543(new C13370("compiler", "invalid.generic.lambda.target", abstractC6464, enumC10306M51425, abstractC21195)));
                    C13956 c13956M19475 = c8374.m19475(this.f31162.f77965);
                    c15834.f18925 = c13956M19475;
                    this.f31172 = c13956M19475;
                    ((C10545) obj2).f29201.mo28410();
                    if (z6) {
                        AbstractC6462 abstractC64610 = this.f31172;
                        m25939(c15834, this.f31160, c15908);
                        if (abstractC6467 == c13287) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (c15834.f45861 == EnumC18517.IMPLICIT) {
                    c4848Mo14797 = abstractC6464.mo14797();
                    c4848 = c15834.f45863;
                    z5 = false;
                    while (c4848.m10293()) {
                        if (c4848Mo14797.isEmpty()) {
                            z5 = true;
                        }
                        if (z5) {
                            abstractC6466 = this.f31193.f69139;
                        } else {
                            abstractC6466 = (AbstractC6462) c4848Mo14797.f11034;
                        }
                        C23623 c23625 = c23624;
                        if (((C11281) c4848.f11034).m26219()) {
                            m25918((C11281) c4848.f11034, abstractC6466);
                        }
                        ((C11281) c4848.f11034).f31438 = null;
                        if (c4848Mo14797.isEmpty()) {
                            c4848Mo14797 = c4848Mo14797.f11035;
                        }
                        c4848 = c4848.f11035;
                        z5 = z5;
                        c23624 = c23625;
                    }
                    c23623 = c23624;
                    m25965(c15834.f45863, c4036M25931);
                    if (z5) {
                        this.f31162.f77961.mo3480(c15834, c8005.m18543(C13665.f38473));
                        C13956 c13956M19476 = c8374.m19475(abstractC6463);
                        c15834.f18925 = c13956M19476;
                        this.f31172 = c13956M19476;
                        ((C10545) obj2).f29201.mo28410();
                        if (z6) {
                            AbstractC6462 abstractC64611 = this.f31172;
                            m25939(c15834, this.f31160, c15908);
                            if (abstractC6465 == c13286) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    c23623 = c23624;
                }
                c24626M25950 = m25950(c15834, abstractC6464, this.f31162);
                ((C10545) obj2).f29200 = c24626M25950;
                if (c15834.m35951() == EnumC15394.EXPRESSION) {
                    m25939(c15834.f45864, c4036M25931, c24626M25950);
                } else {
                    c4968 = (C4968) c15834.f45864;
                    if (c4968 == null) {
                        m25928(c4036M25931);
                        throw new C11926();
                    }
                    m25965(c4968.f11316, c4036M25931);
                }
                c17010 = C17010.f50311;
                this.f31172 = m25943(c15834, abstractC6463, c17010, this.f31162);
                if (this.f31162.f77961.mo6101().f23845 == EnumC15511.SPECULATIVE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f31174.m23159();
                new C14607(this).mo12739(c15834.f45864);
                c12083.m27686(this.f31160, c15834, c18537, z4);
                c15834.f18925 = abstractC6463;
                m25958(c15834, abstractC6464, this.f31162.f77961);
                if (!z4) {
                    if (this.f31162.f77961.mo6098().m4264(abstractC6464.mo14794())) {
                        C4848 c4848Mo14794 = abstractC6464.mo14794();
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(c15834, new C14040("compiler", "incompatible.thrown.types.in.mref", c4848Mo14794));
                    }
                    m25923(c15834, c4036M25931, this.f31162.f77961.mo6098(), C4848.m10282((Object[]) new AbstractC6462[]{abstractC6464, abstractC6463}));
                }
                if (z3) {
                    abstractC6462M25943 = c8374.m19475(this.f31162.f77965);
                    c15834.f18925 = abstractC6462M25943;
                } else {
                    abstractC6462M25943 = m25943(c15834, abstractC6463, c17010, this.f31162);
                }
                this.f31172 = abstractC6462M25943;
                ((C10545) obj2).f29201.mo28410();
            }
            try {
                try {
                    try {
                        if (m25960(this.f31162.f77965)) {
                            ((C10545) obj2).f29203 = true;
                            ((C10545) obj2).f29214 = true;
                        }
                        if (c15834.f45861 == EnumC18517.EXPLICIT) {
                            m25965(c15834.f45863, c4036M25931);
                            c4848M21400 = C9268.m21400(c15834.f45863);
                        } else {
                            c4848M21400 = null;
                        }
                        C8533 c8533M25948 = m25947(c15834, this.f31162, c4848M21400);
                        abstractC6463 = c8533M25948.f22895;
                        abstractC6464 = c8533M25948.f22894;
                        if (abstractC6463.mo14812()) {
                            c15834.f18925 = abstractC6463;
                            this.f31172 = abstractC6463;
                            ((C10545) obj2).f29201.mo28410();
                            if (z6) {
                                AbstractC6462 abstractC64612 = this.f31172;
                                try {
                                    m25939(c15834, this.f31160, c15908);
                                    if (abstractC6468 == c13288) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } finally {
                                    if (this.f31172 == AbstractC6462.f16699) {
                                        this.f31172 = abstractC64612;
                                    }
                                }
                            }
                            return;
                        }
                        C24626 c24627 = this.f31162;
                        z3 = z;
                        c8374 = c8375;
                        try {
                            m25911(c4036M25931, c15834, c24627.f77965, abstractC6464, abstractC6463, c24627.f77961);
                            zM14777 = abstractC6464.m14777(EnumC11353.FORALL);
                            c8005 = this.f31159;
                            if (zM14777) {
                                EnumC10306 enumC10306M51426 = C23047.m51425(abstractC6463.f16705);
                                AbstractC21195 abstractC21196 = abstractC6463.f16705;
                                C13370 c13371 = C13665.f38450;
                                this.f31162.f77961.mo3480(c15834, c8005.m18543(new C13370("compiler", "invalid.generic.lambda.target", abstractC6464, enumC10306M51426, abstractC21196)));
                                C13956 c13956M19477 = c8374.m19475(this.f31162.f77965);
                                c15834.f18925 = c13956M19477;
                                this.f31172 = c13956M19477;
                                ((C10545) obj2).f29201.mo28410();
                                if (z6) {
                                    AbstractC6462 abstractC64613 = this.f31172;
                                    try {
                                        m25939(c15834, this.f31160, c15908);
                                        if (abstractC6467 == c13287) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    } finally {
                                        if (this.f31172 == AbstractC6462.f16699) {
                                            this.f31172 = abstractC64613;
                                        }
                                    }
                                }
                                return;
                            }
                            if (c15834.f45861 == EnumC18517.IMPLICIT) {
                                c4848Mo14797 = abstractC6464.mo14797();
                                c4848 = c15834.f45863;
                                z5 = false;
                                while (c4848.m10293()) {
                                    if (c4848Mo14797.isEmpty()) {
                                        z5 = true;
                                    }
                                    if (z5) {
                                        abstractC6466 = this.f31193.f69139;
                                    } else {
                                        abstractC6466 = (AbstractC6462) c4848Mo14797.f11034;
                                    }
                                    C23623 c23626 = c23624;
                                    if (((C11281) c4848.f11034).m26219()) {
                                        m25918((C11281) c4848.f11034, abstractC6466);
                                    }
                                    ((C11281) c4848.f11034).f31438 = null;
                                    if (c4848Mo14797.isEmpty()) {
                                        c4848Mo14797 = c4848Mo14797.f11035;
                                    }
                                    c4848 = c4848.f11035;
                                    z5 = z5;
                                    c23624 = c23626;
                                }
                                c23623 = c23624;
                                m25965(c15834.f45863, c4036M25931);
                                if (z5) {
                                    this.f31162.f77961.mo3480(c15834, c8005.m18543(C13665.f38473));
                                    C13956 c13956M19478 = c8374.m19475(abstractC6463);
                                    c15834.f18925 = c13956M19478;
                                    this.f31172 = c13956M19478;
                                    ((C10545) obj2).f29201.mo28410();
                                    if (z6) {
                                        AbstractC6462 abstractC64614 = this.f31172;
                                        try {
                                            m25939(c15834, this.f31160, c15908);
                                            if (abstractC6465 == c13286) {
                                                return;
                                            } else {
                                                return;
                                            }
                                        } finally {
                                            if (this.f31172 == AbstractC6462.f16699) {
                                                this.f31172 = abstractC64614;
                                            }
                                        }
                                    }
                                    return;
                                }
                            } else {
                                c23623 = c23624;
                            }
                            try {
                                c24626M25950 = m25950(c15834, abstractC6464, this.f31162);
                                ((C10545) obj2).f29200 = c24626M25950;
                                if (c15834.m35951() == EnumC15394.EXPRESSION) {
                                    m25939(c15834.f45864, c4036M25931, c24626M25950);
                                } else {
                                    c4968 = (C4968) c15834.f45864;
                                    if (c4968 == null && this.f31162.f77961.mo6101().f23845 == EnumC15511.CHECK) {
                                        m25928(c4036M25931);
                                        throw new C11926();
                                    }
                                    m25965(c4968.f11316, c4036M25931);
                                }
                                c17010 = C17010.f50311;
                                this.f31172 = m25943(c15834, abstractC6463, c17010, this.f31162);
                                if (this.f31162.f77961.mo6101().f23845 == EnumC15511.SPECULATIVE) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                this.f31174.m23159();
                                new C14607(this).mo12739(c15834.f45864);
                                c12083.m27686(this.f31160, c15834, c18537, z4);
                                c15834.f18925 = abstractC6463;
                                m25958(c15834, abstractC6464, this.f31162.f77961);
                                if (!z4) {
                                    if (this.f31162.f77961.mo6098().m4264(abstractC6464.mo14794()) && !m25959(c12083.m27685(this.f31160, c15834, c18537), abstractC6464.mo14794(), this.f31162.f77961.mo6098())) {
                                        C4848 c4848Mo14795 = abstractC6464.mo14794();
                                        C14040 c14041 = C8300.f21997;
                                        c23623.m9352(c15834, new C14040("compiler", "incompatible.thrown.types.in.mref", c4848Mo14795));
                                    }
                                    m25923(c15834, c4036M25931, this.f31162.f77961.mo6098(), C4848.m10282((Object[]) new AbstractC6462[]{abstractC6464, abstractC6463}));
                                }
                                if (z3) {
                                    abstractC6462M25943 = c8374.m19475(this.f31162.f77965);
                                    c15834.f18925 = abstractC6462M25943;
                                } else {
                                    abstractC6462M25943 = m25943(c15834, abstractC6463, c17010, this.f31162);
                                }
                                this.f31172 = abstractC6462M25943;
                                ((C10545) obj2).f29201.mo28410();
                            } catch (C8194 e) {
                                e = e;
                                z6 = false;
                                this.f31162.f77961.mo3480(c15834, e.m18981());
                                C13956 c13956M19479 = c8374.m19475(this.f31162.f77965);
                                c15834.f18925 = c13956M19479;
                                this.f31172 = c13956M19479;
                                C10545 c10545 = (C10545) obj2;
                                c10545.f29201.mo28410();
                                obj2 = c10545;
                                if (z6) {
                                    abstractC6462 = this.f31172;
                                    try {
                                        m25939(c15834, this.f31160, c15908);
                                    } finally {
                                        if (this.f31172 == AbstractC6462.f16699) {
                                            this.f31172 = abstractC6462;
                                        }
                                    }
                                }
                            } catch (C21865 e2) {
                                e = e2;
                                z6 = false;
                                this.f31163.m38271(c15834, e);
                                C10545 c10546 = (C10545) obj2;
                                c10546.f29201.mo28410();
                                obj2 = c10546;
                                if (z6) {
                                    abstractC6462 = this.f31172;
                                    try {
                                        m25939(c15834, this.f31160, c15908);
                                    } finally {
                                        if (this.f31172 == AbstractC6462.f16699) {
                                            this.f31172 = abstractC6462;
                                        }
                                    }
                                }
                            }
                        } catch (C8194 e3) {
                            e = e3;
                        }
                    } catch (C21865 e4) {
                        e = e4;
                        this.f31163.m38271(c15834, e);
                        C10545 c10547 = (C10545) obj2;
                        c10547.f29201.mo28410();
                        obj2 = c10547;
                        if (z6) {
                            abstractC6462 = this.f31172;
                            m25939(c15834, this.f31160, c15908);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = false;
                        obj = obj2;
                        ((C10545) obj).f29201.mo28410();
                        if (z2) {
                            AbstractC6462 abstractC64615 = this.f31172;
                            try {
                                m25939(c15834, this.f31160, c15908);
                            } finally {
                                if (this.f31172 == AbstractC6462.f16699) {
                                    this.f31172 = abstractC64615;
                                }
                            }
                        }
                        throw th;
                    }
                }
            } catch (C8194 e5) {
                e = e5;
                c8374 = c8375;
                this.f31162.f77961.mo3480(c15834, e.m18981());
                C13956 c13956M194710 = c8374.m19475(this.f31162.f77965);
                c15834.f18925 = c13956M194710;
                this.f31172 = c13956M194710;
                C10545 c10548 = (C10545) obj2;
                c10548.f29201.mo28410();
                obj2 = c10548;
                if (z6) {
                    abstractC6462 = this.f31172;
                    m25939(c15834, this.f31160, c15908);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = z6;
            obj = obj2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8533 m25947(AbstractC6448 abstractC6448, C24626 c24626, C4848 c4848) {
        AbstractC6462 c12497;
        AbstractC6462 abstractC6462;
        AbstractC6462 abstractC6463 = c24626.f77965;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        AbstractC6462 abstractC6462M19475 = AbstractC6462.f16699;
        C8374 c8374 = this.f31200;
        if (abstractC6463 != abstractC6462M19475) {
            C4351 c4351 = this.f31186;
            c4351.getClass();
            AbstractC6462 abstractC6462M20294 = (AbstractC6462) abstractC6463.mo5291(c4351, abstractC6448);
            abstractC6462M20294.getClass();
            boolean z = abstractC6462M20294 instanceof C7921;
            C8769 c8769 = this.f31201;
            if (z) {
                C20271 c20271 = new C20271();
                for (AbstractC6462 abstractC6462M20295 : ((C7921) abstractC6462M20294).m18291()) {
                    if (c4848 != null) {
                        try {
                            abstractC6462M20295 = c8769.m20294(abstractC6448, abstractC6462M20295, c4848, interfaceC6125);
                        } catch (C8194 unused) {
                        }
                    }
                    c20271.m45777(c8374.m19477(abstractC6462M20295));
                }
                abstractC6462M19475 = c8374.m19474(c20271.m45783());
                abstractC6462M19475.f16705.f20409 |= 512;
                c12497 = c8374.m19478(abstractC6462M19475);
            } else {
                if (c4848 != null) {
                    abstractC6462M20294 = c8769.m20294(abstractC6448, abstractC6462M20294, c4848, interfaceC6125);
                }
                abstractC6462M19475 = c8374.m19477(abstractC6462M20294);
                c12497 = c8374.m19478(abstractC6462M19475);
            }
        } else {
            int i = C3207.f6222[abstractC6448.mo3383().ordinal()];
            C22004 c22004 = this.f31193;
            if (i == 2) {
                C4848 c4848M10283 = C4848.m10283();
                Iterator it = ((C15834) abstractC6448).f45863.iterator();
                while (it.hasNext()) {
                    AbstractC14355 abstractC14355 = ((C11281) it.next()).f31437;
                    c4848M10283 = (abstractC14355 == null || (abstractC6462 = abstractC14355.f18925) == null) ? c4848M10283.m10286(c22004.f69139) : c4848M10283.m10286(abstractC6462);
                }
                c12497 = new C12497(c4848M10283, AbstractC6462.f16699, C4848.m10276of((Object) c22004.f69161), c22004.f69163);
            } else {
                if (i != 3) {
                    C1446.m31702("Cannot get here!");
                    throw null;
                }
                c12497 = new C12497(C4848.m10283(), abstractC6462M19475, C4848.m10276of((Object) c22004.f69161), c22004.f69163);
            }
        }
        if (abstractC6448.m16617(EnumC19998.f60747) && c12497.m14777(EnumC11353.FORALL)) {
            EnumC10306 enumC10306M51425 = C23047.m51425(abstractC6462M19475.f16705);
            AbstractC21195 abstractC21195 = abstractC6462M19475.f16705;
            C13370 c13370 = C13665.f38450;
            interfaceC6125.mo3480(abstractC6448, this.f31159.m18543(new C13370("compiler", "invalid.generic.lambda.target", c12497, enumC10306M51425, abstractC21195)));
            abstractC6462M19475 = c8374.m19475(this.f31162.f77965);
        }
        C8533 c8533 = new C8533();
        c8533.f22895 = abstractC6462M19475;
        c8533.f22894 = c12497;
        return c8533;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m25923(final AbstractC24413 abstractC24413, final C4036 c4036, C2733 c2733, final C4848 c4848) {
        if (c2733.m4264(c4848)) {
            c2733.m4255(c4848, new InterfaceC5930() { // from class: l.ܰ᩶֨
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2734) {
                    this.f45520.m25923(abstractC24413, c4036, c2734, c2734.m4248(c4848));
                }
            });
            return;
        }
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            this.f31180.f75301.m23807(c4036, (AbstractC6462) it.next());
        }
    }

    public C11216(C5127 c5127) {
        c5127.m10908(f31157, this);
        this.f31178 = C8200.m18988(c5127);
        this.f31202 = C23623.m52439(c5127);
        this.f31193 = C22004.m49577(c5127);
        this.f31180 = C23663.m52629(c5127);
        this.f31169 = C12004.m27492(c5127);
        C16852 c16852M38215 = C16852.m38215(c5127);
        this.f31163 = c16852M38215;
        this.f31173 = C12083.m27670(c5127);
        this.f31183 = C18213.m41428(c5127);
        if (((C12955) c5127.m10905(C12955.f36424)) == null) {
            new C12955(c5127);
        }
        this.f31198 = C18537.m42139(c5127);
        this.f31168 = C15492.m35238(c5127);
        this.f31201 = C8769.m20284(c5127);
        this.f31170 = C6383.m14595(c5127);
        C14152 c14152M32631 = C14152.m32631(c5127);
        this.f31196 = c14152M32631;
        this.f31188 = C6795.m15513(c5127);
        EnumC12720.m29246(c5127);
        this.f31200 = C8374.m19396(c5127);
        C24387 c24387M53737 = C24387.m53737(c5127);
        this.f31181 = c24387M53737;
        this.f31159 = C8005.m18541(c5127);
        this.f31199 = C15099.m34493(c5127);
        this.f31205 = C18728.m42754(c5127);
        this.f31197 = C19694.m44728(c5127);
        this.f31171 = C18318.m41754(c5127);
        AbstractC19405.m44186(c5127);
        this.f31176 = C7664.m17734(c5127);
        C4132 c4132 = (C4132) c5127.m10905(C4132.f9118);
        this.f31165 = c4132 == null ? new C4132(c5127) : c4132;
        C9874 c9874 = (C9874) c5127.m10905(C9874.f27384);
        this.f31174 = c9874 == null ? new C9874(c5127) : c9874;
        C13565 c13565M30871 = C13565.m30871(c5127);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f31190 = EnumC12477.f34973.m28726(enumC17840M40515);
        this.f31204 = EnumC12477.f34967.m28726(enumC17840M40515);
        EnumC12477.f34975.m28726(enumC17840M40515);
        this.f31161 = EnumC12477.f34962.m28726(enumC17840M40515);
        this.f31185 = EnumC12477.f34972.m28726(enumC17840M40515);
        this.f31192 = EnumC12477.f34954.m28726(enumC17840M40515);
        this.f31194 = EnumC12477.f34978.m28726(enumC17840M40515);
        this.f31179 = (c24387M53737.m53743() || !c24387M53737.m53747(EnumC12477.f34960)) && EnumC12477.f34960.m28726(enumC17840M40515);
        this.f31191 = enumC17840M40515.f53238;
        this.f31189 = c13565M30871.m30879("useBeforeDeclarationWarning");
        C17010 c17010 = C17010.f50314;
        C13286 c13286 = AbstractC6462.f16700;
        this.f31195 = new C24626(this, c17010, c13286);
        this.f31164 = new C24626(this, C17010.f50313, c13286);
        this.f31177 = new C24626(this, C17010.f50311, c13286);
        this.f31182 = new C17920(this, c16852M38215.f49905);
        this.f31175 = new C24626(this, C17010.f50319, c13286);
        EnumC23995 enumC23995 = EnumC23995.f76209;
        this.f31203 = new C15908(this, c14152M32631.f40370, AbstractC6462.f16699);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24626 m25950(C15834 c15834, AbstractC6462 abstractC6462, C24626 c24626) {
        InterfaceC6125 c9243;
        if (c15834.m35951() == EnumC15394.EXPRESSION) {
            c9243 = new C15277(this, (AbstractC14355) c15834.f45864, c24626.f77961);
        } else {
            c9243 = new C9243(this, c24626.f77961);
        }
        if (abstractC6462.mo14787() == AbstractC6462.f16699) {
            return this.f31203;
        }
        return new C24626(this, C17010.f50311, abstractC6462.mo14787(), c9243);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25958(C15834 c15834, AbstractC6462 abstractC6462, InterfaceC6125 interfaceC6125) {
        AbstractC6462 abstractC6462M4259 = interfaceC6125.mo6098().m4259(abstractC6462.mo14787());
        EnumC15394 enumC15394M35951 = c15834.m35951();
        EnumC15394 enumC15394 = EnumC15394.STATEMENT;
        C8005 c8005 = this.f31159;
        if (enumC15394M35951 == enumC15394 && c15834.f45862 && !abstractC6462M4259.m14777(EnumC11353.VOID) && abstractC6462M4259 != AbstractC6462.f16699) {
            interfaceC6125.mo3480(c15834, c8005.m18543(new C13370("compiler", "incompatible.ret.type.in.lambda", C13665.m31062(abstractC6462M4259))));
        }
        if (this.f31200.m19489(interfaceC6125.mo6098().m4258(abstractC6462.mo14797()), C9268.m21400(c15834.f45863))) {
            return;
        }
        interfaceC6125.mo3480(c15834, c8005.m18543(C13665.f38473));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5771 m25962(C15828 c15828) {
        return (C5771) this.f31166.remove(c15828);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4036 m25931(C15834 c15834, C4036 c4036) {
        C4036 c4036M8087;
        Object obj = c4036.f8849;
        C10545 c10545 = (C10545) obj;
        AbstractC15689 abstractC15689 = c10545.f29201;
        AbstractC7783 abstractC7783 = abstractC15689.f26587;
        if (abstractC7783.f20405 == EnumC3600.f7339 && abstractC7783.f20407.f20405 == EnumC3600.f7354) {
            C15828 c15828M17990 = abstractC7783.m17990();
            C10545 c10546 = (C10545) obj;
            AbstractC7783 abstractC7784 = c10546.f29201.f26587;
            long jMo18003 = abstractC7783.mo18003() & 8;
            C8200 c8200 = this.f31178;
            if (jMo18003 == 0) {
                Iterator it = c15828M17990.f45850.m22456(c8200.f21737).iterator();
                if (it.hasNext()) {
                    abstractC7784 = (AbstractC7783) it.next();
                }
            } else {
                HashMap map = this.f31166;
                C5771 c5771 = (C5771) map.get(c15828M17990);
                if (c5771 == null) {
                    C4848 c4848M10283 = C4848.m10283();
                    C22004 c22004 = this.f31193;
                    c5771 = new C5771(4106L, c8200.f21700, new C12497(c4848M10283, c22004.f69183, C4848.m10283(), c22004.f69163), c15828M17990);
                    c5771.f14172 = C4848.m10283();
                    map.put(c15828M17990, c5771);
                }
                abstractC7784 = c5771;
            }
            c4036M8087 = c4036.m8087(c15834, c10546.m24327(c10546.f29201.mo28416(abstractC7784)));
        } else {
            c4036M8087 = c4036.m8087(c15834, c10545.m24327(abstractC15689.mo28413(abstractC7783)));
        }
        C10545 c10547 = (C10545) c4036M8087.f8849;
        c10547.f29202 = null;
        c10547.f29210 = true;
        return c4036M8087;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e5 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0312  */
    /* JADX WARN: Code duplicated, block: B:120:0x031f A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x035d A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x036a A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x036f  */
    /* JADX WARN: Code duplicated, block: B:136:0x037f A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0382 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x038e A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f7 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:157:0x0424  */
    /* JADX WARN: Code duplicated, block: B:158:0x0426  */
    /* JADX WARN: Code duplicated, block: B:161:0x0439 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:10:0x0036, B:13:0x0050, B:15:0x005c, B:18:0x0064, B:22:0x009f, B:24:0x00a5, B:26:0x00aa, B:28:0x00b2, B:36:0x00d2, B:38:0x00d8, B:39:0x00df, B:41:0x00ee, B:45:0x00ff, B:47:0x014a, B:48:0x0157, B:29:0x00bb, B:31:0x00c7, B:35:0x00d0), top: B:187:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01b8 A[Catch: ۛܶ֨ -> 0x0260, TRY_LEAVE, TryCatch #2 {ۛܶ֨ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:188:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0 A[Catch: ۛܶ֨ -> 0x0260, TryCatch #2 {ۛܶ֨ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:188:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0209 A[Catch: ۛܶ֨ -> 0x0260, TryCatch #2 {ۛܶ֨ -> 0x0260, blocks: (B:52:0x019d, B:54:0x01b8, B:61:0x01d1, B:63:0x01f0, B:65:0x0220, B:64:0x0209), top: B:188:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0234 A[Catch: ۛܶ֨ -> 0x025b, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x023a A[Catch: ۛܶ֨ -> 0x025b, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0243 A[Catch: ۛܶ֨ -> 0x025b, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x024b A[Catch: ۛܶ֨ -> 0x025b, TRY_LEAVE, TryCatch #5 {ۛܶ֨ -> 0x025b, blocks: (B:67:0x022e, B:69:0x0234, B:71:0x023a, B:75:0x0243, B:76:0x024b), top: B:193:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0273 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0284 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0289  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a9 A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ae A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:57:0x01c6, B:84:0x0263, B:85:0x0272, B:78:0x0252, B:86:0x0273, B:88:0x0284, B:90:0x028a, B:92:0x02a9, B:94:0x02ae, B:98:0x02c0, B:100:0x02c6, B:102:0x02ce, B:104:0x02d7, B:106:0x02e5, B:108:0x02e9, B:110:0x02f3, B:112:0x02fb, B:114:0x0303, B:118:0x0317, B:120:0x031f, B:122:0x0327, B:124:0x0331, B:126:0x0357, B:128:0x035d, B:130:0x0363, B:132:0x036a, B:134:0x0371, B:136:0x037f, B:138:0x0386, B:140:0x038e, B:142:0x0392, B:144:0x03bf, B:146:0x03d3, B:149:0x03eb, B:150:0x03f0, B:151:0x03f1, B:153:0x03f7, B:155:0x0416, B:159:0x0427, B:161:0x0439, B:162:0x0451, B:137:0x0382, B:170:0x0466, B:171:0x0471), top: B:190:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [l.ۗ۠۠, l.ۚۚ۠] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.ۛ᩸֨] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [l.ۘ۬֨] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) throws Throwable {
        AbstractC7783 abstractC7783;
        ?? r14;
        ?? r12;
        AbstractC6462 abstractC6462M19475;
        char c;
        AbstractC7783 abstractC7783M21438;
        boolean z;
        C4848 c4848M10283;
        C4848 c4848;
        EnumC15511 enumC15511;
        EnumC15511 enumC15512;
        boolean z2;
        AbstractC6462 abstractC6462;
        AbstractC6462 abstractC6463;
        AbstractC6462 abstractC6464;
        EnumC12909 enumC12909;
        C4848 c4848Mo14797;
        AbstractC11853 c21496;
        C4848 c4848M4265;
        EnumC12909 enumC129010;
        C11142 c11143;
        AbstractC7783 abstractC7784;
        AbstractC10923 abstractC10923;
        EnumC3600 enumC3600;
        AbstractC7783 abstractC7783Mo9143;
        EnumC12909 enumC129011;
        AbstractC6462 abstractC6462Mo14787;
        C4848 c4849;
        C24626 c24626Mo40741;
        AbstractC10923 abstractC10924;
        AbstractC6462 abstractC6462M25941;
        AbstractC6462 abstractC6462M19482;
        boolean z3;
        C8200 c8200;
        C16852 c16852;
        AbstractC6462 abstractC6462Mo7201;
        boolean z4;
        C18258 c18258Mo6320;
        AbstractC6664 c14040;
        C18258 c18258M18547;
        AbstractC6462 abstractC6465;
        C8200 c8201 = this.f31178;
        C23663 c23663 = this.f31180;
        boolean zMo14812 = this.f31162.f77965.mo14812();
        C23623 c23623 = this.f31202;
        C8374 c8374 = this.f31200;
        if (zMo14812 || (this.f31162.f77965.m14777(EnumC11353.NONE) && this.f31162.f77965 != AbstractC6462.f16699)) {
            if (this.f31162.f77965.m14777(EnumC11353.NONE) && ((abstractC7783 = ((C10545) this.f31160.f8849).f29209) == null || !abstractC7783.f20406.mo14812())) {
                c23623.m9352(c11142, C8300.f22171);
            }
            C13956 c13956M19475 = c8374.m19475(this.f31162.f77965);
            c11142.f18925 = c13956M19475;
            this.f31172 = c13956M19475;
            return;
        }
        C4036 c4036 = this.f31160;
        C4036 c4036M8087 = c4036.m8087(c11142, c4036.f8849);
        try {
            AbstractC14355 abstractC14355 = c11142.f30891;
            C4848 c48410 = c11142.f30893;
            EnumC12909 enumC129012 = c11142.f30886;
            AbstractC6462 abstractC6462M25939 = m25939(abstractC14355, this.f31160, m25964(c11142));
            EnumC12909 enumC129013 = EnumC12909.NEW;
            C16852 c16853 = this.f31163;
            if (enumC129012 == enumC129013) {
                abstractC6462M25939 = c16853.m38359(c11142.f30891, abstractC6462M25939);
                if (!abstractC6462M25939.mo14812() && abstractC6462M25939.mo14784() && c48410 != null) {
                    AbstractC14355 abstractC14356 = c11142.f30891;
                    abstractC14356.getClass();
                    EnumC10306 enumC10306M51426 = C23047.m51426(enumC129012);
                    C14040 c14041 = C8300.f21997;
                    enumC129013 = enumC129013;
                    enumC129012 = enumC129012;
                    c23623.m9352(abstractC14356, new C14040("compiler", "invalid.mref", enumC10306M51426, C13665.f38486));
                    abstractC6462M19475 = c8374.m19475(abstractC6462M25939);
                    c = 1;
                }
                if (abstractC6462M19475.mo14812()) {
                    c11142.f18925 = abstractC6462M19475;
                    this.f31172 = abstractC6462M19475;
                    return;
                }
                if (C9268.m21412(c11142.f30891, c8201)) {
                    c16853.m38298((AbstractC7257) c11142.f30891, this.f31160, false);
                } else {
                    abstractC7783M21438 = C9268.m21438(c11142.f30891);
                    C10545 c10545 = (C10545) c4036M8087.f8849;
                    if (abstractC7783M21438 == null && abstractC7783M21438.f20408 == c8201.f21756) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c10545.f29212 = z;
                }
                c4848M10283 = C4848.m10283();
                if (c48410 != null) {
                    c4848M10283 = m25932(c48410, c4036M8087);
                    c16853.m38284(c48410, c4848M10283);
                }
                c4848 = c4848M10283;
                enumC15511 = this.f31162.f77961.mo6101().f23845;
                enumC15512 = EnumC15511.CHECK;
                if (enumC15511 == enumC15512 || !m25960(this.f31162.f77965)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C8533 c8533M25947 = m25947(c11142, this.f31162, (C4848) null);
                abstractC6462 = c8533M25947.f22895;
                abstractC6463 = c8533M25947.f22894;
                C24626 c24626 = this.f31162;
                abstractC6464 = abstractC6462M19475;
                enumC12909 = enumC129013;
                m25911(c4036M8087, c11142, c24626.f77965, abstractC6463, abstractC6462, c24626.f77961);
                c4848Mo14797 = abstractC6463.mo14797();
                c21496 = c23663.f75311;
                if (this.f31162.f77961.mo6098().m4264(c4848Mo14797)) {
                    c21496 = new C21496(c23663, this.f31162.f77961.mo6098());
                }
                try {
                    AbstractC11853 abstractC11853 = c21496;
                    c4848M4265 = this.f31162.f77961.mo6098().m4265();
                    try {
                        enumC129010 = enumC129012;
                        try {
                            C24293 c24293M52665 = this.f31180.m52665(c4036M8087, c11142, c11142.f30891.f18925, c11142.f30890, c4848Mo14797, c4848, c8533M25947.f22894, abstractC11853, this.f31162.f77961.mo6098(), c23663.f75314);
                            try {
                                this.f31162.f77961.mo6098().m4261(c4848M4265);
                                abstractC7784 = (AbstractC7783) c24293M52665.f76952;
                                abstractC10923 = (AbstractC10923) c24293M52665.f76953;
                                enumC3600 = abstractC7784.f20405;
                                if (enumC3600 == EnumC3600.f7343) {
                                    if (abstractC7784.m17994()) {
                                        abstractC7783Mo9143 = abstractC7784.mo9143();
                                    } else {
                                        abstractC7783Mo9143 = abstractC7784;
                                    }
                                    c11142.f30889 = abstractC7783Mo9143;
                                    c11142.f30888 = abstractC10923.mo11860(abstractC7783Mo9143);
                                    c11142.f30892 = c23663.m52670(c4036M8087, (AbstractC21195) c11142.f30889.m17990(), false);
                                    if (abstractC6463.mo14787() == AbstractC6462.f16699) {
                                        c11142.f18925 = abstractC6462;
                                        this.f31172 = abstractC6462;
                                        return;
                                    }
                                    if (((C10545) this.f31160.f8849).f29199.f25979) {
                                        enumC129011 = enumC129010;
                                    } else {
                                        enumC129011 = enumC129010;
                                        if (enumC129011 == enumC12909 && (abstractC6462Mo7201 = abstractC6464.mo7201()) != null && abstractC6462Mo7201.m14777(EnumC11353.CLASS)) {
                                            c23663.m52642((InterfaceC5323) c11142, this.f31160, abstractC6464, false);
                                        }
                                    }
                                    if (this.f31162.f77961.mo6101().f23845 == enumC15512) {
                                        if (enumC129011 == EnumC12909.INVOKE) {
                                            c8200 = c8201;
                                            if (!C9268.m21412(c11142.f30891, c8200) && c11142.f30888.m49332() && abstractC10923.f6711.mo14784()) {
                                                abstractC10923 = abstractC10923;
                                                c16852 = c16853;
                                                c16852.m38296(c11142.f30891, c4036M8087);
                                            }
                                            if (!c11142.f30889.mo17483() && C9268.m21412(c11142.f30891, c8200) && abstractC6464.mo14802().m10293()) {
                                                AbstractC14355 abstractC14357 = c11142.f30891;
                                                abstractC14357.getClass();
                                                EnumC10306 enumC10306M51427 = C23047.m51426(enumC129011);
                                                C14040 c14042 = C8300.f21997;
                                                Object[] objArr = new Object[2];
                                                objArr[0] = enumC10306M51427;
                                                objArr[c] = C13665.f38490;
                                                c23623.m9352(abstractC14357, new C14040("compiler", "invalid.mref", objArr));
                                                C13956 c13956M19476 = c8374.m19475(abstractC6462);
                                                c11142.f18925 = c13956M19476;
                                                this.f31172 = c13956M19476;
                                                return;
                                            }
                                            if (!abstractC7784.mo17483() && c11142.f30888 == EnumC21871.f68798) {
                                                c23663.m52666(c11142, c11142.f30889);
                                            }
                                            if (z2) {
                                                c16852.m38316((AbstractC14355) c11142, true);
                                            }
                                        } else {
                                            c8200 = c8201;
                                        }
                                        c16852 = c16853;
                                        if (!c11142.f30889.mo17483()) {
                                        }
                                        if (!abstractC7784.mo17483()) {
                                            c23663.m52666(c11142, c11142.f30889);
                                        }
                                        if (z2) {
                                            c16852.m38316((AbstractC14355) c11142, true);
                                        }
                                    } else {
                                        abstractC10923 = abstractC10923;
                                    }
                                    C24626 c24627 = this.f31162;
                                    if (abstractC6463.mo14787().m14777(EnumC11353.VOID)) {
                                        abstractC6462Mo14787 = AbstractC6462.f16700;
                                    } else {
                                        abstractC6462Mo14787 = abstractC6463.mo14787();
                                    }
                                    if (c11142.f30888.m49332()) {
                                        c4849 = c4848Mo14797.f11035;
                                    } else {
                                        c4849 = c4848Mo14797;
                                    }
                                    c24626Mo40741 = c24627.mo40741(m25934(abstractC6462Mo14787, c4849, c4848), new C9243(this, this.f31162.f77961), EnumC23995.f76206);
                                    abstractC10924 = abstractC10923;
                                    abstractC6462M25941 = m25941(c11142, abstractC10924.f6711, abstractC7784, c4036M8087, c24626Mo40741);
                                    if (c11142.f30888.m49332() && ((AbstractC6462) c4848Mo14797.f11034).m14792(this.f31162.f77961.mo6098().f4594) && !c8374.m19486(this.f31162.f77961.mo6098().m4259((AbstractC6462) c4848Mo14797.f11034), abstractC6464, true)) {
                                        C1446.m31702("Can't get here");
                                        throw null;
                                    }
                                    if (abstractC6462M25941.mo14812()) {
                                        abstractC6462M19482 = abstractC6462M25941;
                                    } else {
                                        abstractC6462M19482 = c8374.m19482(abstractC6462M25941, m25944(abstractC7784, abstractC10924.f6711, c11142.f30890, c24626Mo40741.f77965.mo14797(), abstractC6462M25941.mo14787()));
                                    }
                                    if (this.f31162.f77961.mo6101().f23845 == EnumC15511.SPECULATIVE) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c11142.f18925 = abstractC6462;
                                    m25955(c11142, abstractC6463, abstractC6462M19482, this.f31162.f77961, z3);
                                    if (!z3) {
                                        m25923(c11142, c4036M8087, this.f31162.f77961.mo6098(), C4848.m10282((Object[]) new AbstractC6462[]{abstractC6463, abstractC6462}));
                                    }
                                    this.f31172 = m25943(c11142, abstractC6462, C17010.f50311, this.f31162);
                                    return;
                                }
                                switch (C3207.f6220[enumC3600.ordinal()]) {
                                    case 1:
                                    case 2:
                                        z4 = false;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        z4 = true;
                                        break;
                                    default:
                                        C1446.m31702("unexpected result kind " + abstractC7784.f20405);
                                        throw null;
                                }
                                c18258Mo6320 = ((AbstractC7570) abstractC7784.mo9143()).mo6320(EnumC14710.FRAGMENT, c11142, abstractC6464.f16705, abstractC6464, c11142.f30890, c4848Mo14797, c4848);
                                C8005 c8005 = this.f31159;
                                C16051 c16051M9345 = c23623.m9345();
                                if (z4) {
                                    EnumC10306 enumC10306M51428 = C23047.m51426(enumC129010);
                                    C13370 c13370 = C13665.f38450;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = enumC10306M51428;
                                    objArr2[c] = c18258Mo6320;
                                    c14040 = new C13370("compiler", "invalid.mref", objArr2);
                                } else {
                                    EnumC10306 enumC10306M51429 = C23047.m51426(enumC129010);
                                    C14040 c14043 = C8300.f21997;
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = enumC10306M51429;
                                    objArr3[c] = c18258Mo6320;
                                    c14040 = new C14040("compiler", "invalid.mref", objArr3);
                                }
                                c8005.getClass();
                                c11143 = c11142;
                                try {
                                    c18258M18547 = c8005.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051M9345, c11142, c14040);
                                    if (z4) {
                                        abstractC6465 = abstractC6462;
                                        if (abstractC6465 == AbstractC6462.f16699) {
                                            c11143.f18925 = abstractC6465;
                                            this.f31172 = abstractC6465;
                                            return;
                                        }
                                    } else {
                                        abstractC6465 = abstractC6462;
                                    }
                                    if (z4) {
                                        this.f31162.f77961.mo3480(c11143, c18258M18547);
                                    } else {
                                        c23623.mo9356(c18258M18547);
                                    }
                                    C13956 c13956M19477 = c8374.m19475(abstractC6465);
                                    c11143.f18925 = c13956M19477;
                                    this.f31172 = c13956M19477;
                                    return;
                                } catch (C8194 e) {
                                    e = e;
                                }
                            } catch (C8194 e2) {
                                e = e2;
                                c11143 = c11142;
                            }
                        } catch (Throwable th) {
                            th = th;
                            this.f31162.f77961.mo6098().m4261(c4848M4265);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (C8194 e3) {
                    e = e3;
                    r12 = c23623;
                    r14 = c23663;
                }
            }
            abstractC6462M19475 = abstractC6462M25939;
            c = 1;
            if (abstractC6462M19475.mo14812()) {
                c11142.f18925 = abstractC6462M19475;
                this.f31172 = abstractC6462M19475;
                return;
            }
            if (C9268.m21412(c11142.f30891, c8201)) {
                c16853.m38298((AbstractC7257) c11142.f30891, this.f31160, false);
            } else {
                abstractC7783M21438 = C9268.m21438(c11142.f30891);
                C10545 c10546 = (C10545) c4036M8087.f8849;
                if (abstractC7783M21438 == null) {
                    z = false;
                } else {
                    z = false;
                }
                c10546.f29212 = z;
            }
            c4848M10283 = C4848.m10283();
            if (c48410 != null) {
                c4848M10283 = m25932(c48410, c4036M8087);
                c16853.m38284(c48410, c4848M10283);
            }
            c4848 = c4848M10283;
            enumC15511 = this.f31162.f77961.mo6101().f23845;
            enumC15512 = EnumC15511.CHECK;
            if (enumC15511 == enumC15512) {
                z2 = false;
            } else {
                z2 = false;
            }
            C8533 c8533M25948 = m25947(c11142, this.f31162, (C4848) null);
            abstractC6462 = c8533M25948.f22895;
            abstractC6463 = c8533M25948.f22894;
            C24626 c24628 = this.f31162;
            abstractC6464 = abstractC6462M19475;
            enumC12909 = enumC129013;
            m25911(c4036M8087, c11142, c24628.f77965, abstractC6463, abstractC6462, c24628.f77961);
            c4848Mo14797 = abstractC6463.mo14797();
            c21496 = c23663.f75311;
            if (this.f31162.f77961.mo6098().m4264(c4848Mo14797)) {
                c21496 = new C21496(c23663, this.f31162.f77961.mo6098());
            }
            AbstractC11853 abstractC11854 = c21496;
            c4848M4265 = this.f31162.f77961.mo6098().m4265();
            enumC129010 = enumC129012;
            C24293 c24293M52666 = this.f31180.m52665(c4036M8087, c11142, c11142.f30891.f18925, c11142.f30890, c4848Mo14797, c4848, c8533M25948.f22894, abstractC11854, this.f31162.f77961.mo6098(), c23663.f75314);
            this.f31162.f77961.mo6098().m4261(c4848M4265);
            abstractC7784 = (AbstractC7783) c24293M52666.f76952;
            abstractC10923 = (AbstractC10923) c24293M52666.f76953;
            enumC3600 = abstractC7784.f20405;
            if (enumC3600 == EnumC3600.f7343) {
                switch (C3207.f6220[enumC3600.ordinal()]) {
                    case 1:
                    case 2:
                        z4 = false;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        z4 = true;
                        break;
                    default:
                        C1446.m31702("unexpected result kind " + abstractC7784.f20405);
                        throw null;
                }
                c18258Mo6320 = ((AbstractC7570) abstractC7784.mo9143()).mo6320(EnumC14710.FRAGMENT, c11142, abstractC6464.f16705, abstractC6464, c11142.f30890, c4848Mo14797, c4848);
                C8005 c8006 = this.f31159;
                C16051 c16051M9346 = c23623.m9345();
                if (z4) {
                    EnumC10306 enumC10306M514210 = C23047.m51426(enumC129010);
                    C13370 c13371 = C13665.f38450;
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = enumC10306M514210;
                    objArr4[c] = c18258Mo6320;
                    c14040 = new C13370("compiler", "invalid.mref", objArr4);
                } else {
                    EnumC10306 enumC10306M514211 = C23047.m51426(enumC129010);
                    C14040 c14044 = C8300.f21997;
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = enumC10306M514211;
                    objArr5[c] = c18258Mo6320;
                    c14040 = new C14040("compiler", "invalid.mref", objArr5);
                }
                c8006.getClass();
                c11143 = c11142;
                c18258M18547 = c8006.m18547((EnumC21706) null, EnumSet.noneOf(EnumC21417.class), c16051M9346, c11142, c14040);
                if (z4) {
                    abstractC6465 = abstractC6462;
                    if (abstractC6465 == AbstractC6462.f16699) {
                        c11143.f18925 = abstractC6465;
                        this.f31172 = abstractC6465;
                        return;
                    }
                } else {
                    abstractC6465 = abstractC6462;
                }
                if (z4) {
                    this.f31162.f77961.mo3480(c11143, c18258M18547);
                } else {
                    c23623.mo9356(c18258M18547);
                }
                C13956 c13956M19478 = c8374.m19475(abstractC6465);
                c11143.f18925 = c13956M19478;
                this.f31172 = c13956M19478;
                return;
            }
            if (abstractC7784.m17994()) {
                abstractC7783Mo9143 = abstractC7784.mo9143();
            } else {
                abstractC7783Mo9143 = abstractC7784;
            }
            c11142.f30889 = abstractC7783Mo9143;
            c11142.f30888 = abstractC10923.mo11860(abstractC7783Mo9143);
            c11142.f30892 = c23663.m52670(c4036M8087, (AbstractC21195) c11142.f30889.m17990(), false);
            if (abstractC6463.mo14787() == AbstractC6462.f16699) {
                c11142.f18925 = abstractC6462;
                this.f31172 = abstractC6462;
                return;
            }
            if (((C10545) this.f31160.f8849).f29199.f25979) {
                enumC129011 = enumC129010;
                if (enumC129011 == enumC12909) {
                    c23663.m52642((InterfaceC5323) c11142, this.f31160, abstractC6464, false);
                }
            } else {
                enumC129011 = enumC129010;
            }
            if (this.f31162.f77961.mo6101().f23845 == enumC15512) {
                if (enumC129011 == EnumC12909.INVOKE) {
                    c8200 = c8201;
                    if (!C9268.m21412(c11142.f30891, c8200)) {
                    }
                } else {
                    c8200 = c8201;
                }
                c16852 = c16853;
                if (!c11142.f30889.mo17483()) {
                }
                if (!abstractC7784.mo17483()) {
                    c23663.m52666(c11142, c11142.f30889);
                }
                if (z2) {
                    c16852.m38316((AbstractC14355) c11142, true);
                }
            } else {
                abstractC10923 = abstractC10923;
            }
            C24626 c24629 = this.f31162;
            if (abstractC6463.mo14787().m14777(EnumC11353.VOID)) {
                abstractC6462Mo14787 = AbstractC6462.f16700;
            } else {
                abstractC6462Mo14787 = abstractC6463.mo14787();
            }
            if (c11142.f30888.m49332()) {
                c4849 = c4848Mo14797.f11035;
            } else {
                c4849 = c4848Mo14797;
            }
            c24626Mo40741 = c24629.mo40741(m25934(abstractC6462Mo14787, c4849, c4848), new C9243(this, this.f31162.f77961), EnumC23995.f76206);
            abstractC10924 = abstractC10923;
            abstractC6462M25941 = m25941(c11142, abstractC10924.f6711, abstractC7784, c4036M8087, c24626Mo40741);
            if (c11142.f30888.m49332()) {
                C1446.m31702("Can't get here");
                throw null;
            }
            if (abstractC6462M25941.mo14812()) {
                abstractC6462M19482 = c8374.m19482(abstractC6462M25941, m25944(abstractC7784, abstractC10924.f6711, c11142.f30890, c24626Mo40741.f77965.mo14797(), abstractC6462M25941.mo14787()));
            } else {
                abstractC6462M19482 = abstractC6462M25941;
            }
            if (this.f31162.f77961.mo6101().f23845 == EnumC15511.SPECULATIVE) {
                z3 = true;
            } else {
                z3 = false;
            }
            c11142.f18925 = abstractC6462;
            m25955(c11142, abstractC6463, abstractC6462M19482, this.f31162.f77961, z3);
            if (!z3) {
                m25923(c11142, c4036M8087, this.f31162.f77961.mo6098(), C4848.m10282((Object[]) new AbstractC6462[]{abstractC6463, abstractC6462}));
            }
            this.f31172 = m25943(c11142, abstractC6462, C17010.f50311, this.f31162);
            return;
            r14 = c8374;
            r12 = c11143;
            this.f31162.f77961.mo3480(r12, e.m18981());
            C13956 c13956M19479 = r14.m19475(this.f31162.f77965);
            r12.f18925 = c13956M19479;
            this.f31172 = c13956M19479;
        } catch (C8194 e4) {
            e = e4;
            r14 = c8374;
            r12 = c11142;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24626 m25964(C11142 c11142) {
        return new C24626(this, c11142.f30886 == EnumC12909.INVOKE ? C17010.f50308 : C17010.f50319, AbstractC6462.f16700);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX INFO: renamed from: ֫ */
    public final void m25955(final C11142 c11142, AbstractC6462 abstractC6462, final AbstractC6462 abstractC6463, InterfaceC6125 interfaceC6125, boolean z) {
        AbstractC6462 abstractC6462Mo14787;
        C2733 c2733Mo6098 = interfaceC6125.mo6098();
        AbstractC6462 abstractC6462M4259 = c2733Mo6098.m4259(abstractC6462.mo14787());
        if (C3207.f6219[c11142.f30886.ordinal()] == 1 && !c11142.f30891.f18925.mo14784()) {
            abstractC6462Mo14787 = c11142.f30891.f18925;
        } else {
            abstractC6462Mo14787 = abstractC6463.mo14787();
        }
        EnumC11353 enumC11353 = EnumC11353.VOID;
        AbstractC6462 abstractC6464 = null;
        AbstractC6462 abstractC6465 = abstractC6462M4259.m14777(enumC11353) ? null : abstractC6462Mo14787;
        if (abstractC6462M4259.m14777(enumC11353) || abstractC6462Mo14787.m14777(enumC11353)) {
            abstractC6464 = abstractC6465;
        } else if (!abstractC6462Mo14787.mo14812()) {
            if (!((C24900) this.f31163.f49905).mo6100(interfaceC6125.mo6098().m4259(abstractC6462Mo14787), interfaceC6125.mo6098().m4259(abstractC6462M4259), interfaceC6125.mo6099(c11142, abstractC6462Mo14787, abstractC6462M4259))) {
                abstractC6464 = abstractC6465;
            }
        }
        if (abstractC6464 == null) {
            if (abstractC6463.m14792(c2733Mo6098.f4594)) {
                c2733Mo6098.m4255(C4848.m10276of((Object) abstractC6463), new InterfaceC5930() { // from class: l.֨᩶֨
                    @Override // p067l.InterfaceC5930
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo6905(C2733 c2733) {
                        c11142.f30885 = c2733.m4250(abstractC6463);
                    }
                });
            } else {
                c11142.f30885 = abstractC6463;
            }
        } else {
            interfaceC6125.mo3480(c11142, this.f31159.m18543(new C13370("compiler", "incompatible.ret.type.in.mref", C13665.m31063(abstractC6462Mo14787, abstractC6462.mo14787()))));
        }
        if (z || m25959(abstractC6463.mo14794(), abstractC6462.mo14794(), c2733Mo6098)) {
            return;
        }
        C4848 c4848Mo14794 = abstractC6463.mo14794();
        C14040 c14040 = C8300.f21997;
        this.f31202.m9352(c11142, new C14040("compiler", "incompatible.thrown.types.in.mref", c4848Mo14794));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25959(C4848 c4848, C4848 c4849, C2733 c2733) {
        C4848 c48410 = (C4848) C7480.stream(c4849).filter(new C8572(0, c2733)).collect(C4848.m10284());
        C4848 c4848M10288 = c4849.m10288(c48410);
        C4848<AbstractC6462> c48411 = (C4848) C7480.stream(c4848).filter(new Predicate() { // from class: l.ۢۙ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m26157or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !this.f31346.f31163.m38345((AbstractC6462) obj);
            }
        }).collect(C4848.m10284());
        C20271 c20271 = new C20271();
        for (AbstractC6462 abstractC6462 : c48411) {
            Iterator it = c4848M10288.iterator();
            do {
                if (!it.hasNext()) {
                    c20271.m45777(abstractC6462);
                    break;
                }
            } while (!this.f31200.m19486(abstractC6462, (AbstractC6462) it.next(), true));
        }
        if (c48410.isEmpty() && !c20271.isEmpty()) {
            return false;
        }
        C4848 c4848M4258 = c2733.m4258(c48410);
        C21230.forEach(c20271, new C10584(0, this, c4848M4258));
        C7480.stream(c4848M4258).filter(new C17288()).forEach(new C4549());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m25911(final C4036 c4036, final AbstractC24413 abstractC24413, final AbstractC6462 abstractC6462, final AbstractC6462 abstractC6463, final AbstractC6462 abstractC6464, final InterfaceC6125 interfaceC6125) {
        if (abstractC6463.m14792(interfaceC6125.mo6098().f4594)) {
            interfaceC6125.mo6098().m4255(C4848.m10277of((Object) abstractC6462, (Object) abstractC6463), new InterfaceC5930() { // from class: l.ۙ᩶֨
                @Override // p067l.InterfaceC5930
                /* JADX INFO: renamed from: ֫ */
                public final void mo6905(C2733 c2733) {
                    AbstractC6462 abstractC6465 = abstractC6464;
                    this.f18212.m25911(c4036, abstractC24413, abstractC6462, c2733.m4250(abstractC6463), c2733.m4250(abstractC6465), interfaceC6125);
                }
            });
            return;
        }
        if (abstractC6462.m14777(EnumC11353.CLASS)) {
            abstractC24413.f77303 = abstractC6464;
        }
        if (interfaceC6125.mo6101().f23845 != EnumC15511.CHECK || abstractC6462 == AbstractC6462.f16699) {
            return;
        }
        try {
            C15828 c15828M19435 = this.f31200.m19435(c4036, this.f31178.f21725, abstractC24413.f77303, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            if (c15828M19435 != null) {
                this.f31163.m38301(c4036.f8850, c15828M19435, c15828M19435);
                try {
                    c15828M19435.f20409 |= 512;
                    this.f31200.m19478(c15828M19435.f20406);
                } catch (C8194 unused) {
                    this.f31162.f77961.mo3480(abstractC24413, this.f31159.m18543(C13665.m31065(abstractC24413.f77303)));
                }
            }
        } catch (C8194 e) {
            this.f31162.f77961.mo3480(c4036.f8850, e.m18981());
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(C16505 c16505) {
        AbstractC6462 abstractC6462M25939 = m25939(c16505.f48507, this.f31160, this.f31162);
        C24626 c24626 = this.f31162;
        this.f31172 = m25943(c16505, abstractC6462M25939, c24626.f77963, c24626);
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c16505);
        if (abstractC7783M21438 == null || !abstractC7783M21438.f20405.m6623(C17010.f50312) || abstractC7783M21438.f20405 == EnumC3600.f7353) {
            return;
        }
        this.f31202.m9352(c16505, C8300.f22163);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        AbstractC14355 abstractC14355 = c22403.f70670;
        C4036 c4036 = this.f31160;
        AbstractC6462 abstractC6462M25939 = m25939(abstractC14355, c4036.m8087(c22403, c4036.f8849), this.f31164);
        AbstractC6462 abstractC6462M19463 = this.f31200.m19463(abstractC6462M25939);
        m25938((AbstractC7257) c22403.f70671, this.f31160, abstractC6462M25939);
        this.f31172 = m25943(c22403, abstractC6462M19463, C17010.f50311, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        AbstractC6462 abstractC6462M25939 = m25939(c11674.f32571, this.f31160, this.f31164);
        AbstractC6462 abstractC6462M259310 = m25939(c11674.f32570, this.f31160, this.f31177);
        EnumC19998 enumC19998M45374 = c11674.mo3383().m45374();
        C12004 c12004 = this.f31169;
        C3088 c3088M27496 = c12004.m27496(c11674, enumC19998M45374, abstractC6462M25939, abstractC6462M259310);
        c11674.f5602 = c3088M27496;
        if (c3088M27496 != c12004.f33479 && !abstractC6462M25939.mo14812() && !abstractC6462M259310.mo14812()) {
            AbstractC14355 abstractC14355 = c11674.f32570;
            abstractC14355.getClass();
            C16852 c16852 = this.f31163;
            c16852.m38286(abstractC14355, c3088M27496, abstractC6462M259310);
            AbstractC14355 abstractC14356 = c11674.f32570;
            abstractC14356.getClass();
            c16852.m38266(abstractC14356, c3088M27496.f20406.mo14787(), abstractC6462M25939);
        }
        this.f31172 = m25943(c11674, abstractC6462M25939, C17010.f50311, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        AbstractC6462 abstractC6462M38363;
        AbstractC6462 abstractC6462Mo14787;
        C6795 c6795;
        AbstractC6462 abstractC6462M15514;
        if (c8598.mo3383().m45371()) {
            abstractC6462M38363 = m25939(c8598.f23105, this.f31160, this.f31164);
        } else {
            AbstractC14355 abstractC14355 = c8598.f23105;
            abstractC14355.getClass();
            abstractC6462M38363 = this.f31163.m38363(abstractC14355, m25939(c8598.f23105, this.f31160, this.f31177));
        }
        EnumC19998 enumC19998Mo3383 = c8598.mo3383();
        C12004 c12004 = this.f31169;
        C3088 c3088M27497 = c12004.m27497(c8598, enumC19998Mo3383, abstractC6462M38363);
        c8598.f5602 = c3088M27497;
        AbstractC6462 abstractC6462M19475 = this.f31200.m19475(c8598.f18925);
        if (c3088M27497 != c12004.f33479 && !abstractC6462M38363.mo14812()) {
            if (c8598.mo3383().m45371()) {
                abstractC6462Mo14787 = c8598.f23105.f18925;
            } else {
                abstractC6462Mo14787 = c3088M27497.f20406.mo14787();
            }
            abstractC6462M19475 = abstractC6462Mo14787;
            int i = c3088M27497.f5586;
            if (abstractC6462M38363.mo14779() != null && (abstractC6462M15514 = (c6795 = this.f31188).m15514(i, abstractC6462M38363)) != null) {
                abstractC6462M19475 = c6795.m15516(abstractC6462M15514, abstractC6462M19475);
            }
        }
        this.f31172 = m25943(c8598, abstractC6462M19475, C17010.f50311, this.f31162);
        C9755 c9755 = this.f31167;
        this.f31165.getClass();
        if (c9755 != C4132.f9117 && c8598.m16617(EnumC19998.f60712)) {
            c9755 = new C9755(c9755.f26938, c9755.f26939, false);
        }
        this.f31167 = c9755;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        C4848 c4848M10283;
        C6795 c6795;
        AbstractC6462 abstractC6462M15515;
        AbstractC14355 abstractC14355 = c11003.f30470;
        abstractC14355.getClass();
        AbstractC14355 abstractC14356 = c11003.f30470;
        C4036 c4036 = this.f31160;
        C24626 c24626 = this.f31177;
        AbstractC6462 abstractC6462M25939 = m25939(abstractC14356, c4036, c24626);
        C16852 c16852 = this.f31163;
        AbstractC6462 abstractC6462M38363 = c16852.m38363(abstractC14355, abstractC6462M25939);
        C9755 c9755 = this.f31167;
        int i = C3207.f6222[c11003.mo3383().ordinal()];
        if (i == 17) {
            c4848M10283 = c9755.f26939;
        } else if (i == 18) {
            c4848M10283 = c9755.f26938;
        } else {
            c4848M10283 = C4848.m10283();
        }
        C4036 c4037 = this.f31160;
        C4036 c4036M25905 = m25905(c4037, c4037.f8850, c4848M10283);
        Object obj = c4036M25905.f8849;
        try {
            AbstractC14355 abstractC14357 = c11003.f30469;
            abstractC14357.getClass();
            AbstractC6462 abstractC6462M38364 = c16852.m38363(abstractC14357, m25939(c11003.f30469, c4036M25905, c24626));
            ((C10545) obj).f29201.mo28410();
            this.f31167 = this.f31165.m8369(c11003, c9755, this.f31167);
            EnumC19998 enumC19998Mo3383 = c11003.mo3383();
            C12004 c12004 = this.f31169;
            C3088 c3088M27496 = c12004.m27496(c11003, enumC19998Mo3383, abstractC6462M38363, abstractC6462M38364);
            c11003.f5602 = c3088M27496;
            AbstractC6462 abstractC6462 = c11003.f18925;
            C8374 c8374 = this.f31200;
            AbstractC6462 abstractC6462M19475 = c8374.m19475(abstractC6462);
            if (c3088M27496 != c12004.f33479 && !abstractC6462M38363.mo14812() && !abstractC6462M38364.mo14812()) {
                AbstractC6462 abstractC6462Mo14787 = c3088M27496.f20406.mo14787();
                int i2 = c3088M27496.f5586;
                if (abstractC6462M38363.mo14779() != null && abstractC6462M38364.mo14779() != null && (abstractC6462M15515 = (c6795 = this.f31188).m15515(i2, abstractC6462M38363, abstractC6462M38364)) != null) {
                    abstractC6462Mo14787 = c6795.m15516(abstractC6462M15515, abstractC6462Mo14787);
                }
                if ((i2 == 165 || i2 == 166) && !c8374.m19485(abstractC6462M38363, abstractC6462M38364, new C3686(c11003))) {
                    C14040 c14040 = C8300.f21997;
                    this.f31202.m9352(c11003, new C14040("compiler", "incomparable.types", abstractC6462M38363, abstractC6462M38364));
                }
                AbstractC14355 abstractC14358 = c11003.f30469;
                abstractC14358.getClass();
                c16852.m38286(abstractC14358, c3088M27496, abstractC6462M38364);
                abstractC6462M19475 = abstractC6462Mo14787;
            }
            this.f31172 = m25943(c11003, abstractC6462M19475, C17010.f50311, this.f31162);
        } catch (Throwable th) {
            ((C10545) obj).f29201.mo28410();
            throw th;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        C24626 c24626;
        AbstractC6462 abstractC6462M25963 = m25963(c19327.f57709, this.f31160, AbstractC6462.f16700);
        AbstractC7257 abstractC7257 = c19327.f57709;
        C4036 c4036 = this.f31160;
        C16852 c16852 = this.f31163;
        boolean z = false;
        c16852.m38298(abstractC7257, c4036, false);
        C4036 c4037 = this.f31160;
        C4036 c4036M8087 = c4037.m8087(c19327, c4037.f8849);
        AbstractC14355 abstractC14355M21424 = C9268.m21424(c19327.f57710);
        if (this.f31190 && (abstractC14355M21424.m16617(EnumC19998.f60747) || abstractC14355M21424.m16617(EnumC19998.f60748))) {
            z = true;
        }
        if (z) {
            c24626 = new C24626(this, C17010.f50311, abstractC6462M25963, new C20643(this, this.f31162.f77961));
        } else {
            c24626 = this.f31177;
        }
        AbstractC6462 abstractC6462M25939 = m25939(c19327.f57710, c4036M8087, c24626);
        if (!z) {
            AbstractC14355 abstractC14355 = c19327.f57710;
            abstractC14355.getClass();
            abstractC6462M25963 = c16852.m38266(abstractC14355, abstractC6462M25939, abstractC6462M25963);
        }
        if (abstractC6462M25939.mo14779() != null) {
            abstractC6462M25963 = this.f31188.m15516(abstractC6462M25939, abstractC6462M25963);
        }
        this.f31172 = m25943(c19327, this.f31200.m19463(abstractC6462M25963), C17010.f50311, this.f31162);
        if (z) {
            return;
        }
        c16852.m38321(c19327);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        AbstractC6462 abstractC6462M19475;
        AbstractC7257 abstractC7257;
        InterfaceC5323 interfaceC5323 = c17846.f53242;
        interfaceC5323.getClass();
        AbstractC14355 abstractC14355 = c17846.f53242;
        C4036 c4036 = this.f31160;
        C24626 c24626 = this.f31177;
        AbstractC6462 abstractC6462M25939 = m25939(abstractC14355, c4036, c24626);
        C16852 c16852 = this.f31163;
        AbstractC6462 abstractC6462M38330 = c16852.m38330(interfaceC5323, abstractC6462M25939);
        EnumC19998 enumC19998Mo3383 = c17846.f53243.mo3383();
        EnumC19998 enumC19998 = EnumC19998.f60728;
        C23623 c23623 = this.f31202;
        boolean zM25925 = false;
        C8374 c8374 = this.f31200;
        if (enumC19998Mo3383 != enumC19998 && c17846.f53243.mo3383() != EnumC19998.f60738) {
            abstractC6462M19475 = m25963(c17846.f53243, this.f31160, AbstractC6462.f16700);
            abstractC7257 = c17846.f53243;
            c16852.m38298(abstractC7257, this.f31160, false);
        } else {
            m25939(c17846.f53243, this.f31160, c24626);
            abstractC6462M19475 = c17846.f53243.f18925;
            if (c8374.m19486(abstractC6462M38330, abstractC6462M19475, true) && !abstractC6462M38330.mo14812() && !abstractC6462M19475.mo14812()) {
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c17846, new C14040("compiler", "instanceof.pattern.no.subtype", abstractC6462M38330, abstractC6462M19475));
            }
            abstractC7257 = C9268.m21408((AbstractC23212) c17846.f53243).f52887.f31437;
        }
        if (!abstractC6462M19475.m14777(EnumC11353.TYPEVAR)) {
            abstractC7257.getClass();
            abstractC6462M19475 = c16852.m38265(abstractC7257, abstractC6462M19475);
        }
        if (!abstractC6462M19475.mo14812() && !c8374.m19417(abstractC6462M19475)) {
            if (this.f31192) {
                AbstractC14355 abstractC14356 = c17846.f53242;
                abstractC14356.getClass();
                zM25925 = m25925(abstractC14356, abstractC6462M38330, abstractC6462M19475);
            } else {
                c23623.m9359(EnumC21417.SOURCE_LEVEL, c17846, EnumC12477.f34954.m28724(this.f31191));
                this.f31192 = true;
            }
            if (!zM25925) {
                abstractC6462M19475 = c8374.m19475(abstractC6462M19475);
            }
        }
        InterfaceC5323 interfaceC5324 = c17846.f53242;
        interfaceC5324.getClass();
        c16852.m38266(interfaceC5324, abstractC6462M38330, abstractC6462M19475);
        this.f31172 = m25943(c17846, this.f31193.f69151, C17010.f50311, this.f31162);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m25925(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C3686 c3686 = new C3686();
        if (!this.f31200.m19485(abstractC6462, abstractC6463, c3686)) {
            ((C24900) this.f31163.f49905).mo3480(interfaceC5323, this.f31159.m18543(C13665.m31063(abstractC6462, abstractC6463)));
            return false;
        }
        if (!c3686.m7108(EnumC21706.UNCHECKED)) {
            return true;
        }
        C14040 c14040 = C8300.f21997;
        this.f31202.m9352(interfaceC5323, new C14040("compiler", "instanceof.reifiable.not.safe", abstractC6462, abstractC6463));
        return false;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        C17010 c17010 = C17010.f50319;
        C24626 c24626 = this.f31162;
        C24626 c24627 = new C24626(this, c17010, c24626.f77965, c24626.f77961);
        C11281 c11281 = c17707.f52887;
        AbstractC6462 abstractC6462M25939 = m25939(c11281.f31437, this.f31160, c24627);
        c11281.f18925 = abstractC6462M25939;
        c17707.f18925 = abstractC6462M25939;
        C11281 c11282 = c17707.f52887;
        C18511 c18511 = new C18511(c11282.f31435.f9954, c11282.f31433, c11282.f31437.f18925, ((C10545) this.f31160.f8849).f29201.f26587);
        c18511.f39051 = c17707.f18924;
        C11281 c11283 = c17707.f52887;
        c11283.f31438 = c18511;
        AbstractC15689 abstractC15689 = ((C10545) this.f31160.f8849).f29201;
        C16852 c16852 = this.f31163;
        if (c16852.m38323((InterfaceC5323) c11283, (AbstractC7783) c18511, abstractC15689)) {
            C11281 c11284 = c17707.f52887;
            c11284.getClass();
            c16852.m38292((InterfaceC5323) c11284, (C13818) c18511, ((C10545) this.f31160.f8849).f29201);
        }
        C4848 c4848 = c17707.f52887.f31435.f9953;
        C4036 c4036 = this.f31160;
        C15099 c15099 = this.f31199;
        c15099.m34508(c4848, c4036, c18511, c17707);
        C11281 c11285 = c17707.f52887;
        c15099.m34510(c11285.f31437, this.f31160, c18511, c11285);
        c15099.m34515();
        c16852.m38298((AbstractC7257) c17707.f52887.f31437, this.f31160, true);
        this.f31172 = c17707.f18925;
        this.f31167 = new C9755(C4848.m10276of((Object) c18511), C4848.m10283(), false);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3837(C22542 c22542) {
        m25939(c22542.f71103, this.f31160, this.f31177);
        AbstractC6462 abstractC6462 = c22542.f71103.f18925;
        c22542.f18925 = abstractC6462;
        this.f31172 = abstractC6462;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3815(C15695 c15695) {
        m25939(c15695.f45487, this.f31160, this.f31177);
        C9755 c9755 = this.f31167;
        C4036 c4036 = this.f31160;
        C4036 c4036M25905 = m25905(c4036, c4036.f8850, c9755.f26939);
        Object obj = c4036M25905.f8849;
        try {
            m25938((AbstractC7257) c15695.f45486, c4036M25905, (AbstractC6462) this.f31193.f69151);
            ((C10545) obj).f29201.mo28410();
            AbstractC6462 abstractC6462 = c15695.f45487.f18925;
            c15695.f18925 = abstractC6462;
            this.f31172 = abstractC6462;
            C9755 c9756 = this.f31167;
            C4132 c4132 = this.f31165;
            c4132.getClass();
            this.f31167 = c4132.m8370(c15695, c9755, c9756);
        } catch (Throwable th) {
            ((C10545) obj).f29201.mo28410();
            throw th;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3817(C16366 c16366) {
        AbstractC6462 abstractC6462 = c16366.f18925;
        C8374 c8374 = this.f31200;
        AbstractC6462 abstractC6462M19475 = c8374.m19475(abstractC6462);
        AbstractC6462 abstractC6462M25939 = m25939(c16366.f48093, this.f31160, this.f31177);
        m25938((AbstractC7257) c16366.f48092, this.f31160, (AbstractC6462) this.f31193.f69134);
        if (c8374.m19452(abstractC6462M25939)) {
            abstractC6462M19475 = c8374.m19455(abstractC6462M25939);
        } else if (!abstractC6462M25939.m14777(EnumC11353.ERROR)) {
            C14040 c14040 = C8300.f21997;
            this.f31202.m9352(c16366, new C14040("compiler", "array.req.but.found", abstractC6462M25939));
        }
        if (!this.f31162.f77963.m38615(C17010.f50311)) {
            abstractC6462M19475 = c8374.m19463(abstractC6462M19475);
        }
        this.f31172 = m25943(c16366, abstractC6462M19475, C17010.f50309, this.f31162);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x030f  */
    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        AbstractC6462 abstractC6462M19466;
        AbstractC7783 abstractC7783M25909;
        boolean z;
        AbstractC6462 abstractC6462;
        AbstractC6462 abstractC6462M19467;
        EnumC3600 enumC3600;
        C17010 c17010M38613 = C17010.f50314;
        AbstractC12224 abstractC12224 = c8320.f22259;
        C8200 c8200 = this.f31178;
        AbstractC12224 abstractC12225 = c8200.f21744;
        AbstractC12224 abstractC12226 = c8200.f21752;
        AbstractC12224 abstractC12227 = c8200.f21756;
        if (abstractC12224 == abstractC12225 || abstractC12224 == abstractC12227 || abstractC12224 == abstractC12226) {
            c17010M38613 = C17010.f50319;
        } else {
            C17010 c17010 = this.f31162.f77963;
            C17010 c17011 = C17010.f50320;
            if (c17010.m38615(c17011)) {
                c17010M38613 = C17010.m38613(c17010M38613, c17011);
            }
            C17010 c17012 = this.f31162.f77963;
            C17010 c17013 = C17010.f50319;
            if (c17012.m38615(c17013)) {
                c17010M38613 = C17010.m38613(c17010M38613, c17013, c17011);
            }
            if (this.f31162.f77963.m38615(C17010.f50315)) {
                c17010M38613 = C17010.m38613(c17010M38613, C17010.f50311, c17013);
            }
        }
        AbstractC6462 abstractC6462M25939 = m25939(c8320.f22261, this.f31160, new C24626(this, c17010M38613, AbstractC6462.f16700));
        boolean zM38615 = this.f31162.f77963.m38615(C17010.f50312);
        C8374 c8374 = this.f31200;
        if (!zM38615) {
            abstractC6462M25939 = c8374.m19463(abstractC6462M25939);
        }
        AbstractC6462 abstractC6463 = abstractC6462M25939;
        C17010 c17014 = C17010.f50319;
        C23623 c23623 = this.f31202;
        if (c17010M38613 == c17014) {
            AbstractC6462 abstractC6464 = abstractC6463;
            while (abstractC6464.m14777(EnumC11353.ARRAY)) {
                abstractC6464 = ((C7251) abstractC6464).f18916;
            }
            if (abstractC6464.m14777(EnumC11353.TYPEVAR)) {
                c23623.m9352(c8320, C8300.f22166);
                AbstractC12224 abstractC12228 = c8320.f22259;
                AbstractC21195 abstractC21195 = abstractC6463.f16705;
                c8374.getClass();
                C13956 c13956M19397 = C8374.m19397(abstractC12228, abstractC21195, abstractC6463);
                c8320.f18925 = c13956M19397;
                this.f31172 = c13956M19397;
                c8320.f22260 = c13956M19397.f16705;
                return;
            }
        }
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c8320.f22261);
        C4036 c4036 = this.f31160;
        C10545 c10545 = (C10545) c4036.f8849;
        boolean z2 = c10545.f29212;
        c10545.f29212 = abstractC7783M21438 != null && abstractC7783M21438.f20408 == abstractC12227;
        c10545.f29204 = null;
        AbstractC7783 abstractC7783M259010 = m25909(c8320, abstractC7783M21438, abstractC6463, c4036, this.f31162);
        EnumC3600 enumC3601 = abstractC7783M259010.f20405;
        EnumC3600 enumC3602 = EnumC3600.f7339;
        C22004 c22004 = this.f31193;
        if (enumC3601 == enumC3602 && abstractC7783M259010.f20408 != abstractC12227 && ((C10545) this.f31160.f8849).f29206 != null) {
            AbstractC14355 abstractC14355 = c8320.f22261;
            abstractC14355.getClass();
            AbstractC21195 abstractC21196 = abstractC6463.f16705;
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "not.encl.class", abstractC21196));
            abstractC7783M259010 = c22004.f69144;
        }
        if (abstractC7783M259010.mo17485() && abstractC7783M259010.f20405 != EnumC3600.f7354 && this.f31162.f77963.m38615(C17010.f50312)) {
            AbstractC6462 abstractC6462M19463 = c8374.m19463(abstractC6463);
            abstractC7783M25909 = m25909(c8320, abstractC7783M21438, abstractC6462M19463, this.f31160, this.f31162);
            abstractC6462M19466 = abstractC6462M19463;
        } else {
            abstractC6462M19466 = abstractC6463;
            abstractC7783M25909 = abstractC7783M259010;
        }
        EnumC18298 enumC18298 = ((C10545) this.f31160.f8849).f29204;
        if (enumC18298 != null) {
            enumC18298.m41672();
        }
        c8320.f22260 = abstractC7783M25909;
        if (!abstractC6462M19466.m14777(EnumC11353.TYPEVAR) || ((abstractC7783M25909 != null && abstractC7783M25909.f20405 == EnumC3600.f7354) || abstractC7783M25909.f20405 == EnumC3600.f7353)) {
            z = true;
        } else {
            z = true;
            abstractC6462M19466 = c8374.m19466(abstractC6462M19466, true);
        }
        if (abstractC7783M25909.f20405 == enumC3602) {
            C13818 c13818 = (C13818) abstractC7783M25909;
            m25919(c8320, this.f31160, c13818, z);
            if (C17010.f50313.m38616(this.f31162.f77963)) {
                m25956(c8320, c13818, c8320.f22261, this.f31160);
            }
        }
        if (abstractC7783M21438 != null && abstractC7783M21438.f20405 == enumC3602 && ((C13818) abstractC7783M21438).m31484() && abstractC7783M25909.f20405 == EnumC3600.f7343 && abstractC7783M25909.f20408.equals(c8200.f21709) && abstractC7783M25909.mo12938(c22004.f69178, abstractC7783M21438.f20406.f16705, c8374, true)) {
            C6953 c6953 = ((C10545) this.f31160.f8849).f29205;
            EnumC21706 enumC21706 = EnumC21706.TRY;
            if (c6953.m15935(enumC21706)) {
                c23623.m9365(enumC21706, c8320, C15675.f45437);
            }
        }
        EnumC3600 enumC3603 = abstractC7783M25909.f20405;
        EnumC3600 enumC3604 = EnumC3600.f7354;
        if (enumC3603 == enumC3604 && (abstractC7783M21438 == null || !abstractC7783M21438.f20405.m6623(C17010.f50312))) {
            c8320.f18925 = m25943(c8320.f22261, this.f31162.f77965, abstractC7783M21438 == null ? C17010.f50311 : abstractC7783M21438.f20405.m6624(), new C24626(this, C17010.f50312, this.f31162.f77965));
        }
        C23663 c23663 = this.f31180;
        C16852 c16852 = this.f31163;
        if (abstractC7783M21438 != null && abstractC7783M21438.f20405 == enumC3604) {
            if (abstractC7783M25909.f20408 == c8200.f21744) {
                C4036 c4037 = this.f31160;
                if (((C10545) c4037.f8849).f29215 && abstractC6462M19466.f16705 == c4037.f8855.f20027) {
                    c16852.m38338(c8320, abstractC7783M25909);
                }
            } else {
                if ((abstractC7783M25909.mo18003() & 8) == 0 && abstractC7783M25909.f20408 != abstractC12227 && ((enumC3600 = abstractC7783M25909.f20405) == enumC3602 || enumC3600 == EnumC3600.f7343)) {
                    C12826.requireNonNull(c23663);
                    c23663.m52656((AbstractC7783) new C3546(abstractC7783M25909, c23663), (InterfaceC5323) c8320, (AbstractC7783) abstractC6462M19466.f16705, abstractC6462M19466, abstractC7783M25909.f20408, true);
                }
                if (!this.f31185 && abstractC7783M21438.m17989() && abstractC7783M25909.mo17483() && abstractC7783M25909.f20405 == EnumC3600.f7343) {
                    c23623.m9359(EnumC21417.SOURCE_LEVEL, c8320, EnumC12477.f34981.m28724(this.f31191));
                }
            }
            if (!this.f31185) {
                c23623.m9359(EnumC21417.SOURCE_LEVEL, c8320, EnumC12477.f34981.m28724(this.f31191));
            }
        } else if (abstractC7783M25909.f20405 != EnumC3600.f7353 && (abstractC7783M25909.mo18003() & 8) != 0 && abstractC7783M25909.f20408 != abstractC12226) {
            EnumC10306 enumC10306M6627 = abstractC7783M25909.f20405.m6627();
            AbstractC7783 abstractC7783 = abstractC7783M25909.f20407;
            C12895 c12895 = C15675.f45417;
            c16852.m38307(c8320, new C12895("compiler", "static.not.qualified.by.type", enumC10306M6627, abstractC7783));
        }
        if (((C10545) this.f31160.f8849).f29212 && (abstractC7783M25909.mo18003() & 8) == 0) {
            c23663.m52666(c8320, abstractC7783M25909);
            if (!abstractC6462M19466.mo14784() || (abstractC6462M19467 = c8374.m19467(abstractC6462M19466.f16705, this.f31160.f8855.f20027.f20406)) == null) {
                abstractC6462 = abstractC6462M19466;
            } else {
                abstractC6462 = abstractC6462M19467;
            }
        } else {
            abstractC6462 = abstractC6462M19466;
        }
        C10545 c10546 = (C10545) this.f31160.f8849;
        if (c10546.f29203) {
            c16852.m38316(c8320, c10546.f29214);
        }
        C4036 c4038 = this.f31160;
        ((C10545) c4038.f8849).f29212 = z2;
        this.f31172 = m25941(c8320, abstractC6462, abstractC7783M25909, c4038, this.f31162);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC7783 m25909(C8320 c8320, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, C4036 c4036, C24626 c24626) {
        AbstractC7783 c7829;
        AbstractC12224 abstractC12224 = c8320.f22259;
        int i = C3207.f6221[abstractC6462.mo5577().ordinal()];
        C23663 c23663 = this.f31180;
        C23623 c23623 = this.f31202;
        C8200 c8200 = this.f31178;
        C8374 c8374 = this.f31200;
        C22004 c22004 = this.f31193;
        switch (i) {
            case 1:
                AbstractC21195 abstractC21195 = abstractC6462.f16705;
                C17010 c17010 = c24626.f77963;
                C23663 c23664 = this.f31180;
                return c23664.m52656(c23664.m52661(c8320, c4036, abstractC21195, abstractC12224, c17010), (InterfaceC5323) c8320, abstractC7783, abstractC6462, abstractC12224, true);
            case 2:
            case 3:
                AbstractC6462 abstractC6463 = c24626.f77965;
                if (abstractC6463.m14777(EnumC11353.METHOD) || abstractC6463.m14777(EnumC11353.FORALL)) {
                    return this.f31180.m52653(c8320, c4036, abstractC7783, abstractC6462, abstractC12224, abstractC6463.mo14797(), abstractC6463.mo14802());
                }
                if (abstractC12224 == c8200.f21744 || abstractC12224 == c8200.f21756) {
                    return c23663.m52654(c8320, c4036, abstractC6462.f16705, abstractC12224);
                }
                if (abstractC12224 == c8200.f21752) {
                    return c22004.m49586(abstractC6462, c8374);
                }
                return this.f31180.m52656(this.f31180.m52655(c8320, c4036, abstractC6462, abstractC12224, c24626.f77963), (InterfaceC5323) c8320, abstractC7783, abstractC6462, abstractC12224, true);
            case 4:
                throw new AssertionError(c8320);
            case 5:
                AbstractC7783 abstractC7783M25909 = abstractC6462.mo14803() != null ? m25909(c8320, abstractC7783, c8374.m19463(abstractC6462.mo14803()), c4036, c24626) : null;
                if (abstractC7783M25909 == null) {
                    c23623.m9352(c8320, C8300.f22166);
                    return c22004.f69144;
                }
                if ((abstractC7783M25909.mo18003() & 2) != 0) {
                    C12826.requireNonNull(c23663);
                    c7829 = new C7829(c23663, c4036, abstractC6462, abstractC7783M25909);
                } else {
                    c7829 = abstractC7783M25909;
                }
                this.f31180.m52656(c7829, (InterfaceC5323) c8320, abstractC7783, abstractC6462, abstractC12224, true);
                return abstractC7783M25909;
            case 6:
                AbstractC21195 abstractC21196 = abstractC6462.f16705;
                c8374.getClass();
                return C8374.m19397(abstractC12224, abstractC21196, abstractC6462).f16705;
            default:
                if (abstractC12224 == c8200.f21752) {
                    return c22004.m49586(abstractC6462, c8374);
                }
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c8320, new C14040("compiler", "cant.deref", abstractC6462));
                return c22004.f69144;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25941(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C4036 c4036, C24626 c24626) {
        if (!c24626.f77965.m14777(EnumC11353.FORALL) && !c24626.f77965.m14777(EnumC11353.METHOD)) {
            return m25942(abstractC7257, abstractC6462, abstractC7783, c24626.f77965, c4036, c24626);
        }
        if (c24626.f77963.m38615(C17010.f50310)) {
            return this.f31174.m23158(abstractC7257, abstractC6462, abstractC7783, c4036, c24626);
        }
        return m25942(abstractC7257, abstractC6462, abstractC7783, c24626.f77965, c4036, c24626);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25942(AbstractC7257 abstractC7257, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, AbstractC6462 abstractC6463, C4036 c4036, C24626 c24626) {
        AbstractC6462 c21333;
        AbstractC6462 abstractC6462M19483;
        AbstractC7783 abstractC7783M21438;
        AbstractC12224 abstractC12224;
        AbstractC6462 abstractC6462M19430;
        boolean zMo14812 = abstractC6463.mo14812();
        C8374 c8374 = this.f31200;
        if (zMo14812) {
            return c8374.m19475(abstractC6462);
        }
        int i = C3207.f6220[abstractC7783.f20405.ordinal()];
        C8200 c8200 = this.f31178;
        C16852 c16852 = this.f31163;
        switch (i) {
            case 8:
                c21333 = abstractC7783.f20406;
                EnumC11353 enumC11353 = EnumC11353.CLASS;
                if (c21333.m14777(enumC11353)) {
                    abstractC7257.getClass();
                    c16852.m38297(abstractC7257, c4036, (C15828) abstractC7783);
                    AbstractC6462 abstractC6462Mo7201 = c21333.mo7201();
                    if (c21333.f16705.f20406.mo14802().m10293()) {
                        c21333 = c8374.m19459(c21333);
                    } else if (abstractC6462Mo7201.m14777(enumC11353) && abstractC6462 != abstractC6462Mo7201) {
                        AbstractC6462 abstractC6462M19429 = abstractC6462.m14777(enumC11353) ? c8374.m19429(abstractC6462, abstractC6462Mo7201.f16705) : abstractC6462;
                        if (abstractC6462M19429 == null) {
                            abstractC6462M19429 = c8374.m19459(abstractC6462Mo7201);
                        }
                        if (abstractC6462M19429 != abstractC6462Mo7201) {
                            c21333 = new C21333(abstractC6462M19429, C4848.m10283(), c21333.f16705, c21333.m14785());
                        }
                    }
                }
                break;
            case 9:
                C13818 c13818 = (C13818) abstractC7783;
                if (((C10545) c4036.f8849).f29209 != null && c13818.f20406.m14777(EnumC11353.NONE)) {
                    AbstractC7257 abstractC7258 = c4036.f8855;
                    AbstractC7257 abstractC7257M21404 = C9268.m21404(c13818, abstractC7258);
                    if (abstractC7257M21404 != null) {
                        abstractC7258 = abstractC7257M21404;
                    }
                    this.f31202.m9348(abstractC7258.f18924, C8300.m19123(c13818.f20408, C13665.f38517));
                    C13956 c13956M19475 = c8374.m19475(c13818.f20406);
                    c13818.f20406 = c13956M19475;
                    return c13956M19475;
                }
                if (C17010.f50313.m38616(this.f31162.f77963) && c13818.f20407.f20405 == EnumC3600.f7354 && (c13818.f20409 & 8) == 0 && ((abstractC6462.m14777(EnumC11353.CLASS) || abstractC6462.m14777(EnumC11353.TYPEVAR)) && (abstractC6462M19430 = c8374.m19430(c13818.f20407, abstractC6462)) != null && abstractC6462M19430.mo14784() && !c8374.m19490(c13818.f20406, c13818.mo18010(c8374)))) {
                    abstractC7257.getClass();
                    C12895 c12895 = C15675.f45417;
                    c16852.m38339(abstractC7257, new C12895("compiler", "unchecked.assign.to.var", c13818, abstractC6462M19430));
                }
                EnumC3600 enumC3600 = abstractC7783.f20407.f20405;
                EnumC3600 enumC3601 = EnumC3600.f7354;
                if (enumC3600 == enumC3601 && (abstractC12224 = abstractC7783.f20408) != c8200.f21744 && abstractC12224 != c8200.f21756) {
                    abstractC6462M19483 = c8374.m19483(abstractC7783, abstractC6462);
                } else {
                    abstractC6462M19483 = abstractC7783.f20406;
                }
                c21333 = (c13818.m31487() == null || (abstractC7257.m16617(EnumC19998.f60805) && ((abstractC7783M21438 = C9268.m21438(((C8320) abstractC7257).f22261)) == null || abstractC7783M21438.f20405 != enumC3601))) ? abstractC6462M19483 : abstractC6462M19483.mo5576(c13818.m31487());
                if (c24626.f77963 == C17010.f50311) {
                    c21333 = c8374.m19463(c21333);
                }
                break;
                break;
            case 10:
                C17010 c17010 = c24626.f77963;
                AbstractC6462 abstractC6464 = c24626.f77965;
                c21333 = m25936(abstractC6462, abstractC7783, new C24626(this, c17010, abstractC6464.mo14787(), c24626.f77961, c24626.f77962), c4036, C9268.m21401(c4036.f8850), abstractC6464.mo14797(), abstractC6464.mo14802());
                break;
            case 11:
            case 12:
                c21333 = abstractC7783.f20406;
                break;
            default:
                throw new AssertionError("unexpected kind: " + abstractC7783.f20405 + " in tree " + abstractC7257);
        }
        if (abstractC7783.f20408 != c8200.f21737 || abstractC7257.m16617(EnumC19998.f60748)) {
            abstractC7257.getClass();
            AbstractC7783 abstractC7784 = ((C10545) c4036.f8849).f29201.f26587;
            c16852.getClass();
            c16852.m38277(new C19536(abstractC7257), abstractC7784, abstractC7783);
            c16852.m38353(abstractC7783, abstractC7257);
            c16852.m38341(abstractC7783, abstractC7257);
            c16852.m38288(abstractC7257, ((C10545) c4036.f8849).f29201.f26587, abstractC7783);
        }
        return m25943(abstractC7257, c21333, abstractC7783.f20405.m6624(), c24626);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25919(AbstractC14355 abstractC14355, C4036 c4036, C13818 c13818, boolean z) {
        C15828 c15828M17990;
        C12895 c12895;
        C4036 c4037 = c4036;
        while (true) {
            switch (C3207.f6222[c4037.f8850.mo3383().ordinal()]) {
                case 15:
                case 16:
                case 21:
                    c4037 = null;
                    break;
                case 17:
                case 18:
                default:
                    continue;
                    C1446.m31699(c4037.f8848);
                    c4037 = c4037.f8848;
                    break;
                case 19:
                    if (((C11281) c4037.f8850).f31438.f20407.f20405 != EnumC3600.f7354) {
                        C1446.m31699(c4037.f8848);
                        c4037 = c4037.f8848;
                    }
                    break;
                case 20:
                    if (!c4037.f8848.f8850.m16617(EnumC19998.f60806)) {
                        C1446.m31699(c4037.f8848);
                        c4037 = c4037.f8848;
                    }
                    break;
            }
        }
        C23623 c23623 = this.f31202;
        if (c4037 != null) {
            C10545 c10545 = (C10545) c4037.f8849;
            if (c10545.f29209 == c13818 || c13818.f39051 > abstractC14355.f18924) {
                AbstractC7783 abstractC7783 = c13818.f20407;
                if (abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783 == ((C10545) c4036.f8849).f29201.f26587.m17990()) {
                    if (((c13818.f20409 & 8) != 0) == C23663.m52631(c4036) && (!c4036.f8850.m16617(EnumC19998.f60746) || C9268.m21424(((C22403) c4036.f8850).f70670) != abstractC14355)) {
                        if (!z || m25927(c13818)) {
                            c23623.m9352(abstractC14355, c10545.f29209 == c13818 ? C8300.f22090 : C8300.f22064);
                        } else if (this.f31189) {
                            if (c10545.f29209 == c13818) {
                                C12895 c12896 = C15675.f45417;
                                c12895 = new C12895("compiler", "self.ref", c13818);
                            } else {
                                C12895 c12897 = C15675.f45417;
                                c12895 = new C12895("compiler", "forward.ref", c13818);
                            }
                            c23623.m9364(abstractC14355, c12895);
                        }
                    }
                }
            }
        }
        c13818.m31487();
        if (!m25927(c13818) || (c15828M17990 = ((C10545) c4036.f8849).f29201.f26587.m17990()) == null || c15828M17990.f20407 == null) {
            return;
        }
        AbstractC7783 abstractC7784 = c13818.f20407;
        if (abstractC7784 == c15828M17990 || this.f31200.m19486(c15828M17990.f20406, abstractC7784.f20406, true)) {
            C6468 c6468 = C23663.f75298;
            AbstractC7783 abstractC7785 = ((C10545) c4036.f8849).f29201.f26587;
            if (!abstractC7785.m17994()) {
                if (abstractC7785.f20407.f20405 != EnumC3600.f7354) {
                    return;
                }
                EnumC3600 enumC3600 = abstractC7785.f20405;
                if ((enumC3600 != EnumC3600.f7339 && (enumC3600 != EnumC3600.f7343 || (abstractC7785.mo18003() & 1048576) == 0)) || (abstractC7785.mo18003() & 8) != 0) {
                    return;
                }
            }
            c23623.m9352(abstractC14355, C8300.f22085);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m25927(C13818 c13818) {
        AbstractC7783 abstractC7783 = c13818.f20407;
        int i = C21036.f66007;
        return ((abstractC7783.mo18003() & 16384) == 0 || (c13818.f20409 & 8) == 0 || c13818.m31487() != null || c13818.f20408 == this.f31178.f21752) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x0297 A[Catch: ᩻ۧ۠ -> 0x02c1, ۬ۛ֨ -> 0x02c5, TryCatch #1 {۬ۛ֨ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:148:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1 A[Catch: ᩻ۧ۠ -> 0x02c1, ۬ۛ֨ -> 0x02c5, TryCatch #1 {۬ۛ֨ -> 0x02c5, blocks: (B:100:0x028d, B:103:0x0297, B:105:0x02a1, B:109:0x02ac, B:111:0x02bb), top: B:148:0x028d }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x026e A[Catch: ۬ۛ֨ -> 0x0283, ᩻ۧ۠ -> 0x02c7, TRY_ENTER, TryCatch #0 {᩻ۧ۠ -> 0x02c7, blocks: (B:90:0x0264, B:92:0x026e, B:94:0x0280, B:98:0x0289, B:76:0x022a), top: B:147:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0289 A[Catch: ᩻ۧ۠ -> 0x02c7, ۬ۛ֨ -> 0x02cd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {᩻ۧ۠ -> 0x02c7, blocks: (B:90:0x0264, B:92:0x026e, B:94:0x0280, B:98:0x0289, B:76:0x022a), top: B:147:0x022a }] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25936(AbstractC6462 abstractC6462, AbstractC7783 abstractC7783, C24626 c24626, C4036 c4036, C4848 c4848, C4848 c4849, C4848 c48410) {
        InterfaceC6125 interfaceC6125;
        C4848 c48411;
        C23623 c23623;
        Object obj;
        C4036 c4037;
        C4848 c48412;
        C8374 c8374;
        C4848 c48413;
        AbstractC6462 c12497;
        EnumC21201 enumC21201;
        EnumC18298 enumC18298;
        boolean z;
        Object obj2;
        AbstractC6462 abstractC6462M19430;
        InterfaceC6125 interfaceC6126 = c24626.f77961;
        C23663 c23663 = this.f31180;
        long jMo18003 = abstractC7783.mo18003() & 8;
        C16852 c16852 = this.f31163;
        C8374 c8375 = this.f31200;
        if (jMo18003 == 0 && ((abstractC6462.m14777(EnumC11353.CLASS) || abstractC6462.m14777(EnumC11353.TYPEVAR)) && (abstractC6462M19430 = c8375.m19430(abstractC7783.f20407, abstractC6462)) != null && abstractC6462M19430.mo14784() && !c8375.m19489(abstractC7783.f20406.mo14797(), abstractC7783.mo18010(c8375).mo14797()))) {
            AbstractC7257 abstractC7257 = c4036.f8850;
            abstractC7257.getClass();
            C12895 c12895 = C15675.f45417;
            c16852.m38339(abstractC7257, new C12895("compiler", "unchecked.call.mbr.of.raw.type", abstractC7783, abstractC6462M19430));
        }
        Object obj3 = c4036.f8849;
        AbstractC6462 abstractC6463 = ((C10545) obj3).f29206;
        C23623 c23624 = this.f31202;
        if (abstractC6463 != null) {
            Iterator it = c8375.m19450(c4036.f8855.f18925).m10290(c8375.m19502(c4036.f8855.f18925)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC6125 = interfaceC6126;
                    break;
                }
                AbstractC6462 abstractC6464 = (AbstractC6462) it.next();
                if (abstractC6464.f16705.mo17999((AbstractC7783) abstractC7783.m17990(), c8375)) {
                    C10545 c10545 = (C10545) obj3;
                    if (c8375.m19490(abstractC6464, c10545.f29206)) {
                        interfaceC6125 = interfaceC6126;
                    } else {
                        C4848 c4848M19423 = c8375.m19423(abstractC6464, (C5771) abstractC7783);
                        if (!c4848M19423.m10293() || (obj2 = c4848M19423.f11034) == abstractC7783) {
                            interfaceC6125 = interfaceC6126;
                        } else {
                            C5771 c5771 = (C5771) obj2;
                            interfaceC6125 = interfaceC6126;
                            if (c5771.mo12938(abstractC7783, c5771.m17990(), c8375, true)) {
                                AbstractC7257 abstractC7258 = c4036.f8850;
                                abstractC7258.getClass();
                                AbstractC6462 abstractC6465 = c10545.f29206;
                                C13370 c13370 = C13665.f38450;
                                C13370 c13371 = new C13370("compiler", "overridden.default", abstractC7783, abstractC6464);
                                C14040 c14040 = C8300.f21997;
                                c23624.m9352(abstractC7258, new C14040("compiler", "illegal.default.super.call", abstractC6465, c13371));
                                break;
                            }
                        }
                    }
                } else {
                    interfaceC6125 = interfaceC6126;
                }
                it = it;
                interfaceC6126 = interfaceC6125;
                c8375 = c8375;
            }
            ((C10545) obj3).f29206 = null;
        } else {
            c8375 = c8375;
            interfaceC6125 = interfaceC6126;
        }
        if (abstractC7783.mo17483() && abstractC6462.mo14789() && c4036.f8850.m16617(EnumC19998.f60758)) {
            C17175 c17175 = (C17175) c4036.f8850;
            if (c17175.f51143.m16617(EnumC19998.f60805) && !C9268.m21412(((C8320) c17175.f51143).f22261, this.f31178)) {
                AbstractC7257 abstractC7259 = c4036.f8850;
                abstractC7259.getClass();
                C14040 c14041 = C8300.f21997;
                c23624.m9352(abstractC7259, new C14040("compiler", "illegal.static.intf.meth.call", abstractC6462));
            }
        }
        C3686 c3686 = new C3686();
        try {
            obj = obj3;
            c23623 = c23624;
            try {
                try {
                    AbstractC6462 abstractC6462M52641 = this.f31180.m52641(c4036, abstractC6462, abstractC7783, c24626, c4849, c48410, c3686);
                    AbstractC6462 abstractC6466 = c24626.f77965;
                    C14152 c14152 = this.f31196;
                    C12826.requireNonNull(c14152);
                    try {
                        C10129 c10129 = new C10129(c14152, EnumC15511.CHECK, abstractC7783, ((C10545) obj).f29204);
                        c48411 = c4849;
                        try {
                            C4848 c4848M10287 = c48411.m10287((Function) c10129);
                            try {
                                try {
                                    try {
                                        try {
                                            if (c3686.m7110(EnumC21706.UNCHECKED)) {
                                                try {
                                                    try {
                                                        AbstractC7257 abstractC72510 = c4036.f8850;
                                                        abstractC72510.getClass();
                                                        EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783);
                                                        AbstractC12224 abstractC12224 = abstractC7783.f20408;
                                                        Object objM52638 = c23663.m52638(abstractC7783.f20406.mo14797());
                                                        Object objM52639 = c23663.m52638(c4848M10287.m10287((Function) c10129));
                                                        EnumC10306 enumC10306M51426 = C23047.m51425(abstractC7783.m17991());
                                                        AbstractC7783 abstractC7783M17991 = abstractC7783.m17991();
                                                        try {
                                                            C12895 c12896 = C15675.f45417;
                                                            c23663 = c23663;
                                                            try {
                                                                c48413 = c4848M10287;
                                                                try {
                                                                    c16852.m38339(abstractC72510, new C12895("compiler", "unchecked.meth.invocation.applied", enumC10306M51425, abstractC12224, objM52638, objM52639, enumC10306M51426, abstractC7783M17991));
                                                                    try {
                                                                        try {
                                                                            if (abstractC6466 == C8769.f23793) {
                                                                                try {
                                                                                    if (!abstractC6462M52641.m14777(EnumC11353.METHOD) || !abstractC6462M52641.mo14804()) {
                                                                                    }
                                                                                    if (abstractC7783.f20406.m14777(EnumC11353.FORALL) || !abstractC7783.f20406.mo14787().m14792(((C11945) abstractC7783.f20406).f33323)) {
                                                                                        enumC21201 = EnumC21201.STANDALONE;
                                                                                    } else {
                                                                                        enumC21201 = EnumC21201.POLY;
                                                                                    }
                                                                                    c4037 = c4036;
                                                                                    C9268.m21411(c4037.f8850, enumC21201);
                                                                                    if (abstractC6466 == C8769.f23793) {
                                                                                        return c12497;
                                                                                    }
                                                                                    C16852 c16853 = this.f31163;
                                                                                    enumC18298 = ((C10545) obj).f29204;
                                                                                    if (enumC18298 == null && enumC18298.m41672()) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    c48412 = c48413;
                                                                                    try {
                                                                                        c16853.m38294(c12497, abstractC7783, c4036, c4848, c48413, z, interfaceC6125.mo6098());
                                                                                        return c12497;
                                                                                    } catch (C24848 e) {
                                                                                        e = e;
                                                                                        C18258 c18258Mo33511 = e.mo33511();
                                                                                        C12826.requireNonNull(c23663);
                                                                                        C23663 c23664 = c23663;
                                                                                        C2536 c2536 = new C2536(c23664, abstractC7783, c18258Mo33511);
                                                                                        EnumC15511 enumC15511 = EnumC15511.CHECK;
                                                                                        EnumC18298 enumC18299 = ((C10545) obj).f29204;
                                                                                        C14152 c14153 = c23664.f75332;
                                                                                        C12826.requireNonNull(c14153);
                                                                                        c23623.mo9356(c2536.mo6320(EnumC14710.ERROR, c4037.f8850, abstractC7783, abstractC6462, abstractC7783.f20408, c48412.m10287((Function) new C2875(c14153, enumC15511, abstractC7783, enumC18299)), c48410));
                                                                                        return c8375.m19475(abstractC6462);
                                                                                    }
                                                                                } catch (C24848 e2) {
                                                                                    e = e2;
                                                                                    c48412 = c48413;
                                                                                    c4037 = c4036;
                                                                                    c8375 = c8375;
                                                                                    C18258 c18258Mo33512 = e.mo33511();
                                                                                    C12826.requireNonNull(c23663);
                                                                                    C23663 c23665 = c23663;
                                                                                    C2536 c2537 = new C2536(c23665, abstractC7783, c18258Mo33512);
                                                                                    EnumC15511 enumC15512 = EnumC15511.CHECK;
                                                                                    EnumC18298 enumC182910 = ((C10545) obj).f29204;
                                                                                    C14152 c14154 = c23665.f75332;
                                                                                    C12826.requireNonNull(c14154);
                                                                                    c23623.mo9356(c2537.mo6320(EnumC14710.ERROR, c4037.f8850, abstractC7783, abstractC6462, abstractC7783.f20408, c48412.m10287((Function) new C2875(c14154, enumC15512, abstractC7783, enumC182910)), c48410));
                                                                                    return c8375.m19475(abstractC6462);
                                                                                }
                                                                            }
                                                                            c12497 = new C12497(abstractC6462M52641.mo14797(), c8375.m19459(abstractC6462M52641.mo14787()), c8375.m19460(abstractC6462M52641.mo14794()), this.f31193.f69163);
                                                                            if (abstractC7783.f20406.m14777(EnumC11353.FORALL)) {
                                                                                enumC21201 = EnumC21201.STANDALONE;
                                                                            } else {
                                                                                enumC21201 = EnumC21201.STANDALONE;
                                                                            }
                                                                            c4037 = c4036;
                                                                            C9268.m21411(c4037.f8850, enumC21201);
                                                                            if (abstractC6466 == C8769.f23793) {
                                                                                return c12497;
                                                                            }
                                                                            C16852 c16854 = this.f31163;
                                                                            enumC18298 = ((C10545) obj).f29204;
                                                                            if (enumC18298 == null) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            c48412 = c48413;
                                                                            c16854.m38294(c12497, abstractC7783, c4036, c4848, c48413, z, interfaceC6125.mo6098());
                                                                            return c12497;
                                                                        } catch (C24848 e3) {
                                                                            e = e3;
                                                                            c48412 = c48413;
                                                                            c4037 = c4036;
                                                                            C18258 c18258Mo33513 = e.mo33511();
                                                                            C12826.requireNonNull(c23663);
                                                                            C23663 c23666 = c23663;
                                                                            C2536 c2538 = new C2536(c23666, abstractC7783, c18258Mo33513);
                                                                            EnumC15511 enumC15513 = EnumC15511.CHECK;
                                                                            EnumC18298 enumC182911 = ((C10545) obj).f29204;
                                                                            C14152 c14155 = c23666.f75332;
                                                                            C12826.requireNonNull(c14155);
                                                                            c23623.mo9356(c2538.mo6320(EnumC14710.ERROR, c4037.f8850, abstractC7783, abstractC6462, abstractC7783.f20408, c48412.m10287((Function) new C2875(c14155, enumC15513, abstractC7783, enumC182911)), c48410));
                                                                            return c8375.m19475(abstractC6462);
                                                                        }
                                                                    } catch (C14646 e4) {
                                                                        e = e4;
                                                                        c4037 = c4036;
                                                                        c8374 = c8375;
                                                                        AbstractC7257 abstractC72511 = c4037.f8850;
                                                                        abstractC72511.getClass();
                                                                        interfaceC6125.mo3480(abstractC72511, e.mo33511());
                                                                        return c8374.m19475(abstractC6462);
                                                                    }
                                                                    c8375 = c8375;
                                                                } catch (C24848 e5) {
                                                                    e = e5;
                                                                    c8375 = c8375;
                                                                    c48412 = c48413;
                                                                    c4037 = c4036;
                                                                    C18258 c18258Mo33514 = e.mo33511();
                                                                    C12826.requireNonNull(c23663);
                                                                    C23663 c23667 = c23663;
                                                                    C2536 c2539 = new C2536(c23667, abstractC7783, c18258Mo33514);
                                                                    EnumC15511 enumC15514 = EnumC15511.CHECK;
                                                                    EnumC18298 enumC182912 = ((C10545) obj).f29204;
                                                                    C14152 c14156 = c23667.f75332;
                                                                    C12826.requireNonNull(c14156);
                                                                    c23623.mo9356(c2539.mo6320(EnumC14710.ERROR, c4037.f8850, abstractC7783, abstractC6462, abstractC7783.f20408, c48412.m10287((Function) new C2875(c14156, enumC15514, abstractC7783, enumC182912)), c48410));
                                                                    return c8375.m19475(abstractC6462);
                                                                }
                                                            } catch (C24848 e6) {
                                                                e = e6;
                                                                c48413 = c4848M10287;
                                                            }
                                                        } catch (C24848 e7) {
                                                            e = e7;
                                                            c48413 = c4848M10287;
                                                            c23663 = c23663;
                                                        }
                                                    } catch (C24848 e8) {
                                                        e = e8;
                                                        c4037 = c4036;
                                                        c48412 = c4848M10287;
                                                        C18258 c18258Mo33515 = e.mo33511();
                                                        C12826.requireNonNull(c23663);
                                                        C23663 c23668 = c23663;
                                                        C2536 c25310 = new C2536(c23668, abstractC7783, c18258Mo33515);
                                                        EnumC15511 enumC15515 = EnumC15511.CHECK;
                                                        EnumC18298 enumC182913 = ((C10545) obj).f29204;
                                                        C14152 c14157 = c23668.f75332;
                                                        C12826.requireNonNull(c14157);
                                                        c23623.mo9356(c25310.mo6320(EnumC14710.ERROR, c4037.f8850, abstractC7783, abstractC6462, abstractC7783.f20408, c48412.m10287((Function) new C2875(c14157, enumC15515, abstractC7783, enumC182913)), c48410));
                                                        return c8375.m19475(abstractC6462);
                                                    }
                                                } catch (C14646 e9) {
                                                    e = e9;
                                                    abstractC6462 = abstractC6462;
                                                    c4037 = c4036;
                                                    c8374 = c8375;
                                                    AbstractC7257 abstractC72512 = c4037.f8850;
                                                    abstractC72512.getClass();
                                                    interfaceC6125.mo3480(abstractC72512, e.mo33511());
                                                    return c8374.m19475(abstractC6462);
                                                }
                                            } else {
                                                c48413 = c4848M10287;
                                                c23663 = c23663;
                                            }
                                            C9268.m21411(c4037.f8850, enumC21201);
                                            if (abstractC6466 == C8769.f23793) {
                                                return c12497;
                                            }
                                            C16852 c16855 = this.f31163;
                                            enumC18298 = ((C10545) obj).f29204;
                                            if (enumC18298 == null) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            c48412 = c48413;
                                            c16855.m38294(c12497, abstractC7783, c4036, c4848, c48413, z, interfaceC6125.mo6098());
                                            return c12497;
                                        } catch (C14646 e10) {
                                            e = e10;
                                            c8374 = c8375;
                                            AbstractC7257 abstractC72513 = c4037.f8850;
                                            abstractC72513.getClass();
                                            interfaceC6125.mo3480(abstractC72513, e.mo33511());
                                            return c8374.m19475(abstractC6462);
                                        }
                                    } catch (C24848 e11) {
                                        e = e11;
                                        c48412 = c48413;
                                    }
                                    if (abstractC7783.f20406.m14777(EnumC11353.FORALL)) {
                                        enumC21201 = EnumC21201.STANDALONE;
                                    } else {
                                        enumC21201 = EnumC21201.STANDALONE;
                                    }
                                    c4037 = c4036;
                                } catch (C14646 e12) {
                                    e = e12;
                                    c4037 = c4036;
                                }
                                c8375 = c8375;
                                c12497 = abstractC6462M52641;
                            } catch (C24848 e13) {
                                e = e13;
                                c4037 = c4036;
                            }
                        } catch (C24848 e14) {
                            e = e14;
                            c4037 = c4036;
                            c23663 = c23663;
                            c8375 = c8375;
                            c48412 = c48411;
                            C18258 c18258Mo33516 = e.mo33511();
                            C12826.requireNonNull(c23663);
                            C23663 c23669 = c23663;
                            C2536 c25311 = new C2536(c23669, abstractC7783, c18258Mo33516);
                            EnumC15511 enumC15516 = EnumC15511.CHECK;
                            EnumC18298 enumC182914 = ((C10545) obj).f29204;
                            C14152 c14158 = c23669.f75332;
                            C12826.requireNonNull(c14158);
                            c23623.mo9356(c25311.mo6320(EnumC14710.ERROR, c4037.f8850, abstractC7783, abstractC6462, abstractC7783.f20408, c48412.m10287((Function) new C2875(c14158, enumC15516, abstractC7783, enumC182914)), c48410));
                            return c8375.m19475(abstractC6462);
                        }
                    } catch (C24848 e15) {
                        e = e15;
                        c48411 = c4849;
                    }
                } catch (C14646 e16) {
                    e = e16;
                    c4037 = c4036;
                    abstractC6462 = abstractC6462;
                }
            } catch (C24848 e17) {
                e = e17;
                c48411 = c4849;
            }
        } catch (C14646 e18) {
            e = e18;
            abstractC6462 = abstractC6462;
            c4037 = c4036;
        } catch (C24848 e19) {
            e = e19;
            c48411 = c4849;
            c23623 = c23624;
            obj = obj3;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3840(C24552 c24552) {
        EnumC11353 enumC11353 = c24552.f77743;
        EnumC11353 enumC11354 = EnumC11353.CLASS;
        C22004 c22004 = this.f31193;
        this.f31172 = m25943(c24552, (enumC11353 == enumC11354 ? c22004.f69215 : c22004.f69143[enumC11353.ordinal()]).mo5576(c24552.f77744), C17010.f50311, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3786(C5107 c5107) {
        this.f31172 = m25943(c5107, this.f31193.f69143[c5107.f11988.ordinal()], C17010.f50319, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3842(C25084 c25084) {
        this.f31172 = m25943(c25084, new C7251(m25963(c25084.f80025, this.f31160, AbstractC6462.f16700), this.f31193.f69187), C17010.f50319, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        AbstractC6462 abstractC6462M19430;
        AbstractC6462 abstractC6462 = c17985.f18925;
        C8374 c8374 = this.f31200;
        C21333 c21333M19475 = c8374.m19475(abstractC6462);
        AbstractC14355 abstractC14355 = c17985.f53722;
        abstractC14355.getClass();
        AbstractC6462 abstractC6462M25963 = m25963(c17985.f53722, this.f31160, AbstractC6462.f16700);
        C16852 c16852 = this.f31163;
        AbstractC6462 abstractC6462M38334 = c16852.m38334(abstractC14355, abstractC6462M25963);
        C4848 c4848 = c17985.f53721;
        C4848 c4848M25932 = m25932(c4848, this.f31160);
        c16852.m38284(c4848, c4848M25932);
        if (abstractC6462M38334.m14777(EnumC11353.CLASS)) {
            C4848 c4848Mo14802 = abstractC6462M38334.f16705.f20406.mo14802();
            if (c4848M25932.isEmpty()) {
                c4848M25932 = c4848Mo14802;
            }
            if (c4848M25932.m10289() == c4848Mo14802.m10289()) {
                C4848 c4849 = c4848M25932;
                while (c4849.m10293()) {
                    c4849.f11034 = ((AbstractC6462) c4849.f11034).mo14801((AbstractC6462) c4848Mo14802.f11034);
                    c4849 = c4849.f11035;
                    c4848Mo14802 = c4848Mo14802.f11035;
                }
                AbstractC6462 abstractC6462Mo7201 = abstractC6462M38334.mo7201();
                EnumC11353 enumC11353 = EnumC11353.CLASS;
                if (abstractC6462Mo7201.m14777(enumC11353)) {
                    AbstractC14355 abstractC14355M21431 = C9268.m21431(c17985.f53722);
                    if (abstractC14355M21431.m16617(EnumC19998.f60790)) {
                        abstractC6462M19430 = this.f31160.f8855.f20027.f20406;
                    } else if (abstractC14355M21431.m16617(EnumC19998.f60805)) {
                        abstractC6462M19430 = ((C8320) abstractC14355M21431).f22261.f18925;
                    } else {
                        throw new AssertionError("" + c17985);
                    }
                    if (abstractC6462Mo7201.m14777(enumC11353) && abstractC6462M19430 != abstractC6462Mo7201) {
                        if (abstractC6462M19430.m14777(enumC11353)) {
                            abstractC6462M19430 = c8374.m19430(abstractC6462Mo7201.f16705, abstractC6462M19430);
                        }
                        abstractC6462Mo7201 = abstractC6462M19430 == null ? c8374.m19459(abstractC6462Mo7201) : abstractC6462M19430;
                    }
                }
                c21333M19475 = new C21333(abstractC6462Mo7201, c4848M25932, abstractC6462M38334.f16705, abstractC6462M38334.m14785());
            } else {
                int iM10289 = c4848Mo14802.m10289();
                C23623 c23623 = this.f31202;
                if (iM10289 != 0) {
                    String string = Integer.toString(c4848Mo14802.m10289());
                    C14040 c14040 = C8300.f21997;
                    c23623.m9352(c17985, new C14040("compiler", "wrong.number.type.args", string));
                } else {
                    AbstractC21195 abstractC21195 = abstractC6462M38334.f16705;
                    C14040 c14041 = C8300.f21997;
                    c23623.m9352(c17985, new C14040("compiler", "type.doesnt.take.params", abstractC21195));
                }
                c21333M19475 = c8374.m19475(c17985.f18925);
            }
        }
        this.f31172 = m25943(c17985, c21333M19475, C17010.f50319, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3841(C24691 c24691) {
        C8374 c8374;
        C20271<AbstractC6462> c20271 = new C20271();
        Iterator it = c24691.f78164.iterator();
        C20271 c20272 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c8374 = this.f31200;
            if (!zHasNext) {
                break;
            }
            AbstractC14355 abstractC14355 = (AbstractC14355) it.next();
            AbstractC6462 abstractC6462M25963 = m25963(abstractC14355, this.f31160, AbstractC6462.f16700);
            abstractC14355.getClass();
            C16852 c16852 = this.f31163;
            AbstractC6462 abstractC6462M38267 = c16852.m38267(abstractC14355, c16852.m38334(abstractC14355, abstractC6462M25963), this.f31193.f69161, c16852.f49905);
            if (!abstractC6462M38267.mo14812()) {
                if (c16852.m38354(abstractC6462M38267, c20271.m45783())) {
                    for (AbstractC6462 abstractC6462 : c20271) {
                        boolean zM19486 = c8374.m19486(abstractC6462M38267, abstractC6462, true);
                        boolean zM19487 = c8374.m19486(abstractC6462, abstractC6462M38267, true);
                        if (zM19486 || zM19487) {
                            AbstractC6462 abstractC6463 = zM19486 ? abstractC6462M38267 : abstractC6462;
                            if (!zM19486) {
                                abstractC6462 = abstractC6462M38267;
                            }
                            C14040 c14040 = C8300.f21997;
                            this.f31202.m9352(abstractC14355, new C14040("compiler", "multicatch.types.must.be.disjoint", abstractC6463, abstractC6462));
                        }
                    }
                }
                c20271.m45777(abstractC6462M38267);
                if (c20272 != null) {
                    c20272.m45777(abstractC6462M38267);
                }
            } else {
                if (c20272 == null) {
                    c20272 = new C20271();
                    c20272.m45779(c20271);
                }
                c20272.m45777(abstractC6462M38267);
            }
        }
        AbstractC6462 abstractC6462M25943 = m25943(c24691, c8374.m19488(c20271.m45783()), C17010.f50319, this.f31162.mo40742(EnumC23995.f76206));
        if (abstractC6462M25943.m14777(EnumC11353.CLASS)) {
            if (c20272 != null) {
                c20271 = c20272;
            }
            abstractC6462M25943 = new C9814((C21333) abstractC6462M25943, c20271.m45783());
        }
        this.f31172 = abstractC6462M25943;
        c24691.f18925 = abstractC6462M25943;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3825(C18656 c18656) throws Throwable {
        C4848 c4848 = c18656.f55708;
        this.f31163.m38284(c4848, m25932(c4848, this.f31160));
        AbstractC6462 abstractC6462M25940 = m25940(c18656, c18656.f55708);
        this.f31172 = abstractC6462M25940;
        c18656.f18925 = abstractC6462M25940;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        C10485 c10485 = (C10485) c15973.f18925;
        C4848 c4848 = c15973.f46260;
        if (c4848 != null && c4848.m10293()) {
            C4848 c4849 = c15973.f46260;
            C15099 c15099 = this.f31199;
            c15099.getClass();
            c15099.f43105.m45777(new RunnableC8129(2, c15099, c4849));
        }
        if (c10485.mo14803().mo14812()) {
            return;
        }
        c10485.mo23233(m25940(c15973, c15973.f46262));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m25940(AbstractC7257 abstractC7257, C4848 c4848) throws Throwable {
        AbstractC14355 abstractC14355;
        HashSet hashSet = new HashSet();
        boolean zM10293 = c4848.m10293();
        C8374 c8374 = this.f31200;
        if (zM10293) {
            Object obj = c4848.f11034;
            AbstractC14355 abstractC14356 = (AbstractC14355) obj;
            abstractC14356.f18925 = m25935(abstractC14356.f18925, (AbstractC7257) obj, false, false, false);
            hashSet.add(c8374.m19459(((AbstractC14355) c4848.f11034).f18925));
            if (((AbstractC14355) c4848.f11034).f18925.mo14812()) {
                return ((AbstractC14355) c4848.f11034).f18925;
            }
            if (((AbstractC14355) c4848.f11034).f18925.m14777(EnumC11353.TYPEVAR)) {
                if (c4848.f11035.m10293()) {
                    AbstractC14355 abstractC14357 = (AbstractC14355) c4848.f11035.f11034;
                    abstractC14357.getClass();
                    this.f31202.m9352(abstractC14357, C8300.f22093);
                    return ((AbstractC14355) c4848.f11034).f18925;
                }
            } else {
                for (AbstractC14355 abstractC14358 : c4848.f11035) {
                    AbstractC6462 abstractC6462M25935 = m25935(abstractC14358.f18925, (AbstractC7257) abstractC14358, false, true, false);
                    abstractC14358.f18925 = abstractC6462M25935;
                    if (abstractC6462M25935.mo14812()) {
                        c4848 = C4848.m10276of((Object) abstractC14358);
                    } else if (abstractC14358.f18925.m14777(EnumC11353.CLASS)) {
                        this.f31163.m38315(abstractC14358, c8374.m19459(abstractC14358.f18925), hashSet);
                    }
                }
            }
        }
        if (c4848.m10289() == 0) {
            return this.f31193.f69208;
        }
        if (c4848.m10289() == 1) {
            return ((AbstractC14355) c4848.f11034).f18925;
        }
        C7921 c7921M19474 = c8374.m19474(C9268.m21400(c4848));
        if (((AbstractC14355) c4848.f11034).f18925.mo14789()) {
            abstractC14355 = null;
        } else {
            abstractC14355 = (AbstractC14355) c4848.f11034;
            c4848 = c4848.f11035;
        }
        C18537 c18537 = this.f31198;
        c18537.m42189((InterfaceC5323) abstractC7257);
        C7650 c7650M42151 = c18537.m42151(c18537.m42142(1025L), this.f31178.f21725, C4848.m10283(), abstractC14355, c4848, C4848.m10283());
        C15828 c15828 = (C15828) c7921M19474.f16705;
        c15828.mo18020();
        C1446.m31704((c15828.f20409 & 16777216) != 0);
        c7650M42151.f20027 = c15828;
        C4036 c4036 = this.f31160;
        c15828.f45858 = c4036.f8851.f7516;
        c15828.f20409 |= 268435456;
        this.f31168.getClass();
        this.f31171.m41757(c15828, C15492.m35237(c4036, c7650M42151));
        m25957(c15828);
        return c7921M19474;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3821(C17314 c17314) {
        AbstractC6462 abstractC6462M25963;
        EnumC17268 enumC17268 = c17314.f51642.f63851;
        EnumC17268 enumC17269 = EnumC17268.UNBOUND;
        C22004 c22004 = this.f31193;
        if (enumC17268 != enumC17269) {
            abstractC6462M25963 = m25963(c17314.f51641, this.f31160, AbstractC6462.f16700);
        } else {
            abstractC6462M25963 = c22004.f69208;
        }
        this.f31172 = m25943(c17314, new C21215(this.f31163.m38362(c17314, abstractC6462M25963), c17314.f51642.f63851, c22004.f69162), C17010.f50319, this.f31162);
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        C1446.m31702("should be handled in annotate");
        throw null;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        C4036 c4036 = this.f31160;
        for (C4848 c4848 = c19720.f59995; c4848.m10293(); c4848 = c4848.f11035) {
            m25963(((C19049) c4848.f11034).f56840, c4036, AbstractC6462.f16700);
        }
        final AbstractC6462 abstractC6462Mo14773 = m25963(c19720.f59996, this.f31160, AbstractC6462.f16700).mo14773(C16045.f46450);
        if (!((C10545) this.f31160.f8849).f29207) {
            final C4848 c4849 = c19720.f59995;
            final C15099 c15099 = this.f31199;
            c15099.getClass();
            c15099.f43105.m45777(new Runnable() { // from class: l.ᩴ᩹֨
                @Override // java.lang.Runnable
                public final void run() {
                    c15099.getClass();
                    C4848 c48410 = c4849;
                    C4848 c4848M34491 = C15099.m34491(c48410);
                    C1446.m31704(c48410.m10289() == c4848M34491.m10289());
                    abstractC6462Mo14773.m14774(EnumC24763.ANNOTATIONS).mo20111(new C16045(c4848M34491));
                }
            });
        }
        c19720.f18925 = abstractC6462Mo14773;
        this.f31172 = abstractC6462Mo14773;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3787(C5638 c5638) {
        C4848 c4848 = c5638.f13677;
        if (c4848 != null) {
            C4036 c4036 = this.f31160;
            C4036 c4036M8087 = c4036.m8087(c4036.f8850, c4036.f8849);
            ((C10545) c4036M8087.f8849).f29200 = this.f31177;
            Iterator it = c4848.iterator();
            while (it.hasNext()) {
                m25939((AbstractC7257) it.next(), c4036M8087, new C24626(this, C17010.f50316, this.f31162.f77965));
            }
        }
        C13956 c13956 = this.f31193.f69139;
        c5638.f18925 = c13956;
        this.f31172 = c13956;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25951(C4036 c4036) throws Throwable {
        int i = C3207.f6222[c4036.f8850.mo3383().ordinal()];
        C15099 c15099 = this.f31199;
        C16852 c16852 = this.f31163;
        if (i == 22) {
            AbstractC7257 abstractC7257 = c4036.f8850;
            abstractC7257.getClass();
            C2417 c2417 = ((C5777) c4036.f8850).f14182;
            try {
                c15099.m34515();
                C4036 c4036M41755 = this.f31168.f44238.m41755(c2417);
                m25937(c4036M41755.f8850, c4036M41755);
                return;
            } catch (C21865 e) {
                c16852.m38271(abstractC7257, e);
                return;
            }
        }
        if (i == 23) {
            AbstractC7257 abstractC7258 = c4036.f8850;
            abstractC7258.getClass();
            C9794 c9794 = ((C9800) c4036.f8850).f27116;
            try {
                c15099.m34515();
                AbstractC14355 abstractC14355 = ((C9800) this.f31171.m41755(c9794).f8850).f27115;
                abstractC14355.getClass();
                c16852.m38305(c9794, abstractC14355);
                return;
            } catch (C21865 e2) {
                c16852.m38271(abstractC7258, e2);
                return;
            }
        }
        AbstractC7257 abstractC7259 = c4036.f8850;
        abstractC7259.getClass();
        C15828 c15828 = c4036.f8855.f20027;
        try {
            c15099.m34515();
            m25957(c15828);
        } catch (C21865 e3) {
            c16852.m38271(abstractC7259, e3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25957(C15828 c15828) throws Throwable {
        C6953 c6953;
        InterfaceC19740 interfaceC19740;
        C24626 c24626;
        boolean z;
        C13370 c13370;
        if (!c15828.f20406.m14777(EnumC11353.ERROR)) {
            AbstractC6462 abstractC6462 = c15828.f20406;
            C16852 c16852 = this.f31163;
            c16852.m38347(null, abstractC6462);
            AbstractC6462 abstractC6463 = c15828.f20406;
            C8374 c8374 = this.f31200;
            AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6463);
            long j = c15828.f20409;
            if ((16777216 & j) == 0 && (j & 536870912) == 0) {
                EnumC11353 enumC11353 = EnumC11353.CLASS;
                if (abstractC6462M19502.m14777(enumC11353)) {
                    m25957((C15828) abstractC6462M19502.f16705);
                }
                AbstractC7783 abstractC7783 = c15828.f20407;
                if (abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.f20406.m14777(enumC11353)) {
                    m25957((C15828) c15828.f20407);
                }
                c15828.f20409 |= 536870912;
            }
            long j2 = c15828.f20409;
            if ((268435456 & j2) != 0) {
                c15828.f20409 = j2 & (-268435457);
                C4036 c4036M41755 = this.f31171.m41755(c15828);
                boolean zM18019 = c15828.m18019();
                C23623 c23623 = this.f31202;
                if (zM18019 && !c15828.m18009() && !c15828.f45852 && c15828.f45853.isEmpty()) {
                    c23623.m9352(C9268.m21405(c15828, c4036M41755.f8850, false), C8300.f22056);
                }
                boolean zM180110 = c15828.m18019();
                C22004 c22004 = this.f31193;
                if (zM180110) {
                    HashSet hashSet = new HashSet();
                    boolean z2 = c15828.m18008().f27063 == c22004.f69129 || c15828.m18008().f27063 == c22004.f69147;
                    for (Iterator it = c15828.f45853.iterator(); it.hasNext(); it = it) {
                        AbstractC7783 abstractC7784 = (AbstractC7783) it.next();
                        if (abstractC7784.f20406.mo5577() == EnumC11353.TYPEVAR) {
                            AbstractC7257 abstractC7257M21405 = C9268.m21405(abstractC7784, c4036M41755.f8850, false);
                            AbstractC6462 abstractC6464 = abstractC7784.f20406;
                            C13370 c13371 = C13665.f38450;
                            c23623.m9352(abstractC7257M21405, C8300.m19124(new C13370("compiler", "is.a.type.variable", abstractC6464)));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (abstractC7784.f20408.isEmpty() && !c15828.m18009()) {
                            AbstractC7257 abstractC7257M21406 = C9268.m21405(abstractC7784, c4036M41755.f8850, false);
                            C14040 c14040 = C8300.f21997;
                            c23623.m9352(abstractC7257M21406, new C14040("compiler", "local.classes.cant.extend.sealed", C13665.f38504));
                        }
                        if (hashSet.contains(abstractC7784)) {
                            InterfaceC5323 interfaceC5323 = (InterfaceC5323) ((C4848) C7480.stream(c4036M41755.f8855.f20023).filter(new C5580(1, abstractC7784)).limit(2L).collect(C4848.m10284())).get(1);
                            AbstractC6462 abstractC6465 = abstractC7784.f20406;
                            C13370 c13372 = C13665.f38450;
                            c23623.m9352(interfaceC5323, C8300.m19124(new C13370("compiler", "is.duplicated", abstractC6465)));
                        } else {
                            hashSet.add(abstractC7784);
                        }
                        if (z2) {
                            if (abstractC7784.m18008() != c15828.m18008()) {
                                AbstractC7257 abstractC7257M21407 = C9268.m21405(abstractC7784, c4036M41755.f8850, false);
                                C14040 c14041 = C8300.f21997;
                                c23623.m9352(abstractC7257M21407, new C14040("compiler", "class.in.unnamed.module.cant.extend.sealed.in.diff.package", c15828));
                            }
                        } else if (abstractC7784.m18008().f27063 != c15828.m18008().f27063) {
                            AbstractC7257 abstractC7257M21408 = C9268.m21405(abstractC7784, c4036M41755.f8850, false);
                            C2417 c2417 = c15828.m18008().f27063;
                            C14040 c14042 = C8300.f21997;
                            c23623.m9352(abstractC7257M21408, new C14040("compiler", "class.in.module.cant.extend.sealed.in.diff.module", c15828, c2417));
                        }
                        AbstractC6462 abstractC6466 = c15828.f20406;
                        if (abstractC7784 == abstractC6466.f16705 || c8374.m19476(abstractC7784.f20406, abstractC6466)) {
                            InterfaceC5323 interfaceC5324 = (InterfaceC5323) C7480.stream(((C7650) c4036M41755.f8850).f20023).map(new C7780(3, abstractC7784)).filter(new C6611(5)).findFirst().get();
                            if (abstractC7784 == c15828.f20406.f16705) {
                                c13370 = C13665.f38479;
                            } else {
                                AbstractC6462 abstractC6467 = abstractC7784.f20406;
                                C13370 c13373 = C13665.f38450;
                                c13370 = new C13370("compiler", "must.not.be.supertype", abstractC6467);
                            }
                            c23623.m9352(interfaceC5324, C8300.m19124(c13370));
                        } else if (!z && !C7480.stream(c8374.m19505(abstractC7784.f20406)).anyMatch(new C17050(0, c15828))) {
                            AbstractC7257 abstractC7257M21409 = C9268.m21405(abstractC7784, c4036M41755.f8850, false);
                            AbstractC6462 abstractC6468 = abstractC7784.f20406;
                            C13370 c13374 = C13665.f38450;
                            c23623.m9352(abstractC7257M21409, C8300.m19124(new C13370("compiler", "doesnt.extend.sealed", abstractC6468)));
                        }
                        abstractC6462M19502 = abstractC6462M19502;
                        c22004 = c22004;
                    }
                }
                C22004 c22005 = c22004;
                AbstractC6462 abstractC6469 = abstractC6462M19502;
                C4848<C15828> c4848 = (C4848) C7480.stream(c8374.m19505(c15828.f20406)).filter(new C23087(0)).map(new C22964(5)).collect(C4848.m10284());
                if (!c4848.isEmpty()) {
                    if (c15828.m17996() && !c15828.m18009()) {
                        AbstractC7257 abstractC7257M214010 = C9268.m21405(c15828, c4036M41755.f8850, false);
                        C13370 c13375 = c15828.f20408.isEmpty() ? C13665.f38504 : C13665.f38508;
                        C14040 c14043 = C8300.f21997;
                        c23623.m9352(abstractC7257M214010, new C14040("compiler", "local.classes.cant.extend.sealed", c13375));
                    }
                    if (!c15828.f20406.mo7388()) {
                        for (C15828 c15829 : c4848) {
                            if (!c15829.f45853.contains(c15828.f20406.f16705)) {
                                AbstractC7257 abstractC7257M214011 = C9268.m21405(c15828.f20406.f16705, c4036M41755.f8850, false);
                                C14040 c14044 = C8300.f21997;
                                c23623.m9352(abstractC7257M214011, new C14040("compiler", "cant.inherit.from.sealed", c15829));
                            }
                        }
                        long j3 = c15828.f20409;
                        if ((j3 & Long.MIN_VALUE) == 0 && (j3 & 16) == 0 && !c15828.m18019()) {
                            c23623.m9352(C9268.m21405(c15828, c4036M41755.f8850, false), c15828.m17989() ? C8300.f22028 : C8300.f21995);
                        }
                    }
                } else if ((c15828.f20409 & Long.MIN_VALUE) != 0 && !C7480.stream(c8374.m19505(c15828.f20406)).anyMatch(new C19744(2))) {
                    AbstractC7257 abstractC7257M214012 = C9268.m21405(c15828, c4036M41755.f8850, false);
                    C14040 c14045 = C8300.f21997;
                    c23623.m9352(abstractC7257M214012, new C14040("compiler", "non.sealed.with.no.sealed.supertype", c15828));
                }
                C4036 c4036 = c4036M41755;
                while (true) {
                    c6953 = ((C10545) c4036.f8849).f29205;
                    if (c6953 != null) {
                        break;
                    } else {
                        c4036 = c4036.f8848;
                    }
                }
                Object obj = c4036M41755.f8849;
                ((C10545) obj).f29205 = c6953.m15933(c15828);
                C10545 c10545 = (C10545) obj;
                C6953 c6953M38273 = c16852.m38273(c10545.f29205);
                InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c15828.f45858);
                C24626 c24627 = c10545.f29200;
                try {
                    this.f31197.m44731(c4036M41755.f8850);
                    ((C10545) obj).f29200 = null;
                    if (abstractC6469.f16705 == c22005.f69209) {
                        interfaceC19740 = interfaceC19740M9363;
                        c24626 = c24627;
                        try {
                            if ((c15828.f20409 & 16793600) == 0) {
                                AbstractC7257 abstractC7257 = c4036M41755.f8850;
                                abstractC7257.getClass();
                                c23623.m9352(abstractC7257, C8300.f22052);
                            }
                        } catch (Throwable th) {
                            th = th;
                            c10545.f29200 = c24626;
                            c23623.m9363(interfaceC19740);
                            c16852.m38273(c6953M38273);
                            throw th;
                        }
                    } else {
                        interfaceC19740 = interfaceC19740M9363;
                        c24626 = c24627;
                    }
                    AbstractC21195 abstractC21195 = abstractC6469.f16705;
                    if (abstractC21195 != null && (abstractC21195.f20409 & 16384) != 0 && (c15828.f20409 & 16793600) == 0) {
                        AbstractC7257 abstractC7258 = c4036M41755.f8850;
                        abstractC7258.getClass();
                        c23623.m9352(abstractC7258, C8300.f22106);
                    }
                    if (m25960(c15828.f20406)) {
                        ((C10545) obj).f29203 = true;
                    }
                    m25920(c15828, c4036M41755);
                    AbstractC7257 abstractC7259 = c4036M41755.f8850;
                    abstractC7259.getClass();
                    c16852.m38305((AbstractC7783) c15828, abstractC7259);
                    AbstractC7257 abstractC72510 = c4036M41755.f8850;
                    abstractC72510.getClass();
                    c16852.m38300(abstractC72510, c15828);
                    c16852.m38303((C7650) c4036M41755.f8850, c15828);
                    c16852.m38280(c4036M41755, (C7650) c4036M41755.f8850);
                    c10545.f29200 = c24626;
                    c23623.m9363(interfaceC19740);
                    c16852.m38273(c6953M38273);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC19740 = interfaceC19740M9363;
                    c24626 = c24627;
                }
            }
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        C2417 c2417 = c5777.f14182;
        InterfaceC8453 interfaceC8453 = c2417.f3699;
        InterfaceC8453 interfaceC8454 = InterfaceC8453.f22683;
        if (interfaceC8453 != interfaceC8454) {
            c2417.f3699 = interfaceC8454;
            interfaceC8453.mo9171(c2417);
        }
        C2417 c2418 = c5777.f14182;
        C10545 c10545 = (C10545) this.f31160.f8852.f8849;
        C6953 c6953M15933 = c10545.f29205.m15933(c2418);
        c10545.f29205 = c6953M15933;
        C16852 c16852 = this.f31163;
        C6953 c6953M38273 = c16852.m38273(c6953M15933);
        c16852.m38293(c5777);
        c16852.m38305(c2418, c5777);
        try {
            this.f31197.m44731((AbstractC7257) c5777);
        } finally {
            c16852.m38273(c6953M38273);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25920(C15828 c15828, C4036 c4036) throws Throwable {
        C8200 c8200;
        long j;
        C13818 c13818;
        C19049 c19049;
        AbstractC7257 abstractC7257 = c4036.f8850;
        Object obj = c4036.f8849;
        C7650 c7650 = (C7650) abstractC7257;
        C1446.m31704(c15828 == c7650.f20027);
        m25965(c7650.f20026, c4036);
        boolean zIsEmpty = c15828.f20408.isEmpty();
        C16852 c16852 = this.f31163;
        if (!zIsEmpty) {
            c16852.m38283(c7650.f20026, c4036);
            c16852.m38298((AbstractC7257) c7650.f20025, c4036, true);
            c16852.m38283(c7650.f20024, c4036);
        }
        C8374 c8374 = this.f31200;
        c15828.m35945(c8374);
        c15828.mo18020();
        if ((c15828.f20409 & 1536) == 0) {
            c16852.m38318(c15828, (InterfaceC5323) c7650);
        }
        c15828.mo18020();
        long j2 = c15828.f20409 & 8192;
        C23623 c23623 = this.f31202;
        if (j2 != 0) {
            if (c7650.f20024.m10293()) {
                AbstractC14355 abstractC14355 = (AbstractC14355) c7650.f20024.f11034;
                abstractC14355.getClass();
                c23623.m9352(abstractC14355, C8300.f22152);
            }
            if (c7650.f20026.m10293()) {
                C15973 c15973 = (C15973) c7650.f20026.f11034;
                c15973.getClass();
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c15973, new C14040("compiler", "intf.annotation.cant.have.type.params", c15828));
            }
            C17939 c17939Mo38741 = c15828.mo35948().mo38741();
            if (c17939Mo38741 != null) {
                AbstractC6462 abstractC6462 = c17939Mo38741.f29256;
                C4848 c4848 = c7650.f20022.f9953;
                while (true) {
                    if (c4848.isEmpty()) {
                        c19049 = null;
                        break;
                    } else {
                        if (c8374.m19490(((C19049) c4848.f11034).f56840.f18925, abstractC6462)) {
                            c19049 = (C19049) c4848.f11034;
                            c19049.getClass();
                            break;
                        }
                        c4848 = c4848.f11035;
                    }
                }
                C1446.m31699(c19049);
                c16852.m38319(c15828, c17939Mo38741, c19049);
            }
        } else {
            c16852.m38351(c7650, c15828.f20406);
            if (this.f31161) {
                c16852.m38356(c7650, c15828.f20406);
            }
        }
        AbstractC6462 abstractC6463 = c15828.f20406;
        c16852.getClass();
        c16852.m38285(c7650, new HashMap(), abstractC6463);
        c7650.f18925 = c15828.f20406;
        for (C4848 c4849 = c7650.f20026; c4849.m10293(); c4849 = c4849.f11035) {
            C1446.m31699(((C10545) obj).f29201.mo22458(((C15973) c4849.f11034).f46261, (Predicate) null));
        }
        if (!c15828.f20406.mo14798().isEmpty() && c8374.m19486(c15828.f20406, this.f31193.f69161, true)) {
            AbstractC14355 abstractC14356 = c7650.f20025;
            abstractC14356.getClass();
            c23623.m9352(abstractC14356, C8300.f22142);
        }
        C15828 c15829 = c7650.f20027;
        c16852.m38301((AbstractC7257) c7650, c15829, c15829);
        m25953((InterfaceC5323) c7650, c4036, c15828.f20406);
        C4848 c48410 = c7650.f20020;
        while (true) {
            boolean zM10293 = c48410.m10293();
            c8200 = this.f31178;
            if (!zM10293) {
                break;
            }
            m25937((AbstractC7257) c48410.f11034, c4036);
            if (!this.f31194 && c15828.f20407.f20405 != EnumC3600.f7351) {
                c15828.mo18020();
                if (((c15828.f20409 & 8) == 0 || c15828.f20408 == c8200.f21725) && (C9268.m21439((AbstractC7257) c48410.f11034) & 520) != 0) {
                    C13818 c13819 = ((AbstractC7257) c48410.f11034).m16617(EnumC19998.f60802) ? ((C11281) c48410.f11034).f31438 : null;
                    if (c13819 == null || c13819.f20405 != EnumC3600.f7339 || c13819.m31487() == null) {
                        AbstractC7257 abstractC7258 = (AbstractC7257) c48410.f11034;
                        abstractC7258.getClass();
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(abstractC7258, new C14040("compiler", "icls.cant.have.static.decl", c15828));
                    }
                }
            }
            c48410 = c48410.f11035;
        }
        c16852.m38302(c7650);
        long j3 = c7650.f20027.f20409;
        if ((j3 & 8192) != 0) {
            C1446.m31704((j3 & 134217728) == 0);
            try {
                j = 34359738368L;
                try {
                    c7650.f20027.f20409 |= 134217728;
                    for (AbstractC7257 abstractC7259 : c7650.f20020) {
                        if (abstractC7259.m16617(EnumC19998.f60735)) {
                            C10471 c10471 = (C10471) abstractC7259;
                            c16852.m38310(c10471, c10471.f28966.f18925);
                        }
                    }
                    C15828 c158210 = c7650.f20027;
                    c158210.f20409 = ((-134217729) & c158210.f20409) | 34359738368L;
                } catch (Throwable th) {
                    th = th;
                    C15828 c158211 = c7650.f20027;
                    c158211.f20409 = (c158211.f20409 & (-134217729)) | j;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = 34359738368L;
            }
        }
        C10545 c10545 = (C10545) obj;
        if (c10545.f29205.m15935(EnumC21706.SERIAL) && m25960(c15828.f20406)) {
            c15828.mo18020();
            if ((c15828.f20409 & 16896) == 0 && !c15828.f20408.isEmpty()) {
                c15828.mo18020();
                Iterator it = c15828.f45850.m22456(c8200.f21653).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c13818 = null;
                        break;
                    }
                    AbstractC7783 abstractC7783 = (AbstractC7783) it.next();
                    if (abstractC7783.f20405 == EnumC3600.f7339) {
                        c13818 = (C13818) abstractC7783;
                        break;
                    }
                }
                if (c13818 != null) {
                    C6953 c6953M15933 = c10545.f29205.m15933(c13818);
                    EnumC21706 enumC21706 = EnumC21706.SERIAL;
                    if (!c6953M15933.m15936(enumC21706)) {
                        if ((c13818.f20409 & 24) != 24) {
                            AbstractC7257 abstractC7257M21405 = C9268.m21405(c13818, c7650, false);
                            C12895 c12895 = C15675.f45417;
                            c23623.m9365(enumC21706, abstractC7257M21405, new C12895("compiler", "improper.SVUID", c15828));
                        } else if (!c13818.f20406.m14777(EnumC11353.LONG)) {
                            AbstractC7257 abstractC7257M21406 = C9268.m21405(c13818, c7650, false);
                            C12895 c12896 = C15675.f45417;
                            c23623.m9365(enumC21706, abstractC7257M21406, new C12895("compiler", "long.SVUID", c15828));
                        } else if (c13818.m31487() == null) {
                            AbstractC7257 abstractC7257M21407 = C9268.m21405(c13818, c7650, false);
                            C12895 c12897 = C15675.f45417;
                            c23623.m9365(enumC21706, abstractC7257M21407, new C12895("compiler", "constant.SVUID", c15828));
                        }
                    }
                } else if (!c15828.m35942()) {
                    EnumC21706 enumC21707 = EnumC21706.SERIAL;
                    C12895 c12898 = C15675.f45417;
                    c23623.m9365(enumC21707, c7650, new C12895("compiler", "missing.SVUID", c15828));
                }
            }
        }
        if (this.f31204) {
            this.f31205.m42758(c7650);
            m25954((AbstractC7257) c7650, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25960(AbstractC6462 abstractC6462) {
        C22004 c22004 = this.f31193;
        try {
            c22004.f69169.mo14782();
            return this.f31200.m19486(abstractC6462, c22004.f69169, true);
        } catch (C21865 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25918(C11281 c11281, AbstractC6462 abstractC6462) {
        boolean zMo14812 = abstractC6462.mo14812();
        C18537 c18537 = this.f31198;
        if (zMo14812) {
            c18537.f55352 = -1;
            c11281.f31437 = c18537.m42191();
        } else {
            c18537.f55352 = -1;
            c11281.f31437 = c18537.m42208(abstractC6462);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25954(AbstractC7257 abstractC7257, boolean z) {
        abstractC7257.mo3382(new C21945(this, z));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25966(AbstractC7257 abstractC7257) {
        new C19262(this).mo12739(abstractC7257);
    }
}
