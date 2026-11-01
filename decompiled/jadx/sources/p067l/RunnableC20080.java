package p067l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ᩴ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20080 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20751 f61044;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ DialogInterfaceC2564 f61045;

    public RunnableC20080(C20751 c20751, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f61044 = c20751;
        this.f61045 = dialogInterfaceC2564;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f61045.m3855()) {
            C20751 c20751 = this.f61044;
            SimpleDateFormat simpleDateFormat = c20751.f64064;
            if (simpleDateFormat != null) {
                c20751.m33337(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            }
            C7050.m16206(1000L, this);
        }
    }
}
