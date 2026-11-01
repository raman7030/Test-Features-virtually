package p067l;

/* JADX INFO: renamed from: l.ۜۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C8782 {
    /* JADX INFO: renamed from: ۧ */
    public static String m20318(C14677 c14677, AbstractC17043 abstractC17043) {
        String strM20319;
        int iM33575 = c14677.m33575();
        try {
            if (c14677.m33577(-249340294)) {
                c14677.skipBytes(4);
                strM20319 = m20317(c14677, 0) ? m20319(c14677, abstractC17043) : "";
            } else {
                strM20319 = m20319(c14677, abstractC17043);
            }
            return strM20319;
        } finally {
            c14677.seek(iM33575);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1349 m20315(C14677 c14677, AbstractC17043 abstractC17043) {
        String strM20319;
        String strM33591;
        int iM33575 = c14677.m33575();
        byte[] bArr = c14677.f41893;
        try {
            if (c14677.m33577(-249340294)) {
                c14677.skipBytes(4);
                if (m20317(c14677, 0)) {
                    strM20319 = m20319(c14677, abstractC17043);
                    c14677.skipBytes(4);
                } else {
                    strM20319 = "";
                }
                strM33591 = m20317(c14677, 4) ? c14677.m33591() : "\n";
            } else {
                strM20319 = m20319(c14677, abstractC17043);
                c14677.skipBytes(28);
                c14677.skipBytes(3);
                C14146.m32275(c14677, bArr.length);
                C14146.m32275(c14677, bArr.length);
                if (c14677.m33577(-1568513661)) {
                    int iM33581 = c14677.m33581();
                    for (int i = 0; i < iM33581; i++) {
                        c14677.skipBytes(8);
                    }
                }
                if (c14677.m33577(-1568513661)) {
                    int iM33582 = c14677.m33581();
                    for (int i2 = 0; i2 < iM33582; i2++) {
                        c14677.skipBytes(8);
                    }
                }
                strM33591 = c14677.m33591();
            }
            return new C1349(strM20319, strM33591);
        } finally {
            c14677.seek(iM33575);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20316(C14677 c14677) {
        int i;
        int iM33575 = c14677.m33575();
        byte[] bArr = c14677.f41893;
        try {
            if (c14677.m33577(-249340294)) {
                c14677.skipBytes(4);
                if (!m20317(c14677, 1)) {
                    c14677.seek(iM33575);
                    return;
                }
                c14677.skipBytes(4);
            } else {
                if (c14677.m33587() == -131647720) {
                    c14677.skipBytes(4);
                    c14677.skipBytes(1);
                    i = c14677.readInt();
                } else {
                    i = c14677.readInt();
                }
                c14677.skipBytes(i);
                c14677.skipBytes(20);
            }
            C17548.m39930(c14677.m33575(), C17548.m39928(c14677.m33575() + 4, bArr), bArr);
            long j = iM33575;
            c14677.seek(j);
            if (c14677.m33577(-249340294)) {
                c14677.skipBytes(4);
                if (m20317(c14677, 10)) {
                    int iM33576 = c14677.m33575();
                    c14677.skipBytes(8);
                    C17548.m39932(c14677.readLong(), iM33576, bArr);
                }
            }
            c14677.seek(j);
        } catch (Throwable th) {
            c14677.seek(iM33575);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m20319(C14677 c14677, AbstractC17043 abstractC17043) {
        if (c14677.m33587() == -500018348) {
            return C7836.m18115(c14677, abstractC17043);
        }
        int iM33587 = c14677.m33587();
        if (iM33587 == -500019884 || iM33587 == -483177132) {
            if (c14677.m33587() == -500019884) {
                return new String(C2628.m3985(c14677, c14677.m33575() + ((int) c14677.available())));
            }
            if (c14677.readInt() != -483177132) {
                throw new IllegalArgumentException("Invalid memory session state");
            }
            C16195 c16195M54700 = C24913.m54700(c14677);
            try {
                C14443 c14443M36889 = c16195M54700.m36889();
                try {
                    String string = c14443M36889.toString();
                    c14443M36889.close();
                    c16195M54700.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        c14443M36889.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c16195M54700.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (c14677.m33587() == -131647720) {
            return C15053.m34421(c14677, abstractC17043 == null ? null : new C24875(abstractC17043)).m12623();
        }
        return c14677.m33591();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20317(C14677 c14677, int i) {
        int iM33575 = c14677.m33575();
        while (true) {
            byte b = c14677.readByte();
            if (b != -1) {
                int i2 = c14677.readInt();
                if (b == i) {
                    return true;
                }
                c14677.skipBytes(i2);
            } else {
                c14677.seek(iM33575);
                return false;
            }
        }
    }
}
