package p067l;

import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ۗ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H52L */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5714 {
    BOOLEAN("Z", true),
    INT("I", true),
    FLOAT("F", true),
    DOUBLE("D", true),
    LONG("J", true),
    OBJECT("L", true),
    VOID("V", true),
    UNKNOWN("?"),
    ZIL(C0655am.f2274aB),
    ZIFL(C0655am.f2276aD),
    ZIF("m"),
    ZI("n"),
    IF(C0655am.f2275aC),
    JD("w");


    /* JADX INFO: renamed from: ᩸ */
    public boolean f14004;

    /* JADX INFO: renamed from: ᩹ */
    public String f14005;

    EnumC5714(String str, boolean z) {
        this.f14005 = str;
        this.f14004 = z;
    }

    EnumC5714(String str) {
        this.f14005 = str;
        this.f14004 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5714 m12710(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5714 m12711(EnumC5714 enumC5714, EnumC5714 enumC5715) {
        if (enumC5714 != enumC5715) {
            EnumC5714 enumC5716 = UNKNOWN;
            if (enumC5714 == enumC5716) {
                return enumC5715;
            }
            if (enumC5715 != enumC5716) {
                if (!enumC5714.f14004) {
                    return enumC5715.f14004 ? enumC5715 : m12713(enumC5714, enumC5715);
                }
                if (!enumC5715.f14004) {
                    return enumC5714;
                }
                EnumC5714 enumC5717 = INT;
                if ((enumC5714 == enumC5717 && enumC5715 == BOOLEAN) || enumC5714 == BOOLEAN || enumC5715 == enumC5717) {
                    return enumC5717;
                }
                throw new RuntimeException("Can't merge " + enumC5714 + " and " + enumC5715);
            }
        }
        return enumC5714;
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
    /* JADX INFO: renamed from: ۧ */
    public static EnumC5714 m12713(EnumC5714 enumC5714, EnumC5714 enumC5715) {
        EnumC5714 enumC5716 = JD;
        if (enumC5714 == enumC5716 || enumC5715 == enumC5716) {
            throw new RuntimeException("Can't merge " + enumC5714 + " and " + enumC5715);
        }
        switch (enumC5714.ordinal()) {
            case 8:
                switch (enumC5715.ordinal()) {
                    case 9:
                        return ZIL;
                    case 10:
                    case 11:
                        return ZI;
                    case 12:
                        return INT;
                    default:
                        return enumC5715;
                }
            case 9:
                return enumC5715;
            case 10:
                switch (enumC5715.ordinal()) {
                    case 8:
                    case 11:
                        return ZI;
                    case 9:
                        return ZIF;
                    case 10:
                    default:
                        if (enumC5715 == IF) {
                            return INT;
                        }
                        return ZI;
                    case 12:
                        return IF;
                }
            case 11:
                if (enumC5715 == IF) {
                    return INT;
                }
                return ZI;
            case 12:
                switch (enumC5715.ordinal()) {
                    case 8:
                    case 11:
                        return INT;
                    case 9:
                    case 10:
                        return IF;
                    default:
                        switch (enumC5715.ordinal()) {
                            case 8:
                            case 11:
                                return ZI;
                            case 9:
                                return ZIF;
                            case 10:
                            default:
                                if (enumC5715 == IF) {
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
        return this.f14005;
    }
}
