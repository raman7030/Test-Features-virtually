package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩹ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99J1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23504 {

    /* JADX INFO: renamed from: ֫ */
    public ReentrantLock f74897 = new ReentrantLock();

    /* JADX INFO: renamed from: ۧ */
    public HashMap f74898 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m52277(Long l2, C16953 c16953) {
        ReentrantLock reentrantLock = this.f74897;
        reentrantLock.lock();
        try {
            this.f74898.put(l2, c16953);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16953 m52276(Long l2) {
        ReentrantLock reentrantLock = this.f74897;
        reentrantLock.lock();
        try {
            return (C16953) this.f74898.get(l2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52278(Long l2) {
        ReentrantLock reentrantLock = this.f74897;
        reentrantLock.lock();
        try {
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m52275() {
        ReentrantLock reentrantLock = this.f74897;
        reentrantLock.lock();
        try {
            return new ArrayList(this.f74898.values());
        } finally {
            reentrantLock.unlock();
        }
    }
}
