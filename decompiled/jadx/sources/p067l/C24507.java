package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.stateless.C0791b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes.dex */
public final class C24507 extends C24572 {

    /* JADX INFO: renamed from: ܺ֫ */
    public static final C6468 f77534 = new C6468();

    /* JADX INFO: renamed from: ֡ */
    public C10471 f77535;

    /* JADX INFO: renamed from: ֨ */
    public final boolean f77536;

    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC20590 f77537;

    /* JADX INFO: renamed from: ۘ */
    public HashMap f77540;

    /* JADX INFO: renamed from: ۙ */
    public HashMap f77541;

    /* JADX INFO: renamed from: ۚ */
    public C5771 f77542;

    /* JADX INFO: renamed from: ۛ */
    public final C8200 f77543;

    /* JADX INFO: renamed from: ۜ */
    public C15828 f77544;

    /* JADX INFO: renamed from: ۜ֫ */
    public C20271 f77545;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC7257 f77546;

    /* JADX INFO: renamed from: ۠ */
    public final boolean f77547;

    /* JADX INFO: renamed from: ۡ */
    public final C6795 f77548;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C8374 f77549;

    /* JADX INFO: renamed from: ۢ */
    public C4036 f77550;

    /* JADX INFO: renamed from: ۢ֫ */
    public final C18318 f77551;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC5323 f77552;

    /* JADX INFO: renamed from: ۧ */
    public C4848 f77553;

    /* JADX INFO: renamed from: ۧ֫ */
    public HashMap f77554;

    /* JADX INFO: renamed from: ۨ */
    public final C12004 f77555;

    /* JADX INFO: renamed from: ۫ */
    public C18537 f77556;

    /* JADX INFO: renamed from: ۬ */
    public final C23623 f77557;

    /* JADX INFO: renamed from: ܰ */
    public C7650 f77558;

    /* JADX INFO: renamed from: ܳ */
    public C20271 f77559;

    /* JADX INFO: renamed from: ܳ֫ */
    public C5771 f77560;

    /* JADX INFO: renamed from: ܶ */
    public final AbstractC12224 f77561;

    /* JADX INFO: renamed from: ܺ */
    public final C16852 f77562;

    /* JADX INFO: renamed from: ܽ */
    public HashMap f77563;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f77565;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C22004 f77566;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f77567;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C23663 f77568;

    /* JADX INFO: renamed from: ᩵ */
    public C15828 f77570;

    /* JADX INFO: renamed from: ᩷ */
    public final C11216 f77572;

    /* JADX INFO: renamed from: ᩷֫ */
    public AbstractC15689 f77573;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC14355 f77574;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC13884 f77575;

    /* JADX INFO: renamed from: ᩺ */
    public C4848 f77576;

    /* JADX INFO: renamed from: ᩻ */
    public HashMap f77577;

    /* JADX INFO: renamed from: ᩻֫ */
    public final EnumC12720 f77578;

    /* JADX INFO: renamed from: ܽ֫ */
    public WeakHashMap f77564 = new WeakHashMap();

    /* JADX INFO: renamed from: ۗ */
    public HashMap f77539 = null;

    /* JADX INFO: renamed from: ۖ */
    public C14449 f77538 = new C14449(this);

    /* JADX INFO: renamed from: ᩶ */
    public LinkedHashMap f77571 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩴ */
    public AbstractC2562 f77569 = new C23837(this);

    /* JADX INFO: renamed from: ֫ */
    public static C24507 m54026(C5127 c5127) {
        C24507 c24507 = (C24507) c5127.m10905(f77534);
        return c24507 == null ? new C24507(c5127) : c24507;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7650 m54050(C15828 c15828) {
        AbstractC7257 abstractC7257;
        C7650 c7650 = (C7650) this.f77540.get(c15828);
        C14449 c14449 = this.f77538;
        if (c7650 == null && (abstractC7257 = this.f77546) != null) {
            c14449.getClass();
            abstractC7257.mo3382(c14449);
            c7650 = (C7650) this.f77540.get(c15828);
        }
        if (c7650 != null) {
            return c7650;
        }
        c14449.mo12739(this.f77558);
        return (C7650) this.f77540.get(c15828);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m54066(C15828 c15828) {
        C4848 c4848 = (C4848) this.f77541.get(c15828);
        if (c4848 != null) {
            return c4848;
        }
        if (!c15828.f20407.f20405.m6623(C17010.f50315)) {
            C15828 c15829 = null;
            if (c15828.m17996()) {
                AbstractC7783 abstractC7783 = c15828.f20407;
                while (abstractC7783.f20407.f20405.m6623(C17010.f50319) && abstractC7783.m17996()) {
                    abstractC7783 = abstractC7783.f20407;
                }
                if (abstractC7783.f20407.f20405.m6623(C17010.f50315) && c15828.mo17999(abstractC7783, this.f77549)) {
                    c15829 = (C15828) abstractC7783;
                }
            }
            if (c15829 != null) {
                C4848 c4849 = (C4848) this.f77541.get(c15829);
                this.f77541.put(c15828, c4849);
                return c4849;
            }
            return C4848.m10283();
        }
        C8414 c8414 = new C8414(this, c15828);
        c8414.mo12739(m54050(c15828));
        C4848 c48410 = c8414.f22561;
        this.f77541.put(c15828, c48410);
        return c48410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18537 m54063(InterfaceC5323 interfaceC5323) {
        this.f77552 = interfaceC5323;
        C18537 c18537 = this.f77556;
        c18537.m42189(interfaceC5323);
        return c18537;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24552 m54065(Object obj, AbstractC6462 abstractC6462) {
        C24552 c24552M42187 = this.f77556.m42187(abstractC6462.mo5577(), obj);
        c24552M42187.f18925 = abstractC6462.mo5576(obj);
        return c24552M42187;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C24552 m54072() {
        return m54065((Object) null, this.f77566.f69204);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20530 m54064(AbstractC6462 abstractC6462, C4848 c4848) {
        C18537 c18537 = this.f77556;
        C20530 c20530M42182 = c18537.m42182((AbstractC14355) null, (C4848) null, c18537.m42197(abstractC6462.f16705), c4848, (C7650) null, false);
        c20530M42182.f63427 = this.f77568.m52652(this.f77552, this.f77550, abstractC6462, C9268.m21400(c4848), C4848.m10283());
        c20530M42182.f18925 = abstractC6462;
        return c20530M42182;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8598 m54053(EnumC19998 enumC19998, AbstractC14355 abstractC14355) {
        C8598 c8598M42156 = this.f77556.m42156(enumC19998, abstractC14355);
        C3088 c3088M27497 = this.f77555.m27497(c8598M42156, enumC19998, abstractC14355.f18925);
        c8598M42156.f5602 = c3088M27497;
        c8598M42156.f18925 = c3088M27497.f20406.mo14787();
        return c8598M42156;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11003 m54054(EnumC19998 enumC19998, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        C11003 c11003M42162 = this.f77556.m42162(enumC19998, abstractC14355, abstractC14356);
        C3088 c3088M27496 = this.f77555.m27496(c11003M42162, enumC19998, abstractC14355.f18925, abstractC14356.f18925);
        c11003M42162.f5602 = c3088M27496;
        c11003M42162.f18925 = c3088M27496.f20406.mo14787();
        return c11003M42162;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7650 m54051(C15828 c15828, AbstractC12224 abstractC12224, boolean z) {
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12225 = c8200.f21725;
        C22004 c22004 = this.f77566;
        C15828 c15828M49589 = c22004.m49589(abstractC12225, c15828);
        C16852 c16852 = this.f77562;
        if (abstractC12224 != null) {
            c15828M49589.f45859 = abstractC12224;
        } else {
            c15828M49589.f45859 = c16852.m38349(c15828M49589);
        }
        c15828M49589.f45858 = c15828.f45858;
        c15828M49589.f20410 = InterfaceC8453.f22683;
        c15828M49589.f45850 = AbstractC15689.m35727(c15828M49589);
        c15828M49589.f20409 = 4104L;
        C21333 c21333 = (C21333) c15828M49589.f20406;
        c21333.f67259 = c22004.f69208;
        c21333.f67261 = C4848.m10283();
        C7650 c7650M54050 = m54050(c15828);
        c7650M54050.getClass();
        c15828.mo18020();
        c15828.f45850.mo28415(c15828M49589);
        c16852.m38360(c15828M49589);
        C18537 c18537 = this.f77556;
        C7650 c7650M42151 = c18537.m42151(c18537.m42142(4104L), c8200.f21725, C4848.m10283(), (AbstractC14355) null, C4848.m10283(), C4848.m10283());
        c7650M42151.f20027 = c15828M49589;
        c7650M42151.f18925 = c15828M49589.f20406;
        if (z) {
            c7650M54050.f20020 = c7650M54050.f20020.m10290(c7650M42151);
        }
        return c7650M42151;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C5771 m54013(InterfaceC5323 interfaceC5323, AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, C4848 c4848) {
        return this.f77568.m52640(interfaceC5323, this.f77550, abstractC6462, abstractC12224, c4848, C4848.m10283());
    }

    /* JADX INFO: renamed from: ܿ */
    private void m54040() {
        for (C4848 c4848 = this.f77553; c4848.m10293(); c4848 = c4848.f11035) {
            C15828 c15828 = (C15828) c4848.f11034;
            Iterator it = this.f77545.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C7650 c7650M54051 = m54051(c15828.mo3350(), c15828.f45859, false);
                    C15828 c15829 = c7650M54051.f20027;
                    for (C5771 c5771 : this.f77563.values()) {
                        C1446.m31704(c5771.f20406.m14777(EnumC11353.METHOD));
                        C12497 c12497 = (C12497) c5771.f20406;
                        C4848 c4849 = c12497.f35030;
                        if (((AbstractC6462) c4849.f11034).f16705 == c15828) {
                            C4848 c48410 = c4849.f11035;
                            C8374 c8374 = this.f77549;
                            c5771.f20406 = c8374.m19427(c12497, c48410.m10290(c15829.mo18010(c8374)));
                        }
                    }
                    this.f77545.m45777(c7650M54051);
                    break;
                }
                AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
                if (abstractC7257.m16617(EnumC19998.f60806) && ((C7650) abstractC7257).f20027 == c15828) {
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m54070(AbstractC7783 abstractC7783) {
        AbstractC7783 abstractC7784;
        if (this.f77578.m29254() || (abstractC7783.mo18003() & 2) == 0 || (abstractC7784 = abstractC7783.f20407) == this.f77570) {
            return false;
        }
        if (abstractC7783.f20408 != this.f77543.f21737 || !abstractC7784.m17996()) {
            return true;
        }
        abstractC7783.f20409 &= -3;
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m54033(AbstractC14355 abstractC14355) {
        C15828 c15828 = this.f77570;
        WeakHashMap weakHashMap = this.f77564;
        C4848 c4848 = (C4848) weakHashMap.get(c15828);
        weakHashMap.put(this.f77570, c4848 == null ? C4848.m10276of((Object) abstractC14355) : c4848.m10290(abstractC14355));
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54058(AbstractC7783 abstractC7783, AbstractC14355 abstractC14355, AbstractC14355 abstractC14356, boolean z) {
        EnumC3600 enumC3600;
        HashMap map;
        AbstractC7783 abstractC7784;
        boolean z2;
        boolean z3;
        AbstractC14355 abstractC14355M54061;
        C15828 c15828M17990;
        int iM5227;
        C4848 c4848M10276of;
        AbstractC6462 abstractC6462Mo18010;
        C4848 c4848M10283;
        C4848 c4848M10290;
        int i;
        C4848 c4848;
        Object objM31487;
        AbstractC7783 abstractC7785 = abstractC7783;
        AbstractC14355 abstractC14355M42157 = abstractC14355;
        while (true) {
            EnumC3600 enumC3601 = abstractC7785.f20405;
            enumC3600 = EnumC3600.f7339;
            if (enumC3601 != enumC3600) {
                break;
            }
            AbstractC7783 abstractC7786 = abstractC7785.f20407;
            if (abstractC7786.f20405 != EnumC3600.f7343 || abstractC7786.m17990() == this.f77570) {
                break;
            }
            Object objM31488 = ((C13818) abstractC7785).m31487();
            if (objM31488 != null) {
                this.f77556.f55352 = abstractC14355M42157.f18924;
                return m54065(objM31488, abstractC7785.f20406);
            }
            HashMap map2 = this.f77539;
            if (map2 != null && map2.get(abstractC7785) != null) {
                C18537 c18537 = this.f77556;
                c18537.f55352 = abstractC14355M42157.f18924;
                return c18537.m42157((AbstractC7783) this.f77539.get(abstractC7785));
            }
            abstractC7785 = (AbstractC7783) this.f77554.get(abstractC7785);
            C1446.m31704((abstractC7785 == null || (abstractC7785.f20409 & 16) == 0) ? false : true);
            C18537 c18538 = this.f77556;
            c18538.f55352 = abstractC14355M42157.f18924;
            abstractC14355M42157 = c18538.m42157(abstractC7785);
        }
        EnumC19998 enumC19998 = EnumC19998.f60805;
        AbstractC14355 abstractC14355M42197 = abstractC14355M42157.m16617(enumC19998) ? ((C8320) abstractC14355M42157).f22261 : null;
        int i2 = C7073.f18422[abstractC7785.f20405.ordinal()];
        if (i2 == 1 || i2 == 2) {
            EnumC3600 enumC3602 = abstractC7785.f20407.f20405;
            if (enumC3602 == EnumC3600.f7354) {
                C8200 c8200 = this.f77543;
                C8374 c8374 = this.f77549;
                if (!z || m54070(abstractC7785)) {
                    if (this.f77547 || (abstractC7785.mo18003() & 4) == 0 || abstractC7785.f20407.f20407 == this.f77570.f20407 || abstractC7785.m18008() == this.f77570.m18008()) {
                        z2 = false;
                    } else if (!this.f77570.mo17999(abstractC7785.f20407, c8374)) {
                        z2 = true;
                    } else if ((abstractC7785.mo18003() & 8) == 0 && abstractC14355M42157.m16617(enumC19998)) {
                        C8320 c8320 = (C8320) abstractC14355M42157;
                        if (C9268.m21428(c8320.f22261) == c8200.f21756) {
                            z2 = false;
                        } else {
                            z2 = !c8320.f22261.f18925.f16705.mo17999((AbstractC7783) this.f77570, c8374);
                        }
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = true;
                }
                boolean z4 = z3 || m54070(abstractC7785);
                C22004 c22004 = this.f77566;
                boolean z5 = (abstractC14355M42197 != null || abstractC7785.f20407 == c22004.f69140 || abstractC7785.m17986((AbstractC21195) this.f77570, c8374)) ? false : true;
                if (z4 || z5) {
                    this.f77556.f55352 = abstractC14355M42157.f18924;
                    if (abstractC7785.f20405 == enumC3600 && (objM31487 = ((C13818) abstractC7785).m31487()) != null) {
                        m54033(abstractC14355M42157);
                        return m54065(objM31487, abstractC7785.f20406);
                    }
                    if (z4) {
                        C4848 c4848M10284 = C4848.m10283();
                        if ((abstractC7785.mo18003() & 8) == 0) {
                            if (abstractC14355M42197 == null) {
                                abstractC14355M42197 = m54061(abstractC14355M42157, abstractC7785, true);
                            }
                            c4848M10284 = c4848M10284.m10290(abstractC14355M42197);
                            abstractC14355M42197 = null;
                        }
                        if (z && z3) {
                            c15828M17990 = (C15828) ((C8320) abstractC14355M42157).f22261.f18925.f16705;
                        } else if (z3) {
                            C15828 c15828M17991 = this.f77570;
                            if (abstractC14355M42157.m16617(enumC19998) && (abstractC7785.mo18003() & 8) == 0) {
                                AbstractC21195 abstractC21195 = ((C8320) abstractC14355M42157).f22261.f18925.f16705;
                                while (!abstractC21195.mo17999((AbstractC7783) c15828M17991, c8374)) {
                                    c15828M17991 = c15828M17991.f20407.m17990();
                                }
                            } else {
                                while (!c15828M17991.mo17999(abstractC7785.f20407, c8374)) {
                                    c15828M17991 = c15828M17991.f20407.m17990();
                                }
                            }
                            c15828M17990 = c15828M17991;
                        } else {
                            c15828M17990 = abstractC7785.f20407.m17990();
                        }
                        if (abstractC7785.f20407 != c15828M17990) {
                            AbstractC7783 abstractC7783Mo9256 = abstractC7785.mo9256(c15828M17990);
                            this.f77577.put(abstractC7783Mo9256, abstractC7785);
                            abstractC7785 = abstractC7783Mo9256;
                        }
                        Integer numValueOf = (Integer) this.f77567.get(abstractC7785);
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(this.f77559.m45780());
                            this.f77567.put(abstractC7785, numValueOf);
                            this.f77565.put(abstractC7785, new C5771[EnumC7112.f18556]);
                            this.f77559.m45777(abstractC7785);
                        }
                        int i3 = C7073.f18422[abstractC7785.f20405.ordinal()];
                        if (i3 == 1) {
                            if (abstractC14356 == null) {
                                iM5227 = EnumC7112.f18549.f18559;
                            } else if (abstractC14356.m16617(EnumC19998.f60746) && abstractC14355M42157 == C9268.m21424(((C22403) abstractC14356).f70670)) {
                                iM5227 = EnumC7112.f18550.f18559;
                            } else if (abstractC14356.mo3383().m45371() || abstractC14356.mo3383().m45370()) {
                                AbstractC3094 abstractC3094 = (AbstractC3094) abstractC14356;
                                if (abstractC14355M42157 == C9268.m21424(abstractC3094.mo5247(EnumC7118.LEFT))) {
                                    iM5227 = abstractC3094.f5602.m5227(abstractC14356.mo3383());
                                } else {
                                    iM5227 = EnumC7112.f18549.f18559;
                                }
                            } else {
                                iM5227 = EnumC7112.f18549.f18559;
                            }
                            if (iM5227 >= EnumC7112.f18555.f18559) {
                                C3088 c3088M27498 = this.f77555.m27498(new C17130(abstractC14356.mo3383(), iM5227));
                                c4848M10276of = c3088M27498.f5586 == 256 ? C4848.m10276of((Object) c22004.f69208) : c3088M27498.f20406.mo14797().f11035;
                            } else {
                                c4848M10276of = iM5227 == EnumC7112.f18550.f18559 ? C4848.m10276of((Object) abstractC7785.mo18010(c8374)) : C4848.m10283();
                            }
                            abstractC6462Mo18010 = abstractC7785.mo18010(c8374);
                            c4848M10283 = C4848.m10283();
                            int i4 = iM5227;
                            c4848M10290 = c4848M10276of;
                            i = i4;
                        } else {
                            if (i3 != 2) {
                                throw new AssertionError();
                            }
                            i = EnumC7112.f18549.f18559;
                            c4848M10290 = abstractC7785.mo18010(c8374).mo14797();
                            abstractC6462Mo18010 = abstractC7785.mo18010(c8374).mo14787();
                            c4848M10283 = abstractC7785.f20406.mo14794();
                        }
                        if (z3 && z) {
                            i++;
                        }
                        if ((abstractC7785.mo18003() & 8) == 0) {
                            c4848M10290 = c4848M10290.m10290(abstractC7785.f20407.mo18010(c8374));
                        }
                        C5771[] c5771Arr = (C5771[]) this.f77565.get(abstractC7785);
                        C5771 c5771 = c5771Arr[i];
                        if (c5771 == null) {
                            C15828 c15828 = c15828M17990;
                            c4848 = c4848M10284;
                            c5771 = new C5771((c15828M17990.m17989() ? 1 : 0) | C0719o.a.f2902h, c8200.f21738.m32717(C0655am.f2262Q + this.f77578.m29249() + numValueOf.intValue() + (i / 10) + (i % 10)), new C12497(c4848M10290, abstractC6462Mo18010, c4848M10283, c22004.f69163), c15828);
                            c15828.mo18020();
                            c15828.f45850.mo28415(c5771);
                            c5771Arr[i] = c5771;
                        } else {
                            c4848 = c4848M10284;
                        }
                        C18537 c18539 = this.f77556;
                        if (abstractC14355M42197 == null) {
                            abstractC14355M42197 = c18539.m42197(c5771.f20407);
                        }
                        return this.f77556.m42200((AbstractC14355) c18539.m42154(abstractC14355M42197, c5771), c4848);
                    }
                    if (z5) {
                        C18537 c185310 = this.f77556;
                        c185310.f55352 = abstractC14355M42157.f18924;
                        if ((abstractC7785.mo18003() & 8) != 0) {
                            C18537 c185311 = this.f77556;
                            c185311.f55352 = C9268.m21421(abstractC14355M42157);
                            abstractC14355M54061 = m54059(c185311.m42197(abstractC7785.f20407));
                        } else {
                            abstractC14355M54061 = m54061(abstractC14355M42157, abstractC7785, true);
                        }
                        C8320 c8320M42154 = c185310.m42154(abstractC14355M54061, abstractC7785);
                        c8320M42154.f18925 = abstractC14355M42157.f18925;
                        return c8320M42154;
                    }
                }
            } else if (enumC3602 == EnumC3600.f7343 && (map = this.f77539) != null && (abstractC7784 = (AbstractC7783) map.get(abstractC7785.mo9143())) != null) {
                C18537 c185312 = this.f77556;
                c185312.f55352 = abstractC14355M42157.f18924;
                return c185312.m42157(abstractC7784);
            }
        } else if (i2 == 3 && abstractC7785.f20407.f20405 != EnumC3600.f7351) {
            AbstractC12224 abstractC12224M33177 = C14514.m33177(abstractC7785.mo18002());
            while (abstractC14355M42197 != null && C9268.m21438(abstractC14355M42197) != null && C9268.m21438(abstractC14355M42197).f20405 != EnumC3600.f7351) {
                abstractC14355M42197 = abstractC14355M42197.m16617(EnumC19998.f60805) ? ((C8320) abstractC14355M42197).f22261 : null;
            }
            if (abstractC14355M42157.m16617(EnumC19998.f60790)) {
                ((C9661) abstractC14355M42157).f26610 = abstractC12224M33177;
                return abstractC14355M42157;
            }
            if (abstractC14355M42197 != null) {
                C8320 c8321 = (C8320) abstractC14355M42157;
                c8321.f22261 = abstractC14355M42197;
                c8321.f22259 = abstractC12224M33177;
                return abstractC14355M42157;
            }
            C18537 c185313 = this.f77556;
            c185313.f55352 = abstractC14355M42157.f18924;
            C9661 c9661M42157 = c185313.m42157(abstractC7785);
            c9661M42157.f26610 = abstractC12224M33177;
            return c9661M42157;
        }
        return abstractC14355M42157;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54059(AbstractC14355 abstractC14355) {
        AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC14355);
        return abstractC7783M21438 == null ? abstractC14355 : m54058(abstractC7783M21438, abstractC14355, (AbstractC14355) null, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 m54052(AbstractC7783 abstractC7783) {
        C15828 c15828M38274;
        if (!m54070(abstractC7783)) {
            return abstractC7783;
        }
        C15828 c15828M17990 = abstractC7783.f20407.m17990();
        C5771 c5771 = (C5771) this.f77563.get(abstractC7783);
        if (c5771 != null) {
            return c5771;
        }
        C4848 c4848Mo14797 = abstractC7783.f20406.mo14797();
        long j = c15828M17990.f20409 & 16384;
        C22004 c22004 = this.f77566;
        if (j != 0) {
            c4848Mo14797 = c4848Mo14797.m10290(c22004.f69134).m10290(c22004.f69215);
        }
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12224 = c8200.f21737;
        C15828 c15828Mo3350 = this.f77570.mo3350();
        C2417 c2417 = c15828Mo3350.m18008().f27063;
        int i = 1;
        while (true) {
            c15828M38274 = this.f77562.m38274(c2417, c8200.f21738.m32717("" + ((Object) c15828Mo3350.f45855) + this.f77578.m29249() + i));
            if (c15828M38274 != null) {
                if (c15828M38274.f20408.isEmpty()) {
                    break;
                }
                i++;
            } else {
                c15828M38274 = m54051(c15828Mo3350, (AbstractC12224) null, true).f20027;
                break;
            }
        }
        this.f77553 = this.f77553.m10290(c15828M38274);
        C5771 c5772 = new C5771(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC12224, new C12497(c4848Mo14797.m10286(c15828M38274.mo18010(this.f77549)), abstractC7783.f20406.mo14787(), abstractC7783.f20406.mo14794(), c22004.f69163), c15828M17990);
        c15828M17990.mo18020();
        c15828M17990.f45850.mo28415(c5772);
        this.f77563.put(abstractC7783, c5772);
        this.f77559.m45777(abstractC7783);
        return c5772;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x016b  */
    /* JADX WARN: Code duplicated, block: B:50:0x016e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
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
    /* JADX INFO: renamed from: ۧ */
    public final void m54068(AbstractC7783 abstractC7783) {
        C4848 c4848M42204;
        AbstractC14355 abstractC14355;
        Object objM42196;
        AbstractC14355 abstractC14356;
        EnumC19998 enumC19998;
        C7650 c7650M54050 = m54050(abstractC7783.f20407.m17990());
        C4968 c4968 = null;
        if (c7650M54050 == null) {
            C1446.m31702("class def not found: " + abstractC7783 + " in " + abstractC7783.f20407);
            throw null;
        }
        AbstractC12224 abstractC12224 = abstractC7783.f20408;
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12225 = c8200.f21737;
        long j = 0;
        C8374 c8374 = this.f77549;
        if (abstractC12224 == abstractC12225) {
            C4848 c4848 = c7650M54050.f20020;
            int i = c7650M54050.f18924;
            C5771 c5771 = (C5771) this.f77563.get(abstractC7783);
            C18537 c18537 = this.f77556;
            c18537.f55352 = i;
            C10471 c10471M42161 = c18537.m42161(c5771, c5771.m18015(c8374), (C4968) null);
            C9661 c9661M42194 = this.f77556.m42194(c8200.f21744);
            c9661M42194.f26611 = abstractC7783;
            c9661M42194.f18925 = abstractC7783.f20406;
            C18537 c18538 = this.f77556;
            C17175 c17175M42200 = c18538.m42200((AbstractC14355) c9661M42194, c18538.m42204(c10471M42161.f28963.m10294().f11035.m10294()));
            c10471M42161.f28958 = c18538.m42145(0L, C4848.m10276of(c17175M42200.f18925.m14777(EnumC11353.VOID) ? c18538.m42196(c17175M42200) : c18538.m42207(c17175M42200)));
            c7650M54050.f20020 = c4848.m10290(c10471M42161);
            return;
        }
        C5771[] c5771Arr = (C5771[]) this.f77565.get(abstractC7783);
        int i2 = 0;
        while (i2 < EnumC7112.f18556) {
            C5771 c5772 = c5771Arr[i2];
            if (c5772 != null) {
                C4848 c4849 = c7650M54050.f20020;
                int i3 = c7650M54050.f18924;
                this.f77570 = abstractC7783.f20407.m17990();
                C18537 c18539 = this.f77556;
                c18539.f55352 = i3;
                C10471 c10471M42162 = c18539.m42161(c5772, c5772.f20406, c4968);
                AbstractC7783 abstractC7784 = (AbstractC7783) this.f77577.get(abstractC7783);
                if (abstractC7784 == null) {
                    abstractC7784 = abstractC7783;
                }
                if ((abstractC7784.mo18003() & 8) != j) {
                    C9661 c9661M42157 = this.f77556.m42157(abstractC7784);
                    c4848M42204 = this.f77556.m42204(c10471M42162.f28963);
                    abstractC14355 = c9661M42157;
                } else {
                    C18537 c185310 = this.f77556;
                    C11281 c11281 = (C11281) c10471M42162.f28963.f11034;
                    c185310.getClass();
                    C9661 c9661M42158 = c185310.m42157((AbstractC7783) c11281.f31438);
                    if (i2 % 2 != 0) {
                        c9661M42158.f18925 = c8374.m19459(c8374.m19502(abstractC7783.f20407.m17990().f20406));
                    }
                    C8320 c8320M42154 = this.f77556.m42154(c9661M42158, abstractC7784);
                    c4848M42204 = this.f77556.m42204(c10471M42162.f28963.f11035);
                    abstractC14355 = c8320M42154;
                }
                if (abstractC7784.f20405 == EnumC3600.f7339) {
                    int i4 = i2 - (i2 & 1);
                    EnumC7112 enumC7112M16380 = EnumC7112.m16380(i4);
                    AbstractC14355 abstractC14355M42184 = abstractC14355;
                    switch (C7073.f18423[enumC7112M16380.ordinal()]) {
                        case 1:
                            abstractC14356 = abstractC14355M42184;
                            objM42196 = this.f77556.m42207(abstractC14356.mo32947(abstractC7784.f20406));
                            break;
                        case 2:
                            abstractC14355M42184 = this.f77556.m42184(abstractC14355, (AbstractC14355) c4848M42204.f11034);
                            abstractC14356 = abstractC14355M42184;
                            objM42196 = this.f77556.m42207(abstractC14356.mo32947(abstractC7784.f20406));
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            abstractC14355M42184 = m54053(enumC7112M16380.f18560, abstractC14355);
                            abstractC14356 = abstractC14355M42184;
                            objM42196 = this.f77556.m42207(abstractC14356.mo32947(abstractC7784.f20406));
                            break;
                        default:
                            C18537 c185311 = this.f77556;
                            EnumC19998 enumC19999 = EnumC19998.f60719;
                            C17130 c17130 = new C17130(enumC19999, i4);
                            C12004 c12004 = this.f77555;
                            int i5 = c12004.m27498(c17130).f5586;
                            if (i5 != 256) {
                                switch (i5) {
                                    case 96:
                                    case 97:
                                    case 98:
                                    case C0254q.f1216f /* 99 */:
                                        enumC19998 = EnumC19998.f60797;
                                        break;
                                    case 100:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                        enumC19998 = EnumC19998.f60750;
                                        break;
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                        enumC19998 = EnumC19998.f60732;
                                        break;
                                    case 108:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                        enumC19998 = EnumC19998.f60711;
                                        break;
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 114:
                                    case 115:
                                        enumC19998 = EnumC19998.f60766;
                                        break;
                                    default:
                                        switch (i5) {
                                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                enumC19998 = EnumC19998.f60710;
                                                break;
                                            case 122:
                                            case 123:
                                                enumC19998 = EnumC19998.f60776;
                                                break;
                                            case 124:
                                            case C0254q.f1218h /* 125 */:
                                                enumC19998 = EnumC19998.f60798;
                                                break;
                                            case 126:
                                            case 127:
                                                enumC19998 = EnumC19998.f60803;
                                                break;
                                            case 128:
                                            case 129:
                                                enumC19998 = EnumC19998.f60734;
                                                break;
                                            case 130:
                                            case 131:
                                                enumC19998 = EnumC19998.f60749;
                                                break;
                                            default:
                                                switch (i5) {
                                                    case BottomAppBarTopEdgeTreatment.ANGLE_UP /* 270 */:
                                                    case 271:
                                                        enumC19998 = EnumC19998.f60710;
                                                        break;
                                                    case 272:
                                                    case 273:
                                                        enumC19998 = EnumC19998.f60776;
                                                        break;
                                                    case 274:
                                                    case C0791b.f3325g /* 275 */:
                                                        enumC19998 = EnumC19998.f60798;
                                                        break;
                                                    default:
                                                        throw new AssertionError();
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                enumC19998 = EnumC19998.f60797;
                            }
                            C11674 c11674M42167 = c185311.m42167(enumC19998, abstractC14355, (AbstractC7257) c4848M42204.f11034);
                            c11674M42167.f5602 = c12004.m27498(new C17130(enumC19999, i4));
                            abstractC14356 = c11674M42167;
                            objM42196 = this.f77556.m42207(abstractC14356.mo32947(abstractC7784.f20406));
                            break;
                    }
                } else {
                    c5771Arr = c5771Arr;
                    C18537 c185312 = this.f77556;
                    C17175 c17175M42201 = c185312.m42200(abstractC14355, c4848M42204);
                    objM42196 = c17175M42201.f18925.m14777(EnumC11353.VOID) ? c185312.m42196(c17175M42201) : c185312.m42207(c17175M42201);
                }
                j = 0;
                c10471M42162.f28958 = this.f77556.m42145(0L, C4848.m10276of(objM42196));
                for (C4848 c48410 = c10471M42162.f28963; c48410.m10293(); c48410 = c48410.f11035) {
                    C11281 c11282 = (C11281) c48410.f11034;
                    c11282.f31437 = m54059(c11282.f31437);
                }
                c10471M42162.f28966 = m54059(c10471M42162.f28966);
                for (C4848 c48411 = c10471M42162.f28957; c48411.m10293(); c48411 = c48411.f11035) {
                    c48411.f11034 = m54059((AbstractC14355) c48411.f11034);
                }
                c7650M54050.f20020 = c4849.m10290(c10471M42162);
            } else {
                c5771Arr = c5771Arr;
            }
            i2++;
            c5771Arr = c5771Arr;
            c4968 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m54045(int i, C4848 c4848, AbstractC7783 abstractC7783, long j) {
        AbstractC12224 abstractC12224M28202;
        long j2 = j | 4112;
        C4848 c4848M10283 = C4848.m10283();
        HashSet hashSet = new HashSet();
        while (c4848.m10293()) {
            C13818 c13818 = (C13818) c4848.f11034;
            int i2 = 0;
            while (true) {
                AbstractC12224 abstractC12224 = c13818.f20408;
                int i3 = i2 + 1;
                StringBuilder sb = new StringBuilder("val");
                EnumC12720 enumC12720 = this.f77578;
                sb.append(enumC12720.m29249());
                sb.append((Object) abstractC12224);
                String string = sb.toString();
                C8200 c8200 = this.f77543;
                AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(string);
                if (i2 > 0) {
                    abstractC12224M28202 = abstractC12224M32717.m28202(c8200.f21738.m32717("" + enumC12720.m29249() + i2));
                } else {
                    abstractC12224M28202 = abstractC12224M32717;
                }
                if (hashSet.add(abstractC12224M28202)) {
                    break;
                }
                i2 = i3;
            }
            C13818 c13819 = new C13818(j2, abstractC12224M28202, c13818.mo18010(this.f77549), abstractC7783);
            this.f77554.put(c13818, c13819);
            C18537 c18537 = this.f77556;
            c18537.f55352 = i;
            C11281 c11281M42166 = c18537.m42166(c13819, (AbstractC14355) null);
            c11281M42166.f31437 = m54059(c11281M42166.f31437);
            c4848M10283 = c4848M10283.m10290(c11281M42166);
            c4848 = c4848.f11035;
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ֫ */
    private C13818 m54018(AbstractC7783 abstractC7783, long j) {
        AbstractC6462 abstractC6462M19459 = this.f77549.m19459(abstractC7783.m17990().f20406.mo7201());
        AbstractC6462 abstractC6462Mo7201 = abstractC6462M19459.mo7201();
        int i = 0;
        while (abstractC6462Mo7201.m14777(EnumC11353.CLASS)) {
            abstractC6462Mo7201 = abstractC6462Mo7201.mo7201();
            i++;
        }
        StringBuilder sb = new StringBuilder("this");
        EnumC12720 enumC12720 = this.f77578;
        sb.append(enumC12720.m29249());
        sb.append(i);
        String string = sb.toString();
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(string);
        while (abstractC7783.f20405 == EnumC3600.f7354) {
            C15828 c15828 = (C15828) abstractC7783;
            c15828.mo18020();
            if (c15828.f45850.mo22458(abstractC12224M32717, (Predicate) null) == null) {
                break;
            }
            abstractC12224M32717 = c8200.f21738.m32717(abstractC12224M32717.toString() + enumC12720.m29249());
        }
        C13818 c13818 = new C13818(j, abstractC12224M32717, abstractC6462M19459, abstractC7783);
        this.f77576 = this.f77576.m10290(c13818);
        return c13818;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m54047(AbstractC6448 abstractC6448, C4848 c4848) {
        C4848 c4848M10283 = C4848.m10283();
        while (c4848.m10293()) {
            C13818 c13818 = (C13818) c4848.f11034;
            C18537 c18537 = this.f77556;
            c18537.m42189((InterfaceC5323) abstractC6448);
            c4848M10283 = c4848M10283.m10290(m54058((AbstractC7783) c13818, (AbstractC14355) c18537.m42157((AbstractC7783) c13818), (AbstractC14355) null, false));
            c4848 = c4848.f11035;
        }
        return c4848M10283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54056(InterfaceC5323 interfaceC5323, AbstractC21195 abstractC21195) {
        C13818 c13818;
        if (this.f77570 == abstractC21195) {
            C18537 c18537 = this.f77556;
            c18537.m42189(interfaceC5323);
            return c18537.m42193(abstractC21195.mo18010(this.f77549));
        }
        C4848 c4848 = this.f77576;
        boolean zIsEmpty = c4848.isEmpty();
        C23623 c23623 = this.f77557;
        if (zIsEmpty) {
            c23623.m9352(interfaceC5323, C8300.m19133(abstractC21195));
            C1446.m31698();
            throw null;
        }
        C13818 c13819 = (C13818) c4848.f11034;
        C18537 c18538 = this.f77556;
        c18538.m42189(interfaceC5323);
        AbstractC14355 abstractC14355M54059 = m54059((AbstractC14355) c18538.m42157((AbstractC7783) c13819));
        AbstractC21195 abstractC21196 = c13819.f20406.f16705;
        while (abstractC21196 != abstractC21195) {
            do {
                c4848 = c4848.f11035;
                if (c4848.isEmpty()) {
                    c23623.m9352(interfaceC5323, C8300.m19133(abstractC21195));
                    C1446.m31698();
                    throw null;
                }
                c13818 = (C13818) c4848.f11034;
            } while (c13818.f20407 != abstractC21196);
            if (abstractC21196.f20407.f20405 != EnumC3600.f7351 && !abstractC21196.m18006()) {
                this.f77562.m38338(interfaceC5323, abstractC21195);
                C1446.m31698();
                throw null;
            }
            C18537 c18539 = this.f77556;
            c18539.m42189(interfaceC5323);
            abstractC14355M54059 = m54059((AbstractC14355) c18539.m42154(abstractC14355M54059, c13818));
            abstractC21196 = c13818.f20406.f16705;
        }
        return abstractC14355M54059;
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
    /* JADX INFO: renamed from: ֫ */
    private C4968 m54012(C4848 c4848, C4968 c4968, int i) {
        AbstractC12224 abstractC12224M28200;
        C9661 c9661M42157;
        boolean z;
        if (c4848.isEmpty()) {
            return c4968;
        }
        C20271 c20271 = new C20271();
        AbstractC7257 abstractC7257 = (AbstractC7257) c4848.f11034;
        boolean z2 = abstractC7257 instanceof C11281;
        EnumC12720 enumC12720 = this.f77578;
        C22004 c22004 = this.f77566;
        C8200 c8200 = this.f77543;
        if (z2) {
            C11281 c11281 = (C11281) abstractC7257;
            c9661M42157 = this.f77556.m42157((AbstractC7783) c11281.f31438);
            c9661M42157.f18925 = abstractC7257.f18925;
            AbstractC14355 abstractC14355 = c11281.f31436;
            z = abstractC14355 != null && C9268.m21424(abstractC14355).m16617(EnumC19998.f60772);
            c20271.m45777(c11281);
        } else {
            C1446.m31704(abstractC7257 instanceof AbstractC14355);
            AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(C20778.m46922(i, "twrVar"));
            AbstractC15689 abstractC15689 = this.f77573;
            while (true) {
                abstractC12224M28200 = abstractC12224M32717.m28200(enumC12720.m29249(), c8200.f21725);
                AbstractC7783 abstractC7783Mo22458 = abstractC15689.mo22458(abstractC12224M28200, (Predicate) null);
                if (abstractC7783Mo22458 == null || (abstractC7783Mo22458.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                    abstractC7783Mo22458 = null;
                }
                if (abstractC7783Mo22458 == null) {
                    break;
                }
                abstractC12224M32717 = abstractC12224M28200;
            }
            C13818 c13818 = new C13818(4112L, abstractC12224M28200, abstractC7257.f18925.m14777(EnumC11353.BOT) ? c22004.f69213 : abstractC7257.f18925, this.f77542);
            this.f77573.mo28415(c13818);
            C11281 c11281M42166 = this.f77556.m42166(c13818, (AbstractC14355) abstractC7257);
            c9661M42157 = this.f77556.m42157((AbstractC7783) c13818);
            c20271.m45777(c11281M42166);
            z = false;
        }
        C18537 c18537 = this.f77556;
        int i2 = c18537.f55352;
        c18537.f55352 = C9268.m21433(c4968);
        AbstractC13154 abstractC13154M54029 = m54029(c9661M42157);
        if (!z) {
            abstractC13154M54029 = this.f77556.m42141(m54054(EnumC19998.f60794, c9661M42157, m54072()), abstractC13154M54029, (AbstractC13154) null);
        }
        C4968 c4968M42145 = this.f77556.m42145(131072L, C4848.m10276of((Object) abstractC13154M54029));
        this.f77556.f55352 = i2;
        C13818 c13819 = new C13818(4112L, c8200.f21738.m32717(C0655am.f2281aI + enumC12720.m29249()), c22004.f69161, this.f77542);
        C11281 c11281M42167 = this.f77556.m42166(c13819, (AbstractC14355) null);
        C13818 c138110 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, this.f77556.m42195(2), c22004.f69161, this.f77542);
        C18537 c18538 = this.f77556;
        C12344 c12344M42196 = c18538.m42196(m54023(c18538.m42157((AbstractC7783) c13819), c8200.f21663, C4848.m10276of((Object) this.f77556.m42157((AbstractC7783) c138110))));
        C4968 c4968M42146 = this.f77556.m42145(0L, C4848.m10276of((Object) m54029(c9661M42157)));
        C4848 c4848M10276of = C4848.m10276of((Object) this.f77556.m42140(this.f77556.m42166(c138110, (AbstractC14355) null), this.f77556.m42145(0L, C4848.m10276of((Object) c12344M42196))));
        C18537 c18539 = this.f77556;
        c18539.getClass();
        C12622 c12622M42168 = c18539.m42168(C4848.m10283(), c4968M42146, c4848M10276of, (C4968) null);
        c12622M42168.f35423 = true;
        Object objM42141 = c12622M42168;
        if (!z) {
            objM42141 = this.f77556.m42141(m54054(EnumC19998.f60794, c9661M42157, m54072()), c12622M42168, (AbstractC13154) null);
        }
        C18537 c185310 = this.f77556;
        C2955 c2955M42140 = this.f77556.m42140(c11281M42167, this.f77556.m42145(0L, C4848.m10277of(objM42141, (Object) c185310.m42214(c185310.m42157((AbstractC7783) c13819)))));
        C18537 c185311 = this.f77556;
        C4968 c4968M54012 = m54012(c4848.f11035, c4968, i + 1);
        C4848 c4848M10276of2 = C4848.m10276of((Object) c2955M42140);
        c185311.getClass();
        C12622 c12622M42169 = c185311.m42168(C4848.m10283(), c4968M54012, c4848M10276of2, c4968M42145);
        c12622M42169.f35423 = true;
        c20271.m45777(c12622M42169);
        return this.f77556.m42145(0L, c20271.m45783());
    }

    /* JADX INFO: renamed from: ۧ */
    private C12344 m54029(C9661 c9661) {
        AbstractC6462 abstractC6462 = c9661.f18925;
        C22004 c22004 = this.f77566;
        AbstractC14355 abstractC14355M54039 = c9661;
        if (this.f77549.m19467(c22004.f69213.f16705, abstractC6462) == null) {
            abstractC14355M54039 = m54039(c22004.f69213, c9661);
        }
        return this.f77556.m42196(m54023(abstractC14355M54039, this.f77543.f21709, C4848.m10283()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54061(AbstractC14355 abstractC14355, AbstractC7783 abstractC7783, boolean z) {
        AbstractC7783 abstractC7784 = abstractC7783.f20407;
        C8374 c8374 = this.f77549;
        C15828 c15828 = this.f77570;
        if (!z ? c15828.mo17999(abstractC7784, c8374) : abstractC7783.m17986((AbstractC21195) c15828, c8374)) {
            C18537 c18537 = this.f77556;
            c18537.m42189((InterfaceC5323) abstractC14355);
            return c18537.m42193(abstractC7784.mo18010(c8374));
        }
        return m54055((InterfaceC5323) abstractC14355, abstractC7783, z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54055(InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, boolean z) {
        C13818 c13818;
        AbstractC7783 abstractC7784 = abstractC7783.f20407;
        C4848 c4848 = this.f77576;
        boolean zIsEmpty = c4848.isEmpty();
        C23623 c23623 = this.f77557;
        if (zIsEmpty) {
            c23623.m9352(interfaceC5323, C8300.m19133(abstractC7784));
            C1446.m31698();
            throw null;
        }
        C13818 c13819 = (C13818) c4848.f11034;
        C18537 c18537 = this.f77556;
        c18537.m42189(interfaceC5323);
        AbstractC14355 abstractC14355M54059 = m54059((AbstractC14355) c18537.m42157((AbstractC7783) c13819));
        AbstractC21195 abstractC21195 = c13819.f20406.f16705;
        while (true) {
            C8374 c8374 = this.f77549;
            if (z) {
                if (abstractC7783.m17986(abstractC21195, c8374)) {
                    break;
                }
                do {
                    c4848 = c4848.f11035;
                    if (!c4848.isEmpty()) {
                        c23623.m9352(interfaceC5323, C8300.m19133(abstractC7784));
                        C1446.m31698();
                        throw null;
                    }
                    c13818 = (C13818) c4848.f11034;
                } while (c13818.f20407 != abstractC21195);
                C18537 c18538 = this.f77556;
                c18538.m42189(interfaceC5323);
                abstractC14355M54059 = m54059((AbstractC14355) c18538.m42154(abstractC14355M54059, c13818));
                abstractC21195 = c13818.f20406.f16705;
            } else {
                if (abstractC21195.mo17999(abstractC7783.f20407, c8374)) {
                    break;
                }
                do {
                    c4848 = c4848.f11035;
                    if (!c4848.isEmpty()) {
                        c23623.m9352(interfaceC5323, C8300.m19133(abstractC7784));
                        C1446.m31698();
                        throw null;
                    }
                    c13818 = (C13818) c4848.f11034;
                } while (c13818.f20407 != abstractC21195);
                C18537 c18539 = this.f77556;
                c18539.m42189(interfaceC5323);
                abstractC14355M54059 = m54059((AbstractC14355) c18539.m42154(abstractC14355M54059, c13818));
                abstractC21195 = c13818.f20406.f16705;
            }
        }
        return abstractC14355M54059;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C15828 m54044(C24507 c24507) {
        C15828 c15828 = c24507.f77558.f20027;
        c15828.mo18020();
        for (AbstractC7783 abstractC7783 : c15828.f45850.mo22455((Predicate) null, EnumC3620.NON_RECURSIVE)) {
            if (abstractC7783.f20405 == EnumC3600.f7354 && abstractC7783.f20408 == c24507.f77543.f21725 && (abstractC7783.mo18003() & 512) == 0) {
                return (C15828) abstractC7783;
            }
        }
        return c24507.m54051(c15828, (AbstractC12224) null, true).f20027;
    }

    /* JADX INFO: renamed from: ֫ */
    private C17175 m54023(AbstractC14355 abstractC14355, AbstractC12224 abstractC12224, C4848 c4848) {
        C1446.m31699(abstractC14355.f18925);
        C5771 c5771M54013 = m54013(this.f77552, abstractC12224, abstractC14355.f18925, C9268.m21400(c4848));
        C18537 c18537 = this.f77556;
        return c18537.m42200((AbstractC14355) c18537.m42154(abstractC14355, c5771M54013), c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC14355 m54019(AbstractC6462 abstractC6462, AbstractC7257 abstractC7257) {
        int i = C7073.f18424[abstractC6462.mo5577().ordinal()];
        C8200 c8200 = this.f77543;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                C15828 c15828M19436 = this.f77549.m19436(abstractC6462);
                C4036 c4036 = this.f77550;
                AbstractC6462 abstractC6463 = c15828M19436.f20406;
                AbstractC12224 abstractC12224 = c8200.f21639;
                C17010 c17010 = C17010.f50309;
                C23663 c23663 = this.f77568;
                AbstractC7783 abstractC7783M52655 = c23663.m52655(abstractC7257, c4036, abstractC6463, abstractC12224, c17010);
                AbstractC6462 abstractC6464 = c15828M19436.f20406;
                AbstractC7783 abstractC7783M52656 = c23663.m52656(abstractC7783M52655, (InterfaceC5323) abstractC7257, (AbstractC7783) abstractC6464.f16705, abstractC6464, c8200.f21639, true);
                if (abstractC7783M52656.f20405 == EnumC3600.f7339) {
                    ((C13818) abstractC7783M52656).m31487();
                }
                return this.f77556.m42197(abstractC7783M52656);
            case 10:
            case 11:
                return m54063((InterfaceC5323) abstractC7257).m42154(this.f77556.m42208(abstractC6462), new C13818(25L, c8200.f21752, this.f77566.f69196, abstractC6462.f16705));
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54060(AbstractC14355 abstractC14355, AbstractC6462 abstractC6462, InterfaceC13779 interfaceC13779) {
        AbstractC14355 abstractC14355M21424 = C9268.m21424(abstractC14355);
        int i = C7073.f18425[abstractC14355M21424.mo3383().ordinal()];
        if (i == 1) {
            return interfaceC13779.mo5148(abstractC14355M21424);
        }
        if (i == 2) {
            C9661 c9661 = (C9661) abstractC14355M21424;
            if ((c9661.f26611.mo18003() & 16) != 0 && c9661.f26611.f20407.f20405 == EnumC3600.f7343) {
                return interfaceC13779.mo5148(abstractC14355M21424);
            }
        }
        AbstractC12224 abstractC12224M21428 = C9268.m21428(abstractC14355M21424);
        C8200 c8200 = this.f77543;
        if (abstractC12224M21428 == c8200.f21756 || abstractC12224M21428 == c8200.f21744) {
            return interfaceC13779.mo5148(abstractC14355M21424);
        }
        C13818 c13818 = new C13818(4112L, c8200.f21738.m32717(this.f77578.m29249() + "" + abstractC14355M21424.hashCode()), abstractC6462, this.f77542);
        C11281 c11281M42166 = this.f77556.m42166(c13818, m54039(abstractC6462, abstractC14355M21424));
        AbstractC14355 abstractC14355Mo5148 = interfaceC13779.mo5148(this.f77556.m42157((AbstractC7783) c13818));
        C5916 c5916M42148 = this.f77556.m42148(c11281M42166, abstractC14355Mo5148);
        c5916M42148.f18925 = abstractC14355Mo5148.f18925;
        return c5916M42148;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54062(AbstractC14355 abstractC14355, final InterfaceC13779 interfaceC13779) {
        AbstractC14355 abstractC14355M21424 = C9268.m21424(abstractC14355);
        int i = C7073.f18425[abstractC14355M21424.mo3383().ordinal()];
        if (i == 2) {
            return interfaceC13779.mo5148(abstractC14355M21424);
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    return m54062(((C19327) abstractC14355M21424).f57710, interfaceC13779);
                }
                throw new AssertionError(abstractC14355M21424);
            }
            final C16366 c16366 = (C16366) abstractC14355M21424;
            AbstractC14355 abstractC14356 = c16366.f48093;
            return m54060(abstractC14356, abstractC14356.f18925, new InterfaceC13779() { // from class: l.ۘ᩺֨
                @Override // p067l.InterfaceC13779
                /* JADX INFO: renamed from: ֫ */
                public final AbstractC14355 mo5148(AbstractC14355 abstractC14357) {
                    C16366 c16367 = c16366;
                    InterfaceC13779 interfaceC137710 = interfaceC13779;
                    C24507 c24507 = this.f16574;
                    return c24507.m54060(c16367.f48092, c24507.f77566.f69134, new InterfaceC13779() { // from class: l.֡᩺֨
                        @Override // p067l.InterfaceC13779
                        /* JADX INFO: renamed from: ֫ */
                        public final AbstractC14355 mo5148(AbstractC14355 abstractC14358) {
                            return C24507.m54022(c24507, abstractC14357, c16367, interfaceC137710, abstractC14358);
                        }
                    });
                }
            });
        }
        final C8320 c8320 = (C8320) abstractC14355M21424;
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c8320.f22261);
        if (abstractC7783M21438 != null && abstractC7783M21438.f20405 == EnumC3600.f7354) {
            return interfaceC13779.mo5148(abstractC14355M21424);
        }
        AbstractC14355 abstractC14357 = c8320.f22261;
        return m54060(abstractC14357, abstractC14357.f18925, new InterfaceC13779() { // from class: l.ۖ᩺֨
            @Override // p067l.InterfaceC13779
            /* JADX INFO: renamed from: ֫ */
            public final AbstractC14355 mo5148(AbstractC14355 abstractC14358) {
                return interfaceC13779.mo5148(this.f11862.f77556.m42154(abstractC14358, c8320.f22260));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC14355 m54022(C24507 c24507, AbstractC14355 abstractC14355, C16366 c16366, InterfaceC13779 interfaceC13779, AbstractC14355 abstractC14356) {
        C16366 c16366M42199 = c24507.f77556.m42199(abstractC14355, abstractC14356);
        c16366M42199.f18925 = c16366.f18925;
        return interfaceC13779.mo5148(c16366M42199);
    }

    @Override // p067l.C24572
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7257 mo25569(AbstractC7257 abstractC7257) {
        if (abstractC7257 == null) {
            return null;
        }
        m54063((InterfaceC5323) abstractC7257);
        AbstractC7257 abstractC7257Mo25569 = super.mo25569(abstractC7257);
        AbstractC13884 abstractC13884 = this.f77575;
        if (abstractC13884 != null && abstractC7257Mo25569 != abstractC7257) {
            abstractC13884.mo8720(abstractC7257, abstractC7257Mo25569);
        }
        return abstractC7257Mo25569;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14355 m54069(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        if (abstractC14355 == null) {
            return null;
        }
        return m54057(abstractC6462, (AbstractC14355) mo25569((AbstractC7257) abstractC14355));
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3799(C9800 c9800) {
        C17939 c17939;
        C8374 c8374;
        int i = C7073.f18426[this.f77537.ordinal()];
        boolean zM10293 = true;
        if (i != 1) {
            if (i == 2) {
                zM10293 = c9800.f27114.m10293();
            } else if (i == 3) {
                Iterator it = c9800.f27116.m18001().iterator();
                do {
                    if (!it.hasNext()) {
                        zM10293 = false;
                        break;
                    } else {
                        c17939 = (C17939) it.next();
                        c8374 = this.f77549;
                        c8374.getClass();
                    }
                } while (c8374.m19468(c17939.f29256.f16705) == EnumC24645.SOURCE);
            } else {
                throw new AssertionError();
            }
        }
        if (zM10293) {
            C9794 c9794 = c9800.f27116;
            C15828 c15828 = c9794.f27062;
            c15828.m18012(c9794);
            c15828.f20409 |= 5632;
            C21333 c21333 = (C21333) c15828.f20406;
            c21333.f67259 = this.f77566.f69208;
            c21333.f67261 = C4848.m10283();
            m54028(c15828, c9800.f27114);
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        C2417 c2417 = c5777.f14182;
        C15828 c15828 = c2417.f3687;
        c15828.m18012(c2417);
        c15828.f20409 |= 2251799813685248L;
        m54028(c5777.f14182.f3687, C4848.m10283());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54028(C15828 c15828, C4848 c4848) {
        C18537 c18537 = this.f77556;
        C7650 c7650M42151 = c18537.m42151(c18537.m42190(1536L, c4848), c15828.f20408, C4848.m10283(), (AbstractC14355) null, C4848.m10283(), C4848.m10283());
        c7650M42151.f20027 = c15828;
        this.f77545.m45777(c7650M42151);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(final C7650 c7650) {
        C11281 c11281M42166;
        AbstractC6462 abstractC6462;
        C4848 c4848M10278of;
        C13818 c13818;
        C4036 c4036 = this.f77550;
        C15828 c15828 = this.f77570;
        C5771 c5771 = this.f77542;
        C15828 c15829 = c7650.f20027;
        this.f77570 = c15829;
        this.f77542 = null;
        C4036 c4036M41759 = this.f77551.m41759(c15829);
        this.f77550 = c4036M41759;
        if (c4036M41759 == null) {
            this.f77550 = c4036;
        }
        this.f77540.put(this.f77570, c7650);
        HashMap map = this.f77554;
        this.f77554 = new HashMap(this.f77554);
        C4848 c4848 = this.f77576;
        long j = c7650.f20022.f9954 & 16384;
        C8200 c8200 = this.f77543;
        C8374 c8374 = this.f77549;
        if (j == 0 || (c8374.m19502(this.f77570.f20406).f16705.mo18003() & 16384) != 0) {
            c8200 = c8200;
            c8374 = c8374;
        } else {
            Integer num = 0;
            m54063((InterfaceC5323) c7650);
            if (c7650.f20025 == null) {
                c7650.f20025 = this.f77556.m42208(c8374.m19502(c7650.f18925));
            }
            boolean z = false;
            AbstractC14355 abstractC14355M54019 = m54019(c7650.f20027.f20406, c7650);
            C22004 c22004 = this.f77566;
            AbstractC6462 abstractC6463 = c22004.f69196;
            AbstractC6462 abstractC6464 = c22004.f69164;
            C13818 c13819 = c22004.f69214;
            AbstractC6462 abstractC6465 = c22004.f69208;
            AbstractC6462 abstractC6466 = c22004.f69215;
            C9262 c9262 = c22004.f69134;
            AbstractC14355 abstractC14355Mo32947 = abstractC14355M54019.mo32947(c8374.m19459(abstractC6463));
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            C20271 c20273 = new C20271();
            C4848 c4849 = c7650.f20020;
            int i = 0;
            while (c4849.m10293()) {
                Integer num2 = num;
                AbstractC6462 abstractC6467 = abstractC6464;
                if (((AbstractC7257) c4849.f11034).m16617(EnumC19998.f60802)) {
                    C11281 c11281 = (C11281) c4849.f11034;
                    c13818 = c13819;
                    if ((c11281.f31435.f9954 & 16384) != 0) {
                        C20530 c20530 = (C20530) c11281.f31436;
                        z = z;
                        c20530.f63430 = c20530.f63430.m10290(m54065(Integer.valueOf(i), c9262)).m10290(m54065(c11281.f31433.toString(), abstractC6466));
                        c20271.m45777(this.f77556.m42197(c11281.f31438));
                        c20272.m45777(c11281);
                        i++;
                    }
                    c4849 = c4849.f11035;
                    num = num2;
                    abstractC6464 = abstractC6467;
                    c13819 = c13818;
                    z = z;
                } else {
                    c13818 = c13819;
                }
                c20273.m45777((AbstractC7257) c4849.f11034);
                c4849 = c4849.f11035;
                num = num2;
                abstractC6464 = abstractC6467;
                c13819 = c13818;
                z = z;
            }
            Integer num3 = num;
            AbstractC6462 abstractC6468 = abstractC6464;
            C13818 c138110 = c13819;
            boolean z2 = z;
            AbstractC12224 abstractC12224M54017 = m54017(c7650, "VALUES");
            C7251 c7251 = new C7251(c8374.m19459(c7650.f18925), c22004.f69187);
            C13818 c138111 = new C13818(4122L, abstractC12224M54017, c7251, c7650.f18925.f16705);
            C18537 c18537 = this.f77556;
            C19859 c19859M42201 = c18537.m42201(c18537.m42208(c8374.m19459(c7650.f18925)), C4848.m10283(), c20271.m45783());
            c19859M42201.f18925 = c7251;
            C5771 c5772 = new C5771(4106L, m54017(c7650, "values"), new C12497(C4848.m10283(), c7251, C4848.m10283(), c7650.f18925.f16705), c7650.f18925.f16705);
            C18537 c18538 = this.f77556;
            c20272.m45777(c18538.m42161(c5772, c5772.f20406, c18538.m42145(0L, C4848.m10276of((Object) c18538.m42207(c19859M42201)))));
            C15828 c158210 = c7650.f20027;
            c158210.mo18020();
            c158210.f45850.mo28415(c5772);
            C18537 c18539 = this.f77556;
            c20272.m45777(c18539.m42166(c138111, (AbstractC14355) c18539.m42171(c18539.m42197(c5772))));
            C15828 c158211 = c7650.f20027;
            c158211.mo18020();
            c158211.f45850.mo28415(c138111);
            AbstractC12224 abstractC12224 = c8200.f21758;
            AbstractC12224 abstractC12225 = c8200.f21754;
            C5771 c5771M54013 = m54013(c7650, abstractC12224, c7650.f18925, C4848.m10283());
            try {
                if (abstractC6465.f16705.mo17983().mo22458(c8200.f21760, (Predicate) null) != null) {
                    C18537 c185310 = this.f77556;
                    AbstractC6462 abstractC6462Mo14787 = c5771M54013.f20406.mo14787();
                    C18537 c185311 = this.f77556;
                    c4848M10278of = C4848.m10276of((Object) this.f77556.m42207(c185310.m42178(abstractC6462Mo14787, c185311.m42171((AbstractC14355) c185311.m42154(c185311.m42157((AbstractC7783) c138111), c22004.f69193)))));
                } else {
                    C13818 c138112 = new C13818(4112L, m54017(c7650, C0252o.f1208c), c7251, c5771M54013);
                    C18537 c185312 = this.f77556;
                    AbstractC14355 abstractC14355M42208 = c185312.m42208(c8374.m19459(c7650.f18925));
                    C18537 c185313 = this.f77556;
                    C19859 c19859M42202 = c185312.m42201(abstractC14355M42208, C4848.m10276of((Object) c185313.m42154(c185313.m42157((AbstractC7783) c138111), c138110)), null);
                    c19859M42202.f18925 = c7251;
                    C11281 c11281M42167 = this.f77556.m42166(c138112, c19859M42202);
                    if (this.f77560 == null) {
                        AbstractC14235 abstractC14235 = c8200.f21738;
                        abstractC14235.getClass();
                        char[] charArray = "arraycopy".toCharArray();
                        AbstractC12224 abstractC12224Mo17848 = abstractC14235.mo17848(charArray, charArray.length);
                        AbstractC6462[] abstractC6462Arr = new AbstractC6462[2];
                        abstractC6462Arr[z2 ? 1 : 0] = c9262;
                        abstractC6462Arr[1] = c9262;
                        C12497 c12497 = new C12497(C4848.m10280(abstractC6465, c9262, abstractC6465, abstractC6462Arr), c22004.f69183, C4848.m10283(), c22004.f69163);
                        abstractC6462 = abstractC6468;
                        this.f77560 = new C5771(9L, abstractC12224Mo17848, c12497, abstractC6462.f16705);
                    } else {
                        abstractC6462 = abstractC6468;
                    }
                    C18537 c185314 = this.f77556;
                    C8320 c8320M42154 = c185314.m42154(c185314.m42157((AbstractC7783) abstractC6462.f16705), this.f77560);
                    C9661 c9661M42157 = this.f77556.m42157((AbstractC7783) c138111);
                    C24552 c24552M42186 = this.f77556.m42186(num3);
                    C9661 c9661M42158 = this.f77556.m42157((AbstractC7783) c138112);
                    C24552 c24552M42187 = this.f77556.m42186(num3);
                    C18537 c185315 = this.f77556;
                    C8320 c8320M42155 = c185315.m42154(c185315.m42157((AbstractC7783) c138111), c138110);
                    AbstractC14355[] abstractC14355Arr = new AbstractC14355[2];
                    abstractC14355Arr[z2 ? 1 : 0] = c24552M42187;
                    abstractC14355Arr[1] = c8320M42155;
                    C12344 c12344M42196 = c185314.m42196(c185314.m42200((AbstractC14355) c8320M42154, C4848.m10280(c9661M42157, c24552M42186, c9661M42158, abstractC14355Arr)));
                    C18537 c185316 = this.f77556;
                    c4848M10278of = C4848.m10278of((Object) c11281M42167, (Object) c12344M42196, (Object) c185316.m42207(c185316.m42157((AbstractC7783) c138112)));
                }
            } catch (C21865 unused) {
            }
            C18537 c185317 = this.f77556;
            Object objM42161 = c185317.m42161(c5771M54013, c5771M54013.f20406, c185317.m42145(0L, c4848M10278of));
            c20272.m45777(objM42161);
            boolean z3 = this.f77536;
            if (z3) {
                System.err.println(c7650.f20027 + ".valuesDef = " + objM42161);
            }
            C5771 c5771M54014 = m54013(c7650, abstractC12225, c7650.f20027.f20406, C4848.m10276of((Object) abstractC6466));
            C1446.m31704((c5771M54014.f20409 & 8) != 0);
            C9661 c9661M42159 = this.f77556.m42157((AbstractC7783) c5771M54014.f14172.f11034);
            C18537 c185318 = this.f77556;
            C11813 c11813M42207 = c185318.m42207(c185318.m42178(c7650.f20027.f20406, m54023(c185318.m42157((AbstractC7783) c22004.f69209), abstractC12225, C4848.m10277of((Object) abstractC14355Mo32947, (Object) c9661M42159))));
            C18537 c185319 = this.f77556;
            C10471 c10471M42161 = c185319.m42161(c5771M54014, c5771M54014.f20406, c185319.m42145(0L, C4848.m10276of((Object) c11813M42207)));
            c9661M42159.f26611 = ((C11281) c10471M42161.f28963.f11034).f31438;
            if (z3) {
                System.err.println(c7650.f20027 + ".valueOf = " + c10471M42161);
            }
            c20272.m45777(c10471M42161);
            c20272.m45778(c20273.m45783());
            c7650.f20020 = c20272.m45783();
        }
        if ((c7650.f20022.f9954 & 2305843009213693952L) != 0) {
            m54063((InterfaceC5323) c7650);
            AbstractC6462 abstractC6462M19502 = c7650.f18925;
            C4848<C13818> c4848M10283 = C4848.m10283();
            while (!abstractC6462M19502.m14777(EnumC11353.NONE)) {
                if (abstractC6462M19502.m14777(EnumC11353.CLASS)) {
                    AbstractC15689 abstractC15689Mo17983 = abstractC6462M19502.f16705.mo17983();
                    C19866 c19866 = new C19866(4);
                    abstractC15689Mo17983.getClass();
                    Iterator it = abstractC15689Mo17983.mo22455(c19866, EnumC3620.RECURSIVE).iterator();
                    while (it.hasNext()) {
                        c4848M10283 = c4848M10283.m10290((C13818) ((AbstractC7783) it.next()));
                    }
                }
                C8374 c8375 = c8374;
                abstractC6462M19502 = c8375.m19502(abstractC6462M19502);
                c8374 = c8375;
            }
            C17169[] c17169Arr = new C17169[c4848M10283.m10289()];
            int i2 = 0;
            for (C13818 c138113 : c4848M10283) {
                AbstractC7783 abstractC7783 = c138113.f20407;
                C15828 c158212 = c7650.f20027;
                if (abstractC7783 != c158212) {
                    c138113 = new C13818(c138113.f20409, c138113.f20408, c138113.f20406, c158212);
                }
                c17169Arr[i2] = new C17169(c138113, true);
                i2++;
            }
            C4848 c48410 = c7650.f20020;
            final C4848 c4848M21402 = C9268.m21402(c7650);
            C4848 c48411 = (C4848) C7480.stream(c7650.f20027.m35943()).filter(new C24665(2)).map(new Function() { // from class: l.۠᩺֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C24507.m54016(this.f28829, c4848M21402, c7650, (C22536) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }
            }).collect(C4848.m10284());
            c48410.getClass();
            C4848 c4848M10292 = c48411.m10292(c48410);
            c7650.f20020 = c4848M10292;
            C8200 c8201 = c8200;
            C4848 c4848M10278of2 = C4848.m10278of((Object) m54049(c7650, c8201.f21641, c4848M10283, c17169Arr), (Object) m54049(c7650, c8201.f21652, c4848M10283, c17169Arr), (Object) m54049(c7650, c8201.f21729, c4848M10283, c17169Arr));
            c4848M10292.getClass();
            c7650.f20020 = c4848M10278of2.m10292(c4848M10292);
        }
        if (this.f77570.m18006()) {
            int i3 = c7650.f18924;
            C13818 c13818M54018 = m54018(this.f77570, 4112L);
            C18537 c185320 = this.f77556;
            c185320.f55352 = i3;
            c11281M42166 = c185320.m42166(c13818M54018, (AbstractC14355) null);
            c11281M42166.f31437 = m54059(c11281M42166.f31437);
        } else {
            c11281M42166 = null;
        }
        C11281 c11282 = c11281M42166;
        c7650.f20025 = (AbstractC14355) mo25569((AbstractC7257) c7650.f20025);
        c7650.f20024 = m54183(c7650.f20024);
        if (this.f77570.m17996()) {
            C15828 c15828M17990 = this.f77570.f20407.m17990();
            if (c15828M17990.f45857 == null) {
                c15828M17990.f45857 = C4848.m10283();
            }
            c15828M17990.f45857 = c15828M17990.f45857.m10290(this.f77570);
        }
        C4848 c4848M10284 = C4848.m10283();
        while (true) {
            C4848 c48412 = c7650.f20020;
            if (c48412 == c4848M10284) {
                break;
            }
            for (C4848 c48413 = c48412; c48413.m10293() && c48413 != c4848M10284; c48413 = c48413.f11035) {
                AbstractC7257 abstractC7257 = this.f77546;
                if (abstractC7257 == null) {
                    this.f77546 = (AbstractC7257) c48413.f11034;
                }
                c48413.f11034 = mo25569((AbstractC7257) c48413.f11034);
                this.f77546 = abstractC7257;
            }
            c4848M10284 = c48412;
        }
        C4436 c4436 = c7650.f20022;
        long j2 = c4436.f9954;
        if ((4 & j2) != 0) {
            c4436.f9954 = j2 | 1;
        }
        c4436.f9954 &= 32273;
        c7650.f20021 = C14514.m33177(this.f77570.f45859);
        for (C4848 c4848M54045 = m54045(c7650.f18924, m54066(this.f77570), this.f77570, 0L); c4848M54045.m10293(); c4848M54045 = c4848M54045.f11035) {
            c7650.f20020 = c7650.f20020.m10290((AbstractC7257) c4848M54045.f11034);
            C13818 c138114 = ((C11281) c4848M54045.f11034).f31438;
            C15828 c158213 = this.f77570;
            c158213.mo18020();
            c158213.f45850.mo28415(c138114);
        }
        if (this.f77570.m18006()) {
            c7650.f20020 = c7650.f20020.m10290(c11282);
            C13818 c138115 = c11282.f31438;
            C15828 c158214 = this.f77570;
            c158214.mo18020();
            c158214.f45850.mo28415(c138115);
        }
        this.f77554 = map;
        this.f77576 = c4848;
        this.f77545.m45777(c7650);
        this.f77550 = c4036;
        this.f77570 = c15828;
        this.f77542 = c5771;
        this.f77797 = m54063((InterfaceC5323) c7650).m42145(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, C4848.m10283());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10471 m54016(C24507 c24507, C4848 c4848, C7650 c7650, final C22536 c22536) {
        C11281 c11281 = (C11281) C7480.stream(c4848).filter(new Predicate() { // from class: l.ᩴ᩺֨
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
            public /* synthetic */ Predicate m46209or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C11281) obj).f31433 == c22536.f20408;
            }
        }).findAny().get();
        c24507.m54063((InterfaceC5323) c7650);
        C18537 c18537 = c24507.f77556;
        C5771 c5771 = c22536.f71074;
        c18537.getClass();
        return c18537.m42161(c5771, c5771.f20406, c18537.m42145(0L, C4848.m10276of((Object) c18537.m42207(c18537.m42157((AbstractC7783) c11281.f31438)))));
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC12224 m54017(C7650 c7650, String str) {
        StringBuilder sb = new StringBuilder();
        EnumC12720 enumC12720 = this.f77578;
        sb.append(enumC12720.m29249());
        sb.append(str);
        String string = sb.toString();
        C8200 c8200 = this.f77543;
        while (true) {
            AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(string);
            C15828 c15828 = c7650.f20027;
            c15828.mo18020();
            if (c15828.f45850.mo22458(abstractC12224M32717, (Predicate) null) == null) {
                return abstractC12224M32717;
            }
            string = ((Object) abstractC12224M32717) + "" + enumC12720.m29249();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 m54049(C7650 c7650, AbstractC12224 abstractC12224, C4848 c4848, C17169[] c17169Arr) {
        C17175 c17175M42172;
        m54063((InterfaceC5323) c7650);
        C8200 c8200 = this.f77543;
        boolean z = abstractC12224 == c8200.f21729;
        AbstractC6462 abstractC6462 = c7650.f20027.f20406;
        C22004 c22004 = this.f77566;
        C5771 c5771M54013 = m54013(c7650, abstractC12224, abstractC6462, z ? C4848.m10276of((Object) c22004.f69208) : C4848.m10283());
        if ((c5771M54013.f20409 & 2305843009213693952L) != 0) {
            AbstractC12224 abstractC12225 = c8200.f21671;
            InterfaceC10057[] interfaceC10057Arr = new InterfaceC10057[c17169Arr.length + 2];
            interfaceC10057Arr[0] = (C21333) c7650.f20027.f20406;
            interfaceC10057Arr[1] = C7375.m17097((String) C7480.stream(c4848).map(new C4541(9)).collect(C24205.joining(C0249l.f1196b, "", "")));
            int i = 2;
            for (C17169 c17169 : c17169Arr) {
                interfaceC10057Arr[i] = c17169;
                i++;
            }
            AbstractC6462 abstractC6463 = c22004.f69196;
            AbstractC6462 abstractC6464 = c22004.f69215;
            C4848 c4848M10278of = C4848.m10278of((Object) abstractC6463, (Object) abstractC6464, (Object) new C7251(c22004.f69185, c22004.f69187));
            AbstractC6462 abstractC6465 = c22004.f69182;
            C5771 c5771M52640 = this.f77568.m52640(c7650, this.f77550, abstractC6465, abstractC12225, c4848M10278of.m10292(C4848.m10278of((Object) c22004.f69160, (Object) abstractC6464, (Object) c22004.f69138)), C4848.m10283());
            C12497 c12497Mo14809 = c5771M54013.f20406.mo14809();
            C11136 c11136 = new C11136(abstractC12224, c22004.f69157, c5771M52640.mo12943(), new C12497(c12497Mo14809.f35030.m10290(c7650.f20027.f20406), c12497Mo14809.f35031, c12497Mo14809.f35032, c22004.f69163), interfaceC10057Arr);
            C18537 c18537 = this.f77556;
            C8320 c8320M42155 = c18537.m42155(c18537.m42197(abstractC6465.f16705), abstractC12224);
            c8320M42155.f22260 = c11136;
            c8320M42155.f18925 = c5771M54013.f20406.mo14809().f35031;
            AbstractC12224 abstractC12226 = c8200.f21744;
            C15828 c15828 = c7650.f20027;
            C13818 c13818 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC12226, c15828.f20406, c15828);
            if (!z) {
                c17175M42172 = this.f77556.m42172(c8320M42155, C4848.m10283(), C4848.m10276of((Object) this.f77556.m42157((AbstractC7783) c13818)));
            } else {
                C13818 c13819 = (C13818) c5771M54013.f14172.f11034;
                c13819.f39049 = 0;
                c17175M42172 = this.f77556.m42172(c8320M42155, C4848.m10283(), C4848.m10277of((Object) this.f77556.m42157((AbstractC7783) c13818), (Object) this.f77556.m42157((AbstractC7783) c13819)));
            }
            c17175M42172.f18925 = c8320M42155.f18925;
            C18537 c18538 = this.f77556;
            return c18538.m42161(c5771M54013, c5771M54013.f20406, c18538.m42145(0L, C4848.m10276of((Object) c18538.m42207(c17175M42172))));
        }
        return this.f77556.m42145(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, C4848.m10283());
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        AbstractC12224 abstractC12224 = c10471.f28959;
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12225 = c8200.f21737;
        AbstractC14235 abstractC14235 = c8200.f21738;
        if (abstractC12224 == abstractC12225 && (this.f77570.f20409 & 16384) != 0) {
            C18537 c18537M54063 = m54063((InterfaceC5323) c10471);
            StringBuilder sb = new StringBuilder();
            EnumC12720 enumC12720 = this.f77578;
            sb.append(enumC12720.m29249());
            sb.append("enum");
            sb.append(enumC12720.m29249());
            sb.append("name");
            AbstractC12224 abstractC12224M32717 = abstractC14235.m32717(sb.toString());
            C22004 c22004 = this.f77566;
            AbstractC6462 abstractC6462 = c22004.f69215;
            C9262 c9262 = c22004.f69134;
            C11281 c11281M42166 = c18537M54063.m42166(new C13818(8589934592L, abstractC12224M32717, abstractC6462, c10471.f28960), (AbstractC14355) null);
            c11281M42166.f31435.f9954 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
            c11281M42166.f31438.f20409 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
            C18537 c18537 = this.f77556;
            AbstractC12224 abstractC12224M32718 = abstractC14235.m32717(enumC12720.m29249() + "enum" + enumC12720.m29249() + "ordinal");
            C5771 c5771 = c10471.f28960;
            c18537.getClass();
            C11281 c11281M42167 = c18537.m42166(new C13818(8589934592L, abstractC12224M32718, c9262, c5771), (AbstractC14355) null);
            C4436 c4436 = c11281M42167.f31435;
            c4436.f9954 = c4436.f9954 | ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
            c11281M42167.f31438.f20409 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
            C5771 c5772 = c10471.f28960;
            c10471.f28963 = c10471.f28963.m10290(c11281M42167).m10290(c11281M42166);
            C4848 c4848M10290 = c5772.f14174.m10290(c11281M42167.f31438);
            c5772.f14174 = c4848M10290;
            c5772.f14174 = c4848M10290.m10290(c11281M42166.f31438);
            AbstractC6462 abstractC6462Mo18010 = c5772.mo18010(this.f77549);
            c5772.f20411 = new C12497(abstractC6462Mo18010.mo14797().m10290(c9262).m10290(c22004.f69215), abstractC6462Mo18010.mo14787(), abstractC6462Mo18010.mo14794(), c22004.f69163);
        }
        C10471 c10472 = this.f77535;
        C5771 c5773 = this.f77542;
        try {
            this.f77535 = c10471;
            this.f77542 = c10471.f28960;
            m54032(c10471);
        } finally {
            this.f77535 = c10472;
            this.f77542 = c5773;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX INFO: renamed from: ۧ */
    private void m54032(C10471 c10471) {
        AbstractC12224 abstractC12224;
        long j;
        long j2;
        C11281 c11281;
        long j3;
        boolean z;
        int i;
        AbstractC12224 abstractC12225 = c10471.f28959;
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12226 = c8200.f21737;
        C8374 c8374 = this.f77549;
        if (abstractC12225 == abstractC12226 && (this.f77570.m17988() || this.f77570.m17996())) {
            C5771 c5771 = c10471.f28960;
            HashMap map = this.f77554;
            this.f77554 = new HashMap(this.f77554);
            C4848 c4848 = this.f77576;
            C4848 c4848M54066 = m54066(this.f77570);
            if (this.f77570.m18006()) {
                int i2 = c10471.f18924;
                C15828 c15828M17990 = c5771.m17990();
                if (c5771.m17994()) {
                    j2 = 0;
                    if (c5771.f20408.isEmpty()) {
                        z = true;
                    }
                    if (z) {
                        i = 32768;
                    } else {
                        i = 4096;
                    }
                    C13818 c13818M54018 = m54018(c5771, ((long) (i | 16)) | 8589934592L);
                    c5771.f14174 = c5771.f14174.m10290(c13818M54018);
                    C18537 c18537 = this.f77556;
                    c18537.f55352 = i2;
                    C11281 c11281M42166 = c18537.m42166(c13818M54018, (AbstractC14355) null);
                    c11281M42166.f31437 = m54059(c11281M42166.f31437);
                    c11281 = c11281M42166;
                } else {
                    j2 = 0;
                }
                if (c5771.m17994() && c15828M17990.m17988()) {
                    j3 = j2;
                    if ((c15828M17990.f20409 & 7) != 2 && !c15828M17990.mo17483()) {
                        j2 = j3;
                        z = true;
                    }
                    if (z) {
                        i = 32768;
                    } else {
                        i = 4096;
                    }
                    C13818 c13818M54019 = m54018(c5771, ((long) (i | 16)) | 8589934592L);
                    c5771.f14174 = c5771.f14174.m10290(c13818M54019);
                    C18537 c18538 = this.f77556;
                    c18538.f55352 = i2;
                    C11281 c11281M42167 = c18538.m42166(c13818M54019, (AbstractC14355) null);
                    c11281M42167.f31437 = m54059(c11281M42167.f31437);
                    c11281 = c11281M42167;
                } else {
                    j3 = j2;
                }
                z = false;
                j2 = j3;
                if (z) {
                    i = 32768;
                } else {
                    i = 4096;
                }
                C13818 c13818M540110 = m54018(c5771, ((long) (i | 16)) | 8589934592L);
                c5771.f14174 = c5771.f14174.m10290(c13818M540110);
                C18537 c18539 = this.f77556;
                c18539.f55352 = i2;
                C11281 c11281M42168 = c18539.m42166(c13818M540110, (AbstractC14355) null);
                c11281M42168.f31437 = m54059(c11281M42168.f31437);
                c11281 = c11281M42168;
            } else {
                j2 = 0;
                c11281 = null;
            }
            j = j2;
            C4848 c4848M54045 = m54045(c10471.f18924, c4848M54066, c5771, 8589934592L);
            c10471.f28966 = (AbstractC14355) mo25569(c10471.f28966);
            C4848 c4849 = c10471.f28963;
            m54185(c4849);
            c10471.f28963 = c4849;
            c10471.f28957 = m54183(c10471.f28957);
            if (c10471.f28958 == null) {
                this.f77797 = c10471;
                return;
            }
            C4848 c48410 = c10471.f28963;
            c48410.getClass();
            c10471.f28963 = c4848M54045.m10292(c48410);
            if (this.f77570.m18006()) {
                c10471.f28963 = c10471.f28963.m10290(c11281);
            }
            Object obj = (AbstractC13154) mo25569((AbstractC13154) c10471.f28958.f11316.f11034);
            C4848 c4848M10283 = C4848.m10283();
            if (c4848M54066.m10293()) {
                C4848 c4848M10284 = C4848.m10283();
                while (c4848M54066.m10293()) {
                    c5771.f14171 = c5771.f14171.m10290((C13818) this.f77554.get(c4848M54066.f11034));
                    if (C9268.m21435(c10471)) {
                        int i3 = c10471.f28958.f18924;
                        AbstractC7783 abstractC7783 = (AbstractC7783) this.f77554.get(c4848M54066.f11034);
                        AbstractC7783 abstractC7784 = (AbstractC7783) map.get(c4848M54066.f11034);
                        C1446.m31704(abstractC7783.f20407.f20405 == EnumC3600.f7343);
                        C1446.m31704(abstractC7783.f20407.f20407 == abstractC7784.f20407);
                        C18537 c185310 = this.f77556;
                        c185310.f55352 = i3;
                        C22403 c22403M42184 = c185310.m42184((AbstractC14355) c185310.m42154(c185310.m42193(abstractC7784.f20407.mo18010(c8374)), abstractC7784), (AbstractC14355) this.f77556.m42157(abstractC7783));
                        c22403M42184.f18925 = abstractC7784.mo18010(c8374);
                        c4848M10283 = c4848M10283.m10290(c185310.m42196(c22403M42184));
                    }
                    c4848M10284 = c4848M10284.m10290(((C13818) c4848M54066.f11034).mo18010(c8374));
                    c4848M54066 = c4848M54066.f11035;
                    abstractC12225 = abstractC12225;
                }
                abstractC12224 = abstractC12225;
                AbstractC6462 abstractC6462Mo18010 = c5771.mo18010(c8374);
                C4848 c4848Mo14797 = abstractC6462Mo18010.mo14797();
                c4848Mo14797.getClass();
                c5771.f20411 = new C12497(c4848M10284.m10292(c4848Mo14797), abstractC6462Mo18010.mo14787(), abstractC6462Mo18010.mo14794(), this.f77566.f69163);
            } else {
                abstractC12224 = abstractC12225;
            }
            if (this.f77570.m18006() && C9268.m21435(c10471)) {
                int i4 = c10471.f28958.f18924;
                C13818 c13818 = (C13818) this.f77576.f11034;
                C1446.m31704(c13818.f20407.f20405 == EnumC3600.f7343);
                C13818 c13819 = (C13818) this.f77576.f11035.f11034;
                C1446.m31704(c13818.f20407.f20407 == c13819.f20407);
                C18537 c185311 = this.f77556;
                c185311.f55352 = i4;
                C22403 c22403M42185 = c185311.m42184((AbstractC14355) c185311.m42154(c185311.m42193(c13819.f20407.mo18010(c8374)), c13819), (AbstractC14355) this.f77556.m42157((AbstractC7783) c13818));
                c22403M42185.f18925 = c13819.mo18010(c8374);
                c4848M10283 = c4848M10283.m10290(c185311.m42196(c22403M42185));
            }
            this.f77554 = map;
            c10471.f28958.f11316 = m54183(c10471.f28958.f11316.f11035).m10290(obj).m10292(c4848M10283);
            this.f77576 = c4848;
        } else {
            abstractC12224 = abstractC12225;
            HashMap map2 = null;
            j = 0;
            HashMap map3 = this.f77539;
            try {
                C5771 c5772 = c10471.f28960;
                if ((c5772.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0 && c5772.f20408.m28205(c8200.f21664)) {
                    map2 = new HashMap();
                    Iterator it = c10471.f28963.iterator();
                    while (it.hasNext()) {
                        AbstractC7783 abstractC7785 = ((C11281) it.next()).f31438;
                        if (abstractC7785 != abstractC7785.mo9143()) {
                            map2.put(abstractC7785.mo9143(), abstractC7785);
                        }
                    }
                }
                this.f77539 = map2;
                super.mo3801(c10471);
                this.f77539 = map3;
            } catch (Throwable th) {
                this.f77539 = map3;
                throw th;
            }
        }
        if (abstractC12224 == c8200.f21737 && (c10471.f28960.f20409 & 2251799813685248L) != j) {
            C20271<C13818> c20271 = new C20271();
            for (AbstractC7783 abstractC7786 : this.f77570.mo3353()) {
                if (abstractC7786.f20405 == EnumC3600.f7339 && (abstractC7786.mo18003() & 2305843009213693952L) != j) {
                    c20271.m45777((C13818) abstractC7786);
                }
            }
            for (C13818 c138110 : c20271) {
                if ((c138110.f20409 & 2251799813685248L) != j) {
                    C13818 c138111 = ((C11281) C7480.stream(c10471.f28963).filter(new C7744(0, c138110)).findFirst().get()).f31438;
                    C18537 c185312 = this.f77556;
                    c185312.f55352 = c10471.f18924;
                    C4968 c4968 = c10471.f28958;
                    C4848 c48411 = c4968.f11316;
                    C22403 c22403M42186 = c185312.m42184((AbstractC14355) c185312.m42154(c185312.m42193(c138110.f20407.mo18010(c8374)), c138110), (AbstractC14355) this.f77556.m42157((AbstractC7783) c138111));
                    c22403M42186.f18925 = c138110.mo18010(c8374);
                    c4968.f11316 = c48411.m10286(c185312.m42196(c22403M42186));
                    c138110.f20409 &= -2251799813685249L;
                }
            }
        }
        this.f77797 = c10471;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        c19327.f57709 = mo25569(c19327.f57709);
        if (c19327.f18925.mo14805() != c19327.f57710.f18925.mo14805()) {
            c19327.f57710 = m54069(c19327.f18925, c19327.f57710);
        } else {
            c19327.f57710 = (AbstractC14355) mo25569((AbstractC7257) c19327.f57710);
        }
        this.f77797 = c19327;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        AbstractC14355 abstractC14355M54061;
        AbstractC7783 abstractC7783 = c20530.f63427.f20407;
        C15828 c15828 = (C15828) abstractC7783;
        boolean z = (abstractC7783.mo18003() & 16384) != 0;
        C4848 c4848Mo14797 = c20530.f63427.f20406.mo14797();
        if (z) {
            C22004 c22004 = this.f77566;
            c4848Mo14797 = c4848Mo14797.m10290(c22004.f69134).m10290(c22004.f69215);
        }
        c20530.f63430 = m54048(c20530.f63426, c4848Mo14797, c20530.f63430);
        c20530.f63426 = null;
        if (c15828.m17996()) {
            C4848 c4848 = c20530.f63430;
            C4848 c4848M54047 = m54047(c20530, m54066(c15828));
            c4848.getClass();
            c20530.f63430 = c4848M54047.m10292(c4848);
        }
        AbstractC7783 abstractC7783M54052 = m54052(c20530.f63427);
        if (abstractC7783M54052 != c20530.f63427) {
            c20530.f63430 = c20530.f63430.m10286(m54072());
            c20530.f63427 = abstractC7783M54052;
        }
        if (c15828.m18006()) {
            AbstractC7257 abstractC7257 = c20530.f63432;
            if (abstractC7257 != null) {
                abstractC14355M54061 = this.f77572.m25948((AbstractC14355) mo25569(abstractC7257));
                abstractC14355M54061.f18925 = c20530.f63432.f18925;
            } else if (c15828.m17996()) {
                abstractC14355M54061 = m54056(c20530, c15828.f20406.mo7201().f16705);
            } else {
                abstractC14355M54061 = m54061((AbstractC14355) c20530, (AbstractC7783) c15828, false);
            }
            c20530.f63430 = c20530.f63430.m10290(abstractC14355M54061);
        }
        c20530.f63432 = null;
        AbstractC7257 abstractC7258 = c20530.f63428;
        if (abstractC7258 != null) {
            HashMap map = this.f77539;
            try {
                this.f77539 = null;
                mo25569(abstractC7258);
                this.f77539 = map;
                InterfaceC5323 interfaceC5323 = c20530.f63429;
                interfaceC5323.getClass();
                c20530.f63429 = m54059((AbstractC14355) m54063(interfaceC5323).m42157(c20530.f63428.f20027));
                c20530.f63428 = null;
            } catch (Throwable th) {
                this.f77539 = map;
                throw th;
            }
        } else {
            c20530.f63429 = m54058((AbstractC7783) c15828, c20530.f63429, this.f77574, false);
        }
        this.f77797 = c20530;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m54043(AbstractC14355 abstractC14355) {
        if (abstractC14355.f18925.mo14799()) {
            return true;
        }
        Boolean boolM54035 = m54035((AbstractC7257) abstractC14355);
        if (boolM54035 == null) {
            return false;
        }
        return boolM54035.booleanValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m54037(AbstractC14355 abstractC14355) {
        if (abstractC14355.f18925.mo14806()) {
            return true;
        }
        Boolean boolM54035 = m54035((AbstractC7257) abstractC14355);
        return (boolM54035 == null || boolM54035.booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static Boolean m54035(AbstractC7257 abstractC7257) {
        boolean z;
        while (abstractC7257.m16617(EnumC19998.f60706)) {
            abstractC7257 = ((C16505) abstractC7257).f48507;
        }
        int i = C7073.f18425[abstractC7257.mo3383().ordinal()];
        if (i == 6) {
            z = true;
        } else {
            if (i != 7) {
                return null;
            }
            z = false;
        }
        C11003 c11003 = (C11003) abstractC7257;
        AbstractC6462 abstractC6462 = c11003.f30470.f18925;
        EnumC11353 enumC11353 = EnumC11353.BOT;
        if (abstractC6462.m14777(enumC11353)) {
            return m54011(c11003.f30469, z);
        }
        if (c11003.f30469.f18925.m14777(enumC11353)) {
            return m54011(c11003.f30470, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Boolean m54011(AbstractC14355 abstractC14355, boolean z) {
        if (abstractC14355.f18925.m14777(EnumC11353.BOT)) {
            return Boolean.valueOf(z);
        }
        if (abstractC14355.m16617(EnumC19998.f60804)) {
            return Boolean.valueOf(!z);
        }
        return null;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        AbstractC14355 abstractC14355M54069 = m54069(this.f77566.f69151, c10332.f28614);
        c10332.f28614 = abstractC14355M54069;
        if (m54043(abstractC14355M54069)) {
            this.f77797 = m54039(c10332.f18925, m54069(c10332.f18925, c10332.f28612));
            m54033(abstractC14355M54069);
            return;
        }
        if (m54037(abstractC14355M54069)) {
            this.f77797 = m54039(c10332.f18925, m54069(c10332.f18925, c10332.f28613));
            m54033(abstractC14355M54069);
            return;
        }
        c10332.f28612 = m54069(c10332.f18925, c10332.f28612);
        c10332.f28613 = m54069(c10332.f18925, c10332.f28613);
        this.f77797 = c10332;
    }

    /* JADX INFO: renamed from: ܿ */
    private AbstractC14355 m54039(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        AbstractC6462 abstractC6463 = abstractC14355.f18925;
        if (abstractC6463 == abstractC6462 || abstractC6463.m14777(EnumC11353.BOT)) {
            return abstractC14355;
        }
        C19327 c19327M42179 = m54063((InterfaceC5323) abstractC14355).m42179((AbstractC7257) this.f77556.m42208(abstractC6462), abstractC14355);
        if (abstractC14355.f18925.mo14779() != null) {
            abstractC6462 = this.f77548.m15516(abstractC14355.f18925, abstractC6462);
        }
        c19327M42179.f18925 = abstractC6462;
        return c19327M42179;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        AbstractC14355 abstractC14355M54069 = m54069(this.f77566.f69151, c3765.f7998);
        c3765.f7998 = abstractC14355M54069;
        if (m54043(abstractC14355M54069)) {
            this.f77797 = mo25569(c3765.f7999);
            m54033(abstractC14355M54069);
        } else {
            if (m54037(abstractC14355M54069)) {
                AbstractC13154 abstractC13154 = c3765.f8000;
                if (abstractC13154 != null) {
                    this.f77797 = mo25569(abstractC13154);
                } else {
                    this.f77797 = this.f77556.m42206();
                }
                m54033(abstractC14355M54069);
                return;
            }
            c3765.f7999 = (AbstractC13154) mo25569(c3765.f7999);
            c3765.f8000 = (AbstractC13154) mo25569(c3765.f8000);
            this.f77797 = c3765;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3796(C8991 c8991) {
        C15828 c15828;
        AbstractC14355 abstractC14355 = c8991.f24356;
        C22004 c22004 = this.f77566;
        AbstractC14355 abstractC14355M54069 = m54069(c22004.f69151, abstractC14355);
        c8991.f24356 = abstractC14355M54069;
        if (!abstractC14355M54069.f18925.mo14799()) {
            C15828 c15829 = this.f77558.f20027;
            if (this.f77570.m17989()) {
                c15828 = this.f77544;
                if (c15828 == null) {
                    c15828 = m54051(this.f77558.f20027, (AbstractC12224) null, true).f20027;
                    this.f77544 = c15828;
                }
            } else {
                c15828 = this.f77570;
            }
            c15828.mo18020();
            AbstractC7783 abstractC7783Mo22458 = c15828.f45850.mo22458(this.f77561, (Predicate) null);
            if (abstractC7783Mo22458 == null || (abstractC7783Mo22458.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                abstractC7783Mo22458 = null;
            }
            C13818 c13818 = (C13818) abstractC7783Mo22458;
            if (c13818 == null) {
                C13818 c13819 = new C13818(4120L, this.f77561, c22004.f69151, c15828);
                c15828.mo18020();
                c15828.f45850.mo28415(c13819);
                AbstractC12224 abstractC12224 = this.f77543.f21648;
                AbstractC6462 abstractC6462 = c22004.f69196;
                C8374 c8374 = this.f77549;
                C5771 c5771M54013 = m54013(c8991, abstractC12224, c8374.m19459(abstractC6462), C4848.m10283());
                C7650 c7650M54050 = m54050(c15828);
                c7650M54050.getClass();
                m54063((InterfaceC5323) c7650M54050);
                EnumC19998 enumC19998 = EnumC19998.f60712;
                C18537 c18537 = this.f77556;
                c7650M54050.f20020 = c7650M54050.f20020.m10290(this.f77556.m42166(c13819, m54053(enumC19998, c18537.m42171((AbstractC14355) c18537.m42154(m54019(c8374.m19459(c15829.f20406), c7650M54050), c5771M54013)))));
                if (this.f77570.m17989()) {
                    C7650 c7650M54051 = m54050(this.f77570);
                    c7650M54051.getClass();
                    m54063((InterfaceC5323) c7650M54051);
                    C18537 c18538 = this.f77556;
                    c7650M54051.f20020 = c7650M54051.f20020.m10290(this.f77556.m42145(8L, C4848.m10276of((Object) c18538.m42141(c18538.m42197(c13819), this.f77556.m42206(), (AbstractC13154) null))));
                }
                c13818 = c13819;
            }
            m54063((InterfaceC5323) c8991);
            EnumC19998 enumC19999 = EnumC19998.f60712;
            AbstractC14355 abstractC14355M54053 = m54053(enumC19999, this.f77556.m42157((AbstractC7783) c13818));
            AbstractC14355 abstractC14356 = c8991.f24357;
            C4848 c4848M10283 = abstractC14356 == null ? C4848.m10283() : C4848.m10276of(mo25569((AbstractC7257) abstractC14356));
            if (!c8991.f24356.f18925.mo14806()) {
                abstractC14355M54053 = m54054(EnumC19998.f60789, abstractC14355M54053, m54053(enumC19999, c8991.f24356));
            }
            this.f77797 = this.f77556.m42141(abstractC14355M54053, m54063((InterfaceC5323) c8991).m42214(m54064(c22004.f69190, c4848M10283)), (AbstractC13154) null);
            return;
        }
        this.f77797 = this.f77556.m42206();
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        AbstractC14355 abstractC14355M54056;
        AbstractC7783 abstractC7783M21438 = C9268.m21438(c17175.f51143);
        C4848 c4848Mo14797 = abstractC7783M21438.f20406.mo14797();
        AbstractC12224 abstractC12224 = abstractC7783M21438.f20408;
        C8200 c8200 = this.f77543;
        AbstractC12224 abstractC12225 = c8200.f21737;
        C22004 c22004 = this.f77566;
        if (abstractC12224 == abstractC12225 && abstractC7783M21438.f20407 == c22004.f69209) {
            c4848Mo14797 = c4848Mo14797.f11035.f11035;
        }
        c17175.f51144 = m54048(c17175.f51141, c4848Mo14797, c17175.f51144);
        c17175.f51141 = null;
        AbstractC12224 abstractC12224M21428 = C9268.m21428(c17175.f51143);
        if (abstractC7783M21438.f20408 == c8200.f21737) {
            AbstractC7783 abstractC7783M54052 = m54052(abstractC7783M21438);
            if (abstractC7783M54052 != abstractC7783M21438) {
                c17175.f51144 = c17175.f51144.m10286(m54072());
                C9268.m21425(abstractC7783M54052, c17175.f51143);
            }
            C15828 c15828 = (C15828) abstractC7783M54052.f20407;
            if (c15828.m17996()) {
                C4848 c4848 = c17175.f51144;
                C4848 c4848M54047 = m54047(c17175, m54066(c15828));
                c4848.getClass();
                c17175.f51144 = c4848M54047.m10292(c4848);
            }
            if ((c15828.f20409 & 16384) != 0 || c15828.f45855 == c8200.f21757) {
                C4848 c4849 = this.f77535.f28963;
                if (this.f77542.f20407.m18006()) {
                    c4849 = c4849.f11035;
                }
                c17175.f51144 = c17175.f51144.m10290(m54063((InterfaceC5323) c17175).m42157(((C11281) c4849.f11035.f11034).f31438)).m10290(this.f77556.m42157((AbstractC7783) ((C11281) c4849.f11034).f31438));
            }
            if (c15828.m18006()) {
                if (c17175.f51143.m16617(EnumC19998.f60805)) {
                    abstractC14355M54056 = this.f77572.m25948((AbstractC14355) mo25569(((C8320) c17175.f51143).f22261));
                    C9661 c9661M42157 = this.f77556.m42157(abstractC7783M54052);
                    c17175.f51143 = c9661M42157;
                    c9661M42157.f26610 = abstractC12224M21428;
                } else if (c15828.m17996() || abstractC12224M21428 == c8200.f21744) {
                    InterfaceC5323 interfaceC5323 = c17175.f51143;
                    interfaceC5323.getClass();
                    abstractC14355M54056 = m54056(interfaceC5323, c15828.f20406.mo7201().f16705);
                } else if (this.f77570.mo17483()) {
                    this.f77557.m9352(c17175, C8300.m19133(c15828.f20406.mo7201().f16705));
                    abstractC14355M54056 = this.f77556.m42187(EnumC11353.BOT, (Object) null);
                    abstractC14355M54056.f18925 = c22004.f69204;
                } else {
                    InterfaceC5323 interfaceC5324 = c17175.f51143;
                    interfaceC5324.getClass();
                    abstractC14355M54056 = m54055(interfaceC5324, (AbstractC7783) c15828, false);
                }
                c17175.f51144 = c17175.f51144.m10290(abstractC14355M54056);
            }
        } else {
            AbstractC14355 abstractC14355 = (AbstractC14355) mo25569(c17175.f51143);
            c17175.f51143 = abstractC14355;
            if (abstractC14355.m16617(EnumC19998.f60758)) {
                C17175 c17176 = (C17175) c17175.f51143;
                c17176.f51144 = c17175.f51144.m10292(c17176.f51144);
                this.f77797 = c17176;
                return;
            }
        }
        this.f77797 = c17175;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r9 == false) goto L27;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4848 m54048(AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849) {
        if (!c4848.isEmpty()) {
            C20271 c20271 = new C20271();
            boolean z = false;
            C4848 c48410 = c4849;
            while (true) {
                boolean z2 = true;
                if (!c4848.f11035.m10293()) {
                    break;
                }
                AbstractC14355 abstractC14355M54069 = m54069((AbstractC6462) c4848.f11034, (AbstractC14355) c48410.f11034);
                if (abstractC14355M54069 == c48410.f11034) {
                    z2 = false;
                }
                z |= z2;
                c20271.m45777(abstractC14355M54069);
                c48410 = c48410.f11035;
                c4848 = c4848.f11035;
            }
            AbstractC6462 abstractC6463 = (AbstractC6462) c4848.f11034;
            if (abstractC6462 != null) {
                C20271 c20272 = new C20271();
                while (c48410.m10293()) {
                    c20272.m45777(m54069(abstractC6462, (AbstractC14355) c48410.f11034));
                    c48410 = c48410.f11035;
                }
                C18537 c18537 = this.f77556;
                C19859 c19859M42201 = c18537.m42201(c18537.m42208(abstractC6462), C4848.m10283(), c20272.m45783());
                c19859M42201.f18925 = new C7251(abstractC6462, this.f77566.f69187);
                c20271.m45777(c19859M42201);
            } else {
                if (c48410.m10289() != 1) {
                    throw new AssertionError(c48410);
                }
                AbstractC14355 abstractC14355M540610 = m54069(abstractC6463, (AbstractC14355) c48410.f11034);
                boolean z3 = z | (abstractC14355M540610 != c48410.f11034);
                c20271.m45777(abstractC14355M540610);
            }
            return c20271.m45783();
        }
        return c4849;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 m54057(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        boolean zMo14805 = abstractC14355.f18925.mo14805();
        if (zMo14805 == abstractC6462.mo14805()) {
            return abstractC14355;
        }
        if (zMo14805) {
            C8374 c8374 = this.f77549;
            AbstractC6462 abstractC6462M19503 = c8374.m19503(abstractC6462);
            if (!abstractC6462M19503.m14777(EnumC11353.NONE)) {
                if (!c8374.m19486(abstractC14355.f18925, abstractC6462M19503, true)) {
                    abstractC14355.f18925 = abstractC6462M19503.mo5576(abstractC14355.f18925.mo14779());
                }
                return m54067(c8374.m19459(abstractC6462), abstractC14355);
            }
            return m54067(c8374.m19436(abstractC14355.f18925).f20406, abstractC14355);
        }
        return m54071(abstractC6462, abstractC14355);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17175 m54067(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        abstractC14355.getClass();
        m54063((InterfaceC5323) abstractC14355);
        C5771 c5771M54013 = m54013(abstractC14355, this.f77543.f21754, abstractC6462, C4848.m10283().m10290(abstractC14355.f18925));
        C18537 c18537 = this.f77556;
        return c18537.m42200(c18537.m42197(c5771M54013), C4848.m10276of((Object) abstractC14355));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17175 m54071(AbstractC6462 abstractC6462, AbstractC14355 abstractC14355) {
        AbstractC6462 abstractC6463 = abstractC14355.f18925;
        C8374 c8374 = this.f77549;
        AbstractC6462 abstractC6462M19503 = c8374.m19503(abstractC6463);
        if (!abstractC6462M19503.m14777(EnumC11353.NONE)) {
            if (!c8374.m19486(abstractC6462M19503, abstractC6462, true)) {
                throw new AssertionError(abstractC14355);
            }
            abstractC6462 = abstractC6462M19503;
        } else {
            if (!abstractC6462.mo14805()) {
                throw new AssertionError(abstractC6462);
            }
            m54063((InterfaceC5323) abstractC14355);
            abstractC14355 = this.f77556.m42178(c8374.m19436(abstractC6462).f20406, abstractC14355);
        }
        m54063((InterfaceC5323) abstractC14355);
        C5771 c5771M54013 = m54013(abstractC14355, abstractC6462.f16705.f20408.m28202(this.f77543.f21681), abstractC14355.f18925, C4848.m10283());
        C18537 c18537 = this.f77556;
        return c18537.m42171((AbstractC14355) c18537.m42154(abstractC14355, c5771M54013));
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3818(C16505 c16505) {
        AbstractC7257 abstractC7257Mo25569 = mo25569((AbstractC7257) c16505.f48507);
        AbstractC14355 abstractC14355 = c16505.f48507;
        AbstractC7257 abstractC7257 = c16505;
        if (abstractC7257Mo25569 != abstractC14355) {
            abstractC7257 = abstractC7257Mo25569;
        }
        this.f77797 = abstractC7257;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3817(C16366 c16366) {
        c16366.f48093 = (AbstractC14355) mo25569((AbstractC7257) c16366.f48093);
        c16366.f48092 = m54069(this.f77566.f69134, c16366.f48092);
        this.f77797 = c16366;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        AbstractC14355 abstractC14355 = c22403.f70670;
        AbstractC14355 abstractC14356 = this.f77574;
        this.f77574 = c22403;
        AbstractC7257 abstractC7257Mo25569 = mo25569((AbstractC7257) abstractC14355);
        this.f77574 = abstractC14356;
        AbstractC14355 abstractC14357 = (AbstractC14355) abstractC7257Mo25569;
        c22403.f70670 = abstractC14357;
        c22403.f70671 = m54069(abstractC14357.f18925, c22403.f70671);
        if (c22403.f70670.m16617(EnumC19998.f60758)) {
            C17175 c17175 = (C17175) c22403.f70670;
            c17175.f51144 = C4848.m10276of((Object) c22403.f70671).m10292(c17175.f51144);
            this.f77797 = c17175;
            return;
        }
        this.f77797 = c22403;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(final C11674 c11674) {
        AbstractC21062 abstractC21062M42200;
        final boolean z = !c11674.f32571.f18925.mo14805() && c11674.f5602.f20406.mo14787().mo14805();
        C5732 c5732 = new C5732();
        c5732.f14040 = false;
        c5732.f14041 = C9268.m21438(c11674.f32571);
        c5732.mo12739(c11674.f32570);
        if (z || c5732.f14040) {
            this.f77797 = mo25569((AbstractC7257) m54062(c11674.f32571, new InterfaceC13779() { // from class: l.᩸᩺֨
                @Override // p067l.InterfaceC13779
                /* JADX INFO: renamed from: ֫ */
                public final AbstractC14355 mo5148(AbstractC14355 abstractC14355) {
                    return C24507.m54024(this.f72774, c11674, z, abstractC14355);
                }
            }));
            return;
        }
        AbstractC7257 abstractC7257 = c11674.f32571;
        AbstractC14355 abstractC14355 = this.f77574;
        this.f77574 = c11674;
        AbstractC7257 abstractC7257Mo25569 = mo25569(abstractC7257);
        this.f77574 = abstractC14355;
        c11674.f32571 = (AbstractC14355) abstractC7257Mo25569;
        c11674.f32570 = m54069((AbstractC6462) c11674.f5602.f20406.mo14797().f11035.f11034, c11674.f32570);
        if (c11674.f32571.m16617(EnumC19998.f60758)) {
            C17175 c17175 = (C17175) c11674.f32571;
            if (c11674.f5602.f5586 == 256) {
                abstractC21062M42200 = c11674.f32570;
                if (abstractC21062M42200.f18925.mo14771()) {
                    C5771 c5771M54013 = m54013(abstractC21062M42200, this.f77543.f21754, this.f77566.f69215, C4848.m10276of((Object) abstractC21062M42200.f18925));
                    C18537 c18537 = this.f77556;
                    abstractC21062M42200 = c18537.m42200(c18537.m42197(c5771M54013), C4848.m10276of((Object) abstractC21062M42200));
                }
            } else {
                abstractC21062M42200 = c11674.f32570;
            }
            c17175.f51144 = C4848.m10276of((Object) abstractC21062M42200).m10292(c17175.f51144);
            this.f77797 = c17175;
            return;
        }
        this.f77797 = c11674;
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
    /* JADX INFO: renamed from: ֫ */
    public static C22403 m54024(C24507 c24507, C11674 c11674, boolean z, AbstractC14355 abstractC14355) {
        EnumC19998 enumC19998M45374 = c11674.mo3383().m45374();
        C3088 c3088M27496 = c24507.f77555.m27496(c11674, enumC19998M45374, c11674.f18925, c11674.f32570.f18925);
        AbstractC14355 abstractC14355M42178 = (AbstractC14355) abstractC14355.clone();
        AbstractC6462 abstractC6462 = abstractC14355M42178.f18925;
        AbstractC6462 abstractC6463 = c11674.f18925;
        if (abstractC6462 != abstractC6463) {
            abstractC14355M42178 = c24507.f77556.m42178(abstractC6463, abstractC14355M42178);
        }
        C11003 c11003M42162 = c24507.f77556.m42162(enumC19998M45374, abstractC14355M42178, c11674.f32570);
        c11003M42162.f5602 = c3088M27496;
        c11003M42162.f18925 = c3088M27496.f20406.mo14787();
        AbstractC14355 abstractC14355M42179 = c11003M42162;
        if (z) {
            abstractC14355M42179 = c24507.f77556.m42178(c24507.f77549.m19503(c11674.f18925), c11003M42162);
        }
        C22403 c22403M42184 = c24507.f77556.m42184(abstractC14355, abstractC14355M42179);
        c22403M42184.f18925 = c11674.f18925;
        return c22403M42184;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5916 m54015(C24507 c24507, C8598 c8598, AbstractC14355 abstractC14355, boolean z, AbstractC14355 abstractC14356) {
        EnumC19998 enumC19998 = c8598.m16617(EnumC19998.f60723) ? EnumC19998.f60797 : EnumC19998.f60750;
        AbstractC14355 abstractC14355M42178 = (AbstractC14355) abstractC14355.clone();
        if (z) {
            abstractC14355M42178 = c24507.f77556.m42178(c8598.f23105.f18925, abstractC14355M42178);
        }
        C24552 c24552M42186 = c24507.f77556.m42186((Object) 1);
        C11674 c11674M42167 = c24507.f77556.m42167(enumC19998, (AbstractC7257) abstractC14355M42178, (AbstractC7257) c24552M42186);
        c11674M42167.f5602 = c24507.f77555.m27496(c11674M42167, c11674M42167.mo3383().m45374(), abstractC14355M42178.f18925, c24552M42186.f18925);
        c11674M42167.f18925 = abstractC14355M42178.f18925;
        C18537 c18537 = c24507.f77556;
        C5916 c5916M42205 = c18537.m42205(abstractC14356, C4848.m10276of((Object) c18537.m42196(c11674M42167)));
        c5916M42205.f18925 = abstractC14356.f18925;
        return c5916M42205;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(final C8598 c8598) {
        boolean zM45371 = c8598.mo3383().m45371();
        if (zM45371 && !c8598.f23105.f18925.mo14805()) {
            switch (C7073.f18425[c8598.mo3383().ordinal()]) {
                case 8:
                case 9:
                    EnumC19998 enumC19998 = c8598.m16617(EnumC19998.f60760) ? EnumC19998.f60797 : EnumC19998.f60750;
                    AbstractC14355 abstractC14355 = c8598.f23105;
                    C24552 c24552M42186 = this.f77556.m42186((Object) 1);
                    C11674 c11674M42167 = this.f77556.m42167(enumC19998, (AbstractC7257) abstractC14355, (AbstractC7257) c24552M42186);
                    c11674M42167.f5602 = this.f77555.m27496(c11674M42167, c11674M42167.mo3383().m45374(), abstractC14355.f18925, c24552M42186.f18925);
                    c11674M42167.f18925 = abstractC14355.f18925;
                    this.f77797 = m54069(c8598.f18925, c11674M42167);
                    return;
                case 10:
                case 11:
                    final boolean zM16617 = C9268.m21424(c8598.f23105).m16617(EnumC19998.f60713);
                    this.f77797 = m54069(c8598.f18925, m54062(c8598.f23105, new InterfaceC13779() { // from class: l.֨᩺֨
                        @Override // p067l.InterfaceC13779
                        /* JADX INFO: renamed from: ֫ */
                        public final AbstractC14355 mo5148(final AbstractC14355 abstractC14356) {
                            final C8598 c8599 = c8598;
                            AbstractC6462 abstractC6462 = c8599.f23105.f18925;
                            final C24507 c24507 = this.f7872;
                            final boolean z = zM16617;
                            return c24507.m54060(abstractC14356, abstractC6462, new InterfaceC13779() { // from class: l.᩵᩺֨
                                @Override // p067l.InterfaceC13779
                                /* JADX INFO: renamed from: ֫ */
                                public final AbstractC14355 mo5148(AbstractC14355 abstractC14357) {
                                    return C24507.m54015(c24507, c8599, abstractC14356, z, abstractC14357);
                                }
                            });
                        }
                    }));
                    return;
                default:
                    throw new AssertionError(c8598);
            }
        }
        AbstractC7257 abstractC7257 = c8598.f23105;
        AbstractC14355 abstractC14356 = this.f77574;
        this.f77574 = c8598;
        AbstractC7257 abstractC7257Mo25569 = mo25569(abstractC7257);
        this.f77574 = abstractC14356;
        c8598.f23105 = m54057(c8598.f18925, (AbstractC14355) abstractC7257Mo25569);
        if (c8598.m16617(EnumC19998.f60712) && c8598.f23105.f18925.mo14779() != null) {
            c8598.f18925 = this.f77548.m15514(257, c8598.f23105.f18925);
        }
        if (zM45371 && c8598.f23105.m16617(EnumC19998.f60758)) {
            this.f77797 = c8598.f23105;
        } else {
            this.f77797 = c8598;
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        C4848 c4848Mo14797 = c11003.f5602.f20406.mo14797();
        AbstractC14355 abstractC14355M54069 = m54069((AbstractC6462) c4848Mo14797.f11034, c11003.f30470);
        c11003.f30470 = abstractC14355M54069;
        int i = C7073.f18425[c11003.mo3383().ordinal()];
        if (i != 12) {
            if (i == 13) {
                if (m54037(abstractC14355M54069)) {
                    this.f77797 = abstractC14355M54069;
                    return;
                } else if (m54043(abstractC14355M54069)) {
                    this.f77797 = m54069((AbstractC6462) c4848Mo14797.f11035.f11034, c11003.f30469);
                    return;
                }
            }
        } else if (m54043(abstractC14355M54069)) {
            this.f77797 = abstractC14355M54069;
            return;
        } else if (m54037(abstractC14355M54069)) {
            this.f77797 = m54069((AbstractC6462) c4848Mo14797.f11035.f11034, c11003.f30469);
            return;
        }
        c11003.f30469 = m54069((AbstractC6462) c4848Mo14797.f11035.f11034, c11003.f30469);
        this.f77797 = c11003;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        this.f77797 = m54058(c9661.f26611, (AbstractC14355) c9661, this.f77574, false);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        C4968 c4968M42145;
        C21826 c21826;
        AbstractC6462 abstractC6462 = c6979.f18158.f18925;
        C8374 c8374 = this.f77549;
        AbstractC6462 abstractC6462M19455 = c8374.m19455(abstractC6462);
        EnumC12720 enumC12720 = this.f77578;
        C22004 c22004 = this.f77566;
        C8200 c8200 = this.f77543;
        if (abstractC6462M19455 == null) {
            AbstractC14355 abstractC14355 = c6979.f18158;
            abstractC14355.getClass();
            m54063((InterfaceC5323) abstractC14355);
            AbstractC6462 abstractC6462M19459 = c22004.f69208;
            AbstractC6462 abstractC6462M19467 = c8374.m19467(c22004.f69188.f16705, C8374.m19413(c6979.f18158.f18925));
            if (abstractC6462M19467.mo14802().m10293()) {
                abstractC6462M19459 = c8374.m19459((AbstractC6462) abstractC6462M19467.mo14802().f11034);
            }
            AbstractC6462 abstractC6462M19466 = c8374.m19466(c6979.f18158.f18925, false);
            c6979.f18158.f18925 = c8374.m19459(abstractC6462M19466);
            if (abstractC6462M19466.mo7388()) {
                c6979.f18158 = this.f77556.m42178(c8374.m19459(abstractC6462M19467), c6979.f18158);
            }
            AbstractC14355 abstractC14356 = c6979.f18158;
            abstractC14356.getClass();
            C5771 c5771M54013 = m54013(abstractC14356, c8200.f21741, abstractC6462M19466, C4848.m10283());
            C13818 c13818 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, c8200.f21738.m32717(C0655am.f2275aC + enumC12720.m29249()), c8374.m19459(c8374.m19467(c22004.f69194.f16705, c5771M54013.f20406.mo14787())), this.f77542);
            C18537 c18537 = this.f77556;
            C8320 c8320M42154 = c18537.m42154(c6979.f18158, c5771M54013);
            c8320M42154.f18925 = c8374.m19459(c5771M54013.f20406);
            C11281 c11281M42166 = c18537.m42166(c13818, (AbstractC14355) c18537.m42171((AbstractC14355) c8320M42154));
            AbstractC14355 abstractC14357 = c6979.f18158;
            abstractC14357.getClass();
            C5771 c5771M54014 = m54013(abstractC14357, c8200.f21721, c13818.f20406, C4848.m10283());
            C18537 c18538 = this.f77556;
            C17175 c17175M42171 = c18538.m42171((AbstractC14355) c18538.m42154(c18538.m42157((AbstractC7783) c13818), c5771M54014));
            AbstractC14355 abstractC14358 = c6979.f18158;
            abstractC14358.getClass();
            C5771 c5771M54015 = m54013(abstractC14358, c8200.f21761, c13818.f20406, C4848.m10283());
            C18537 c18539 = this.f77556;
            C17175 c17175M42172 = c18539.m42171((AbstractC14355) c18539.m42154(c18539.m42157((AbstractC7783) c13818), c5771M54015));
            C19327 c19327M42178 = c6979.f18157.f18925.mo14805() ? this.f77556.m42178(C8374.m19413(abstractC6462M19459), c17175M42172) : this.f77556.m42178(c6979.f18157.f18925, c17175M42172);
            C18537 c185310 = this.f77556;
            C11281 c11281 = c6979.f18157;
            C11281 c11281M42163 = c185310.m42163(c11281.f31435, c11281.f31433, c11281.f31437, c19327M42178);
            C11281 c11282 = c6979.f18157;
            c11281M42163.f18925 = c11282.f18925;
            c11281M42163.f31438 = c11282.f31438;
            c4968M42145 = this.f77556.m42145(0L, C4848.m10277of((Object) c11281M42163, (Object) c6979.f18156));
            c4968M42145.f11315 = C9268.m21433(c6979.f18156);
            AbstractC7257 abstractC7257Mo25569 = mo25569(this.f77556.m42169(C4848.m10276of((Object) c11281M42166), c17175M42171, C4848.m10283(), c4968M42145));
            this.f77797 = abstractC7257Mo25569;
            c21826 = new C21826(c6979, abstractC7257Mo25569);
        } else {
            AbstractC14355 abstractC14359 = c6979.f18158;
            abstractC14359.getClass();
            m54063((InterfaceC5323) abstractC14359);
            String str = "arr" + enumC12720.m29249();
            AbstractC14235 abstractC14235 = c8200.f21738;
            C13818 c13819 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC14235.m32717(str), c6979.f18158.f18925, this.f77542);
            C11281 c11281M42167 = this.f77556.m42166(c13819, c6979.f18158);
            AbstractC12224 abstractC12224M32717 = abstractC14235.m32717("len" + enumC12720.m29249());
            C9262 c9262 = c22004.f69134;
            C13818 c138110 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC12224M32717, c9262, this.f77542);
            C18537 c185311 = this.f77556;
            C11281 c11281M42168 = c185311.m42166(c138110, c185311.m42154(c185311.m42157((AbstractC7783) c13819), c22004.f69214));
            C13818 c138111 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC14235.m32717(C0655am.f2275aC + enumC12720.m29249()), c9262, this.f77542);
            C18537 c185312 = this.f77556;
            C11281 c11281M42169 = c185312.m42166(c138111, c185312.m42187(EnumC11353.INT, (Object) 0));
            AbstractC14355 abstractC143510 = c11281M42169.f31436;
            AbstractC6462 abstractC6462Mo5576 = c9262.mo5576((Object) 0);
            c11281M42169.f18925 = abstractC6462Mo5576;
            abstractC143510.f18925 = abstractC6462Mo5576;
            C4848 c4848M10278of = C4848.m10278of((Object) c11281M42167, (Object) c11281M42168, (Object) c11281M42169);
            C11003 c11003M54054 = m54054(EnumC19998.f60763, this.f77556.m42157((AbstractC7783) c138111), this.f77556.m42157((AbstractC7783) c138110));
            C18537 c185313 = this.f77556;
            C12344 c12344M42196 = c185313.m42196(m54053(EnumC19998.f60760, c185313.m42157((AbstractC7783) c138111)));
            AbstractC6462 abstractC6462M19456 = c8374.m19455(c6979.f18158.f18925);
            C18537 c185314 = this.f77556;
            C16366 c16366M42199 = c185314.m42199(c185314.m42157((AbstractC7783) c13819), this.f77556.m42157((AbstractC7783) c138111));
            c16366M42199.f18925 = abstractC6462M19456;
            C18537 c185315 = this.f77556;
            C11281 c11283 = c6979.f18157;
            C11281 c11281M42164 = c185315.m42163(c11283.f31435, c11283.f31433, c11283.f31437, c16366M42199);
            C11281 c11284 = c6979.f18157;
            c11281M42164.f18925 = c11284.f18925;
            c11281M42164.f31438 = c11284.f31438;
            c4968M42145 = this.f77556.m42145(0L, C4848.m10277of((Object) c11281M42164, (Object) c6979.f18156));
            AbstractC7257 abstractC7257Mo255610 = mo25569(this.f77556.m42169(c4848M10278of, c11003M54054, C4848.m10276of((Object) c12344M42196), c4968M42145));
            this.f77797 = abstractC7257Mo255610;
            c21826 = new C21826(c6979, abstractC7257Mo255610);
        }
        c4968M42145.mo3382(c21826);
    }

    public C24507(C5127 c5127) {
        c5127.m10908(f77534, this);
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f77543 = c8200M18988;
        this.f77557 = C23623.m52439(c5127);
        this.f77566 = C22004.m49577(c5127);
        this.f77568 = C23663.m52629(c5127);
        this.f77555 = C12004.m27492(c5127);
        this.f77562 = C16852.m38215(c5127);
        this.f77572 = C11216.m25910(c5127);
        this.f77556 = C18537.m42139(c5127);
        this.f77548 = C6795.m15513(c5127);
        EnumC12720 enumC12720M29246 = EnumC12720.m29246(c5127);
        this.f77578 = enumC12720M29246;
        this.f77551 = C18318.m41754(c5127);
        this.f77561 = c8200M18988.f21738.m32717(enumC12720M29246.m29249() + "assertionsDisabled");
        this.f77549 = C8374.m19396(c5127);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f77536 = c13565M30871.m30879("debuglower");
        this.f77537 = EnumC20590.m46547(c13565M30871);
        this.f77547 = c13565M30871.m30879("disableProtectedAccessors");
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C5771 c5771 = this.f77542;
        c11281.f31435 = (C4436) mo25569(c11281.f31435);
        c11281.f31437 = (AbstractC14355) mo25569((AbstractC7257) c11281.f31437);
        if (this.f77542 == null) {
            this.f77542 = new C5771((c11281.f31435.f9954 & 8) | 1048576, this.f77543.f21725, null, this.f77570);
        }
        AbstractC14355 abstractC14355 = c11281.f31436;
        if (abstractC14355 != null) {
            c11281.f31436 = m54069(c11281.f18925, abstractC14355);
        }
        this.f77797 = c11281;
        this.f77542 = c5771;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        C5771 c5771 = this.f77542;
        if (c5771 == null) {
            this.f77542 = new C5771(c4968.f11317 | 1048576, this.f77543.f21725, null, this.f77570);
        }
        super.mo3785(c4968);
        this.f77542 = c5771;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        c21732.f68446 = (AbstractC13154) mo25569(c21732.f68446);
        c21732.f68447 = m54069(this.f77566.f69151, c21732.f68447);
        this.f77797 = c21732;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        c10610.f29370 = m54069(this.f77566.f69151, c10610.f29370);
        c10610.f29369 = (AbstractC13154) mo25569(c10610.f29369);
        this.f77797 = c10610;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        c13685.f38597 = m54183(c13685.f38597);
        AbstractC14355 abstractC14355 = c13685.f38598;
        if (abstractC14355 != null) {
            c13685.f38598 = m54069(this.f77566.f69151, abstractC14355);
        }
        c13685.f38596 = m54183(c13685.f38596);
        c13685.f38595 = (AbstractC13154) mo25569(c13685.f38595);
        this.f77797 = c13685;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        AbstractC14355 abstractC14355 = c11813.f32975;
        if (abstractC14355 != null) {
            c11813.f32975 = m54069(this.f77549.m19459(this.f77535.f28966.f18925), abstractC14355);
        }
        this.f77797 = c11813;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        m54027(c23882, c23882.f75829, c23882.f75830 ? m54041(c23882.f75828) : c23882.f75828);
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        m54027(c15164, c15164.f43267, m54041(c15164.f43269));
    }

    /* JADX INFO: renamed from: ᩳ */
    private C4848 m54041(C4848 c4848) {
        if (!C7480.stream(c4848).flatMap(new C5270(7)).noneMatch(new C17801())) {
            return c4848;
        }
        C3904 c3904M42214 = this.f77556.m42214(m54064(this.f77566.f69211, C4848.m10283()));
        C18537 c18537 = this.f77556;
        return c4848.m10290(c18537.m42181(C20391.f63041, C4848.m10276of((Object) c18537.m42185()), C4848.m10276of((Object) c3904M42214), (AbstractC7257) null));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54027(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355, C4848 c4848) {
        C20391 c20391;
        AbstractC14355 abstractC14355M54071;
        AbstractC7257 abstractC7258;
        AbstractC7257 abstractC7257M42196;
        C20391 c20392;
        Object objM42186;
        AbstractC14355 abstractC14355M42170;
        AbstractC7257 abstractC7257M42211;
        C24552 c24552M42186;
        C20271<C20391> c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (true) {
            c20391 = null;
            if (!it.hasNext()) {
                break;
            }
            C20391 c20393 = (C20391) it.next();
            int iM10289 = c20393.f63044.m10289();
            if (iM10289 == 0 || iM10289 == 1) {
                c20271.m45777(c20393);
            } else {
                C4848 c4849 = c20393.f63044;
                while (c4849.f11035.m10293()) {
                    c20271.m45777(m54063((InterfaceC5323) c20393).m42181(C20391.f63041, C4848.m10276of(c4849.f11034), C4848.m10283(), (AbstractC7257) null));
                    c4849 = c4849.f11035;
                }
                c20393.f63044 = c4849;
                c20271.m45777(c20393);
            }
        }
        for (C20391 c20394 : c20271) {
            if (c20394.f63046 == C20391.f63040 && c20394.f63045) {
                C18537 c18537 = this.f77556;
                c18537.f55352 = C9268.m21433((AbstractC7257) c20394.f63043.last());
                C6309 c6309M42149 = c18537.m42149((AbstractC12224) null);
                c6309M42149.f16360 = abstractC7257;
                c20394.f63043 = c20394.f63043.m10286(c6309M42149);
            }
        }
        C4848<C20391> c4848M45783 = c20271.m45783();
        AbstractC6462 abstractC6462 = abstractC14355.f18925;
        C8374 c8374 = this.f77549;
        AbstractC6462 abstractC6462M19502 = c8374.m19502(abstractC6462);
        boolean z = (abstractC6462M19502 == null || (abstractC14355.f18925.f16705.mo18003() & 16384) == 0) ? false : true;
        C22004 c22004 = this.f77566;
        boolean z2 = abstractC6462M19502 != null && c8374.m19490(abstractC14355.f18925, c22004.f69215);
        boolean z3 = (z || z2 || abstractC14355.f18925.mo14805()) ? false : true;
        AbstractC14355 abstractC14355M54069 = m54069(abstractC14355.f18925, abstractC14355);
        m54184(c4848M45783);
        if (abstractC7257.m16617(EnumC19998.f60782)) {
            C23882 c23882 = (C23882) abstractC7257;
            c23882.f75829 = abstractC14355M54069;
            c23882.f75828 = c4848M45783;
        } else {
            if (!abstractC7257.m16617(EnumC19998.f60779)) {
                C1446.m31698();
                throw null;
            }
            C15164 c15164 = (C15164) abstractC7257;
            c15164.f43267 = abstractC14355M54069;
            c15164.f43269 = c4848M45783;
        }
        EnumC12720 enumC12720 = this.f77578;
        C8200 c8200 = this.f77543;
        if (z) {
            AbstractC21195 abstractC21195 = abstractC14355M54069.f18925.f16705;
            LinkedHashMap linkedHashMap = this.f77571;
            C12438 c12438 = (C12438) linkedHashMap.get(abstractC21195);
            if (c12438 == null) {
                c12438 = new C12438(this, abstractC7257, abstractC21195);
                linkedHashMap.put(abstractC21195, c12438);
            }
            C13818 c13818 = c12438.f34772;
            m54063((InterfaceC5323) abstractC7257);
            C5771 c5771M54013 = m54013(abstractC7257, c8200.f21726, abstractC14355M54069.f18925, C4848.m10283());
            if (C7480.stream(c4848M45783).anyMatch(new C17653(2))) {
                C13818 c13819 = new C13818(4112L, c8200.f21738.m32717(C0655am.f2274aB + abstractC7257.f18924 + enumC12720.m29249()), abstractC14355M54069.f18925, this.f77542);
                C18537 c18538 = this.f77556;
                c18538.m42189((InterfaceC5323) abstractC7257);
                C11281 c11281M42166 = c18538.m42166(c13819, abstractC14355M54069);
                c11281M42166.f18925 = c13819.f20406;
                C18537 c18539 = this.f77556;
                C16366 c16366M42170 = c18539.m42170(c13818, c18539.m42171((AbstractC14355) c18539.m42154(c18539.m42157((AbstractC7783) c13819), c5771M54013)));
                C18537 c185310 = this.f77556;
                C4848 c4848M10276of = C4848.m10276of((Object) c11281M42166);
                C18537 c185311 = this.f77556;
                C10332 c10332M42159 = c185311.m42159(m54054(EnumC19998.f60794, c185311.m42157((AbstractC7783) c13819), m54072()), c16366M42170, m54065((Object) (-1), c22004.f69134));
                c10332M42159.f18925 = c16366M42170.f18925;
                abstractC14355M42170 = c185310.m42205((AbstractC14355) c10332M42159, c4848M10276of);
                abstractC14355M42170.f18925 = c16366M42170.f18925;
            } else {
                C18537 c185312 = this.f77556;
                abstractC14355M42170 = c185312.m42170(c13818, c185312.m42171((AbstractC14355) c185312.m42154(abstractC14355M54069, c5771M54013)));
            }
            C20271 c20272 = new C20271();
            for (C20391 c20395 : c4848M45783) {
                if (((AbstractC21062) c20395.f63044.f11034).mo32948()) {
                    if (C9268.m21395((AbstractC7257) c20395.f63044.f11034)) {
                        c24552M42186 = m54065((Object) (-1), c22004.f69134);
                    } else {
                        C13818 c138110 = (C13818) C9268.m21438((AbstractC14355) c20395.f63044.f11034);
                        LinkedHashMap linkedHashMap2 = c12438.f34773;
                        Integer numValueOf = (Integer) linkedHashMap2.get(c138110);
                        if (numValueOf == null) {
                            int i = c12438.f34774;
                            c12438.f34774 = i + 1;
                            numValueOf = Integer.valueOf(i);
                            linkedHashMap2.put(c138110, numValueOf);
                        }
                        c24552M42186 = c12438.f34775.f77556.m42186(numValueOf);
                    }
                    c20272.m45777(this.f77556.m42181(C20391.f63041, C4848.m10276of((Object) c24552M42186), c20395.f63043, (AbstractC7257) null));
                } else {
                    c20272.m45777(c20395);
                }
            }
            if (abstractC7257.m16617(EnumC19998.f60782)) {
                abstractC7257M42211 = this.f77556.m42215(abstractC14355M42170, c20272.m45783());
            } else {
                if (!abstractC7257.m16617(EnumC19998.f60779)) {
                    C1446.m31698();
                    throw null;
                }
                abstractC7257M42211 = this.f77556.m42211(abstractC14355M42170, c20272.m45783());
                abstractC7257M42211.f18925 = abstractC7257.f18925;
            }
            abstractC7257M42211.mo3382(new C21826(abstractC7257, abstractC7257M42211));
            this.f77797 = abstractC7257M42211;
            return;
        }
        if (!z2) {
            if (!z3) {
                this.f77797 = abstractC7257;
                return;
            }
            if (C7480.stream(c4848M45783).anyMatch(new C3572(1))) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C20391 c20396 = null;
                for (C20391 c20397 : c4848M45783) {
                    if (C9268.m21395((AbstractC7257) c20397.f63044.f11034)) {
                        c20396 = c20397;
                    } else if (!((AbstractC21062) c20397.f63044.f11034).m16617(EnumC19998.f60740)) {
                        Integer num = (Integer) ((AbstractC21062) c20397.f63044.f11034).f18925.mo14779();
                        num.getClass();
                        linkedHashSet.add(num);
                    }
                }
                C1446.m31699(c20396);
                int iIntValue = linkedHashSet.isEmpty() ? 0 : ((Integer) linkedHashSet.iterator().next()).intValue();
                while (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    iIntValue++;
                }
                linkedHashSet.add(Integer.valueOf(iIntValue));
                C4848 c48410 = c20396.f63044;
                AbstractC6462 abstractC6463 = c22004.f69134;
                c48410.f11034 = m54065(Integer.valueOf(iIntValue), abstractC6463);
                int i2 = iIntValue;
                while (linkedHashSet.contains(Integer.valueOf(i2))) {
                    i2++;
                }
                C13818 c138111 = new C13818(4112L, c8200.f21738.m32717(C0655am.f2274aB + abstractC7257.f18924 + enumC12720.m29249()), abstractC14355M54069.f18925, this.f77542);
                C18537 c185313 = this.f77556;
                c185313.m42189((InterfaceC5323) abstractC7257);
                C11281 c11281M42167 = c185313.m42166(c138111, abstractC14355M54069);
                c11281M42167.f18925 = c138111.f20406;
                C18537 c185314 = this.f77556;
                EnumC19998 enumC19998 = EnumC19998.f60794;
                C10332 c10332M421510 = c185314.m42159(m54054(enumC19998, m54071(abstractC6463, c185314.m42157((AbstractC7783) c138111)), m54065(Integer.valueOf(iIntValue), abstractC6463)), m54071(abstractC6463, this.f77556.m42157((AbstractC7783) c138111)), m54065(Integer.valueOf(i2), abstractC6463));
                c10332M421510.f18925 = abstractC6463;
                C18537 c185315 = this.f77556;
                C10332 c10332M421511 = c185315.m42159(m54054(enumC19998, c185315.m42157((AbstractC7783) c138111), m54072()), c10332M421510, m54065(Integer.valueOf(iIntValue), abstractC6463));
                c10332M421511.f18925 = abstractC6463;
                abstractC14355M54071 = this.f77556.m42205((AbstractC14355) c10332M421511, C4848.m10276of((Object) c11281M42167));
                abstractC14355M54071.f18925 = abstractC6463;
            } else {
                abstractC14355M54071 = m54071(c22004.f69134, abstractC14355M54069);
            }
            if (abstractC7257.m16617(EnumC19998.f60782)) {
                ((C23882) abstractC7257).f75829 = abstractC14355M54071;
            } else {
                ((C15164) abstractC7257).f43267 = abstractC14355M54071;
            }
            this.f77797 = abstractC7257;
            return;
        }
        int iM102810 = c4848M45783.m10289();
        if (iM102810 == 0) {
            C18537 c185316 = this.f77556;
            c185316.m42189((InterfaceC5323) abstractC7257);
            abstractC7257M42196 = c185316.m42196(this.f77572.m25948(abstractC14355M54069));
        } else {
            C20271 c20273 = new C20271();
            int i3 = iM102810 + 1;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i3, 1.0f);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i3, 1.0f);
            Iterator it2 = c4848M45783.iterator();
            int i4 = -1;
            int i5 = 0;
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C20391 c20398 = (C20391) it2.next();
                C4848 c48411 = c4848M45783;
                if (!((AbstractC21062) c20398.f63044.f11034).mo32948()) {
                    linkedHashMap3 = linkedHashMap3;
                } else if (C9268.m21395((AbstractC7257) c20398.f63044.f11034)) {
                    c20391 = c20398;
                    linkedHashMap3 = linkedHashMap3;
                    i4 = i5;
                } else {
                    String str = (String) ((AbstractC14355) c20398.f63044.f11034).f18925.mo14779();
                    C1446.m31706((Integer) linkedHashMap3.put(str, Integer.valueOf(i5)));
                    int iHashCode = str.hashCode();
                    int i6 = i4;
                    Set set = (Set) linkedHashMap4.get(Integer.valueOf(iHashCode));
                    if (set == null) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(1, 1.0f);
                        linkedHashSet2.add(str);
                        linkedHashMap4.put(Integer.valueOf(iHashCode), linkedHashSet2);
                    } else {
                        C1446.m31704(set.add(str));
                    }
                    i4 = i6;
                    c20391 = c20391;
                }
                i5++;
                it2 = it3;
                c4848M45783 = c48411;
                linkedHashMap3 = linkedHashMap3;
            }
            C4848<C20391> c48412 = c4848M45783;
            C20391 c20399 = c20391;
            int i7 = i4;
            LinkedHashMap linkedHashMap5 = linkedHashMap3;
            AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(C0655am.f2274aB + abstractC7257.f18924 + enumC12720.m29249());
            AbstractC6462 abstractC6464 = c22004.f69215;
            C9262 c9262 = c22004.f69134;
            C13818 c138112 = new C13818(4112L, abstractC12224M32717, abstractC6464, this.f77542);
            C18537 c185317 = this.f77556;
            c185317.m42189((InterfaceC5323) abstractC7257);
            C11281 c11281M42168 = c185317.m42166(c138112, abstractC14355M54069);
            c11281M42168.f18925 = c138112.f20406;
            c20273.m45777(c11281M42168);
            C13818 c138113 = new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, c8200.f21738.m32717("tmp" + abstractC7257.f18924 + enumC12720.m29249()), c9262, this.f77542);
            C18537 c185318 = this.f77556;
            C11281 c11281M42169 = c185318.m42166(c138113, c185318.m42187(EnumC11353.INT, (Object) (-1)));
            c11281M42169.f18925 = c138113.f20406;
            AbstractC14355 abstractC14356 = c11281M42169.f31436;
            c138113.f20406 = c9262;
            abstractC14356.f18925 = c9262;
            c20273.m45777(c11281M42169);
            C20271 c20274 = new C20271();
            C17175 c17175M54023 = m54023(this.f77556.m42157((AbstractC7783) c138112), c8200.f21652, C4848.m10283());
            c17175M54023.f18925 = c9262;
            C23882 c23882M42215 = this.f77556.m42215(c17175M54023, c20274.m45783());
            Iterator it4 = linkedHashMap4.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                Integer num2 = (Integer) entry.getKey();
                num2.getClass();
                Set set2 = (Set) entry.getValue();
                C1446.m31704(set2.size() >= 1);
                Iterator it5 = set2.iterator();
                C3765 c3765M42141 = null;
                while (it5.hasNext()) {
                    String str2 = (String) it5.next();
                    Iterator it6 = it4;
                    C17175 c17175M54024 = m54023(this.f77556.m42157((AbstractC7783) c138112), c8200.f21729, C4848.m10276of((Object) this.f77556.m42186(str2)));
                    C18537 c185319 = this.f77556;
                    Iterator it7 = it5;
                    C22403 c22403M42184 = c185319.m42184((AbstractC14355) c185319.m42157((AbstractC7783) c138113), (AbstractC14355) this.f77556.m42186(linkedHashMap5.get(str2)));
                    c22403M42184.f18925 = c138113.f20406;
                    c3765M42141 = c185319.m42141(c17175M54024, c185319.m42196(c22403M42184), c3765M42141);
                    it4 = it6;
                    it5 = it7;
                    c8200 = c8200;
                }
                Iterator it8 = it4;
                C20271 c20275 = new C20271();
                C6309 c6309M421410 = this.f77556.m42149((AbstractC12224) null);
                c6309M421410.f16360 = c23882M42215;
                c20275.m45777(c3765M42141);
                c20275.m45777(c6309M421410);
                C18537 c185320 = this.f77556;
                c20274.m45777(c185320.m42181(C20391.f63041, C4848.m10276of((Object) c185320.m42186(num2)), c20275.m45783(), (AbstractC7257) null));
                it4 = it8;
                c8200 = c8200;
            }
            c23882M42215.f75828 = c20274.m45783();
            if (c20399 != null) {
                C18537 c185321 = this.f77556;
                C11003 c11003M54054 = m54054(EnumC19998.f60794, c185321.m42157((AbstractC7783) c138112), m54072());
                C18537 c185322 = this.f77556;
                C22403 c22403M42185 = c185322.m42184((AbstractC14355) c185322.m42157((AbstractC7783) c138113), (AbstractC14355) this.f77556.m42186(Integer.valueOf(i7)));
                c22403M42185.f18925 = c138113.f20406;
                C3765 c3765M42142 = c185321.m42141(c11003M54054, c23882M42215, c185322.m42196(c22403M42185));
                c3765M42142.f18925 = c9262;
                c20273.m45777(c3765M42142);
            } else {
                c20273.m45777(c23882M42215);
            }
            C20271 c20276 = new C20271();
            for (C20391 c203910 : c48412) {
                if (((AbstractC21062) c203910.f63044.f11034).mo32948()) {
                    c20392 = c20399;
                    objM42186 = c203910 == c20392 ? this.f77556.m42186(Integer.valueOf(i7)) : this.f77556.m42186(linkedHashMap5.get((String) C9268.m21424((AbstractC14355) c203910.f63044.f11034).f18925.mo14779()));
                } else {
                    objM42186 = null;
                    c20392 = c20399;
                }
                C18537 c185323 = this.f77556;
                EnumC8690 enumC8690 = C20391.f63041;
                if (objM42186 == null) {
                    objM42186 = c185323.m42185();
                }
                c20276.m45777(c185323.m42181(enumC8690, C4848.m10276of(objM42186), c203910.f63043, (AbstractC7257) null));
                c20399 = c20392;
            }
            if (abstractC7257.m16617(EnumC19998.f60782)) {
                C18537 c185324 = this.f77556;
                C23882 c23882M42216 = c185324.m42215(c185324.m42157((AbstractC7783) c138113), c20276.m45783());
                c23882M42216.mo3382(new C21826(abstractC7257, c23882M42216));
                c20273.m45777(c23882M42216);
                C4968 c4968M42145 = this.f77556.m42145(0L, c20273.m45783());
                c4968M42145.f11315 = C9268.m21433(abstractC7257);
                abstractC7258 = c4968M42145;
            } else {
                C18537 c185325 = this.f77556;
                C15164 c15164M42211 = c185325.m42211(c185325.m42157((AbstractC7783) c138113), c20276.m45783());
                c15164M42211.mo3382(new C21826(abstractC7257, c15164M42211));
                c15164M42211.f18925 = abstractC7257.f18925;
                C5916 c5916M42205 = this.f77556.m42205((AbstractC14355) c15164M42211, c20273.m45783());
                c5916M42205.f14605 = true;
                c5916M42205.f18925 = abstractC7257.f18925;
                abstractC7258 = c5916M42205;
            }
            abstractC7257M42196 = abstractC7258;
        }
        this.f77797 = abstractC7257M42196;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        this.f77797 = c6309;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        c4575.f10248 = m54069(c4575.f10247.f18925, c4575.f10248);
        this.f77797 = c4575;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        c19859.f60358 = (AbstractC14355) mo25569((AbstractC7257) c19859.f60358);
        for (C4848 c4848 = c19859.f60360; c4848.f11035 != null; c4848 = c4848.f11035) {
            Object obj = c4848.f11034;
            if (obj != null) {
                c4848.f11034 = m54069(this.f77566.f69134, (AbstractC14355) obj);
            }
        }
        C4848 c4849 = c19859.f60359;
        AbstractC6462 abstractC6462M19455 = this.f77549.m19455(c19859.f18925);
        if (c4849 == null) {
            c4849 = null;
        } else {
            for (C4848 c48410 = c4849; c48410.m10293(); c48410 = c48410.f11035) {
                c48410.f11034 = m54069(abstractC6462M19455, (AbstractC14355) c48410.f11034);
            }
        }
        c19859.f60359 = c4849;
        this.f77797 = c19859;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        boolean zM16617 = c8320.f22261.m16617(EnumC19998.f60805);
        C8374 c8374 = this.f77549;
        C8200 c8200 = this.f77543;
        boolean z = zM16617 && C9268.m21428(c8320.f22261) == c8200.f21756 && !c8374.m19449(((C8320) c8320.f22261).f22261.f18925.f16705, (AbstractC21195) this.f77570);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo25569(c8320.f22261);
        c8320.f22261 = abstractC14355;
        AbstractC12224 abstractC12224 = c8320.f22259;
        AbstractC12224 abstractC12225 = c8200.f21752;
        AbstractC12224 abstractC12226 = c8200.f21756;
        if (abstractC12224 == abstractC12225) {
            this.f77797 = m54019(abstractC14355.f18925, (AbstractC7257) abstractC14355);
            return;
        }
        if (abstractC12224 == abstractC12226 && c8374.m19449(abstractC14355.f18925.f16705, (AbstractC21195) this.f77570)) {
            C1446.m31699(c8374.m19467(c8320.f22261.f18925.f16705, this.f77570.f20406));
            this.f77797 = c8320;
            return;
        }
        AbstractC12224 abstractC12227 = c8320.f22259;
        if (abstractC12227 == c8200.f21744 || abstractC12227 == abstractC12226) {
            this.f77797 = m54056(c8320, c8320.f22261.f18925.f16705);
        } else {
            this.f77797 = m54058(c8320.f22260, c8320, this.f77574, z);
        }
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3789(C5916 c5916) {
        c5916.f14604 = m54183(c5916.f14604);
        c5916.f14606 = m54069(c5916.f18925, c5916.f14606);
        this.f77797 = c5916;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        this.f77797 = c19049;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        boolean z = false;
        if (c12622.f35422.m10293()) {
            m54063((InterfaceC5323) c12622);
            AbstractC15689 abstractC15689 = this.f77573;
            this.f77573 = abstractC15689.mo28413(abstractC15689.f26587);
            C4968 c4968M54012 = m54012(c12622.f35422, c12622.f35421, 0);
            if (c12622.f35425.isEmpty() && c12622.f35424 == null) {
                this.f77797 = mo25569(c4968M54012);
            } else {
                C18537 c18537 = this.f77556;
                C4848 c4848 = c12622.f35425;
                C4968 c4968 = c12622.f35424;
                c18537.getClass();
                this.f77797 = mo25569(c18537.m42168(C4848.m10283(), c4968M54012, c4848, c4968));
            }
            this.f77573 = this.f77573.mo28410();
            this.f77797 = this.f77797;
            return;
        }
        boolean zM10293 = c12622.f35421.f11316.m10293();
        boolean zM10294 = c12622.f35425.m10293();
        C4968 c4969 = c12622.f35424;
        if (c4969 != null && c4969.f11316.m10293()) {
            z = true;
        }
        if (!zM10294 && !z) {
            this.f77797 = mo25569(c12622.f35421);
            return;
        }
        if (zM10293) {
            super.mo3809(c12622);
        } else if (z) {
            this.f77797 = mo25569(c12622.f35424);
        } else {
            this.f77797 = mo25569(c12622.f35421);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final C4848 m54046(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        LinkedHashMap linkedHashMap = this.f77571;
        try {
            this.f77550 = c4036;
            this.f77556 = c18537;
            this.f77575 = c4036.f8851.f7514;
            this.f77570 = null;
            this.f77535 = null;
            this.f77558 = abstractC7257.m16617(EnumC19998.f60806) ? (C7650) abstractC7257 : null;
            this.f77546 = null;
            this.f77545 = new C20271();
            this.f77540 = new HashMap();
            this.f77577 = new HashMap();
            this.f77541 = new HashMap();
            this.f77554 = new HashMap();
            this.f77573 = AbstractC15689.m35727(this.f77566.f69157);
            this.f77576 = C4848.m10283();
            this.f77567 = new HashMap();
            this.f77565 = new HashMap();
            this.f77563 = new HashMap();
            this.f77553 = C4848.m10283();
            this.f77559 = new C20271();
            AbstractC14355 abstractC14355 = this.f77574;
            this.f77574 = null;
            mo25569(abstractC7257);
            this.f77574 = abstractC14355;
            for (C4848 c4848M45783 = this.f77559.m45783(); c4848M45783.m10293(); c4848M45783 = c4848M45783.f11035) {
                m54068((AbstractC7783) c4848M45783.f11034);
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C12438) it.next()).m28644();
            }
            Iterator it2 = this.f77545.m45783().iterator();
            while (it2.hasNext()) {
                ((AbstractC7257) it2.next()).mo3382(this.f77569);
            }
            m54040();
            C20271 c20271 = this.f77545;
            Object[] objArr = objArr == true ? 1 : 0;
            Object[] objArr2 = objArr == true ? 1 : 0;
            Object[] objArr3 = objArr == true ? 1 : 0;
            Object[] objArr4 = objArr == true ? 1 : 0;
            Object[] objArr5 = objArr == true ? 1 : 0;
            Object[] objArr6 = objArr == true ? 1 : 0;
            Object[] objArr7 = objArr == true ? 1 : 0;
            Object[] objArr8 = objArr == true ? 1 : 0;
            Object[] objArr9 = objArr == true ? 1 : 0;
            Object[] objArr10 = objArr == true ? 1 : 0;
            Object[] objArr11 = objArr == true ? 1 : 0;
            Object[] objArr12 = objArr == true ? 1 : 0;
            Object[] objArr13 = objArr == true ? 1 : 0;
            Object[] objArr14 = objArr == true ? 1 : 0;
            Object[] objArr15 = objArr == true ? 1 : 0;
            Object[] objArr16 = objArr == true ? 1 : 0;
            Object[] objArr17 = objArr == true ? 1 : 0;
            Object[] objArr18 = objArr == true ? 1 : 0;
            return c20271.m45783();
        } finally {
            this.f77550 = null;
            this.f77556 = null;
            this.f77575 = null;
            this.f77570 = null;
            this.f77535 = null;
            this.f77558 = null;
            this.f77546 = null;
            this.f77545 = null;
            this.f77540 = null;
            this.f77577 = null;
            this.f77541 = null;
            this.f77554 = null;
            this.f77576 = null;
            this.f77567 = null;
            this.f77565 = null;
            this.f77563 = null;
            this.f77553 = null;
            this.f77559 = null;
            linkedHashMap.clear();
            this.f77544 = null;
        }
    }
}
