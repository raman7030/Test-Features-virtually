package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܿᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17538 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53562;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53563;

    public /* synthetic */ RunnableC17538(int i, Object obj) {
        this.f53562 = i;
        this.f53563 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53562) {
            case 0:
                ((C14715) this.f53563).f44935.m10914((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
                return;
            default:
                C4028 c4028 = (C4028) this.f53563;
                C9344 c9344 = c4028.f12791;
                C12392 c12392 = c4028.f12786;
                C22372 c22372 = c4028.f12785;
                c4028.f12788 = false;
                FutureC3575 futureC3575 = c4028.f12793;
                if (futureC3575.isDone()) {
                    return;
                }
                try {
                    if (!c22372.f72503 || c12392 == null || c22372.f72517 != c12392 || c22372.f5607 != c9344 || !c4028.f12789.equals(c22372.m5420().f15019.mo23554()) || (c4028.f12796 != null && c12392.m30436() != c4028.f12796)) {
                        throw new CancellationException("Saving owner changed before capture");
                    }
                    FutureC3575 futureC3576 = c4028.f12790;
                    if (futureC3576 != null) {
                        if (!futureC3576.isDone()) {
                            return;
                        } else {
                            c4028.f12790.m10930();
                        }
                    }
                    FutureC3575 futureC3577 = c4028.f12795;
                    if (futureC3577 != null) {
                        if (!futureC3577.isDone()) {
                            return;
                        }
                        if (((C11915) c4028.f12795.m10930()).f35630 != c12392.m30436()) {
                            throw new CancellationException("Saving loaded content was replaced");
                        }
                    }
                    if (c22372.f72511 == null && c22372.f72518 == null) {
                        if (c22372.f72497 != null) {
                            C19677 c19677 = c22372.f72497;
                            C19677 c19678 = c4028.f12797;
                            if (c19677 != c19678) {
                                if (c19678 != null || c4028.f12796 != null) {
                                    throw new CancellationException("Saving preparation was superseded");
                                }
                                C19677 c19679 = c22372.f72497;
                                c4028.f12797 = c19679;
                                FutureC3575 futureC3575M45254 = c19679.m45254();
                                c4028.f12795 = futureC3575M45254;
                                futureC3575M45254.m10910((InterfaceC8017) new C6955(1, c4028));
                            }
                        }
                        if (c9344.m24142()) {
                            return;
                        }
                        if (c22372.f72486 == null || c22372.f72486.isDone()) {
                            if (c22372.m5414()) {
                                throw new IllegalStateException("Cannot save failed editor content");
                            }
                            if (c4028.f12796 == null) {
                                c4028.f12796 = c12392.m30436();
                            }
                            C8967 c8967M50179 = C22372.m50179(c22372, c4028.f12787);
                            c4028.f12784 = c8967M50179;
                            if (c8967M50179 != null) {
                                c4028.m12124();
                                futureC3575.m10912(c4028.f12784);
                                return;
                            } else {
                                if (c12392.m30536()) {
                                    throw new IllegalStateException("Editor content is not available for saving");
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c4028.m12125(th);
                    return;
                }
        }
    }
}
