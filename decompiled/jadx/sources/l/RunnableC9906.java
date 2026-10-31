package l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۢ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9906 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7997 f29954;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f29956;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f29957;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentLinkedQueue f29958;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8817 f29959;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4469 f29960;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f29955 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f29961 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f29962 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29963 = false;

    public RunnableC9906(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC4469 interfaceC4469, C19277 c19277, InterfaceC7997 interfaceC7997, ArrayList arrayList, C8817 c8817) {
        this.f29958 = concurrentLinkedQueue;
        this.f29960 = interfaceC4469;
        this.f29957 = c19277;
        this.f29954 = interfaceC7997;
        this.f29956 = arrayList;
        this.f29959 = c8817;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f29958.isEmpty()) {
            if (this.f29961 > 1000) {
                if (this.f29961 > 250000) {
                    synchronized (this.f29955) {
                        if (!this.f29963) {
                            C4925.m14315(new RunnableC4196(4, this.f29960));
                            this.f29963 = true;
                        }
                    }
                    return;
                }
                if (this.f29962) {
                    synchronized (this.f29955) {
                        if (this.f29962) {
                            this.f29963 = this.f29960.mo3377();
                            this.f29962 = false;
                        }
                    }
                }
                if (this.f29963) {
                    return;
                }
            }
            InterfaceC1438 interfaceC1438 = (InterfaceC1438) this.f29958.poll();
            if (interfaceC1438 == null || this.f29960.mo3373()) {
                return;
            }
            this.f29957.m44460(1);
            List listAccept = this.f29954.accept(interfaceC1438);
            if (listAccept != null) {
                synchronized (this) {
                    this.f29961 += listAccept.size();
                    this.f29956.add(new C5175(interfaceC1438.getPath(), listAccept));
                }
                if (this.f29959.m22791()) {
                    this.f29960.mo3371(this.f29961);
                }
            }
        }
    }
}
