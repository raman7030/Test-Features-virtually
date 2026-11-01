package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24204 {
    /* JADX INFO: renamed from: ܿ */
    public static void m53519(C14146 c14146, boolean z) {
        int iLastIndexOf = TextUtils.lastIndexOf(c14146.m32500(), '\n', c14146.m32512() - 1) + 1;
        if (z) {
            c14146.mo27944(c14146.m32508(), iLastIndexOf);
        } else {
            c14146.mo27941(iLastIndexOf);
            c14146.m32464();
        }
        c14146.m32413(iLastIndexOf, false);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53517(C14146 c14146, boolean z) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', c14146.m32512());
        if (iIndexOf == -1) {
            iIndexOf = interfaceC9768M32500.length();
        }
        if (z) {
            c14146.mo27944(c14146.m32508(), iIndexOf);
        } else {
            c14146.mo27941(iIndexOf);
            c14146.m32464();
        }
        c14146.m32413(iIndexOf, false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m53521(C14146 c14146, boolean z) {
        if (z) {
            c14146.mo27944(c14146.m32508(), 0);
        } else {
            c14146.mo27941(0);
            c14146.m32464();
        }
        c14146.m32413(0, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53514(C14146 c14146, boolean z) {
        int iM32590 = c14146.m32590();
        if (z) {
            c14146.mo27944(c14146.m32508(), iM32590);
        } else {
            c14146.mo27941(iM32590);
            c14146.m32464();
        }
        c14146.m32413(iM32590, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53506(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', i2);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC9768M32500.length();
        }
        c14146.mo27944(iLastIndexOf, iIndexOf);
        String strMo28590 = interfaceC9768M32500.mo28590(iLastIndexOf, iIndexOf);
        if (!strMo28590.endsWith("\n")) {
            strMo28590 = strMo28590.concat("\n");
        }
        C7050.m16211((CharSequence) strMo28590);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53513(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC9768M32500.length();
        }
        String strMo28590 = interfaceC9768M32500.mo28590(iLastIndexOf, iIndexOf);
        if (!strMo28590.endsWith("\n")) {
            strMo28590 = strMo28590.concat("\n");
        }
        C7050.m16211((CharSequence) strMo28590);
        interfaceC9768M32500.delete(iLastIndexOf, iIndexOf);
        c14146.mo27941(iLastIndexOf);
        c14146.m32464();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m53522(C14146 c14146) {
        String strM16227 = C7050.m16227();
        if (strM16227 == null) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (!strM16227.endsWith("\n")) {
            strM16227 = strM16227.concat("\n");
        }
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC9768M32500.length();
        }
        interfaceC9768M32500.replace(iLastIndexOf, iIndexOf, strM16227);
        c14146.mo27941(strM16227.length() + iLastIndexOf);
        c14146.m32464();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m53518(C14146 c14146) {
        int length;
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC9768M32500.length();
            interfaceC9768M32500.append('\n');
            length = interfaceC9768M32500.length();
            iArrM32433[0] = iArrM32433[0] + 1;
            iArrM32433[1] = iArrM32433[1] + 1;
        } else {
            length = iIndexOf;
        }
        int i3 = iIndexOf - iLastIndexOf;
        interfaceC9768M32500.insert(length, interfaceC9768M32500.mo28590(iLastIndexOf, iIndexOf));
        c14146.mo27944(iArrM32433[0] + i3, iArrM32433[1] + i3);
        c14146.m32565(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r1
      0x002c: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:6:0x0023, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ */
    public static void m53520(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        if (interfaceC9768M32500.length() == 0) {
            return;
        }
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', i - 1);
        int i3 = iLastIndexOf + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC9768M32500.length();
            if (i3 <= 0) {
                iLastIndexOf = i3;
            }
        } else {
            iLastIndexOf = i3;
        }
        interfaceC9768M32500.delete(iLastIndexOf, iIndexOf);
        c14146.mo27941(iLastIndexOf);
        c14146.m32464();
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m53515(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC9768M32500.length();
        }
        int i3 = 0;
        for (int i4 = iLastIndexOf; i4 < iIndexOf; i4++) {
            if (interfaceC9768M32500.charAt(i4) == '\n') {
                i3++;
            }
        }
        int i5 = iIndexOf == interfaceC9768M32500.length() ? iLastIndexOf + i3 : (iLastIndexOf + i3) - 1;
        interfaceC9768M32500.replace(iLastIndexOf, iIndexOf, C11567.m26621('\n', i3));
        c14146.mo27941(i5);
        c14146.m32565(false);
        c14146.m32464();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53508(C14146 c14146, boolean z) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        if (i == i2) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        String strMo28590 = interfaceC9768M32500.mo28590(i, i2);
        interfaceC9768M32500.replace(i, i2, z ? strMo28590.toUpperCase() : strMo28590.toLowerCase());
        c14146.m32565(false);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m53523(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iM26497 = c14146.f40262.m26497();
        String str = "\t";
        if (i == i2) {
            if (c14146.m32593()) {
                interfaceC9768M32500.insert(i, "\t");
                return;
            }
            int i3 = 0;
            for (int iM53512 = m53512(i, interfaceC9768M32500); iM53512 < i; iM53512++) {
                i3 = interfaceC9768M32500.charAt(iM53512) == '\t' ? 0 : i3 + 1;
            }
            char[] cArr = new char[iM26497 - (i3 % iM26497)];
            Arrays.fill(cArr, ' ');
            interfaceC9768M32500.insert(i, new String(cArr));
            return;
        }
        if (!c14146.m32593()) {
            char[] cArr2 = new char[iM26497];
            Arrays.fill(cArr2, ' ');
            str = new String(cArr2);
        }
        interfaceC9768M32500.insert(m53512(i, interfaceC9768M32500), str);
        int length = str.length() + i;
        int length2 = str.length() + i2;
        int iM53504 = m53504(length, interfaceC9768M32500);
        while (true) {
            int i4 = iM53504 + 1;
            if (i4 <= length2) {
                interfaceC9768M32500.insert(i4, str);
                iM53504 = m53504(i4, interfaceC9768M32500);
                length2 += str.length();
            } else {
                c14146.mo27944(length, length2);
                c14146.m32565(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53516(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        int i2 = iArrM32433[1];
        int iM26497 = c14146.f40262.m26497();
        int iM53512 = m53512(i, interfaceC9768M32500);
        int iM53505 = m53505(interfaceC9768M32500, iM53512, iM26497);
        int iM53504 = m53504(iM53512, interfaceC9768M32500);
        int i3 = iM53512 + iM53505;
        int i4 = i >= i3 ? i - iM53505 : iM53512;
        if (i2 >= i3) {
            iM53512 = i2 - iM53505;
        }
        while (true) {
            int i5 = iM53504 + 1;
            if (i5 <= iM53512) {
                int iM53506 = m53505(interfaceC9768M32500, i5, iM26497);
                iM53504 = m53504(i5, interfaceC9768M32500);
                iM53512 = iM53512 >= i5 + iM53506 ? iM53512 - iM53506 : i5;
            } else {
                c14146.mo27944(i4, iM53512);
                c14146.m32565(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53505(InterfaceC9768 interfaceC9768, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if (i5 >= interfaceC9768.length()) {
                break;
            }
            char cCharAt = interfaceC9768.charAt(i5);
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
            interfaceC9768.delete(i, i + i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53507(final C14146 c14146, final C15113 c15113) {
        InterfaceC20853 interfaceC20853;
        InterfaceC20853 interfaceC20854;
        final InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        final int iM32508 = c14146.m32508();
        try {
            if (!interfaceC9768M32500.mo3994(new Runnable() { // from class: l.ۤۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14146 c14147 = c14146;
                    c14147.m32565(true);
                    InterfaceC9768 interfaceC9768 = interfaceC9768M32500;
                    int length = interfaceC9768.length();
                    C15113 c15114 = c15113;
                    interfaceC9768.replace(0, length, c15114);
                    c14147.mo27941(Math.min(iM32508, c15114.length()));
                    c14147.m32565(false);
                }
            })) {
                throw new IllegalStateException("Text editor is not ready for formatted output");
            }
            if (c14146.m32500() == interfaceC9768M32500 && (interfaceC20854 = c14146.f40318) != null) {
                interfaceC20854.mo5043(c14146.m32447(), c14146.m32360());
            }
            c14146.m32464();
        } catch (Throwable th) {
            if (c14146.m32500() == interfaceC9768M32500 && (interfaceC20853 = c14146.f40318) != null) {
                interfaceC20853.mo5043(c14146.m32447(), c14146.m32360());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m53510(C14146 c14146) {
        List arrayList;
        InterfaceC20636 interfaceC20636;
        boolean z;
        List<InterfaceC20636> listM32462 = c14146.m32462();
        if (listM32462.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int[] iArrM32433 = c14146.m32433();
        int i = iArrM32433[0];
        boolean z2 = i == iArrM32433[1];
        int iM53512 = m53512(i, interfaceC9768M32500);
        int iM53504 = m53504(iArrM32433[0], interfaceC9768M32500);
        C17441 c17441 = new C17441();
        C17441 c17442 = new C17441();
        c17441.add(iM53512);
        c17442.add(iM53504);
        int i2 = 1;
        while (true) {
            int i3 = iM53504 + 1;
            if (i3 > iArrM32433[1]) {
                break;
            }
            int iM53505 = m53504(i3, interfaceC9768M32500);
            c17441.add(i3);
            c17442.add(iM53505);
            i2++;
            iM53504 = iM53505;
        }
        if (listM32462.size() == 1) {
            arrayList = listM32462;
        } else {
            arrayList = new ArrayList(listM32462);
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                interfaceC20636 = null;
                z = false;
                break;
            }
            interfaceC20636 = (InterfaceC20636) it.next();
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = true;
                    break loop1;
                } else if (!interfaceC20636.mo3709(interfaceC9768M32500, c17441.getInt(i4), c17442.getInt(i4))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (interfaceC20636 == null) {
            for (InterfaceC20636 interfaceC20637 : listM32462) {
                if (interfaceC20637 instanceof C2529) {
                    interfaceC20636 = interfaceC20637;
                    break;
                }
            }
            if (interfaceC20636 == null) {
                interfaceC20636 = (InterfaceC20636) listM32462.get(0);
            }
        }
        C23141 c23141M22790 = interfaceC9768M32500.m22790();
        int iMo3710 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = c17441.getInt(i5) + iMo3710;
            int i7 = c17442.getInt(i5) + iMo3710;
            if (z) {
                iMo3710 -= interfaceC20636.mo3708(c23141M22790, i6, i7, iArrM32433);
            } else {
                iMo3710 = interfaceC20636.mo3710(c23141M22790, i6, i7, iArrM32433) + iMo3710;
            }
            if (i2 % 500 == 0) {
                c23141M22790.m51595();
            }
        }
        c23141M22790.m51595();
        if (z2) {
            int i8 = iArrM32433[0];
            int iM53506 = m53504(i8, interfaceC9768M32500) + 1;
            c14146.mo27941(Math.min((i8 - m53512(i8, interfaceC9768M32500)) + iM53506, m53504(iM53506, interfaceC9768M32500)));
            c14146.m32464();
        } else {
            c14146.mo27944(iArrM32433[0], iArrM32433[1]);
        }
        c14146.m32565(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m53512(int i, CharSequence charSequence) {
        return TextUtils.lastIndexOf(charSequence, '\n', i - 1) + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53504(int i, CharSequence charSequence) {
        int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
        return iIndexOf == -1 ? charSequence.length() : iIndexOf;
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m53509(C14146 c14146) {
        InterfaceC18702 interfaceC18702M20545 = c14146.f40252.m20545();
        if (interfaceC18702M20545 == null) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            new C8111(c14146, (AbstractActivityC5549) C7453.m17221(c14146.getContext()), interfaceC18702M20545).m22250();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m53511(C14146 c14146) {
        InterfaceC8644 interfaceC8644M20541 = c14146.f40252.m20541();
        if (interfaceC8644M20541 == null) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            new C13476(c14146, (AbstractActivityC5549) C7453.m17221(c14146.getContext()), interfaceC8644M20541).m22250();
        }
    }
}
