package com.github.luben.zstd;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class AutoCloseBase implements Closeable {
    public static final int SHARED_LOCK_CLOSED = -1;
    public static final AtomicIntegerFieldUpdater SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AutoCloseBase.class, "sharedLock");
    public volatile int sharedLock;

    public abstract void doClose();

    public void storeFence() {
        this.sharedLock = 0;
    }

    public void acquireSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i == Integer.MAX_VALUE) {
                throw new IllegalStateException("Shared lock overflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + 1));
    }

    public void releaseSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i - 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.sharedLock == -1) {
                return;
            }
            if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Attempt to close while in use");
            }
            doClose();
        }
    }
}
