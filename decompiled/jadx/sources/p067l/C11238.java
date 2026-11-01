package p067l;

import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۢۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11238 implements InterfaceC22046 {

    /* JADX INFO: renamed from: ֫ */
    public C4532 f31256;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f31257;

    /* JADX INFO: renamed from: ܽ */
    public C16601 f31258;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f31259 = new byte[4096];

    /* JADX INFO: renamed from: ᩳ */
    public C9383 f31260;

    @Override // p067l.InterfaceC22046
    public final void end() {
        C20626 c20626;
        this.f31257 = null;
        C16601 c16601 = this.f31258;
        if (c16601 != null) {
            C9896 c9896 = c16601.f66998;
            if (c9896 != null && (c20626 = c9896.f27431) != null) {
                c20626.m46624();
                c20626.f63736 = null;
                c20626.f63723 = null;
            }
            this.f31258 = null;
        }
        C4532 c4532 = this.f31256;
        if (c4532 != null) {
            C17271 c17271 = c4532.f66999;
            if (c17271 != null) {
                int i = c17271.f51412;
                if (i == 42 || i == 113 || i == 666) {
                    c17271.f51436 = null;
                    c17271.f51428 = null;
                    c17271.f51447 = null;
                    c17271.f51434 = null;
                    c17271.f51464 = null;
                }
                c4532.f66999 = null;
                c4532.f67001 = null;
                c4532.f67000 = null;
                c4532.f66995 = null;
            }
            this.f31256 = null;
        }
        this.f31260 = null;
    }

    @Override // p067l.InterfaceC22046
    /* JADX INFO: renamed from: ֫ */
    public final void mo26032(int i, int i2, C9383 c9383) {
        this.f31260 = c9383;
        if (i == 1) {
            try {
                this.f31256 = new C4532(i2);
            } catch (C5873 e) {
                throw new UncheckedIOException(e);
            }
        } else if (i == 0) {
            C16601 c16601 = new C16601();
            C9896 c9896 = new C9896(c16601);
            c16601.f66998 = c9896;
            c9896.m23178();
            this.f31258 = c16601;
            this.f31257 = new byte[4096];
        }
        C9383 c9384 = this.f31260;
        (c9384 == null ? C21769.m49092() : c9384.m21850()).getClass();
    }

    @Override // p067l.InterfaceC22046
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo26034(byte[] bArr, int[] iArr) {
        C4532 c4532 = this.f31256;
        c4532.f67001 = bArr;
        int i = 5;
        c4532.f66991 = 5;
        c4532.f66994 = iArr[0] - 5;
        do {
            C4532 c4533 = this.f31256;
            byte[] bArr2 = this.f31259;
            c4533.f67000 = bArr2;
            c4533.f66993 = 0;
            c4533.f66997 = 4096;
            C17271 c17271 = c4533.f66999;
            if ((c17271 == null ? -2 : c17271.m39113()) != 0) {
                C9383 c9383 = this.f31260;
                (c9383 == null ? C21769.m49092() : c9383.m21850()).getClass();
            } else {
                int i2 = 4096 - this.f31256.f66997;
                int i3 = i + i2;
                int i4 = i3 + 52;
                if (bArr.length < i4) {
                    byte[] bArr3 = new byte[i4 * 2];
                    System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                    bArr = bArr3;
                }
                System.arraycopy(bArr2, 0, bArr, i, i2);
                i = i3;
            }
        } while (this.f31256.f66997 == 0);
        iArr[0] = i;
        return bArr;
    }

    @Override // p067l.InterfaceC22046
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo26033(byte[] bArr, int[] iArr) {
        C16601 c16601 = this.f31258;
        c16601.f67001 = bArr;
        c16601.f66991 = 5;
        c16601.f66994 = iArr[0];
        int i = 0;
        while (true) {
            C16601 c16602 = this.f31258;
            byte[] bArr2 = this.f31259;
            c16602.f67000 = bArr2;
            c16602.f66993 = 0;
            c16602.f66997 = 4096;
            C9896 c9896 = c16602.f66998;
            int iM23177 = c9896 == null ? -2 : c9896.m23177();
            if (iM23177 == -5) {
                if (i > bArr.length - 5) {
                    byte[] bArr3 = new byte[i + 5];
                    System.arraycopy(bArr, 0, bArr3, 0, 5);
                    System.arraycopy(this.f31257, 0, bArr3, 5, i);
                    bArr = bArr3;
                } else {
                    System.arraycopy(this.f31257, 0, bArr, 5, i);
                }
                iArr[0] = i;
                return bArr;
            }
            if (iM23177 != 0) {
                C9383 c9383 = this.f31260;
                (c9383 == null ? C21769.m49092() : c9383.m21850()).getClass();
                return null;
            }
            byte[] bArr4 = this.f31257;
            int length = bArr4.length;
            int i2 = (i + 4096) - this.f31258.f66997;
            if (length < i2) {
                int length2 = bArr4.length * 2;
                if (length2 >= i2) {
                    i2 = length2;
                }
                byte[] bArr5 = new byte[i2];
                System.arraycopy(bArr4, 0, bArr5, 0, i);
                this.f31257 = bArr5;
            }
            System.arraycopy(bArr2, 0, this.f31257, i, 4096 - this.f31258.f66997);
            i += 4096 - this.f31258.f66997;
            iArr[0] = i;
        }
    }
}
