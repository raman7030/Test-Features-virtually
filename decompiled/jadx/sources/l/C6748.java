package l;

/* JADX INFO: renamed from: l.ۜۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C6748 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18370(C12951 c12951, AbstractC15440 abstractC15440) {
        String strM18371;
        int iM31488 = c12951.m31488();
        try {
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                strM18371 = m18369(c12951, 0) ? m18371(c12951, abstractC15440) : "";
            } else {
                strM18371 = m18371(c12951, abstractC15440);
            }
            return strM18371;
        } finally {
            c12951.seek(iM31488);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10220 m18367(C12951 c12951, AbstractC15440 abstractC15440) {
        String strM18371;
        String strM31504;
        int iM31488 = c12951.m31488();
        byte[] bArr = c12951.f38849;
        try {
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                if (m18369(c12951, 0)) {
                    strM18371 = m18371(c12951, abstractC15440);
                    c12951.skipBytes(4);
                } else {
                    strM18371 = "";
                }
                strM31504 = m18369(c12951, 4) ? c12951.m31504() : "\n";
            } else {
                strM18371 = m18371(c12951, abstractC15440);
                c12951.skipBytes(28);
                c12951.skipBytes(3);
                C12392.m30211(c12951, bArr.length);
                C12392.m30211(c12951, bArr.length);
                if (c12951.m31490(-1568513661)) {
                    int iM31494 = c12951.m31494();
                    for (int i = 0; i < iM31494; i++) {
                        c12951.skipBytes(8);
                    }
                }
                if (c12951.m31490(-1568513661)) {
                    int iM31495 = c12951.m31494();
                    for (int i2 = 0; i2 < iM31495; i2++) {
                        c12951.skipBytes(8);
                    }
                }
                strM31504 = c12951.m31504();
            }
            return new C10220(strM18371, strM31504);
        } finally {
            c12951.seek(iM31488);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18368(C12951 c12951) {
        int i;
        int iM31488 = c12951.m31488();
        byte[] bArr = c12951.f38849;
        try {
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                if (!m18369(c12951, 1)) {
                    c12951.seek(iM31488);
                    return;
                }
                c12951.skipBytes(4);
            } else {
                if (c12951.m31500() == -131647720) {
                    c12951.skipBytes(4);
                    c12951.skipBytes(1);
                    i = c12951.readInt();
                } else {
                    i = c12951.readInt();
                }
                c12951.skipBytes(i);
                c12951.skipBytes(20);
            }
            C15972.m37746(c12951.m31488(), C15972.m37744(c12951.m31488() + 4, bArr), bArr);
            long j = iM31488;
            c12951.seek(j);
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                if (m18369(c12951, 10)) {
                    int iM31489 = c12951.m31488();
                    c12951.skipBytes(8);
                    C15972.m37748(c12951.readLong(), iM31489, bArr);
                }
            }
            c12951.seek(j);
        } catch (Throwable th) {
            c12951.seek(iM31488);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m18371(C12951 c12951, AbstractC15440 abstractC15440) {
        if (c12951.m31500() == -500018348) {
            return C5753.m16196(c12951, abstractC15440);
        }
        int iM31500 = c12951.m31500();
        if (iM31500 == -500019884 || iM31500 == -483177132) {
            if (c12951.m31500() == -500019884) {
                return new String(C0273.m1587(c12951, c12951.m31488() + ((int) c12951.available())));
            }
            if (c12951.readInt() != -483177132) {
                throw new IllegalArgumentException("Invalid memory session state");
            }
            C14548 c14548M52297 = C23721.m52297(c12951);
            try {
                C12704 c12704M34740 = c14548M52297.m34740();
                try {
                    String string = c12704M34740.toString();
                    c12704M34740.close();
                    c14548M52297.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        c12704M34740.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c14548M52297.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (c12951.m31500() == -131647720) {
            return C13346.m32320(c12951, abstractC15440 == null ? null : new C23681(abstractC15440)).m10615();
        }
        return c12951.m31504();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18369(C12951 c12951, int i) {
        int iM31488 = c12951.m31488();
        while (true) {
            byte b = c12951.readByte();
            if (b != -1) {
                int i2 = c12951.readInt();
                if (b == i) {
                    return true;
                }
                c12951.skipBytes(i2);
            } else {
                c12951.seek(iM31488);
                return false;
            }
        }
    }
}
