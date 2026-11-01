package p067l;

import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۜۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8587 extends C4564 {

    /* JADX INFO: renamed from: g */
    public final boolean f23071g;

    @Override // p067l.C4564
    /* JADX INFO: renamed from: b */
    public final boolean mo5561b(C5234 c5234) {
        return c5234.f12336c && this.f10233b == this.f10234c && !this.f23071g;
    }

    @Override // p067l.C4564, p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        boolean z = c5234.f12336c;
        C8349 c8349 = c5234.f12334a;
        int i2 = (z || mo5561b(c5234)) ? this.f10233b : 0;
        int i3 = (c5234.f12336c || mo5561b(c5234)) ? this.f10234c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.f23071g) {
                char cCharAt = charSequence.charAt(i);
                c8349.f22323c.getClass();
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
                c8349.f22323c.getClass();
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
            C23970 c23970Mo3657s = this.f10232a.mo3657s();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c23970Mo3657s.f76156a);
            return c5234.m11291f(this.f10232a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c23970Mo3657s.f76159d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public C8587(InterfaceC11901 interfaceC11901, int i, int i2, boolean z) {
        this(interfaceC11901, i, i2, z, 0);
        C12826.requireNonNull(interfaceC11901, "field");
        C23970 c23970Mo3657s = interfaceC11901.mo3657s();
        if (c23970Mo3657s.f76156a != c23970Mo3657s.f76157b || c23970Mo3657s.f76158c != c23970Mo3657s.f76159d) {
            throw new IllegalArgumentException(AbstractC17125.m38752a("Field must have a fixed set of values: ", interfaceC11901));
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

    public C8587(InterfaceC11901 interfaceC11901, int i, int i2, boolean z, int i3) {
        super(interfaceC11901, i, i2, EnumC24680.NOT_NEGATIVE, i3);
        this.f23071g = z;
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: d */
    public final C4564 mo5563d() {
        if (this.f10236e == -1) {
            return this;
        }
        return new C8587(this.f10232a, this.f10233b, this.f10234c, this.f23071g, -1);
    }

    @Override // p067l.C4564
    /* JADX INFO: renamed from: e */
    public final C4564 mo5564e(int i) {
        return new C8587(this.f10232a, this.f10233b, this.f10234c, this.f23071g, this.f10236e + i);
    }

    @Override // p067l.C4564, p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        InterfaceC11901 interfaceC11901 = this.f10232a;
        Long lM27302a = c11940.m27302a(interfaceC11901);
        if (lM27302a == null) {
            return false;
        }
        C3893 c3893 = c11940.f33254b.f22323c;
        long jLongValue = lM27302a.longValue();
        C23970 c23970Mo3657s = interfaceC11901.mo3657s();
        c23970Mo3657s.m53122b(jLongValue, interfaceC11901);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c23970Mo3657s.f76156a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c23970Mo3657s.f76159d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.f23071g;
        int i = this.f10233b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f10234c), roundingMode).toPlainString().substring(2);
            c3893.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c3893.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c3893.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // p067l.C4564
    public final String toString() {
        return "Fraction(" + this.f10232a + "," + this.f10233b + "," + this.f10234c + (this.f23071g ? ",DecimalPoint" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
