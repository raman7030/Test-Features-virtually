package p067l;

/* JADX INFO: renamed from: l.ܺ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17741 extends AbstractC19754 {

    /* JADX INFO: renamed from: ܽ */
    public final C11037[] f52993;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractC5002 f52994;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17741(AbstractC5002 abstractC5002, int i) {
        super(i, 0);
        this.f52994 = abstractC5002;
        int i2 = 0;
        this.f52993 = new C11037[1 << i];
        while (true) {
            C11037[] c11037Arr = this.f52993;
            if (i2 >= c11037Arr.length) {
                return;
            }
            c11037Arr[i2] = new C11037(this);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40324() {
        int i = 0;
        while (true) {
            C11037[] c11037Arr = this.f52993;
            if (i >= c11037Arr.length) {
                return;
            }
            AbstractC9088.m21030(c11037Arr[i].f54980);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40323() {
        this.f52993[0].m25446();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40322() {
        AbstractC5002 abstractC5002 = this.f52994;
        AbstractC15335 abstractC15335 = abstractC5002.f11424;
        this.f52993[m44901(abstractC15335.m34897(abstractC5002.f11420 + 1), abstractC15335.m34905() - abstractC5002.f11420)].m25446();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40321(int i, int i2, int i3, int i4, C2989 c2989) {
        AbstractC5002 abstractC5002 = this.f52994;
        int iM38710 = 0;
        int iM38711 = C17070.m38710(abstractC5002.f56947[c2989.m5006()][abstractC5002.f56941 & i4], 0);
        int iM44901 = m44901(i3, i4);
        boolean zM5008 = c2989.m5008();
        int i5 = 256;
        C11037[] c11037Arr = this.f52993;
        if (zM5008) {
            C11037 c11037 = c11037Arr[iM44901];
            int i6 = i | 256;
            do {
                iM38710 += C17070.m38710(c11037.f54980[i6 >>> 8], (i6 >>> 7) & 1);
                i6 <<= 1;
            } while (i6 < 65536);
        } else {
            C11037 c11038 = c11037Arr[iM44901];
            int i7 = i | 256;
            do {
                i2 <<= 1;
                iM38710 += C17070.m38710(c11038.f54980[(i2 & i5) + i5 + (i7 >>> 8)], (i7 >>> 7) & 1);
                i7 <<= 1;
                i5 &= ~(i2 ^ i7);
            } while (i7 < 65536);
        }
        return iM38711 + iM38710;
    }
}
