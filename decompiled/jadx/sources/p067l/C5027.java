package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5027 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9501 f11522;

    /* JADX INFO: renamed from: ᩹ */
    public final C11062 f11523;

    public C5027(InterfaceC9501 interfaceC9501, C11062 c11062) {
        this.f11522 = interfaceC9501;
        this.f11523 = c11062;
    }

    @Override // p067l.InterfaceC9501
    public final long length() throws C17766 {
        try {
            return this.f11522.length();
        } catch (IOException e) {
            C11062.m25474(this.f11523);
            throw new C17766(e);
        }
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) throws C17766 {
        try {
            this.f11522.mo10697(j, bArr, i, i2);
        } catch (IOException e) {
            C11062.m25474(this.f11523);
            throw new C17766(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11522.close();
    }
}
