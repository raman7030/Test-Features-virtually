package p067l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۢۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYL */
/* JADX INFO: loaded from: classes3.dex */
public class C11310 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31498 = AtomicReferenceFieldUpdater.newUpdater(C11310.class, Object.class, "_cur");
    public volatile /* synthetic */ Object _cur = new C17343(8, false);

    /* JADX INFO: renamed from: ۧ */
    public final int m26258() {
        return ((C17343) this._cur).m39323();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26256() {
        while (true) {
            C17343 c17343 = (C17343) this._cur;
            if (c17343.m39322()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31498;
            C17343 c17343M39326 = c17343.m39326();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c17343, c17343M39326) && atomicReferenceFieldUpdater.get(this) == c17343) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26257(Runnable runnable) {
        while (true) {
            C17343 c17343 = (C17343) this._cur;
            int iM39321 = c17343.m39321(runnable);
            if (iM39321 == 0) {
                return true;
            }
            if (iM39321 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31498;
                C17343 c17343M39326 = c17343.m39326();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c17343, c17343M39326) && atomicReferenceFieldUpdater.get(this) == c17343) {
                }
            } else if (iM39321 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m26259() {
        while (true) {
            C17343 c17343 = (C17343) this._cur;
            Object objM39325 = c17343.m39325();
            if (objM39325 != C17343.f51724) {
                return objM39325;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31498;
            C17343 c17343M39326 = c17343.m39326();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c17343, c17343M39326) && atomicReferenceFieldUpdater.get(this) == c17343) {
            }
        }
    }
}
