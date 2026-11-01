package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2892 {
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m4666(CharSequence charSequence, CharSequence charSequence2, InterfaceC3483 interfaceC3483, InterfaceC3483 interfaceC3484, EnumC7587 enumC7587, EnumC23010 enumC23010, C6836 c6836) {
        InterfaceC3483 interfaceC3485 = interfaceC3483;
        InterfaceC8848 interfaceC8848M35549 = C15652.m35549(m4665(0, interfaceC3483.mo6212(), charSequence, interfaceC3485), m4665(0, interfaceC3484.mo6212(), charSequence2, interfaceC3484), enumC7587, c6836);
        ArrayList<InterfaceC2812> arrayList = new ArrayList();
        Iterator itMo8422 = interfaceC8848M35549.mo8420().f44736.mo8422();
        while (itMo8422.hasNext()) {
            C23600 c23600 = (C23600) itMo8422.next();
            int i = c23600.f75123;
            int i2 = c23600.f75124;
            int i3 = c23600.f75121;
            int i4 = c23600.f75122;
            C22930 c22930M4669 = m4669(interfaceC3485, i, i3);
            C22930 c22930M46610 = m4669(interfaceC3484, i2, i4);
            arrayList.add(new C7507(i, i3, i2, i4, c22930M4669.f72163, c22930M4669.f72164, c22930M46610.f72163, c22930M46610.f72164, null));
            interfaceC3485 = interfaceC3483;
        }
        if (enumC23010 == EnumC23010.NONE) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i5 = 0;
        for (InterfaceC2812 interfaceC2812 : arrayList) {
            try {
                arrayList2.addAll(m4668(interfaceC2812, charSequence, charSequence2, enumC7587, enumC23010, c6836, i5 < 3));
            } catch (C16973 unused) {
                arrayList2.add(interfaceC2812);
                i5++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m4668(InterfaceC2812 interfaceC2812, CharSequence charSequence, CharSequence charSequence2, EnumC7587 enumC7587, EnumC23010 enumC23010, C6836 c6836, boolean z) {
        InterfaceC4154 interfaceC4154M32881;
        InterfaceC4154 interfaceC4154M29683;
        if (enumC23010 == EnumC23010.NONE) {
            return Collections.singletonList(interfaceC2812);
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(interfaceC2812.mo17398(), interfaceC2812.mo17388());
        CharSequence charSequenceSubSequence2 = charSequence2.subSequence(interfaceC2812.mo17396(), interfaceC2812.mo17400());
        if (interfaceC2812.mo4445() == interfaceC2812.mo4443() || interfaceC2812.mo4448() == interfaceC2812.mo4452()) {
            if (C10269.m23885(charSequenceSubSequence, charSequenceSubSequence2, enumC7587)) {
                return Collections.singletonList(new C7507(interfaceC2812, Collections.EMPTY_LIST));
            }
            return Collections.singletonList(interfaceC2812);
        }
        if (!z) {
            return Collections.singletonList(interfaceC2812);
        }
        if (enumC23010 == EnumC23010.WORDS) {
            c6836.m15650();
            ArrayList arrayListM50155 = C22340.m50155(charSequenceSubSequence);
            ArrayList arrayListM50156 = C22340.m50155(charSequenceSubSequence2);
            InterfaceC8848 interfaceC8848M45890 = new C6246(C24941.m54811(arrayListM50155, arrayListM50156, c6836), charSequenceSubSequence, charSequenceSubSequence2, arrayListM50155, arrayListM50156).m45890();
            ArrayList<C21669> arrayListM15848 = new C6916(interfaceC8848M45890, charSequenceSubSequence, charSequenceSubSequence2, arrayListM50155, arrayListM50156).m15848();
            ArrayList arrayList = new ArrayList(arrayListM15848.size());
            for (C21669 c21669 : arrayListM15848) {
                C23600 c23600 = c21669.f68248;
                C23600 c23601 = c21669.f68249;
                int i = c23601.f75123;
                CharSequence charSequenceSubSequence3 = charSequenceSubSequence.subSequence(c23600.f75123, c23600.f75121);
                CharSequence charSequenceSubSequence4 = charSequenceSubSequence2.subSequence(c23600.f75124, c23600.f75122);
                int i2 = c23601.f75122;
                int i3 = c23601.f75124;
                int i4 = c23601.f75121;
                List listSubList = arrayListM50155.subList(i, i4);
                List listSubList2 = arrayListM50156.subList(i3, i2);
                ArrayList arrayList2 = arrayListM50155;
                InterfaceC8848 interfaceC8848 = interfaceC8848M45890;
                ArrayList arrayList3 = arrayList;
                InterfaceC8848 interfaceC8848M8611 = new C4234(charSequenceSubSequence3, charSequenceSubSequence4, listSubList, listSubList2, c23600.f75123, c23600.f75124, C24941.m54812(C24941.m54810(interfaceC8848M45890, i, i4, i3, i2)), c6836).m8611();
                int i5 = C9618.f26487[enumC7587.ordinal()];
                if (i5 == 1) {
                    interfaceC4154M29683 = new C12952(interfaceC8848M8611, charSequenceSubSequence3, charSequenceSubSequence4).m29683();
                } else if (i5 == 2) {
                    interfaceC4154M29683 = new C25021(new C12952(interfaceC8848M8611, charSequenceSubSequence3, charSequenceSubSequence4).m29683(), charSequenceSubSequence3, charSequenceSubSequence4).m54940();
                } else if (i5 == 3) {
                    interfaceC4154M29683 = new C18315(interfaceC8848M8611, charSequenceSubSequence3, charSequenceSubSequence4).m41749();
                } else {
                    throw new IllegalArgumentException(enumC7587.name());
                }
                ArrayList arrayListM4667 = m4667(interfaceC4154M29683);
                Iterator it = listSubList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    if (((InterfaceC19657) it.next()) instanceof C16303) {
                        i6++;
                    }
                }
                Iterator it2 = listSubList2.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    if (((InterfaceC19657) it2.next()) instanceof C16303) {
                        i7++;
                    }
                }
                arrayList3.add(new C18986(arrayListM4667, c23600, i6, i7));
                arrayListM50155 = arrayList2;
                arrayList = arrayList3;
                interfaceC8848M45890 = interfaceC8848;
            }
            ArrayList arrayList4 = arrayList;
            int iMo17398 = interfaceC2812.mo17398();
            int iMo17396 = interfaceC2812.mo17396();
            int iMo4445 = interfaceC2812.mo4445();
            int iMo4448 = interfaceC2812.mo4448();
            ArrayList arrayList5 = new ArrayList();
            int i8 = 0;
            int i9 = iMo4445;
            int i10 = iMo4448;
            while (i8 < arrayList4.size()) {
                C18986 c18986 = (C18986) arrayList4.get(i8);
                C23600 c23602 = c18986.f56618;
                int iMo4443 = i8 != arrayList4.size() + (-1) ? c18986.f56616 + i9 : interfaceC2812.mo4443();
                int iMo4452 = i8 != arrayList4.size() + (-1) ? c18986.f56617 + i10 : interfaceC2812.mo4452();
                arrayList5.add(new C7507(i9, iMo4443, i10, iMo4452, c23602.f75123 + iMo17398, c23602.f75121 + iMo17398, c23602.f75124 + iMo17396, c23602.f75122 + iMo17396, c18986.f56615));
                i8++;
                iMo17398 = iMo17398;
                i9 = iMo4443;
                i10 = iMo4452;
            }
            return arrayList5;
        }
        if (enumC23010 != EnumC23010.CHARS) {
            throw new IllegalArgumentException(enumC23010.name());
        }
        if (enumC7587 == EnumC7587.DEFAULT) {
            interfaceC4154M32881 = C14312.m32885(charSequenceSubSequence, charSequenceSubSequence2, c6836);
        } else if (enumC7587 == EnumC7587.TRIM_WHITESPACES) {
            interfaceC4154M32881 = new C25021(C14312.m32885(charSequenceSubSequence, charSequenceSubSequence2, c6836), charSequenceSubSequence, charSequenceSubSequence2).m54940();
        } else {
            interfaceC4154M32881 = C14312.m32881(charSequenceSubSequence, charSequenceSubSequence2, c6836);
        }
        return Collections.singletonList(new C7507(interfaceC2812, m4667(interfaceC4154M32881)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m4667(InterfaceC4154 interfaceC4154) {
        ArrayList arrayList = new ArrayList();
        Iterator itMo8422 = interfaceC4154.mo8420().f44736.mo8422();
        while (itMo8422.hasNext()) {
            C23600 c23600 = (C23600) itMo8422.next();
            arrayList.add(new C20919(c23600.f75123, c23600.f75121, c23600.f75124, c23600.f75122));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22930 m4669(InterfaceC3483 interfaceC3483, int i, int i2) {
        int iMo6215;
        if (i == i2) {
            if (i < interfaceC3483.mo6212()) {
                iMo6215 = interfaceC3483.mo6214(i);
            } else {
                iMo6215 = interfaceC3483.mo6215(interfaceC3483.mo6212() - 1);
            }
            return new C22930(iMo6215, iMo6215);
        }
        return new C22930(interfaceC3483.mo6214(i), interfaceC3483.mo6215(i2 - 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m4665(int i, int i2, CharSequence charSequence, InterfaceC3483 interfaceC3483) {
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(new C19165(interfaceC3483.mo6214(i), interfaceC3483.mo6213(i), charSequence));
            i++;
        }
        return arrayList;
    }
}
