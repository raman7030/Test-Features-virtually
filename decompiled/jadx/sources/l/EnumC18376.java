package l;

/* JADX INFO: renamed from: l.ᩳ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P9JT */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18376 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f57094;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f57095;

    EnumC18376(int i, String str) {
        this.f57094 = i;
        this.f57095 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m42809() {
        return this.f57094;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f57095;
    }
}
