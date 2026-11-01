package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20765 extends AbstractC22717 {

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f65274;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f65275;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f65276;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f65277;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f65278;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f65279;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f65280;

    @Override // p067l.AbstractC22717
    /* JADX INFO: renamed from: ֫ */
    public final void mo46908(C3270 c3270, Object obj) {
        InterfaceC15733 interfaceC15733 = (InterfaceC15733) obj;
        int iMo4670 = interfaceC15733.mo4670();
        if (iMo4670 == 0) {
            c3270.m52042(((InterfaceC5556) interfaceC15733).getValue());
            return;
        }
        if (iMo4670 == 6) {
            c3270.m52047(((InterfaceC9579) interfaceC15733).getValue());
            return;
        }
        if (iMo4670 == 2) {
            c3270.m52057(((InterfaceC19678) interfaceC15733).getValue());
            return;
        }
        if (iMo4670 == 3) {
            c3270.m52043(((InterfaceC14943) interfaceC15733).getValue());
            return;
        }
        if (iMo4670 == 4) {
            c3270.m52046(((InterfaceC15613) interfaceC15733).getValue());
            return;
        }
        if (iMo4670 == 16) {
            c3270.m52045(((InterfaceC24331) interfaceC15733).getValue());
            return;
        }
        if (iMo4670 == 17) {
            c3270.m52044(((InterfaceC14273) interfaceC15733).getValue());
            return;
        }
        switch (iMo4670) {
            case 21:
                c3270.m52051(((C24807) interfaceC15733).f79273);
                return;
            case 22:
                c3270.m52053(((C16089) interfaceC15733).f47346);
                return;
            case 23:
                c3270.m52049(((C11397) interfaceC15733).f31785);
                return;
            case 24:
                c3270.m52054(((C10726) interfaceC15733).f29709);
                return;
            case 25:
                c3270.m52058(((C4020) interfaceC15733).f8788);
                return;
            case 26:
                c3270.m52050(((C18772) interfaceC15733).f56094);
                return;
            case 27:
                c3270.m52052(((C9699) interfaceC15733).f26739);
                return;
            case 28:
                c3270.m52048(((C14393) interfaceC15733).f41135);
                return;
            case 29:
                C15063 c15063 = (C15063) interfaceC15733;
                c3270.m52055(c15063.f42995, c15063.f42994);
                return;
            case 30:
                c3270.m52041();
                return;
            case 31:
                c3270.m52056(((InterfaceC6897) interfaceC15733).getValue());
                return;
            default:
                throw new C17034(null, "Unrecognized value type: %d", Integer.valueOf(interfaceC15733.mo4670()));
        }
    }

    public C20765(C9873 c9873) {
        super(c9873);
        this.f65277 = false;
    }

    @Override // p067l.AbstractC22717
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo46911() {
        return !this.f65276 && super.mo46911();
    }

    @Override // p067l.AbstractC22717
    /* JADX INFO: renamed from: ֫ */
    public final C20094 mo46906() {
        return new C20094(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17430 m46905(String str, String str2, String str3, int i, InterfaceC12262 interfaceC12262, Set set, Set set2) {
        C6032 c6032 = this.f71622;
        c6032.getClass();
        return new C17430(c6032.m13551(new C21690(str, str2, str3)), i, interfaceC12262 == null ? null : m46904(interfaceC12262), ((C11041) this.f71643).m25450(set), set2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3349 m46901(String str, String str2, List list, String str3, int i, Set set, Set set2, InterfaceC20568 interfaceC20568) {
        AbstractC16192 abstractC16192M36881;
        List listM36872of = list == null ? AbstractC16192.m36872of() : list;
        C5361 c5361 = this.f71621;
        c5361.getClass();
        C14078 c14078M11620 = c5361.m11620(new C6702(str, str2, str3, listM36872of));
        if (listM36872of == null) {
            abstractC16192M36881 = AbstractC16192.m36872of();
        } else {
            abstractC16192M36881 = AbstractC16192.m36881(C6786.m15486(listM36872of.iterator(), new C8694(this)));
        }
        return new C3349(c14078M11620, abstractC16192M36881, i, ((C11041) this.f71643).m25450(set), set2, interfaceC20568);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2993 m46899(String str, int i, String str2, List list, String str3, Set set, ArrayList arrayList, Collection collection) {
        AbstractC24891 abstractC24891;
        AbstractC24891 abstractC24892;
        C14393 c14393M12653;
        C24787 c24787M36581;
        List listM36872of = list;
        C9384 c9384M35146 = null;
        String str4 = this.f65280 ? null : str3;
        if (listM36872of == null) {
            listM36872of = AbstractC16192.m36872of();
        } else {
            HashSet hashSet = new HashSet(listM36872of);
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
            AbstractC24891 abstractC24891M54646 = AbstractC24891.m54646(C10810.m24925(arrayList, C15812.f45782));
            AbstractC24891 abstractC24891M54647 = AbstractC24891.m54646(C10810.m24925(arrayList, C15812.f45781));
            InterfaceC21650 interfaceC21650M35081 = C15398.m35081(abstractC24891M54646);
            if (interfaceC21650M35081 != null) {
                abstractC24892 = abstractC24891M54647;
                abstractC24891 = abstractC24891M54646;
                c14393M12653 = this.f71648.m12653((AbstractC10147) interfaceC21650M35081);
            } else {
                abstractC24892 = abstractC24891M54647;
                c14393M12653 = null;
                abstractC24891 = abstractC24891M54646;
            }
        } else {
            abstractC24891 = null;
            abstractC24892 = null;
            c14393M12653 = null;
        }
        C16069 c16069 = this.f71655;
        C24787 c24787M36582 = c16069.m36581(str);
        if (str2 != null) {
            c24787M36581 = c16069.m36581(str2);
        } else {
            c16069.getClass();
            c24787M36581 = null;
        }
        C4000 c4000M44195 = ((C19423) this.f71644).m44195(listM36872of);
        C15418 c15418 = (C15418) this.f71646;
        if (str4 != null) {
            c9384M35146 = c15418.m35146(str4);
        } else {
            c15418.getClass();
        }
        C2993 c2993 = new C2993(c24787M36582, i, c24787M36581, c4000M44195, c9384M35146, ((C11041) this.f71643).m25450(set), abstractC24891, abstractC24892, collection, c14393M12653);
        this.f71640.m49108(c2993);
        return c2993;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9384 m46910(String str) {
        return ((C15418) this.f71646).m35146(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9384 m46902(String str) {
        if (str != null) {
            return m46910(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13408 m46903(InterfaceC10250 interfaceC10250) {
        if (interfaceC10250 instanceof InterfaceC16954) {
            return m46910(((InterfaceC16954) interfaceC10250).getString());
        }
        if (interfaceC10250 instanceof InterfaceC22991) {
            return this.f71655.m36581(((InterfaceC22991) interfaceC10250).getType());
        }
        if (interfaceC10250 instanceof InterfaceC7568) {
            return this.f71621.m11620((InterfaceC7568) interfaceC10250);
        }
        if (interfaceC10250 instanceof InterfaceC20309) {
            return this.f71622.m13551((InterfaceC20309) interfaceC10250);
        }
        if (interfaceC10250 instanceof InterfaceC2873) {
            return this.f71626.m18660((InterfaceC2873) interfaceC10250);
        }
        if (interfaceC10250 instanceof InterfaceC6227) {
            return this.f71624.m10637((InterfaceC6227) interfaceC10250);
        }
        if (interfaceC10250 instanceof InterfaceC20980) {
            return this.f71652.m38006((InterfaceC20980) interfaceC10250);
        }
        throw new IllegalArgumentException("Could not determine type of reference");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46909(boolean z) {
        this.f65277 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2993 m46900(InterfaceC10509 interfaceC10509) {
        try {
            return m46898(interfaceC10509);
        } catch (Throwable th) {
            throw new RuntimeException(C21466.m48631("An error occurred with the class: ", C17073.m38720(1, 1, interfaceC10509.getType())), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #3 {all -> 0x00d6, blocks: (B:18:0x0078, B:27:0x00a8, B:30:0x00b3, B:31:0x00bc, B:33:0x00c2, B:23:0x008a), top: B:64:0x0078, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[EDGE_INSN: B:37:0x00d2->B:41:0x00da BREAK  A[LOOP:4: B:31:0x00bc->B:82:?]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    private C2993 m46898(InterfaceC10509 interfaceC10509) {
        InterfaceC20568 interfaceC20568;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.f65277) {
            try {
                for (InterfaceC5815 interfaceC5815 : interfaceC10509.getFields()) {
                    try {
                        arrayList.add(m46905(interfaceC5815.mo10231(), interfaceC5815.getName(), interfaceC5815.getType(), interfaceC5815.mo13086(), interfaceC5815.mo13085(), interfaceC5815.getAnnotations(), interfaceC5815.mo13087()));
                    } catch (RuntimeException unused) {
                        System.err.println(interfaceC10509.getType());
                    }
                }
            } catch (RuntimeException unused2) {
                System.err.println(interfaceC10509.getType());
            }
            try {
                for (InterfaceC19897 interfaceC19897 : interfaceC10509.getMethods()) {
                    boolean z = true;
                    InterfaceC20568 interfaceC20568M46907 = null;
                    try {
                        interfaceC20568M46907 = m46907(interfaceC19897.mo5857());
                        if (C2805.m4427(interfaceC20568M46907)) {
                            if (interfaceC20568M46907 != null) {
                                InterfaceC20276 interfaceC20276 = C18693.f55824;
                                if (C18693.m42656(interfaceC19897.mo5852(), EnumC17248.STATIC.m39032(interfaceC19897.mo5854())) <= ((C22106) interfaceC20568M46907).f69957) {
                                }
                            }
                            if (interfaceC20568M46907 == null) {
                                if (interfaceC20568M46907 == null) {
                                    z = false;
                                    break;
                                }
                                it = ((C22106) interfaceC20568M46907).f69956.iterator();
                                do {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                } while ((((InterfaceC23920) it.next()).mo6217().f6093 & 2) == 0);
                            } else {
                                try {
                                    C19618.m44518(((C22106) interfaceC20568M46907).f69958);
                                    if (interfaceC20568M46907 == null) {
                                        z = false;
                                        break;
                                    }
                                    it = ((C22106) interfaceC20568M46907).f69956.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            z = false;
                                            break;
                                        }
                                    } while ((((InterfaceC23920) it.next()).mo6217().f6093 & 2) == 0);
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.toString();
                    }
                    if (z) {
                        try {
                            InterfaceC20276 interfaceC20277 = C18693.f55824;
                            C3422 c3422 = new C3422(Math.max(2, C18693.m42656(interfaceC19897.mo5852(), EnumC17248.STATIC.m39032(interfaceC19897.mo5854()))));
                            C24787 c24787M36581 = this.f71655.m36581("Ljava/lang/RuntimeException;");
                            C14078 c14078M11620 = this.f71621.m11620(new C14983("Ljava/lang/RuntimeException;", "<init>", AbstractC16192.m36872of()));
                            c3422.m6065(new C12753(EnumC3167.f5995, 0, c24787M36581));
                            c3422.m6065(new C3364(EnumC3167.f5915, 1, 0, 0, 0, 0, 0, c14078M11620));
                            c3422.m6065(new C24209(0, EnumC3167.f5902));
                            interfaceC20568 = c3422;
                        } catch (RuntimeException unused4) {
                        }
                    } else {
                        interfaceC20568 = interfaceC20568M46907;
                    }
                    arrayList2.add(m46901(interfaceC19897.mo5853(), interfaceC19897.getName(), interfaceC19897.getParameters(), interfaceC19897.mo5855(), interfaceC19897.mo5854(), interfaceC19897.getAnnotations(), interfaceC19897.mo5856(), interfaceC20568));
                }
            } catch (RuntimeException unused5) {
                System.err.println(interfaceC10509.getType());
            }
        } else {
            for (InterfaceC5815 interfaceC5816 : interfaceC10509.getFields()) {
                arrayList.add(m46905(interfaceC5816.mo10231(), interfaceC5816.getName(), interfaceC5816.getType(), interfaceC5816.mo13086(), interfaceC5816.mo13085(), interfaceC5816.getAnnotations(), interfaceC5816.mo13087()));
            }
            for (InterfaceC19897 interfaceC19898 : interfaceC10509.getMethods()) {
                arrayList2.add(m46901(interfaceC19898.mo5853(), interfaceC19898.getName(), interfaceC19898.getParameters(), interfaceC19898.mo5855(), interfaceC19898.mo5854(), interfaceC19898.getAnnotations(), interfaceC19898.mo5856(), m46907(interfaceC19898.mo5857())));
            }
        }
        return m46899(interfaceC10509.getType(), interfaceC10509.mo5039(), interfaceC10509.mo5034(), interfaceC10509.mo5038(), interfaceC10509.mo5033(), interfaceC10509.getAnnotations(), arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20568 m46907(InterfaceC20568 interfaceC20568) {
        if (interfaceC20568 == null) {
            return null;
        }
        int iMo6075 = interfaceC20568.mo6075();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f65277;
        for (InterfaceC23920 interfaceC23920 : interfaceC20568.mo6074()) {
            if (interfaceC23920 instanceof InterfaceC3132) {
                ((InterfaceC3132) interfaceC23920).mo5343(this);
            }
            if (z) {
                AbstractC11508 abstractC11508 = (AbstractC11508) interfaceC23920;
                EnumC3167 enumC3167 = abstractC11508.f32110;
                if ((enumC3167.f6093 & 2) != 0) {
                    switch (C6012.f15057[enumC3167.ordinal()]) {
                        case 1:
                            abstractC11508.f32110 = EnumC3167.f5824;
                            break;
                        case 2:
                            abstractC11508.f32110 = EnumC3167.f5932;
                            break;
                        case 3:
                            abstractC11508.f32110 = EnumC3167.f5843;
                            break;
                        case 4:
                            abstractC11508.f32110 = EnumC3167.f5829;
                            break;
                        case 5:
                            abstractC11508.f32110 = EnumC3167.f5848;
                            break;
                        case 6:
                            abstractC11508.f32110 = EnumC3167.f5972;
                            break;
                        case 7:
                            abstractC11508.f32110 = EnumC3167.f6053;
                            break;
                        case 8:
                            abstractC11508.f32110 = EnumC3167.f5991;
                            break;
                        case 9:
                            abstractC11508.f32110 = EnumC3167.f6049;
                            break;
                        case 10:
                            abstractC11508.f32110 = EnumC3167.f5915;
                            break;
                        case 11:
                            abstractC11508.f32110 = EnumC3167.f6023;
                            break;
                        case 12:
                            abstractC11508.f32110 = EnumC3167.f6023;
                            break;
                    }
                }
            }
            if (interfaceC23920 != null) {
                arrayList.add(interfaceC23920);
            }
        }
        List<InterfaceC7156> listMo6068 = interfaceC20568.mo6068();
        ArrayList arrayList3 = new ArrayList(listMo6068.size());
        for (InterfaceC7156 interfaceC7156 : listMo6068) {
            int iMo16459 = interfaceC7156.mo16459();
            int iMo16461 = interfaceC7156.mo16461();
            List<InterfaceC4474> listMo16460 = interfaceC7156.mo16460();
            ArrayList arrayList4 = new ArrayList(listMo16460.size());
            for (InterfaceC4474 interfaceC4474 : listMo16460) {
                String strMo9476 = interfaceC4474.mo9476();
                arrayList4.add(new C10706(strMo9476 == null ? null : this.f71655.m36581(strMo9476), interfaceC4474.mo9474()));
            }
            arrayList3.add(new C11377(arrayList4, iMo16459, iMo16461));
        }
        for (InterfaceC9838 interfaceC9838 : interfaceC20568.mo6069()) {
            int iMo10470 = interfaceC9838.mo10470();
            if (!this.f65280 || iMo10470 != 9) {
                if (!this.f65278 || iMo10470 != 10) {
                    if (!this.f65279 || (iMo10470 != 7 && iMo10470 != 8)) {
                        if (!this.f65274 || (iMo10470 != 3 && iMo10470 != 6 && iMo10470 != 5)) {
                            if (interfaceC9838 instanceof InterfaceC3132) {
                                ((InterfaceC3132) interfaceC9838).mo5343(this);
                            }
                            arrayList2.add(interfaceC9838);
                        }
                    }
                }
            }
        }
        return new C22106(iMo6075, arrayList, arrayList3, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15733 m46904(InterfaceC12262 interfaceC12262) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 == 0) {
            return new C8358(((InterfaceC5556) interfaceC12262).getValue());
        }
        if (iMo4670 == 6) {
            return new C19443(((InterfaceC9579) interfaceC12262).getValue());
        }
        if (iMo4670 == 2) {
            return new C22126(((InterfaceC19678) interfaceC12262).getValue());
        }
        if (iMo4670 == 3) {
            return new C13723(((InterfaceC14943) interfaceC12262).getValue());
        }
        if (iMo4670 == 4) {
            return new C18101(((InterfaceC15613) interfaceC12262).getValue());
        }
        if (iMo4670 == 16) {
            return new C12738(((InterfaceC24331) interfaceC12262).getValue());
        }
        if (iMo4670 == 17) {
            return new C24451(((InterfaceC14273) interfaceC12262).getValue());
        }
        C6032 c6032 = this.f71622;
        C16069 c16069 = this.f71655;
        switch (iMo4670) {
            case 21:
                return new C24807(this.f71626.m18660(((InterfaceC18336) interfaceC12262).getValue()));
            case 22:
                return new C16089(this.f71652.m38006(((InterfaceC12973) interfaceC12262).getValue()));
            case 23:
                return new C11397(((C15418) this.f71646).m35146(((InterfaceC19007) interfaceC12262).getValue()));
            case 24:
                return new C10726(c16069.m36581(((InterfaceC16324) interfaceC12262).getValue()));
            case 25:
                return new C4020(c6032.m13551(((InterfaceC13603) interfaceC12262).getValue()));
            case 26:
                return new C18772(this.f71621.m11620(((InterfaceC4255) interfaceC12262).getValue()));
            case 27:
                return new C9699(c6032.m13551(((InterfaceC8238) interfaceC12262).getValue()));
            case 28:
                return new C14393(AbstractC16192.m36881(C6786.m15486(((InterfaceC21650) interfaceC12262).getValue().iterator(), new C4671(this))));
            case 29:
                InterfaceC23661 interfaceC23661 = (InterfaceC23661) interfaceC12262;
                return new C15063(c16069.m36581(interfaceC23661.getType()), AbstractC8146.m18920(C6786.m15486(interfaceC23661.getElements().iterator(), new C17410(this))));
            case 30:
                return C8714.f23616;
            case 31:
                return ((InterfaceC6897) interfaceC12262).getValue() ? C12382.f34567 : C12382.f34568;
            default:
                throw new C17034(null, "Unexpected encoded value type: %d", Integer.valueOf(interfaceC12262.mo4670()));
        }
    }
}
