package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩳۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8BL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18030 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C16618 f56209 = new C16618(new byte[0]);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStream f56210;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Thread f56212;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile Exception f56213;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f56211 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f56217 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56214 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f56218 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16618 f56216 = null;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f56215 = 0;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C18030(InputStream inputStream) {
        this.f56210 = inputStream;
        for (int i = 0; i < 3; i++) {
            this.f56217.add(new C16618(new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT]));
        }
        Thread thread = new Thread(new RunnableC19473(4, this, inputStream));
        this.f56212 = thread;
        thread.setName("InputStream-Decompress-Thread");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42092(C18030 c18030, InputStream inputStream) {
        C16618 c16618 = f56209;
        while (!c18030.f56218.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    try {
                        C16618 c16619 = (C16618) c18030.f56217.poll(100L, TimeUnit.MILLISECONDS);
                        if (c16619 == null) {
                            if (c18030.f56218.get()) {
                                break;
                            }
                        } else {
                            int i = inputStream.read(c16619.f51061);
                            if (i == -1) {
                                c18030.f56217.put(c16619);
                                break;
                            }
                            c16619.f51062 = i;
                            boolean zOffer = false;
                            while (!zOffer && !c18030.f56218.get() && !Thread.currentThread().isInterrupted()) {
                                zOffer = c18030.f56211.offer(c16619, 100L, TimeUnit.MILLISECONDS);
                            }
                            if (!zOffer) {
                                c18030.f56217.put(c16619);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        if (!c18030.f56218.get()) {
                            c18030.f56213 = e;
                        }
                        c18030.f56214.set(true);
                        c18030.f56211.put(c16618);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            } catch (Throwable th) {
                c18030.f56214.set(true);
                try {
                    c18030.f56211.put(c16618);
                } catch (InterruptedException unused2) {
                }
                throw th;
            }
        }
        c18030.f56214.set(true);
        c18030.f56211.put(c16618);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f56218.get()) {
            throw new IOException("Stream closed");
        }
        m42091();
        C16618 c16618 = this.f56216;
        if ((c16618 == null || this.f56215 >= c16618.f51062) && !m42093()) {
            m42091();
            return -1;
        }
        byte[] bArr = this.f56216.f51061;
        int i = this.f56215;
        this.f56215 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f56218.get()) {
            throw new IOException("Stream closed");
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m42091();
        C16618 c16618 = this.f56216;
        if ((c16618 == null || this.f56215 >= c16618.f51062) && !m42093()) {
            m42091();
            return -1;
        }
        int iMin = Math.min(this.f56216.f51062 - this.f56215, i2);
        System.arraycopy(this.f56216.f51061, this.f56215, bArr, i, iMin);
        this.f56215 += iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m42093() throws IOException {
        AtomicBoolean atomicBoolean;
        LinkedBlockingQueue linkedBlockingQueue = this.f56211;
        try {
            C16618 c16618 = this.f56216;
            C16618 c16619 = null;
            C16618 c166110 = f56209;
            if (c16618 != null && c16618 != c166110) {
                c16618.f51062 = 0;
                this.f56217.put(c16618);
                this.f56216 = null;
            }
            boolean zIsEmpty = linkedBlockingQueue.isEmpty();
            AtomicBoolean atomicBoolean2 = this.f56214;
            if (!zIsEmpty || !atomicBoolean2.get()) {
                while (true) {
                    atomicBoolean = this.f56218;
                    if (c16619 != null || atomicBoolean.get()) {
                        break;
                    }
                    c16619 = (C16618) linkedBlockingQueue.poll(100L, TimeUnit.MILLISECONDS);
                    if (c16619 != null || (!atomicBoolean2.get() && !atomicBoolean.get())) {
                    }
                }
                if (!atomicBoolean.get()) {
                    if (c16619 == c166110) {
                        this.f56216 = c166110;
                        return false;
                    }
                    this.f56216 = c16619;
                    this.f56215 = 0;
                    return true;
                }
            }
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for data", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42091() throws IOException {
        if (this.f56213 != null) {
            if (this.f56213 instanceof IOException) {
                throw ((IOException) this.f56213);
            }
            throw new IOException("Error in reader thread", this.f56213);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.f56214;
        Thread thread = this.f56212;
        if (this.f56218.compareAndSet(false, true)) {
            try {
                thread.interrupt();
                try {
                    thread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f56210.close();
                this.f56211.clear();
                this.f56217.clear();
                this.f56216 = null;
                atomicBoolean.set(true);
            } catch (Throwable th) {
                atomicBoolean.set(true);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f56218.get()) {
            throw new IOException("Stream closed");
        }
        C16618 c16618 = this.f56216;
        if (c16618 != null) {
            return c16618.f51062 - this.f56215;
        }
        return 0;
    }
}
