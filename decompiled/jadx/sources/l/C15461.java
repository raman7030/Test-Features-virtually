package l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܶ᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15461 implements InterfaceC2245 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5585 f47324;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f47325;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f47326 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f47327;

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC2245 mo7438(long j, long j2) {
        return C15649.m36840(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC2245 mo7440(long j, long j2) {
        return C15649.m36839(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    public C15461(C5585 c5585, String str, String str2) {
        this.f47324 = c5585;
        this.f47325 = str;
        this.f47327 = str2;
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) throws IOException {
        this.f47324.m15868(j);
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        return this.f47324.m15866(bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f47324.m15871(bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final long length() {
        return this.f47324.m15869();
    }

    @Override // l.InterfaceC2245
    public final long position() {
        return this.f47324.m15873();
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) throws IOException {
        this.f47324.m15870(j);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܺ */
    public final void mo7439() throws IOException {
        this.f47324.m15872();
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return new File(this.f47325).getName();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return C3468.m10607(this.f47324.f17295.f63629).m45388(this.f47325, this.f47327);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f47326;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47326) {
            return;
        }
        this.f47326 = true;
        boolean zEquals = this.f47327.equals("r");
        C5585 c5585 = this.f47324;
        if (zEquals) {
            try {
                c5585.m15867();
            } catch (IOException unused) {
            }
        } else {
            c5585.m15867();
        }
    }
}
