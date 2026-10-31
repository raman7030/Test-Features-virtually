package l;

import com.google.android.material.motion.MotionUtils;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2310 implements InterfaceC14303 {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final InterfaceC10030 a;
    public final int b;
    public final int c;
    public final EnumC23476 d;
    public final int e;

    public long a(C10071 c10071, long j) {
        return j;
    }

    public C2310(InterfaceC10030 interfaceC10030, int i, int i2, EnumC23476 enumC23476) {
        this.a = interfaceC10030;
        this.b = i;
        this.c = i2;
        this.d = enumC23476;
        this.e = 0;
    }

    public C2310(InterfaceC10030 interfaceC10030, int i, int i2, EnumC23476 enumC23476, int i3) {
        this.a = interfaceC10030;
        this.b = i;
        this.c = i2;
        this.d = enumC23476;
        this.e = i3;
    }

    public C2310 d() {
        if (this.e == -1) {
            return this;
        }
        return new C2310(this.a, this.b, this.c, this.d, -1);
    }

    public C2310 e(int i) {
        return new C2310(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // l.InterfaceC14303
    public boolean l(C10071 c10071, StringBuilder sb) {
        InterfaceC10030 interfaceC10030 = this.a;
        Long lA = c10071.a(interfaceC10030);
        if (lA == null) {
            return false;
        }
        long jA = a(c10071, lA.longValue());
        C1604 c1604 = c10071.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new C16232("Field " + interfaceC10030 + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        c1604.getClass();
        int i2 = this.b;
        EnumC23476 enumC23476 = this.d;
        if (jA >= 0) {
            int i3 = AbstractC7703.a[enumC23476.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC7703.a[enumC23476.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C16232("Field " + interfaceC10030 + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean b(C3015 c3015) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == EnumC23476.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x014d, code lost:
    
        if (r3 <= r10) goto L112;
     */
    @Override // l.InterfaceC14303
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m(C3015 c3015, CharSequence charSequence, int i) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        BigInteger bigIntegerDivide;
        long j;
        int i4;
        C6292 c6292;
        int i5 = i;
        int length = charSequence.length();
        if (i5 == length) {
            return ~i5;
        }
        char cCharAt = charSequence.charAt(i);
        C6292 c6293 = c3015.a;
        c6293.c.getClass();
        int i6 = this.c;
        EnumC23476 enumC23476 = this.d;
        int i7 = this.b;
        int i8 = 0;
        if (cCharAt == '+') {
            boolean z3 = c3015.c;
            boolean z4 = i7 == i6;
            int iOrdinal = enumC23476.ordinal();
            if (iOrdinal == 0 ? z3 : !(iOrdinal == 1 || iOrdinal == 4 || (!z3 && !z4))) {
                return ~i5;
            }
            z = false;
            i2 = i5 + 1;
            z2 = true;
        } else {
            c6293.c.getClass();
            if (cCharAt == '-') {
                boolean z5 = c3015.c;
                boolean z6 = i7 == i6;
                int iOrdinal2 = enumC23476.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z5 || z6)) {
                    return ~i5;
                }
                i5++;
                z = true;
            } else {
                if (enumC23476 == EnumC23476.ALWAYS && c3015.c) {
                    return ~i5;
                }
                z = false;
            }
            i2 = i5;
            z2 = false;
        }
        int i9 = (c3015.c || b(c3015)) ? i7 : 1;
        int i10 = i2 + i9;
        if (i10 > length) {
            return ~i2;
        }
        if (!c3015.c && !b(c3015)) {
            i6 = 9;
        }
        int i11 = this.e;
        int iMax = Math.max(i11, 0) + i6;
        while (true) {
            BigInteger bigIntegerAdd = null;
            if (i8 >= 2) {
                i3 = i2;
                bigIntegerDivide = null;
                j = 0;
                break;
            }
            int iMin = Math.min(iMax + i2, length);
            i3 = i2;
            long j2 = 0;
            while (true) {
                if (i3 >= iMin) {
                    i4 = length;
                    c6292 = c6293;
                    break;
                }
                int i12 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                i4 = length;
                c6293.c.getClass();
                int i13 = cCharAt2 - '0';
                c6292 = c6293;
                if (i13 < 0 || i13 > 9) {
                    i13 = -1;
                }
                if (i13 < 0) {
                    if (i3 >= i10) {
                        break;
                    }
                    return ~i2;
                }
                if (i12 - i2 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j2);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i13));
                } else {
                    j2 = (j2 * 10) + ((long) i13);
                }
                c6293 = c6292;
                i3 = i12;
                length = i4;
            }
            if (i11 <= 0 || i8 != 0) {
                bigIntegerDivide = bigIntegerAdd;
                j = j2;
                break;
            }
            iMax = Math.max(i9, (i3 - i2) - i11);
            i8++;
            c6293 = c6292;
            length = i4;
        }
        if (!z) {
            if (enumC23476 == EnumC23476.EXCEEDS_PAD && c3015.c) {
                int i14 = i3 - i2;
                if (!z2) {
                    if (i14 > i7) {
                        return ~i2;
                    }
                }
            }
            if (bigIntegerDivide == null) {
                return c(c3015, j, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return c(c3015, bigIntegerDivide.longValue(), i2, i3);
        }
        if (bigIntegerDivide != null) {
            if (!bigIntegerDivide.equals(BigInteger.ZERO) || !c3015.c) {
                bigIntegerDivide = bigIntegerDivide.negate();
                if (bigIntegerDivide == null) {
                    return c(c3015, j, i2, i3);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i3--;
                }
                return c(c3015, bigIntegerDivide.longValue(), i2, i3);
            }
            return ~(i2 - 1);
        }
        if (j != 0 || !c3015.c) {
            j = -j;
            if (bigIntegerDivide == null) {
                return c(c3015, j, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return c(c3015, bigIntegerDivide.longValue(), i2, i3);
        }
        return ~(i2 - 1);
    }

    public int c(C3015 c3015, long j, int i, int i2) {
        return c3015.f(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        InterfaceC10030 interfaceC10030 = this.a;
        EnumC23476 enumC23476 = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && enumC23476 == EnumC23476.NORMAL) {
            return "Value(" + interfaceC10030 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i2 == i && enumC23476 == EnumC23476.NOT_NEGATIVE) {
            return "Value(" + interfaceC10030 + "," + i2 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Value(" + interfaceC10030 + "," + i2 + "," + i + "," + enumC23476 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
