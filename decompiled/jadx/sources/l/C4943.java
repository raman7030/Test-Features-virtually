package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4943 implements InterfaceC10316 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f15579;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15580;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13137 f15581;

    public C4943(InterfaceC20758 interfaceC20758) {
        this.f15579 = interfaceC20758;
        this.f15581 = C3260.m9979(interfaceC20758);
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14384(long j, byte[] bArr, int i, int i2) throws IOException {
        this.f15581.mo14384(j, bArr, i, i2);
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14383(long j, int i, byte[] bArr) throws IOException {
        this.f15581.mo14383(j, i, bArr);
    }

    @Override // l.InterfaceC10316
    public final long length() {
        return this.f15581.length();
    }

    @Override // l.InterfaceC10316
    public final void truncate(long j) throws IOException {
        this.f15581.truncate(j);
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo14386() throws IOException {
        this.f15581.mo14386();
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final void mo14385() throws Throwable {
        this.f15581.mo14385();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC20758 interfaceC20758 = this.f15579;
        if (this.f15580) {
            return;
        }
        this.f15580 = true;
        try {
            this.f15581.close();
        } finally {
            C17229.deleteIfExists(interfaceC20758);
        }
    }
}
