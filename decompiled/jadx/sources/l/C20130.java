package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20130 implements InterfaceC19589 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f65167;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte f65168;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    public C20130(byte b, int i) {
        this.f65167 = i;
        this.f65168 = b;
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f65167;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) {
        C9005.m23246(this.f65167, i, i3);
        C9005.m23245(bArr.length, i2, i3);
        Arrays.fill(bArr, i2, i3 + i2, this.f65168);
    }
}
