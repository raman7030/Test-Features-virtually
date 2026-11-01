package p067l;

/* JADX INFO: renamed from: l.ᩳۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19354 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f57781;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14146 f57782;

    public /* synthetic */ RunnableC19354(C14146 c14146, int i) {
        this.f57781 = i;
        this.f57782 = c14146;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57781) {
            case 0:
                C14146.m32268(this.f57782);
                break;
            default:
                this.f57782.requestFocus();
                break;
        }
    }
}
