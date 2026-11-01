package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19862 {

    /* JADX INFO: renamed from: ܳ */
    public static final byte[] f60366 = {0, 0, 1};

    /* JADX INFO: renamed from: ֫ */
    public byte[] f60367;

    /* JADX INFO: renamed from: ۧ */
    public boolean f60368;

    /* JADX INFO: renamed from: ܽ */
    public int f60369;

    /* JADX INFO: renamed from: ܿ */
    public int f60370;

    /* JADX INFO: renamed from: ᩳ */
    public int f60371;

    /* JADX INFO: renamed from: ֫ */
    public final void m45104() {
        this.f60368 = false;
        this.f60369 = 0;
        this.f60371 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45106(int i, int i2) {
        int i3 = this.f60371;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i == 179 || i == 181) {
                            this.f60369 -= i2;
                            this.f60368 = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        C21334.m48351("Unexpected start code value");
                        m45104();
                    } else {
                        this.f60370 = this.f60369;
                        this.f60371 = 4;
                    }
                } else if (i > 31) {
                    C21334.m48351("Unexpected start code value");
                    m45104();
                } else {
                    this.f60371 = 3;
                }
            } else if (i != 181) {
                C21334.m48351("Unexpected start code value");
                m45104();
            } else {
                this.f60371 = 2;
            }
        } else if (i == 176) {
            this.f60371 = 1;
            this.f60368 = true;
        }
        m45105(0, 3, f60366);
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45105(int i, int i2, byte[] bArr) {
        if (this.f60368) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f60367;
            int length = bArr2.length;
            int i4 = this.f60369 + i3;
            if (length < i4) {
                this.f60367 = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f60367, this.f60369, i3);
            this.f60369 += i3;
        }
    }
}
