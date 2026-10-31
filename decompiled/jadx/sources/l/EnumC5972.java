package l;

/* JADX INFO: renamed from: l.ۛۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YX */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5972 {
    READ_ONLY("read_only"),
    READ_WRITE("read_write"),
    DENY("deny");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f18317;

    EnumC5972(String str) {
        this.f18317 = str;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m16738() {
        return this.f18317;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m16736() {
        return this != DENY;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m16737() {
        return this == READ_WRITE;
    }
}
