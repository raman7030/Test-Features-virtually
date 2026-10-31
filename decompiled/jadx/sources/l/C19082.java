package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W1T8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19082 implements InterfaceC10615, InterfaceC12731 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f60121;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f60122;

    @Override // l.InterfaceC12731
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo10843() {
        return true;
    }

    @Override // l.InterfaceC12731
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo10844() {
        return false;
    }

    @Override // l.InterfaceC12731
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo10845() {
        return false;
    }

    public C19082(long j, byte[] bArr) throws C9413 {
        this.f60121 = j;
        if (bArr.length == 0) {
            this.f60122 = 0;
            return;
        }
        if (bArr.length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.f60122 = i;
            return;
        }
        throw new C9413("Unsupported BCJ filter properties");
    }

    @Override // l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final int mo10841() {
        int i = C23523.f75510;
        return 5;
    }

    @Override // l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo10842(InputStream inputStream, C4265 c4265) {
        InterfaceC10532 c13353;
        int i = this.f60122;
        long j = this.f60121;
        if (j == 4) {
            c13353 = new C6298(i);
        } else if (j == 5) {
            c13353 = new C3476(i);
        } else if (j == 6) {
            c13353 = new C4887(i);
        } else if (j == 7) {
            c13353 = new C22526(i);
        } else if (j == 8) {
            c13353 = new C20410(i);
        } else if (j == 9) {
            c13353 = new C12648(i);
        } else if (j == 10) {
            c13353 = new C21821(i);
        } else {
            c13353 = j == 11 ? new C13353(i) : null;
        }
        return new C23523(inputStream, c13353);
    }
}
