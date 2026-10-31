package l;

/* JADX INFO: renamed from: l.ۜ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6617 extends AbstractC14377 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17200 f20372;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8734 f20373;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f20374;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20375;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17200 f20376;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20377;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f20378 = C5659.f17466;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC15788 f20379;

    public C6617(C8734 c8734, EnumC15788 enumC15788, int[] iArr, int[] iArr2) {
        this.f20373 = c8734;
        this.f20379 = enumC15788;
        this.f20376 = C8734.m22588(iArr);
        this.f20372 = C8734.m22588(iArr2);
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC15788 mo18150() {
        return this.f20374 ? EnumC15788.INITIAL : this.f20379;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo18148(byte[] bArr, int i, int i2) {
        int iMin;
        int iMin2;
        if (i2 == 0) {
            return 0;
        }
        if (this.f20374) {
            return -1;
        }
        int i3 = this.f20377 - this.f20375;
        if (i3 > 0) {
            iMin = Math.min(i2, i3);
            System.arraycopy(this.f20378, this.f20375, bArr, i, iMin);
            this.f20375 += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            C8734 c8734 = this.f20373;
            int iM22584 = C8734.m22584(c8734.f26592, this.f20376);
            if (iM22584 >= 256) {
                if (iM22584 > 256) {
                    short s = C8734.f26588[iM22584 - 257];
                    int iM41887 = C17906.m41887(s >>> 5, C8734.m22580(c8734, s & 31));
                    int i4 = C8734.f26589[C8734.m22584(c8734.f26592, this.f20372)];
                    int iM41888 = C17906.m41887(i4 >>> 4, C8734.m22580(c8734, i4 & 15));
                    if (this.f20378.length < iM41887) {
                        this.f20378 = new byte[iM41887];
                    }
                    this.f20377 = iM41887;
                    this.f20375 = 0;
                    c8734.f26593.m52010(iM41888, iM41887, this.f20378);
                    int i5 = i + iMin;
                    int i6 = i2 - iMin;
                    int i7 = this.f20377 - this.f20375;
                    if (i7 > 0) {
                        iMin2 = Math.min(i6, i7);
                        System.arraycopy(this.f20378, this.f20375, bArr, i5, iMin2);
                        this.f20375 += iMin2;
                    } else {
                        iMin2 = 0;
                    }
                    iMin += iMin2;
                } else {
                    this.f20374 = true;
                    break;
                }
            } else {
                byte b = (byte) iM22584;
                c8734.f26593.m52009(b);
                bArr[iMin + i] = b;
                iMin++;
            }
        }
        return iMin;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo18149() {
        return !this.f20374;
    }

    @Override // l.AbstractC14377
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo18147() {
        return this.f20377 - this.f20375;
    }
}
