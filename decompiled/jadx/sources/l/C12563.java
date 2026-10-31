package l;

/* JADX INFO: renamed from: l.۫ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes3.dex */
public class C12563 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short[] f37865;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public short[] f37866;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37867;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f37868;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short[] f37869;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char[] f37870;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short[] f37871;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short[][] f37872;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13999 f37873;

    /* JADX INFO: renamed from: ֫ */
    public String mo2212() {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo4057(int i, InterfaceC11858 interfaceC11858) {
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m30796(C13268 c13268) {
        short s;
        int iM32232 = c13268.m32232();
        int iMo4057 = 0;
        while (true) {
            try {
                short s2 = this.f37866[iMo4057];
                if (s2 >= 0) {
                    iMo4057 = mo4057(s2, c13268);
                    if (iMo4057 == -1) {
                        m30797(iMo4057, c13268);
                        throw null;
                    }
                    c13268.mo28965();
                } else {
                    short s3 = this.f37865[iMo4057];
                    if (s3 < 1) {
                        char cMo28964 = (char) c13268.mo28964(1);
                        char c = this.f37868[iMo4057];
                        if (cMo28964 >= c && cMo28964 <= this.f37870[iMo4057]) {
                            short s4 = this.f37872[iMo4057][cMo28964 - c];
                            if (s4 >= 0 || (s4 = this.f37871[iMo4057]) >= 0) {
                                c13268.mo28965();
                                iMo4057 = s4;
                            } else {
                                m30797(iMo4057, c13268);
                                throw null;
                            }
                        } else {
                            short s5 = this.f37871[iMo4057];
                            if (s5 < 0) {
                                if (cMo28964 == 65535 && (s = this.f37869[iMo4057]) >= 0) {
                                    short s6 = this.f37865[s];
                                    c13268.f39733 = iM32232;
                                    return s6;
                                }
                                m30797(iMo4057, c13268);
                                throw null;
                            }
                            c13268.mo28965();
                            iMo4057 = s5;
                        }
                    } else {
                        c13268.f39733 = iM32232;
                        return s3;
                    }
                }
            } catch (Throwable th) {
                c13268.f39733 = iM32232;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30797(int i, InterfaceC11858 interfaceC11858) throws C16775 {
        C23831 c23831 = this.f37873.f72693;
        throw new C16775(mo2212(), this.f37867, i, interfaceC11858);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short[] m30794(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i += 2) {
            iCharAt += str.charAt(i);
        }
        short[] sArr = new short[iCharAt];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str.charAt(i3 + 1);
            int i4 = 1;
            while (i4 <= cCharAt) {
                sArr[i2] = (short) cCharAt2;
                i4++;
                i2++;
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static char[] m30795(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i += 2) {
            iCharAt += str.charAt(i);
        }
        char[] cArr = new char[iCharAt];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = str.charAt(i3 + 1);
            int i4 = 1;
            while (i4 <= cCharAt) {
                cArr[i2] = cCharAt2;
                i4++;
                i2++;
            }
        }
        return cArr;
    }
}
