package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19357 extends AbstractC21411 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f62661;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f62662;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f62663;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f62664;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f62665;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f62666;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f62667;

    @Override // l.AbstractC21411
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo44614(C0949 c0949, Object obj) {
        InterfaceC14062 interfaceC14062 = (InterfaceC14062) obj;
        int iMo2302 = interfaceC14062.mo2302();
        if (iMo2302 == 0) {
            c0949.m49704(((InterfaceC3354) interfaceC14062).getValue());
            return;
        }
        if (iMo2302 == 6) {
            c0949.m49709(((InterfaceC7587) interfaceC14062).getValue());
            return;
        }
        if (iMo2302 == 2) {
            c0949.m49719(((InterfaceC18213) interfaceC14062).getValue());
            return;
        }
        if (iMo2302 == 3) {
            c0949.m49705(((InterfaceC13231) interfaceC14062).getValue());
            return;
        }
        if (iMo2302 == 4) {
            c0949.m49708(((InterfaceC13936) interfaceC14062).getValue());
            return;
        }
        if (iMo2302 == 16) {
            c0949.m49707(((InterfaceC23109) interfaceC14062).getValue());
            return;
        }
        if (iMo2302 == 17) {
            c0949.m49706(((InterfaceC12526) interfaceC14062).getValue());
            return;
        }
        switch (iMo2302) {
            case 21:
                c0949.m49713(((C23610) interfaceC14062).f76529);
                return;
            case 22:
                c0949.m49715(((C14437) interfaceC14062).f44252);
                return;
            case 23:
                c0949.m49711(((C9500) interfaceC14062).f28837);
                return;
            case 24:
                c0949.m49716(((C8794) interfaceC14062).f26784);
                return;
            case 25:
                c0949.m49720(((C1738) interfaceC14062).f6011);
                return;
            case 26:
                c0949.m49712(((C17260) interfaceC14062).f52912);
                return;
            case 27:
                c0949.m49714(((C7713) interfaceC14062).f23825);
                return;
            case 28:
                c0949.m49710(((C12652) interfaceC14062).f38107);
                return;
            case 29:
                C13357 c13357 = (C13357) interfaceC14062;
                c0949.m49717(c13357.f39928, c13357.f39927);
                return;
            case 30:
                c0949.m49703();
                return;
            case 31:
                c0949.m49718(((InterfaceC4765) interfaceC14062).getValue());
                return;
            default:
                throw new C15431(null, "Unrecognized value type: %d", Integer.valueOf(interfaceC14062.mo2302()));
        }
    }

    public C19357(C7897 c7897) {
        super(c7897);
        this.f62664 = false;
    }

    @Override // l.AbstractC21411
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo44617() {
        return !this.f62663 && super.mo44617();
    }

    @Override // l.AbstractC21411
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18651 mo44612() {
        return new C18651(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15848 m44611(String str, String str2, String str3, int i, InterfaceC10410 interfaceC10410, Set set, Set set2) {
        C3855 c3855 = this.f68924;
        c3855.getClass();
        return new C15848(c3855.m11615(new C20330(str, str2, str3)), i, interfaceC10410 == null ? null : m44610(interfaceC10410), ((C9125) this.f68945).m23499(set), set2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1032 m44607(String str, String str2, List list, String str3, int i, Set set, Set set2, InterfaceC19150 interfaceC19150) {
        AbstractC14545 abstractC14545M34732;
        List listOf = list == null ? AbstractC14545.of() : list;
        C3149 c3149 = this.f68923;
        c3149.getClass();
        C12321 c12321M9577 = c3149.m9577(new C4560(str, str2, str3, listOf));
        if (listOf == null) {
            abstractC14545M34732 = AbstractC14545.of();
        } else {
            abstractC14545M34732 = AbstractC14545.m34732(C4648.m13611(listOf.iterator(), new C6656(this)));
        }
        return new C1032(c12321M9577, abstractC14545M34732, i, ((C9125) this.f68945).m23499(set), set2, interfaceC19150);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0657 m44605(String str, int i, String str2, List list, String str3, Set set, ArrayList arrayList, Collection collection) {
        AbstractC23698 abstractC23698;
        AbstractC23698 abstractC23699;
        C12652 c12652M10658;
        C23589 c23589M34448;
        List listOf = list;
        C7382 c7382M33032 = null;
        String str4 = this.f62667 ? null : str3;
        if (listOf == null) {
            listOf = AbstractC14545.of();
        } else {
            HashSet hashSet = new HashSet(listOf);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (!hashSet.contains(str5)) {
                    it.remove();
                } else {
                    hashSet.remove(str5);
                }
            }
        }
        if (arrayList != null) {
            AbstractC23698 abstractC23698M52242 = AbstractC23698.m52242(C8882.m22954(arrayList, C14145.f42693));
            AbstractC23698 abstractC23698M52243 = AbstractC23698.m52242(C8882.m22954(arrayList, C14145.f42692));
            InterfaceC20288 interfaceC20288M32967 = C13710.m32967(abstractC23698M52242);
            if (interfaceC20288M32967 != null) {
                abstractC23699 = abstractC23698M52243;
                abstractC23698 = abstractC23698M52242;
                c12652M10658 = this.f68950.m10658((AbstractC8185) interfaceC20288M32967);
            } else {
                abstractC23699 = abstractC23698M52243;
                c12652M10658 = null;
                abstractC23698 = abstractC23698M52242;
            }
        } else {
            abstractC23698 = null;
            abstractC23699 = null;
            c12652M10658 = null;
        }
        C14416 c14416 = this.f68957;
        C23589 c23589M34449 = c14416.m34448(str);
        if (str2 != null) {
            c23589M34448 = c14416.m34448(str2);
        } else {
            c14416.getClass();
            c23589M34448 = null;
        }
        C1717 c1717M41946 = ((C17945) this.f68946).m41946(listOf);
        C13731 c13731 = (C13731) this.f68948;
        if (str4 != null) {
            c7382M33032 = c13731.m33032(str4);
        } else {
            c13731.getClass();
        }
        C0657 c0657 = new C0657(c23589M34449, i, c23589M34448, c1717M41946, c7382M33032, ((C9125) this.f68945).m23499(set), abstractC23698, abstractC23699, collection, c12652M10658);
        this.f68942.m46785(c0657);
        return c0657;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7382 m44616(String str) {
        return ((C13731) this.f68948).m33032(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7382 m44608(String str) {
        if (str != null) {
            return m44616(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11616 m44609(InterfaceC8293 interfaceC8293) {
        if (interfaceC8293 instanceof InterfaceC15347) {
            return m44616(((InterfaceC15347) interfaceC8293).getString());
        }
        if (interfaceC8293 instanceof InterfaceC21699) {
            return this.f68957.m34448(((InterfaceC21699) interfaceC8293).getType());
        }
        if (interfaceC8293 instanceof InterfaceC5471) {
            return this.f68923.m9577((InterfaceC5471) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC18877) {
            return this.f68924.m11615((InterfaceC18877) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC0531) {
            return this.f68928.m16734((InterfaceC0531) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC4060) {
            return this.f68926.m8574((InterfaceC4060) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC19583) {
            return this.f68954.m35848((InterfaceC19583) interfaceC8293);
        }
        throw new IllegalArgumentException("Could not determine type of reference");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44615(boolean z) {
        this.f62664 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0657 m44606(InterfaceC8566 interfaceC8566) {
        try {
            return m44604(interfaceC8566);
        } catch (Throwable th) {
            throw new RuntimeException(C20094.m46315("An error occurred with the class: ", C15472.m36561(1, 1, interfaceC8566.getType())), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[EDGE_INSN: B:37:0x00d2->B:41:0x00da BREAK  A[LOOP:4: B:31:0x00bc->B:82:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C0657 m44604(InterfaceC8566 interfaceC8566) {
        InterfaceC19150 interfaceC19150;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f62664) {
            try {
                for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
                    try {
                        arrayList.add(m44611(interfaceC3627.mo8192(), interfaceC3627.getName(), interfaceC3627.getType(), interfaceC3627.mo11110(), interfaceC3627.mo11109(), interfaceC3627.getAnnotations(), interfaceC3627.mo11111()));
                    } catch (RuntimeException unused) {
                        System.err.println(interfaceC8566.getType());
                    }
                }
            } catch (RuntimeException unused2) {
                System.err.println(interfaceC8566.getType());
            }
            try {
                for (InterfaceC18444 interfaceC18444 : interfaceC8566.getMethods()) {
                    boolean z = true;
                    InterfaceC19150 interfaceC19150M44613 = null;
                    try {
                        interfaceC19150M44613 = m44613(interfaceC18444.mo3570());
                        if (C0459.m2047(interfaceC19150M44613)) {
                            if (interfaceC19150M44613 != null) {
                                InterfaceC18842 interfaceC18842 = C17177.f52643;
                                if (C17177.m40411(interfaceC18444.mo3565(), EnumC15657.STATIC.m36866(interfaceC18444.mo3567())) <= ((C20768) interfaceC19150M44613).f67273) {
                                }
                            }
                            if (interfaceC19150M44613 == null) {
                                if (interfaceC19150M44613 == null) {
                                    z = false;
                                    break;
                                }
                                it = ((C20768) interfaceC19150M44613).f67272.iterator();
                                do {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                } while ((((InterfaceC22677) it.next()).mo3975().f3319 & 2) == 0);
                            } else {
                                try {
                                    C18150.m42257(((C20768) interfaceC19150M44613).f67274);
                                    if (interfaceC19150M44613 == null) {
                                        z = false;
                                        break;
                                    }
                                    it = ((C20768) interfaceC19150M44613).f67272.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                    } while ((((InterfaceC22677) it.next()).mo3975().f3319 & 2) == 0);
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.toString();
                    }
                    if (z) {
                        try {
                            InterfaceC18842 interfaceC18843 = C17177.f52643;
                            C1109 c1109 = new C1109(Math.max(2, C17177.m40411(interfaceC18444.mo3565(), EnumC15657.STATIC.m36866(interfaceC18444.mo3567()))));
                            C23589 c23589M34448 = this.f68957.m34448("Ljava/lang/RuntimeException;");
                            C12321 c12321M9577 = this.f68923.m9577(new C13273("Ljava/lang/RuntimeException;", "<init>", AbstractC14545.of()));
                            c1109.m3808(new C10927(EnumC0841.f3221, 0, c23589M34448));
                            c1109.m3808(new C1048(EnumC0841.f3141, 1, 0, 0, 0, 0, 0, c12321M9577));
                            c1109.m3808(new C22981(0, EnumC0841.f3128));
                            interfaceC19150 = c1109;
                        } catch (RuntimeException unused4) {
                        }
                    } else {
                        interfaceC19150 = interfaceC19150M44613;
                    }
                    arrayList2.add(m44607(interfaceC18444.mo3566(), interfaceC18444.getName(), interfaceC18444.getParameters(), interfaceC18444.mo3568(), interfaceC18444.mo3567(), interfaceC18444.getAnnotations(), interfaceC18444.mo3569(), interfaceC19150));
                }
            } catch (RuntimeException unused5) {
                System.err.println(interfaceC8566.getType());
            }
        } else {
            for (InterfaceC3627 interfaceC3628 : interfaceC8566.getFields()) {
                arrayList.add(m44611(interfaceC3628.mo8192(), interfaceC3628.getName(), interfaceC3628.getType(), interfaceC3628.mo11110(), interfaceC3628.mo11109(), interfaceC3628.getAnnotations(), interfaceC3628.mo11111()));
            }
            for (InterfaceC18444 interfaceC18445 : interfaceC8566.getMethods()) {
                arrayList2.add(m44607(interfaceC18445.mo3566(), interfaceC18445.getName(), interfaceC18445.getParameters(), interfaceC18445.mo3568(), interfaceC18445.mo3567(), interfaceC18445.getAnnotations(), interfaceC18445.mo3569(), m44613(interfaceC18445.mo3570())));
            }
        }
        return m44605(interfaceC8566.getType(), interfaceC8566.mo2700(), interfaceC8566.mo2695(), interfaceC8566.mo2699(), interfaceC8566.mo2694(), interfaceC8566.getAnnotations(), arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19150 m44613(InterfaceC19150 interfaceC19150) {
        if (interfaceC19150 == null) {
            return null;
        }
        int iMo3818 = interfaceC19150.mo3818();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f62664;
        for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
            if (interfaceC22677 instanceof InterfaceC0804) {
                ((InterfaceC0804) interfaceC22677).mo3030(this);
            }
            if (z) {
                AbstractC9617 abstractC9617 = (AbstractC9617) interfaceC22677;
                EnumC0841 enumC0841 = abstractC9617.f29162;
                if ((enumC0841.f3319 & 2) != 0) {
                    switch (C3834.f12249[enumC0841.ordinal()]) {
                        case 1:
                            abstractC9617.f29162 = EnumC0841.f3050;
                            break;
                        case 2:
                            abstractC9617.f29162 = EnumC0841.f3158;
                            break;
                        case 3:
                            abstractC9617.f29162 = EnumC0841.f3069;
                            break;
                        case 4:
                            abstractC9617.f29162 = EnumC0841.f3055;
                            break;
                        case 5:
                            abstractC9617.f29162 = EnumC0841.f3074;
                            break;
                        case 6:
                            abstractC9617.f29162 = EnumC0841.f3198;
                            break;
                        case 7:
                            abstractC9617.f29162 = EnumC0841.f3279;
                            break;
                        case 8:
                            abstractC9617.f29162 = EnumC0841.f3217;
                            break;
                        case 9:
                            abstractC9617.f29162 = EnumC0841.f3275;
                            break;
                        case 10:
                            abstractC9617.f29162 = EnumC0841.f3141;
                            break;
                        case 11:
                            abstractC9617.f29162 = EnumC0841.f3249;
                            break;
                        case 12:
                            abstractC9617.f29162 = EnumC0841.f3249;
                            break;
                    }
                }
            }
            if (interfaceC22677 != null) {
                arrayList.add(interfaceC22677);
            }
        }
        List<InterfaceC5038> listMo3811 = interfaceC19150.mo3811();
        ArrayList arrayList3 = new ArrayList(listMo3811.size());
        for (InterfaceC5038 interfaceC5038 : listMo3811) {
            int iMo14555 = interfaceC5038.mo14555();
            int iMo14557 = interfaceC5038.mo14557();
            List<InterfaceC2216> listMo14556 = interfaceC5038.mo14556();
            ArrayList arrayList4 = new ArrayList(listMo14556.size());
            for (InterfaceC2216 interfaceC2216 : listMo14556) {
                String strMo7393 = interfaceC2216.mo7393();
                arrayList4.add(new C8773(strMo7393 == null ? null : this.f68957.m34448(strMo7393), interfaceC2216.mo7391()));
            }
            arrayList3.add(new C9479(arrayList4, iMo14555, iMo14557));
        }
        for (InterfaceC7860 interfaceC7860 : interfaceC19150.mo3812()) {
            int iMo8424 = interfaceC7860.mo8424();
            if (!this.f62667 || iMo8424 != 9) {
                if (!this.f62665 || iMo8424 != 10) {
                    if (!this.f62666 || (iMo8424 != 7 && iMo8424 != 8)) {
                        if (!this.f62661 || (iMo8424 != 3 && iMo8424 != 6 && iMo8424 != 5)) {
                            if (interfaceC7860 instanceof InterfaceC0804) {
                                ((InterfaceC0804) interfaceC7860).mo3030(this);
                            }
                            arrayList2.add(interfaceC7860);
                        }
                    }
                }
            }
        }
        return new C20768(iMo3818, arrayList, arrayList3, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14062 m44610(InterfaceC10410 interfaceC10410) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 == 0) {
            return new C6302(((InterfaceC3354) interfaceC10410).getValue());
        }
        if (iMo2302 == 6) {
            return new C17966(((InterfaceC7587) interfaceC10410).getValue());
        }
        if (iMo2302 == 2) {
            return new C20789(((InterfaceC18213) interfaceC10410).getValue());
        }
        if (iMo2302 == 3) {
            return new C11947(((InterfaceC13231) interfaceC10410).getValue());
        }
        if (iMo2302 == 4) {
            return new C16554(((InterfaceC13936) interfaceC10410).getValue());
        }
        if (iMo2302 == 16) {
            return new C10911(((InterfaceC23109) interfaceC10410).getValue());
        }
        if (iMo2302 == 17) {
            return new C23235(((InterfaceC12526) interfaceC10410).getValue());
        }
        C3855 c3855 = this.f68924;
        C14416 c14416 = this.f68957;
        switch (iMo2302) {
            case 21:
                return new C23610(this.f68928.m16734(((InterfaceC16801) interfaceC10410).getValue()));
            case 22:
                return new C14437(this.f68954.m35848(((InterfaceC11158) interfaceC10410).getValue()));
            case 23:
                return new C9500(((C13731) this.f68948).m33032(((InterfaceC17507) interfaceC10410).getValue()));
            case 24:
                return new C8794(c14416.m34448(((InterfaceC14684) interfaceC10410).getValue()));
            case 25:
                return new C1738(c3855.m11615(((InterfaceC11821) interfaceC10410).getValue()));
            case 26:
                return new C17260(this.f68923.m9577(((InterfaceC1985) interfaceC10410).getValue()));
            case 27:
                return new C7713(c3855.m11615(((InterfaceC6176) interfaceC10410).getValue()));
            case 28:
                return new C12652(AbstractC14545.m34732(C4648.m13611(((InterfaceC20288) interfaceC10410).getValue().iterator(), new C2423(this))));
            case 29:
                InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
                return new C13357(c14416.m34448(interfaceC22404.getType()), AbstractC6079.m16989(C4648.m13611(interfaceC22404.getElements().iterator(), new C15827(this))));
            case 30:
                return C6677.f20741;
            case 31:
                return ((InterfaceC4765) interfaceC10410).getValue() ? C10536.f31603 : C10536.f31604;
            default:
                throw new C15431(null, "Unexpected encoded value type: %d", Integer.valueOf(interfaceC10410.mo2302()));
        }
    }
}
