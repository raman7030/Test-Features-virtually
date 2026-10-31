package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15714 implements InterfaceC14303 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C15714(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = c10071.a(EnumC18496.OFFSET_SECONDS);
                if (lA == null) {
                    return false;
                }
                sb.append("GMT");
                int iY = AbstractC22791.y(lA.longValue());
                if (iY != 0) {
                    int iAbs = Math.abs((iY / 3600) % 100);
                    int iAbs2 = Math.abs((iY / 60) % 60);
                    int iAbs3 = Math.abs(iY % 60);
                    sb.append(iY < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                    if (((EnumC20655) this.b) == EnumC20655.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.b);
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0110 A[PHI: r2 r3
      0x0110: PHI (r2v6 int) = (r2v5 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int), (r2v8 int) binds: [B:45:0x00bc, B:50:0x00cb, B:52:0x00d1, B:53:0x00d3, B:55:0x00d9, B:57:0x00e5, B:58:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0110: PHI (r3v5 int) = (r3v4 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int), (r3v6 int) binds: [B:45:0x00bc, B:50:0x00cb, B:52:0x00d1, B:53:0x00d3, B:55:0x00d9, B:57:0x00e5, B:58:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        int i2;
        int iB;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                int length = charSequence.length();
                if (c3015.g(charSequence, i, "GMT", 0, 3)) {
                    int i7 = i + 3;
                    if (i7 == length) {
                        return c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i7);
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (cCharAt == '+') {
                        i2 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i7);
                        }
                        i2 = -1;
                    }
                    int i8 = i + 4;
                    int i9 = 0;
                    if (((EnumC20655) this.b) == EnumC20655.FULL) {
                        int iB2 = b(charSequence, i8);
                        int i10 = i + 6;
                        int iB3 = b(charSequence, i + 5);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i11 = i + 7;
                            if (charSequence.charAt(i10) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i11);
                                i6 = i + 9;
                                int iB5 = b(charSequence, i + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i5 = (iB4 * 10) + iB5;
                                    int i12 = i + 11;
                                    if (i12 < length && charSequence.charAt(i6) == ':') {
                                        int iB6 = b(charSequence, i + 10);
                                        int iB7 = b(charSequence, i12);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i9 = (iB6 * 10) + iB7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i13 = i + 5;
                        iB = b(charSequence, i8);
                        if (iB >= 0) {
                            if (i13 >= length) {
                                i3 = i13;
                            } else {
                                int iB8 = b(charSequence, i13);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i13 = i + 6;
                                }
                                int i14 = i13 + 2;
                                if (i14 >= length || charSequence.charAt(i13) != ':' || i14 >= length || charSequence.charAt(i13) != ':') {
                                    i3 = i13;
                                } else {
                                    int iB9 = b(charSequence, i13 + 1);
                                    int iB10 = b(charSequence, i14);
                                    if (iB9 < 0 || iB10 < 0) {
                                        i3 = i13;
                                    } else {
                                        i9 = (iB9 * 10) + iB10;
                                        i3 = i13 + 3;
                                        int i15 = i13 + 5;
                                        if (i15 < length && charSequence.charAt(i3) == ':') {
                                            int iB11 = b(charSequence, i13 + 4);
                                            int iB12 = b(charSequence, i15);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i6 = i13 + 6;
                                                i5 = i9;
                                                i9 = iB12 + (iB11 * 10);
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
                    return c3015.f(EnumC18496.OFFSET_SECONDS, ((((long) i5) * 60) + (((long) iB) * 3600) + ((long) i9)) * ((long) i2), i, i4);
                }
                return ~i;
            default:
                String str = (String) this.b;
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !c3015.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + ((EnumC20655) this.b) + MotionUtils.EASING_TYPE_FORMAT_END;
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
