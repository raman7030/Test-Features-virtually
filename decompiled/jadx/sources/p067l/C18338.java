package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7KZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18338 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f54771;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7257 f54772;

    /* JADX INFO: renamed from: ܽ */
    public boolean f54773;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41774(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258) {
        AbstractC6462 abstractC6462;
        if (abstractC7257 == null || abstractC7258 == null) {
            return abstractC7257 == null && abstractC7258 == null;
        }
        AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC7257);
        AbstractC7257 abstractC7257M21438 = C9268.m21437(abstractC7258);
        AbstractC6462 abstractC6463 = abstractC7257M21437.f18925;
        if (abstractC6463 != null && abstractC6463.mo14779() != null && (abstractC6462 = abstractC7257M21438.f18925) != null && abstractC6462.mo14779() != null) {
            return C12826.equals(abstractC7257M21437.f18925.mo14779(), abstractC7257M21438.f18925.mo14779());
        }
        if (abstractC7257M21437.mo3383() != abstractC7257M21438.mo3383()) {
            return false;
        }
        AbstractC7257 abstractC7259 = this.f54772;
        boolean z = this.f54773;
        try {
            this.f54772 = abstractC7257M21438;
            abstractC7257M21437.mo3382(this);
            return this.f54773;
        } finally {
            this.f54772 = abstractC7259;
            this.f54773 = z;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m41773(Iterable iterable, Iterable iterable2) {
        if (iterable == null || iterable2 == null) {
            return iterable == null && iterable2 == null;
        }
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!m41774((AbstractC7257) it.next(), (AbstractC7257) it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        C9661 c9662 = (C9661) this.f54772;
        AbstractC7783 abstractC7783 = c9661.f26611;
        AbstractC7783 abstractC7784 = c9662.f26611;
        if (abstractC7783 != null && abstractC7784 != null && C12826.equals(this.f54771.get(abstractC7783), abstractC7784)) {
            this.f54773 = true;
        } else {
            this.f54773 = c9661.f26611 == c9662.f26611;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        C8320 c8321 = (C8320) this.f54772;
        this.f54773 = m41774(c8320.f22261, c8321.f22261) && c8320.f22260 == c8321.f22260;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        C19720 c19721 = (C19720) this.f54772;
        this.f54773 = m41773(c19720.f59995, c19721.f59995) && m41774(c19720.f59996, c19721.f59996);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        C19049 c190410 = (C19049) this.f54772;
        this.f54773 = m41774(c19049.f56840, c190410.f56840) && m41773(c19049.f56843, c190410.f56843);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        C17175 c17176 = (C17175) this.f54772;
        this.f54773 = m41773(c17175.f51142, c17176.f51142) && m41774(c17175.f51143, c17176.f51143) && m41773(c17175.f51144, c17176.f51144) && c17175.f16661 == c17176.f16661;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3796(C8991 c8991) {
        C8991 c8992 = (C8991) this.f54772;
        this.f54773 = m41774(c8991.f24356, c8992.f24356) && m41774(c8991.f24357, c8992.f24357);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        C22403 c22404 = (C22403) this.f54772;
        this.f54773 = m41774(c22403.f70670, c22404.f70670) && m41774(c22403.f70671, c22404.f70671);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        C11674 c11675 = (C11674) this.f54772;
        this.f54773 = m41774(c11674.f32571, c11675.f32571) && m41774(c11674.f32570, c11675.f32570) && c11674.f5602 == c11675.f5602;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        C11003 c11004 = (C11003) this.f54772;
        this.f54773 = m41774(c11003.f30470, c11004.f30470) && m41774(c11003.f30469, c11004.f30469) && c11003.f5602 == c11004.f5602;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        this.f54773 = m41774(c17707.f52887, ((C17707) this.f54772).f52887);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        C4968 c4969 = (C4968) this.f54772;
        this.f54773 = c4968.f11317 == c4969.f11317 && m41773(c4968.f11316, c4969.f11316);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        this.f54773 = c6309.f16359 == ((C6309) this.f54772).f16359;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        this.f54773 = m41774(c4575.f10248, ((C4575) this.f54772).f10248);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3831(C20391 c20391) {
        C20391 c20392 = (C20391) this.f54772;
        this.f54773 = m41773(c20391.f63044, c20392.f63044) && m41773(c20391.f63043, c20392.f63043);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3838(C23073 c23073) {
        this.f54773 = true;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3779(C2955 c2955) {
        C2955 c2956 = (C2955) this.f54772;
        this.f54773 = m41774(c2955.f5147, c2956.f5147) && m41774(c2955.f5146, c2956.f5146);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        C7650 c7651 = (C7650) this.f54772;
        this.f54773 = m41774(c7650.f20022, c7651.f20022) && c7650.f20021 == c7651.f20021 && m41773(c7650.f20026, c7651.f20026) && m41774(c7650.f20025, c7651.f20025) && m41773(c7650.f20024, c7651.f20024) && m41773(c7650.f20020, c7651.f20020);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        C10332 c10333 = (C10332) this.f54772;
        this.f54773 = m41774(c10332.f28614, c10333.f28614) && m41774(c10332.f28612, c10333.f28612) && m41774(c10332.f28613, c10333.f28613);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        this.f54773 = c17036.f50376 == ((C17036) this.f54772).f50376;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        C21732 c21733 = (C21732) this.f54772;
        this.f54773 = m41774(c21732.f68446, c21733.f68446) && m41774(c21732.f68447, c21733.f68447);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3787(C5638 c5638) {
        this.f54773 = m41773(c5638.f13677, ((C5638) this.f54772).f13677);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3807(C12344 c12344) {
        this.f54773 = m41774(c12344.f34446, ((C12344) this.f54772).f34446);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3813(C15025 c15025) {
        C15025 c15026 = (C15025) this.f54772;
        this.f54773 = m41774(c15025.f42932, c15026.f42932) && m41773(c15025.f42933, c15026.f42933);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        C13685 c13686 = (C13685) this.f54772;
        this.f54773 = m41773(c13685.f38597, c13686.f38597) && m41774(c13685.f38598, c13686.f38598) && m41773(c13685.f38596, c13686.f38596) && m41774(c13685.f38595, c13686.f38595);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        C6979 c69710 = (C6979) this.f54772;
        this.f54773 = m41774(c6979.f18157, c69710.f18157) && m41774(c6979.f18158, c69710.f18158) && m41774(c6979.f18156, c69710.f18156);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        C3765 c3766 = (C3765) this.f54772;
        this.f54773 = m41774(c3765.f7998, c3766.f7998) && m41774(c3765.f7999, c3766.f7999) && m41774(c3765.f8000, c3766.f8000);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3808(C12483 c12483) {
        C12483 c12484 = (C12483) this.f54772;
        this.f54773 = c12483.f34991 == c12484.f34991 && m41774(c12483.f34992, c12484.f34992);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3817(C16366 c16366) {
        C16366 c16367 = (C16366) this.f54772;
        this.f54773 = m41774(c16366.f48093, c16367.f48093) && m41774(c16366.f48092, c16367.f48092);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        C19188 c19189 = (C19188) this.f54772;
        this.f54773 = c19188.f57352 == c19189.f57352 && m41774(c19188.f57351, c19189.f57351);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        C15834 c15835 = (C15834) this.f54772;
        this.f54773 = m41773(c15834.f45863, c15835.f45863) && m41774(c15834.f45864, c15835.f45864) && c15834.f45861 == c15835.f45861;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3789(C5916 c5916) {
        C5916 c5917 = (C5916) this.f54772;
        this.f54773 = m41773(c5916.f14604, c5917.f14604) && m41774(c5916.f14606, c5917.f14606);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3840(C24552 c24552) {
        C24552 c24553 = (C24552) this.f54772;
        this.f54773 = c24552.f77743 == c24553.f77743 && C12826.equals(c24552.f77744, c24553.f77744);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        C10471 c10472 = (C10471) this.f54772;
        this.f54773 = m41774(c10471.f28961, c10472.f28961) && c10471.f28959 == c10472.f28959 && m41774(c10471.f28966, c10472.f28966) && m41773(c10471.f28962, c10472.f28962) && m41774(c10471.f28967, c10472.f28967) && m41773(c10471.f28963, c10472.f28963) && m41773(c10471.f28957, c10472.f28957) && m41774(c10471.f28958, c10472.f28958) && m41774(c10471.f28964, c10472.f28964);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3783(C4436 c4436) {
        C4436 c4437 = (C4436) this.f54772;
        this.f54773 = c4436.f9954 == c4437.f9954 && m41773(c4436.f9953, c4437.f9953);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
        C5777 c5778 = (C5777) this.f54772;
        this.f54773 = m41774(c5777.f14184, c5778.f14184) && m41774(c5777.f14183, c5778.f14183) && m41773(c5777.f14181, c5778.f14181);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        boolean z;
        C19859 c198510 = (C19859) this.f54772;
        if (m41774(c19859.f60358, c198510.f60358) && m41773(c19859.f60360, c198510.f60360) && m41773(c19859.f60357, c198510.f60357)) {
            C4848 c4848 = c19859.f60361;
            C4848 c4849 = c198510.f60361;
            if (c4848 != null && c4849 != null) {
                Iterator it = c4848.iterator();
                Iterator it2 = c4849.iterator();
                while (true) {
                    if (it.hasNext() && it2.hasNext()) {
                        if (!m41773((Iterable) it.next(), (Iterable) it2.next())) {
                        }
                    } else if (!it.hasNext() && !it2.hasNext()) {
                        if (m41773(c19859.f60359, c198510.f60359)) {
                        }
                    }
                }
            } else if (c4848 == null && c4849 == null) {
                z = m41773(c19859.f60359, c198510.f60359);
            }
        }
        this.f54773 = z;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        C20530 c20531 = (C20530) this.f54772;
        this.f54773 = m41774(c20530.f63432, c20531.f63432) && m41773(c20530.f63431, c20531.f63431) && m41774(c20530.f63429, c20531.f63429) && m41773(c20530.f63430, c20531.f63430) && m41774(c20530.f63428, c20531.f63428) && c20530.f63427 == c20531.f63427;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3778(C2423 c2423) {
        C2423 c2424 = (C2423) this.f54772;
        this.f54773 = m41774(c2423.f3722, c2424.f3722) && m41773(c2423.f3723, c2424.f3723);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3799(C9800 c9800) {
        C9800 c9801 = (C9800) this.f54772;
        this.f54773 = m41773(c9800.f27114, c9801.f27114) && m41774(c9800.f27115, c9801.f27115) && c9800.f27116 == c9801.f27116;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3812(C14494 c14494) {
        C14494 c14495 = (C14494) this.f54772;
        this.f54773 = m41774(c14494.f41389, c14495.f41389) && m41773(c14494.f41388, c14495.f41388);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        C11142 c11143 = (C11142) this.f54772;
        this.f54773 = c11142.f30886 == c11143.f30886 && c11142.f30888 == c11143.f30888 && c11142.f30890 == c11143.f30890 && m41774(c11142.f30891, c11143.f30891) && m41773(c11142.f30893, c11143.f30893);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3811(C13824 c13824) {
        C13824 c13825 = (C13824) this.f54772;
        this.f54773 = c13824.f39064 == c13825.f39064 && c13824.f39065 == c13825.f39065 && m41774(c13824.f39063, c13825.f39063);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        this.f54773 = m41774(c11813.f32975, ((C11813) this.f54772).f32975);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        C23882 c23883 = (C23882) this.f54772;
        this.f54773 = m41774(c23882.f75829, c23883.f75829) && m41773(c23882.f75828, c23883.f75828);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        C15164 c15165 = (C15164) this.f54772;
        this.f54773 = m41774(c15164.f43267, c15165.f43267) && m41773(c15164.f43269, c15165.f43269);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3797(C9130 c9130) {
        C9130 c9131 = (C9130) this.f54772;
        this.f54773 = m41774(c9130.f24711, c9131.f24711) && m41774(c9130.f24710, c9131.f24710);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        this.f54773 = m41774(c3904.f8460, ((C3904) this.f54772).f8460);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3780(C3626 c3626) {
        C3626 c3627 = (C3626) this.f54772;
        this.f54773 = m41773(c3626.f7509, c3627.f7509) && c3626.f7510 == c3627.f7510 && c3626.f7517 == c3627.f7517;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        C12622 c12623 = (C12622) this.f54772;
        this.f54773 = m41774(c12622.f35421, c12623.f35421) && m41773(c12622.f35425, c12623.f35425) && m41774(c12622.f35424, c12623.f35424) && m41773(c12622.f35422, c12623.f35422);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        C17985 c17986 = (C17985) this.f54772;
        this.f54773 = m41774(c17985.f53722, c17986.f53722) && m41773(c17985.f53721, c17986.f53721);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3842(C25084 c25084) {
        this.f54773 = m41774(c25084.f80025, ((C25084) this.f54772).f80025);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3833(C20669 c20669) {
        this.f54773 = c20669.f63851 == ((C20669) this.f54772).f63851;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3828(C19327 c19327) {
        C19327 c19328 = (C19327) this.f54772;
        this.f54773 = m41774(c19327.f57709, c19328.f57709) && m41774(c19327.f57710, c19328.f57710);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3786(C5107 c5107) {
        this.f54773 = c5107.f11988 == ((C5107) this.f54772).f11988;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3825(C18656 c18656) {
        this.f54773 = m41773(c18656.f55708, ((C18656) this.f54772).f55708);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        C15973 c15974 = (C15973) this.f54772;
        this.f54773 = c15973.f46261 == c15974.f46261 && m41773(c15973.f46262, c15974.f46262) && m41773(c15973.f46260, c15974.f46260);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3823(C17846 c17846) {
        C17846 c17847 = (C17846) this.f54772;
        this.f54773 = m41774(c17846.f53242, c17847.f53242) && m41774(c17846.f53243, c17847.f53243);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3841(C24691 c24691) {
        this.f54773 = m41773(c24691.f78164, ((C24691) this.f54772).f78164);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        C8598 c8599 = (C8598) this.f54772;
        this.f54773 = m41774(c8598.f23105, c8599.f23105) && c8598.f5602 == c8599.f5602;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3835(C22010 c22010) {
        this.f54773 = m41774(c22010.f69239, ((C22010) this.f54772).f69239);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C11281 c11282 = (C11281) this.f54772;
        boolean z = m41774(c11281.f31435, c11282.f31435) && c11281.f31433 == c11282.f31433 && m41774(c11281.f31432, c11282.f31432) && m41774(c11281.f31437, c11282.f31437) && m41774(c11281.f31436, c11282.f31436);
        this.f54773 = z;
        if (z) {
            this.f54771.put(c11281.f31438, c11282.f31438);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        C10610 c10611 = (C10610) this.f54772;
        this.f54773 = m41774(c10610.f29370, c10611.f29370) && m41774(c10610.f29369, c10611.f29369);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3821(C17314 c17314) {
        C17314 c17315 = (C17314) this.f54772;
        this.f54773 = m41774(c17314.f51642, c17315.f51642) && m41774(c17314.f51641, c17315.f51641);
    }

    public C18338(C4848 c4848, C4848 c4849) {
        this.f54771 = new HashMap();
        HashMap map = new HashMap();
        Iterator it = c4849.iterator();
        Iterator it2 = c4848.iterator();
        while (it2.hasNext()) {
            AbstractC7783 abstractC7783 = (AbstractC7783) it2.next();
            if (!it.hasNext()) {
                break;
            } else {
                map.put(abstractC7783, (AbstractC7783) it.next());
            }
        }
        this.f54771 = map;
    }
}
