package p067l;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۚܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9CL */
/* JADX INFO: loaded from: classes2.dex */
public final class C7567 {

    /* JADX INFO: renamed from: ֫ */
    public ReentrantLock f19838 = new ReentrantLock();

    /* JADX INFO: renamed from: ۧ */
    public HashMap f19839 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final C2872 m17479(String str) {
        ReentrantLock reentrantLock = this.f19838;
        reentrantLock.lock();
        try {
            return (C2872) this.f19839.get(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17480(C2872 c2872) {
        ReentrantLock reentrantLock = this.f19838;
        reentrantLock.lock();
        try {
            this.f19839.put(c2872.m4621(), c2872);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17481(String str) {
        ReentrantLock reentrantLock = this.f19838;
        reentrantLock.lock();
        try {
            this.f19839.remove(str);
        } finally {
            reentrantLock.unlock();
        }
    }
}
