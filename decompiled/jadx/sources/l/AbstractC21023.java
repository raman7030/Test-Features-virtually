package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21023 implements InterfaceC12743 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C0225 f67861 = new C0225(10);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized String m47845(C3074 c3074, int i, int i2) {
        C6911 c6911M47853 = m47853(new C16788(c3074), i, i2);
        if (c6911M47853 == null) {
            return null;
        }
        StringBuilder sb = (StringBuilder) f67861.m1479();
        if (sb == null) {
            sb = new StringBuilder();
        }
        try {
            C5773.m16237(sb, c3074.m9396(), c6911M47853.f21337, c6911M47853.f21336);
            String string = sb.toString();
            if ((string.length() & EnumC5983.f18409) != c6911M47853.f21334) {
                m47847(sb);
                return null;
            }
            m47847(sb);
            return string;
        } catch (Throwable th) {
            m47847(sb);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized String m47846(C23411 c23411, int i, int i2) {
        try {
            C6911 c6911M47851 = m47851(new C14671(c23411), i, i2);
            if (c6911M47851 == null) {
                return null;
            }
            int i3 = c6911M47851.f21336;
            byte[] bArr = new byte[i3];
            c23411.seek(c6911M47851.f21337);
            c23411.m51858(bArr, 0, i3);
            return m47844(0, c6911M47851.f21336, bArr);
        } catch (IOException e) {
            throw new C7595(e);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47848(int i, int i2, int i3) {
        return i >= 0 && i2 >= 0 && ((long) i) + ((long) i2) <= ((long) i3);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m47858(int i) {
        if (i >= 0 && i < size()) {
            return getItem(i).getValue();
        }
        return C22412.m50343(i, size()).toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47854(String str) {
        for (int i = 0; i < size(); i++) {
            InterfaceC3571 item = getItem(i);
            if (!item.mo10323() && item.getValue().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Iterable m47857() {
        return new C17494(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m47859() {
        return new C17494(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m47849(C3074 c3074, int i, boolean z, int i2) {
        try {
            C16788 c16788 = new C16788(c3074);
            C6911 c6911M47853 = z ? m47853(c16788, i, i2) : m47851(c16788, i, i2);
            if (c6911M47853 == null) {
                return -1;
            }
            return c6911M47853.f21335;
        } catch (IOException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47855(C3074 c3074, int i, boolean z, int i2) {
        try {
            if (z) {
                return m47845(c3074, i, i2);
            }
            synchronized (this) {
                C6911 c6911M47851 = m47851(new C16788(c3074), i, i2);
                if (c6911M47851 == null) {
                    return null;
                }
                return m47844(c6911M47851.f21337, c6911M47851.f21336, c3074.m9396());
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m47850(C23411 c23411, int i, boolean z, int i2) {
        try {
            C14671 c14671 = new C14671(c23411);
            C6911 c6911M47853 = z ? m47853(c14671, i, i2) : m47851(c14671, i, i2);
            if (c6911M47853 == null) {
                return -1;
            }
            return c6911M47853.f21335;
        } catch (IOException e) {
            throw new C7595(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47844(int i, int i2, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47856(C23411 c23411, int i, boolean z, int i2) {
        if (!z) {
            return m47846(c23411, i, i2);
        }
        synchronized (this) {
            try {
                C6911 c6911M47853 = m47853(new C14671(c23411), i, i2);
                if (c6911M47853 == null) {
                    return null;
                }
                StringBuilder sb = (StringBuilder) f67861.m1479();
                if (sb == null) {
                    sb = new StringBuilder();
                }
                int i3 = c6911M47853.f21336;
                byte[] bArr = new byte[i3];
                c23411.seek(c6911M47853.f21337);
                c23411.m51858(bArr, 0, i3);
                try {
                    C5773.m16237(sb, bArr, 0, c6911M47853.f21336);
                    String string = sb.toString();
                    if ((string.length() & EnumC5983.f18409) != c6911M47853.f21334) {
                        m47847(sb);
                        return null;
                    }
                    m47847(sb);
                    return string;
                } catch (Throwable th) {
                    m47847(sb);
                    throw th;
                }
            } catch (IOException e) {
                throw new C7595(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m47842(int i, int i2, int i3, int i4, int i5) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6911 m47851(InterfaceC23844 interfaceC23844, int i, int i2) throws IOException {
        long jM47843;
        int i3 = 2;
        if (!m47848(i, 2, i2)) {
            return null;
        }
        int iM47843 = m47843(interfaceC23844, i, i2);
        if ((32768 & iM47843) != 0) {
            i3 = 4;
            if (!m47848(i, 4, i2)) {
                return null;
            }
            jM47843 = ((long) m47843(interfaceC23844, i + 2, i2)) | (((long) (iM47843 & EnumC5983.f18409)) << 16);
        } else {
            jM47843 = iM47843;
        }
        int i4 = i + i3;
        long j = jM47843 * 2;
        long j2 = ((long) i4) + j;
        long j3 = 2 + j2;
        if (j > 2147483647L || j2 > 2147483647L || j3 > i2 || m47843(interfaceC23844, (int) j2, i2) != 0) {
            return null;
        }
        return new C6911(i4, (int) j, (int) j3, -1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C6911 m47853(InterfaceC23844 interfaceC23844, int i, int i2) {
        C18200 c18200M47852;
        int i3;
        long j;
        int i4;
        C18200 c18200M47853 = m47852(interfaceC23844, i, i2);
        if (c18200M47853 == null || (c18200M47852 = m47852(interfaceC23844, c18200M47853.f56584, i2)) == null) {
            return null;
        }
        int i5 = c18200M47852.f56584;
        long j2 = c18200M47852.f56585;
        long j3 = 0;
        long j4 = -1;
        long j5 = j2;
        while (true) {
            if (j5 > j4) {
                long j6 = ((long) i5) + j5;
                j = 1;
                i3 = i5;
                if (j6 < i2) {
                    if (interfaceC23844.mo34963((int) j6) != 0) {
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
        return new C6911(i6, i4, (int) j7, c18200M47853.f56585);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18200 m47852(InterfaceC23844 interfaceC23844, int i, int i2) {
        if (!m47848(i, 1, i2)) {
            return null;
        }
        int iMo34963 = interfaceC23844.mo34963(i);
        if ((iMo34963 & 128) == 0) {
            return new C18200(iMo34963, i + 1);
        }
        if (m47848(i, 2, i2)) {
            return new C18200(interfaceC23844.mo34963(i + 1) | ((iMo34963 & 127) << 8), i + 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m47843(InterfaceC23844 interfaceC23844, int i, int i2) throws IOException {
        if (!m47848(i, 2, i2)) {
            throw new IOException("Unexpected end of string data");
        }
        return interfaceC23844.mo34962(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47847(StringBuilder sb) {
        sb.setLength(0);
        if (sb.capacity() <= 6144) {
            f67861.m1477(sb);
        }
    }
}
