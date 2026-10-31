package l;

/* JADX INFO: renamed from: l.۫ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I81G */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12333 {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);


    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f36930 = 63;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f36931 = 192;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f36933;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f36934;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29933(int i) {
        return i & 63;
    }

    EnumC12333(String str, int i) {
        this.f36933 = str;
        this.f36934 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m29935() {
        return this.f36933;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m29936() {
        return this.f36934;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC12333 m29932(int i) {
        int i2 = i & 192;
        for (EnumC12333 enumC12333 : values()) {
            if (enumC12333.f36934 == i2) {
                return enumC12333;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m29936();
    }
}
