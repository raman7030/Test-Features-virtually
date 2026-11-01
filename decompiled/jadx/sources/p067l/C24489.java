package p067l;

/* JADX INFO: renamed from: l.᩺᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5BJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24489 {
    /* JADX INFO: renamed from: ֫ */
    public static C13761 m53985(int i) {
        return new C13761(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12420 m53983(C19736 c19736, AbstractC20407 abstractC20407, String str) {
        return new C12420(EnumC3642.ADD, c19736, abstractC20407, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C12420 m53986(C19736 c19736, AbstractC20407 abstractC20407, String str) {
        byte b = -1;
        switch (str.hashCode()) {
            case 68:
                if (str.equals("D")) {
                    b = 0;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    b = 1;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    b = 2;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                return new C12420(EnumC3642.DDIV, c19736, abstractC20407, str);
            case 1:
                return new C12420(EnumC3642.FDIV, c19736, abstractC20407, str);
            case 2:
                return new C12420(EnumC3642.IDIV, c19736, abstractC20407, str);
            case 3:
                return new C12420(EnumC3642.LDIV, c19736, abstractC20407, str);
            default:
                throw new RuntimeException("type must set to one of I/J/F/D");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13031 m53984(AbstractC10348[] abstractC10348Arr, String[] strArr, String str) {
        return new C13031(EnumC3642.INVOKE_NEW, abstractC10348Arr, str, "<init>", strArr, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C12420 m53987(C19736 c19736, AbstractC20407 abstractC20407, String str) {
        return new C12420(EnumC3642.MUL, c19736, abstractC20407, str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C12420 m53989(C19736 c19736, AbstractC20407 abstractC20407, String str) {
        return new C12420(EnumC3642.REM, c19736, abstractC20407, str);
    }

    /* JADX INFO: renamed from: ܿ */
    public static C12420 m53988(C19736 c19736, AbstractC20407 abstractC20407, String str) {
        return new C12420(EnumC3642.SUB, abstractC20407, c19736, str);
    }
}
