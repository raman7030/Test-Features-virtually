package p067l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ۢ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P1EM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11784 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ InterfaceC9969 f32912;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ ArrayList f32914;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C20689 f32915;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ ConcurrentLinkedQueue f32916;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C10748 f32917;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ InterfaceC6616 f32918;

    /* JADX INFO: renamed from: ۙ */
    public final Object f32913 = new Object();

    /* JADX INFO: renamed from: ᩶ */
    public volatile int f32919 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f32920 = true;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f32921 = false;

    public RunnableC11784(ConcurrentLinkedQueue concurrentLinkedQueue, InterfaceC6616 interfaceC6616, C20689 c20689, InterfaceC9969 interfaceC9969, ArrayList arrayList, C10748 c10748) {
        this.f32916 = concurrentLinkedQueue;
        this.f32918 = interfaceC6616;
        this.f32915 = c20689;
        this.f32912 = interfaceC9969;
        this.f32914 = arrayList;
        this.f32917 = c10748;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.f32916.isEmpty()) {
            if (this.f32919 > 1000) {
                if (this.f32919 > 250000) {
                    synchronized (this.f32913) {
                        if (!this.f32921) {
                            C7050.m16212(new RunnableC6357(4, this.f32918));
                            this.f32921 = true;
                        }
                    }
                    return;
                }
                if (this.f32920) {
                    synchronized (this.f32913) {
                        if (this.f32920) {
                            this.f32921 = this.f32918.mo5696();
                            this.f32920 = false;
                        }
                    }
                }
                if (this.f32921) {
                    return;
                }
            }
            InterfaceC3736 interfaceC3736 = (InterfaceC3736) this.f32916.poll();
            if (interfaceC3736 == null || this.f32918.mo5692()) {
                return;
            }
            this.f32915.m46754(1);
            List listAccept = this.f32912.accept(interfaceC3736);
            if (listAccept != null) {
                synchronized (this) {
                    this.f32919 += listAccept.size();
                    this.f32914.add(new C7287(interfaceC3736.getPath(), listAccept));
                }
                if (this.f32917.m24761()) {
                    this.f32918.mo5690(this.f32919);
                }
            }
        }
    }
}
