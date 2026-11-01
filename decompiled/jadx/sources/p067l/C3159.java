package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBGE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3159 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f5781 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final int f5782;

    /* JADX INFO: renamed from: ܽ */
    public final C21975 f5783;

    public C3159(C21975 c21975) {
        this.f5783 = c21975;
        this.f5782 = c21975.m49513();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m5415(C22783 c22783) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5781;
            if (i >= arrayList.size() || ((C2488) arrayList.get(i)).f4014.get(c22783.m50989())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC15938 m5416(AbstractC15938 abstractC15938) {
        return (AbstractC15938) C20013.m45383(((C17950) this.f5783.m49517().get(abstractC15938.m36177().m40841().nextSetBit(0))).m40832(), 1);
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC15938 m5423(AbstractC15938 abstractC15938) {
        return (AbstractC15938) ((C17950) this.f5783.m49517().get(abstractC15938.m36177().m40821().nextSetBit(0))).m40832().get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5421(C21975 c21975) {
        Iterator it;
        C3159 c3159 = new C3159(c21975);
        c21975.m49518(new C20595(c3159));
        ArrayList<C2488> arrayList = c3159.f5781;
        for (C2488 c2488 : arrayList) {
            if (c2488.f4011 != EnumC7183.NONE) {
                for (C2488 c2489 : c2488.f4010) {
                    if (c2488.f4011.compareTo(c2489.f4011) > 0) {
                        c2489.f4011 = c2488.f4011;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2488 c24810 = (C2488) it2.next();
            if (c24810.f4013 && c24810.f4011 == EnumC7183.NONE) {
                int i = 0;
                int iNextSetBit = c24810.f4014.nextSetBit(0);
                AbstractC15938 abstractC15938M49521 = c21975.m49521(iNextSetBit);
                AbstractC15938 abstractC15938M5416 = c3159.m5416(abstractC15938M49521);
                int iMo4598 = ((AbstractC3531) abstractC15938M5416.mo31600().m56524get(0).m50974()).mo4598();
                ArrayList arrayList2 = new ArrayList(iMo4598);
                HashSet hashSet = new HashSet();
                C9566 type = abstractC15938M49521.m36175().getType();
                for (int i2 = 0; i2 < iMo4598; i2++) {
                    AbstractC3531 abstractC3531M30916 = C13590.m30916(type.m22287());
                    C22783 c22783M50968 = C22783.m50968(c21975.m49520(), abstractC3531M30916);
                    arrayList2.add(c22783M50968);
                    c3159.m5419(abstractC15938M49521, C21442.f67643, c22783M50968, 5, abstractC3531M30916);
                }
                hashSet.add(abstractC15938M5416);
                hashSet.add(abstractC15938M49521);
                for (AbstractC15938 abstractC15938 : c21975.m49526(iNextSetBit)) {
                    int size = arrayList2.size();
                    int iM11605 = abstractC15938.mo31602().m11605();
                    if (iM11605 != 34) {
                        if (iM11605 == 57) {
                            ArrayList arrayListM49803 = ((C22113) abstractC15938.mo31607()).m49803();
                            int i3 = 0;
                            while (i3 < size) {
                                C22783 c22783M50969 = C22783.m50968(((C22783) arrayList2.get(i3)).m50989(), (InterfaceC3830) arrayListM49803.get(i3));
                                C21442 c21442 = C21442.f67643;
                                AbstractC15405 abstractC15405 = (AbstractC15405) arrayListM49803.get(i3);
                                ArrayList arrayList3 = arrayListM49803;
                                int i4 = i3;
                                c3159.m5419(abstractC15938, c21442, c22783M50969, 5, abstractC15405);
                                arrayList2.set(i4, c22783M50969);
                                i3 = i4 + 1;
                                arrayListM49803 = arrayList3;
                                it2 = it2;
                            }
                        } else if (iM11605 == 38) {
                            AbstractC15938 abstractC15938M5423 = c3159.m5423(abstractC15938);
                            C21442 c21442Mo31600 = abstractC15938.mo31600();
                            int iMo4599 = ((AbstractC3531) c21442Mo31600.m56524get(1).m50974()).mo4598();
                            if (iMo4599 < size) {
                                C22783 c22783 = (C22783) arrayList2.get(iMo4599);
                                c3159.m5419(abstractC15938M5423, C21442.m48568(c22783), c22783.m50983(abstractC15938M5423.m36175().m50989()), 2, null);
                            } else {
                                c3159.m5420(abstractC15938M5423, c21442Mo31600.m56524get(1), hashSet);
                                hashSet.add((AbstractC15938) abstractC15938M5423.m36177().m40832().get(2));
                            }
                            hashSet.add(abstractC15938M5423);
                        } else if (iM11605 == 39) {
                            C21442 c21442Mo31601 = abstractC15938.mo31600();
                            int iMo45910 = ((AbstractC3531) c21442Mo31601.m56524get(2).m50974()).mo4598();
                            if (iMo45910 < size) {
                                C22783 c22783M56524get = c21442Mo31601.m56524get(i);
                                C22783 c22783M50983 = c22783M56524get.m50983(((C22783) arrayList2.get(iMo45910)).m50989());
                                c3159.m5419(abstractC15938, C21442.m48568(c22783M56524get), c22783M50983, 2, null);
                                arrayList2.set(iMo45910, c22783M50983.m50985());
                            } else {
                                c3159.m5420(abstractC15938, c21442Mo31601.m56524get(2), hashSet);
                            }
                        }
                        it = it2;
                    } else {
                        it = it2;
                        Object objM50974 = abstractC15938M5416.mo31600().m56524get(0).m50974();
                        AbstractC15938 abstractC15938M5424 = c3159.m5423(abstractC15938);
                        c3159.m5419(abstractC15938M5424, C21442.f67643, abstractC15938M5424.m36175(), 5, (AbstractC15405) objM50974);
                        hashSet.add(abstractC15938M5424);
                    }
                    hashSet.add(abstractC15938);
                    it2 = it;
                    i = 0;
                }
                Iterator it3 = it2;
                c21975.m49502(hashSet);
                c21975.m49511();
                int i5 = c3159.f5782;
                C19292.m43984(i5, c21975);
                for (int i6 = 0; i6 < c21975.m49513(); i6++) {
                    AbstractC15938 abstractC15938M49522 = c21975.m49521(i6);
                    if (abstractC15938M49522 != null && abstractC15938M49522.mo31602() != null && abstractC15938M49522.mo31602().m11605() == 2) {
                        ArrayList[] arrayListArrM49528 = c21975.m49528();
                        C22783 c22783M56524get2 = abstractC15938M49522.mo31600().m56524get(0);
                        C22783 c22783M36175 = abstractC15938M49522.m36175();
                        if (c22783M56524get2.m50989() >= i5 || c22783M36175.m50989() >= i5) {
                            C5842 c5842 = new C5842(c3159, c22783M36175, c22783M56524get2);
                            Iterator it4 = arrayListArrM49528[c22783M36175.m50989()].iterator();
                            while (it4.hasNext()) {
                                ((AbstractC15938) it4.next()).mo31604(c5842);
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
    /* JADX INFO: renamed from: ֫ */
    public static void m5417(C3159 c3159, C13889 c13889) {
        C2488 c2488;
        C22783 c22783M56524get;
        int iM5415;
        int i = c3159.f5782;
        ArrayList arrayList = c3159.f5781;
        int iM11605 = c13889.mo31602().m11605();
        C22783 c22783M36175 = c13889.m36175();
        if (iM11605 != 56 || c22783M36175.m50974().mo7484() != 9) {
            if (iM11605 == 3 && c22783M36175.m50974().mo7484() == 9) {
                C2488 c2489 = new C2488(c22783M36175.m50989(), i, EnumC7183.NONE);
                arrayList.add(c2489);
                c3159.m5422(c22783M36175, c2489);
                return;
            } else {
                if (iM11605 == 55 && c22783M36175.m50974().mo7484() == 9) {
                    C2488 c24810 = new C2488(c22783M36175.m50989(), i, EnumC7183.NONE);
                    arrayList.add(c24810);
                    c3159.m5422(c22783M36175, c24810);
                    return;
                }
                return;
            }
        }
        C22783 c22783M36176 = c13889.m36175();
        AbstractC15938 abstractC15938M5416 = c3159.m5416(c13889);
        int iM11606 = abstractC15938M5416.mo31602().m11605();
        if (iM11606 == 5) {
            c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.NONE);
            arrayList.add(c2488);
        } else if (iM11606 == 38 || iM11606 == 45) {
            c22783M56524get = abstractC15938M5416.mo31600().m56524get(0);
            iM5415 = c3159.m5415(c22783M56524get);
            if (iM5415 != arrayList.size()) {
                c2488 = (C2488) arrayList.get(iM5415);
                c2488.f4014.set(c22783M36176.m50989());
            } else {
                if (c22783M56524get.getType() == C9566.f26329) {
                    c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.NONE);
                } else {
                    c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.GLOBAL);
                }
                arrayList.add(c2488);
            }
        } else {
            if (iM11606 != 46) {
                switch (iM11606) {
                    case 40:
                        c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.NONE);
                        break;
                    case 41:
                    case 42:
                        if (abstractC15938M5416.mo31600().m56524get(0).m50974().mo7482()) {
                            c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.NONE);
                            c2488.f4013 = true;
                        } else {
                            c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.GLOBAL);
                        }
                        break;
                    case 43:
                        c22783M56524get = abstractC15938M5416.mo31600().m56524get(0);
                        iM5415 = c3159.m5415(c22783M56524get);
                        if (iM5415 != arrayList.size()) {
                            c2488 = (C2488) arrayList.get(iM5415);
                            c2488.f4014.set(c22783M36176.m50989());
                        } else if (c22783M56524get.getType() == C9566.f26329) {
                            c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.NONE);
                        } else {
                            c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.GLOBAL);
                        }
                        break;
                    default:
                        c2488 = null;
                        break;
                }
            } else {
                c2488 = new C2488(c22783M36176.m50989(), i, EnumC7183.GLOBAL);
            }
            arrayList.add(c2488);
        }
        c3159.m5422(c22783M36175, c2488);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5422(C22783 c22783, C2488 c2488) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c22783);
        while (!arrayList.isEmpty()) {
            C22783 c22784 = (C22783) C6406.m14670(arrayList, 1);
            for (AbstractC15938 abstractC15938 : this.f5783.m49526(c22784.m50989())) {
                C5348 c5348Mo31602 = abstractC15938.mo31602();
                ArrayList arrayList2 = this.f5781;
                if (c5348Mo31602 == null) {
                    int iM5415 = m5415(abstractC15938.m36175());
                    if (iM5415 != arrayList2.size()) {
                        C2488 c2489 = (C2488) arrayList2.get(iM5415);
                        if (c2489 != c2488) {
                            c2488.f4013 = false;
                            c2488.f4014.or(c2489.f4014);
                            if (c2488.f4011.compareTo(c2489.f4011) < 0) {
                                c2488.f4011 = c2489.f4011;
                            }
                            for (C2488 c24810 : c2489.f4012) {
                                c24810.f4010.remove(c2489);
                                c24810.f4010.add(c2488);
                                c2488.f4012.add(c24810);
                            }
                            for (C2488 c24811 : c2489.f4010) {
                                c24811.f4012.remove(c2489);
                                c24811.f4012.add(c2488);
                                c2488.f4010.add(c24811);
                            }
                            arrayList2.remove(iM5415);
                        }
                    } else {
                        c2488.f4014.set(abstractC15938.m36175().m50989());
                        arrayList.add(abstractC15938.m36175());
                    }
                } else {
                    int iM11605 = abstractC15938.mo31602().m11605();
                    if (iM11605 != 2) {
                        if (iM11605 != 33 && iM11605 != 35) {
                            if (iM11605 == 43 || iM11605 == 7 || iM11605 == 8) {
                                EnumC7183 enumC7183 = c2488.f4011;
                                EnumC7183 enumC7184 = EnumC7183.METHOD;
                                if (enumC7183.compareTo(enumC7184) < 0) {
                                    c2488.f4011 = enumC7184;
                                }
                            } else if (iM11605 != 38) {
                                if (iM11605 != 39) {
                                    switch (iM11605) {
                                        case 47:
                                            break;
                                        case 48:
                                            c2488.f4011 = EnumC7183.GLOBAL;
                                            break;
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                    }
                                } else if (!abstractC15938.mo31600().m56524get(2).m50974().mo7482()) {
                                    c2488.f4013 = false;
                                }
                                if (abstractC15938.mo31600().m56524get(0).m50974().mo7484() == 9) {
                                    c2488.f4013 = false;
                                    ArrayList arrayList3 = c2488.f4010;
                                    ArrayList arrayList4 = c2488.f4012;
                                    C21442 c21442Mo31600 = abstractC15938.mo31600();
                                    if (c21442Mo31600.m56524get(0).m50989() == c22784.m50989()) {
                                        int iM5416 = m5415(c21442Mo31600.m56524get(1));
                                        if (iM5416 != arrayList2.size()) {
                                            C2488 c24812 = (C2488) arrayList2.get(iM5416);
                                            if (!arrayList4.contains(c24812)) {
                                                arrayList4.add(c24812);
                                            }
                                            if (!c24812.f4010.contains(c2488)) {
                                                c24812.f4010.add(c2488);
                                            }
                                            if (c2488.f4011.compareTo(c24812.f4011) < 0) {
                                                c2488.f4011 = c24812.f4011;
                                            }
                                        }
                                    } else {
                                        int iM5417 = m5415(c21442Mo31600.m56524get(0));
                                        if (iM5417 != arrayList2.size()) {
                                            C2488 c24813 = (C2488) arrayList2.get(iM5417);
                                            if (!c24813.f4012.contains(c2488)) {
                                                c24813.f4012.add(c2488);
                                            }
                                            if (!arrayList3.contains(c24813)) {
                                                arrayList3.add(c24813);
                                            }
                                            if (c24813.f4011.compareTo(c2488.f4011) < 0) {
                                                c24813.f4011 = c2488.f4011;
                                            }
                                        }
                                    }
                                }
                            } else if (!abstractC15938.mo31600().m56524get(1).m50974().mo7482()) {
                                c2488.f4013 = false;
                            }
                        }
                        c2488.f4011 = EnumC7183.INTER;
                    } else {
                        c2488.f4014.set(abstractC15938.m36175().m50989());
                        arrayList.add(abstractC15938.m36175());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5420(AbstractC15938 abstractC15938, C22783 c22783, HashSet hashSet) {
        C14260 c14260 = new C14260(C8701.f23569);
        C21442 c21442 = C21442.f67643;
        m5418(abstractC15938, c21442, 40, c14260);
        C17950 c17950M36177 = abstractC15938.m36177();
        C17950 c17950M40833 = c17950M36177.m40833(c17950M36177.m40823());
        AbstractC15938 abstractC15939 = (AbstractC15938) c17950M40833.m40832().get(0);
        C21975 c21975 = this.f5783;
        C22783 c22783M50968 = C22783.m50968(c21975.m49520(), c14260);
        m5419(abstractC15939, c21442, c22783M50968, 56, null);
        C17950 c17950M40834 = c17950M40833.m40833(c17950M40833.m40823());
        AbstractC15938 abstractC159310 = (AbstractC15938) c17950M40834.m40832().get(0);
        m5418(abstractC159310, C21442.m48566(c22783M50968, c22783), 52, new C23648(c14260, new C21637(new C14930("<init>"), new C14930("(I)V"))));
        hashSet.add(abstractC159310);
        C17950 c17950M40835 = c17950M40834.m40833(c17950M40834.m40823());
        AbstractC15938 abstractC159311 = (AbstractC15938) c17950M40835.m40832().get(0);
        m5418(abstractC159311, C21442.m48568(c22783M50968), 35, null);
        c17950M40835.m40813(c17950M40835.m40840(), c21975.m49523().m40826());
        hashSet.add(abstractC159311);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5419(AbstractC15938 abstractC15938, C21442 c21442, C22783 c22783, int i, AbstractC15405 abstractC15405) {
        C5348 c5348M31914;
        AbstractC17417 c7360;
        AbstractC17417 abstractC17417Mo31607 = abstractC15938.mo31607();
        if (i == 56) {
            c5348M31914 = C14065.m31923(c22783.getType());
        } else {
            c5348M31914 = C14065.m31914(i, c22783, c21442, abstractC15405);
        }
        C5348 c5348 = c5348M31914;
        if (abstractC15405 == null) {
            c7360 = new C3336(c5348, abstractC17417Mo31607.m39652(), c22783, c21442);
        } else {
            c7360 = new C7360(c5348, abstractC17417Mo31607.m39652(), c22783, c21442, abstractC15405);
        }
        C13889 c13889 = new C13889(c7360, abstractC15938.m36177());
        ArrayList arrayListM40832 = abstractC15938.m36177().m40832();
        arrayListM40832.add(arrayListM40832.lastIndexOf(abstractC15938), c13889);
        C21975 c21975 = this.f5783;
        c21975.m49504(c13889, (C21442) null);
        c21975.m49506(c13889, (C22783) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5418(AbstractC15938 abstractC15938, C21442 c21442, int i, AbstractC8225 abstractC8225) {
        AbstractC17417 c13395;
        AbstractC17417 abstractC17417Mo31607 = abstractC15938.mo31607();
        C5348 c5348M31914 = C14065.m31914(i, null, c21442, abstractC8225);
        if (abstractC8225 == null) {
            c13395 = new C24123(c5348M31914, abstractC17417Mo31607.m39652(), c21442, C15600.f44675);
        } else {
            c13395 = new C13395(c5348M31914, abstractC17417Mo31607.m39652(), c21442, C15600.f44675, abstractC8225);
        }
        C13889 c13889 = new C13889(c13395, abstractC15938.m36177());
        ArrayList arrayListM40832 = abstractC15938.m36177().m40832();
        arrayListM40832.add(arrayListM40832.lastIndexOf(abstractC15938), c13889);
        C21975 c21975 = this.f5783;
        c21975.m49504(c13889, (C21442) null);
        c21975.m49506(c13889, (C22783) null);
    }
}
