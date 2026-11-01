package p067l;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۚܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7556 implements Closeable {

    /* JADX INFO: renamed from: ۙ */
    public final CountDownLatch f19826;

    /* JADX INFO: renamed from: ᩶ */
    public final C2861[] f19827;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicInteger f19828;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f19829;

    public C7556(InterfaceC16942[] interfaceC16942Arr) {
        this(Arrays.asList(interfaceC16942Arr));
    }

    public C7556(List list) {
        this.f19828 = new AtomicInteger();
        int i = 0;
        this.f19829 = false;
        this.f19827 = new C2861[list.size()];
        this.f19826 = new CountDownLatch(list.size());
        while (true) {
            C2861[] c2861Arr = this.f19827;
            if (i < c2861Arr.length) {
                c2861Arr[i] = new C2861(this, (InterfaceC16942) list.get(i));
                i++;
            } else {
                try {
                    this.f19826.await();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17474(ByteBuffer byteBuffer) {
        m17473(new C20968(byteBuffer), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17473(InputStream inputStream, C20689 c20689) {
        AtomicInteger atomicInteger;
        C20297 c20297 = new C20297();
        C20297 c20298 = new C20297();
        while (c20297.m45841(inputStream)) {
            do {
                atomicInteger = this.f19828;
                if (atomicInteger.get() == 0 || !c20297.m45842()) {
                    break;
                }
            } while (c20297.m45838(inputStream));
            if (c20689 != null) {
                c20689.m46754(c20297.m45840());
            }
            m17475(c20297);
            if (!c20298.m45841(inputStream)) {
                return;
            }
            while (atomicInteger.get() != 0 && c20298.m45842() && c20298.m45838(inputStream)) {
            }
            if (c20689 != null) {
                c20689.m46754(c20298.m45840());
            }
            m17475(c20298);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17475(C20297 c20297) {
        while (this.f19828.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f19828.set(this.f19827.length);
        for (C2861 c2861 : this.f19827) {
            c2861.f4944 = c20297;
            LockSupport.unpark(c2861);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (this.f19828.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f19829 = true;
        for (C2861 c2861 : this.f19827) {
            c2861.interrupt();
        }
    }
}
