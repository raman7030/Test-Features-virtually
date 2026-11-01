package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۢۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11435 {

    /* JADX INFO: renamed from: ۧ */
    public ReentrantReadWriteLock f31886 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ܽ */
    public HashMap f31887 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public HashMap f31885 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final C20152 m26422(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f31886;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C20152) this.f31887.get(l2);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20152 m26425(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f31886;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C20152 c20152 = (C20152) this.f31887.remove(l2);
            if (c20152 == null) {
                throw new C12776("Unable to find outstanding request for messageId " + l2);
            }
            this.f31885.remove(c20152.m45603());
            reentrantReadWriteLock.writeLock().unlock();
            return c20152;
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26424(C20152 c20152) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f31886;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f31887.put(Long.valueOf(c20152.m45605()), c20152);
            this.f31885.put(c20152.m45603(), c20152);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26423(C4630 c4630) {
        HashMap map = this.f31887;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f31886;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                C20152 c20152 = (C20152) map.remove((Long) it.next());
                this.f31885.remove(c20152.m45603());
                c20152.m45606().m42703(c4630);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }
}
