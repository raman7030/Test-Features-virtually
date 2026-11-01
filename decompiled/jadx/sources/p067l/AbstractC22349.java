package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22349 implements InterfaceC14480 {

    /* JADX INFO: renamed from: ۧ */
    public static final C2582 f70546 = new C2582(10);

    /* JADX INFO: renamed from: ֫ */
    private synchronized String m50175(C5290 c5290, int i, int i2) {
        C8937 c8937M50183 = m50183(new C18324(c5290), i, i2);
        if (c8937M50183 == null) {
            return null;
        }
        StringBuilder sb = (StringBuilder) f70546.m3892();
        if (sb == null) {
            sb = new StringBuilder();
        }
        try {
            C7855.m18156(sb, c5290.m11438(), c8937M50183.f24216, c8937M50183.f24215);
            String string = sb.toString();
            if ((string.length() & EnumC8055.f21261) != c8937M50183.f24213) {
                m50177(sb);
                return null;
            }
            m50177(sb);
            return string;
        } catch (Throwable th) {
            m50177(sb);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized String m50176(C24618 c24618, int i, int i2) {
        try {
            C8937 c8937M50181 = m50181(new C16312(c24618), i, i2);
            if (c8937M50181 == null) {
                return null;
            }
            int i3 = c8937M50181.f24215;
            byte[] bArr = new byte[i3];
            c24618.seek(c8937M50181.f24216);
            c24618.m54256(bArr, 0, i3);
            return m50174(0, c8937M50181.f24215, bArr);
        } catch (IOException e) {
            throw new C9587(e);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50178(int i, int i2, int i3) {
        return i >= 0 && i2 >= 0 && ((long) i) + ((long) i2) <= ((long) i3);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m50188(int i) {
        if (i >= 0 && i < size()) {
            return getItem(i).getValue();
        }
        return C23669.m52683(i, size()).toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50184(String str) {
        for (int i = 0; i < size(); i++) {
            InterfaceC5763 item = getItem(i);
            if (!item.mo12361() && item.getValue().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Iterable m50187() {
        return new C18995(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Iterable m50189() {
        return new C18995(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m50179(C5290 c5290, int i, boolean z, int i2) {
        try {
            C18324 c18324 = new C18324(c5290);
            C8937 c8937M50183 = z ? m50183(c18324, i, i2) : m50181(c18324, i, i2);
            if (c8937M50183 == null) {
                return -1;
            }
            return c8937M50183.f24214;
        } catch (IOException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50185(C5290 c5290, int i, boolean z, int i2) {
        try {
            if (z) {
                return m50175(c5290, i, i2);
            }
            synchronized (this) {
                C8937 c8937M50181 = m50181(new C18324(c5290), i, i2);
                if (c8937M50181 == null) {
                    return null;
                }
                return m50174(c8937M50181.f24216, c8937M50181.f24215, c5290.m11438());
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m50180(C24618 c24618, int i, boolean z, int i2) {
        try {
            C16312 c16312 = new C16312(c24618);
            C8937 c8937M50183 = z ? m50183(c16312, i, i2) : m50181(c16312, i, i2);
            if (c8937M50183 == null) {
                return -1;
            }
            return c8937M50183.f24214;
        } catch (IOException e) {
            throw new C9587(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50174(int i, int i2, byte[] bArr) {
        int i3;
        if (i < 0 || i2 < 0 || i > bArr.length || bArr.length - i < i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return "";
        }
        int i4 = i + i2;
        char[] cArr = new char[(i2 + 1) >>> 1];
        int i5 = 0;
        while (true) {
            int i6 = i + 1;
            if (i6 >= i4) {
                break;
            }
            char c = (char) (((bArr[i6] & 255) << 8) | (bArr[i] & 255));
            int i7 = i + 2;
            if (!Character.isHighSurrogate(c)) {
                if (Character.isLowSurrogate(c)) {
                    i3 = i5 + 1;
                    cArr[i5] = 65533;
                } else {
                    i3 = i5 + 1;
                    cArr[i5] = c;
                }
                i5 = i3;
                i = i7;
            } else if (i + 3 >= i4) {
                cArr[i5] = 65533;
                i5++;
                i = i4;
            } else {
                char c2 = (char) ((bArr[i7] & 255) | ((bArr[i + 3] & 255) << 8));
                if (Character.isLowSurrogate(c2)) {
                    int i8 = i5 + 1;
                    cArr[i5] = c;
                    i5 += 2;
                    cArr[i8] = c2;
                    i += 4;
                } else {
                    cArr[i5] = 65533;
                    i += 4;
                    i5++;
                }
            }
        }
        if (i < i4) {
            cArr[i5] = 65533;
            i5++;
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50186(C24618 c24618, int i, boolean z, int i2) {
        if (!z) {
            return m50176(c24618, i, i2);
        }
        synchronized (this) {
            try {
                C8937 c8937M50183 = m50183(new C16312(c24618), i, i2);
                if (c8937M50183 == null) {
                    return null;
                }
                StringBuilder sb = (StringBuilder) f70546.m3892();
                if (sb == null) {
                    sb = new StringBuilder();
                }
                int i3 = c8937M50183.f24215;
                byte[] bArr = new byte[i3];
                c24618.seek(c8937M50183.f24216);
                c24618.m54256(bArr, 0, i3);
                try {
                    C7855.m18156(sb, bArr, 0, c8937M50183.f24215);
                    String string = sb.toString();
                    if ((string.length() & EnumC8055.f21261) != c8937M50183.f24213) {
                        m50177(sb);
                        return null;
                    }
                    m50177(sb);
                    return string;
                } catch (Throwable th) {
                    m50177(sb);
                    throw th;
                }
            } catch (IOException e) {
                throw new C9587(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m50172(int i, int i2, int i3, int i4, int i5) {
        long j = i;
        long j2 = ((long) i4) + j;
        if (i3 > i2 && i3 <= i4) {
            j2 = j + ((long) i3);
        }
        long jMin = Math.min(j2, Math.max(0L, i5));
        if (jMin <= 0) {
            return 0;
        }
        if (jMin >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jMin;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C8937 m50181(InterfaceC25030 interfaceC25030, int i, int i2) throws IOException {
        long jM50173;
        int i3 = 2;
        if (!m50178(i, 2, i2)) {
            return null;
        }
        int iM50173 = m50173(interfaceC25030, i, i2);
        if ((32768 & iM50173) != 0) {
            i3 = 4;
            if (!m50178(i, 4, i2)) {
                return null;
            }
            jM50173 = ((long) m50173(interfaceC25030, i + 2, i2)) | (((long) (iM50173 & EnumC8055.f21261)) << 16);
        } else {
            jM50173 = iM50173;
        }
        int i4 = i + i3;
        long j = jM50173 * 2;
        long j2 = ((long) i4) + j;
        long j3 = 2 + j2;
        if (j > 2147483647L || j2 > 2147483647L || j3 > i2 || m50173(interfaceC25030, (int) j2, i2) != 0) {
            return null;
        }
        return new C8937(i4, (int) j, (int) j3, -1);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C8937 m50183(InterfaceC25030 interfaceC25030, int i, int i2) {
        C19666 c19666M50182;
        int i3;
        long j;
        int i4;
        C19666 c19666M50183 = m50182(interfaceC25030, i, i2);
        if (c19666M50183 == null || (c19666M50182 = m50182(interfaceC25030, c19666M50183.f59797, i2)) == null) {
            return null;
        }
        int i5 = c19666M50182.f59797;
        long j2 = c19666M50182.f59798;
        long j3 = 0;
        long j4 = -1;
        long j5 = j2;
        while (true) {
            if (j5 > j4) {
                long j6 = ((long) i5) + j5;
                j = 1;
                i3 = i5;
                if (j6 < i2) {
                    if (interfaceC25030.mo37110((int) j6) != 0) {
                        j3++;
                        j4 = j5;
                        j5 = (j3 << 15) | j2;
                        i5 = i3;
                    } else if (j5 <= 2147483647L) {
                        i4 = (int) j5;
                        break;
                    }
                }
            } else {
                i3 = i5;
                j = 1;
            }
            i4 = -1;
            break;
        }
        if (i4 < 0) {
            return null;
        }
        int i6 = i3;
        long j7 = ((long) i6) + ((long) i4) + j;
        if (j7 > 2147483647L) {
            return null;
        }
        return new C8937(i6, i4, (int) j7, c19666M50183.f59798);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C19666 m50182(InterfaceC25030 interfaceC25030, int i, int i2) {
        if (!m50178(i, 1, i2)) {
            return null;
        }
        int iMo37110 = interfaceC25030.mo37110(i);
        if ((iMo37110 & 128) == 0) {
            return new C19666(iMo37110, i + 1);
        }
        if (m50178(i, 2, i2)) {
            return new C19666(interfaceC25030.mo37110(i + 1) | ((iMo37110 & 127) << 8), i + 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m50173(InterfaceC25030 interfaceC25030, int i, int i2) throws IOException {
        if (!m50178(i, 2, i2)) {
            throw new IOException("Unexpected end of string data");
        }
        return interfaceC25030.mo37109(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50177(StringBuilder sb) {
        sb.setLength(0);
        if (sb.capacity() <= 6144) {
            f70546.m3890(sb);
        }
    }
}
