package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۢۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11455 extends AbstractC16147 {

    /* JADX INFO: renamed from: ֫ */
    public final C7431 f31958;

    /* JADX INFO: renamed from: ۧ */
    public final ExecutorService f31959;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f31960;

    /* JADX INFO: renamed from: ܽ */
    public final Handler f31961;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f31962;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f31963;

    public C11455(C24865 c24865) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f31962 = new HashMap(2);
        this.f31959 = c24865.f79431;
        this.f31960 = c24865.f79433;
        this.f31963 = c24865.f79434;
        this.f31958 = c24865.f79430;
        this.f31961 = handler;
    }

    @Override // p067l.AbstractC16147
    /* JADX INFO: renamed from: ۧ */
    public final void mo24852(C18830 c18830) {
        HashMap map = this.f31962;
        if (((Future) map.get(c18830)) == null) {
            map.put(c18830, this.f31959.submit(new RunnableC22184(this, c18830)));
        }
    }

    @Override // p067l.AbstractC16147
    /* JADX INFO: renamed from: ֫ */
    public final void mo24851(C18830 c18830) {
        Future future = (Future) this.f31962.remove(c18830);
        if (future != null) {
            future.cancel(true);
        }
        this.f31961.removeCallbacksAndMessages(c18830);
    }
}
