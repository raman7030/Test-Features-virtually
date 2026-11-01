package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7067 implements InterfaceC12173 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC22097 f18411;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f18412;

    /* JADX INFO: renamed from: ᩹ */
    public final C14854 f18413;

    public C7067(InterfaceC22097 interfaceC22097) {
        this.f18411 = interfaceC22097;
        this.f18413 = C5467.m12012(interfaceC22097);
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16281(long j, byte[] bArr, int i, int i2) throws IOException {
        this.f18413.mo16281(j, bArr, i, i2);
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16280(long j, int i, byte[] bArr) throws IOException {
        this.f18413.mo16280(j, i, bArr);
    }

    @Override // p067l.InterfaceC12173
    public final long length() {
        return this.f18413.length();
    }

    @Override // p067l.InterfaceC12173
    public final void truncate(long j) throws IOException {
        this.f18413.truncate(j);
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ܺ */
    public final void mo16283() throws IOException {
        this.f18413.mo16283();
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ۘ֫ */
    public final void mo16282() throws Throwable {
        this.f18413.mo16282();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC22097 interfaceC22097 = this.f18411;
        if (this.f18412) {
            return;
        }
        this.f18412 = true;
        try {
            this.f18413.close();
        } finally {
            C18743.deleteIfExists(interfaceC22097);
        }
    }
}
