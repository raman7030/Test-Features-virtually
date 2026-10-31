package l;

/* JADX INFO: renamed from: l.᩹֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 63ZD */
/* JADX INFO: loaded from: classes.dex */
public final class C21953 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m49440(Object obj, AbstractC4308 abstractC4308) {
        if (!(obj instanceof Integer)) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = C21248.f68472[abstractC4308.mo3258().ordinal()];
        if (i == 1) {
            return Boolean.valueOf(iIntValue != 0);
        }
        if (i == 2) {
            return Character.valueOf((char) iIntValue);
        }
        if (i != 3) {
            return i != 4 ? obj : Short.valueOf((short) iIntValue);
        }
        return Byte.valueOf((byte) iIntValue);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m49444(Object obj, AbstractC4308 abstractC4308) {
        Object objM49440 = m49440(obj, abstractC4308);
        int i = C21248.f68472[abstractC4308.mo3258().ordinal()];
        if (i == 2) {
            return "'" + C12780.m31088(((Character) objM49440).charValue()) + '\'';
        }
        if (i == 3) {
            Byte b = (Byte) objM49440;
            b.getClass();
            return String.format("(byte)0x%02x", b);
        }
        if (i == 5) {
            return ((Long) objM49440).longValue() + "L";
        }
        if (i == 6) {
            return m49442(((Float) objM49440).floatValue());
        }
        if (i == 7) {
            return m49441(((Double) objM49440).doubleValue());
        }
        if (!(objM49440 instanceof String)) {
            return objM49440 + "";
        }
        return "\"" + C12780.m31090((String) objM49440) + '\"';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49443(Object obj) {
        if (!(obj instanceof Byte)) {
            if (!(obj instanceof Short)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof Float) {
                        return m49442(((Float) obj).floatValue());
                    }
                    if (obj instanceof Double) {
                        return m49441(((Double) obj).doubleValue());
                    }
                    if (!(obj instanceof Character)) {
                        if (!(obj instanceof String)) {
                            if ((obj instanceof Integer) || (obj instanceof Boolean)) {
                                return obj.toString();
                            }
                            throw new IllegalArgumentException("Argument is not a primitive type or a string; it " + "has class ".concat(obj.getClass().getName()) + ".");
                        }
                        return "\"" + C12780.m31090((String) obj) + '\"';
                    }
                    return "'" + C12780.m31088(((Character) obj).charValue()) + '\'';
                }
                return ((Long) obj).longValue() + "L";
            }
            return String.format("(short)%d", (Short) obj);
        }
        return String.format("(byte)0x%02x", (Byte) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49442(float f) {
        if (Float.isNaN(f)) {
            return "0.0f/0.0f";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f";
        }
        return f + "f";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49441(double d) {
        if (Double.isNaN(d)) {
            return "0.0/0.0";
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? "-1.0/0.0" : "1.0/0.0";
        }
        return d + "";
    }
}
