package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KG */
/* JADX INFO: loaded from: classes3.dex */
public final class C1784 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6162;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7160 f6163;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f6164;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f6165;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f6166;

    public C1784(InterfaceC21449 interfaceC21449, int i, InterfaceC7160 interfaceC7160) {
        C22632.m50631(i > 0);
        this.f6165 = interfaceC21449;
        this.f6164 = i;
        this.f6163 = interfaceC7160;
        this.f6166 = new byte[1];
        this.f6162 = i;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f6162;
        InterfaceC21449 interfaceC21449 = this.f6165;
        if (i3 == 0) {
            byte[] bArr2 = this.f6166;
            int i4 = 0;
            if (interfaceC21449.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = interfaceC21449.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ((C7428) this.f6163).m19965(new C17714(bArr3, i5));
                    }
                }
                this.f6162 = this.f6164;
            }
            return -1;
        }
        int i8 = interfaceC21449.read(bArr, i, Math.min(this.f6162, i2));
        if (i8 != -1) {
            this.f6162 -= i8;
        }
        return i8;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f6165.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map mo5936() {
        return this.f6165.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        this.f6165.mo5937(interfaceC0486);
    }
}
