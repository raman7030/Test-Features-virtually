package p067l;

import com.google.android.material.motion.MotionUtils;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C4564 implements InterfaceC15962 {

    /* JADX INFO: renamed from: f */
    public static final long[] f10231f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a */
    public final InterfaceC11901 f10232a;

    /* JADX INFO: renamed from: b */
    public final int f10233b;

    /* JADX INFO: renamed from: c */
    public final int f10234c;

    /* JADX INFO: renamed from: d */
    public final EnumC24680 f10235d;

    /* JADX INFO: renamed from: e */
    public final int f10236e;

    /* JADX INFO: renamed from: a */
    public long mo5560a(C11940 c11940, long j) {
        return j;
    }

    public C4564(InterfaceC11901 interfaceC11901, int i, int i2, EnumC24680 enumC24680) {
        this.f10232a = interfaceC11901;
        this.f10233b = i;
        this.f10234c = i2;
        this.f10235d = enumC24680;
        this.f10236e = 0;
    }

    public C4564(InterfaceC11901 interfaceC11901, int i, int i2, EnumC24680 enumC24680, int i3) {
        this.f10232a = interfaceC11901;
        this.f10233b = i;
        this.f10234c = i2;
        this.f10235d = enumC24680;
        this.f10236e = i3;
    }

    /* JADX INFO: renamed from: d */
    public C4564 mo5563d() {
        if (this.f10236e == -1) {
            return this;
        }
        return new C4564(this.f10232a, this.f10233b, this.f10234c, this.f10235d, -1);
    }

    /* JADX INFO: renamed from: e */
    public C4564 mo5564e(int i) {
        return new C4564(this.f10232a, this.f10233b, this.f10234c, this.f10235d, this.f10236e + i);
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public boolean mo9636l(C11940 c11940, StringBuilder sb) {
        InterfaceC11901 interfaceC11901 = this.f10232a;
        Long lM27302a = c11940.m27302a(interfaceC11901);
        if (lM27302a == null) {
            return false;
        }
        long jMo5560a = mo5560a(c11940, lM27302a.longValue());
        C3893 c3893 = c11940.f33254b.f22323c;
        String string = jMo5560a == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jMo5560a));
        int length = string.length();
        int i = this.f10234c;
        if (length > i) {
            throw new C17796("Field " + interfaceC11901 + " cannot be printed as the value " + jMo5560a + " exceeds the maximum print width of " + i);
        }
        c3893.getClass();
        int i2 = this.f10233b;
        EnumC24680 enumC24680 = this.f10235d;
        if (jMo5560a >= 0) {
            int i3 = AbstractC9690.f26713a[enumC24680.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jMo5560a >= f10231f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC9690.f26713a[enumC24680.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C17796("Field " + interfaceC11901 + " cannot be printed as the value " + jMo5560a + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo5561b(C5234 c5234) {
        int i = this.f10236e;
        if (i != -1) {
            return i > 0 && this.f10233b == this.f10234c && this.f10235d == EnumC24680.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x014d, code lost:
    
        if (r3 <= r10) goto L112;
     */
    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        BigInteger bigIntegerDivide;
        long j;
        int i4;
        C8349 c8349;
        int i5 = i;
        int length = charSequence.length();
        if (i5 == length) {
            return ~i5;
        }
        char cCharAt = charSequence.charAt(i);
        C8349 c83410 = c5234.f12334a;
        c83410.f22323c.getClass();
        int i6 = this.f10234c;
        EnumC24680 enumC24680 = this.f10235d;
        int i7 = this.f10233b;
        int i8 = 0;
        if (cCharAt == '+') {
            boolean z3 = c5234.f12336c;
            boolean z4 = i7 == i6;
            int iOrdinal = enumC24680.ordinal();
            if (iOrdinal == 0 ? z3 : !(iOrdinal == 1 || iOrdinal == 4 || (!z3 && !z4))) {
                return ~i5;
            }
            z = false;
            i2 = i5 + 1;
            z2 = true;
        } else {
            c83410.f22323c.getClass();
            if (cCharAt == '-') {
                boolean z5 = c5234.f12336c;
                boolean z6 = i7 == i6;
                int iOrdinal2 = enumC24680.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z5 || z6)) {
                    return ~i5;
                }
                i5++;
                z = true;
            } else {
                if (enumC24680 == EnumC24680.ALWAYS && c5234.f12336c) {
                    return ~i5;
                }
                z = false;
            }
            i2 = i5;
            z2 = false;
        }
        int i9 = (c5234.f12336c || mo5561b(c5234)) ? i7 : 1;
        int i10 = i2 + i9;
        if (i10 > length) {
            return ~i2;
        }
        if (!c5234.f12336c && !mo5561b(c5234)) {
            i6 = 9;
        }
        int i11 = this.f10236e;
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
                    c8349 = c83410;
                    break;
                }
                int i12 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                i4 = length;
                c83410.f22323c.getClass();
                int i13 = cCharAt2 - '0';
                c8349 = c83410;
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
                c83410 = c8349;
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
            c83410 = c8349;
            length = i4;
        }
        if (!z) {
            if (enumC24680 == EnumC24680.EXCEEDS_PAD && c5234.f12336c) {
                int i14 = i3 - i2;
                if (!z2) {
                    if (i14 > i7) {
                        return ~i2;
                    }
                }
            }
            if (bigIntegerDivide == null) {
                return mo5562c(c5234, j, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return mo5562c(c5234, bigIntegerDivide.longValue(), i2, i3);
        }
        if (bigIntegerDivide != null) {
            if (!bigIntegerDivide.equals(BigInteger.ZERO) || !c5234.f12336c) {
                bigIntegerDivide = bigIntegerDivide.negate();
                if (bigIntegerDivide == null) {
                    return mo5562c(c5234, j, i2, i3);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i3--;
                }
                return mo5562c(c5234, bigIntegerDivide.longValue(), i2, i3);
            }
            return ~(i2 - 1);
        }
        if (j != 0 || !c5234.f12336c) {
            j = -j;
            if (bigIntegerDivide == null) {
                return mo5562c(c5234, j, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return mo5562c(c5234, bigIntegerDivide.longValue(), i2, i3);
        }
        return ~(i2 - 1);
    }

    /* JADX INFO: renamed from: c */
    public int mo5562c(C5234 c5234, long j, int i, int i2) {
        return c5234.m11291f(this.f10232a, j, i, i2);
    }

    public String toString() {
        int i = this.f10234c;
        InterfaceC11901 interfaceC11901 = this.f10232a;
        EnumC24680 enumC24680 = this.f10235d;
        int i2 = this.f10233b;
        if (i2 == 1 && i == 19 && enumC24680 == EnumC24680.NORMAL) {
            return "Value(" + interfaceC11901 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i2 == i && enumC24680 == EnumC24680.NOT_NEGATIVE) {
            return "Value(" + interfaceC11901 + "," + i2 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Value(" + interfaceC11901 + "," + i2 + "," + i + "," + enumC24680 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
