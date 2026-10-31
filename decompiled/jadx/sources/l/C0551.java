package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0551 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2298(CharSequence charSequence, CharSequence charSequence2, InterfaceC1173 interfaceC1173, InterfaceC1173 interfaceC1174, EnumC5491 enumC5491, EnumC21719 enumC21719, C4701 c4701) {
        InterfaceC1173 interfaceC1175 = interfaceC1173;
        InterfaceC6818 interfaceC6818M33429 = C13977.m33429(m2297(0, interfaceC1173.mo3970(), charSequence, interfaceC1175), m2297(0, interfaceC1174.mo3970(), charSequence2, interfaceC1174), enumC5491, c4701);
        ArrayList<InterfaceC0467> arrayList = new ArrayList();
        Iterator itMo6220 = interfaceC6818M33429.mo6218().f41655.mo6220();
        while (itMo6220.hasNext()) {
            C22340 c22340 = (C22340) itMo6220.next();
            int i = c22340.f72397;
            int i2 = c22340.f72398;
            int i3 = c22340.f72395;
            int i4 = c22340.f72396;
            C21635 c21635M2301 = m2301(interfaceC1175, i, i3);
            C21635 c21635M2302 = m2301(interfaceC1174, i2, i4);
            arrayList.add(new C5407(i, i3, i2, i4, c21635M2301.f69460, c21635M2301.f69461, c21635M2302.f69460, c21635M2302.f69461, null));
            interfaceC1175 = interfaceC1173;
        }
        if (enumC21719 == EnumC21719.NONE) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i5 = 0;
        for (InterfaceC0467 interfaceC0467 : arrayList) {
            try {
                arrayList2.addAll(m2300(interfaceC0467, charSequence, charSequence2, enumC5491, enumC21719, c4701, i5 < 3));
            } catch (C15367 unused) {
                arrayList2.add(interfaceC0467);
                i5++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m2300(InterfaceC0467 interfaceC0467, CharSequence charSequence, CharSequence charSequence2, EnumC5491 enumC5491, EnumC21719 enumC21719, C4701 c4701, boolean z) {
        InterfaceC1879 interfaceC1879M30806;
        InterfaceC1879 interfaceC1879M27621;
        if (enumC21719 == EnumC21719.NONE) {
            return Collections.singletonList(interfaceC0467);
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(interfaceC0467.mo15487(), interfaceC0467.mo15477());
        CharSequence charSequenceSubSequence2 = charSequence2.subSequence(interfaceC0467.mo15485(), interfaceC0467.mo15489());
        if (interfaceC0467.mo2065() == interfaceC0467.mo2063() || interfaceC0467.mo2068() == interfaceC0467.mo2072()) {
            if (C8313.m21915(charSequenceSubSequence, charSequenceSubSequence2, enumC5491)) {
                return Collections.singletonList(new C5407(interfaceC0467, Collections.EMPTY_LIST));
            }
            return Collections.singletonList(interfaceC0467);
        }
        if (!z) {
            return Collections.singletonList(interfaceC0467);
        }
        if (enumC21719 == EnumC21719.WORDS) {
            c4701.m13775();
            ArrayList arrayListM47825 = C21014.m47825(charSequenceSubSequence);
            ArrayList arrayListM47826 = C21014.m47825(charSequenceSubSequence2);
            InterfaceC6818 interfaceC6818M43624 = new C4080(C23751.m52402(arrayListM47825, arrayListM47826, c4701), charSequenceSubSequence, charSequenceSubSequence2, arrayListM47825, arrayListM47826).m43624();
            ArrayList<C20308> arrayListM13968 = new C4785(interfaceC6818M43624, charSequenceSubSequence, charSequenceSubSequence2, arrayListM47825, arrayListM47826).m13968();
            ArrayList arrayList = new ArrayList(arrayListM13968.size());
            for (C20308 c20308 : arrayListM13968) {
                C22340 c22340 = c20308.f65573;
                C22340 c22341 = c20308.f65574;
                int i = c22341.f72397;
                CharSequence charSequenceSubSequence3 = charSequenceSubSequence.subSequence(c22340.f72397, c22340.f72395);
                CharSequence charSequenceSubSequence4 = charSequenceSubSequence2.subSequence(c22340.f72398, c22340.f72396);
                int i2 = c22341.f72396;
                int i3 = c22341.f72398;
                int i4 = c22341.f72395;
                List listSubList = arrayListM47825.subList(i, i4);
                List listSubList2 = arrayListM47826.subList(i3, i2);
                ArrayList arrayList2 = arrayListM47825;
                InterfaceC6818 interfaceC6818 = interfaceC6818M43624;
                ArrayList arrayList3 = arrayList;
                InterfaceC6818 interfaceC6818M6470 = new C1963(charSequenceSubSequence3, charSequenceSubSequence4, listSubList, listSubList2, c22340.f72397, c22340.f72398, C23751.m52403(C23751.m52401(interfaceC6818M43624, i, i4, i3, i2)), c4701).m6470();
                int i5 = C7628.f23574[enumC5491.ordinal()];
                if (i5 == 1) {
                    interfaceC1879M27621 = new C11136(interfaceC6818M6470, charSequenceSubSequence3, charSequenceSubSequence4).m27621();
                } else if (i5 == 2) {
                    interfaceC1879M27621 = new C23835(new C11136(interfaceC6818M6470, charSequenceSubSequence3, charSequenceSubSequence4).m27621(), charSequenceSubSequence3, charSequenceSubSequence4).m52531();
                } else if (i5 == 3) {
                    interfaceC1879M27621 = new C16779(interfaceC6818M6470, charSequenceSubSequence3, charSequenceSubSequence4).m39513();
                } else {
                    throw new IllegalArgumentException(enumC5491.name());
                }
                ArrayList arrayListM2299 = m2299(interfaceC1879M27621);
                Iterator it = listSubList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    if (((InterfaceC18191) it.next()) instanceof C14662) {
                        i6++;
                    }
                }
                Iterator it2 = listSubList2.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    if (((InterfaceC18191) it2.next()) instanceof C14662) {
                        i7++;
                    }
                }
                arrayList3.add(new C17485(arrayListM2299, c22340, i6, i7));
                arrayListM47825 = arrayList2;
                arrayList = arrayList3;
                interfaceC6818M43624 = interfaceC6818;
            }
            ArrayList arrayList4 = arrayList;
            int iMo15487 = interfaceC0467.mo15487();
            int iMo15485 = interfaceC0467.mo15485();
            int iMo2065 = interfaceC0467.mo2065();
            int iMo2068 = interfaceC0467.mo2068();
            ArrayList arrayList5 = new ArrayList();
            int i8 = 0;
            int i9 = iMo2065;
            int i10 = iMo2068;
            while (i8 < arrayList4.size()) {
                C17485 c17485 = (C17485) arrayList4.get(i8);
                C22340 c22342 = c17485.f53430;
                int iMo2063 = i8 != arrayList4.size() + (-1) ? c17485.f53428 + i9 : interfaceC0467.mo2063();
                int iMo2072 = i8 != arrayList4.size() + (-1) ? c17485.f53429 + i10 : interfaceC0467.mo2072();
                arrayList5.add(new C5407(i9, iMo2063, i10, iMo2072, c22342.f72397 + iMo15487, c22342.f72395 + iMo15487, c22342.f72398 + iMo15485, c22342.f72396 + iMo15485, c17485.f53427));
                i8++;
                iMo15487 = iMo15487;
                i9 = iMo2063;
                i10 = iMo2072;
            }
            return arrayList5;
        }
        if (enumC21719 != EnumC21719.CHARS) {
            throw new IllegalArgumentException(enumC21719.name());
        }
        if (enumC5491 == EnumC5491.DEFAULT) {
            interfaceC1879M30806 = C12567.m30810(charSequenceSubSequence, charSequenceSubSequence2, c4701);
        } else if (enumC5491 == EnumC5491.TRIM_WHITESPACES) {
            interfaceC1879M30806 = new C23835(C12567.m30810(charSequenceSubSequence, charSequenceSubSequence2, c4701), charSequenceSubSequence, charSequenceSubSequence2).m52531();
        } else {
            interfaceC1879M30806 = C12567.m30806(charSequenceSubSequence, charSequenceSubSequence2, c4701);
        }
        return Collections.singletonList(new C5407(interfaceC0467, m2299(interfaceC1879M30806)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2299(InterfaceC1879 interfaceC1879) {
        ArrayList arrayList = new ArrayList();
        Iterator itMo6220 = interfaceC1879.mo6218().f41655.mo6220();
        while (itMo6220.hasNext()) {
            C22340 c22340 = (C22340) itMo6220.next();
            arrayList.add(new C19519(c22340.f72397, c22340.f72395, c22340.f72398, c22340.f72396));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21635 m2301(InterfaceC1173 interfaceC1173, int i, int i2) {
        int iMo3973;
        if (i == i2) {
            if (i < interfaceC1173.mo3970()) {
                iMo3973 = interfaceC1173.mo3972(i);
            } else {
                iMo3973 = interfaceC1173.mo3973(interfaceC1173.mo3970() - 1);
            }
            return new C21635(iMo3973, iMo3973);
        }
        return new C21635(interfaceC1173.mo3972(i), interfaceC1173.mo3973(i2 - 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m2297(int i, int i2, CharSequence charSequence, InterfaceC1173 interfaceC1173) {
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(new C17673(interfaceC1173.mo3972(i), interfaceC1173.mo3971(i), charSequence));
            i++;
        }
        return arrayList;
    }
}
