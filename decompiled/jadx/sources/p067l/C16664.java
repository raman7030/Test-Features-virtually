package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16664 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0184  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d8 A[LOOP:4: B:117:0x01cc->B:119:0x01d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0236  */
    /* JADX WARN: Code duplicated, block: B:187:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0174  */
    /* JADX INFO: renamed from: ֫ */
    public static void m37740(CharSequence charSequence, C5660 c5660, String str, C6607 c6607, C20438 c20438) {
        boolean[] zArr;
        int i;
        int i2;
        C9960 c9960;
        int iMax;
        boolean z;
        try {
            ArrayList<InterfaceC2808> arrayListM8412 = C13983.m31775(charSequence, c6607).m8412();
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            InterfaceC2808 interfaceC2808 = null;
            int i3 = 0;
            boolean z2 = true;
            try {
                for (InterfaceC2808 interfaceC2809 : arrayListM8412) {
                    c6607.m15087();
                    int type = interfaceC2809.getType();
                    if (type != -1) {
                        if (interfaceC2809.mo4430() == 0) {
                            if (arrayDeque.isEmpty() && interfaceC2808 != null && interfaceC2808.mo4434() >= i3 && ((type == 18 || type == 10 || type == 7 || type == 14 || type == 8 || type == 5 || type == 21 || type == 3 || type == 4) && C13313.m30390(interfaceC2808.mo4433() + 1, interfaceC2809.mo4434(), charSequence))) {
                                for (int iMo4434 = interfaceC2809.mo4434(); iMo4434 > i3; iMo4434--) {
                                    char cCharAt = charSequence.charAt(iMo4434 - 1);
                                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != 11) {
                                        if (iMo4434 > i3) {
                                            arrayList.add(new C9960(i3, iMo4434, true));
                                            i3 = iMo4434;
                                        }
                                    }
                                }
                                if (iMo4434 > i3) {
                                    arrayList.add(new C9960(i3, iMo4434, true));
                                    i3 = iMo4434;
                                }
                            }
                            if (type == 21 && arrayDeque.isEmpty()) {
                                z2 = false;
                            } else {
                                if (type == 17) {
                                    arrayDeque.push(6);
                                } else if (type == 30) {
                                    arrayDeque.push(31);
                                } else if (type != 31) {
                                    switch (type) {
                                        case 5:
                                            if (!arrayDeque.isEmpty() && (((Integer) arrayDeque.peek()).intValue() == 14 || ((Integer) arrayDeque.peek()).intValue() == 7)) {
                                                arrayDeque.pop();
                                            }
                                            arrayDeque.push(6);
                                            break;
                                        case 6:
                                        case 9:
                                            if (arrayDeque.isEmpty() || ((Integer) arrayDeque.pop()).intValue() != type) {
                                                z2 = false;
                                            }
                                            break;
                                        case 7:
                                        case 14:
                                            arrayDeque.push(Integer.valueOf(type));
                                            break;
                                        case 8:
                                            arrayDeque.push(9);
                                            break;
                                        case 10:
                                            arrayDeque.push(6);
                                            break;
                                        case 11:
                                        case 12:
                                        case 13:
                                            if (arrayDeque.isEmpty()) {
                                                z2 = false;
                                            }
                                            break;
                                        default:
                                            switch (type) {
                                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                                    arrayDeque.push(46);
                                                    break;
                                                case 46:
                                                case 48:
                                                    if (arrayDeque.isEmpty()) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    break;
                                                case 47:
                                                    arrayDeque.push(48);
                                                    break;
                                            }
                                            break;
                                    }
                                } else if (arrayDeque.isEmpty()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (arrayDeque.size() > 256) {
                                        throw C13983.m31774(EnumC20808.LIMIT, "Recovery nesting limit exceeded");
                                    }
                                    if (type == 1 && arrayDeque.isEmpty()) {
                                        int iMo4433 = interfaceC2809.mo4433() + 1;
                                        arrayList.add(new C9960(i3, iMo4433, true));
                                        i3 = iMo4433;
                                    }
                                    interfaceC2808 = interfaceC2809;
                                }
                            }
                        }
                    }
                    if (i3 < charSequence.length()) {
                        int length = charSequence.length();
                        if (z2 || !arrayDeque.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        arrayList.add(new C9960(i3, length, z));
                    }
                    zArr = new boolean[arrayList.size()];
                    i = 0;
                    for (InterfaceC2808 interfaceC28010 : arrayListM8412) {
                        c6607.m15087();
                        if (!C13313.m30391(interfaceC28010)) {
                            while (i < arrayList.size() && interfaceC28010.mo4434() >= ((C9960) arrayList.get(i)).f27580) {
                                i++;
                            }
                            for (iMax = Math.max(0, i - 1); iMax < Math.min(arrayList.size(), i + 2); iMax++) {
                                zArr[iMax] = true;
                            }
                        }
                    }
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        c6607.m15087();
                        c9960 = (C9960) arrayList.get(i2);
                        if (c9960.f27579 || zArr[i2]) {
                            m37739(charSequence, c9960.f27581, c9960.f27580, c6607, c20438);
                        } else {
                            CharSequence c14847 = new C14847(c9960.f27581, c9960.f27580, charSequence);
                            C20438 c20438M46121 = c20438.m46121();
                            try {
                                try {
                                    C13983.m31777(c14847, c5660, str, c6607, c20438M46121);
                                    c14847 = c20438M46121;
                                } catch (C2701 e) {
                                    if (e.f4535 != EnumC20808.SYNTAX) {
                                        throw e;
                                    }
                                }
                                m37739(c14847, 0, c14847.length(), c6607, c20438);
                                c20438M46121.close();
                            } catch (Throwable th) {
                                try {
                                    c20438M46121.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                    C13983.m31776(charSequence, arrayListM8412, c20438, C13983.m31775(c20438, c6607).m8412(), c6607);
                    return;
                }
                C13983.m31776(charSequence, arrayListM8412, c20438, C13983.m31775(c20438, c6607).m8412(), c6607);
                return;
            } catch (C2701 e2) {
                if (e2.f4535 == EnumC20808.SYNTAX) {
                    throw C13983.m31774(EnumC20808.CHANGED, "Formatted output could not be tokenized");
                }
                throw e2;
            }
            if (i3 < charSequence.length()) {
                int length2 = charSequence.length();
                if (z2) {
                    z = false;
                } else {
                    z = false;
                }
                arrayList.add(new C9960(i3, length2, z));
            }
            zArr = new boolean[arrayList.size()];
            i = 0;
            while (r0.hasNext()) {
                c6607.m15087();
                if (!C13313.m30391(interfaceC28010)) {
                    while (i < arrayList.size()) {
                        i++;
                    }
                    while (iMax < Math.min(arrayList.size(), i + 2)) {
                        zArr[iMax] = true;
                    }
                }
            }
            while (i2 < arrayList.size()) {
                c6607.m15087();
                c9960 = (C9960) arrayList.get(i2);
                if (c9960.f27579) {
                    m37739(charSequence, c9960.f27581, c9960.f27580, c6607, c20438);
                } else {
                    m37739(charSequence, c9960.f27581, c9960.f27580, c6607, c20438);
                }
            }
        } catch (C2701 e3) {
            if (e3.f4535 != EnumC20808.SYNTAX) {
                throw e3;
            }
            m37739(charSequence, 0, charSequence.length(), c6607, c20438);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37739(CharSequence charSequence, int i, int i2, C6607 c6607, C20438 c20438) {
        if (i2 - i > 1048576 - c20438.length()) {
            throw C13983.m31774(EnumC20808.LIMIT, "Formatted source length limit exceeded");
        }
        while (i < i2) {
            c6607.m15087();
            int i3 = i + 4096;
            c20438.m46122(i, Math.min(i2, i3), charSequence);
            i = i3;
        }
        c6607.m15087();
    }
}
