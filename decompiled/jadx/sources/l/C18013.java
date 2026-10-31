package l;

/* JADX INFO: renamed from: l.ᩳۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18013 implements InterfaceC19862 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f56181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f56182;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10083() {
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m42067(int i) {
        if (i >= 0) {
            if (i <= this.f56182) {
                this.f56182 = i;
            }
        }
        throw new IllegalArgumentException("Invalid arena rollback");
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ boolean mo10086() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized int m42069(int i, int i2, byte[] bArr) {
        int i3;
        if (i2 > m42068()) {
            throw new IllegalArgumentException("Arena block overflow");
        }
        i3 = this.f56182;
        System.arraycopy(bArr, i, this.f56181, i3, i2);
        this.f56182 += i2;
        return i3;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC18883 mo10088() {
        return this;
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ܽ */
    public final long mo10087() {
        return mo42070();
    }

    public C18013(int i) {
        this.f56181 = new byte[i];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m42068() {
        return this.f56181.length - this.f56182;
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f56182;
    }

    @Override // l.InterfaceC19862
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long mo42070() {
        return this.f56181.length;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) {
        C9005.m23246(this.f56182, i, i3);
        C9005.m23245(bArr.length, i2, i3);
        System.arraycopy(this.f56181, i, bArr, i2, i3);
    }
}
