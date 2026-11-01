package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8BL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19504 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۨ */
    public static final C18162 f59407 = new C18162(new byte[0]);

    /* JADX INFO: renamed from: ۗ */
    public final InputStream f59408;

    /* JADX INFO: renamed from: ۛ */
    public final Thread f59410;

    /* JADX INFO: renamed from: ۤ */
    public volatile Exception f59411;

    /* JADX INFO: renamed from: ۙ */
    public final LinkedBlockingQueue f59409 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ᩸ */
    public final LinkedBlockingQueue f59415 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ۫ */
    public final AtomicBoolean f59412 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicBoolean f59416 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶ */
    public C18162 f59414 = null;

    /* JADX INFO: renamed from: ۬ */
    public int f59413 = 0;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C19504(InputStream inputStream) {
        this.f59408 = inputStream;
        for (int i = 0; i < 3; i++) {
            this.f59415.add(new C18162(new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT]));
        }
        Thread thread = new Thread(new RunnableC20876(4, this, inputStream));
        this.f59410 = thread;
        thread.setName("InputStream-Decompress-Thread");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m44343(C19504 c19504, InputStream inputStream) {
        C18162 c18162 = f59407;
        while (!c19504.f59416.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    try {
                        C18162 c18163 = (C18162) c19504.f59415.poll(100L, TimeUnit.MILLISECONDS);
                        if (c18163 == null) {
                            if (c19504.f59416.get()) {
                                break;
                            }
                        } else {
                            int i = inputStream.read(c18163.f54238);
                            if (i == -1) {
                                c19504.f59415.put(c18163);
                                break;
                            }
                            c18163.f54239 = i;
                            boolean zOffer = false;
                            while (!zOffer && !c19504.f59416.get() && !Thread.currentThread().isInterrupted()) {
                                zOffer = c19504.f59409.offer(c18163, 100L, TimeUnit.MILLISECONDS);
                            }
                            if (!zOffer) {
                                c19504.f59415.put(c18163);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        if (!c19504.f59416.get()) {
                            c19504.f59411 = e;
                        }
                        c19504.f59412.set(true);
                        c19504.f59409.put(c18162);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            } catch (Throwable th) {
                c19504.f59412.set(true);
                try {
                    c19504.f59409.put(c18162);
                } catch (InterruptedException unused2) {
                }
                throw th;
            }
        }
        c19504.f59412.set(true);
        c19504.f59409.put(c18162);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f59416.get()) {
            throw new IOException("Stream closed");
        }
        m44342();
        C18162 c18162 = this.f59414;
        if ((c18162 == null || this.f59413 >= c18162.f54239) && !m44344()) {
            m44342();
            return -1;
        }
        byte[] bArr = this.f59414.f54238;
        int i = this.f59413;
        this.f59413 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f59416.get()) {
            throw new IOException("Stream closed");
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m44342();
        C18162 c18162 = this.f59414;
        if ((c18162 == null || this.f59413 >= c18162.f54239) && !m44344()) {
            m44342();
            return -1;
        }
        int iMin = Math.min(this.f59414.f54239 - this.f59413, i2);
        System.arraycopy(this.f59414.f54238, this.f59413, bArr, i, iMin);
        this.f59413 += iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m44344() throws IOException {
        AtomicBoolean atomicBoolean;
        LinkedBlockingQueue linkedBlockingQueue = this.f59409;
        try {
            C18162 c18162 = this.f59414;
            C18162 c18163 = null;
            C18162 c18164 = f59407;
            if (c18162 != null && c18162 != c18164) {
                c18162.f54239 = 0;
                this.f59415.put(c18162);
                this.f59414 = null;
            }
            boolean zIsEmpty = linkedBlockingQueue.isEmpty();
            AtomicBoolean atomicBoolean2 = this.f59412;
            if (!zIsEmpty || !atomicBoolean2.get()) {
                while (true) {
                    atomicBoolean = this.f59416;
                    if (c18163 != null || atomicBoolean.get()) {
                        break;
                    }
                    c18163 = (C18162) linkedBlockingQueue.poll(100L, TimeUnit.MILLISECONDS);
                    if (c18163 != null || (!atomicBoolean2.get() && !atomicBoolean.get())) {
                    }
                }
                if (!atomicBoolean.get()) {
                    if (c18163 == c18164) {
                        this.f59414 = c18164;
                        return false;
                    }
                    this.f59414 = c18163;
                    this.f59413 = 0;
                    return true;
                }
            }
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for data", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44342() throws IOException {
        if (this.f59411 != null) {
            if (this.f59411 instanceof IOException) {
                throw ((IOException) this.f59411);
            }
            throw new IOException("Error in reader thread", this.f59411);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.f59412;
        Thread thread = this.f59410;
        if (this.f59416.compareAndSet(false, true)) {
            try {
                thread.interrupt();
                try {
                    thread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f59408.close();
                this.f59409.clear();
                this.f59415.clear();
                this.f59414 = null;
                atomicBoolean.set(true);
            } catch (Throwable th) {
                atomicBoolean.set(true);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f59416.get()) {
            throw new IOException("Stream closed");
        }
        C18162 c18162 = this.f59414;
        if (c18162 != null) {
            return c18162.f54239 - this.f59413;
        }
        return 0;
    }
}
