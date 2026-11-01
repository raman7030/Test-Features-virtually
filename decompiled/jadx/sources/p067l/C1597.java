package p067l;

import android.os.Handler;

/* JADX INFO: renamed from: l.ܶ۫ */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1597 {

    /* JADX INFO: renamed from: ֫ */
    public final C2018 f49827;

    /* JADX INFO: renamed from: ۧ */
    public final Handler f49828;

    public C1597(C2018 c2018, Handler handler) {
        this.f49827 = c2018;
        this.f49828 = handler;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38174(C1384 c1384) {
        int i = c1384.f35812;
        Handler handler = this.f49828;
        C2018 c2018 = this.f49827;
        if (i == 0) {
            handler.post(new RunnableC0897(c2018, c1384.f35813));
        } else {
            handler.post(new RunnableC1247(c2018, i));
        }
    }
}
