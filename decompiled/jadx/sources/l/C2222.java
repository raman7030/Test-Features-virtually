package l;

/* JADX INFO: renamed from: l.ۖ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes2.dex */
public final class C2222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f7272;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile long f7273;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19156 f7274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18177 f7275;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile C8572 f7276;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6807 f7277;

    public C2222(ViewOnClickListenerC19156 viewOnClickListenerC19156, C6807 c6807, C18177 c18177) {
        this.f7274 = viewOnClickListenerC19156;
        this.f7277 = c6807;
        this.f7275 = c18177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7401() {
        C8572 c8572 = this.f7276;
        if (c8572 == null || c8572.f26172 || c8572.f26173 == 0 || !this.f7274.m44227(this.f7275) || this.f7275.m42385() != this.f7273) {
            return;
        }
        this.f7277.m18486();
        C6807 c6807 = this.f7277;
        int i = c8572.f26174;
        C11041 c11041 = c6807.f21109;
        c11041.m27392(i, true);
        c6807.invalidate();
        c6807.m18483(c11041.m27418());
        this.f7272 = true;
    }
}
