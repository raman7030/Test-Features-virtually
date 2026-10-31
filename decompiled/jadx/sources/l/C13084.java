package l;

/* JADX INFO: renamed from: l.۬ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C13084 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3581 f39178;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f39179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 f39180;

    public C13084(C9184 c9184, C3581 c3581, C2735 c2735) {
        this.f39179 = c9184;
        this.f39178 = c3581;
        this.f39180 = c2735;
    }

    public final int hashCode() {
        int i = this.f39177;
        if (i != 0) {
            return i;
        }
        int iM40897 = C17509.m40897(this.f39180, this.f39178.m10963());
        this.f39177 = iM40897;
        return iM40897;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13084)) {
            return false;
        }
        C13084 c13084 = (C13084) obj;
        C3581 c3581 = c13084.f39178;
        C6319 c6319 = this.f39179.f27821;
        C3581 c3582 = this.f39178;
        return c6319.m17550(c3582.f17560, c3581.f17560) && new C16803(c3582.m10963(), c3581.m10963()).m39538(this.f39180, c13084.f39180);
    }
}
