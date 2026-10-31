package l;

/* JADX INFO: renamed from: l.ۛ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 792D */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6357 {
    IMMUTABLE,
    COLOR_FOLDER,
    COLOR_ACCENT;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m17656() {
        return this == IMMUTABLE;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m17655() {
        return this == COLOR_FOLDER;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m17654() {
        return this == COLOR_ACCENT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC6357 m17652(AbstractC21294 abstractC21294) {
        if (abstractC21294 == C19883.f64184) {
            return COLOR_FOLDER;
        }
        if (abstractC21294 == C19883.f64212) {
            return COLOR_ACCENT;
        }
        return IMMUTABLE;
    }
}
