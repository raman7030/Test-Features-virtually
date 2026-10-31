package l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ᩳᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B0A */
/* JADX INFO: loaded from: classes5.dex */
public final class C18211 extends AbstractC23107 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Serializable f56605;

    public C18211(Boolean bool) {
        C11003.requireNonNull(bool);
        this.f56605 = bool;
    }

    public C18211(Number number) {
        C11003.requireNonNull(number);
        this.f56605 = number;
    }

    public C18211(String str) {
        C11003.requireNonNull(str);
        this.f56605 = str;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m42428() {
        return this.f56605 instanceof Boolean;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m42431() {
        Serializable serializable = this.f56605;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(mo17081());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m42430() {
        return this.f56605 instanceof Number ? m42434().doubleValue() : Double.parseDouble(mo17081());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m42433() {
        return this.f56605 instanceof Number;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Number m42434() {
        Serializable serializable = this.f56605;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C13976((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m42429() {
        return this.f56605 instanceof String;
    }

    @Override // l.AbstractC23107
    /* JADX INFO: renamed from: ܽ */
    public final String mo17081() {
        Serializable serializable = this.f56605;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                throw new AssertionError("Unexpected value type: " + serializable.getClass());
            }
            return m42434().toString();
        }
        return (String) serializable;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BigInteger m42432() {
        Serializable serializable = this.f56605;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m42427(this)) {
            return BigInteger.valueOf(m42434().longValue());
        }
        return C6901.m18687(mo17081());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f56605;
        if (serializable == null) {
            return 31;
        }
        if (m42427(this)) {
            jDoubleToLongBits = m42434().longValue();
        } else if (serializable instanceof Number) {
            jDoubleToLongBits = Double.doubleToLongBits(m42434().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean equals(Object obj) {
        BigDecimal bigDecimalM18686;
        BigDecimal bigDecimalM18687;
        if (this == obj) {
            return true;
        }
        if (obj == null || C18211.class != obj.getClass()) {
            return false;
        }
        C18211 c18211 = (C18211) obj;
        Serializable serializable = c18211.f56605;
        Serializable serializable2 = this.f56605;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m42427(this) && m42427(c18211)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return m42432().equals(c18211.m42432());
            }
            return m42434().longValue() == c18211.m42434().longValue();
        }
        if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
            if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                if (serializable2 instanceof BigDecimal) {
                    bigDecimalM18686 = (BigDecimal) serializable2;
                } else {
                    bigDecimalM18686 = C6901.m18686(mo17081());
                }
                if (serializable instanceof BigDecimal) {
                    bigDecimalM18687 = (BigDecimal) serializable;
                } else {
                    bigDecimalM18687 = C6901.m18686(c18211.mo17081());
                }
                return bigDecimalM18686.compareTo(bigDecimalM18687) == 0;
            }
            double dM42430 = m42430();
            double dM42431 = c18211.m42430();
            if (dM42430 != dM42431) {
                return Double.isNaN(dM42430) && Double.isNaN(dM42431);
            }
            return true;
        }
        return serializable2.equals(serializable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42427(C18211 c18211) {
        Serializable serializable = c18211.f56605;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
