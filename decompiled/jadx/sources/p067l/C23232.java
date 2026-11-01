package p067l;

/* JADX INFO: renamed from: l.᩹֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 63ZD */
/* JADX INFO: loaded from: classes.dex */
public final class C23232 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m51777(Object obj, AbstractC6462 abstractC6462) {
        if (!(obj instanceof Integer)) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = C22562.f71154[abstractC6462.mo5577().ordinal()];
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

    /* JADX INFO: renamed from: ۧ */
    public static String m51781(Object obj, AbstractC6462 abstractC6462) {
        Object objM51777 = m51777(obj, abstractC6462);
        int i = C22562.f71154[abstractC6462.mo5577().ordinal()];
        if (i == 2) {
            return "'" + C14514.m33172(((Character) objM51777).charValue()) + '\'';
        }
        if (i == 3) {
            Byte b = (Byte) objM51777;
            b.getClass();
            return String.format("(byte)0x%02x", b);
        }
        if (i == 5) {
            return ((Long) objM51777).longValue() + "L";
        }
        if (i == 6) {
            return m51779(((Float) objM51777).floatValue());
        }
        if (i == 7) {
            return m51778(((Double) objM51777).doubleValue());
        }
        if (!(objM51777 instanceof String)) {
            return objM51777 + "";
        }
        return "\"" + C14514.m33174((String) objM51777) + '\"';
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51780(Object obj) {
        if (!(obj instanceof Byte)) {
            if (!(obj instanceof Short)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof Float) {
                        return m51779(((Float) obj).floatValue());
                    }
                    if (obj instanceof Double) {
                        return m51778(((Double) obj).doubleValue());
                    }
                    if (!(obj instanceof Character)) {
                        if (!(obj instanceof String)) {
                            if ((obj instanceof Integer) || (obj instanceof Boolean)) {
                                return obj.toString();
                            }
                            throw new IllegalArgumentException("Argument is not a primitive type or a string; it " + "has class ".concat(obj.getClass().getName()) + ".");
                        }
                        return "\"" + C14514.m33174((String) obj) + '\"';
                    }
                    return "'" + C14514.m33172(((Character) obj).charValue()) + '\'';
                }
                return ((Long) obj).longValue() + "L";
            }
            return String.format("(short)%d", (Short) obj);
        }
        return String.format("(byte)0x%02x", (Byte) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51779(float f) {
        if (Float.isNaN(f)) {
            return "0.0f/0.0f";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f";
        }
        return f + "f";
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m51778(double d) {
        if (Double.isNaN(d)) {
            return "0.0/0.0";
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? "-1.0/0.0" : "1.0/0.0";
        }
        return d + "";
    }
}
