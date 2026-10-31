package l;

/* JADX INFO: renamed from: l.ۨܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11757 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6112 f35092;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f35093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35094;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6112 f35095;

    public C11757(int i) {
        this.f35093 = i;
        this.f35094 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28785(int i, int i2) {
        int i3 = this.f35093;
        int i4 = this.f35094;
        C6112 c6112 = new C6112(i3, i4, i, i2);
        C6112 c6113 = this.f35095;
        if (c6113 != null) {
            c6113.f18731 = c6112;
        } else {
            this.f35092 = c6112;
        }
        this.f35095 = c6112;
        this.f35093 = i3 + i;
        this.f35094 = i4 + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28784(int i) {
        this.f35093 += i;
        this.f35094 += i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6112 m28783() {
        return this.f35092;
    }
}
