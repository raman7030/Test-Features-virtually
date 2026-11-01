package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P413 */
/* JADX INFO: loaded from: classes.dex */
public class C24572 extends AbstractC2562 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7257 f77797;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7257 mo25569(AbstractC7257 abstractC7257) {
        if (abstractC7257 == null) {
            return null;
        }
        abstractC7257.mo3382(this);
        AbstractC7257 abstractC7258 = this.f77797;
        this.f77797 = null;
        return abstractC7258;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m54183(C4848 c4848) {
        if (c4848 == null) {
            return null;
        }
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c4849.f11034 = mo25569((AbstractC7257) c4849.f11034);
        }
        return c4848;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m54185(C4848 c4848) {
        while (c4848.m10293()) {
            c4848.f11034 = mo25569((C11281) c4848.f11034);
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54184(C4848 c4848) {
        while (c4848.m10293()) {
            c4848.f11034 = mo25569((C20391) c4848.f11034);
            c4848 = c4848.f11035;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3780(C3626 c3626) {
        c3626.f7509 = m54183(c3626.f7509);
        this.f77797 = c3626;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3799(C9800 c9800) {
        c9800.f27114 = m54183(c9800.f27114);
        c9800.f27115 = (AbstractC14355) mo25569(c9800.f27115);
        this.f77797 = c9800;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3808(C12483 c12483) {
        c12483.f34992 = mo25569(c12483.f34992);
        this.f77797 = c12483;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3617(C7650 c7650) {
        c7650.f20022 = (C4436) mo25569(c7650.f20022);
        C4848 c4848 = c7650.f20026;
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c4849.f11034 = mo25569((C15973) c4849.f11034);
        }
        c7650.f20026 = c4848;
        c7650.f20025 = (AbstractC14355) mo25569(c7650.f20025);
        c7650.f20024 = m54183(c7650.f20024);
        c7650.f20020 = m54183(c7650.f20020);
        this.f77797 = c7650;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3801(C10471 c10471) {
        c10471.f28961 = (C4436) mo25569(c10471.f28961);
        c10471.f28966 = (AbstractC14355) mo25569(c10471.f28966);
        C4848 c4848 = c10471.f28962;
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c4849.f11034 = mo25569((C15973) c4849.f11034);
        }
        c10471.f28962 = c4848;
        c10471.f28967 = (C11281) mo25569(c10471.f28967);
        C4848 c48410 = c10471.f28963;
        m54185(c48410);
        c10471.f28963 = c48410;
        c10471.f28957 = m54183(c10471.f28957);
        c10471.f28958 = (C4968) mo25569(c10471.f28958);
        this.f77797 = c10471;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3805(C11281 c11281) {
        c11281.f31435 = (C4436) mo25569(c11281.f31435);
        c11281.f31432 = (AbstractC14355) mo25569(c11281.f31432);
        c11281.f31437 = (AbstractC14355) mo25569(c11281.f31437);
        c11281.f31436 = (AbstractC14355) mo25569(c11281.f31436);
        this.f77797 = c11281;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3793(C7789 c7789) {
        this.f77797 = c7789;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3785(C4968 c4968) {
        c4968.f11316 = m54183(c4968.f11316);
        this.f77797 = c4968;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3834(C21732 c21732) {
        c21732.f68446 = (AbstractC13154) mo25569(c21732.f68446);
        c21732.f68447 = (AbstractC14355) mo25569(c21732.f68447);
        this.f77797 = c21732;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3802(C10610 c10610) {
        c10610.f29370 = (AbstractC14355) mo25569(c10610.f29370);
        c10610.f29369 = (AbstractC13154) mo25569(c10610.f29369);
        this.f77797 = c10610;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3810(C13685 c13685) {
        c13685.f38597 = m54183(c13685.f38597);
        c13685.f38598 = (AbstractC14355) mo25569(c13685.f38598);
        c13685.f38596 = m54183(c13685.f38596);
        c13685.f38595 = (AbstractC13154) mo25569(c13685.f38595);
        this.f77797 = c13685;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3791(C6979 c6979) {
        c6979.f18157 = (C11281) mo25569(c6979.f18157);
        c6979.f18158 = (AbstractC14355) mo25569(c6979.f18158);
        c6979.f18156 = (AbstractC13154) mo25569(c6979.f18156);
        this.f77797 = c6979;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        c19188.f57351 = (AbstractC13154) mo25569(c19188.f57351);
        this.f77797 = c19188;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3839(C23882 c23882) {
        c23882.f75829 = (AbstractC14355) mo25569(c23882.f75829);
        C4848 c4848 = c23882.f75828;
        m54184(c4848);
        c23882.f75828 = c4848;
        this.f77797 = c23882;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3831(C20391 c20391) {
        c20391.f63044 = m54183(c20391.f63044);
        c20391.f63043 = m54183(c20391.f63043);
        this.f77797 = c20391;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3814(C15164 c15164) {
        c15164.f43267 = (AbstractC14355) mo25569(c15164.f43267);
        C4848 c4848 = c15164.f43269;
        m54184(c4848);
        c15164.f43269 = c4848;
        this.f77797 = c15164;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3797(C9130 c9130) {
        c9130.f24711 = (AbstractC14355) mo25569(c9130.f24711);
        c9130.f24710 = (C4968) mo25569(c9130.f24710);
        this.f77797 = c9130;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3809(C12622 c12622) {
        c12622.f35422 = m54183(c12622.f35422);
        c12622.f35421 = (C4968) mo25569(c12622.f35421);
        C4848 c4848 = c12622.f35425;
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c4849.f11034 = mo25569((C2955) c4849.f11034);
        }
        c12622.f35425 = c4848;
        c12622.f35424 = (C4968) mo25569(c12622.f35424);
        this.f77797 = c12622;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3779(C2955 c2955) {
        c2955.f5147 = (C11281) mo25569(c2955.f5147);
        c2955.f5146 = (C4968) mo25569(c2955.f5146);
        this.f77797 = c2955;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3800(C10332 c10332) {
        c10332.f28614 = (AbstractC14355) mo25569(c10332.f28614);
        c10332.f28612 = (AbstractC14355) mo25569(c10332.f28612);
        c10332.f28613 = (AbstractC14355) mo25569(c10332.f28613);
        this.f77797 = c10332;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3781(C3765 c3765) {
        c3765.f7998 = (AbstractC14355) mo25569(c3765.f7998);
        c3765.f7999 = (AbstractC13154) mo25569(c3765.f7999);
        c3765.f8000 = (AbstractC13154) mo25569(c3765.f8000);
        this.f77797 = c3765;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3807(C12344 c12344) {
        c12344.f34446 = (AbstractC14355) mo25569(c12344.f34446);
        this.f77797 = c12344;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3790(C6309 c6309) {
        this.f77797 = c6309;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3784(C4575 c4575) {
        c4575.f10248 = (AbstractC14355) mo25569(c4575.f10248);
        this.f77797 = c4575;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        this.f77797 = c17036;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3618(C11813 c11813) {
        c11813.f32975 = (AbstractC14355) mo25569(c11813.f32975);
        this.f77797 = c11813;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3782(C3904 c3904) {
        c3904.f8460 = (AbstractC14355) mo25569(c3904.f8460);
        this.f77797 = c3904;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3796(C8991 c8991) {
        c8991.f24356 = (AbstractC14355) mo25569(c8991.f24356);
        c8991.f24357 = (AbstractC14355) mo25569(c8991.f24357);
        this.f77797 = c8991;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3820(C17175 c17175) {
        c17175.f51143 = (AbstractC14355) mo25569(c17175.f51143);
        c17175.f51144 = m54183(c17175.f51144);
        this.f77797 = c17175;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3832(C20530 c20530) {
        c20530.f63432 = (AbstractC14355) mo25569(c20530.f63432);
        c20530.f63429 = (AbstractC14355) mo25569(c20530.f63429);
        c20530.f63430 = m54183(c20530.f63430);
        c20530.f63428 = (C7650) mo25569(c20530.f63428);
        this.f77797 = c20530;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3619(C15834 c15834) {
        c15834.f45863 = m54183(c15834.f45863);
        c15834.f45864 = mo25569(c15834.f45864);
        this.f77797 = c15834;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3830(C19859 c19859) {
        c19859.f60357 = m54183(c19859.f60357);
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = c19859.f60361.iterator();
        while (it.hasNext()) {
            c4848M10283 = c4848M10283.m10286((Object) m54183((C4848) it.next()));
        }
        c19859.f60361 = c4848M10283;
        c19859.f60358 = (AbstractC14355) mo25569(c19859.f60358);
        c19859.f60360 = m54183(c19859.f60360);
        c19859.f60359 = m54183(c19859.f60359);
        this.f77797 = c19859;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3818(C16505 c16505) {
        c16505.f48507 = (AbstractC14355) mo25569(c16505.f48507);
        this.f77797 = c16505;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3836(C22403 c22403) {
        c22403.f70670 = (AbstractC14355) mo25569(c22403.f70670);
        c22403.f70671 = (AbstractC14355) mo25569(c22403.f70671);
        this.f77797 = c22403;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3806(C11674 c11674) {
        c11674.f32571 = (AbstractC14355) mo25569(c11674.f32571);
        c11674.f32570 = (AbstractC14355) mo25569(c11674.f32570);
        this.f77797 = c11674;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3795(C8598 c8598) {
        c8598.f23105 = (AbstractC14355) mo25569(c8598.f23105);
        this.f77797 = c8598;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3803(C11003 c11003) {
        c11003.f30470 = (AbstractC14355) mo25569(c11003.f30470);
        c11003.f30469 = (AbstractC14355) mo25569(c11003.f30469);
        this.f77797 = c11003;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3828(C19327 c19327) {
        c19327.f57709 = mo25569(c19327.f57709);
        c19327.f57710 = (AbstractC14355) mo25569(c19327.f57710);
        this.f77797 = c19327;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3823(C17846 c17846) {
        c17846.f53242 = (AbstractC14355) mo25569(c17846.f53242);
        c17846.f53243 = mo25569(c17846.f53243);
        this.f77797 = c17846;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3822(C17707 c17707) {
        c17707.f52887 = (C11281) mo25569(c17707.f52887);
        this.f77797 = c17707;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3838(C23073 c23073) {
        this.f77797 = c23073;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3837(C22542 c22542) {
        c22542.f71103 = (AbstractC23212) mo25569(c22542.f71103);
        this.f77797 = c22542;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3815(C15695 c15695) {
        c15695.f45487 = (AbstractC23212) mo25569(c15695.f45487);
        c15695.f45486 = (AbstractC14355) mo25569(c15695.f45486);
        this.f77797 = c15695;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3817(C16366 c16366) {
        c16366.f48093 = (AbstractC14355) mo25569(c16366.f48093);
        c16366.f48092 = (AbstractC14355) mo25569(c16366.f48092);
        this.f77797 = c16366;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3794(C8320 c8320) {
        c8320.f22261 = (AbstractC14355) mo25569(c8320.f22261);
        this.f77797 = c8320;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3804(C11142 c11142) {
        c11142.f30891 = (AbstractC14355) mo25569(c11142.f30891);
        this.f77797 = c11142;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3798(C9661 c9661) {
        this.f77797 = c9661;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3840(C24552 c24552) {
        this.f77797 = c24552;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3786(C5107 c5107) {
        this.f77797 = c5107;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3842(C25084 c25084) {
        c25084.f80025 = (AbstractC14355) mo25569(c25084.f80025);
        this.f77797 = c25084;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3824(C17985 c17985) {
        c17985.f53722 = (AbstractC14355) mo25569(c17985.f53722);
        c17985.f53721 = m54183(c17985.f53721);
        this.f77797 = c17985;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3841(C24691 c24691) {
        c24691.f78164 = m54183(c24691.f78164);
        this.f77797 = c24691;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3825(C18656 c18656) {
        c18656.f55708 = m54183(c18656.f55708);
        this.f77797 = c18656;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3816(C15973 c15973) {
        c15973.f46260 = m54183(c15973.f46260);
        c15973.f46262 = m54183(c15973.f46262);
        this.f77797 = c15973;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3821(C17314 c17314) {
        c17314.f51642 = (C20669) mo25569(c17314.f51642);
        c17314.f51641 = mo25569(c17314.f51641);
        this.f77797 = c17314;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3833(C20669 c20669) {
        this.f77797 = c20669;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3787(C5638 c5638) {
        this.f77797 = c5638;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3789(C5916 c5916) {
        c5916.f14604 = m54183(c5916.f14604);
        c5916.f14606 = (AbstractC14355) mo25569(c5916.f14606);
        this.f77797 = c5916;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3783(C4436 c4436) {
        C4848 c4848 = c4436.f9953;
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c4849.f11034 = mo25569((C19049) c4849.f11034);
        }
        c4436.f9953 = c4848;
        this.f77797 = c4436;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3826(C19049 c19049) {
        c19049.f56840 = mo25569(c19049.f56840);
        c19049.f56843 = m54183(c19049.f56843);
        this.f77797 = c19049;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3829(C19720 c19720) {
        c19720.f59995 = m54183(c19720.f59995);
        c19720.f59996 = (AbstractC14355) mo25569(c19720.f59996);
        this.f77797 = c19720;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
        throw new AssertionError(abstractC7257);
    }
}
