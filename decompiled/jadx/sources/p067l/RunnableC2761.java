package p067l;

import android.content.Context;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2761 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f4655;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f4656;

    public /* synthetic */ RunnableC2761(int i, Object obj) {
        this.f4655 = i;
        this.f4656 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4655) {
            case 0:
                C8126.m18843((C8126) this.f4656);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC10258(1, (Context) this.f4656));
                return;
            default:
                try {
                    ((ServerSocket) this.f4656).close();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
