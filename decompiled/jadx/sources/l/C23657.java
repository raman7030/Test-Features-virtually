package l;

/* JADX INFO: renamed from: l.᩻ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C23657 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f76644;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17513 f76645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f76646;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f76647;

    public C23657(C21042 c21042) {
        this.f76646 = c21042.f67896;
        this.f76647 = c21042.f67897;
        this.f76644 = c21042.f67894;
        this.f76645 = c21042.f67895;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23657) {
            C23657 c23657 = (C23657) obj;
            if (this.f76646 == c23657.f76646 && this.f76647 == c23657.f76647 && this.f76644 == c23657.f76644 && this.f76645 == c23657.f76645) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f76645) + (((((System.identityHashCode(this.f76646) * 31) + this.f76647) * 31) + this.f76644) * 31);
    }
}
