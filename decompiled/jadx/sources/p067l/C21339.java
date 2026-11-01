package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I3GH */
/* JADX INFO: loaded from: classes5.dex */
public class C21339 implements InterfaceC14249 {

    /* JADX INFO: renamed from: ֫ */
    public C18537 f67285;

    public C21339(C18537 c18537) {
        this.f67285 = c18537;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7257 mo10751(AbstractC7257 abstractC7257, Object obj) {
        if (abstractC7257 == null) {
            return null;
        }
        if (AbstractC7257.m16616()) {
            return (AbstractC7257) AbstractC7257.m16614(new C23350(this, abstractC7257, obj));
        }
        return (AbstractC7257) abstractC7257.mo3380(this, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m48354(Object obj, C4848 c4848) {
        if (c4848 == null || c4848.isEmpty()) {
            return c4848;
        }
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            c20271.m45777(mo10751((AbstractC7257) it.next(), obj));
        }
        return c20271.m45783();
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13761(C19720 c19720, Object obj) {
        C4848 c4848M48354 = m48354(obj, c19720.f59995);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c19720.f59996, obj);
        int i = c19720.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42180(abstractC14355, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13758(C19049 c19049, Object obj) {
        AbstractC7257 abstractC7257Mo10751 = mo10751(c19049.f56840, obj);
        C4848 c4848M48354 = m48354(obj, c19049.f56843);
        EnumC5532 enumC5532Mo3381 = c19049.mo3381();
        EnumC5532 enumC5532 = EnumC5532.TYPE_ANNOTATION;
        C18537 c18537 = this.f67285;
        if (enumC5532Mo3381 == enumC5532) {
            c18537.f55352 = c19049.f18924;
            C19049 c19049M42209 = c18537.m42209(abstractC7257Mo10751, c4848M48354);
            c19049M42209.f56842 = c19049.f56842;
            return c19049M42209;
        }
        c18537.f55352 = c19049.f18924;
        C19049 c19049M42175 = c18537.m42175(abstractC7257Mo10751, c4848M48354);
        c19049M42175.f56842 = c19049.f56842;
        return c19049M42175;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13730(C8991 c8991, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c8991.f24356, obj);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c8991.f24357, obj);
        int i = c8991.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C8991 c8992 = new C8991();
        c8992.f24356 = abstractC14355;
        c8992.f24357 = abstractC14356;
        c8992.f18924 = c18537.f55352;
        return c8992;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13766(C22403 c22403, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c22403.f70670, obj);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c22403.f70671, obj);
        int i = c22403.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42184(abstractC14355, abstractC14356);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13737(C11674 c11674, Object obj) {
        AbstractC7257 abstractC7257Mo10751 = mo10751(c11674.f32571, obj);
        AbstractC7257 abstractC7257Mo10752 = mo10751(c11674.f32570, obj);
        int i = c11674.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42167(c11674.f5601, abstractC7257Mo10751, abstractC7257Mo10752);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13735(C11003 c11003, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c11003.f30470, obj);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c11003.f30469, obj);
        int i = c11003.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42162(c11003.f5601, abstractC14355, abstractC14356);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13722(C4968 c4968, Object obj) {
        C4848 c4848M48354 = m48354(obj, c4968.f11316);
        int i = c4968.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42145(c4968.f11317, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13725(C6309 c6309, Object obj) {
        int i = c6309.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42149(c6309.f16359);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13721(C4575 c4575, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c4575.f10248, obj);
        int i = c4575.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42202(abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13763(C20391 c20391, Object obj) {
        AbstractC7257 abstractC7257;
        C4848 c4848M48354 = m48354(obj, c20391.f63044);
        C4848 c4848M48355 = m48354(obj, c20391.f63043);
        EnumC8690 enumC8690 = c20391.f63046;
        if (enumC8690 == EnumC8690.RULE) {
            abstractC7257 = ((c20391.f63042 instanceof AbstractC14355) && ((AbstractC13154) c20391.f63043.f11034).m16617(EnumC19998.f60717)) ? ((C4575) c20391.f63043.f11034).f10248 : (AbstractC7257) c20391.f63043.f11034;
        } else {
            abstractC7257 = null;
        }
        int i = c20391.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42181(enumC8690, c4848M48354, c4848M48355, abstractC7257);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13716(C2955 c2955, Object obj) {
        C11281 c11281 = (C11281) mo10751((AbstractC7257) c2955.f5147, obj);
        C4968 c4968 = (C4968) mo10751((AbstractC7257) c2955.f5146, obj);
        int i = c2955.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42140(c11281, c4968);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13727(C7650 c7650, Object obj) {
        C4436 c4436 = (C4436) mo10751((AbstractC7257) c7650.f20022, obj);
        C4848 c4848M48354 = m48354(obj, c7650.f20026);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c7650.f20025, obj);
        C4848 c4848M48355 = m48354(obj, c7650.f20024);
        C4848 c4848M48356 = m48354(obj, c7650.f20020);
        int i = c7650.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42151(c4436, c7650.f20021, c4848M48354, abstractC14355, c4848M48355, c4848M48356);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13732(C10332 c10332, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c10332.f28614, obj);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c10332.f28612, obj);
        AbstractC14355 abstractC14357 = (AbstractC14355) mo10751(c10332.f28613, obj);
        int i = c10332.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42159(abstractC14355, abstractC14356, abstractC14357);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13751(C17036 c17036, Object obj) {
        int i = c17036.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        AbstractC12224 abstractC12224 = c17036.f50376;
        C17036 c17037 = new C17036();
        c17037.f50376 = abstractC12224;
        c17037.f50377 = null;
        c17037.f18924 = c18537.f55352;
        return c17037;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13764(C21732 c21732, Object obj) {
        AbstractC13154 abstractC13154 = (AbstractC13154) mo10751(c21732.f68446, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c21732.f68447, obj);
        int i = c21732.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C21732 c21733 = new C21732();
        c21733.f68446 = abstractC13154;
        c21733.f68447 = abstractC14355;
        c21733.f18924 = c18537.f55352;
        return c21733;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo29357(C5638 c5638, Object obj) {
        C4848 c4848M48354 = m48354(obj, c5638.f13677);
        int i = c5638.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42192(c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13739(C12344 c12344, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c12344.f34446, obj);
        int i = c12344.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42196(abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13726(C6979 c6979, Object obj) {
        C11281 c11281 = (C11281) mo10751((AbstractC7257) c6979.f18157, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c6979.f18158, obj);
        AbstractC13154 abstractC13154 = (AbstractC13154) mo10751(c6979.f18156, obj);
        int i = c6979.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C6979 c69710 = new C6979();
        c69710.f18157 = c11281;
        c69710.f18158 = abstractC14355;
        c69710.f18156 = abstractC13154;
        c69710.f18924 = c18537.f55352;
        return c69710;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13742(C13685 c13685, Object obj) {
        C4848 c4848M48354 = m48354(obj, c13685.f38597);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c13685.f38598, obj);
        C4848 c4848M48355 = m48354(obj, c13685.f38596);
        AbstractC13154 abstractC13154 = (AbstractC13154) mo10751(c13685.f38595, obj);
        int i = c13685.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42169(c4848M48354, abstractC14355, c4848M48355, abstractC13154);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7535(C9661 c9661, Object obj) {
        int i = c9661.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42194(c9661.f26610);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13718(C3765 c3765, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c3765.f7998, obj);
        AbstractC13154 abstractC13154 = (AbstractC13154) mo10751(c3765.f7999, obj);
        AbstractC13154 abstractC13155 = (AbstractC13154) mo10751(c3765.f8000, obj);
        int i = c3765.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42141(abstractC14355, abstractC13154, abstractC13155);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13740(C12483 c12483, Object obj) {
        AbstractC7257 abstractC7257Mo10751 = mo10751(c12483.f34992, obj);
        int i = c12483.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        boolean z = c12483.f34991;
        C12483 c12484 = new C12483();
        c12484.f34992 = abstractC7257Mo10751;
        c12484.f34991 = z;
        c12484.f18924 = c18537.f55352;
        return c12484;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13749(C16366 c16366, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c16366.f48093, obj);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c16366.f48092, obj);
        int i = c16366.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42199(abstractC14355, abstractC14356);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13759(C19188 c19188, Object obj) {
        AbstractC13154 abstractC13154 = (AbstractC13154) mo10751(c19188.f57351, obj);
        int i = c19188.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        AbstractC12224 abstractC12224 = c19188.f57352;
        C19188 c19189 = new C19188();
        c19189.f57352 = abstractC12224;
        c19189.f57351 = abstractC13154;
        c19189.f18924 = c18537.f55352;
        return c19189;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13768(C24552 c24552, Object obj) {
        int i = c24552.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42187(c24552.f77743, c24552.f77744);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13733(C10471 c10471, Object obj) {
        C4436 c4436 = (C4436) mo10751((AbstractC7257) c10471.f28961, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c10471.f28966, obj);
        C4848 c4848M48354 = m48354(obj, c10471.f28962);
        C4848 c4848M48355 = m48354(obj, c10471.f28963);
        C11281 c11281 = (C11281) mo10751((AbstractC7257) c10471.f28967, obj);
        C4848 c4848M48356 = m48354(obj, c10471.f28957);
        C4968 c4968 = (C4968) mo10751((AbstractC7257) c10471.f28958, obj);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c10471.f28964, obj);
        int i = c10471.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42160(c4436, c10471.f28959, abstractC14355, c4848M48354, c11281, c4848M48355, c4848M48356, c4968, abstractC14356);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13752(C17175 c17175, Object obj) {
        C4848 c4848M48354 = m48354(obj, c17175.f51142);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c17175.f51143, obj);
        C4848 c4848M48355 = m48354(obj, c17175.f51144);
        int i = c17175.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42172(abstractC14355, c4848M48354, c4848M48355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13720(C4436 c4436, Object obj) {
        C4848 c4848M48354 = m48354(obj, c4436.f9953);
        int i = c4436.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42190(c4436.f9954, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13762(C19859 c19859, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c19859.f60358, obj);
        C4848 c4848M48354 = m48354(obj, c19859.f60360);
        C4848 c4848M48355 = m48354(obj, c19859.f60359);
        int i = c19859.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42201(abstractC14355, c4848M48354, c4848M48355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public C20530 mo9104(C20530 c20530, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c20530.f63432, obj);
        C4848 c4848M48354 = m48354(obj, c20530.f63431);
        AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c20530.f63429, obj);
        C4848 c4848M48355 = m48354(obj, c20530.f63430);
        C7650 c7650 = (C7650) mo10751((AbstractC7257) c20530.f63428, obj);
        int i = c20530.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42182(abstractC14355, c4848M48354, abstractC14356, c4848M48355, c7650, false);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public C15834 mo9103(C15834 c15834, Object obj) {
        C4848 c4848M48354 = m48354(obj, c15834.f45863);
        AbstractC7257 abstractC7257Mo10751 = mo10751(c15834.f45864, obj);
        int i = c15834.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42198(abstractC7257Mo10751, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13750(C16505 c16505, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c16505.f48507, obj);
        int i = c16505.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C16505 c16506 = new C16505();
        c16506.f48507 = abstractC14355;
        c16506.f18924 = c18537.f55352;
        return c16506;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13738(C11813 c11813, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c11813.f32975, obj);
        int i = c11813.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42207(abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7534(C8320 c8320, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c8320.f22261, obj);
        int i = c8320.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42155(abstractC14355, c8320.f22259);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7257 mo13736(C11142 c11142, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c11142.f30891, obj);
        C4848 c4848M48354 = m48354(obj, c11142.f30893);
        int i = c11142.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C11142 c11143 = new C11142(c11142.f30886, c11142.f30890, abstractC14355, c4848M48354);
        c11143.f18924 = c18537.f55352;
        return c11143;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13728(C7789 c7789, Object obj) {
        int i = c7789.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42206();
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13767(C23882 c23882, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c23882.f75829, obj);
        C4848 c4848M48354 = m48354(obj, c23882.f75828);
        int i = c23882.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42215(abstractC14355, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13747(C15164 c15164, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c15164.f43267, obj);
        C4848 c4848M48354 = m48354(obj, c15164.f43269);
        int i = c15164.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42211(abstractC14355, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13731(C9130 c9130, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c9130.f24711, obj);
        C4968 c4968 = (C4968) mo10751((AbstractC7257) c9130.f24710, obj);
        int i = c9130.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C9130 c9131 = new C9130();
        c9131.f24711 = abstractC14355;
        c9131.f24710 = c4968;
        c9131.f18924 = c18537.f55352;
        return c9131;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13719(C3904 c3904, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c3904.f8460, obj);
        int i = c3904.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42214(abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13717(C3626 c3626, Object obj) {
        C4848 c4848M48354 = m48354(obj, c3626.f7509);
        int i = c3626.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42213(c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo29358(C9800 c9800, Object obj) {
        C4848 c4848M48354 = m48354(obj, c9800.f27114);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c9800.f27115, obj);
        int i = c9800.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C1446.m31699(c4848M48354);
        C1446.m31699(abstractC14355);
        C9800 c9801 = new C9800();
        c9801.f27114 = c4848M48354;
        c9801.f27115 = abstractC14355;
        c9801.f18924 = c18537.f55352;
        return c9801;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13741(C12622 c12622, Object obj) {
        C4848 c4848M48354 = m48354(obj, c12622.f35422);
        C4968 c4968 = (C4968) mo10751((AbstractC7257) c12622.f35421, obj);
        C4848 c4848M48355 = m48354(obj, c12622.f35425);
        C4968 c4969 = (C4968) mo10751((AbstractC7257) c12622.f35424, obj);
        int i = c12622.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42168(c4848M48354, c4968, c4848M48355, c4969);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13756(C17985 c17985, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c17985.f53722, obj);
        C4848 c4848M48354 = m48354(obj, c17985.f53721);
        int i = c17985.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42203(abstractC14355, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13769(C24691 c24691, Object obj) {
        C4848 c4848M48354 = m48354(obj, c24691.f78164);
        int i = c24691.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C24691 c24692 = new C24691();
        c24692.f78164 = c4848M48354;
        c24692.f18924 = c18537.f55352;
        return c24692;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13757(C18656 c18656, Object obj) {
        C4848 c4848M48354 = m48354(obj, c18656.f55708);
        int i = c18656.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C18656 c18657 = new C18656();
        c18657.f55708 = c4848M48354;
        c18657.f18924 = c18537.f55352;
        return c18657;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13770(C25084 c25084, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c25084.f80025, obj);
        int i = c25084.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42212(abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13760(C19327 c19327, Object obj) {
        AbstractC7257 abstractC7257Mo10751 = mo10751(c19327.f57709, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c19327.f57710, obj);
        int i = c19327.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42179(abstractC7257Mo10751, abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13723(C5107 c5107, Object obj) {
        int i = c5107.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42146(c5107.f11988);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13748(C15973 c15973, Object obj) {
        C4848 c4848M48354 = m48354(obj, c15973.f46260);
        C4848 c4848M48355 = m48354(obj, c15973.f46262);
        int i = c15973.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        AbstractC12224 abstractC12224 = c15973.f46261;
        C15973 c15974 = new C15973();
        c15974.f46261 = abstractC12224;
        c15974.f46262 = c4848M48355;
        c15974.f46260 = c4848M48354;
        c15974.f18924 = c18537.f55352;
        return c15974;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13755(C17846 c17846, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c17846.f53242, obj);
        AbstractC7257 abstractC7257Mo10751 = mo10751(c17846.f53243, obj);
        int i = c17846.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C17846 c17847 = new C17846();
        c17847.f53242 = abstractC14355;
        c17847.f53243 = abstractC7257Mo10751;
        c17847.f18924 = c18537.f55352;
        return c17847;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13754(C17707 c17707, Object obj) {
        C11281 c11281 = (C11281) mo10751((AbstractC7257) c17707.f52887, obj);
        int i = c17707.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C17707 c17708 = new C17707();
        c17708.f52887 = c11281;
        c17708.f18924 = c18537.f55352;
        return c17708;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo29359(C15695 c15695, Object obj) {
        AbstractC23212 abstractC23212 = (AbstractC23212) mo10751(c15695.f45487, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c15695.f45486, obj);
        int i = c15695.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C15695 c15696 = new C15695();
        c15696.f45487 = abstractC23212;
        c15696.f45486 = abstractC14355;
        c15696.f18924 = c18537.f55352;
        return c15696;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo29360(C22542 c22542, Object obj) {
        AbstractC23212 abstractC23212 = (AbstractC23212) mo10751(c22542.f71103, obj);
        int i = c22542.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C22542 c22543 = new C22542();
        c22543.f71103 = abstractC23212;
        c22543.f18924 = c18537.f55352;
        return c22543;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo29361(C23073 c23073) {
        int i = c23073.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42185();
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13729(C8598 c8598, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c8598.f23105, obj);
        int i = c8598.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42156(c8598.f5601, abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public C11281 mo10750(C11281 c11281, Object obj) {
        C4436 c4436 = (C4436) mo10751((AbstractC7257) c11281.f31435, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c11281.f31437, obj);
        AbstractC14355 abstractC14356 = c11281.f31432;
        C18537 c18537 = this.f67285;
        if (abstractC14356 == null) {
            AbstractC14355 abstractC14357 = (AbstractC14355) mo10751(c11281.f31436, obj);
            c18537.f55352 = c11281.f18924;
            return c18537.m42163(c4436, c11281.f31433, abstractC14355, abstractC14357);
        }
        AbstractC14355 abstractC14358 = (AbstractC14355) mo10751(abstractC14356, obj);
        c18537.f55352 = c11281.f18924;
        return c18537.m42165(c4436, abstractC14358, abstractC14355);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13734(C10610 c10610, Object obj) {
        AbstractC13154 abstractC13154 = (AbstractC13154) mo10751(c10610.f29369, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c10610.f29370, obj);
        int i = c10610.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C10610 c10611 = new C10610();
        c10611.f29370 = abstractC14355;
        c10611.f29369 = abstractC13154;
        c10611.f18924 = c18537.f55352;
        return c10611;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13753(C17314 c17314, Object obj) {
        C20669 c20669 = c17314.f51642;
        int i = c20669.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C20669 c20669M42183 = c18537.m42183(c20669.f63851);
        AbstractC7257 abstractC7257Mo10751 = mo10751(c17314.f51641, obj);
        c18537.f55352 = c17314.f18924;
        return c18537.m42173(c20669M42183, abstractC7257Mo10751);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13724(C5777 c5777, Object obj) {
        C4436 c4436 = (C4436) mo10751((AbstractC7257) c5777.f14184, obj);
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c5777.f14183, (Object) null);
        C4848 c4848M48354 = m48354((Object) null, c5777.f14181);
        int i = c5777.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        return c18537.m42147(c4436, c5777.mo12958(), abstractC14355, c4848M48354);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13746(C15025 c15025, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c15025.f42932, obj);
        C4848 c4848M48354 = m48354(obj, c15025.f42933);
        int i = c15025.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C15025 c15026 = new C15025();
        c15026.f42932 = abstractC14355;
        c15026.f42933 = c4848M48354;
        c15026.f18924 = c18537.f55352;
        return c15026;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13715(C2423 c2423, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c2423.f3722, obj);
        C4848 c4848M48354 = m48354(obj, c2423.f3723);
        int i = c2423.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C2423 c2424 = new C2423();
        c2424.f3722 = abstractC14355;
        c2424.f3723 = c4848M48354;
        c2424.f18924 = c18537.f55352;
        return c2424;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13744(C14494 c14494, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c14494.f41389, obj);
        C4848 c4848M48354 = m48354(obj, c14494.f41388);
        int i = c14494.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C14494 c14495 = new C14494();
        c14495.f41389 = abstractC14355;
        c14495.f41388 = c4848M48354;
        c14495.f18924 = c18537.f55352;
        return c14495;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13743(C13824 c13824, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c13824.f39063, obj);
        int i = c13824.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        boolean z = c13824.f39064;
        boolean z2 = c13824.f39065;
        C13824 c13825 = new C13824();
        c13825.f39064 = z;
        c13825.f39065 = z2;
        c13825.f39063 = abstractC14355;
        c13825.f18924 = c18537.f55352;
        return c13825;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13765(C22010 c22010, Object obj) {
        AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c22010.f69239, obj);
        int i = c22010.f18924;
        C18537 c18537 = this.f67285;
        c18537.f55352 = i;
        C22010 c22011 = new C22010();
        c22011.f69239 = abstractC14355;
        c22011.f18924 = c18537.f55352;
        return c22011;
    }
}
