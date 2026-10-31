package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۛܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6133 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23066 f18772;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11778 f18773;

    public RunnableC6133(C11778 c11778, C23066 c23066) {
        this.f18773 = c11778;
        this.f18772 = c23066;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11778 c11778 = this.f18773;
        List list = c11778.f35144;
        C23066 c23066 = this.f18772;
        list.add(c23066);
        if (!C18338.m42739(C22927.m51019())) {
            C9145.m23520("AttaReporter", "attaReport net disconnect, " + c23066);
        } else {
            try {
                C11778.m28817(c11778);
            } catch (Exception e) {
                C9145.m23514("AttaReporter", "Exception", e);
            }
        }
    }
}
