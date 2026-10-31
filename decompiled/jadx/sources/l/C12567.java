package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12567 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m30804(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        c4701.m13775();
        int[] iArrM30805 = m30805(charSequence);
        int[] iArrM30806 = m30805(charSequence2);
        final InterfaceC6818 interfaceC6818M52404 = C23751.m52404(iArrM30805, iArrM30806, c4701);
        C18107 c18107 = new C18107(charSequence.length(), charSequence2.length());
        int i = 0;
        int i2 = 0;
        for (C13167 c13167 : new Iterable() { // from class: l.ۧܳۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C16695(interfaceC6818M52404);
            }
        }) {
            C22340 c22340 = (C22340) c13167.f39374;
            boolean zBooleanValue = ((Boolean) c13167.f39375).booleanValue();
            int i3 = c22340.f72395;
            int iCharCount = 0;
            for (int i4 = c22340.f72397; i4 < i3; i4++) {
                iCharCount += Character.charCount(iArrM30805[i4]);
            }
            int i5 = iCharCount + i;
            int i6 = c22340.f72396;
            int iCharCount2 = 0;
            for (int i7 = c22340.f72398; i7 < i6; i7++) {
                iCharCount2 += Character.charCount(iArrM30806[i7]);
            }
            int i8 = iCharCount2 + i2;
            if (zBooleanValue) {
                c18107.m40752(i, i2, i5, i8);
            }
            i2 = i8;
            i = i5;
        }
        return C23751.m52403(c18107.m42227());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m30810(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        c4701.m13775();
        C13272 c13272M30807 = m30807(charSequence);
        C13272 c13272M30808 = m30807(charSequence2);
        return new C9725(c13272M30807, c13272M30808, charSequence, charSequence2, C23751.m52404(c13272M30807.f39742, c13272M30808.f39742, c4701), c4701).m37982();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1879 m30806(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        int iM30803;
        int iM32237;
        int iM30804;
        int iM32238;
        c4701.m13775();
        C13272 c13272M30807 = m30807(charSequence);
        C13272 c13272M30808 = m30807(charSequence2);
        InterfaceC6818 interfaceC6818M52404 = C23751.m52404(c13272M30807.f39742, c13272M30808.f39742, c4701);
        ArrayList arrayList = new ArrayList();
        Iterator itMo6220 = interfaceC6818M52404.mo6218().f41655.mo6220();
        while (itMo6220.hasNext()) {
            C22340 c22340 = (C22340) itMo6220.next();
            int i = c22340.f72397;
            int i2 = c22340.f72395;
            if (i == i2) {
                iM30803 = m30803(c13272M30807, c13272M30808, charSequence, charSequence2, c22340, true);
                iM32237 = iM30803;
            } else {
                iM30803 = c13272M30807.f39743[i];
                iM32237 = c13272M30807.m32237(i2 - 1);
            }
            int i3 = c22340.f72398;
            int i4 = c22340.f72396;
            if (i3 == i4) {
                iM30804 = m30803(c13272M30807, c13272M30808, charSequence, charSequence2, c22340, false);
                iM32238 = iM30804;
            } else {
                iM30804 = c13272M30808.f39743[i3];
                iM32238 = c13272M30808.m32237(i4 - 1);
            }
            arrayList.add(new C22340(iM30803, iM32237, iM30804, iM32238));
        }
        return C23751.m52400(arrayList, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m30808(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        c4701.m13775();
        C13272 c13272M30809 = m30809(charSequence);
        C13272 c13272M308010 = m30809(charSequence2);
        InterfaceC6818 interfaceC6818M52404 = C23751.m52404(c13272M30809.f39742, c13272M308010.f39742, c4701);
        C18107 c18107 = new C18107(charSequence.length(), charSequence2.length());
        for (C22340 c22340 : interfaceC6818M52404.mo6219()) {
            int i = c22340.f72395;
            int i2 = c22340.f72397;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                c18107.m40750(c13272M30809.f39743[i2 + i4], c13272M308010.f39743[c22340.f72398 + i4], 1);
            }
        }
        return C23751.m52403(c18107.m42227());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30803(C13272 c13272, C13272 c13273, CharSequence charSequence, CharSequence charSequence2, C22340 c22340, boolean z) {
        int i = c22340.f72397;
        int iM32237 = i == 0 ? 0 : c13272.m32237(i - 1);
        int i2 = c22340.f72398;
        int iM32238 = i2 == 0 ? 0 : c13273.m32237(i2 - 1);
        return (z ? iM32237 : iM32238) + C3374.m10306(charSequence, charSequence2, iM32237, iM32238, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m30805(CharSequence charSequence) {
        C15859 c15859 = new C15859(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            c15859.add(iCodePointAt);
            i += iCharCount;
        }
        return c15859.mo3586();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13272 m30807(CharSequence charSequence) {
        C15859 c15859 = new C15859(charSequence.length());
        C15859 c158510 = new C15859(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            if (iCodePointAt >= 128 || !C11250.m27828((char) iCodePointAt)) {
                c15859.add(iCodePointAt);
                c158510.add(i);
            }
            i += iCharCount;
        }
        return new C13272(c15859.mo3586(), c158510.mo3586());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13272 m30809(CharSequence charSequence) {
        C15859 c15859 = new C15859(charSequence.length());
        C15859 c158510 = new C15859(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (C3374.m10308(cCharAt)) {
                c15859.add(cCharAt);
                c158510.add(i);
            }
        }
        return new C13272(c15859.mo3586(), c158510.mo3586());
    }
}
