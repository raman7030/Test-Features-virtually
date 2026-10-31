package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15042 {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35583(CharSequence charSequence, C3463 c3463, String str, C4460 c4460, C19012 c19012) {
        boolean[] zArr;
        int i;
        int i2;
        C7988 c7988;
        int iMax;
        boolean z;
        try {
            ArrayList<InterfaceC0463> arrayListM6210 = C12221.m29713(charSequence, c4460).m6210();
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            InterfaceC0463 interfaceC0463 = null;
            int i3 = 0;
            boolean z2 = true;
            try {
                for (InterfaceC0463 interfaceC0464 : arrayListM6210) {
                    c4460.m13206();
                    int type = interfaceC0464.getType();
                    if (type != -1) {
                        if (interfaceC0464.mo2050() == 0) {
                            if (arrayDeque.isEmpty() && interfaceC0463 != null && interfaceC0463.mo2054() >= i3 && ((type == 18 || type == 10 || type == 7 || type == 14 || type == 8 || type == 5 || type == 21 || type == 3 || type == 4) && C11516.m28344(interfaceC0463.mo2053() + 1, interfaceC0464.mo2054(), charSequence))) {
                                for (int iMo2054 = interfaceC0464.mo2054(); iMo2054 > i3; iMo2054--) {
                                    char cCharAt = charSequence.charAt(iMo2054 - 1);
                                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != 11) {
                                        if (iMo2054 > i3) {
                                            arrayList.add(new C7988(i3, iMo2054, true));
                                            i3 = iMo2054;
                                        }
                                    }
                                }
                                if (iMo2054 > i3) {
                                    arrayList.add(new C7988(i3, iMo2054, true));
                                    i3 = iMo2054;
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
                                        throw C12221.m29712(EnumC19402.LIMIT, "Recovery nesting limit exceeded");
                                    }
                                    if (type == 1 && arrayDeque.isEmpty()) {
                                        int iMo2053 = interfaceC0464.mo2053() + 1;
                                        arrayList.add(new C7988(i3, iMo2053, true));
                                        i3 = iMo2053;
                                    }
                                    interfaceC0463 = interfaceC0464;
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
                        arrayList.add(new C7988(i3, length, z));
                    }
                    zArr = new boolean[arrayList.size()];
                    i = 0;
                    for (InterfaceC0463 interfaceC0465 : arrayListM6210) {
                        c4460.m13206();
                        if (!C11516.m28345(interfaceC0465)) {
                            while (i < arrayList.size() && interfaceC0465.mo2054() >= ((C7988) arrayList.get(i)).f24667) {
                                i++;
                            }
                            for (iMax = Math.max(0, i - 1); iMax < Math.min(arrayList.size(), i + 2); iMax++) {
                                zArr[iMax] = true;
                            }
                        }
                    }
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        c4460.m13206();
                        c7988 = (C7988) arrayList.get(i2);
                        if (c7988.f24666 || zArr[i2]) {
                            m35582(charSequence, c7988.f24668, c7988.f24667, c4460, c19012);
                        } else {
                            CharSequence c13130 = new C13130(c7988.f24668, c7988.f24667, charSequence);
                            C19012 c19012M43853 = c19012.m43853();
                            try {
                                try {
                                    C12221.m29715(c13130, c3463, str, c4460, c19012M43853);
                                    c13130 = c19012M43853;
                                } catch (C0350 e) {
                                    if (e.f1759 != EnumC19402.SYNTAX) {
                                        throw e;
                                    }
                                }
                                m35582(c13130, 0, c13130.length(), c4460, c19012);
                                c19012M43853.close();
                            } catch (Throwable th) {
                                try {
                                    c19012M43853.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                    C12221.m29714(charSequence, arrayListM6210, c19012, C12221.m29713(c19012, c4460).m6210(), c4460);
                    return;
                }
                C12221.m29714(charSequence, arrayListM6210, c19012, C12221.m29713(c19012, c4460).m6210(), c4460);
                return;
            } catch (C0350 e2) {
                if (e2.f1759 == EnumC19402.SYNTAX) {
                    throw C12221.m29712(EnumC19402.CHANGED, "Formatted output could not be tokenized");
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
                arrayList.add(new C7988(i3, length2, z));
            }
            zArr = new boolean[arrayList.size()];
            i = 0;
            while (r0.hasNext()) {
                c4460.m13206();
                if (!C11516.m28345(interfaceC0465)) {
                    while (i < arrayList.size()) {
                        i++;
                    }
                    while (iMax < Math.min(arrayList.size(), i + 2)) {
                        zArr[iMax] = true;
                    }
                }
            }
            while (i2 < arrayList.size()) {
                c4460.m13206();
                c7988 = (C7988) arrayList.get(i2);
                if (c7988.f24666) {
                    m35582(charSequence, c7988.f24668, c7988.f24667, c4460, c19012);
                } else {
                    m35582(charSequence, c7988.f24668, c7988.f24667, c4460, c19012);
                }
            }
        } catch (C0350 e3) {
            if (e3.f1759 != EnumC19402.SYNTAX) {
                throw e3;
            }
            m35582(charSequence, 0, charSequence.length(), c4460, c19012);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35582(CharSequence charSequence, int i, int i2, C4460 c4460, C19012 c19012) {
        if (i2 - i > 1048576 - c19012.length()) {
            throw C12221.m29712(EnumC19402.LIMIT, "Formatted source length limit exceeded");
        }
        while (i < i2) {
            c4460.m13206();
            int i3 = i + 4096;
            c19012.m43854(i, Math.min(i2, i3), charSequence);
            i = i3;
        }
        c4460.m13206();
    }
}
