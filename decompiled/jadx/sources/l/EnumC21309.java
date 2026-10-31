package l;

/* JADX INFO: renamed from: l.᩸ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7CB */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21309 {
    ERROR("err."),
    WARNING("warn."),
    INFO("info.");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f68695;

    EnumC21309(String str) {
        this.f68695 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m48343() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String m48344() {
        return name().length() > 5 ? name().substring(0, 4) : name();
    }
}
