package p067l;

/* JADX INFO: renamed from: l.᩸ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7CB */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22620 {
    ERROR("err."),
    WARNING("warn."),
    INFO("info.");


    /* JADX INFO: renamed from: ᩸ */
    public final String f71386;

    EnumC22620(String str) {
        this.f71386 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m50678() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }

    /* JADX INFO: renamed from: ۧ */
    public String m50679() {
        return name().length() > 5 ? name().substring(0, 4) : name();
    }
}
