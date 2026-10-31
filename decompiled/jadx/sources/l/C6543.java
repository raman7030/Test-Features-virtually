package l;

import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۜۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6543 extends C2310 {
    public final boolean g;

    @Override // l.C2310
    public final boolean b(C3015 c3015) {
        return c3015.c && this.b == this.c && !this.g;
    }

    @Override // l.C2310, l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        boolean z = c3015.c;
        C6292 c6292 = c3015.a;
        int i2 = (z || b(c3015)) ? this.b : 0;
        int i3 = (c3015.c || b(c3015)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                c6292.c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                char cCharAt2 = charSequence.charAt(i7);
                c6292.c.getClass();
                int i9 = cCharAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 < 0) {
                    if (i8 >= i5) {
                        break;
                    }
                    return ~i4;
                }
                i6 = (i6 * 10) + i9;
                i7 = i8;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            C22729 c22729S = this.a.s();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c22729S.a);
            return c3015.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c22729S.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public C6543(InterfaceC10030 interfaceC10030, int i, int i2, boolean z) {
        this(interfaceC10030, i, i2, z, 0);
        C11003.requireNonNull(interfaceC10030, "field");
        C22729 c22729S = interfaceC10030.s();
        if (c22729S.a != c22729S.b || c22729S.c != c22729S.d) {
            throw new IllegalArgumentException(AbstractC15526.a("Field must have a fixed set of values: ", interfaceC10030));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public C6543(InterfaceC10030 interfaceC10030, int i, int i2, boolean z, int i3) {
        super(interfaceC10030, i, i2, EnumC23476.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // l.C2310
    public final C2310 d() {
        if (this.e == -1) {
            return this;
        }
        return new C6543(this.a, this.b, this.c, this.g, -1);
    }

    @Override // l.C2310
    public final C2310 e(int i) {
        return new C6543(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // l.C2310, l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        InterfaceC10030 interfaceC10030 = this.a;
        Long lA = c10071.a(interfaceC10030);
        if (lA == null) {
            return false;
        }
        C1604 c1604 = c10071.b.c;
        long jLongValue = lA.longValue();
        C22729 c22729S = interfaceC10030.s();
        c22729S.b(jLongValue, interfaceC10030);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c22729S.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c22729S.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            c1604.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c1604.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c1604.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // l.C2310
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
