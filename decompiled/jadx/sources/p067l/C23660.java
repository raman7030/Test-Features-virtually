package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.᩹ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09KJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23660 {

    /* JADX INFO: renamed from: ֫ */
    public ReentrantReadWriteLock f75292 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۧ */
    public HashMap f75293 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public HashMap f75294 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m52611(C4925 c4925) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f75292;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f75293.put(Long.valueOf(c4925.m10469().m47380()), c4925);
            this.f75294.put(c4925.m10469().m47382(), c4925);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m52608() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f75292;
        reentrantReadWriteLock.readLock().lock();
        try {
            return new ArrayList(this.f75293.values());
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4925 m52612(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f75292;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C4925) this.f75293.get(Long.valueOf(j));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4925 m52609(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f75292;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C4925) this.f75294.get(str);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52610(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f75292;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C4925 c4925 = (C4925) this.f75293.remove(Long.valueOf(j));
            if (c4925 != null) {
                this.f75294.remove(c4925.m10469().m47382());
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
