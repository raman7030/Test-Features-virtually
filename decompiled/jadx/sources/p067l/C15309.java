package p067l;

import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.ܰۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15309 extends AbstractC23239 {

    /* JADX INFO: renamed from: ֫ */
    public CountDownLatch f43692;

    /* JADX INFO: renamed from: ۧ */
    public Intent f43693;

    @Override // p067l.AbstractC23239
    public final void send(Intent intent) {
        this.f43693 = intent;
        this.f43692.countDown();
    }
}
