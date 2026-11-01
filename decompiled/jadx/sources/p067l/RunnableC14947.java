package p067l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.۬ܽۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC14947 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ InterfaceC9969 f42678;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C20689 f42680;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C10748 f42681;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ ArrayList f42682;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ConcurrentLinkedQueue f42683;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ InterfaceC6616 f42684;

    /* JADX INFO: renamed from: ۙ */
    public final Object f42679 = new Object();

    /* JADX INFO: renamed from: ᩶ */
    public volatile int f42685 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f42686 = true;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f42687 = false;

    public RunnableC14947(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC6616 interfaceC6616, C20689 c20689, InterfaceC9969 interfaceC9969, ArrayList arrayList, C10748 c10748) {
        this.f42683 = concurrentLinkedQueue;
        this.f42684 = interfaceC6616;
        this.f42680 = c20689;
        this.f42678 = interfaceC9969;
        this.f42682 = arrayList;
        this.f42681 = c10748;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f42683.isEmpty()) {
            if (this.f42685 > 1000) {
                if (this.f42685 > 250000) {
                    synchronized (this.f42679) {
                        if (!this.f42687) {
                            C7050.m16212(new RunnableC6357(4, this.f42684));
                            this.f42687 = true;
                        }
                    }
                    return;
                }
                if (this.f42686) {
                    synchronized (this.f42679) {
                        if (this.f42686) {
                            this.f42687 = this.f42684.mo5696();
                            this.f42686 = false;
                        }
                    }
                }
                if (this.f42687) {
                    return;
                }
            }
            InterfaceC15206 interfaceC15206 = (InterfaceC15206) this.f42683.poll();
            if (interfaceC15206 == null || this.f42684.mo5692()) {
                return;
            }
            this.f42680.m46754(1);
            List listAccept = this.f42678.accept(interfaceC15206);
            if (listAccept != null) {
                synchronized (this) {
                    this.f42685 += listAccept.size();
                    this.f42682.add(new C7287(interfaceC15206.mo33760(), listAccept));
                }
                if (this.f42681.m24761()) {
                    this.f42684.mo5690(this.f42685);
                }
            }
        }
    }
}
