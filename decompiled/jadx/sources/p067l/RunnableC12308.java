package p067l;

/* JADX INFO: renamed from: l.ۤᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6KO */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12308 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ boolean[] f34357;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f34358;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20335 f34359;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean f34360;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3570 f34361;

    public /* synthetic */ RunnableC12308(boolean z, C3570 c3570, C20335 c20335, String str, boolean[] zArr) {
        this.f34360 = z;
        this.f34361 = c3570;
        this.f34359 = c20335;
        this.f34358 = str;
        this.f34357 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f34360) {
            return;
        }
        this.f34361.m6568(this.f34359, this.f34358, this.f34357[0]);
    }
}
