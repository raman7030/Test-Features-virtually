package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20159 implements InterfaceC17475, InterfaceC21245 {

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f62405;

    /* JADX INFO: renamed from: ᩹ */
    public int f62406;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12116() {
        return this;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ boolean mo12119() {
        return true;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC20315 mo12121() {
        return this;
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ܽ */
    public final long mo12120() {
        return mo44320();
    }

    public C20159(int i) {
        this.f62405 = new byte[i];
    }

    @Override // p067l.InterfaceC17475
    /* JADX INFO: renamed from: ֫ */
    public final int mo13832(C22367 c22367, InterfaceC18588 interfaceC18588) throws IOException {
        long j = this.f62406;
        int i = c22367.f70579;
        long j2 = j + ((long) i);
        byte[] bArr = this.f62405;
        if (j2 > bArr.length) {
            throw new IOException("Hex clipboard memory backing overflow");
        }
        if (interfaceC18588.mo3924()) {
            throw new C25008();
        }
        int i2 = this.f62406;
        c22367.m50205(0, bArr, i2, i);
        if (interfaceC18588.mo3924()) {
            throw new C25008();
        }
        this.f62406 += i;
        return i2;
    }

    @Override // p067l.InterfaceC17475
    public final void finish() throws IOException {
        if (this.f62406 != this.f62405.length) {
            throw new IOException("Incomplete hex clipboard memory backing");
        }
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f62405.length;
    }

    @Override // p067l.InterfaceC21245
    /* JADX INFO: renamed from: ܿ */
    public final long mo44320() {
        return this.f62405.length;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f62406;
        byte[] bArr2 = this.f62405;
        if (i4 != bArr2.length) {
            throw new IllegalStateException("Hex clipboard memory backing is incomplete");
        }
        C10927.m25190(bArr2.length, i, i3);
        C10927.m25189(bArr.length, i2, i3);
        System.arraycopy(bArr2, i, bArr, i2, i3);
    }
}
