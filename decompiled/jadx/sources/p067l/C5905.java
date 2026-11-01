package p067l;

import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ۘۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5905 implements InterfaceC15962 {

    /* JADX INFO: renamed from: d */
    public static final String[] f14560d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e */
    public static final C5905 f14561e = new C5905("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f */
    public static final C5905 f14562f = new C5905("+HH:MM:ss", "0");

    /* JADX INFO: renamed from: a */
    public final String f14563a;

    /* JADX INFO: renamed from: b */
    public final int f14564b;

    /* JADX INFO: renamed from: c */
    public final int f14565c;

    public C5905(String str, String str2) {
        C12826.requireNonNull(str, "pattern");
        C12826.requireNonNull(str2, "noOffsetText");
        for (int i = 0; i < 22; i++) {
            if (f14560d[i].equals(str)) {
                this.f14564b = i;
                this.f14565c = i % 11;
                this.f14563a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        Long lM27302a = c11940.m27302a(EnumC19947.OFFSET_SECONDS);
        boolean z = false;
        if (lM27302a == null) {
            return false;
        }
        int iM53256y = AbstractC24029.m53256y(lM27302a.longValue());
        String str = this.f14563a;
        if (iM53256y == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((iM53256y / 3600) % 100);
        int iAbs2 = Math.abs((iM53256y / 60) % 60);
        int iAbs3 = Math.abs(iM53256y % 60);
        int length = sb.length();
        sb.append(iM53256y < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        if (this.f14564b < 11 || iAbs >= 10) {
            m13260a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i = this.f14565c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
            m13260a(i > 0 && i % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z = true;
                }
                m13260a(z, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m13260a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = charSequence.length();
        int length2 = this.f14563a.length();
        if (length2 != 0) {
            if (i == length) {
                return ~i;
            }
            if (c5234.m11292g(charSequence, i, this.f14563a, 0, length2)) {
                return c5234.m11291f(EnumC19947.OFFSET_SECONDS, 0L, i, i + length2);
            }
        } else if (i == length) {
            return c5234.m11291f(EnumC19947.OFFSET_SECONDS, 0L, i, i);
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i6 = cCharAt == '-' ? -1 : 1;
            int i7 = this.f14565c;
            boolean z = i7 > 0 && i7 % 2 == 0;
            int i8 = this.f14564b;
            boolean z2 = i8 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!c5234.f12336c) {
                if (z2) {
                    if (z || (i8 == 0 && length > (i5 = i + 3) && charSequence.charAt(i5) == ':')) {
                        i8 = 10;
                        z = true;
                    } else {
                        i8 = 9;
                    }
                } else if (z || (i8 == 11 && length > (i4 = i + 3) && (charSequence.charAt(i + 2) == ':' || charSequence.charAt(i4) == ':'))) {
                    i8 = 21;
                    z = true;
                } else {
                    i8 = 20;
                }
            }
            switch (i8) {
                case 0:
                case 11:
                    c = 0;
                    m13262c(charSequence, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c = 0;
                    m13262c(charSequence, z2, iArr);
                    m13263d(charSequence, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c = 0;
                    m13262c(charSequence, z2, iArr);
                    m13263d(charSequence, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c = 0;
                    m13262c(charSequence, z2, iArr);
                    m13263d(charSequence, z, true, iArr);
                    m13261b(charSequence, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    m13262c(charSequence, z2, iArr);
                    m13263d(charSequence, z, true, iArr);
                    if (!m13261b(charSequence, z, 3, iArr)) {
                        c = 0;
                        iArr[0] = ~iArr[0];
                    } else {
                        c = 0;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    m13262c(charSequence, z2, iArr);
                    if (m13261b(charSequence, z, 2, iArr)) {
                        m13261b(charSequence, z, 3, iArr);
                    }
                    c = 0;
                    break;
                case 12:
                    m13264e(charSequence, 1, 4, iArr);
                    c = 0;
                    break;
                case 14:
                    m13264e(charSequence, 3, 4, iArr);
                    c = 0;
                    break;
                case 16:
                    m13264e(charSequence, 3, 6, iArr);
                    c = 0;
                    break;
                case 18:
                    m13264e(charSequence, 5, 6, iArr);
                    c = 0;
                    break;
                case 20:
                    m13264e(charSequence, 1, 6, iArr);
                    c = 0;
                    break;
                default:
                    c = 0;
                    break;
            }
            int i9 = iArr[c];
            if (i9 > 0) {
                int i10 = iArr[1];
                if (i10 > 23 || (i2 = iArr[2]) > 59 || (i3 = iArr[3]) > 59) {
                    throw new C17796("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c5234.m11291f(EnumC19947.OFFSET_SECONDS, ((((long) i2) * 60) + (((long) i10) * 3600) + ((long) i3)) * ((long) i6), i, i9);
            }
        }
        return length2 == 0 ? c5234.m11291f(EnumC19947.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    /* JADX INFO: renamed from: c */
    public static void m13262c(CharSequence charSequence, boolean z, int[] iArr) {
        if (z) {
            if (m13261b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        m13264e(charSequence, 1, 2, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m13263d(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (m13261b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX INFO: renamed from: b */
    public static boolean m13261b(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4 = iArr[0];
        if (i4 < 0) {
            return true;
        }
        if (z && i != 1) {
            int i5 = i4 + 1;
            if (i5 <= charSequence.length() && charSequence.charAt(i4) == ':') {
                i4 = i5;
                i2 = i4 + 2;
                if (i2 <= charSequence.length()) {
                    int i6 = i4 + 1;
                    cCharAt = charSequence.charAt(i4);
                    cCharAt2 = charSequence.charAt(i6);
                    if (cCharAt >= '0') {
                        i3 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i3 >= 0) {
                            iArr[i] = i3;
                            iArr[0] = i2;
                            return true;
                        }
                    }
                }
            }
        } else {
            i2 = i4 + 2;
            if (i2 <= charSequence.length()) {
                int i7 = i4 + 1;
                cCharAt = charSequence.charAt(i4);
                cCharAt2 = charSequence.charAt(i7);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i3 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i3 >= 0 && i3 <= 59) {
                        iArr[i] = i3;
                        iArr[0] = i2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static void m13264e(CharSequence charSequence, int i, int i2, int[] iArr) {
        int i3;
        char cCharAt;
        int i4 = iArr[0];
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && (i3 = i4 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i4)) >= '0' && cCharAt <= '9') {
            cArr[i5] = cCharAt;
            i6++;
            i5++;
            i4 = i3;
        }
        if (i6 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i6) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i4;
    }

    public final String toString() {
        String strReplace = this.f14563a.replace("'", "''");
        return "Offset(" + f14560d[this.f14564b] + ",'" + strReplace + "')";
    }
}
