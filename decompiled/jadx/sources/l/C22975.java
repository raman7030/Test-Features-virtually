package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22975 {
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m51127(C12392 c12392, boolean z) {
        int iLastIndexOf = TextUtils.lastIndexOf(c12392.m30436(), '\n', c12392.m30448() - 1) + 1;
        if (z) {
            c12392.mo25922(c12392.m30444(), iLastIndexOf);
        } else {
            c12392.mo25919(iLastIndexOf);
            c12392.m30400();
        }
        c12392.m30349(iLastIndexOf, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51125(C12392 c12392, boolean z) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', c12392.m30448());
        if (iIndexOf == -1) {
            iIndexOf = interfaceC7785M30436.length();
        }
        if (z) {
            c12392.mo25922(c12392.m30444(), iIndexOf);
        } else {
            c12392.mo25919(iIndexOf);
            c12392.m30400();
        }
        c12392.m30349(iIndexOf, false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m51129(C12392 c12392, boolean z) {
        if (z) {
            c12392.mo25922(c12392.m30444(), 0);
        } else {
            c12392.mo25919(0);
            c12392.m30400();
        }
        c12392.m30349(0, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51122(C12392 c12392, boolean z) {
        int iM30526 = c12392.m30526();
        if (z) {
            c12392.mo25922(c12392.m30444(), iM30526);
        } else {
            c12392.mo25919(iM30526);
            c12392.m30400();
        }
        c12392.m30349(iM30526, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51114(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', i2);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC7785M30436.length();
        }
        c12392.mo25922(iLastIndexOf, iIndexOf);
        String strMo26557 = interfaceC7785M30436.mo26557(iLastIndexOf, iIndexOf);
        if (!strMo26557.endsWith("\n")) {
            strMo26557 = strMo26557.concat("\n");
        }
        C4925.m14314((CharSequence) strMo26557);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51121(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC7785M30436.length();
        }
        String strMo26557 = interfaceC7785M30436.mo26557(iLastIndexOf, iIndexOf);
        if (!strMo26557.endsWith("\n")) {
            strMo26557 = strMo26557.concat("\n");
        }
        C4925.m14314((CharSequence) strMo26557);
        interfaceC7785M30436.delete(iLastIndexOf, iIndexOf);
        c12392.mo25919(iLastIndexOf);
        c12392.m30400();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51130(C12392 c12392) {
        String strM14330 = C4925.m14330();
        if (strM14330 == null) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (!strM14330.endsWith("\n")) {
            strM14330 = strM14330.concat("\n");
        }
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC7785M30436.length();
        }
        interfaceC7785M30436.replace(iLastIndexOf, iIndexOf, strM14330);
        c12392.mo25919(strM14330.length() + iLastIndexOf);
        c12392.m30400();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m51126(C12392 c12392) {
        int length;
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC7785M30436.length();
            interfaceC7785M30436.append('\n');
            length = interfaceC7785M30436.length();
            iArrM30369[0] = iArrM30369[0] + 1;
            iArrM30369[1] = iArrM30369[1] + 1;
        } else {
            length = iIndexOf;
        }
        int i3 = iIndexOf - iLastIndexOf;
        interfaceC7785M30436.insert(length, interfaceC7785M30436.mo26557(iLastIndexOf, iIndexOf));
        c12392.mo25922(iArrM30369[0] + i3, iArrM30369[1] + i3);
        c12392.m30501(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r1
      0x002c: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:6:0x0023, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m51128(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        if (interfaceC7785M30436.length() == 0) {
            return;
        }
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', i - 1);
        int i3 = iLastIndexOf + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC7785M30436.length();
            if (i3 <= 0) {
                iLastIndexOf = i3;
            }
        } else {
            iLastIndexOf = i3;
        }
        interfaceC7785M30436.delete(iLastIndexOf, iIndexOf);
        c12392.mo25919(iLastIndexOf);
        c12392.m30400();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m51123(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC7785M30436.length();
        }
        int i3 = 0;
        for (int i4 = iLastIndexOf; i4 < iIndexOf; i4++) {
            if (interfaceC7785M30436.charAt(i4) == '\n') {
                i3++;
            }
        }
        int i5 = iIndexOf == interfaceC7785M30436.length() ? iLastIndexOf + i3 : (iLastIndexOf + i3) - 1;
        interfaceC7785M30436.replace(iLastIndexOf, iIndexOf, C9679.m24607('\n', i3));
        c12392.mo25919(i5);
        c12392.m30501(false);
        c12392.m30400();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51116(C12392 c12392, boolean z) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        if (i == i2) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        String strMo26557 = interfaceC7785M30436.mo26557(i, i2);
        interfaceC7785M30436.replace(i, i2, z ? strMo26557.toUpperCase() : strMo26557.toLowerCase());
        c12392.m30501(false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m51131(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iM24485 = c12392.f37245.m24485();
        String str = "\t";
        if (i == i2) {
            if (c12392.m30529()) {
                interfaceC7785M30436.insert(i, "\t");
                return;
            }
            int i3 = 0;
            for (int iM51120 = m51120(i, interfaceC7785M30436); iM51120 < i; iM51120++) {
                i3 = interfaceC7785M30436.charAt(iM51120) == '\t' ? 0 : i3 + 1;
            }
            char[] cArr = new char[iM24485 - (i3 % iM24485)];
            Arrays.fill(cArr, ' ');
            interfaceC7785M30436.insert(i, new String(cArr));
            return;
        }
        if (!c12392.m30529()) {
            char[] cArr2 = new char[iM24485];
            Arrays.fill(cArr2, ' ');
            str = new String(cArr2);
        }
        interfaceC7785M30436.insert(m51120(i, interfaceC7785M30436), str);
        int length = str.length() + i;
        int length2 = str.length() + i2;
        int iM51112 = m51112(length, interfaceC7785M30436);
        while (true) {
            int i4 = iM51112 + 1;
            if (i4 <= length2) {
                interfaceC7785M30436.insert(i4, str);
                iM51112 = m51112(i4, interfaceC7785M30436);
                length2 += str.length();
            } else {
                c12392.mo25922(length, length2);
                c12392.m30501(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51124(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        int i2 = iArrM30369[1];
        int iM24485 = c12392.f37245.m24485();
        int iM51120 = m51120(i, interfaceC7785M30436);
        int iM51113 = m51113(interfaceC7785M30436, iM51120, iM24485);
        int iM51112 = m51112(iM51120, interfaceC7785M30436);
        int i3 = iM51120 + iM51113;
        int i4 = i >= i3 ? i - iM51113 : iM51120;
        if (i2 >= i3) {
            iM51120 = i2 - iM51113;
        }
        while (true) {
            int i5 = iM51112 + 1;
            if (i5 <= iM51120) {
                int iM51114 = m51113(interfaceC7785M30436, i5, iM24485);
                iM51112 = m51112(i5, interfaceC7785M30436);
                iM51120 = iM51120 >= i5 + iM51114 ? iM51120 - iM51114 : i5;
            } else {
                c12392.mo25922(i4, iM51120);
                c12392.m30501(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51113(InterfaceC7785 interfaceC7785, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if (i5 >= interfaceC7785.length()) {
                break;
            }
            char cCharAt = interfaceC7785.charAt(i5);
            if (cCharAt != ' ') {
                if (cCharAt != '\t') {
                    break;
                }
                i3++;
                break;
            }
            i3++;
        }
        if (i3 != 0) {
            interfaceC7785.delete(i, i + i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51115(final C12392 c12392, final C13409 c13409) {
        InterfaceC19449 interfaceC19449;
        InterfaceC19449 interfaceC194410;
        final InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        final int iM30444 = c12392.m30444();
        try {
            if (!interfaceC7785M30436.mo1596(new Runnable() { // from class: l.ۤۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392 c12393 = c12392;
                    c12393.m30501(true);
                    InterfaceC7785 interfaceC7785 = interfaceC7785M30436;
                    int length = interfaceC7785.length();
                    C13409 c134010 = c13409;
                    interfaceC7785.replace(0, length, c134010);
                    c12393.mo25919(Math.min(iM30444, c134010.length()));
                    c12393.m30501(false);
                }
            })) {
                throw new IllegalStateException("Text editor is not ready for formatted output");
            }
            if (c12392.m30436() == interfaceC7785M30436 && (interfaceC194410 = c12392.f37301) != null) {
                interfaceC194410.mo2704(c12392.m30383(), c12392.m30296());
            }
            c12392.m30400();
        } catch (Throwable th) {
            if (c12392.m30436() == interfaceC7785M30436 && (interfaceC19449 = c12392.f37301) != null) {
                interfaceC19449.mo2704(c12392.m30383(), c12392.m30296());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m51118(C12392 c12392) {
        List arrayList;
        InterfaceC19221 interfaceC19221;
        boolean z;
        List<InterfaceC19221> listM30398 = c12392.m30398();
        if (listM30398.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int[] iArrM30369 = c12392.m30369();
        int i = iArrM30369[0];
        boolean z2 = i == iArrM30369[1];
        int iM51120 = m51120(i, interfaceC7785M30436);
        int iM51112 = m51112(iArrM30369[0], interfaceC7785M30436);
        C15859 c15859 = new C15859();
        C15859 c158510 = new C15859();
        c15859.add(iM51120);
        c158510.add(iM51112);
        int i2 = 1;
        while (true) {
            int i3 = iM51112 + 1;
            if (i3 > iArrM30369[1]) {
                break;
            }
            int iM51113 = m51112(i3, interfaceC7785M30436);
            c15859.add(i3);
            c158510.add(iM51113);
            i2++;
            iM51112 = iM51113;
        }
        if (listM30398.size() == 1) {
            arrayList = listM30398;
        } else {
            arrayList = new ArrayList(listM30398);
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                interfaceC19221 = null;
                z = false;
                break;
            }
            interfaceC19221 = (InterfaceC19221) it.next();
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = true;
                    break loop1;
                } else if (!interfaceC19221.mo1301(interfaceC7785M30436, c15859.getInt(i4), c158510.getInt(i4))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (interfaceC19221 == null) {
            for (InterfaceC19221 interfaceC19222 : listM30398) {
                if (interfaceC19222 instanceof C0169) {
                    interfaceC19221 = interfaceC19222;
                    break;
                }
            }
            if (interfaceC19221 == null) {
                interfaceC19221 = (InterfaceC19221) listM30398.get(0);
            }
        }
        C21856 c21856M20809 = interfaceC7785M30436.m20809();
        int iMo1302 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = c15859.getInt(i5) + iMo1302;
            int i7 = c158510.getInt(i5) + iMo1302;
            if (z) {
                iMo1302 -= interfaceC19221.mo1300(c21856M20809, i6, i7, iArrM30369);
            } else {
                iMo1302 = interfaceC19221.mo1302(c21856M20809, i6, i7, iArrM30369) + iMo1302;
            }
            if (i2 % 500 == 0) {
                c21856M20809.m49244();
            }
        }
        c21856M20809.m49244();
        if (z2) {
            int i8 = iArrM30369[0];
            int iM51114 = m51112(i8, interfaceC7785M30436) + 1;
            c12392.mo25919(Math.min((i8 - m51120(i8, interfaceC7785M30436)) + iM51114, m51112(iM51114, interfaceC7785M30436)));
            c12392.m30400();
        } else {
            c12392.mo25922(iArrM30369[0], iArrM30369[1]);
        }
        c12392.m30501(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m51120(int i, CharSequence charSequence) {
        return TextUtils.lastIndexOf(charSequence, '\n', i - 1) + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51112(int i, CharSequence charSequence) {
        int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
        return iIndexOf == -1 ? charSequence.length() : iIndexOf;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m51117(C12392 c12392) {
        InterfaceC17186 interfaceC17186M18596 = c12392.f37235.m18596();
        if (interfaceC17186M18596 == null) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            new C6042(c12392, (AbstractActivityC3346) C5350.m15313(c12392.getContext()), interfaceC17186M18596).m20274();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m51119(C12392 c12392) {
        InterfaceC6603 interfaceC6603M18592 = c12392.f37235.m18592();
        if (interfaceC6603M18592 == null) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            new C11687(c12392, (AbstractActivityC3346) C5350.m15313(c12392.getContext()), interfaceC6603M18592).m20274();
        }
    }
}
