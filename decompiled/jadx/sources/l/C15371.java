package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6O3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15371 {
    /* JADX WARN: Code duplicated, block: B:142:0x0181 A[EDGE_INSN: B:142:0x0181->B:98:0x0181 BREAK  A[LOOP:1: B:133:0x0057->B:92:0x016d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0157 A[Catch: ᩴܰۢ -> 0x017a, TryCatch #2 {ᩴܰۢ -> 0x017a, blocks: (B:9:0x0057, B:11:0x005f, B:14:0x006c, B:16:0x0072, B:19:0x0083, B:21:0x0093, B:23:0x009b, B:36:0x00b3, B:41:0x00bf, B:50:0x00d2, B:52:0x00d8, B:54:0x00de, B:56:0x00ea, B:58:0x00f2, B:60:0x00fa, B:62:0x0102, B:67:0x010e, B:71:0x011a, B:72:0x0121, B:75:0x012d, B:78:0x013b, B:81:0x0149, B:85:0x0157, B:87:0x015d, B:92:0x016d, B:90:0x016a, B:29:0x00a6, B:93:0x0171, B:94:0x0179), top: B:133:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x015d A[Catch: ᩴܰۢ -> 0x017a, TryCatch #2 {ᩴܰۢ -> 0x017a, blocks: (B:9:0x0057, B:11:0x005f, B:14:0x006c, B:16:0x0072, B:19:0x0083, B:21:0x0093, B:23:0x009b, B:36:0x00b3, B:41:0x00bf, B:50:0x00d2, B:52:0x00d8, B:54:0x00de, B:56:0x00ea, B:58:0x00f2, B:60:0x00fa, B:62:0x0102, B:67:0x010e, B:71:0x011a, B:72:0x0121, B:75:0x012d, B:78:0x013b, B:81:0x0149, B:85:0x0157, B:87:0x015d, B:92:0x016d, B:90:0x016a, B:29:0x00a6, B:93:0x0171, B:94:0x0179), top: B:133:0x0057 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36409(CharSequence charSequence, boolean z, int i, C2569 c2569, C19012 c19012) {
        int iCodePointCount = Character.codePointCount(charSequence, 0, charSequence.length()) + 1;
        int[] iArr = new int[iCodePointCount];
        int iCharCount = 0;
        for (int i2 = 0; i2 < iCodePointCount; i2++) {
            iArr[i2] = iCharCount;
            if (iCharCount < charSequence.length()) {
                iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
            }
        }
        C9625 c9625 = new C9625(new C3980(new C11837(charSequence, new RunnableC6802(c2569)), c2569), c2569);
        c9625.m43458();
        c9625.m43456(new C8317());
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = 0;
        int i4 = 0;
        boolean z2 = true;
        boolean zEquals = false;
        while (true) {
            try {
                c2569.m8120();
                if (i3 >= 200000) {
                    throw C5391.m15357(EnumC0451.LIMIT, "Token count limit exceeded");
                }
                InterfaceC0463 interfaceC0463NextToken = c9625.nextToken();
                int type = interfaceC0463NextToken.getType();
                if (type == -1) {
                    if (i4 != 0 || !arrayDeque.isEmpty()) {
                        break;
                        break;
                    } else {
                        arrayList.add(Integer.valueOf(charSequence.length()));
                        break;
                    }
                }
                if (type == 103) {
                    String strTrim = interfaceC0463NextToken.getText().trim();
                    if (strTrim.equals("# fmt: off") || strTrim.equals("# fmt: on")) {
                        c19012.append(charSequence);
                        return;
                    }
                }
                if (type == 5 || type == 8) {
                    i4++;
                }
                if (type == 7 || type == 10) {
                    i4--;
                } else {
                    if (i4 <= 0 && interfaceC0463NextToken.mo2050() == 0) {
                        if (type != 102) {
                            if (type != 2 && type != 3) {
                                if (z2 && arrayDeque.isEmpty() && interfaceC0463NextToken.mo2049() == 0) {
                                    String text = interfaceC0463NextToken.getText();
                                    boolean z3 = text.equals("elif") || text.equals("else") || text.equals("except") || text.equals("finally") || text.equals("case");
                                    int i5 = iArr[interfaceC0463NextToken.mo2054()];
                                    if (i5 > 0 && !z3 && !zEquals) {
                                        arrayList.add(Integer.valueOf(i5));
                                    }
                                    zEquals = text.equals("@");
                                }
                                if (type == 12) {
                                    arrayDeque.push(15);
                                } else if (type == 13) {
                                    arrayDeque.push(16);
                                } else if (type == 14) {
                                    arrayDeque.push(17);
                                } else if (type == 15) {
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else if (((Integer) arrayDeque.pop()).intValue() != type) {
                                        break;
                                    }
                                } else if (type == 16 || type == 17) {
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                        break;
                                    } else if (((Integer) arrayDeque.pop()).intValue() != type) {
                                        break;
                                        break;
                                    }
                                }
                            }
                        } else if (arrayDeque.isEmpty()) {
                            z2 = true;
                        }
                    }
                    i3++;
                }
                z2 = false;
                i3++;
            } catch (C18797 e) {
                if (e.f59329 != EnumC0451.SYNTAX) {
                    throw e;
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            c2569.m8120();
            CharSequence c13130 = new C13130(i6, iIntValue, charSequence);
            C19012 c19012M43853 = c19012.m43853();
            try {
                try {
                    C5391.m15359(c13130, z, i, c2569, c19012M43853);
                    c13130 = c19012M43853;
                } catch (C18797 e2) {
                    if (e2.f59329 == EnumC0451.LIMIT) {
                        throw e2;
                    }
                }
                c19012.append(c13130);
                c19012M43853.close();
                if (c19012.length() > 1048576) {
                    throw C5391.m15357(EnumC0451.LIMIT, "Formatted source length limit exceeded");
                }
                i6 = iIntValue;
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
        c19012.m43854(i6, charSequence.length(), charSequence);
        if (c19012.length() > 1048576) {
            throw C5391.m15357(EnumC0451.LIMIT, "Formatted source length limit exceeded");
        }
        c2569.m8120();
    }
}
