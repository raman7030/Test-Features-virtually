package p067l;

/* JADX INFO: renamed from: l.ᩴۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P764 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20154 {
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
    /* JADX INFO: renamed from: ֫ */
    public static boolean m45611(C25123 c25123) {
        boolean z;
        boolean zM45609;
        long j;
        boolean z2;
        boolean zM456010;
        String strConcat;
        C4236 c4236;
        String str = c25123.f80395;
        C6624 c6624 = c25123.f80396;
        String str2 = c25123.f80393;
        if ("native_symbol".equals(str2)) {
            if (c6624 != null) {
                long j2 = c6624.f17080;
                long j3 = c6624.f17075;
                String str3 = c6624.f17079;
                String str4 = c6624.f17078;
                String str5 = c6624.f17081;
                if (!str3.isEmpty() && j3 >= 0 && str4.length() <= 4096 && ("imports".equals(str5) || "symbols".equals(str5) || "entries".equals(str5) || "relocations".equals(str5))) {
                    int i = c6624.f17084;
                    if (j2 < 0 || j2 > 2147483647L) {
                        z = true;
                        if (i < 0) {
                            j = c6624.f17076;
                            z2 = c6624.f17082;
                            if ("imports".equals(str5)) {
                                if (!z2 && j3 == 0 && m45609(c6624)) {
                                    zM456010 = true;
                                } else {
                                    zM456010 = false;
                                }
                            } else if ("relocations".equals(str5)) {
                                if (z2 && j3 == 0 && (j < 0 ? m45609(c6624) : m45610(c6624, "virtual", j))) {
                                    zM456010 = true;
                                } else {
                                    zM456010 = false;
                                }
                            } else if (z2) {
                                zM456010 = m45609(c6624);
                            } else if (j >= 0) {
                                zM456010 = m45610(c6624, "virtual", j);
                            } else if (j2 >= 0) {
                                zM456010 = m45610(c6624, "file_offset", j2);
                            } else {
                                zM456010 = m45609(c6624);
                            }
                            if (zM456010) {
                                strConcat = str5.concat(".name");
                                String strConcat2 = str5.concat(".demangledName");
                                if (!strConcat.equals(str)) {
                                    if (!"entries".equals(str5) && strConcat2.equals(str) && !str4.isEmpty()) {
                                        str3 = str4;
                                    }
                                }
                                if (("entries".equals(str5) || str4.isEmpty()) && ((c4236 = c25123.f80394) == null || str3.equals(c4236.f9364))) {
                                }
                            }
                        }
                    } else {
                        z = true;
                        if (i == ((int) j2)) {
                            j = c6624.f17076;
                            z2 = c6624.f17082;
                            if ("imports".equals(str5)) {
                                if (!z2) {
                                }
                                zM456010 = false;
                            } else if ("relocations".equals(str5)) {
                                if (z2) {
                                }
                                zM456010 = false;
                            } else if (z2) {
                                zM456010 = m45609(c6624);
                            } else if (j >= 0) {
                                zM456010 = m45610(c6624, "virtual", j);
                            } else if (j2 >= 0) {
                                zM456010 = m45610(c6624, "file_offset", j2);
                            } else {
                                zM456010 = m45609(c6624);
                            }
                            if (zM456010) {
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
            if (c6624 == null || !"strings.text".equals(str) || c6624.f17075 < 0) {
                return false;
            }
            long j4 = c6624.f17080;
            int i2 = c6624.f17084;
            if (!(j4 < 0 || j4 > 2147483647L ? i2 < 0 : i2 == ((int) j4))) {
                return false;
            }
            if (j4 >= 0) {
                zM45609 = m45610(c6624, "file_offset", j4);
            } else {
                long j5 = c6624.f17076;
                if (j5 >= 0) {
                    zM45609 = m45610(c6624, "virtual", j5);
                } else {
                    zM45609 = m45609(c6624);
                }
            }
            if (!zM45609) {
                return false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45609(C6624 c6624) {
        return c6624.f17077 == null && c6624.f17083 < 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45610(C6624 c6624, String str, long j) {
        return str.equals(c6624.f17077) && c6624.f17083 == j;
    }
}
