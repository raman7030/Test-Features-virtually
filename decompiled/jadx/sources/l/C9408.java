package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۢۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes3.dex */
public class C9408 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28551 = AtomicReferenceFieldUpdater.newUpdater(C9408.class, Object.class, "_cur");
    public volatile /* synthetic */ Object _cur = new C15756(8, false);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24248() {
        return ((C15756) this._cur).m37153();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24246() {
        while (true) {
            C15756 c15756 = (C15756) this._cur;
            if (c15756.m37152()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28551;
            C15756 c15756M37156 = c15756.m37156();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15756, c15756M37156) && atomicReferenceFieldUpdater.get(this) == c15756) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24247(Runnable runnable) {
        while (true) {
            C15756 c15756 = (C15756) this._cur;
            int iM37151 = c15756.m37151(runnable);
            if (iM37151 == 0) {
                return true;
            }
            if (iM37151 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28551;
                C15756 c15756M37156 = c15756.m37156();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c15756, c15756M37156) && atomicReferenceFieldUpdater.get(this) == c15756) {
                }
            } else if (iM37151 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m24249() {
        while (true) {
            C15756 c15756 = (C15756) this._cur;
            Object objM37155 = c15756.m37155();
            if (objM37155 != C15756.f48585) {
                return objM37155;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28551;
            C15756 c15756M37156 = c15756.m37156();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15756, c15756M37156) && atomicReferenceFieldUpdater.get(this) == c15756) {
            }
        }
    }
}
