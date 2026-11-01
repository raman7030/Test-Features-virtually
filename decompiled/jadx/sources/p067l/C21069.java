package p067l;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21069 implements IntConsumer {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C4304 f66173;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ long f66174;

    /* JADX INFO: renamed from: ᩸ */
    public long f66175 = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: ᩹ */
    public long f66176 = 0;

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    public C21069(C4304 c4304, long j) {
        this.f66173 = c4304;
        this.f66174 = j;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.f66175;
        C4304 c4304 = this.f66173;
        if (j >= 1000) {
            c4304.mo8749();
            this.f66175 = jUptimeMillis;
        }
        long j2 = i;
        long j3 = this.f66176 + j2;
        this.f66176 = j3;
        c4304.mo8747(j2, j3, this.f66174);
        if (c4304.f9574.mo3924()) {
            throw new CancellationException();
        }
    }
}
