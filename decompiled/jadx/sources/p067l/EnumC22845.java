package p067l;

/* JADX INFO: renamed from: l.᩸ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22845 {
    NONE,
    SUCCESS,
    FAIL,
    MISSING;

    /* JADX INFO: renamed from: ᩻ */
    public boolean m51053() {
        return this == NONE;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean m51052() {
        return this == SUCCESS;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m51049() {
        return this == FAIL;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m51051() {
        return this == MISSING;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m51050() {
        return m51049() || m51053();
    }
}
