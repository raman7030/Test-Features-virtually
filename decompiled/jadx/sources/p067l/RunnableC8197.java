package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC8197 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24290 f21630;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C13562 f21631;

    public RunnableC8197(C13562 c13562, C24290 c24290) {
        this.f21631 = c13562;
        this.f21630 = c24290;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13562 c13562 = this.f21631;
        List list = c13562.f38143;
        C24290 c24290 = this.f21630;
        list.add(c24290);
        if (!C19797.m45001(C24158.m53410())) {
            C11060.m25471("AttaReporter", "attaReport net disconnect, " + c24290);
        } else {
            try {
                C13562.m30865(c13562);
            } catch (Exception e) {
                C11060.m25465("AttaReporter", "Exception", e);
            }
        }
    }
}
