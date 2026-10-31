package l;

/* JADX INFO: renamed from: l.ᩴۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P764 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18714 {
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[PHI: r17
      0x006c: PHI (r17v3 boolean) = (r17v2 boolean), (r17v5 boolean) binds: [B:28:0x006a, B:25:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43344(C23942 c23942) {
        boolean z;
        boolean zM43342;
        long j;
        boolean z2;
        boolean zM43343;
        String strConcat;
        C1965 c1965;
        String str = c23942.f77643;
        C4478 c4478 = c23942.f77644;
        String str2 = c23942.f77641;
        if ("native_symbol".equals(str2)) {
            if (c4478 != null) {
                long j2 = c4478.f14253;
                long j3 = c4478.f14248;
                String str3 = c4478.f14252;
                String str4 = c4478.f14251;
                String str5 = c4478.f14254;
                if (!str3.isEmpty() && j3 >= 0 && str4.length() <= 4096 && ("imports".equals(str5) || "symbols".equals(str5) || "entries".equals(str5) || "relocations".equals(str5))) {
                    int i = c4478.f14257;
                    if (j2 < 0 || j2 > 2147483647L) {
                        z = true;
                        if (i < 0) {
                            j = c4478.f14249;
                            z2 = c4478.f14255;
                            if ("imports".equals(str5)) {
                                if (!z2 && j3 == 0 && m43342(c4478)) {
                                    zM43343 = true;
                                } else {
                                    zM43343 = false;
                                }
                            } else if ("relocations".equals(str5)) {
                                if (z2 && j3 == 0 && (j < 0 ? m43342(c4478) : m43343(c4478, "virtual", j))) {
                                    zM43343 = true;
                                } else {
                                    zM43343 = false;
                                }
                            } else if (z2) {
                                zM43343 = m43342(c4478);
                            } else if (j >= 0) {
                                zM43343 = m43343(c4478, "virtual", j);
                            } else if (j2 >= 0) {
                                zM43343 = m43343(c4478, "file_offset", j2);
                            } else {
                                zM43343 = m43342(c4478);
                            }
                            if (zM43343) {
                                strConcat = str5.concat(".name");
                                String strConcat2 = str5.concat(".demangledName");
                                if (!strConcat.equals(str)) {
                                    if (!"entries".equals(str5) && strConcat2.equals(str) && !str4.isEmpty()) {
                                        str3 = str4;
                                    }
                                }
                                if (("entries".equals(str5) || str4.isEmpty()) && ((c1965 = c23942.f77642) == null || str3.equals(c1965.f6585))) {
                                }
                            }
                        }
                    } else {
                        z = true;
                        if (i == ((int) j2)) {
                            j = c4478.f14249;
                            z2 = c4478.f14255;
                            if ("imports".equals(str5)) {
                                if (!z2) {
                                }
                                zM43343 = false;
                            } else if ("relocations".equals(str5)) {
                                if (z2) {
                                }
                                zM43343 = false;
                            } else if (z2) {
                                zM43343 = m43342(c4478);
                            } else if (j >= 0) {
                                zM43343 = m43343(c4478, "virtual", j);
                            } else if (j2 >= 0) {
                                zM43343 = m43343(c4478, "file_offset", j2);
                            } else {
                                zM43343 = m43342(c4478);
                            }
                            if (zM43343) {
                                strConcat = str5.concat(".name");
                                String strConcat3 = str5.concat(".demangledName");
                                if (!strConcat.equals(str)) {
                                    if (!"entries".equals(str5)) {
                                        str3 = str4;
                                    }
                                }
                                if ("entries".equals(str5)) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        z = true;
        if ("native_string".equals(str2)) {
            if (c4478 == null || !"strings.text".equals(str) || c4478.f14248 < 0) {
                return false;
            }
            long j4 = c4478.f14253;
            int i2 = c4478.f14257;
            if (!(j4 < 0 || j4 > 2147483647L ? i2 < 0 : i2 == ((int) j4))) {
                return false;
            }
            if (j4 >= 0) {
                zM43342 = m43343(c4478, "file_offset", j4);
            } else {
                long j5 = c4478.f14249;
                if (j5 >= 0) {
                    zM43342 = m43343(c4478, "virtual", j5);
                } else {
                    zM43342 = m43342(c4478);
                }
            }
            if (!zM43342) {
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43342(C4478 c4478) {
        return c4478.f14250 == null && c4478.f14256 < 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43343(C4478 c4478, String str, long j) {
        return str.equals(c4478.f14250) && c4478.f14256 == j;
    }
}
