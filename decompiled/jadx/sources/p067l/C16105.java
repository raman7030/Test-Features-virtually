package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public class C16105 extends AbstractC20130 {

    /* JADX INFO: renamed from: ۧ */
    public EnumC5377 f47390;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12083 f47391;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
    }

    @Override // p067l.AbstractC20130
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17118() {
        this.f47390 = EnumC5377.f12769;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36646(AbstractC7257 abstractC7257) {
        m36645(abstractC7257);
        if (abstractC7257 != null && abstractC7257.m16617(EnumC19998.f60774) && this.f47390 == EnumC5377.f12769) {
            this.f47391.f33667.m9352(abstractC7257, C8300.f22037);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36645(AbstractC7257 abstractC7257) {
        if (this.f47390 == EnumC5377.f12769 && abstractC7257 != null) {
            this.f47391.f33667.m9352(abstractC7257, C8300.f22150);
            if (!abstractC7257.m16617(EnumC19998.f60764)) {
                this.f47390 = EnumC5377.f12768;
            }
        }
        mo12739(abstractC7257);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36644(C4848 c4848) {
        if (c4848 != null) {
            while (c4848.m10293()) {
                m36645((AbstractC7257) c4848.f11034);
                c4848 = c4848.f11035;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3617(C7650 c7650) {
        if (c7650.f20027 == null) {
            return;
        }
        EnumC5377 enumC5377 = this.f47390;
        C20271 c20271 = this.f62320;
        C12083 c12083 = this.f47391;
        C6953 c6953 = c12083.f33669;
        this.f62320 = new C20271();
        c12083.f33669 = c12083.f33669.m15933(c7650.f20027);
        try {
            for (C4848 c4848 = c7650.f20020; c4848.m10293(); c4848 = c4848.f11035) {
                if (!((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60735) && (8 & C9268.m21439((AbstractC7257) c4848.f11034)) != 0) {
                    m36646((AbstractC7257) c4848.f11034);
                    m36639(false);
                }
            }
            for (C4848 c4849 = c7650.f20020; c4849.m10293(); c4849 = c4849.f11035) {
                if (!((AbstractC7257) c4849.f11034).m16617(EnumC19998.f60735) && (C9268.m21439((AbstractC7257) c4849.f11034) & 8) == 0) {
                    m36646((AbstractC7257) c4849.f11034);
                    m36639(false);
                }
            }
            for (C4848 c48410 = c7650.f20020; c48410.m10293(); c48410 = c48410.f11035) {
                if (((AbstractC7257) c48410.f11034).m16617(EnumC19998.f60735)) {
                    mo12739((AbstractC7257) c48410.f11034);
                }
            }
        } finally {
            this.f62320 = c20271;
            this.f47390 = enumC5377;
            c12083.f33669 = c6953;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        if (c10471.f28958 == null) {
            return;
        }
        C12083 c12083 = this.f47391;
        C6953 c6953 = c12083.f33669;
        c12083.f33669 = c12083.f33669.m15933(c10471.f28960);
        C1446.m31704(this.f62320.isEmpty());
        try {
            EnumC5377 enumC5377 = EnumC5377.f12771;
            this.f47390 = enumC5377;
            m36645(c10471.f28958);
            EnumC5377 enumC5378 = this.f47390;
            c10471.f28965 = enumC5378 != EnumC5377.f12769;
            if (enumC5378 == enumC5377 && !c10471.f28960.f20406.mo14787().m14777(EnumC11353.VOID)) {
                c12083.f33667.m9352(C9268.m21430(c10471.f28958), C8300.f22071);
            }
            m36639(true);
        } finally {
            c12083.f33669 = c6953;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ֫ */
    private void m36639(boolean z) {
        boolean z2;
        C4848 c4848M45783 = this.f62320.m45783();
        this.f62320 = new C20271();
        while (c4848M45783.m10293()) {
            C6048 c6048 = (C6048) c4848M45783.f11034;
            c4848M45783 = c4848M45783.f11035;
            if (z && c6048.f15194.m16617(EnumC19998.f60754)) {
                z2 = true;
            } else {
                C23623 c23623 = this.f47391.f33667;
                AbstractC7257 abstractC7257 = c6048.f15194;
                abstractC7257.getClass();
                if (c23623.m52456(abstractC7257)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C1446.m31704(z2);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        if (c11281.f31436 != null) {
            C12083 c12083 = this.f47391;
            C6953 c6953 = c12083.f33669;
            c12083.f33669 = c12083.f33669.m15933(c11281.f31438);
            try {
                mo12739(c11281.f31436);
            } finally {
                c12083.f33669 = c6953;
            }
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        m36644(c4968.f11316);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3834(C21732 c21732) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        m36645(c21732.f68446);
        this.f47390 = this.f47390.mo11761(m45573(c21732));
        mo12739(c21732.f68447);
        EnumC5377 enumC5377M11760 = this.f47390.m11760(!c21732.f68447.f18925.mo14799());
        this.f47390 = enumC5377M11760;
        this.f47390 = enumC5377M11760.mo11761(m45569(c21732, c20271));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3802(C10610 c10610) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(c10610.f29370);
        this.f47390 = EnumC5377.m11758(!c10610.f29370.f18925.mo14806());
        m36645(c10610.f29369);
        this.f47390 = this.f47390.mo11761(m45573(c10610));
        this.f47390 = m45569(c10610, c20271).m11762(!c10610.f29370.f18925.mo14799());
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3810(C13685 c13685) {
        C20271 c20271 = this.f62320;
        m36644(c13685.f38597);
        this.f62320 = new C20271();
        AbstractC14355 abstractC14355 = c13685.f38598;
        if (abstractC14355 != null) {
            mo12739(abstractC14355);
            this.f47390 = EnumC5377.m11758(!c13685.f38598.f18925.mo14806());
        } else {
            this.f47390 = EnumC5377.f12771;
        }
        m36645(c13685.f38595);
        this.f47390 = this.f47390.mo11761(m45573(c13685));
        m35992(c13685.f38596);
        EnumC5377 enumC5377M45569 = m45569(c13685, c20271);
        AbstractC14355 abstractC14356 = c13685.f38598;
        this.f47390 = enumC5377M45569.m11762((abstractC14356 == null || abstractC14356.f18925.mo14799()) ? false : true);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3791(C6979 c6979) {
        mo3805(c6979.f18157);
        C20271 c20271 = this.f62320;
        mo12739(c6979.f18158);
        this.f62320 = new C20271();
        m36645(c6979.f18156);
        this.f47390 = this.f47390.mo11761(m45573(c6979));
        m45569(c6979, c20271);
        this.f47390 = EnumC5377.f12771;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3827(C19188 c19188) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        m36645(c19188.f57351);
        this.f47390 = this.f47390.mo11761(m45569(c19188, c20271));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        C12083 c12083;
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(c23882.f75829);
        boolean z = c23882.f75830 || C7480.stream(c23882.f75828).flatMap(new C18117(0)).anyMatch(new C2430(7));
        HashSet hashSet = z ? new HashSet() : null;
        C4848 c4848 = c23882.f75828;
        while (true) {
            boolean zM10293 = c4848.m10293();
            c12083 = this.f47391;
            if (!zM10293) {
                break;
            }
            this.f47390 = EnumC5377.f12771;
            C20391 c20391 = (C20391) c4848.f11034;
            for (AbstractC21062 abstractC21062 : c20391.f63044) {
                mo12739(abstractC21062);
                m36638(hashSet, abstractC21062);
            }
            m36644(c20391.f63043);
            EnumC5377 enumC5377 = this.f47390;
            EnumC5377 enumC5378 = EnumC5377.f12769;
            if (enumC5377 != enumC5378 && c20391.f63046 == C20391.f63040) {
                m45571(c23882, c12083.f33672);
                this.f47390 = enumC5378;
            }
            if (this.f47390 == EnumC5377.f12771) {
                C6953 c6953 = c12083.f33669;
                EnumC21706 enumC21706 = EnumC21706.FALLTHROUGH;
                if (c6953.m15935(enumC21706) && c20391.f63043.m10293() && c4848.f11035.m10293()) {
                    C23623 c23623 = c12083.f33667;
                    C20391 c20392 = (C20391) c4848.f11035.f11034;
                    c20392.getClass();
                    c23623.m9365(enumC21706, c20392, C15675.f45419);
                }
            }
            c4848 = c4848.f11035;
        }
        if (!c23882.f75831 && z && !C9268.m21414(c23882.f75829, c23882.f75828) && (hashSet == null || !m36640(c23882.f75829.f18925, hashSet))) {
            c12083.f33667.m9352(c23882, C8300.f22103);
        }
        if (!c23882.f75831) {
            this.f47390 = EnumC5377.f12771;
        }
        this.f47390 = this.f47390.mo11761(m45569(c23882, c20271));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        C12083 c12083;
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        mo12739(c15164.f43267);
        HashSet hashSet = new HashSet();
        EnumC5377 enumC5377 = this.f47390;
        C4848 c4848 = c15164.f43269;
        while (true) {
            boolean zM10293 = c4848.m10293();
            c12083 = this.f47391;
            if (!zM10293) {
                break;
            }
            this.f47390 = EnumC5377.f12771;
            C20391 c20391 = (C20391) c4848.f11034;
            for (AbstractC21062 abstractC21062 : c20391.f63044) {
                mo12739(abstractC21062);
                m36638(hashSet, abstractC21062);
            }
            m36644(c20391.f63043);
            if (this.f47390 == EnumC5377.f12771) {
                if (c20391.f63046 == C20391.f63040) {
                    c12083.f33667.m9352(C9268.m21430(c20391.f63042), C8300.f22062);
                } else if (c4848.f11035.isEmpty()) {
                    c12083.f33667.m9352(C9268.m21430((AbstractC7257) c15164), C8300.f22104);
                }
            }
            c4848 = c4848.f11035;
        }
        if (!c15164.f43266 && !C9268.m21414(c15164.f43267, c15164.f43269) && !m36640(c15164.f43267.f18925, hashSet)) {
            c12083.f33667.m9352(c15164, C8300.f22049);
        }
        this.f47390 = enumC5377;
        this.f47390 = enumC5377.mo11761(m45572(c15164, c20271));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36638(HashSet hashSet, AbstractC21062 abstractC21062) {
        if (hashSet != null) {
            if (abstractC21062.mo32948()) {
                AbstractC14355 abstractC14355 = (AbstractC14355) abstractC21062;
                if (abstractC14355.m16617(EnumC19998.f60790)) {
                    C9661 c9661 = (C9661) abstractC14355;
                    if (c9661.f26611.m18009()) {
                        hashSet.add(c9661.f26611);
                        return;
                    }
                    return;
                }
                return;
            }
            if (abstractC21062.mo32949()) {
                C11951 c11951M21423 = C9268.m21423((AbstractC23212) abstractC21062);
                if (c11951M21423.m27360()) {
                    hashSet.add(c11951M21423.m27359().f16705);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m36640(AbstractC6462 abstractC6462, final HashSet hashSet) {
        C4848 c4848M10279 = C4848.m10279((Iterable) hashSet);
        while (c4848M10279.m10293()) {
            AbstractC7783 abstractC7783 = (AbstractC7783) c4848M10279.f11034;
            c4848M10279 = c4848M10279.f11035;
            int i = C12754.f35817[abstractC7783.f20405.ordinal()];
            if (i == 1) {
                AbstractC15689 abstractC15689Mo17983 = abstractC7783.f20407.mo17983();
                C18884 c18884 = new C18884(1);
                abstractC15689Mo17983.getClass();
                if (C16474.stream(C21230.spliterator(abstractC15689Mo17983.mo22455(c18884, EnumC3620.RECURSIVE)), false).allMatch(new Predicate() { // from class: l.ܿۤ֨
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
                    public /* synthetic */ Predicate m42817or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return hashSet.contains((AbstractC7783) obj);
                    }
                }) && hashSet.add(abstractC7783.f20407)) {
                    c4848M10279 = c4848M10279.m10290(abstractC7783.f20407);
                }
            } else if (i == 2) {
                for (AbstractC6462 abstractC6463 : this.f47391.f33664.m19505(abstractC7783.f20406)) {
                    AbstractC21195 abstractC21195 = abstractC6463.f16705;
                    if (abstractC21195.f20405 == EnumC3600.f7354 && (abstractC21195.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 && abstractC21195.m18019() && C7480.stream(((C15828) abstractC6463.f16705).f45853).allMatch(new Predicate() { // from class: l.ܿۤ֨
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
                        public /* synthetic */ Predicate m42817or(Predicate predicate) {
                            return C20697.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return hashSet.contains((AbstractC7783) obj);
                        }
                    }) && hashSet.add(abstractC6463.f16705)) {
                        c4848M10279 = c4848M10279.m10290(abstractC6463.f16705);
                    }
                }
            }
        }
        int i2 = C12754.f35818[abstractC6462.mo5577().ordinal()];
        if (i2 == 1) {
            if (!abstractC6462.mo7388()) {
                return hashSet.contains(abstractC6462.f16705);
            }
            if (abstractC6462 instanceof C7921) {
                C7921 c7921 = (C7921) abstractC6462;
                return C7480.stream(c7921.f67261.m10290(c7921.f67259)).anyMatch(new Predicate() { // from class: l.ᩳۤ֨
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
                    public /* synthetic */ Predicate m44272or(Predicate predicate) {
                        return C20697.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        HashSet hashSet2 = hashSet;
                        return this.f59285.m36640((AbstractC6462) obj, hashSet2);
                    }
                });
            }
        } else if (i2 == 2) {
            return m36640(((C10485) abstractC6462).mo14803(), hashSet);
        }
        return false;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        for (AbstractC7257 abstractC7257 : c12622.f35422) {
            if (abstractC7257 instanceof C11281) {
                mo3805((C11281) abstractC7257);
            } else if (abstractC7257 instanceof AbstractC14355) {
                mo12739((AbstractC14355) abstractC7257);
            } else {
                throw new AssertionError(c12622);
            }
        }
        m36645(c12622.f35421);
        EnumC5377 enumC5377Mo11761 = this.f47390;
        for (C4848 c4848 = c12622.f35425; c4848.m10293(); c4848 = c4848.f11035) {
            this.f47390 = EnumC5377.f12771;
            mo12739(((C2955) c4848.f11034).f5147);
            m36645(((C2955) c4848.f11034).f5146);
            enumC5377Mo11761 = enumC5377Mo11761.mo11761(this.f47390);
        }
        C4968 c4968 = c12622.f35424;
        if (c4968 != null) {
            C20271 c20272 = this.f62320;
            this.f62320 = c20271;
            this.f47390 = EnumC5377.f12771;
            m36645(c4968);
            EnumC5377 enumC5377 = this.f47390;
            EnumC5377 enumC5378 = EnumC5377.f12769;
            c12622.f35423 = enumC5377 != enumC5378;
            if (enumC5377 == enumC5378) {
                C12083 c12083 = this.f47391;
                C6953 c6953 = c12083.f33669;
                EnumC21706 enumC21706 = EnumC21706.FINALLY;
                if (c6953.m15935(enumC21706)) {
                    c12083.f33667.m9365(enumC21706, C9268.m21430(c12622.f35424), C15675.f45438);
                    return;
                }
                return;
            }
            while (c20272.m45784()) {
                this.f62320.m45777((C6048) c20272.m45782());
            }
            this.f47390 = enumC5377Mo11761;
            return;
        }
        this.f47390 = enumC5377Mo11761;
        C20271 c20273 = this.f62320;
        this.f62320 = c20271;
        while (c20273.m45784()) {
            this.f62320.m45777((C6048) c20273.m45782());
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        mo12739(c3765.f7998);
        m36645(c3765.f7999);
        AbstractC13154 abstractC13154 = c3765.f8000;
        if (abstractC13154 != null) {
            EnumC5377 enumC5377 = this.f47390;
            this.f47390 = EnumC5377.f12771;
            m36645(abstractC13154);
            this.f47390 = this.f47390.mo11761(enumC5377);
            return;
        }
        this.f47390 = EnumC5377.f12771;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3790(C6309 c6309) {
        m45570(new C6048(c6309));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        mo12739(c4575.f10248);
        m45570(new C6048(c4575));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        m45570(new C6048(c17036));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3618(C11813 c11813) {
        mo12739(c11813.f32975);
        m45570(new C6048(c11813));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        mo12739(c3904.f8460);
        this.f47390 = EnumC5377.f12769;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        mo12739(c17175.f51143);
        m35992(c17175.f51144);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        mo12739(c20530.f63432);
        m35992(c20530.f63430);
        C7650 c7650 = c20530.f63428;
        if (c7650 != null) {
            mo12739(c7650);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3619(C15834 c15834) {
        AbstractC6462 abstractC6462 = c15834.f18925;
        if (abstractC6462 == null || !abstractC6462.mo14812()) {
            C20271 c20271 = this.f62320;
            EnumC5377 enumC5377 = this.f47390;
            try {
                this.f62320 = new C20271();
                this.f47390 = EnumC5377.f12771;
                m36645(c15834.f45864);
                c15834.f45862 = this.f47390 != EnumC5377.f12769;
            } finally {
                this.f62320 = c20271;
                this.f47390 = enumC5377;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m36643(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        C12083 c12083 = this.f47391;
        try {
            c12083.f33666 = c4036;
            c12083.f33672 = c18537;
            this.f62320 = new C20271();
            this.f47390 = EnumC5377.f12771;
            mo12739(abstractC7257);
        } finally {
            this.f62320 = null;
            c12083.f33672 = null;
        }
    }

    public C16105(C12083 c12083) {
        this.f47391 = c12083;
    }
}
