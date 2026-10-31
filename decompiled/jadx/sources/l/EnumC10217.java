package l;

/* JADX INFO: renamed from: l.ۤۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N9TZ */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10217 {
    Unknown("Unknown", 65535),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f30694;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f30695;

    EnumC10217(String str, int i) {
        this.f30694 = str;
        this.f30695 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m25646() {
        return this.f30694;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m25647() {
        return this.f30695;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10217 m25644(int i) {
        for (EnumC10217 enumC10217 : values()) {
            if (enumC10217.f30695 == i) {
                return enumC10217;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m25647();
    }
}
