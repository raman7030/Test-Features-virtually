package p067l;

/* JADX INFO: renamed from: l.۫ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4RX */
/* JADX INFO: loaded from: classes3.dex */
public class C14308 {

    /* JADX INFO: renamed from: ֫ */
    public short[] f40891;

    /* JADX INFO: renamed from: ۜ */
    public short[] f40892;

    /* JADX INFO: renamed from: ۧ */
    public int f40893;

    /* JADX INFO: renamed from: ܳ */
    public char[] f40894;

    /* JADX INFO: renamed from: ܽ */
    public short[] f40895;

    /* JADX INFO: renamed from: ܿ */
    public char[] f40896;

    /* JADX INFO: renamed from: ᩳ */
    public short[] f40897;

    /* JADX INFO: renamed from: ᩷ */
    public short[][] f40898;

    /* JADX INFO: renamed from: ᩻ */
    public C15673 f40899;

    /* JADX INFO: renamed from: ֫ */
    public String mo4579() {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo6301(int i, InterfaceC13638 interfaceC13638) {
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m32871(C14978 c14978) {
        short s;
        int iM34331 = c14978.m34331();
        int iMo6301 = 0;
        while (true) {
            try {
                short s2 = this.f40892[iMo6301];
                if (s2 >= 0) {
                    iMo6301 = mo6301(s2, c14978);
                    if (iMo6301 == -1) {
                        m32872(iMo6301, c14978);
                        throw null;
                    }
                    c14978.mo31016();
                } else {
                    short s3 = this.f40891[iMo6301];
                    if (s3 < 1) {
                        char cMo31015 = (char) c14978.mo31015(1);
                        char c = this.f40894[iMo6301];
                        if (cMo31015 >= c && cMo31015 <= this.f40896[iMo6301]) {
                            short s4 = this.f40898[iMo6301][cMo31015 - c];
                            if (s4 >= 0 || (s4 = this.f40897[iMo6301]) >= 0) {
                                c14978.mo31016();
                                iMo6301 = s4;
                            } else {
                                m32872(iMo6301, c14978);
                                throw null;
                            }
                        } else {
                            short s5 = this.f40897[iMo6301];
                            if (s5 < 0) {
                                if (cMo31015 == 65535 && (s = this.f40895[iMo6301]) >= 0) {
                                    short s6 = this.f40891[s];
                                    c14978.f42798 = iM34331;
                                    return s6;
                                }
                                m32872(iMo6301, c14978);
                                throw null;
                            }
                            c14978.mo31016();
                            iMo6301 = s5;
                        }
                    } else {
                        c14978.f42798 = iM34331;
                        return s3;
                    }
                }
            } catch (Throwable th) {
                c14978.f42798 = iM34331;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32872(int i, InterfaceC13638 interfaceC13638) throws C18311 {
        C25017 c25017 = this.f40899.f75419;
        throw new C18311(mo4579(), this.f40893, i, interfaceC13638);
    }

    /* JADX INFO: renamed from: ֫ */
    public static short[] m32869(String str) {
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

    /* JADX INFO: renamed from: ۧ */
    public static char[] m32870(String str) {
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
