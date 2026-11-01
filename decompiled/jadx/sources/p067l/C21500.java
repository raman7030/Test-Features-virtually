package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C21500 implements InterfaceC20986 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f67806;

    /* JADX INFO: renamed from: ᩹ */
    public final byte f67807;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    public C21500(byte b, int i) {
        this.f67806 = i;
        this.f67807 = b;
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f67806;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) {
        C10927.m25190(this.f67806, i, i3);
        C10927.m25189(bArr.length, i2, i3);
        Arrays.fill(bArr, i2, i3 + i2, this.f67807);
    }
}
