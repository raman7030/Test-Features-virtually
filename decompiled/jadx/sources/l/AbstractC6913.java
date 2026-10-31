package l;

/* JADX INFO: renamed from: l.ۜܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IO5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6913 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18705(EnumC1974 enumC1974) {
        switch (C23846.f77168[enumC1974.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 17;
            case 6:
            case 7:
                return 16;
            case 8:
                return 23;
            case 9:
                return 24;
            case 10:
                return 1;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + enumC1974);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18706(EnumC13988 enumC13988) {
        int i = C23846.f77167[enumC13988.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + enumC13988);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18707(int i) {
        if (i == 0) {
            return "UNIVERSAL";
        }
        if (i == 1) {
            return "APPLICATION";
        }
        if (i == 2) {
            return "";
        }
        if (i == 3) {
            return "PRIVATE";
        }
        throw new IllegalArgumentException(C19370.m44628(i, "Unsupported type class: "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18708(int i, int i2) {
        String strM32584;
        String strM18707 = m18707(i);
        if (i2 == 16) {
            strM32584 = "SEQUENCE";
        } else if (i2 == 17) {
            strM32584 = "SET";
        } else if (i2 == 23) {
            strM32584 = "UTC TIME";
        } else if (i2 != 24) {
            switch (i2) {
                case 1:
                    strM32584 = "BOOLEAN";
                    break;
                case 2:
                    strM32584 = "INTEGER";
                    break;
                case 3:
                    strM32584 = "BIT STRING";
                    break;
                case 4:
                    strM32584 = "OCTET STRING";
                    break;
                case 5:
                    strM32584 = "NULL";
                    break;
                case 6:
                    strM32584 = "OBJECT IDENTIFIER";
                    break;
                default:
                    strM32584 = C13540.m32584(new StringBuilder("0x"), i2);
                    break;
            }
        } else {
            strM32584 = "GENERALIZED TIME";
        }
        return strM18707.isEmpty() ? strM32584 : C22870.m50967(strM18707, " ", strM32584);
    }
}
