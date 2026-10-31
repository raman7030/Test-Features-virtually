package l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.۬ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13235 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7997 f39614;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f39616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8817 f39617;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f39618;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentLinkedQueue f39619;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4469 f39620;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f39615 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f39621 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f39622 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f39623 = false;

    public RunnableC13235(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC4469 interfaceC4469, C19277 c19277, InterfaceC7997 interfaceC7997, ArrayList arrayList, C8817 c8817) {
        this.f39619 = concurrentLinkedQueue;
        this.f39620 = interfaceC4469;
        this.f39616 = c19277;
        this.f39614 = interfaceC7997;
        this.f39618 = arrayList;
        this.f39617 = c8817;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f39619.isEmpty()) {
            if (this.f39621 > 1000) {
                if (this.f39621 > 250000) {
                    synchronized (this.f39615) {
                        if (!this.f39623) {
                            C4925.m14315(new RunnableC4196(4, this.f39620));
                            this.f39623 = true;
                        }
                    }
                    return;
                }
                if (this.f39622) {
                    synchronized (this.f39615) {
                        if (this.f39622) {
                            this.f39623 = this.f39620.mo3377();
                            this.f39622 = false;
                        }
                    }
                }
                if (this.f39623) {
                    return;
                }
            }
            InterfaceC13508 interfaceC13508 = (InterfaceC13508) this.f39619.poll();
            if (interfaceC13508 == null || this.f39620.mo3373()) {
                return;
            }
            this.f39616.m44460(1);
            List listAccept = this.f39614.accept(interfaceC13508);
            if (listAccept != null) {
                synchronized (this) {
                    this.f39621 += listAccept.size();
                    this.f39618.add(new C5175(interfaceC13508.mo31672(), listAccept));
                }
                if (this.f39617.m22791()) {
                    this.f39620.mo3371(this.f39621);
                }
            }
        }
    }
}
