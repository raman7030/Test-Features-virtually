package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A88Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8544 extends AbstractC9250 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5016 f26115;

    public C8544(C5016 c5016) {
        this.f26115 = c5016;
    }

    @Override // l.AbstractC9250
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22245(byte[] bArr, byte[] bArr2) throws IOException {
        byte[] bArrM14507 = this.f26115.m14507(bArr);
        System.arraycopy(bArrM14507, 0, bArr2, 0, bArrM14507.length);
        return bArrM14507.length;
    }

    @Override // l.AbstractC9250
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo22246(byte[] bArr) {
        this.f26115.write(bArr);
    }

    @Override // l.AbstractC9250
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22244(byte[] bArr) {
        byte[] bArr2 = this.f26115.read();
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        return bArr2.length;
    }
}
