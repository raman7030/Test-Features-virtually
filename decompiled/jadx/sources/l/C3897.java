package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3897 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f12468 = {"imports", "symbols", "entries", "relocations"};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m11870(long j) {
        if (j < 0 || j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m11871(String str) {
        return C16014.m37867(str, "\nstrings");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m11872(long j) {
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9542 m11864(C3897 c3897, C2486 c2486, String str, int i, int i2, int i3, int i4, int i5, C8836 c8836, C7333 c7333) {
        c3897.getClass();
        c2486.m7976(str);
        C21536 c21536 = new C21536(C16036.m37907(c7333.f22530, false));
        try {
            C9542 c9542M11862 = m11862(c2486, (InterfaceC2395) c21536, i, i2, i3, i4, i5 - c8836.f26912.size());
            c21536.close();
            return c9542M11862;
        } catch (Throwable th) {
            try {
                c21536.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9542 m11865(C3897 c3897, C2486 c2486, String str, boolean[] zArr, int i, int i2, int i3, int i4, C8836 c8836, C7333 c7333) {
        long j;
        C21536 c21536;
        c3897.getClass();
        c2486.m7976(str);
        C18193 c18193 = c2486.f7932.f75539;
        try {
            if (zArr[0]) {
                int i5 = c18193.f56575;
                int i6 = c18193.f56571;
                if (i5 == i) {
                    if (c18193.f56572 == i2) {
                        if (c18193.f56574 == i3 && i6 >= 0) {
                            c2486.f7933.put(m11871(str), Integer.valueOf(i6));
                            j = c18193.f56573;
                        }
                        long j2 = j;
                        zArr[0] = false;
                        c21536 = new C21536(C16036.m37907(c7333.f22530, true));
                        C9542 c9542M11863 = m11863(c2486, c21536, i, i2, i3, j2, i4 - c8836.f26912.size());
                        c21536.close();
                        return c9542M11863;
                    }
                    j = -1;
                    long j3 = j;
                    zArr[0] = false;
                    c21536 = new C21536(C16036.m37907(c7333.f22530, true));
                    C9542 c9542M11864 = m11863(c2486, c21536, i, i2, i3, j3, i4 - c8836.f26912.size());
                    c21536.close();
                    return c9542M11864;
                }
                j = -1;
                long j4 = j;
                zArr[0] = false;
                c21536 = new C21536(C16036.m37907(c7333.f22530, true));
                C9542 c9542M11865 = m11863(c2486, c21536, i, i2, i3, j4, i4 - c8836.f26912.size());
                c21536.close();
                return c9542M11865;
            }
            C9542 c9542M11866 = m11863(c2486, c21536, i, i2, i3, j4, i4 - c8836.f26912.size());
            c21536.close();
            return c9542M11866;
        } catch (Throwable th) {
            try {
                c21536.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        j = -1;
        long j5 = j;
        zArr[0] = false;
        c21536 = new C21536(C16036.m37907(c7333.f22530, true));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8836 m11874(C14852 c14852, C15799 c15799, C23528 c23528, final int i, int i2, int i3, int i4, final int i5) throws C3059 {
        int i6;
        C2486 c2486;
        ArrayList arrayList;
        int i7 = i2;
        C2486 c2487 = new C2486(this, c14852, c15799, c23528);
        ArrayList arrayList2 = c2487.f7929;
        final C8836 c8836 = new C8836(arrayList2.size());
        int i8 = 0;
        int iMax = Math.max(0, i7);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            final int iMax2 = iMax == i7 ? Math.max(i8, i3) : 0;
            try {
                final C2486 c2488 = c2487;
                c2486 = c2487;
                arrayList = arrayList2;
                final int i9 = iMax;
                final int iMax3 = iMax == i7 ? Math.max(i8, i4) : 0;
                i6 = iMax;
                try {
                    C9542 c9542 = (C9542) C13682.m32921(c2487.f7931, c2487.f7930, c2487.f7932.f75543, str, new InterfaceC22855() { // from class: l.᩷ۧۜ
                        @Override // l.InterfaceC22855
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo14558(C7333 c7333) {
                            return C3897.m11864(this.f67435, c2488, str, i, i9, iMax2, iMax3, i5, c8836, c7333);
                        }
                    });
                    c8836.f26912.addAll(c9542.f28943);
                    if (c9542.f28942) {
                        c8836.f26909++;
                    }
                    C18193 c18193 = c9542.f28944;
                    c8836.f26914 = c18193;
                    if (c18193 != null) {
                        break;
                    }
                    iMax = i6 + 1;
                    i8 = 0;
                    arrayList2 = arrayList;
                    i7 = i2;
                    c2487 = c2486;
                } catch (RuntimeException unused) {
                    c8836.f26913 = true;
                } catch (C3059 e) {
                    e = e;
                    if (C16781.m39516(e)) {
                        throw e;
                    }
                    c8836.f26913 = true;
                }
            } catch (RuntimeException unused2) {
                i6 = iMax;
                c2486 = c2487;
                arrayList = arrayList2;
            } catch (C3059 e2) {
                e = e2;
                i6 = iMax;
                c2486 = c2487;
                arrayList = arrayList2;
            }
        }
        return c8836;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8836 m11873(C14852 c14852, C15799 c15799, C23528 c23528, final int i, int i2, int i3, final int i4) throws C3059 {
        int i5;
        C2486 c2486;
        ArrayList arrayList;
        int i6 = i2;
        C2486 c2487 = new C2486(this, c14852, c15799, c23528);
        ArrayList arrayList2 = c2487.f7929;
        final C8836 c8836 = new C8836(arrayList2.size());
        int i7 = 0;
        int iMax = Math.max(0, i6);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            int iMax2 = iMax == i6 ? Math.max(i7, i3) : 0;
            final boolean[] zArr = new boolean[1];
            zArr[i7] = true;
            try {
                final C2486 c2488 = c2487;
                c2486 = c2487;
                final int i8 = iMax;
                final int i9 = iMax2;
                arrayList = arrayList2;
                i5 = iMax;
                try {
                    C9542 c9542 = (C9542) C13682.m32921(c2487.f7931, c2487.f7930, c2487.f7932.f75543, str, new InterfaceC22855() { // from class: l.ۜۧۜ
                        @Override // l.InterfaceC22855
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo14558(C7333 c7333) {
                            return C3897.m11865(this.f20851, c2488, str, zArr, i, i8, i9, i4, c8836, c7333);
                        }
                    });
                    c8836.f26912.addAll(c9542.f28943);
                    if (c9542.f28942) {
                        c8836.f26909++;
                    }
                    C18193 c18193 = c9542.f28944;
                    c8836.f26914 = c18193;
                    if (c18193 != null) {
                        break;
                    }
                    iMax = i5 + 1;
                    i7 = 0;
                    i6 = i2;
                    arrayList2 = arrayList;
                    c2487 = c2486;
                } catch (RuntimeException unused) {
                    c8836.f26913 = true;
                } catch (C3059 e) {
                    e = e;
                    if (C16781.m39516(e)) {
                        throw e;
                    }
                    c8836.f26913 = true;
                }
            } catch (RuntimeException unused2) {
                i5 = iMax;
                c2486 = c2487;
                arrayList = arrayList2;
            } catch (C3059 e2) {
                e = e2;
                i5 = iMax;
                c2486 = c2487;
                arrayList = arrayList2;
            }
        }
        return c8836;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ, still in use, count: 2, list:
          (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ) from 0x021c: MOVE (r3v29 l.￡ﾩﾻ￡ﾩﾷￛﾜ) = (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ)
          (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ) from 0x021f: PHI (r3v24 l.￡ﾩﾻ￡ﾩﾷￛﾜ) = (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ), (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ), (r14v3 l.￡ﾩﾻ￡ﾩﾷￛﾜ), (r3v29 l.￡ﾩﾻ￡ﾩﾷￛﾜ) binds: [B:68:0x020d, B:70:0x0213, B:72:0x0216, B:73:0x021c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C9542 m11862(l.C2486 r35, l.InterfaceC2395 r36, int r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3897.m11862(l.ۖۧۜ, l.ۖ۟᩻, int, int, int, int, int):l.ۢۧۜ");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9542 m11863(C2486 c2486, InterfaceC2395 interfaceC2395, int i, int i2, int i3, long j, int i4) throws C3059 {
        HashMap map;
        int i5;
        String strM23341;
        long j2;
        String str;
        int i6;
        List list;
        int i7;
        C2486 c2487 = c2486;
        HashMap map2 = c2487.f7933;
        C9542 c9542 = new C9542(0);
        String str2 = (String) c2487.f7929.get(i2);
        int size = i3;
        long j3 = j;
        while (true) {
            Integer num = (Integer) map2.get(m11871(str2));
            int iIntValue = num == null ? -1 : num.intValue();
            try {
                C12509 c12509M13895 = ((C21536) interfaceC2395).f69216.m13895(size, iIntValue, j3);
                int i8 = c12509M13895.f37577;
                long j4 = c12509M13895.f37575;
                int i9 = c12509M13895.f37576;
                List list2 = c12509M13895.f37573;
                if (i8 != size || c12509M13895.f37574 != 1024 || i9 < 0 || list2.size() > 1024) {
                    break;
                }
                int size2 = list2.size();
                if (i8 > i9 || ((iIntValue >= 0 && iIntValue != i9) || ((long) i8) + ((long) size2) > i9)) {
                    throw m11861();
                }
                map2.put(m11871(str2), Integer.valueOf(i9));
                c9542.f28942 = true;
                if (size > i9) {
                    throw m11861();
                }
                int i10 = 0;
                while (i10 < list2.size()) {
                    C13214 c13214 = (C13214) list2.get(i10);
                    String str3 = c13214.f39564;
                    long j5 = c13214.f39562;
                    int i11 = i10;
                    List list3 = list2;
                    long j6 = c13214.f39563;
                    long j7 = j4;
                    long j8 = c13214.f39560;
                    if (str3.isEmpty()) {
                        map = map2;
                    } else {
                        map = map2;
                        C11138 c11138 = c2487.f7934;
                        C23528 c23528 = c2487.f7932;
                        C1965 c1965M27623 = c11138.m27623(str3, str3);
                        if (c1965M27623 != null) {
                            if (c23528.f75549) {
                                i5 = i9;
                                StringBuilder sb = new StringBuilder("section=\"");
                                sb.append(m11868(c13214.f39561));
                                sb.append("\" file=");
                                sb.append(m11867(j8));
                                sb.append(" va=");
                                sb.append(m11858(j6));
                                sb.append(" len=");
                                sb.append(j5 < 0 ? "?" : Long.toString(j5));
                                sb.append(" \"");
                                strM23341 = C9045.m23341(sb, m11868(c13214.f39564), "\"");
                                int i12 = c23528.f75546;
                                if (i12 > 0 && strM23341.length() > i12) {
                                    strM23341 = strM23341.substring(0, i12);
                                }
                            } else {
                                i5 = i9;
                                strM23341 = null;
                            }
                            if (c23528.f75541) {
                                c1965M27623.m6475();
                            } else {
                                c1965M27623 = null;
                            }
                            long jM11872 = m11872(j8);
                            long jM11873 = m11872(j6);
                            if (jM11872 >= 0) {
                                str = "file_offset";
                                j2 = jM11872;
                            } else if (jM11873 >= 0) {
                                str = "virtual";
                                j2 = jM11873;
                            } else {
                                j2 = -1;
                                str = null;
                            }
                            String str4 = strM23341;
                            i6 = i11;
                            C1965 c1965 = c1965M27623;
                            list = list3;
                            i7 = i5;
                            C23942 c23942 = new C23942("native_string", "strings.text", str4, c1965, str2, new C4478("", "", "", false, jM11873, jM11872, m11870(jM11872), j5 > 0 ? j5 : 0L, str, j2));
                            if (!C18714.m43344(c23942)) {
                                throw m11861();
                            }
                            ArrayList arrayList = c9542.f28943;
                            arrayList.add(c23942);
                            if (arrayList.size() >= i4) {
                                int i13 = i6 + 1;
                                c9542.f28944 = C18193.m42415(i, i2, size + i6 + 1, c12509M13895.f37576, i13 < list.size() ? ((C13214) list.get(i13)).f39560 : j7);
                                return c9542;
                            }
                        }
                        i10 = i6 + 1;
                        c2487 = c2486;
                        list2 = list;
                        i9 = i7;
                        j4 = j7;
                        map2 = map;
                    }
                    list = list3;
                    i6 = i11;
                    i7 = i9;
                    i10 = i6 + 1;
                    c2487 = c2486;
                    list2 = list;
                    i9 = i7;
                    j4 = j7;
                    map2 = map;
                }
                HashMap map3 = map2;
                List list4 = list2;
                int i14 = i9;
                long j9 = j4;
                size += list4.size();
                if (size >= i14) {
                    return c9542;
                }
                if (list4.isEmpty()) {
                    throw m11861();
                }
                c2487 = c2486;
                j3 = j9;
                map2 = map3;
            } catch (RuntimeException unused) {
                throw m11861();
            }
        }
        throw m11861();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11866(C21682 c21682, String str, int i, int i2) throws C3059 {
        String str2 = c21682.f69552;
        int i3 = c21682.f69555;
        int i4 = c21682.f69556;
        List list = c21682.f69553;
        if (!str.equals(str2) || i4 != i || c21682.f69554 != 1024 || i3 < 0 || list.size() > 1024) {
            throw m11861();
        }
        int size = list.size();
        if (i4 <= i3 && ((i2 < 0 || i2 == i3) && ((long) i4) + ((long) size) <= i3)) {
            if ("entries".equals(str)) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM11860 = m11860((InterfaceC8276) it.next());
                if (strM11860 != null && strM11860.length() > 4096) {
                    throw m11861();
                }
            }
            return;
        }
        throw m11861();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11869(InterfaceC8276 interfaceC8276) {
        if (interfaceC8276 instanceof C5454) {
            return ((C5454) interfaceC8276).f16982;
        }
        if (interfaceC8276 instanceof C11804) {
            return ((C11804) interfaceC8276).f35216;
        }
        if (interfaceC8276 instanceof C20271) {
            return ((C20271) interfaceC8276).f65509;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11860(InterfaceC8276 interfaceC8276) {
        if (interfaceC8276 instanceof C5454) {
            return ((C5454) interfaceC8276).f16978;
        }
        if (interfaceC8276 instanceof C11804) {
            return ((C11804) interfaceC8276).f35214;
        }
        if (interfaceC8276 instanceof C20271) {
            return ((C20271) interfaceC8276).f65510;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11859(String str) {
        return (str == null || str.isEmpty()) ? "" : C9045.m23341(new StringBuilder(" demangled=\""), m11868(str), "\"");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11858(long j) {
        if (j < 0) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11867(long j) {
        if (j < 0 || j > 2147483647L) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m11868(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                sb.append("\\\\");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (Character.isISOControl(cCharAt)) {
                sb.append('?');
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m11861() {
        return C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
    }
}
