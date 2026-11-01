package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6KV */
/* JADX INFO: loaded from: classes.dex */
public final class C24377 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public final Consumer f77183;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f77184;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC13649 f77185;

    /* JADX INFO: renamed from: ۬ */
    public final Object f77186;

    /* JADX INFO: renamed from: ᩶ */
    public final AtomicReference f77187;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicBoolean f77188;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f77189;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C24377(InterfaceC13649 interfaceC13649, Consumer consumer) {
        this.f77186 = new Object();
        this.f77187 = new AtomicReference();
        this.f77188 = new AtomicBoolean();
        this.f77185 = interfaceC13649;
        this.f77184 = true;
        this.f77183 = consumer;
    }

    public C24377(InputStream inputStream, Consumer consumer) {
        this.f77186 = new Object();
        AtomicReference atomicReference = new AtomicReference();
        this.f77187 = atomicReference;
        this.f77188 = new AtomicBoolean();
        this.f77185 = null;
        this.f77184 = false;
        this.f77183 = consumer;
        atomicReference.set(inputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    private InputStream m53734() {
        InputStream inputStreamMo31046;
        synchronized (this.f77186) {
            if (this.f77188.get()) {
                throw new IOException("HTML preview stream is closed");
            }
            inputStreamMo31046 = (InputStream) this.f77187.get();
            if (inputStreamMo31046 == null) {
                inputStreamMo31046 = this.f77185.mo31046();
                if (inputStreamMo31046 == null) {
                    throw new IOException("HTML preview source was not opened");
                }
                this.f77187.set(inputStreamMo31046);
                if (this.f77188.get()) {
                    InputStream inputStream = (InputStream) this.f77187.getAndSet(null);
                    if (inputStream != null) {
                        RunnableC22099 runnableC22099 = new RunnableC22099(4, inputStream);
                        if (this.f77184) {
                            C4081.f8988.execute(runnableC22099);
                        } else {
                            runnableC22099.run();
                        }
                    }
                    throw new IOException("HTML preview stream is closed");
                }
            }
        }
        return inputStreamMo31046;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f77189) {
            return -1;
        }
        try {
            int i = m53734().read();
            if (i == -1) {
                this.f77189 = true;
                close();
            }
            return i;
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f77189) {
            return -1;
        }
        try {
            int i3 = m53734().read(bArr, i, i2);
            if (i3 == -1) {
                this.f77189 = true;
                close();
            }
            return i3;
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f77189 || this.f77188.get()) {
            return 0;
        }
        try {
            InputStream inputStream = (InputStream) this.f77187.get();
            if (inputStream == null) {
                return 0;
            }
            return inputStream.available();
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0 || this.f77189) {
            return 0L;
        }
        try {
            return m53734().skip(j);
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f77188.compareAndSet(false, true)) {
            this.f77183.accept(this);
            InputStream inputStream = (InputStream) this.f77187.getAndSet(null);
            if (inputStream == null) {
                return;
            }
            RunnableC22099 runnableC22099 = new RunnableC22099(4, inputStream);
            if (this.f77184) {
                C4081.f8988.execute(runnableC22099);
            } else {
                runnableC22099.run();
            }
        }
    }
}
