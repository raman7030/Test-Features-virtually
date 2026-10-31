package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ᩴ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18636 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19342 f57821;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f57822;

    public RunnableC18636(C19342 c19342, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f57821 = c19342;
        this.f57822 = dialogInterfaceC0206;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f57822.m1442()) {
            C19342 c19342 = this.f57821;
            SimpleDateFormat simpleDateFormat = c19342.f60832;
            if (simpleDateFormat != null) {
                c19342.m31251(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            }
            C4925.m14309(1000L, this);
        }
    }
}
