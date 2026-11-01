package p067l;

/* JADX INFO: renamed from: l.ۨ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13801 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public String f38994;

    /* JADX INFO: renamed from: ۙ */
    public C3999 f38995;

    /* JADX INFO: renamed from: ᩶ */
    public String f38996;

    /* JADX INFO: renamed from: ᩸ */
    public C3999 f38997;

    /* JADX INFO: renamed from: ᩹ */
    public String f38998;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38998.compareTo(((C13801) obj).f38998);
    }

    public C13801(String str, String str2, C3999 c3999) {
        this.f38998 = str;
        this.f38994 = str2;
        this.f38997 = c3999;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m31453() {
        return this.f38998;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m31456() {
        return this.f38994;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3999 m31448() {
        return this.f38997;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31449(String str) {
        this.f38996 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31450(C3999 c3999) {
        this.f38995 = c3999;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m31454() {
        return this.f38996;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m31455() {
        C3999 c3999 = this.f38995;
        if (c3999 == null) {
            c3999 = this.f38997;
        }
        if ((c3999.f8714 & 1) != 0) {
            return c3999.f8717;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۢ */
    public final long m31452() {
        C3999 c3999 = this.f38995;
        if (c3999 == null) {
            c3999 = this.f38997;
        }
        if ((c3999.f8714 & 8) != 0) {
            return ((long) c3999.f8715) * 1000;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m31451() {
        C3999 c3999 = this.f38995;
        if (c3999 == null) {
            c3999 = this.f38997;
        }
        return c3999.m7974();
    }

    public final String toString() {
        return this.f38994;
    }
}
