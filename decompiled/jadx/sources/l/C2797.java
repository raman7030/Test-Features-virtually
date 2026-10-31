package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2797 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 f8728;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9147 f8729;

    public C2797(InterfaceC7505 interfaceC7505, C9147 c9147) {
        this.f8728 = interfaceC7505;
        this.f8729 = c9147;
    }

    @Override // l.InterfaceC7505
    public final long length() throws C16201 {
        try {
            return this.f8728.length();
        } catch (IOException e) {
            C9147.m23523(this.f8729);
            throw new C16201(e);
        }
    }

    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8637(long j, byte[] bArr, int i, int i2) throws C16201 {
        try {
            this.f8728.mo8637(j, bArr, i, i2);
        } catch (IOException e) {
            C9147.m23523(this.f8729);
            throw new C16201(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8728.close();
    }
}
