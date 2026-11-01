package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KG */
/* JADX INFO: loaded from: classes3.dex */
public final class C4064 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public int f8937;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC9173 f8938;

    /* JADX INFO: renamed from: ܽ */
    public final int f8939;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC22753 f8940;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f8941;

    public C4064(InterfaceC22753 interfaceC22753, int i, InterfaceC9173 interfaceC9173) {
        C23877.m52957(i > 0);
        this.f8940 = interfaceC22753;
        this.f8939 = i;
        this.f8938 = interfaceC9173;
        this.f8941 = new byte[1];
        this.f8937 = i;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f8937;
        InterfaceC22753 interfaceC22753 = this.f8940;
        if (i3 == 0) {
            byte[] bArr2 = this.f8941;
            int i4 = 0;
            if (interfaceC22753.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = interfaceC22753.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ((C9428) this.f8938).m21939(new C19203(bArr3, i5));
                    }
                }
                this.f8937 = this.f8939;
            }
            return -1;
        }
        int i8 = interfaceC22753.read(bArr, i, Math.min(this.f8937, i2));
        if (i8 != -1) {
            this.f8937 -= i8;
        }
        return i8;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f8940.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        return this.f8940.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        this.f8940.mo8132(interfaceC2830);
    }
}
