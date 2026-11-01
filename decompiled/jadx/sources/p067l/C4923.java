package p067l;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4923 implements InterfaceC19004 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f11209;

    @Override // p067l.InterfaceC19004
    /* JADX INFO: renamed from: ֫ */
    public final void mo10453(final AbstractC16321 abstractC16321) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC21647("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: l.ۡᩳ֫
            @Override // java.lang.Runnable
            public final void run() {
                C4923.m10452(this.f30347, abstractC16321, threadPoolExecutor);
            }
        });
    }

    public C4923(Context context) {
        this.f11209 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10452(C4923 c4923, AbstractC16321 abstractC16321, ThreadPoolExecutor threadPoolExecutor) {
        try {
            C14980 c14980M12287 = new C5553().m12287(c4923.f11209);
            if (c14980M12287 != null) {
                InterfaceC19004 interfaceC19004 = c14980M12287.f26369;
                ((C5593) interfaceC19004).m12387(threadPoolExecutor);
                interfaceC19004.mo10453(new C17662(abstractC16321, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            abstractC16321.mo30958(th);
            threadPoolExecutor.shutdown();
        }
    }
}
