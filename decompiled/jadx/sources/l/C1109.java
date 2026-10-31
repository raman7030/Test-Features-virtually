package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1109 implements InterfaceC19150 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f4043;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4044;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4045;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4046;

    public C1109(InterfaceC19150 interfaceC19150) {
        AbstractC18043 c13103;
        this.f4044 = C7470.m20016(new C15925(null, 0, 0));
        this.f4046 = new ArrayList();
        this.f4043 = true;
        this.f4045 = interfaceC19150.mo3818();
        Iterator it = interfaceC19150.mo3817().iterator();
        int iMo3974 = 0;
        int i = 0;
        while (it.hasNext()) {
            iMo3974 += ((InterfaceC22677) it.next()).mo3974();
            i++;
            this.f4044.add(new C15925(null, iMo3974, i));
        }
        int[] iArr = new int[iMo3974 + 1];
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < this.f4044.size(); i2++) {
            iArr[((C15925) this.f4044.get(i2)).f49185] = i2;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
            C15925 c15925 = (C15925) this.f4044.get(i3);
            EnumC0841 enumC0841Mo3975 = interfaceC22677.mo3975();
            if (enumC0841Mo3975 == EnumC0841.f3269 || enumC0841Mo3975 == EnumC0841.f3126) {
                arrayList.add(new C2521(this, c15925, iArr, interfaceC22677));
            } else {
                m3799(c15925, iArr, interfaceC22677);
            }
            i3++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5343) it2.next()).perform();
        }
        for (InterfaceC7860 interfaceC7860 : interfaceC19150.mo3812()) {
            C15925 c15926 = (C15925) this.f4044.get(m3796(interfaceC7860.mo14974(), iArr));
            switch (interfaceC7860.mo8424()) {
                case 3:
                    InterfaceC2922 interfaceC2922 = (InterfaceC2922) interfaceC7860;
                    c13103 = new C13103(interfaceC2922.mo8920(), interfaceC2922.mo8923(), interfaceC2922.mo8921(), interfaceC2922.mo8922());
                    break;
                case 4:
                default:
                    throw new C15431(null, "Invalid debug item type: " + interfaceC7860.mo8424(), new Object[0]);
                case 5:
                    c13103 = new C15219(((InterfaceC14915) interfaceC7860).mo23290());
                    break;
                case 6:
                    c13103 = new C4637(((InterfaceC19856) interfaceC7860).mo12317());
                    break;
                case 7:
                    c13103 = new C20160();
                    break;
                case 8:
                    c13103 = new C21571();
                    break;
                case 9:
                    c13103 = new C3226(((InterfaceC4333) interfaceC7860).mo9897());
                    break;
                case 10:
                    c13103 = new C22276(((InterfaceC21267) interfaceC7860).getLineNumber());
                    break;
            }
            ((C6754) c15926.m37702()).add(c13103);
            c13103.f56236 = c15926;
        }
        for (InterfaceC5038 interfaceC5038 : interfaceC19150.mo3811()) {
            C17337 c17337M3801 = m3801(interfaceC5038.mo14555(), iArr);
            C17337 c17337M3802 = m3801(interfaceC5038.mo14557() + interfaceC5038.mo14555(), iArr);
            for (InterfaceC2216 interfaceC2216 : interfaceC5038.mo14556()) {
                this.f4046.add(new C16631(c17337M3801, c17337M3802, interfaceC2216.mo7392(), m3801(interfaceC2216.mo7391(), iArr)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m3802() {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList<C15925> arrayList = this.f4044;
        for (C15925 c15925 : arrayList) {
            AbstractC7479 abstractC7479 = c15925.f49190;
            if (abstractC7479 != null) {
                EnumC0841 enumC0841 = abstractC7479.f23060;
                int i = C19455.f62931[enumC0841.ordinal()];
                if (i == 1 || i == 2) {
                    C15925 c15925M40667 = ((AbstractC1815) abstractC7479).f6241.m40667();
                    AbstractC7479 abstractC74710 = c15925M40667.f49190;
                    if (abstractC74710 == null) {
                        throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d points to the end of the method.", Integer.valueOf(c15925.f49185), Integer.valueOf(c15925.f49188)));
                    }
                    if (abstractC74710.f23060 == EnumC0841.f3065) {
                        int i2 = c15925M40667.f49188 + 1;
                        while (true) {
                            if (i2 >= arrayList.size() - 1) {
                                abstractC74710 = null;
                                break;
                            }
                            AbstractC7479 abstractC74711 = ((C15925) arrayList.get(i2)).f49190;
                            if (abstractC74711.f23060 != EnumC0841.f3065) {
                                abstractC74710 = abstractC74711;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (abstractC74710 != null) {
                        EnumC0841 enumC0842 = abstractC74710.f23060;
                        if (abstractC74710 instanceof AbstractC10988) {
                            if ((enumC0841 == EnumC0841.f3293 && enumC0842 != EnumC0841.f3269) || (enumC0841 == EnumC0841.f3201 && enumC0842 != EnumC0841.f3126)) {
                                throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d refers to the wrong type of payload instruction.", Integer.valueOf(c15925.f49185), Integer.valueOf(c15925.f49188)));
                            }
                            if (!hashSet.add(c15925M40667)) {
                                throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                            }
                            ((AbstractC10988) abstractC74710).f33050 = c15925;
                        }
                    }
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d does not refer to a payload instruction.", Integer.valueOf(c15925.f49185), Integer.valueOf(c15925.f49188)));
                }
            }
        }
        do {
            int i3 = 0;
            z = false;
            while (i3 < arrayList.size()) {
                C15925 c15926 = (C15925) arrayList.get(i3);
                AbstractC7479 abstractC74712 = c15926.f49190;
                if (abstractC74712 != null) {
                    int i4 = C19455.f62931[abstractC74712.f23060.ordinal()];
                    if (i4 == 3) {
                        AbstractC1815 abstractC1815 = (AbstractC1815) abstractC74712;
                        C17337 c17337 = abstractC1815.f6241;
                        int i5 = c17337.m40667().f49185 - abstractC1815.m20099().f49185;
                        if (i5 < -128 || i5 > 127) {
                            m3814(c15926.f49188, (i5 < -32768 || i5 > 32767) ? new C3871(EnumC0841.f3206, c17337) : new C1754(EnumC0841.f3238, c17337));
                            z = true;
                        }
                    } else if (i4 != 4) {
                        if (i4 == 5 || i4 == 6) {
                            if (((AbstractC10988) abstractC74712).f33050 == null) {
                                m3813(i3);
                            }
                            i3--;
                            z = true;
                        } else if (i4 != 7) {
                        }
                        if ((c15926.f49185 & 1) != 0) {
                            int i6 = c15926.f49188 - 1;
                            EnumC0841 enumC0843 = ((C15925) arrayList.get(i6)).f49190.f23060;
                            EnumC0841 enumC0844 = EnumC0841.f3065;
                            if (enumC0843 == enumC0844) {
                                m3813(i6);
                                i3--;
                            } else {
                                m3807(c15926.f49188, new C6048(enumC0844));
                                i3++;
                            }
                            z = true;
                        }
                    } else {
                        AbstractC1815 abstractC1816 = (AbstractC1815) abstractC74712;
                        C17337 c17338 = abstractC1816.f6241;
                        int i7 = c17338.m40667().f49185 - abstractC1816.m20099().f49185;
                        if (i7 < -32768 || i7 > 32767) {
                            m3814(c15926.f49188, new C3871(EnumC0841.f3206, c17338));
                            z = true;
                        }
                    }
                }
                i3++;
            }
        } while (z);
        this.f4043 = false;
    }

    public C1109(int i) {
        this.f4044 = C7470.m20016(new C15925(null, 0, 0));
        this.f4046 = new ArrayList();
        this.f4043 = true;
        this.f4045 = i;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo3818() {
        return this.f4045;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3816(int i) {
        this.f4045 = i;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩷ */
    public final List mo3817() {
        if (this.f4043) {
            m3802();
        }
        return new C3932(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3806(int i, AbstractC6068 abstractC6068) {
        if (this.f4043) {
            m3802();
        }
        ((C6754) ((C15925) this.f4044.get(i)).m37702()).add(abstractC6068);
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List mo3811() {
        if (this.f4043) {
            m3802();
        }
        return C20195.unmodifiableList(this.f4046);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m3804() {
        if (this.f4043) {
            m3802();
        }
        return this.f4046;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Iterable mo3812() {
        if (this.f4043) {
            m3802();
        }
        return C8882.m22947(C8882.m22949(this.f4044, new C18749(this)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3810(C23589 c23589, C17337 c17337, C17337 c17338, C17337 c17339) {
        this.f4046.add(new C16631(c17337, c17338, c23589, c17339));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3809(C17337 c17337, C17337 c17338, C17337 c17339) {
        this.f4046.add(new C16631(c17337, c17338, c17339));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3807(int i, AbstractC7479 abstractC7479) {
        ArrayList arrayList = this.f4044;
        if (i >= arrayList.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != arrayList.size() - 1) {
            int i2 = ((C15925) arrayList.get(i)).f49185;
            C15925 c15925 = new C15925(abstractC7479, i2, i);
            arrayList.add(i, c15925);
            abstractC7479.f23059 = c15925;
            int iMo3974 = abstractC7479.mo3974() + i2;
            for (int i3 = i + 1; i3 < arrayList.size(); i3++) {
                C15925 c15926 = (C15925) arrayList.get(i3);
                c15926.f49188++;
                c15926.f49185 = iMo3974;
                AbstractC7479 abstractC74710 = c15926.f49190;
                if (abstractC74710 != null) {
                    iMo3974 = abstractC74710.mo3974() + iMo3974;
                }
            }
            this.f4043 = true;
            return;
        }
        m3808(abstractC7479);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3808(AbstractC7479 abstractC7479) {
        ArrayList arrayList = this.f4044;
        C15925 c15925 = (C15925) C18566.m43105(arrayList, 1);
        c15925.f49190 = abstractC7479;
        abstractC7479.f23059 = c15925;
        arrayList.add(new C15925(null, abstractC7479.mo3974() + c15925.f49185, arrayList.size()));
        this.f4043 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3814(int i, AbstractC7479 abstractC7479) {
        ArrayList arrayList = this.f4044;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C15925 c15925 = (C15925) arrayList.get(i);
        abstractC7479.f23059 = c15925;
        c15925.f49190.f23059 = null;
        c15925.f49190 = abstractC7479;
        int iMo3974 = abstractC7479.mo3974() + c15925.f49185;
        for (int i2 = i + 1; i2 < arrayList.size(); i2++) {
            C15925 c15926 = (C15925) arrayList.get(i2);
            c15926.f49185 = iMo3974;
            AbstractC7479 abstractC74710 = c15926.f49190;
            if (abstractC74710 != null) {
                iMo3974 = abstractC74710.mo3974() + iMo3974;
            }
        }
        this.f4043 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3815(AbstractC7479 abstractC7479) {
        if (abstractC7479.m20099().f49190 == abstractC7479) {
            m3813(abstractC7479.m20099().f49188);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3813(int i) {
        ArrayList arrayList = this.f4044;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C15925 c15925 = (C15925) arrayList.get(i);
        c15925.f49190 = null;
        c15925.m37700((C15925) arrayList.get(i + 1));
        arrayList.remove(i);
        int iMo3974 = c15925.f49185;
        while (i < arrayList.size()) {
            C15925 c15926 = (C15925) arrayList.get(i);
            c15926.f49188 = i;
            c15926.f49185 = iMo3974;
            AbstractC7479 abstractC7479 = c15926.f49190;
            if (abstractC7479 != null) {
                iMo3974 = abstractC7479.mo3974() + iMo3974;
            }
            i++;
        }
        this.f4043 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3796(int i, int[] iArr) {
        while (true) {
            if (i >= iArr.length) {
                i = iArr.length - 1;
            }
            int i2 = iArr[i];
            if (i2 >= 0) {
                return i2;
            }
            i--;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17337 m3805(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f4044;
            if (i < arrayList.size()) {
                C15925 c15925 = (C15925) arrayList.get(i);
                c15925.getClass();
                C17337 c17337 = new C17337();
                ((C6754) c15925.m37705()).add(c17337);
                return c17337;
            }
        }
        throw new IndexOutOfBoundsException(String.format("instruction index %d out of bounds", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C17337 m3801(int i, int[] iArr) {
        C15925 c15925 = (C15925) this.f4044.get(m3796(i, iArr));
        c15925.getClass();
        C17337 c17337 = new C17337();
        ((C6754) c15925.m37705()).add(c17337);
        return c17337;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3799(C15925 c15925, int[] iArr, InterfaceC22677 interfaceC22677) {
        C17337 c17337M3801;
        C12337 c12337;
        C5987 c5987;
        switch (C19455.f62930[interfaceC22677.mo3975().f3316.ordinal()]) {
            case 1:
                InterfaceC15889 interfaceC15889 = (InterfaceC15889) interfaceC22677;
                C10282 c10282 = new C10282(interfaceC15889.mo3975(), m3801(interfaceC15889.mo2818() + c15925.f49185, iArr));
                c15925.f49190 = c10282;
                c10282.f23059 = c15925;
                return;
            case 2:
                C6048 c6048 = new C6048(((InterfaceC2485) interfaceC22677).mo3975());
                c15925.f49190 = c6048;
                c6048.f23059 = c15925;
                return;
            case 3:
                InterfaceC3896 interfaceC3896 = (InterfaceC3896) interfaceC22677;
                C11693 c11693 = new C11693(interfaceC3896.mo3975(), interfaceC3896.mo1790(), interfaceC3896.mo4919());
                c15925.f49190 = c11693;
                c11693.f23059 = c15925;
                return;
            case 4:
                InterfaceC18713 interfaceC18713 = (InterfaceC18713) interfaceC22677;
                C22981 c22981 = new C22981(interfaceC18713.mo1790(), interfaceC18713.mo3975());
                c15925.f49190 = c22981;
                c22981.f23059 = c15925;
                return;
            case 5:
                InterfaceC19419 interfaceC19419 = (InterfaceC19419) interfaceC22677;
                C13808 c13808 = new C13808(interfaceC19419.mo3975(), interfaceC19419.mo1790(), interfaceC19419.mo7930());
                c15925.f49190 = c13808;
                c13808.f23059 = c15925;
                return;
            case 6:
                InterfaceC0367 interfaceC0367 = (InterfaceC0367) interfaceC22677;
                C7459 c7459 = new C7459(interfaceC0367.mo3975(), interfaceC0367.mo1819(), interfaceC0367.getReference());
                c15925.f49190 = c7459;
                c7459.f23059 = c15925;
                return;
            case 7:
                InterfaceC5307 interfaceC5307 = (InterfaceC5307) interfaceC22677;
                C1754 c1754 = new C1754(interfaceC5307.mo3975(), m3801(interfaceC5307.mo2818() + c15925.f49185, iArr));
                c15925.f49190 = c1754;
                c1754.f23059 = c15925;
                return;
            case 8:
                InterfaceC1073 interfaceC1073 = (InterfaceC1073) interfaceC22677;
                C10927 c10927 = new C10927(interfaceC1073.mo3975(), interfaceC1073.mo1790(), interfaceC1073.getReference());
                c15925.f49190 = c10927;
                c10927.f23059 = c15925;
                return;
            case 9:
                InterfaceC8129 interfaceC8129 = (InterfaceC8129) interfaceC22677;
                C16570 c16570 = new C16570(interfaceC8129.mo3975(), interfaceC8129.mo1790(), interfaceC8129.mo4919());
                c15925.f49190 = c16570;
                c16570.f23059 = c15925;
                return;
            case 10:
                InterfaceC15183 interfaceC15183 = (InterfaceC15183) interfaceC22677;
                C17982 c17982 = new C17982(interfaceC15183.mo3975(), interfaceC15183.mo1790(), interfaceC15183.mo4920());
                c15925.f49190 = c17982;
                c17982.f23059 = c15925;
                return;
            case 11:
                InterfaceC21535 interfaceC21535 = (InterfaceC21535) interfaceC22677;
                C17276 c17276 = new C17276(interfaceC21535.mo3975(), interfaceC21535.mo1790(), interfaceC21535.mo4919());
                c15925.f49190 = c17276;
                c17276.f23059 = c15925;
                return;
            case 12:
                InterfaceC22240 interfaceC22240 = (InterfaceC22240) interfaceC22677;
                C14453 c14453 = new C14453(interfaceC22240.mo3975(), interfaceC22240.mo1790(), m3801(interfaceC22240.mo2818() + c15925.f49185, iArr));
                c15925.f49190 = c14453;
                c14453.f23059 = c15925;
                return;
            case 13:
                InterfaceC20124 interfaceC20124 = (InterfaceC20124) interfaceC22677;
                C23626 c23626 = new C23626(interfaceC20124.mo1790(), interfaceC20124.mo7930(), interfaceC20124.mo4919(), interfaceC20124.mo3975());
                c15925.f49190 = c23626;
                c23626.f23059 = c15925;
                return;
            case 14:
                InterfaceC4601 interfaceC4601 = (InterfaceC4601) interfaceC22677;
                C6693 c6693 = new C6693(interfaceC4601.mo3975(), interfaceC4601.mo1790(), interfaceC4601.mo7930(), interfaceC4601.getReference());
                c15925.f49190 = c6693;
                c6693.f23059 = c15925;
                return;
            case 15:
                InterfaceC3190 interfaceC3190 = (InterfaceC3190) interfaceC22677;
                C20805 c20805 = new C20805(interfaceC3190.mo1790(), interfaceC3190.mo7930(), interfaceC3190.mo14389(), interfaceC3190.mo3975());
                c15925.f49190 = c20805;
                c20805.f23059 = c15925;
                return;
            case 16:
                InterfaceC13067 interfaceC13067 = (InterfaceC13067) interfaceC22677;
                C9516 c9516 = new C9516(interfaceC13067.mo1790(), interfaceC13067.mo7930(), interfaceC13067.mo4919(), interfaceC13067.mo3975());
                c15925.f49190 = c9516;
                c9516.f23059 = c15925;
                return;
            case 17:
                InterfaceC12362 interfaceC12362 = (InterfaceC12362) interfaceC22677;
                C8810 c8810 = new C8810(interfaceC12362.mo3975(), interfaceC12362.mo1790(), interfaceC12362.mo7930(), m3801(interfaceC12362.mo2818() + c15925.f49185, iArr));
                c15925.f49190 = c8810;
                c8810.f23059 = c15925;
                return;
            case 18:
                InterfaceC10246 interfaceC10246 = (InterfaceC10246) interfaceC22677;
                C15864 c15864 = new C15864(interfaceC10246.mo3975(), interfaceC10246.mo1790(), interfaceC10246.mo7930());
                c15925.f49190 = c15864;
                c15864.f23059 = c15925;
                return;
            case 19:
                InterfaceC6012 interfaceC6012 = (InterfaceC6012) interfaceC22677;
                C2460 c2460 = new C2460(interfaceC6012.mo1790(), interfaceC6012.mo7930(), interfaceC6012.mo7931(), interfaceC6012.mo3975());
                c15925.f49190 = c2460;
                c2460.f23059 = c15925;
                return;
            case 20:
                InterfaceC11657 interfaceC11657 = (InterfaceC11657) interfaceC22677;
                C3871 c3871 = new C3871(interfaceC11657.mo3975(), m3801(interfaceC11657.mo2818() + c15925.f49185, iArr));
                c15925.f49190 = c3871;
                c3871.f23059 = c15925;
                return;
            case 21:
                InterfaceC22945 interfaceC22945 = (InterfaceC22945) interfaceC22677;
                C18688 c18688 = new C18688(interfaceC22945.mo3975(), interfaceC22945.mo1790(), interfaceC22945.getReference());
                c15925.f49190 = c18688;
                c18688.f23059 = c15925;
                return;
            case 22:
                InterfaceC13772 interfaceC13772 = (InterfaceC13772) interfaceC22677;
                C19394 c19394 = new C19394(interfaceC13772.mo3975(), interfaceC13772.mo1790(), interfaceC13772.mo4919());
                c15925.f49190 = c19394;
                c19394.f23059 = c15925;
                return;
            case 23:
                InterfaceC7423 interfaceC7423 = (InterfaceC7423) interfaceC22677;
                int i = c15925.f49185;
                if (interfaceC7423.mo3975() != EnumC0841.f3121) {
                    C15925 c15926 = (C15925) this.f4044.get(m3796(interfaceC7423.mo2818() + i, iArr));
                    C0403 c0403 = new C0403();
                    c0403.f1858 = c15925;
                    ((C6754) c15926.m37705()).add(c0403);
                    c17337M3801 = c0403;
                } else {
                    c17337M3801 = m3801(interfaceC7423.mo2818() + i, iArr);
                }
                C0342 c0342 = new C0342(interfaceC7423.mo3975(), interfaceC7423.mo1790(), c17337M3801);
                c15925.f49190 = c0342;
                c0342.f23059 = c15925;
                return;
            case 24:
                InterfaceC1943 interfaceC1943 = (InterfaceC1943) interfaceC22677;
                C5282 c5282 = new C5282(interfaceC1943.mo3975(), interfaceC1943.mo1790(), interfaceC1943.mo7930());
                c15925.f49190 = c5282;
                c5282.f23059 = c15925;
                return;
            case 25:
                InterfaceC11116 interfaceC11116 = (InterfaceC11116) interfaceC22677;
                C1048 c1048 = new C1048(interfaceC11116.mo3975(), interfaceC11116.mo3615(), interfaceC11116.mo3614(), interfaceC11116.mo3612(), interfaceC11116.mo3611(), interfaceC11116.mo3613(), interfaceC11116.mo3610(), interfaceC11116.getReference());
                c15925.f49190 = c1048;
                c1048.f23059 = c15925;
                return;
            case 26:
                InterfaceC16759 interfaceC16759 = (InterfaceC16759) interfaceC22677;
                C8104 c8104 = new C8104(interfaceC16759.mo3975(), interfaceC16759.mo3615(), interfaceC16759.mo3614(), interfaceC16759.mo3612(), interfaceC16759.mo3611(), interfaceC16759.mo3613(), interfaceC16759.mo3610(), interfaceC16759.mo21537());
                c15925.f49190 = c8104;
                c8104.f23059 = c15925;
                return;
            case 27:
                InterfaceC18171 interfaceC18171 = (InterfaceC18171) interfaceC22677;
                C15158 c15158 = new C15158(interfaceC18171.mo3975(), interfaceC18171.mo3615(), interfaceC18171.mo3614(), interfaceC18171.mo3612(), interfaceC18171.mo3611(), interfaceC18171.mo3613(), interfaceC18171.mo3610(), interfaceC18171.mo34743());
                c15925.f49190 = c15158;
                c15158.f23059 = c15925;
                return;
            case 28:
                InterfaceC17465 interfaceC17465 = (InterfaceC17465) interfaceC22677;
                C21510 c21510 = new C21510(interfaceC17465.mo3975(), interfaceC17465.mo9712(), interfaceC17465.mo3615(), interfaceC17465.getReference());
                c15925.f49190 = c21510;
                c21510.f23059 = c15925;
                return;
            case 29:
                InterfaceC14642 interfaceC14642 = (InterfaceC14642) interfaceC22677;
                C22215 c22215 = new C22215(interfaceC14642.mo9712(), interfaceC14642.mo3615(), interfaceC14642.mo21537(), interfaceC14642.mo3975());
                c15925.f49190 = c22215;
                c22215.f23059 = c15925;
                return;
            case 30:
                InterfaceC23815 interfaceC23815 = (InterfaceC23815) interfaceC22677;
                C20099 c20099 = new C20099(interfaceC23815.mo9712(), interfaceC23815.mo3615(), interfaceC23815.mo34743(), interfaceC23815.mo3975());
                c15925.f49190 = c20099;
                c20099.f23059 = c15925;
                return;
            case 31:
                InterfaceC6882 interfaceC6882 = (InterfaceC6882) interfaceC22677;
                C4576 c4576 = new C4576(interfaceC6882.mo3975(), interfaceC6882.mo3615(), interfaceC6882.mo3614(), interfaceC6882.mo3612(), interfaceC6882.mo3611(), interfaceC6882.mo3613(), interfaceC6882.mo3610(), interfaceC6882.getReference(), interfaceC6882.mo9710());
                c15925.f49190 = c4576;
                c4576.f23059 = c15925;
                return;
            case 32:
                InterfaceC20994 interfaceC20994 = (InterfaceC20994) interfaceC22677;
                C3165 c3165 = new C3165(interfaceC20994.mo3975(), interfaceC20994.mo9712(), interfaceC20994.mo3615(), interfaceC20994.getReference(), interfaceC20994.mo9710());
                c15925.f49190 = c3165;
                c3165.f23059 = c15925;
                return;
            case 33:
                InterfaceC9705 interfaceC9705 = (InterfaceC9705) interfaceC22677;
                C13042 c13042 = new C13042(interfaceC9705.mo3975(), interfaceC9705.mo1790(), interfaceC9705.mo4920());
                c15925.f49190 = c13042;
                c13042.f23059 = c15925;
                return;
            case 34:
                List listMo8107 = ((InterfaceC8999) interfaceC22677).mo8107();
                if (listMo8107.size() == 0) {
                    c12337 = new C12337(null, 0);
                } else {
                    C15925 c15925M3797 = m3797(c15925);
                    int i2 = c15925M3797 == null ? 0 : c15925M3797.f49185;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listMo8107.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m3801(((InterfaceC18007) it.next()).mo12019() + i2, iArr));
                    }
                    c12337 = new C12337(arrayList, ((InterfaceC18007) listMo8107.get(0)).getKey());
                }
                c15925.f49190 = c12337;
                c12337.f23059 = c15925;
                return;
            case 35:
                List<InterfaceC18007> listMo8108 = ((InterfaceC16053) interfaceC22677).mo8107();
                if (listMo8108.size() == 0) {
                    c5987 = new C5987(null);
                } else {
                    C15925 c15925M3798 = m3797(c15925);
                    int i3 = c15925M3798 != null ? c15925M3798.f49185 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC18007 interfaceC18007 : listMo8108) {
                        arrayList2.add(new C8165(interfaceC18007.getKey(), m3801(interfaceC18007.mo12019() + i3, iArr)));
                    }
                    c5987 = new C5987(arrayList2);
                }
                c15925.f49190 = c5987;
                c5987.f23059 = c15925;
                return;
            case 36:
                InterfaceC8835 interfaceC8835 = (InterfaceC8835) interfaceC22677;
                C12398 c12398 = new C12398(interfaceC8835.mo19046(), interfaceC8835.mo19045());
                c15925.f49190 = c12398;
                c12398.f23059 = c15925;
                return;
            default:
                throw new C15431(null, "Instruction format %s not supported", interfaceC22677.mo3975().f3316);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15925 m3797(C15925 c15925) {
        AbstractC7479 abstractC7479;
        C15925 c15926 = null;
        do {
            for (C17337 c17337 : (C6754) c15925.m37705()) {
                if (c17337 instanceof C0403) {
                    if (c15926 != null) {
                        throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                    }
                    c15926 = ((C0403) c17337).f1858;
                }
            }
            int i = c15925.f49188;
            if (i == 0) {
                break;
            }
            c15925 = (C15925) this.f4044.get(i - 1);
            abstractC7479 = c15925.f49190;
            if (abstractC7479 == null) {
                break;
            }
        } while (abstractC7479.f23060 == EnumC0841.f3065);
        return c15926;
    }
}
