package p067l;

/* JADX INFO: renamed from: l.ۜ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8657 extends AbstractC16032 {

    /* JADX INFO: renamed from: ֫ */
    public final C18715 f23249;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C10669 f23250;

    /* JADX INFO: renamed from: ۧ */
    public boolean f23251;

    /* JADX INFO: renamed from: ܳ */
    public int f23252;

    /* JADX INFO: renamed from: ܽ */
    public final C18715 f23253;

    /* JADX INFO: renamed from: ܿ */
    public int f23254;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f23255 = C7747.f20313;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC17373 f23256;

    public C8657(C10669 c10669, EnumC17373 enumC17373, int[] iArr, int[] iArr2) {
        this.f23250 = c10669;
        this.f23256 = enumC17373;
        this.f23253 = C10669.m24557(iArr);
        this.f23249 = C10669.m24557(iArr2);
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ܽ */
    public final EnumC17373 mo20102() {
        return this.f23251 ? EnumC17373.INITIAL : this.f23256;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ֫ */
    public final int mo20100(byte[] bArr, int i, int i2) {
        int iMin;
        int iMin2;
        if (i2 == 0) {
            return 0;
        }
        if (this.f23251) {
            return -1;
        }
        int i3 = this.f23254 - this.f23252;
        if (i3 > 0) {
            iMin = Math.min(i2, i3);
            System.arraycopy(this.f23255, this.f23252, bArr, i, iMin);
            this.f23252 += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            C10669 c10669 = this.f23250;
            int iM24553 = C10669.m24553(c10669.f29517, this.f23253);
            if (iM24553 >= 256) {
                if (iM24553 > 256) {
                    short s = C10669.f29513[iM24553 - 257];
                    int iM44135 = C19386.m44135(s >>> 5, C10669.m24549(c10669, s & 31));
                    int i4 = C10669.f29514[C10669.m24553(c10669.f29517, this.f23249)];
                    int iM44136 = C19386.m44135(i4 >>> 4, C10669.m24549(c10669, i4 & 15));
                    if (this.f23255.length < iM44135) {
                        this.f23255 = new byte[iM44135];
                    }
                    this.f23254 = iM44135;
                    this.f23252 = 0;
                    c10669.f29518.m54412(iM44136, iM44135, this.f23255);
                    int i5 = i + iMin;
                    int i6 = i2 - iMin;
                    int i7 = this.f23254 - this.f23252;
                    if (i7 > 0) {
                        iMin2 = Math.min(i6, i7);
                        System.arraycopy(this.f23255, this.f23252, bArr, i5, iMin2);
                        this.f23252 += iMin2;
                    } else {
                        iMin2 = 0;
                    }
                    iMin += iMin2;
                } else {
                    this.f23251 = true;
                    break;
                }
            } else {
                byte b = (byte) iM24553;
                c10669.f29518.m54411(b);
                bArr[iMin + i] = b;
                iMin++;
            }
        }
        return iMin;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo20101() {
        return !this.f23251;
    }

    @Override // p067l.AbstractC16032
    /* JADX INFO: renamed from: ֫ */
    public final int mo20099() {
        return this.f23254 - this.f23252;
    }
}
