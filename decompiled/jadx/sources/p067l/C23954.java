package p067l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.p061s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩺ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes.dex */
public final class C23954 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ ArrayList f76097;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f76098;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ String f76099;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ InterfaceC12257 f76100;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AtomicReference f76101;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9202 f76102;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ CountDownLatch f76103;

    public C23954(C9202 c9202, AtomicReference atomicReference, InterfaceC12257 interfaceC12257, CountDownLatch countDownLatch, String str, String str2, ArrayList arrayList) {
        this.f76102 = c9202;
        this.f76101 = atomicReference;
        this.f76100 = interfaceC12257;
        this.f76103 = countDownLatch;
        this.f76098 = str;
        this.f76099 = str2;
        this.f76097 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53066() throws IOException {
        IOException iOException = (IOException) this.f76101.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m53066();
        this.f76100.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m53066();
        this.f76100.mo28281(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m53066();
        this.f76100.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m53066();
        this.f76100.close();
        try {
            this.f76103.await();
        } catch (InterruptedException unused) {
        }
        m53066();
        C9202 c9202 = this.f76102;
        String strM21207 = C9202.m21207(c9202);
        ArrayList arrayList = this.f76097;
        String str = this.f76098;
        String str2 = this.f76099;
        try {
            c9202.f24905.mo1600(new CompleteMultipartUploadRequest(strM21207, str, str2, arrayList));
        } catch (AmazonClientException e) {
            try {
                c9202.f24905.mo1605(new AbortMultipartUploadRequest(C9202.m21207(c9202), str, str2));
            } catch (Throwable unused2) {
            }
            throw new IOException(e.getMessage(), e);
        }
    }
}
