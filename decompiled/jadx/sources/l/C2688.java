package l;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2688 implements InterfaceC17504 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f8415;

    @Override // l.InterfaceC17504
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8407(final AbstractC14681 abstractC14681) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC20285("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: l.ۡᩳ֫
            @Override // java.lang.Runnable
            public final void run() {
                C2688.m8406(this.f27410, abstractC14681, threadPoolExecutor);
            }
        });
    }

    public C2688(Context context) {
        this.f8415 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8406(C2688 c2688, AbstractC14681 abstractC14681, ThreadPoolExecutor threadPoolExecutor) {
        try {
            C13270 c13270M10251 = new C3351().m10251(c2688.f8415);
            if (c13270M10251 != null) {
                InterfaceC17504 interfaceC17504 = c13270M10251.f23458;
                ((C3393) interfaceC17504).m10348(threadPoolExecutor);
                interfaceC17504.mo8407(new C16092(abstractC14681, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            abstractC14681.mo28909(th);
            threadPoolExecutor.shutdown();
        }
    }
}
