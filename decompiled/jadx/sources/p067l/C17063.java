package p067l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܶ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17063 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ۙ */
    public final C7677 f50453;

    /* JADX INFO: renamed from: ᩶ */
    public final String f50454;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f50455 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final String f50456;

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo9518() {
        return null;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC4502 mo9520(long j, long j2) {
        return C17241.m39006(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC4502 mo9522(long j, long j2) {
        return C17241.m39005(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo9523() {
        return false;
    }

    public C17063(C7677 c7677, String str, String str2) {
        this.f50453 = c7677;
        this.f50454 = str;
        this.f50456 = str2;
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) throws IOException {
        this.f50453.m17783(j);
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) {
        return this.f50453.m17781(bArr, i, i2);
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f50453.m17786(bArr, i, i2);
    }

    @Override // p067l.InterfaceC4502
    public final long length() {
        return this.f50453.m17784();
    }

    @Override // p067l.InterfaceC4502
    public final long position() {
        return this.f50453.m17788();
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        this.f50453.m17785(j);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() throws IOException {
        this.f50453.m17787();
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return new File(this.f50454).getName();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() {
        return C5665.m12615(this.f50453.f20135.f66250).m47685(this.f50454, this.f50456);
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f50455;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f50455) {
            return;
        }
        this.f50455 = true;
        boolean zEquals = this.f50456.equals("r");
        C7677 c7677 = this.f50453;
        if (zEquals) {
            try {
                c7677.m17782();
            } catch (IOException unused) {
            }
        } else {
            c7677.m17782();
        }
    }
}
