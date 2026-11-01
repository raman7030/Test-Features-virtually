package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܿᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19037 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f56753;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f56754;

    public /* synthetic */ RunnableC19037(int i, Object obj) {
        this.f56753 = i;
        this.f56754 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56753) {
            case 0:
                ((C16354) this.f56754).f48049.m12891((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
                return;
            default:
                C6197 c6197 = (C6197) this.f56754;
                C11249 c11249 = c6197.f15606;
                C14146 c14146 = c6197.f15601;
                C23631 c23631 = c6197.f15600;
                c6197.f15603 = false;
                FutureC5767 futureC5767 = c6197.f15608;
                if (futureC5767.isDone()) {
                    return;
                }
                try {
                    if (!c23631.f75228 || c14146 == null || c23631.f75242 != c14146 || c23631.f8387 != c11249 || !c6197.f15604.equals(c23631.m7649().f17850.mo25505()) || (c6197.f15611 != null && c14146.m32500() != c6197.f15611)) {
                        throw new CancellationException("Saving owner changed before capture");
                    }
                    FutureC5767 futureC5768 = c6197.f15605;
                    if (futureC5768 != null) {
                        if (!futureC5768.isDone()) {
                            return;
                        } else {
                            c6197.f15605.m12907();
                        }
                    }
                    FutureC5767 futureC5769 = c6197.f15610;
                    if (futureC5769 != null) {
                        if (!futureC5769.isDone()) {
                            return;
                        }
                        if (((C13693) c6197.f15610.m12907()).f38639 != c14146.m32500()) {
                            throw new CancellationException("Saving loaded content was replaced");
                        }
                    }
                    if (c23631.f75236 == null && c23631.f75243 == null) {
                        if (c23631.f75222 != null) {
                            C21070 c21070 = c23631.f75222;
                            C21070 c21071 = c6197.f15612;
                            if (c21070 != c21071) {
                                if (c21071 != null || c6197.f15611 != null) {
                                    throw new CancellationException("Saving preparation was superseded");
                                }
                                C21070 c21072 = c23631.f75222;
                                c6197.f15612 = c21072;
                                FutureC5767 futureC5767M47551 = c21072.m47551();
                                c6197.f15610 = futureC5767M47551;
                                futureC5767M47551.m12887((InterfaceC9988) new C8979(1, c6197));
                            }
                        }
                        if (c11249.m26151()) {
                            return;
                        }
                        if (c23631.f75211 == null || c23631.f75211.isDone()) {
                            if (c23631.m7643()) {
                                throw new IllegalStateException("Cannot save failed editor content");
                            }
                            if (c6197.f15611 == null) {
                                c6197.f15611 = c14146.m32500();
                            }
                            C10891 c10891M52519 = C23631.m52519(c23631, c6197.f15602);
                            c6197.f15599 = c10891M52519;
                            if (c10891M52519 != null) {
                                c6197.m14044();
                                futureC5767.m12889(c6197.f15599);
                                return;
                            } else {
                                if (c14146.m32600()) {
                                    throw new IllegalStateException("Editor content is not available for saving");
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c6197.m14045(th);
                    return;
                }
        }
    }
}
