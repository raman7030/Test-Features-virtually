package p067l;

/* JADX INFO: renamed from: l.ۛ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 792D */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC8411 {
    IMMUTABLE,
    COLOR_FOLDER,
    COLOR_ACCENT;

    /* JADX INFO: renamed from: ܿ */
    public boolean m19599() {
        return this == IMMUTABLE;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m19598() {
        return this == COLOR_FOLDER;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m19597() {
        return this == COLOR_ACCENT;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8411 m19595(AbstractC22606 abstractC22606) {
        if (abstractC22606 == C21265.f66820) {
            return COLOR_FOLDER;
        }
        if (abstractC22606 == C21265.f66848) {
            return COLOR_ACCENT;
        }
        return IMMUTABLE;
    }
}
