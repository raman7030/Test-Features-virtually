package l;

import android.content.Context;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0413 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1878;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1879;

    public /* synthetic */ RunnableC0413(int i, Object obj) {
        this.f1878 = i;
        this.f1879 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1878) {
            case 0:
                C6058.m16914((C6058) this.f1879);
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC8301(1, (Context) this.f1879));
                return;
            default:
                try {
                    ((ServerSocket) this.f1879).close();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
