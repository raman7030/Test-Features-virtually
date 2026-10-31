package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.᩹ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09KJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22403 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f72566 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f72567 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f72568 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50271(C2690 c2690) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72566;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f72567.put(Long.valueOf(c2690.m8423().m45084()), c2690);
            this.f72568.put(c2690.m8423().m45086(), c2690);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m50268() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72566;
        reentrantReadWriteLock.readLock().lock();
        try {
            return new ArrayList(this.f72567.values());
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2690 m50272(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72566;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C2690) this.f72567.get(Long.valueOf(j));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2690 m50269(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72566;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C2690) this.f72568.get(str);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50270(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f72566;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C2690 c2690 = (C2690) this.f72567.remove(Long.valueOf(j));
            if (c2690 != null) {
                this.f72568.remove(c2690.m8423().m45086());
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
