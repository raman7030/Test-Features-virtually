package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: KARX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4264 extends AbstractC11753 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2853 f13801;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f13802;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f13803;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5883[] f13804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f13805;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC23747 f13806;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f13807;

    @Override // l.AbstractC11753
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12834() {
        C2853 c2853 = this.f13801;
        c2853.f9108 = -1;
        c2853.f9109 = 0;
        c2853.f9106 = -1;
        c2853.f9107 = null;
        this.f13802 = -1;
        this.f13803 = 1;
        this.f13805 = 0;
        this.f13807 = 0;
    }

    public C4264(AbstractC23747 abstractC23747, C21631 c21631, C5883[] c5883Arr, C17878 c17878) {
        super(c21631, c17878);
        this.f13802 = -1;
        this.f13803 = 1;
        this.f13805 = 0;
        this.f13807 = 0;
        C2853 c2853 = new C2853();
        c2853.f9108 = -1;
        c2853.f9109 = 0;
        c2853.f9106 = -1;
        this.f13801 = c2853;
        this.f13804 = c5883Arr;
        this.f13806 = abstractC23747;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12831(InterfaceC23125 interfaceC23125, int i) {
        this.f13807 = i;
        int iMo6200 = interfaceC23125.mo6200();
        try {
            this.f13802 = interfaceC23125.index();
            C2853 c2853 = this.f13801;
            c2853.f9108 = -1;
            c2853.f9109 = 0;
            c2853.f9106 = -1;
            c2853.f9107 = null;
            C5883 c5883 = this.f13804[i];
            if (c5883.f18066 == null) {
                return m12842(interfaceC23125);
            }
            return m12832(interfaceC23125, c5883.f18066);
        } finally {
            interfaceC23125.mo6207(iMo6200);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12842(InterfaceC23125 interfaceC23125) {
        AbstractC23041 abstractC23041 = (AbstractC23041) this.f35089.f69447.get(this.f13807);
        C21198 c21198 = C21198.f68319;
        C6380 c6380 = new C6380();
        int i = 0;
        while (i < abstractC23041.f74151.size()) {
            int i2 = i + 1;
            m12837(interfaceC23125, new C16257(abstractC23041.m51211(i).f38806, i2, c21198), c6380, false, false, false);
            i = i2;
        }
        boolean z = c6380.f39356;
        c6380.f39356 = false;
        C13643 c13643M12833 = m12833(c6380);
        if (!z) {
            this.f13804[this.f13807].f18066 = c13643M12833;
        }
        return m12832(interfaceC23125, c13643M12833);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12832(InterfaceC23125 interfaceC23125, C13643 c13643) throws Throwable {
        C13643 c13643M12833;
        C22336 c22336;
        boolean z = c13643.f40687;
        C2853 c2853 = this.f13801;
        if (z) {
            c2853.f9108 = interfaceC23125.index();
            c2853.f9109 = this.f13803;
            c2853.f9106 = this.f13805;
            c2853.f9107 = c13643;
        }
        C13643 c13644 = c13643;
        int iMo6203 = interfaceC23125.mo6203(1);
        C4264 c4264 = this;
        InterfaceC23125 interfaceC23126 = interfaceC23125;
        while (true) {
            C13643[] c13643Arr = c13644.f40685;
            C13643 c13645 = (c13643Arr == null || iMo6203 < 0 || iMo6203 > 127) ? null : c13643Arr[iMo6203];
            C13643 c13646 = AbstractC11753.f35088;
            if (c13645 == null) {
                C6380 c6380 = new C6380();
                int i = 0;
                for (C22336 c22337 : c13644.f40683.f39354) {
                    int i2 = c22337.f72390;
                    AbstractC23041 abstractC23041 = c22337.f72393;
                    boolean z2 = i2 == i;
                    if (!z2 || !((C16257) c22337).m38231()) {
                        int size = abstractC23041.f74151.size();
                        int i3 = 0;
                        while (i3 < size) {
                            AbstractC12938 abstractC12938M51211 = abstractC23041.m51211(i3);
                            InterfaceC23125 interfaceC23127 = interfaceC23126;
                            AbstractC23041 abstractC23042 = abstractC12938M51211.mo3364(iMo6203, 1114111) ? abstractC12938M51211.f38806 : null;
                            if (abstractC23042 != null) {
                                C16257 c16257 = (C16257) c22337;
                                C19787 c19787M38229 = c16257.m38229();
                                if (c19787M38229 != null) {
                                    c19787M38229 = c19787M38229.m45483(interfaceC23125.index() - c4264.f13802);
                                }
                                c22336 = c22337;
                                if (m12837(interfaceC23125, new C16257(c16257, abstractC23042, c19787M38229), c6380, z2, true, iMo6203 == -1)) {
                                    i = c22336.f72390;
                                    interfaceC23126 = interfaceC23125;
                                    c4264 = this;
                                    break;
                                }
                                c4264 = this;
                                interfaceC23126 = interfaceC23125;
                            } else {
                                c22336 = c22337;
                                interfaceC23126 = interfaceC23127;
                            }
                            i3++;
                            c22337 = c22336;
                            size = size;
                            abstractC23041 = abstractC23041;
                        }
                    }
                }
                if (c6380.f39354.isEmpty()) {
                    if (!c6380.f39356) {
                        m12830(c13644, iMo6203, c13646);
                    }
                    c13643M12833 = c13646;
                } else {
                    boolean z3 = c6380.f39356;
                    c6380.f39356 = false;
                    c13643M12833 = c4264.m12833(c6380);
                    if (!z3) {
                        m12830(c13644, iMo6203, c13643M12833);
                    }
                }
                c13644 = c13643M12833;
            } else {
                c13644 = c13645;
            }
            if (c13644 == c13646) {
                break;
            }
            if (iMo6203 != -1) {
                m12836(interfaceC23125);
            }
            if (c13644.f40687) {
                c2853.f9108 = interfaceC23126.index();
                c2853.f9109 = c4264.f13803;
                c2853.f9106 = c4264.f13805;
                c2853.f9107 = c13644;
                if (iMo6203 == -1) {
                    break;
                }
            }
            iMo6203 = interfaceC23126.mo6203(1);
        }
        C13643 c13647 = c2853.f9107;
        AbstractC23747 abstractC23747 = c4264.f13806;
        if (c13647 != null) {
            C19787 c19787 = c13647.f40689;
            int i4 = c4264.f13802;
            int i5 = c2853.f9108;
            int i6 = c2853.f9109;
            int i7 = c2853.f9106;
            interfaceC23126.mo6201(i5);
            c4264.f13803 = i6;
            c4264.f13805 = i7;
            if (c19787 != null) {
                c19787.m45484(abstractC23747, interfaceC23126, i4);
            }
            return c2853.f9107.f40686;
        }
        if (iMo6203 == -1 && interfaceC23126.index() == c4264.f13802) {
            return -1;
        }
        throw new C6814(abstractC23747, interfaceC23126, c4264.f13802);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[PHI: r2
      0x015b: PHI (r2v2 l.᩵ܳ֡) = (r2v1 l.᩵ܳ֡), (r2v1 l.᩵ܳ֡), (r2v1 l.᩵ܳ֡), (r2v5 l.᩵ܳ֡) binds: [B:42:0x00ac, B:63:0x013e, B:65:0x0148, B:57:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12837(InterfaceC23125 interfaceC23125, C16257 c16257, C6380 c6380, boolean z, boolean z2, boolean z3) {
        C19515 c19515;
        C16257 c16258;
        boolean zMo1328;
        C16257 c16259;
        C19515 c19516;
        C6380 c6381 = c6380;
        AbstractC23041 abstractC23041 = c16257.f72393;
        boolean z4 = abstractC23041 instanceof C9412;
        C19515 c19517 = null;
        C21631 c21631 = this.f35089;
        boolean z5 = true;
        if (!z4) {
            if (!abstractC23041.f74150 && (!z || !c16257.m38231())) {
                c6381.m31894(c16257, null);
            }
            boolean zM12837 = z;
            int i = 0;
            while (i < abstractC23041.f74151.size()) {
                AbstractC12938 abstractC12938M51211 = abstractC23041.m51211(i);
                int iMo3363 = abstractC12938M51211.mo3363();
                if (iMo3363 == 10) {
                    throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
                }
                switch (iMo3363) {
                    case 1:
                        c19516 = c19517;
                        c16259 = new C16257(c16257, abstractC12938M51211.f38806);
                        c19515 = c19516;
                        c16258 = c16259;
                        if (c16258 != 0) {
                            zM12837 = m12837(interfaceC23125, c16258, c6380, zM12837, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c19517 = c19515;
                        c6381 = c6380;
                        break;
                    case 2:
                    case 5:
                    case 7:
                        if (z3 && abstractC12938M51211.mo3364(-1, 1114111)) {
                            c19516 = c19517;
                            c16259 = new C16257(c16257, abstractC12938M51211.f38806);
                            c19515 = c19516;
                            c16258 = c16259;
                        } else {
                            c19517 = c19517;
                            C19515 c19518 = c19517;
                            c19515 = c19518;
                            c16258 = c19518;
                        }
                        if (c16258 != 0) {
                            zM12837 = m12837(interfaceC23125, c16258, c6380, zM12837, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c19517 = c19515;
                        c6381 = c6380;
                        break;
                    case 3:
                        c19515 = c19517;
                        c16258 = new C16257(c16257, abstractC12938M51211.f38806, C8000.m21314(c16257.f72391, ((C8706) abstractC12938M51211).f26506.f74153));
                        if (c16258 != 0) {
                            zM12837 = m12837(interfaceC23125, c16258, c6380, zM12837, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c19517 = c19515;
                        c6381 = c6380;
                        break;
                    case 4:
                        C10823 c10823 = (C10823) abstractC12938M51211;
                        c6381.f39356 = z5;
                        int i2 = c10823.f32554;
                        int i3 = c10823.f32555;
                        AbstractC23747 abstractC23747 = this.f13806;
                        if (!z2) {
                            zMo1328 = abstractC23747.mo1328(c19517, i2, i3);
                        } else {
                            int i4 = this.f13805;
                            int i5 = this.f13803;
                            int iIndex = interfaceC23125.index();
                            int iMo6200 = interfaceC23125.mo6200();
                            try {
                                m12836(interfaceC23125);
                                zMo1328 = abstractC23747.mo1328(null, i2, i3);
                                this.f13805 = i4;
                                this.f13803 = i5;
                                interfaceC23125.mo6201(iIndex);
                                interfaceC23125.mo6207(iMo6200);
                                c19517 = null;
                            } catch (Throwable th) {
                                this.f13805 = i4;
                                this.f13803 = i5;
                                interfaceC23125.mo6201(iIndex);
                                interfaceC23125.mo6207(iMo6200);
                                throw th;
                            }
                        }
                        if (zMo1328) {
                            c19517 = c19517;
                            c19516 = c19517;
                            c16259 = new C16257(c16257, abstractC12938M51211.f38806);
                            c19515 = c19516;
                            c16258 = c16259;
                        } else {
                            c19517 = c19517;
                            C19515 c19519 = c19517;
                            c19515 = c19519;
                            c16258 = c19519;
                        }
                        if (c16258 != 0) {
                            zM12837 = m12837(interfaceC23125, c16258, c6380, zM12837, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c19517 = c19515;
                        c6381 = c6380;
                        break;
                    case 6:
                        AbstractC16466 abstractC16466 = c16257.f72391;
                        if (abstractC16466 == null || abstractC16466.m38772()) {
                            c16259 = new C16257(c16257, abstractC12938M51211.f38806, C19787.m45482(c16257.m38229(), c21631.f69446[((C2147) abstractC12938M51211).f7113]));
                            c19516 = c19517;
                        } else {
                            c19516 = c19517;
                            c16259 = new C16257(c16257, abstractC12938M51211.f38806);
                        }
                        c19515 = c19516;
                        c16258 = c16259;
                        if (c16258 != 0) {
                            zM12837 = m12837(interfaceC23125, c16258, c6380, zM12837, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c19517 = c19515;
                        c6381 = c6380;
                        break;
                    default:
                        c19517 = c19517;
                        C19515 c195110 = c19517;
                        c19515 = c195110;
                        c16258 = c195110;
                        if (c16258 != 0) {
                            zM12837 = m12837(interfaceC23125, c16258, c6380, zM12837, z2, z3);
                        }
                        i++;
                        z5 = true;
                        c19517 = c19515;
                        c6381 = c6380;
                        break;
                }
            }
            return zM12837;
        }
        AbstractC16466 abstractC16467 = c16257.f72391;
        if (abstractC16467 == null || abstractC16467.m38772()) {
            AbstractC16466 abstractC16468 = c16257.f72391;
            if (abstractC16468 == null || abstractC16468.mo27960()) {
                c6381.m31894(c16257, null);
                return true;
            }
            c6381.m31894(new C16257(c16257, abstractC23041, C21198.f68319), null);
        } else {
            z5 = z;
        }
        AbstractC16466 abstractC16469 = c16257.f72391;
        if (abstractC16469 == null || abstractC16469.mo27960()) {
            return z5;
        }
        boolean zM12838 = z5;
        for (int i6 = 0; i6 < c16257.f72391.mo21317(); i6++) {
            if (c16257.f72391.mo21316(i6) != Integer.MAX_VALUE) {
                zM12838 = m12837(interfaceC23125, new C16257(c16257, (AbstractC23041) c21631.f69449.get(c16257.f72391.mo21316(i6)), c16257.f72391.mo21315(i6)), c6380, zM12838, z2, z3);
            }
        }
        return zM12838;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12830(C13643 c13643, int i, C13643 c13644) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c13643) {
            if (c13643.f40685 == null) {
                c13643.f40685 = new C13643[128];
            }
            c13643.f40685[i] = c13644;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 m12833(C6380 c6380) {
        C22336 c22336;
        C13643 c13643 = new C13643(c6380);
        Iterator it = c6380.f39354.iterator();
        do {
            if (!it.hasNext()) {
                c22336 = null;
                break;
            }
            c22336 = (C22336) it.next();
        } while (!(c22336.f72393 instanceof C9412));
        if (c22336 != null) {
            c13643.f40687 = true;
            c13643.f40689 = ((C16257) c22336).m38229();
            c13643.f40686 = this.f35089.f69443[c22336.f72393.f74154];
        }
        C5883 c5883 = this.f13804[this.f13807];
        synchronized (c5883.f18065) {
            C13643 c13644 = (C13643) c5883.f18065.get(c13643);
            if (c13644 != null) {
                return c13644;
            }
            c13643.f40684 = c5883.f18065.size();
            c6380.m31897();
            c13643.f40683 = c6380;
            c5883.f18065.put(c13643, c13643);
            return c13643;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m12839(InterfaceC23125 interfaceC23125) {
        return interfaceC23125.mo12025(C14763.m35067(this.f13802, interfaceC23125.index() - 1));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12841() {
        return this.f13803;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12840(int i) {
        this.f13803 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12838() {
        return this.f13805;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12835(int i) {
        this.f13805 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12836(InterfaceC23125 interfaceC23125) {
        if (interfaceC23125.mo6203(1) == 10) {
            this.f13803++;
            this.f13805 = 0;
        } else {
            this.f13805++;
        }
        interfaceC23125.mo6204();
    }
}
