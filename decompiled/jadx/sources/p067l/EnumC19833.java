package p067l;

/* JADX INFO: renamed from: l.ᩳ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P9JT */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19833 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: ᩸ */
    public int f60314;

    /* JADX INFO: renamed from: ᩹ */
    public String f60315;

    EnumC19833(int i, String str) {
        this.f60314 = i;
        this.f60315 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m45081() {
        return this.f60314;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f60315;
    }
}
