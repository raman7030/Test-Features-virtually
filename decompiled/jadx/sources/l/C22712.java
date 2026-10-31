package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩺ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes.dex */
public final class C22712 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f73374;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73375;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73376;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10405 f73377;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f73378;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7190 f73379;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CountDownLatch f73380;

    public C22712(C7190 c7190, AtomicReference atomicReference, InterfaceC10405 interfaceC10405, CountDownLatch countDownLatch, String str, String str2, ArrayList arrayList) {
        this.f73379 = c7190;
        this.f73378 = atomicReference;
        this.f73377 = interfaceC10405;
        this.f73380 = countDownLatch;
        this.f73375 = str;
        this.f73376 = str2;
        this.f73374 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50740() throws IOException {
        IOException iOException = (IOException) this.f73378.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m50740();
        this.f73377.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m50740();
        this.f73377.mo26252(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m50740();
        this.f73377.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m50740();
        this.f73377.close();
        try {
            this.f73380.await();
        } catch (InterruptedException unused) {
        }
        m50740();
        C7190 c7190 = this.f73379;
        String strM19260 = C7190.m19260(c7190);
        ArrayList arrayList = this.f73374;
        String str = this.f73375;
        String str2 = this.f73376;
        try {
            c7190.f22027.mo434(new CompleteMultipartUploadRequest(strM19260, str, str2, arrayList));
        } catch (AmazonClientException e) {
            try {
                c7190.f22027.mo439(new AbortMultipartUploadRequest(C7190.m19260(c7190), str, str2));
            } catch (Throwable unused2) {
            }
            throw new IOException(e.getMessage(), e);
        }
    }
}
