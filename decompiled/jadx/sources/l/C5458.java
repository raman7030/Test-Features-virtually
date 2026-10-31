package l;

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
public final class C5458 implements Closeable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f16985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0518[] f16986;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16987;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f16988;

    public C5458(InterfaceC15334[] interfaceC15334Arr) {
        this(Arrays.asList(interfaceC15334Arr));
    }

    public C5458(List list) {
        this.f16987 = new AtomicInteger();
        int i = 0;
        this.f16988 = false;
        this.f16986 = new C0518[list.size()];
        this.f16985 = new CountDownLatch(list.size());
        while (true) {
            C0518[] c0518Arr = this.f16986;
            if (i < c0518Arr.length) {
                c0518Arr[i] = new C0518(this, (InterfaceC15334) list.get(i));
                i++;
            } else {
                try {
                    this.f16985.await();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15563(ByteBuffer byteBuffer) {
        m15562(new C19570(byteBuffer), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15562(InputStream inputStream, C19277 c19277) {
        AtomicInteger atomicInteger;
        C18864 c18864 = new C18864();
        C18864 c18865 = new C18864();
        while (c18864.m43575(inputStream)) {
            do {
                atomicInteger = this.f16987;
                if (atomicInteger.get() == 0 || !c18864.m43576()) {
                    break;
                }
            } while (c18864.m43572(inputStream));
            if (c19277 != null) {
                c19277.m44460(c18864.m43574());
            }
            m15564(c18864);
            if (!c18865.m43575(inputStream)) {
                return;
            }
            while (atomicInteger.get() != 0 && c18865.m43576() && c18865.m43572(inputStream)) {
            }
            if (c19277 != null) {
                c19277.m44460(c18865.m43574());
            }
            m15564(c18865);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15564(C18864 c18864) {
        while (this.f16987.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f16987.set(this.f16986.length);
        for (C0518 c0518 : this.f16986) {
            c0518.f2171 = c18864;
            LockSupport.unpark(c0518);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (this.f16987.get() != 0) {
            LockSupport.parkNanos(1000L);
        }
        this.f16988 = true;
        for (C0518 c0518 : this.f16986) {
            c0518.interrupt();
        }
    }
}
