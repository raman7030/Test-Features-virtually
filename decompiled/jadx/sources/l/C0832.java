package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBGE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0832 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f3007 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3008;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20630 f3009;

    public C0832(C20630 c20630) {
        this.f3009 = c20630;
        this.f3008 = c20630.m47186();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m3101(C21480 c21480) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3007;
            if (i >= arrayList.size() || ((C0126) arrayList.get(i)).f1238.get(c21480.m48652())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC14278 m3102(AbstractC14278 abstractC14278) {
        return (AbstractC14278) C18566.m43105(((C16395) this.f3009.m47190().get(abstractC14278.m34044().m38624().nextSetBit(0))).m38615(), 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC14278 m3109(AbstractC14278 abstractC14278) {
        return (AbstractC14278) ((C16395) this.f3009.m47190().get(abstractC14278.m34044().m38604().nextSetBit(0))).m38615().get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3107(C20630 c20630) {
        Iterator it;
        C0832 c0832 = new C0832(c20630);
        c20630.m47191(new C19178(c0832));
        ArrayList<C0126> arrayList = c0832.f3007;
        for (C0126 c0126 : arrayList) {
            if (c0126.f1235 != EnumC5066.NONE) {
                for (C0126 c0127 : c0126.f1234) {
                    if (c0126.f1235.compareTo(c0127.f1235) > 0) {
                        c0127.f1235 = c0126.f1235;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0126 c0128 = (C0126) it2.next();
            if (c0128.f1237 && c0128.f1235 == EnumC5066.NONE) {
                int i = 0;
                int iNextSetBit = c0128.f1238.nextSetBit(0);
                AbstractC14278 abstractC14278M47194 = c20630.m47194(iNextSetBit);
                AbstractC14278 abstractC14278M3102 = c0832.m3102(abstractC14278M47194);
                int iMo2231 = ((AbstractC1223) abstractC14278M3102.mo29535().m41004get(0).m48637()).mo2231();
                ArrayList arrayList2 = new ArrayList(iMo2231);
                HashSet hashSet = new HashSet();
                C7573 type = abstractC14278M47194.m34042().getType();
                for (int i2 = 0; i2 < iMo2231; i2++) {
                    AbstractC1223 abstractC1223M28867 = C11807.m28867(type.m20310());
                    C21480 c21480M48631 = C21480.m48631(c20630.m47193(), abstractC1223M28867);
                    arrayList2.add(c21480M48631);
                    c0832.m3105(abstractC14278M47194, C20069.f65002, c21480M48631, 5, abstractC1223M28867);
                }
                hashSet.add(abstractC14278M3102);
                hashSet.add(abstractC14278M47194);
                for (AbstractC14278 abstractC14278 : c20630.m47199(iNextSetBit)) {
                    int size = arrayList2.size();
                    int iM9562 = abstractC14278.mo29537().m9562();
                    if (iM9562 != 34) {
                        if (iM9562 == 57) {
                            ArrayList arrayListM47475 = ((C20775) abstractC14278.mo29542()).m47475();
                            int i3 = 0;
                            while (i3 < size) {
                                C21480 c21480M48632 = C21480.m48631(((C21480) arrayList2.get(i3)).m48652(), (InterfaceC1538) arrayListM47475.get(i3));
                                C20069 c20069 = C20069.f65002;
                                AbstractC13717 abstractC13717 = (AbstractC13717) arrayListM47475.get(i3);
                                ArrayList arrayList3 = arrayListM47475;
                                int i4 = i3;
                                c0832.m3105(abstractC14278, c20069, c21480M48632, 5, abstractC13717);
                                arrayList2.set(i4, c21480M48632);
                                i3 = i4 + 1;
                                arrayListM47475 = arrayList3;
                                it2 = it2;
                            }
                        } else if (iM9562 == 38) {
                            AbstractC14278 abstractC14278M3109 = c0832.m3109(abstractC14278);
                            C20069 c20069Mo29535 = abstractC14278.mo29535();
                            int iMo2232 = ((AbstractC1223) c20069Mo29535.m41004get(1).m48637()).mo2231();
                            if (iMo2232 < size) {
                                C21480 c21480 = (C21480) arrayList2.get(iMo2232);
                                c0832.m3105(abstractC14278M3109, C20069.m46252(c21480), c21480.m48646(abstractC14278M3109.m34042().m48652()), 2, null);
                            } else {
                                c0832.m3106(abstractC14278M3109, c20069Mo29535.m41004get(1), hashSet);
                                hashSet.add((AbstractC14278) abstractC14278M3109.m34044().m38615().get(2));
                            }
                            hashSet.add(abstractC14278M3109);
                        } else if (iM9562 == 39) {
                            C20069 c20069Mo29536 = abstractC14278.mo29535();
                            int iMo2233 = ((AbstractC1223) c20069Mo29536.m41004get(2).m48637()).mo2231();
                            if (iMo2233 < size) {
                                C21480 c21480M41004get = c20069Mo29536.m41004get(i);
                                C21480 c21480M48646 = c21480M41004get.m48646(((C21480) arrayList2.get(iMo2233)).m48652());
                                c0832.m3105(abstractC14278, C20069.m46252(c21480M41004get), c21480M48646, 2, null);
                                arrayList2.set(iMo2233, c21480M48646.m48648());
                            } else {
                                c0832.m3106(abstractC14278, c20069Mo29536.m41004get(2), hashSet);
                            }
                        }
                        it = it2;
                    } else {
                        it = it2;
                        Object objM48637 = abstractC14278M3102.mo29535().m41004get(0).m48637();
                        AbstractC14278 abstractC14278M31010 = c0832.m3109(abstractC14278);
                        c0832.m3105(abstractC14278M31010, C20069.f65002, abstractC14278M31010.m34042(), 5, (AbstractC13717) objM48637);
                        hashSet.add(abstractC14278M31010);
                    }
                    hashSet.add(abstractC14278);
                    it2 = it;
                    i = 0;
                }
                Iterator it3 = it2;
                c20630.m47175(hashSet);
                c20630.m47184();
                int i5 = c0832.f3008;
                C17807.m41738(i5, c20630);
                for (int i6 = 0; i6 < c20630.m47186(); i6++) {
                    AbstractC14278 abstractC14278M47195 = c20630.m47194(i6);
                    if (abstractC14278M47195 != null && abstractC14278M47195.mo29537() != null && abstractC14278M47195.mo29537().m9562() == 2) {
                        ArrayList[] arrayListArrM47201 = c20630.m47201();
                        C21480 c21480M41004get2 = abstractC14278M47195.mo29535().m41004get(0);
                        C21480 c21480M34042 = abstractC14278M47195.m34042();
                        if (c21480M41004get2.m48652() >= i5 || c21480M34042.m48652() >= i5) {
                            C3655 c3655 = new C3655(c0832, c21480M34042, c21480M41004get2);
                            Iterator it4 = arrayListArrM47201[c21480M34042.m48652()].iterator();
                            while (it4.hasNext()) {
                                ((AbstractC14278) it4.next()).mo29539(c3655);
                            }
                        }
                    }
                }
                it2 = it3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3103(C0832 c0832, C12122 c12122) {
        C0126 c0126;
        C21480 c21480M41004get;
        int iM3101;
        int i = c0832.f3008;
        ArrayList arrayList = c0832.f3007;
        int iM9562 = c12122.mo29537().m9562();
        C21480 c21480M34042 = c12122.m34042();
        if (iM9562 != 56 || c21480M34042.m48637().mo5255() != 9) {
            if (iM9562 == 3 && c21480M34042.m48637().mo5255() == 9) {
                C0126 c0127 = new C0126(c21480M34042.m48652(), i, EnumC5066.NONE);
                arrayList.add(c0127);
                c0832.m3108(c21480M34042, c0127);
                return;
            } else {
                if (iM9562 == 55 && c21480M34042.m48637().mo5255() == 9) {
                    C0126 c0128 = new C0126(c21480M34042.m48652(), i, EnumC5066.NONE);
                    arrayList.add(c0128);
                    c0832.m3108(c21480M34042, c0128);
                    return;
                }
                return;
            }
        }
        C21480 c21480M34043 = c12122.m34042();
        AbstractC14278 abstractC14278M3102 = c0832.m3102(c12122);
        int iM9563 = abstractC14278M3102.mo29537().m9562();
        if (iM9563 == 5) {
            c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.NONE);
            arrayList.add(c0126);
        } else if (iM9563 == 38 || iM9563 == 45) {
            c21480M41004get = abstractC14278M3102.mo29535().m41004get(0);
            iM3101 = c0832.m3101(c21480M41004get);
            if (iM3101 != arrayList.size()) {
                c0126 = (C0126) arrayList.get(iM3101);
                c0126.f1238.set(c21480M34043.m48652());
            } else {
                if (c21480M41004get.getType() == C7573.f23417) {
                    c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.NONE);
                } else {
                    c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.GLOBAL);
                }
                arrayList.add(c0126);
            }
        } else {
            if (iM9563 != 46) {
                switch (iM9563) {
                    case 40:
                        c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.NONE);
                        break;
                    case 41:
                    case 42:
                        if (abstractC14278M3102.mo29535().m41004get(0).m48637().mo5253()) {
                            c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.NONE);
                            c0126.f1237 = true;
                        } else {
                            c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.GLOBAL);
                        }
                        break;
                    case 43:
                        c21480M41004get = abstractC14278M3102.mo29535().m41004get(0);
                        iM3101 = c0832.m3101(c21480M41004get);
                        if (iM3101 != arrayList.size()) {
                            c0126 = (C0126) arrayList.get(iM3101);
                            c0126.f1238.set(c21480M34043.m48652());
                        } else if (c21480M41004get.getType() == C7573.f23417) {
                            c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.NONE);
                        } else {
                            c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.GLOBAL);
                        }
                        break;
                    default:
                        c0126 = null;
                        break;
                }
            } else {
                c0126 = new C0126(c21480M34043.m48652(), i, EnumC5066.GLOBAL);
            }
            arrayList.add(c0126);
        }
        c0832.m3108(c21480M34042, c0126);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3108(C21480 c21480, C0126 c0126) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c21480);
        while (!arrayList.isEmpty()) {
            C21480 c21481 = (C21480) C4248.m12790(arrayList, 1);
            for (AbstractC14278 abstractC14278 : this.f3009.m47199(c21481.m48652())) {
                C3135 c3135Mo29537 = abstractC14278.mo29537();
                ArrayList arrayList2 = this.f3007;
                if (c3135Mo29537 == null) {
                    int iM3101 = m3101(abstractC14278.m34042());
                    if (iM3101 != arrayList2.size()) {
                        C0126 c0127 = (C0126) arrayList2.get(iM3101);
                        if (c0127 != c0126) {
                            c0126.f1237 = false;
                            c0126.f1238.or(c0127.f1238);
                            if (c0126.f1235.compareTo(c0127.f1235) < 0) {
                                c0126.f1235 = c0127.f1235;
                            }
                            for (C0126 c0128 : c0127.f1236) {
                                c0128.f1234.remove(c0127);
                                c0128.f1234.add(c0126);
                                c0126.f1236.add(c0128);
                            }
                            for (C0126 c0129 : c0127.f1234) {
                                c0129.f1236.remove(c0127);
                                c0129.f1236.add(c0126);
                                c0126.f1234.add(c0129);
                            }
                            arrayList2.remove(iM3101);
                        }
                    } else {
                        c0126.f1238.set(abstractC14278.m34042().m48652());
                        arrayList.add(abstractC14278.m34042());
                    }
                } else {
                    int iM9562 = abstractC14278.mo29537().m9562();
                    if (iM9562 != 2) {
                        if (iM9562 != 33 && iM9562 != 35) {
                            if (iM9562 == 43 || iM9562 == 7 || iM9562 == 8) {
                                EnumC5066 enumC5066 = c0126.f1235;
                                EnumC5066 enumC5067 = EnumC5066.METHOD;
                                if (enumC5066.compareTo(enumC5067) < 0) {
                                    c0126.f1235 = enumC5067;
                                }
                            } else if (iM9562 != 38) {
                                if (iM9562 != 39) {
                                    switch (iM9562) {
                                        case 47:
                                            break;
                                        case 48:
                                            c0126.f1235 = EnumC5066.GLOBAL;
                                            break;
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                    }
                                } else if (!abstractC14278.mo29535().m41004get(2).m48637().mo5253()) {
                                    c0126.f1237 = false;
                                }
                                if (abstractC14278.mo29535().m41004get(0).m48637().mo5255() == 9) {
                                    c0126.f1237 = false;
                                    ArrayList arrayList3 = c0126.f1234;
                                    ArrayList arrayList4 = c0126.f1236;
                                    C20069 c20069Mo29535 = abstractC14278.mo29535();
                                    if (c20069Mo29535.m41004get(0).m48652() == c21481.m48652()) {
                                        int iM3102 = m3101(c20069Mo29535.m41004get(1));
                                        if (iM3102 != arrayList2.size()) {
                                            C0126 c01210 = (C0126) arrayList2.get(iM3102);
                                            if (!arrayList4.contains(c01210)) {
                                                arrayList4.add(c01210);
                                            }
                                            if (!c01210.f1234.contains(c0126)) {
                                                c01210.f1234.add(c0126);
                                            }
                                            if (c0126.f1235.compareTo(c01210.f1235) < 0) {
                                                c0126.f1235 = c01210.f1235;
                                            }
                                        }
                                    } else {
                                        int iM3103 = m3101(c20069Mo29535.m41004get(0));
                                        if (iM3103 != arrayList2.size()) {
                                            C0126 c01211 = (C0126) arrayList2.get(iM3103);
                                            if (!c01211.f1236.contains(c0126)) {
                                                c01211.f1236.add(c0126);
                                            }
                                            if (!arrayList3.contains(c01211)) {
                                                arrayList3.add(c01211);
                                            }
                                            if (c01211.f1235.compareTo(c0126.f1235) < 0) {
                                                c01211.f1235 = c0126.f1235;
                                            }
                                        }
                                    }
                                }
                            } else if (!abstractC14278.mo29535().m41004get(1).m48637().mo5253()) {
                                c0126.f1237 = false;
                            }
                        }
                        c0126.f1235 = EnumC5066.INTER;
                    } else {
                        c0126.f1238.set(abstractC14278.m34042().m48652());
                        arrayList.add(abstractC14278.m34042());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3106(AbstractC14278 abstractC14278, C21480 c21480, HashSet hashSet) {
        C12512 c12512 = new C12512(C6663.f20694);
        C20069 c20069 = C20069.f65002;
        m3104(abstractC14278, c20069, 40, c12512);
        C16395 c16395M34044 = abstractC14278.m34044();
        C16395 c16395M38616 = c16395M34044.m38616(c16395M34044.m38606());
        AbstractC14278 abstractC14279 = (AbstractC14278) c16395M38616.m38615().get(0);
        C20630 c20630 = this.f3009;
        C21480 c21480M48631 = C21480.m48631(c20630.m47193(), c12512);
        m3105(abstractC14279, c20069, c21480M48631, 56, null);
        C16395 c16395M38617 = c16395M38616.m38616(c16395M38616.m38606());
        AbstractC14278 abstractC142710 = (AbstractC14278) c16395M38617.m38615().get(0);
        m3104(abstractC142710, C20069.m46250(c21480M48631, c21480), 52, new C22390(c12512, new C20274(new C13217("<init>"), new C13217("(I)V"))));
        hashSet.add(abstractC142710);
        C16395 c16395M38618 = c16395M38617.m38616(c16395M38617.m38606());
        AbstractC14278 abstractC142711 = (AbstractC14278) c16395M38618.m38615().get(0);
        m3104(abstractC142711, C20069.m46252(c21480M48631), 35, null);
        c16395M38618.m38596(c16395M38618.m38623(), c20630.m47196().m38609());
        hashSet.add(abstractC142711);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3105(AbstractC14278 abstractC14278, C20069 c20069, C21480 c21480, int i, AbstractC13717 abstractC13717) {
        C3135 c3135M29854;
        AbstractC15834 c5252;
        AbstractC15834 abstractC15834Mo29542 = abstractC14278.mo29542();
        if (i == 56) {
            c3135M29854 = C12307.m29863(c21480.getType());
        } else {
            c3135M29854 = C12307.m29854(i, c21480, c20069, abstractC13717);
        }
        C3135 c3135 = c3135M29854;
        if (abstractC13717 == null) {
            c5252 = new C1018(c3135, abstractC15834Mo29542.m37480(), c21480, c20069);
        } else {
            c5252 = new C5252(c3135, abstractC15834Mo29542.m37480(), c21480, c20069, abstractC13717);
        }
        C12122 c12122 = new C12122(c5252, abstractC14278.m34044());
        ArrayList arrayListM38615 = abstractC14278.m34044().m38615();
        arrayListM38615.add(arrayListM38615.lastIndexOf(abstractC14278), c12122);
        C20630 c20630 = this.f3009;
        c20630.m47177(c12122, (C20069) null);
        c20630.m47179(c12122, (C21480) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3104(AbstractC14278 abstractC14278, C20069 c20069, int i, AbstractC6162 abstractC6162) {
        AbstractC15834 c11602;
        AbstractC15834 abstractC15834Mo29542 = abstractC14278.mo29542();
        C3135 c3135M29854 = C12307.m29854(i, null, c20069, abstractC6162);
        if (abstractC6162 == null) {
            c11602 = new C22890(c3135M29854, abstractC15834Mo29542.m37480(), c20069, C13922.f41594);
        } else {
            c11602 = new C11602(c3135M29854, abstractC15834Mo29542.m37480(), c20069, C13922.f41594, abstractC6162);
        }
        C12122 c12122 = new C12122(c11602, abstractC14278.m34044());
        ArrayList arrayListM38615 = abstractC14278.m34044().m38615();
        arrayListM38615.add(arrayListM38615.lastIndexOf(abstractC14278), c12122);
        C20630 c20630 = this.f3009;
        c20630.m47177(c12122, (C20069) null);
        c20630.m47179(c12122, (C21480) null);
    }
}
