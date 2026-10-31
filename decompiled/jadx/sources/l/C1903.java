package l;

/* JADX INFO: renamed from: l.֫ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public final class C1903 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f6416;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6417;

    public C1903(C16719 c16719) {
        int iMo9480 = c16719.f51348 == null ? -1 : c16719.f51348.mo9480();
        if (iMo9480 == -1 || c16719.f51346 == null) {
            this.f6416 = -1;
            this.f6417 = -1;
        } else {
            this.f6417 = c16719.f51346.m34392(iMo9480);
            this.f6416 = c16719.f51346.m34389(iMo9480, true);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6254() {
        return this.f6417;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6253() {
        return this.f6416;
    }
}
