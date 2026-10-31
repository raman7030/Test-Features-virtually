package l;

import android.os.Handler;

/* JADX INFO: renamed from: l.ܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15218 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23706 f46703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Handler f46704;

    public C15218(C23706 c23706, Handler handler) {
        this.f46703 = c23706;
        this.f46704 = handler;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36013(C10926 c10926) {
        int i = c10926.f32834;
        Handler handler = this.f46704;
        C23706 c23706 = this.f46703;
        if (i == 0) {
            handler.post(new RunnableC1108(c23706, c10926.f32835));
        } else {
            handler.post(new RunnableC8164(c23706, i));
        }
    }
}
