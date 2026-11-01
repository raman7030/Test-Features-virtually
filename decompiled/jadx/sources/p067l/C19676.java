package p067l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ᩳᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B0A */
/* JADX INFO: loaded from: classes5.dex */
public final class C19676 extends AbstractC24329 {

    /* JADX INFO: renamed from: ֫ */
    public final Serializable f59818;

    public C19676(Boolean bool) {
        C12826.requireNonNull(bool);
        this.f59818 = bool;
    }

    public C19676(Number number) {
        C12826.requireNonNull(number);
        this.f59818 = number;
    }

    public C19676(String str) {
        C12826.requireNonNull(str);
        this.f59818 = str;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m44689() {
        return this.f59818 instanceof Boolean;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m44692() {
        Serializable serializable = this.f59818;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(mo19013());
    }

    /* JADX INFO: renamed from: ܳ */
    public final double m44691() {
        return this.f59818 instanceof Number ? m44695().doubleValue() : Double.parseDouble(mo19013());
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m44694() {
        return this.f59818 instanceof Number;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Number m44695() {
        Serializable serializable = this.f59818;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C15651((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m44690() {
        return this.f59818 instanceof String;
    }

    @Override // p067l.AbstractC24329
    /* JADX INFO: renamed from: ܽ */
    public final String mo19013() {
        Serializable serializable = this.f59818;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                throw new AssertionError("Unexpected value type: " + serializable.getClass());
            }
            return m44695().toString();
        }
        return (String) serializable;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final BigInteger m44693() {
        Serializable serializable = this.f59818;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m44688(this)) {
            return BigInteger.valueOf(m44695().longValue());
        }
        return C8927.m20636(mo19013());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f59818;
        if (serializable == null) {
            return 31;
        }
        if (m44688(this)) {
            jDoubleToLongBits = m44695().longValue();
        } else if (serializable instanceof Number) {
            jDoubleToLongBits = Double.doubleToLongBits(m44695().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean equals(Object obj) {
        BigDecimal bigDecimalM20635;
        BigDecimal bigDecimalM20636;
        if (this == obj) {
            return true;
        }
        if (obj == null || C19676.class != obj.getClass()) {
            return false;
        }
        C19676 c19676 = (C19676) obj;
        Serializable serializable = c19676.f59818;
        Serializable serializable2 = this.f59818;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m44688(this) && m44688(c19676)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return m44693().equals(c19676.m44693());
            }
            return m44695().longValue() == c19676.m44695().longValue();
        }
        if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
            if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                if (serializable2 instanceof BigDecimal) {
                    bigDecimalM20635 = (BigDecimal) serializable2;
                } else {
                    bigDecimalM20635 = C8927.m20635(mo19013());
                }
                if (serializable instanceof BigDecimal) {
                    bigDecimalM20636 = (BigDecimal) serializable;
                } else {
                    bigDecimalM20636 = C8927.m20635(c19676.mo19013());
                }
                return bigDecimalM20635.compareTo(bigDecimalM20636) == 0;
            }
            double dM44691 = m44691();
            double dM44692 = c19676.m44691();
            if (dM44691 != dM44692) {
                return Double.isNaN(dM44691) && Double.isNaN(dM44692);
            }
            return true;
        }
        return serializable2.equals(serializable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m44688(C19676 c19676) {
        Serializable serializable = c19676.f59818;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
