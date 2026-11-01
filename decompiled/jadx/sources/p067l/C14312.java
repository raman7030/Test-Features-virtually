package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14312 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC8848 m32879(CharSequence charSequence, CharSequence charSequence2, C6836 c6836) {
        c6836.m15650();
        int[] iArrM32880 = m32880(charSequence);
        int[] iArrM32881 = m32880(charSequence2);
        final InterfaceC8848 interfaceC8848M54813 = C24941.m54813(iArrM32880, iArrM32881, c6836);
        C19577 c19577 = new C19577(charSequence.length(), charSequence2.length());
        int i = 0;
        int i2 = 0;
        for (C14882 c14882 : new Iterable() { // from class: l.ۧܳۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C18235(interfaceC8848M54813);
            }
        }) {
            C23600 c23600 = (C23600) c14882.f42436;
            boolean zBooleanValue = ((Boolean) c14882.f42437).booleanValue();
            int i3 = c23600.f75121;
            int iCharCount = 0;
            for (int i4 = c23600.f75123; i4 < i3; i4++) {
                iCharCount += Character.charCount(iArrM32880[i4]);
            }
            int i5 = iCharCount + i;
            int i6 = c23600.f75122;
            int iCharCount2 = 0;
            for (int i7 = c23600.f75124; i7 < i6; i7++) {
                iCharCount2 += Character.charCount(iArrM32881[i7]);
            }
            int i8 = iCharCount2 + i2;
            if (zBooleanValue) {
                c19577.m43009(i, i2, i5, i8);
            }
            i2 = i8;
            i = i5;
        }
        return C24941.m54812(c19577.m44486());
    }

    /* JADX INFO: renamed from: ᩳ */
    public static InterfaceC8848 m32885(CharSequence charSequence, CharSequence charSequence2, C6836 c6836) {
        c6836.m15650();
        C14982 c14982M32882 = m32882(charSequence);
        C14982 c14982M32883 = m32882(charSequence2);
        return new C11611(c14982M32882, c14982M32883, charSequence, charSequence2, C24941.m54813(c14982M32882.f42807, c14982M32883.f42807, c6836), c6836).m40171();
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC4154 m32881(CharSequence charSequence, CharSequence charSequence2, C6836 c6836) {
        int iM32878;
        int iM34336;
        int iM32879;
        int iM34337;
        c6836.m15650();
        C14982 c14982M32882 = m32882(charSequence);
        C14982 c14982M32883 = m32882(charSequence2);
        InterfaceC8848 interfaceC8848M54813 = C24941.m54813(c14982M32882.f42807, c14982M32883.f42807, c6836);
        ArrayList arrayList = new ArrayList();
        Iterator itMo8422 = interfaceC8848M54813.mo8420().f44736.mo8422();
        while (itMo8422.hasNext()) {
            C23600 c23600 = (C23600) itMo8422.next();
            int i = c23600.f75123;
            int i2 = c23600.f75121;
            if (i == i2) {
                iM32878 = m32878(c14982M32882, c14982M32883, charSequence, charSequence2, c23600, true);
                iM34336 = iM32878;
            } else {
                iM32878 = c14982M32882.f42808[i];
                iM34336 = c14982M32882.m34336(i2 - 1);
            }
            int i3 = c23600.f75124;
            int i4 = c23600.f75122;
            if (i3 == i4) {
                iM32879 = m32878(c14982M32882, c14982M32883, charSequence, charSequence2, c23600, false);
                iM34337 = iM32879;
            } else {
                iM32879 = c14982M32883.f42808[i3];
                iM34337 = c14982M32883.m34336(i4 - 1);
            }
            arrayList.add(new C23600(iM32878, iM34336, iM32879, iM34337));
        }
        return C24941.m54809(arrayList, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC8848 m32883(CharSequence charSequence, CharSequence charSequence2, C6836 c6836) {
        c6836.m15650();
        C14982 c14982M32884 = m32884(charSequence);
        C14982 c14982M32885 = m32884(charSequence2);
        InterfaceC8848 interfaceC8848M54813 = C24941.m54813(c14982M32884.f42807, c14982M32885.f42807, c6836);
        C19577 c19577 = new C19577(charSequence.length(), charSequence2.length());
        for (C23600 c23600 : interfaceC8848M54813.mo8421()) {
            int i = c23600.f75121;
            int i2 = c23600.f75123;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                c19577.m43007(c14982M32884.f42808[i2 + i4], c14982M32885.f42808[c23600.f75124 + i4], 1);
            }
        }
        return C24941.m54812(c19577.m44486());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m32878(C14982 c14982, C14982 c14983, CharSequence charSequence, CharSequence charSequence2, C23600 c23600, boolean z) {
        int i = c23600.f75123;
        int iM34336 = i == 0 ? 0 : c14982.m34336(i - 1);
        int i2 = c23600.f75124;
        int iM34337 = i2 == 0 ? 0 : c14983.m34336(i2 - 1);
        return (z ? iM34336 : iM34337) + C5575.m12343(charSequence, charSequence2, iM34336, iM34337, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m32880(CharSequence charSequence) {
        C17441 c17441 = new C17441(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            c17441.add(iCodePointAt);
            i += iCharCount;
        }
        return c17441.mo5873();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14982 m32882(CharSequence charSequence) {
        C17441 c17441 = new C17441(charSequence.length());
        C17441 c17442 = new C17441(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            if (iCodePointAt >= 128 || !C13061.m29890((char) iCodePointAt)) {
                c17441.add(iCodePointAt);
                c17442.add(i);
            }
            i += iCharCount;
        }
        return new C14982(c17441.mo5873(), c17442.mo5873());
    }

    /* JADX INFO: renamed from: ܽ */
    public static C14982 m32884(CharSequence charSequence) {
        C17441 c17441 = new C17441(charSequence.length());
        C17441 c17442 = new C17441(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (C5575.m12345(cCharAt)) {
                c17441.add(cCharAt);
                c17442.add(i);
            }
        }
        return new C14982(c17441.mo5873(), c17442.mo5873());
    }
}
