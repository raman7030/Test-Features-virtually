package p067l;

/* JADX INFO: renamed from: l.ܶܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16920 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C18262 f50086;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f50087;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5522 f50088;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f50089;

    public RunnableC16920(C5522 c5522, C18262 c18262, int i, int i2) {
        this.f50088 = c5522;
        this.f50086 = c18262;
        this.f50087 = i;
        this.f50089 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5522 c5522 = this.f50088;
        if (c5522.f13203 != this) {
            return;
        }
        c5522.f13203 = null;
        C22957 c22957 = c5522.f13206;
        int i = this.f50087;
        C18262 c18262 = this.f50086;
        if (c22957.m51279(i, c18262)) {
            C5522.m12168(c5522, c18262, this.f50089);
        }
    }
}
