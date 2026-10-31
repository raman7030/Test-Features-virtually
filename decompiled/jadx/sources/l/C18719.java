package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18719 implements InterfaceC15895, InterfaceC19862 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f59181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59182;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10083() {
        return this;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ boolean mo10086() {
        return true;
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

    public C18719(int i) {
        this.f59181 = new byte[i];
    }

    @Override // l.InterfaceC15895
    /* JADX INFO: renamed from: ֫ */
    public final int mo11896(C21042 c21042, InterfaceC17066 interfaceC17066) throws IOException {
        long j = this.f59182;
        int i = c21042.f67894;
        long j2 = j + ((long) i);
        byte[] bArr = this.f59181;
        if (j2 > bArr.length) {
            throw new IOException("Hex clipboard memory backing overflow");
        }
        if (interfaceC17066.mo1526()) {
            throw new C23821();
        }
        int i2 = this.f59182;
        c21042.m47875(0, bArr, i2, i);
        if (interfaceC17066.mo1526()) {
            throw new C23821();
        }
        this.f59182 += i;
        return i2;
    }

    @Override // l.InterfaceC15895
    public final void finish() throws IOException {
        if (this.f59182 != this.f59181.length) {
            throw new IOException("Incomplete hex clipboard memory backing");
        }
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f59181.length;
    }

    @Override // l.InterfaceC19862
    /* JADX INFO: renamed from: ܿ */
    public final long mo42070() {
        return this.f59181.length;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f59182;
        byte[] bArr2 = this.f59181;
        if (i4 != bArr2.length) {
            throw new IllegalStateException("Hex clipboard memory backing is incomplete");
        }
        C9005.m23246(bArr2.length, i, i3);
        C9005.m23245(bArr.length, i2, i3);
        System.arraycopy(bArr2, i, bArr, i2, i3);
    }
}
