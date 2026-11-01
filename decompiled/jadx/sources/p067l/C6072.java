package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X770 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6072 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f15276 = {"imports", "symbols", "entries", "relocations"};

    /* JADX INFO: renamed from: ܽ */
    public static int m13806(long j) {
        if (j < 0 || j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m13807(String str) {
        return C17588.m40053(str, "\nstrings");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m13808(long j) {
        if (j < 0) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11437 m13800(C6072 c6072, C4731 c4731, String str, int i, int i2, int i3, int i4, int i5, C10766 c10766, C9338 c9338) {
        c6072.getClass();
        c4731.m10024(str);
        C22836 c22836 = new C22836(C17609.m40094(c9338.f25443, false));
        try {
            C11437 c11437M13798 = m13798(c4731, (InterfaceC4645) c22836, i, i2, i3, i4, i5 - c10766.f29836.size());
            c22836.close();
            return c11437M13798;
        } catch (Throwable th) {
            try {
                c22836.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11437 m13801(C6072 c6072, C4731 c4731, String str, boolean[] zArr, int i, int i2, int i3, int i4, C10766 c10766, C9338 c9338) {
        long j;
        C22836 c22836;
        c6072.getClass();
        c4731.m10024(str);
        C19659 c19659 = c4731.f10720.f78285;
        try {
            if (zArr[0]) {
                int i5 = c19659.f59788;
                int i6 = c19659.f59784;
                if (i5 == i) {
                    if (c19659.f59785 == i2) {
                        if (c19659.f59787 == i3 && i6 >= 0) {
                            c4731.f10721.put(m13807(str), Integer.valueOf(i6));
                            j = c19659.f59786;
                        }
                        long j2 = j;
                        zArr[0] = false;
                        c22836 = new C22836(C17609.m40094(c9338.f25443, true));
                        C11437 c11437M13799 = m13799(c4731, c22836, i, i2, i3, j2, i4 - c10766.f29836.size());
                        c22836.close();
                        return c11437M13799;
                    }
                    j = -1;
                    long j3 = j;
                    zArr[0] = false;
                    c22836 = new C22836(C17609.m40094(c9338.f25443, true));
                    C11437 c11437M137910 = m13799(c4731, c22836, i, i2, i3, j3, i4 - c10766.f29836.size());
                    c22836.close();
                    return c11437M137910;
                }
                j = -1;
                long j4 = j;
                zArr[0] = false;
                c22836 = new C22836(C17609.m40094(c9338.f25443, true));
                C11437 c11437M137911 = m13799(c4731, c22836, i, i2, i3, j4, i4 - c10766.f29836.size());
                c22836.close();
                return c11437M137911;
            }
            C11437 c11437M137912 = m13799(c4731, c22836, i, i2, i3, j4, i4 - c10766.f29836.size());
            c22836.close();
            return c11437M137912;
        } catch (Throwable th) {
            try {
                c22836.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        j = -1;
        long j5 = j;
        zArr[0] = false;
        c22836 = new C22836(C17609.m40094(c9338.f25443, true));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10766 m13810(C16484 c16484, C17384 c17384, C24729 c24729, final int i, int i2, int i3, int i4, final int i5) throws C5276 {
        int i6;
        C4731 c4731;
        ArrayList arrayList;
        int i7 = i2;
        C4731 c4732 = new C4731(this, c16484, c17384, c24729);
        ArrayList arrayList2 = c4732.f10717;
        final C10766 c10766 = new C10766(arrayList2.size());
        int i8 = 0;
        int iMax = Math.max(0, i7);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            final int iMax2 = iMax == i7 ? Math.max(i8, i3) : 0;
            try {
                final C4731 c4733 = c4732;
                c4731 = c4732;
                arrayList = arrayList2;
                final int i9 = iMax;
                final int iMax3 = iMax == i7 ? Math.max(i8, i4) : 0;
                i6 = iMax;
                try {
                    C11437 c11437 = (C11437) C15372.m35036(c4732.f10719, c4732.f10718, c4732.f10720.f78289, str, new InterfaceC24090() { // from class: l.᩷ۧۜ
                        @Override // p067l.InterfaceC24090
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo16462(C9338 c9338) {
                            return C6072.m13800(this.f70118, c4733, str, i, i9, iMax2, iMax3, i5, c10766, c9338);
                        }
                    });
                    c10766.f29836.addAll(c11437.f31889);
                    if (c11437.f31888) {
                        c10766.f29833++;
                    }
                    C19659 c19659 = c11437.f31890;
                    c10766.f29838 = c19659;
                    if (c19659 != null) {
                        break;
                    }
                    iMax = i6 + 1;
                    i8 = 0;
                    arrayList2 = arrayList;
                    i7 = i2;
                    c4732 = c4731;
                } catch (RuntimeException unused) {
                    c10766.f29837 = true;
                } catch (C5276 e) {
                    e = e;
                    if (C18317.m41752(e)) {
                        throw e;
                    }
                    c10766.f29837 = true;
                }
            } catch (RuntimeException unused2) {
                i6 = iMax;
                c4731 = c4732;
                arrayList = arrayList2;
            } catch (C5276 e2) {
                e = e2;
                i6 = iMax;
                c4731 = c4732;
                arrayList = arrayList2;
            }
        }
        return c10766;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10766 m13809(C16484 c16484, C17384 c17384, C24729 c24729, final int i, int i2, int i3, final int i4) throws C5276 {
        int i5;
        C4731 c4731;
        ArrayList arrayList;
        int i6 = i2;
        C4731 c4732 = new C4731(this, c16484, c17384, c24729);
        ArrayList arrayList2 = c4732.f10717;
        final C10766 c10766 = new C10766(arrayList2.size());
        int i7 = 0;
        int iMax = Math.max(0, i6);
        while (iMax < arrayList2.size()) {
            final String str = (String) arrayList2.get(iMax);
            int iMax2 = iMax == i6 ? Math.max(i7, i3) : 0;
            final boolean[] zArr = new boolean[1];
            zArr[i7] = true;
            try {
                final C4731 c4733 = c4732;
                c4731 = c4732;
                final int i8 = iMax;
                final int i9 = iMax2;
                arrayList = arrayList2;
                i5 = iMax;
                try {
                    C11437 c11437 = (C11437) C15372.m35036(c4732.f10719, c4732.f10718, c4732.f10720.f78289, str, new InterfaceC24090() { // from class: l.ۜۧۜ
                        @Override // p067l.InterfaceC24090
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo16462(C9338 c9338) {
                            return C6072.m13801(this.f23725, c4733, str, zArr, i, i8, i9, i4, c10766, c9338);
                        }
                    });
                    c10766.f29836.addAll(c11437.f31889);
                    if (c11437.f31888) {
                        c10766.f29833++;
                    }
                    C19659 c19659 = c11437.f31890;
                    c10766.f29838 = c19659;
                    if (c19659 != null) {
                        break;
                    }
                    iMax = i5 + 1;
                    i7 = 0;
                    i6 = i2;
                    arrayList2 = arrayList;
                    c4732 = c4731;
                } catch (RuntimeException unused) {
                    c10766.f29837 = true;
                } catch (C5276 e) {
                    e = e;
                    if (C18317.m41752(e)) {
                        throw e;
                    }
                    c10766.f29837 = true;
                }
            } catch (RuntimeException unused2) {
                i5 = iMax;
                c4731 = c4732;
                arrayList = arrayList2;
            } catch (C5276 e2) {
                e = e2;
                i5 = iMax;
                c4731 = c4732;
                arrayList = arrayList2;
            }
        }
        return c10766;
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
    /* JADX INFO: renamed from: ֫ */
    public static p067l.C11437 m13798(p067l.C4731 r35, p067l.InterfaceC4645 r36, int r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C6072.m13798(l.ۖۧۜ, l.ۖ۟᩻, int, int, int, int, int):l.ۢۧۜ");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11437 m13799(C4731 c4731, InterfaceC4645 interfaceC4645, int i, int i2, int i3, long j, int i4) throws C5276 {
        HashMap map;
        int i5;
        String strM25286;
        long j2;
        String str;
        int i6;
        List list;
        int i7;
        C4731 c4732 = c4731;
        HashMap map2 = c4732.f10721;
        C11437 c11437 = new C11437(0);
        String str2 = (String) c4732.f10717.get(i2);
        int size = i3;
        long j3 = j;
        while (true) {
            Integer num = (Integer) map2.get(m13807(str2));
            int iIntValue = num == null ? -1 : num.intValue();
            try {
                C14257 c14257M15775 = ((C22836) interfaceC4645).f71916.m15775(size, iIntValue, j3);
                int i8 = c14257M15775.f40601;
                long j4 = c14257M15775.f40599;
                int i9 = c14257M15775.f40600;
                List list2 = c14257M15775.f40597;
                if (i8 != size || c14257M15775.f40598 != 1024 || i9 < 0 || list2.size() > 1024) {
                    break;
                }
                int size2 = list2.size();
                if (i8 > i9 || ((iIntValue >= 0 && iIntValue != i9) || ((long) i8) + ((long) size2) > i9)) {
                    throw m13797();
                }
                map2.put(m13807(str2), Integer.valueOf(i9));
                c11437.f31888 = true;
                if (size > i9) {
                    throw m13797();
                }
                int i10 = 0;
                while (i10 < list2.size()) {
                    C14927 c14927 = (C14927) list2.get(i10);
                    String str3 = c14927.f42629;
                    long j5 = c14927.f42627;
                    int i11 = i10;
                    List list3 = list2;
                    long j6 = c14927.f42628;
                    long j7 = j4;
                    long j8 = c14927.f42625;
                    if (str3.isEmpty()) {
                        map = map2;
                    } else {
                        map = map2;
                        C12954 c12954 = c4732.f10722;
                        C24729 c24729 = c4732.f10720;
                        C4236 c4236M29685 = c12954.m29685(str3, str3);
                        if (c4236M29685 != null) {
                            if (c24729.f78295) {
                                i5 = i9;
                                StringBuilder sb = new StringBuilder("section=\"");
                                sb.append(m13804(c14927.f42626));
                                sb.append("\" file=");
                                sb.append(m13803(j8));
                                sb.append(" va=");
                                sb.append(m13794(j6));
                                sb.append(" len=");
                                sb.append(j5 < 0 ? "?" : Long.toString(j5));
                                sb.append(" \"");
                                strM25286 = C10965.m25286(sb, m13804(c14927.f42629), "\"");
                                int i12 = c24729.f78292;
                                if (i12 > 0 && strM25286.length() > i12) {
                                    strM25286 = strM25286.substring(0, i12);
                                }
                            } else {
                                i5 = i9;
                                strM25286 = null;
                            }
                            if (c24729.f78287) {
                                c4236M29685.m8616();
                            } else {
                                c4236M29685 = null;
                            }
                            long jM13808 = m13808(j8);
                            long jM13809 = m13808(j6);
                            if (jM13808 >= 0) {
                                str = "file_offset";
                                j2 = jM13808;
                            } else if (jM13809 >= 0) {
                                str = "virtual";
                                j2 = jM13809;
                            } else {
                                j2 = -1;
                                str = null;
                            }
                            String str4 = strM25286;
                            i6 = i11;
                            C4236 c4236 = c4236M29685;
                            list = list3;
                            i7 = i5;
                            C25123 c25123 = new C25123("native_string", "strings.text", str4, c4236, str2, new C6624("", "", "", false, jM13809, jM13808, m13806(jM13808), j5 > 0 ? j5 : 0L, str, j2));
                            if (!C20154.m45611(c25123)) {
                                throw m13797();
                            }
                            ArrayList arrayList = c11437.f31889;
                            arrayList.add(c25123);
                            if (arrayList.size() >= i4) {
                                int i13 = i6 + 1;
                                c11437.f31890 = C19659.m44676(i, i2, size + i6 + 1, c14257M15775.f40600, i13 < list.size() ? ((C14927) list.get(i13)).f42625 : j7);
                                return c11437;
                            }
                        }
                        i10 = i6 + 1;
                        c4732 = c4731;
                        list2 = list;
                        i9 = i7;
                        j4 = j7;
                        map2 = map;
                    }
                    list = list3;
                    i6 = i11;
                    i7 = i9;
                    i10 = i6 + 1;
                    c4732 = c4731;
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
                    return c11437;
                }
                if (list4.isEmpty()) {
                    throw m13797();
                }
                c4732 = c4731;
                j3 = j9;
                map2 = map3;
            } catch (RuntimeException unused) {
                throw m13797();
            }
        }
        throw m13797();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13802(C22975 c22975, String str, int i, int i2) throws C5276 {
        String str2 = c22975.f72257;
        int i3 = c22975.f72260;
        int i4 = c22975.f72261;
        List list = c22975.f72258;
        if (!str.equals(str2) || i4 != i || c22975.f72259 != 1024 || i3 < 0 || list.size() > 1024) {
            throw m13797();
        }
        int size = list.size();
        if (i4 <= i3 && ((i2 < 0 || i2 == i3) && ((long) i4) + ((long) size) <= i3)) {
            if ("entries".equals(str)) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM13796 = m13796((InterfaceC10234) it.next());
                if (strM13796 != null && strM13796.length() > 4096) {
                    throw m13797();
                }
            }
            return;
        }
        throw m13797();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m13805(InterfaceC10234 interfaceC10234) {
        if (interfaceC10234 instanceof C7552) {
            return ((C7552) interfaceC10234).f19823;
        }
        if (interfaceC10234 instanceof C13587) {
            return ((C13587) interfaceC10234).f38218;
        }
        if (interfaceC10234 instanceof C21634) {
            return ((C21634) interfaceC10234).f68184;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m13796(InterfaceC10234 interfaceC10234) {
        if (interfaceC10234 instanceof C7552) {
            return ((C7552) interfaceC10234).f19819;
        }
        if (interfaceC10234 instanceof C13587) {
            return ((C13587) interfaceC10234).f38216;
        }
        if (interfaceC10234 instanceof C21634) {
            return ((C21634) interfaceC10234).f68185;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m13795(String str) {
        return (str == null || str.isEmpty()) ? "" : C10965.m25286(new StringBuilder(" demangled=\""), m13804(str), "\"");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m13794(long j) {
        if (j < 0) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m13803(long j) {
        if (j < 0 || j > 2147483647L) {
            return "?";
        }
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m13804(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m13797() {
        return C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
    }
}
