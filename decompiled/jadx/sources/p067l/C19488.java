package p067l;

/* JADX INFO: renamed from: l.ᩳۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C19488 implements InterfaceC21245 {

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f59378;

    /* JADX INFO: renamed from: ᩹ */
    public volatile int f59379;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12116() {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m44317(int i) {
        if (i >= 0) {
            if (i <= this.f59379) {
                this.f59379 = i;
            }
        }
        throw new IllegalArgumentException("Invalid arena rollback");
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ boolean mo12119() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized int m44319(int i, int i2, byte[] bArr) {
        int i3;
        if (i2 > m44318()) {
            throw new IllegalArgumentException("Arena block overflow");
        }
        i3 = this.f59379;
        System.arraycopy(bArr, i, this.f59378, i3, i2);
        this.f59379 += i2;
        return i3;
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

    public C19488(int i) {
        this.f59378 = new byte[i];
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m44318() {
        return this.f59378.length - this.f59379;
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f59379;
    }

    @Override // p067l.InterfaceC21245
    /* JADX INFO: renamed from: ܿ */
    public final long mo44320() {
        return this.f59378.length;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) {
        C10927.m25190(this.f59379, i, i3);
        C10927.m25189(bArr.length, i2, i3);
        System.arraycopy(this.f59378, i, bArr, i2, i3);
    }
}
