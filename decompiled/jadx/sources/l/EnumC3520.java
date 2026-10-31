package l;

import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۗ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H52L */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3520 {
    BOOLEAN("Z", true),
    INT("I", true),
    FLOAT("F", true),
    DOUBLE("D", true),
    LONG("J", true),
    OBJECT("L", true),
    VOID("V", true),
    UNKNOWN("?"),
    ZIL(am.aB),
    ZIFL(am.aD),
    ZIF("m"),
    ZI("n"),
    IF(am.aC),
    JD("w");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11198;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f11199;

    EnumC3520(String str, boolean z) {
        this.f11199 = str;
        this.f11198 = z;
    }

    EnumC3520(String str) {
        this.f11199 = str;
        this.f11198 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3520 m10714(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            return FLOAT;
        }
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return VOID;
                }
                if (cCharAt == 'i') {
                    return IF;
                }
                if (cCharAt == 's') {
                    return ZIL;
                }
                if (cCharAt == 'w') {
                    return JD;
                }
                if (cCharAt == 'z') {
                    return ZIFL;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        return LONG;
                    }
                    if (cCharAt == 'Z') {
                        return BOOLEAN;
                    }
                    if (cCharAt != '[') {
                        if (cCharAt == 'm') {
                            return ZIF;
                        }
                        if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    return DOUBLE;
                                default:
                                    return UNKNOWN;
                            }
                        } else {
                            return ZI;
                        }
                    }
                }
            }
            return INT;
        }
        return OBJECT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3520 m10715(EnumC3520 enumC3520, EnumC3520 enumC3521) {
        if (enumC3520 != enumC3521) {
            EnumC3520 enumC3522 = UNKNOWN;
            if (enumC3520 == enumC3522) {
                return enumC3521;
            }
            if (enumC3521 != enumC3522) {
                if (!enumC3520.f11198) {
                    return enumC3521.f11198 ? enumC3521 : m10717(enumC3520, enumC3521);
                }
                if (!enumC3521.f11198) {
                    return enumC3520;
                }
                EnumC3520 enumC3523 = INT;
                if ((enumC3520 == enumC3523 && enumC3521 == BOOLEAN) || enumC3520 == BOOLEAN || enumC3521 == enumC3523) {
                    return enumC3523;
                }
                throw new RuntimeException("Can't merge " + enumC3520 + " and " + enumC3521);
            }
        }
        return enumC3520;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x002f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    /* JADX WARN: Code duplicated, block: B:27:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x004d A[RETURN] */
    /* JADX WARN: Switch 'out' block B:25:0x0032 for B:10:0x0017 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC3520 m10717(EnumC3520 enumC3520, EnumC3520 enumC3521) {
        EnumC3520 enumC3522 = JD;
        if (enumC3520 == enumC3522 || enumC3521 == enumC3522) {
            throw new RuntimeException("Can't merge " + enumC3520 + " and " + enumC3521);
        }
        switch (enumC3520.ordinal()) {
            case 8:
                switch (enumC3521.ordinal()) {
                    case 9:
                        return ZIL;
                    case 10:
                    case 11:
                        return ZI;
                    case 12:
                        return INT;
                    default:
                        return enumC3521;
                }
            case 9:
                return enumC3521;
            case 10:
                switch (enumC3521.ordinal()) {
                    case 8:
                    case 11:
                        return ZI;
                    case 9:
                        return ZIF;
                    case 10:
                    default:
                        if (enumC3521 == IF) {
                            return INT;
                        }
                        return ZI;
                    case 12:
                        return IF;
                }
            case 11:
                if (enumC3521 == IF) {
                    return INT;
                }
                return ZI;
            case 12:
                switch (enumC3521.ordinal()) {
                    case 8:
                    case 11:
                        return INT;
                    case 9:
                    case 10:
                        return IF;
                    default:
                        switch (enumC3521.ordinal()) {
                            case 8:
                            case 11:
                                return ZI;
                            case 9:
                                return ZIF;
                            case 10:
                            default:
                                if (enumC3521 == IF) {
                                    return INT;
                                }
                                return ZI;
                            case 12:
                                return IF;
                        }
                }
            default:
                throw new RuntimeException();
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11199;
    }
}
