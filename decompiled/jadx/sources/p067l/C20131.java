package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ᩴۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20131 {

    /* JADX INFO: renamed from: ۧ */
    public Exception f62322;

    /* JADX INFO: renamed from: ܽ */
    public long f62323 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫ */
    public long f62321 = -9223372036854775807L;

    /* JADX INFO: renamed from: ֫ */
    public final void m45575(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f62322 == null) {
            this.f62322 = exc;
        }
        if (this.f62323 == -9223372036854775807L && !C10072.m23523()) {
            this.f62323 = 200 + jElapsedRealtime;
        }
        long j = this.f62323;
        if (j != -9223372036854775807L && jElapsedRealtime >= j) {
            Exception exc2 = this.f62322;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f62322;
            m45574();
            throw exc3;
        }
        this.f62321 = jElapsedRealtime + 50;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m45576() {
        if (this.f62322 == null) {
            return false;
        }
        return C10072.m23523() || SystemClock.elapsedRealtime() < this.f62321;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45574() {
        this.f62322 = null;
        this.f62323 = -9223372036854775807L;
        this.f62321 = -9223372036854775807L;
    }
}
