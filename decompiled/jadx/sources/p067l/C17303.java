package p067l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17303 implements InterfaceC15962 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51604a;

    /* JADX INFO: renamed from: b */
    public final Object f51605b;

    public /* synthetic */ C17303(int i, Object obj) {
        this.f51604a = i;
        this.f51605b = obj;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        switch (this.f51604a) {
            case 0:
                Long lM27302a = c11940.m27302a(EnumC19947.OFFSET_SECONDS);
                if (lM27302a == null) {
                    return false;
                }
                sb.append("GMT");
                int iM53256y = AbstractC24029.m53256y(lM27302a.longValue());
                if (iM53256y != 0) {
                    int iAbs = Math.abs((iM53256y / 3600) % 100);
                    int iAbs2 = Math.abs((iM53256y / 60) % 60);
                    int iAbs3 = Math.abs(iM53256y % 60);
                    sb.append(iM53256y < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                    if (((EnumC21999) this.f51605b) == EnumC21999.FULL) {
                        m39215a(sb, iAbs);
                        sb.append(':');
                        m39215a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            m39215a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            m39215a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                m39215a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.f51605b);
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0110 A[PHI: r2 r3
      0x0110: PHI (r2v6 int) = (r2v5 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int) binds: [B:45:0x00bc, B:50:0x00cb, B:52:0x00d1, B:53:0x00d3, B:55:0x00d9, B:57:0x00e5, B:58:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r3v5 int) = (r3v4 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int) binds: [B:45:0x00bc, B:50:0x00cb, B:52:0x00d1, B:53:0x00d3, B:55:0x00d9, B:57:0x00e5, B:58:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        int i2;
        int iM39216b;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.f51604a) {
            case 0:
                int length = charSequence.length();
                if (c5234.m11292g(charSequence, i, "GMT", 0, 3)) {
                    int i7 = i + 3;
                    if (i7 == length) {
                        return c5234.m11291f(EnumC19947.OFFSET_SECONDS, 0L, i, i7);
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (cCharAt == '+') {
                        i2 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return c5234.m11291f(EnumC19947.OFFSET_SECONDS, 0L, i, i7);
                        }
                        i2 = -1;
                    }
                    int i8 = i + 4;
                    int i9 = 0;
                    if (((EnumC21999) this.f51605b) == EnumC21999.FULL) {
                        int iM39216b2 = m39216b(charSequence, i8);
                        int i10 = i + 6;
                        int iM39216b3 = m39216b(charSequence, i + 5);
                        if (iM39216b2 >= 0 && iM39216b3 >= 0) {
                            int i11 = i + 7;
                            if (charSequence.charAt(i10) == ':') {
                                iM39216b = (iM39216b2 * 10) + iM39216b3;
                                int iM39216b4 = m39216b(charSequence, i11);
                                i6 = i + 9;
                                int iM39216b5 = m39216b(charSequence, i + 8);
                                if (iM39216b4 >= 0 && iM39216b5 >= 0) {
                                    i5 = (iM39216b4 * 10) + iM39216b5;
                                    int i12 = i + 11;
                                    if (i12 < length && charSequence.charAt(i6) == ':') {
                                        int iM39216b6 = m39216b(charSequence, i + 10);
                                        int iM39216b7 = m39216b(charSequence, i12);
                                        if (iM39216b6 >= 0 && iM39216b7 >= 0) {
                                            i9 = (iM39216b6 * 10) + iM39216b7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i13 = i + 5;
                        iM39216b = m39216b(charSequence, i8);
                        if (iM39216b >= 0) {
                            if (i13 >= length) {
                                i3 = i13;
                            } else {
                                int iM39216b8 = m39216b(charSequence, i13);
                                if (iM39216b8 >= 0) {
                                    iM39216b = (iM39216b * 10) + iM39216b8;
                                    i13 = i + 6;
                                }
                                int i14 = i13 + 2;
                                if (i14 >= length || charSequence.charAt(i13) != ':' || i14 >= length || charSequence.charAt(i13) != ':') {
                                    i3 = i13;
                                } else {
                                    int iM39216b9 = m39216b(charSequence, i13 + 1);
                                    int iM39216b10 = m39216b(charSequence, i14);
                                    if (iM39216b9 < 0 || iM39216b10 < 0) {
                                        i3 = i13;
                                    } else {
                                        i9 = (iM39216b9 * 10) + iM39216b10;
                                        i3 = i13 + 3;
                                        int i15 = i13 + 5;
                                        if (i15 < length && charSequence.charAt(i3) == ':') {
                                            int iM39216b11 = m39216b(charSequence, i13 + 4);
                                            int iM39216b12 = m39216b(charSequence, i15);
                                            if (iM39216b11 >= 0 && iM39216b12 >= 0) {
                                                i6 = i13 + 6;
                                                i5 = i9;
                                                i9 = iM39216b12 + (iM39216b11 * 10);
                                                i4 = i6;
                                            }
                                        }
                                    }
                                }
                            }
                            i4 = i3;
                            i5 = i9;
                            i9 = 0;
                        }
                    }
                    return c5234.m11291f(EnumC19947.OFFSET_SECONDS, ((((long) i5) * 60) + (((long) iM39216b) * 3600) + ((long) i9)) * ((long) i2), i, i4);
                }
                return ~i;
            default:
                String str = (String) this.f51605b;
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !c5234.m11292g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    public final String toString() {
        switch (this.f51604a) {
            case 0:
                return "LocalizedOffset(" + ((EnumC21999) this.f51605b) + MotionUtils.EASING_TYPE_FORMAT_END;
            default:
                return "'" + ((String) this.f51605b).replace("'", "''") + "'";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m39215a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX INFO: renamed from: b */
    public static int m39216b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
