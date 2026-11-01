package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W1T8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20504 implements InterfaceC12457, InterfaceC14468 {

    /* JADX INFO: renamed from: ֫ */
    public final long f63355;

    /* JADX INFO: renamed from: ۧ */
    public final int f63356;

    @Override // p067l.InterfaceC14468
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo12823() {
        return true;
    }

    @Override // p067l.InterfaceC14468
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12824() {
        return false;
    }

    @Override // p067l.InterfaceC14468
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo12825() {
        return false;
    }

    public C20504(long j, byte[] bArr) throws C11314 {
        this.f63355 = j;
        if (bArr.length == 0) {
            this.f63356 = 0;
            return;
        }
        if (bArr.length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.f63356 = i;
            return;
        }
        throw new C11314("Unsupported BCJ filter properties");
    }

    @Override // p067l.InterfaceC12457
    /* JADX INFO: renamed from: ֫ */
    public final int mo12821() {
        int i = C24724.f78256;
        return 5;
    }

    @Override // p067l.InterfaceC12457
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo12822(InputStream inputStream, C6422 c6422) {
        InterfaceC12378 c15059;
        int i = this.f63356;
        long j = this.f63355;
        if (j == 4) {
            c15059 = new C8354(i);
        } else if (j == 5) {
            c15059 = new C5672(i);
        } else if (j == 6) {
            c15059 = new C7013(i);
        } else if (j == 7) {
            c15059 = new C23777(i);
        } else if (j == 8) {
            c15059 = new C21766(i);
        } else if (j == 9) {
            c15059 = new C14389(i);
        } else if (j == 10) {
            c15059 = new C23107(i);
        } else {
            c15059 = j == 11 ? new C15059(i) : null;
        }
        return new C24724(inputStream, c15059);
    }
}
