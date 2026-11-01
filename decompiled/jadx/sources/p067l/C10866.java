package p067l;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۡܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10866 {

    /* JADX INFO: renamed from: ֫ */
    public HandlerC16229 f30118;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceExecutorC10195 f30119;

    /* JADX INFO: renamed from: ܽ */
    public IOException f30120;

    /* JADX INFO: renamed from: ܳ */
    public static final C18912 f30115 = new C18912(0, -9223372036854775807L);

    /* JADX INFO: renamed from: ᩳ */
    public static final C18912 f30117 = new C18912(2, -9223372036854775807L);

    /* JADX INFO: renamed from: ܿ */
    public static final C18912 f30116 = new C18912(3, -9223372036854775807L);

    /* JADX WARN: Illegal instructions before constructor call */
    public C10866(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = C5792.f14228;
        this(C7513.m17405(Executors.newSingleThreadExecutor(new ThreadFactoryC17190(strConcat)), new C18241()));
    }

    public C10866(InterfaceExecutorC10195 interfaceExecutorC10195) {
        this.f30119 = interfaceExecutorC10195;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18912 m25032(long j, boolean z) {
        return new C18912(z ? 1 : 0, j);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m25041() {
        return this.f30120 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25040() {
        this.f30120 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25039(InterfaceC24947 interfaceC24947, InterfaceC19583 interfaceC19583, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C23877.m52958(looperMyLooper);
        this.f30120 = null;
        new HandlerC16229(this, looperMyLooper, interfaceC24947, interfaceC19583, i, SystemClock.elapsedRealtime()).m36984(0L);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m25042() {
        return this.f30118 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25036() {
        HandlerC16229 handlerC16229 = this.f30118;
        C23877.m52958(handlerC16229);
        handlerC16229.m36985(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25038(InterfaceC8854 interfaceC8854) {
        HandlerC16229 handlerC16229 = this.f30118;
        if (handlerC16229 != null) {
            handlerC16229.m36985(true);
        }
        InterfaceExecutorC10195 interfaceExecutorC10195 = this.f30119;
        if (interfaceC8854 != null) {
            interfaceExecutorC10195.execute(new RunnableC22266(interfaceC8854));
        }
        interfaceExecutorC10195.mo6231();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25037(int i) throws IOException {
        IOException iOException = this.f30120;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC16229 handlerC16229 = this.f30118;
        if (handlerC16229 != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC16229.f47759;
            }
            handlerC16229.m36983(i);
        }
    }
}
