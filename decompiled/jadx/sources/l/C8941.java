package l;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۡܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 763M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8941 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HandlerC14584 f27183;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceExecutorC8235 f27184;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public IOException f27185;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C17407 f27180 = new C17407(0, -9223372036854775807L);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C17407 f27182 = new C17407(2, -9223372036854775807L);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C17407 f27181 = new C17407(3, -9223372036854775807L);

    /* JADX WARN: Illegal instructions before constructor call */
    public C8941(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = C3603.f11424;
        this(C5413.m15494(Executors.newSingleThreadExecutor(new ThreadFactoryC15596(strConcat)), new C16701()));
    }

    public C8941(InterfaceExecutorC8235 interfaceExecutorC8235) {
        this.f27184 = interfaceExecutorC8235;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17407 m23058(long j, boolean z) {
        return new C17407(z ? 1 : 0, j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m23067() {
        return this.f27185 != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23066() {
        this.f27185 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23065(InterfaceC23757 interfaceC23757, InterfaceC18113 interfaceC18113, int i) {
        Looper looperMyLooper = Looper.myLooper();
        C22632.m50632(looperMyLooper);
        this.f27185 = null;
        new HandlerC14584(this, looperMyLooper, interfaceC23757, interfaceC18113, i, SystemClock.elapsedRealtime()).m34833(0L);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m23068() {
        return this.f27183 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23062() {
        HandlerC14584 handlerC14584 = this.f27183;
        C22632.m50632(handlerC14584);
        handlerC14584.m34834(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23064(InterfaceC6824 interfaceC6824) {
        HandlerC14584 handlerC14584 = this.f27183;
        if (handlerC14584 != null) {
            handlerC14584.m34834(true);
        }
        InterfaceExecutorC8235 interfaceExecutorC8235 = this.f27184;
        if (interfaceC6824 != null) {
            interfaceExecutorC8235.execute(new RunnableC20936(interfaceC6824));
        }
        interfaceExecutorC8235.mo3989();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23063(int i) throws IOException {
        IOException iOException = this.f27185;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC14584 handlerC14584 = this.f27183;
        if (handlerC14584 != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC14584.f44651;
            }
            handlerC14584.m34832(i);
        }
    }
}
