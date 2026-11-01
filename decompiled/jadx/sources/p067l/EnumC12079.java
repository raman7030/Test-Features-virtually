package p067l;

/* JADX INFO: renamed from: l.ۤۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12079 {
    Unknown("Unknown", 65535),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);


    /* JADX INFO: renamed from: ᩸ */
    public final String f33655;

    /* JADX INFO: renamed from: ᩹ */
    public final int f33656;

    EnumC12079(String str, int i) {
        this.f33655 = str;
        this.f33656 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m27668() {
        return this.f33655;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m27669() {
        return this.f33656;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12079 m27666(int i) {
        for (EnumC12079 enumC12079 : values()) {
            if (enumC12079.f33656 == i) {
                return enumC12079;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m27669();
    }
}
