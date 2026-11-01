package p067l;

/* JADX INFO: renamed from: l.ۛۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YX */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC8044 {
    READ_ONLY("read_only"),
    READ_WRITE("read_write"),
    DENY("deny");


    /* JADX INFO: renamed from: ᩸ */
    public final String f21170;

    EnumC8044(String str) {
        this.f21170 = str;
    }

    /* JADX INFO: renamed from: ܿ */
    public String m18664() {
        return this.f21170;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m18662() {
        return this != DENY;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m18663() {
        return this == READ_WRITE;
    }
}
