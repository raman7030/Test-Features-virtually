package p067l;

/* JADX INFO: renamed from: l.ۜܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: IO5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8939 {
    /* JADX INFO: renamed from: ֫ */
    public static int m20654(EnumC4245 enumC4245) {
        switch (C25032.f79918[enumC4245.ordinal()]) {
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
                throw new IllegalArgumentException("Unsupported data type: " + enumC4245);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m20655(EnumC15663 enumC15663) {
        int i = C25032.f79917[enumC15663.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + enumC15663);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20656(int i) {
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
        throw new IllegalArgumentException(C20778.m46922(i, "Unsupported type class: "));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20657(int i, int i2) {
        String strM34687;
        String strM20656 = m20656(i);
        if (i2 == 16) {
            strM34687 = "SEQUENCE";
        } else if (i2 == 17) {
            strM34687 = "SET";
        } else if (i2 == 23) {
            strM34687 = "UTC TIME";
        } else if (i2 != 24) {
            switch (i2) {
                case 1:
                    strM34687 = "BOOLEAN";
                    break;
                case 2:
                    strM34687 = "INTEGER";
                    break;
                case 3:
                    strM34687 = "BIT STRING";
                    break;
                case 4:
                    strM34687 = "OCTET STRING";
                    break;
                case 5:
                    strM34687 = "NULL";
                    break;
                case 6:
                    strM34687 = "OBJECT IDENTIFIER";
                    break;
                default:
                    strM34687 = C1514.m34687(new StringBuilder("0x"), i2);
                    break;
            }
        } else {
            strM34687 = "GENERALIZED TIME";
        }
        return strM20656.isEmpty() ? strM34687 : C24104.m53357(strM20656, " ", strM34687);
    }
}
