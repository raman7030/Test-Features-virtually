package l;

/* JADX INFO: renamed from: l.᩺᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5BJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23275 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11987 m51589(int i) {
        return new C11987(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10576 m51587(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.ADD, c18274, abstractC18980, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10576 m51590(C18274 c18274, AbstractC18980 abstractC18980, String str) {
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
                return new C10576(EnumC1340.DDIV, c18274, abstractC18980, str);
            case 1:
                return new C10576(EnumC1340.FDIV, c18274, abstractC18980, str);
            case 2:
                return new C10576(EnumC1340.IDIV, c18274, abstractC18980, str);
            case 3:
                return new C10576(EnumC1340.LDIV, c18274, abstractC18980, str);
            default:
                throw new RuntimeException("type must set to one of I/J/F/D");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11219 m51588(AbstractC8396[] abstractC8396Arr, String[] strArr, String str) {
        return new C11219(EnumC1340.INVOKE_NEW, abstractC8396Arr, str, "<init>", strArr, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10576 m51591(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.MUL, c18274, abstractC18980, str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C10576 m51593(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.REM, c18274, abstractC18980, str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C10576 m51592(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.SUB, abstractC18980, c18274, str);
    }
}
