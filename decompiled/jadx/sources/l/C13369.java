package l;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: l.۬᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13369 extends Timer {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f39993;

    @Override // java.util.Timer
    public final synchronized void cancel() {
        if (this.f39993) {
            return;
        }
        this.f39993 = true;
        super.cancel();
    }

    public C13369(String str, boolean z) {
        super(str, z);
        this.f39993 = false;
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, long j) {
        if (this.f39993) {
            return;
        }
        super.schedule(timerTask, j);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, Date date) {
        if (this.f39993) {
            return;
        }
        super.schedule(timerTask, date);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, long j, long j2) {
        if (this.f39993) {
            return;
        }
        super.schedule(timerTask, j, j2);
    }

    @Override // java.util.Timer
    public final synchronized void schedule(TimerTask timerTask, Date date, long j) {
        if (this.f39993) {
            return;
        }
        super.schedule(timerTask, date, j);
    }

    @Override // java.util.Timer
    public final synchronized void scheduleAtFixedRate(TimerTask timerTask, long j, long j2) {
        if (this.f39993) {
            return;
        }
        super.scheduleAtFixedRate(timerTask, j, j2);
    }

    @Override // java.util.Timer
    public final synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j) {
        if (this.f39993) {
            return;
        }
        super.scheduleAtFixedRate(timerTask, date, j);
    }
}
