package l;

import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۢۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9333 implements InterfaceC20705 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2277 f28306;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f28307;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14976 f28308;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f28309 = new byte[4096];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7381 f28310;

    @Override // l.InterfaceC20705
    public final void end() {
        C19211 c19211;
        this.f28307 = null;
        C14976 c14976 = this.f28308;
        if (c14976 != null) {
            C7921 c7921 = c14976.f64360;
            if (c7921 != null && (c19211 = c7921.f24516) != null) {
                c19211.m44330();
                c19211.f60505 = null;
                c19211.f60492 = null;
            }
            this.f28308 = null;
        }
        C2277 c2277 = this.f28306;
        if (c2277 != null) {
            C15681 c15681 = c2277.f64361;
            if (c15681 != null) {
                int i = c15681.f48274;
                if (i == 42 || i == 113 || i == 666) {
                    c15681.f48298 = null;
                    c15681.f48290 = null;
                    c15681.f48309 = null;
                    c15681.f48296 = null;
                    c15681.f48326 = null;
                }
                c2277.f64361 = null;
                c2277.f64363 = null;
                c2277.f64362 = null;
                c2277.f64357 = null;
            }
            this.f28306 = null;
        }
        this.f28310 = null;
    }

    @Override // l.InterfaceC20705
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24023(int i, int i2, C7381 c7381) {
        this.f28310 = c7381;
        if (i == 1) {
            try {
                this.f28306 = new C2277(i2);
            } catch (C3688 e) {
                throw new UncheckedIOException(e);
            }
        } else if (i == 0) {
            C14976 c14976 = new C14976();
            C7921 c7921 = new C7921(c14976);
            c14976.f64360 = c7921;
            c7921.m21212();
            this.f28308 = c14976;
            this.f28307 = new byte[4096];
        }
        C7381 c7382 = this.f28310;
        (c7382 == null ? C20413.m46769() : c7382.m19877()).getClass();
    }

    @Override // l.InterfaceC20705
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo24025(byte[] bArr, int[] iArr) {
        C2277 c2277 = this.f28306;
        c2277.f64363 = bArr;
        int i = 5;
        c2277.f64353 = 5;
        c2277.f64356 = iArr[0] - 5;
        do {
            C2277 c2278 = this.f28306;
            byte[] bArr2 = this.f28309;
            c2278.f64362 = bArr2;
            c2278.f64355 = 0;
            c2278.f64359 = 4096;
            C15681 c15681 = c2278.f64361;
            if ((c15681 == null ? -2 : c15681.m36947()) != 0) {
                C7381 c7381 = this.f28310;
                (c7381 == null ? C20413.m46769() : c7381.m19877()).getClass();
            } else {
                int i2 = 4096 - this.f28306.f64359;
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
        } while (this.f28306.f64359 == 0);
        iArr[0] = i;
        return bArr;
    }

    @Override // l.InterfaceC20705
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo24024(byte[] bArr, int[] iArr) {
        C14976 c14976 = this.f28308;
        c14976.f64363 = bArr;
        c14976.f64353 = 5;
        c14976.f64356 = iArr[0];
        int i = 0;
        while (true) {
            C14976 c14977 = this.f28308;
            byte[] bArr2 = this.f28309;
            c14977.f64362 = bArr2;
            c14977.f64355 = 0;
            c14977.f64359 = 4096;
            C7921 c7921 = c14977.f64360;
            int iM21211 = c7921 == null ? -2 : c7921.m21211();
            if (iM21211 == -5) {
                if (i > bArr.length - 5) {
                    byte[] bArr3 = new byte[i + 5];
                    System.arraycopy(bArr, 0, bArr3, 0, 5);
                    System.arraycopy(this.f28307, 0, bArr3, 5, i);
                    bArr = bArr3;
                } else {
                    System.arraycopy(this.f28307, 0, bArr, 5, i);
                }
                iArr[0] = i;
                return bArr;
            }
            if (iM21211 != 0) {
                C7381 c7381 = this.f28310;
                (c7381 == null ? C20413.m46769() : c7381.m19877()).getClass();
                return null;
            }
            byte[] bArr4 = this.f28307;
            int length = bArr4.length;
            int i2 = (i + 4096) - this.f28308.f64359;
            if (length < i2) {
                int length2 = bArr4.length * 2;
                if (length2 >= i2) {
                    i2 = length2;
                }
                byte[] bArr5 = new byte[i2];
                System.arraycopy(bArr4, 0, bArr5, 0, i);
                this.f28307 = bArr5;
            }
            System.arraycopy(bArr2, 0, this.f28307, i, 4096 - this.f28308.f64359);
            i += 4096 - this.f28308.f64359;
            iArr[0] = i;
        }
    }
}
