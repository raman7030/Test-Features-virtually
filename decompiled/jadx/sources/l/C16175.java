package l;

/* JADX INFO: renamed from: l.ܺ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16175 extends AbstractC18293 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9121[] f49827;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2771 f49828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16175(AbstractC2771 abstractC2771, int i) {
        super(i, 0);
        this.f49828 = abstractC2771;
        int i2 = 0;
        this.f49827 = new C9121[1 << i];
        while (true) {
            C9121[] c9121Arr = this.f49827;
            if (i2 >= c9121Arr.length) {
                return;
            }
            c9121Arr[i2] = new C9121(this);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38112() {
        int i = 0;
        while (true) {
            C9121[] c9121Arr = this.f49827;
            if (i >= c9121Arr.length) {
                return;
            }
            AbstractC7070.m19072(c9121Arr[i].f51799);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38111() {
        this.f49827[0].m23495();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38110() {
        AbstractC2771 abstractC2771 = this.f49828;
        AbstractC13644 abstractC13644 = abstractC2771.f8630;
        this.f49827[m42641(abstractC13644.m32782(abstractC2771.f8626 + 1), abstractC13644.m32790() - abstractC2771.f8626)].m23495();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38109(int i, int i2, int i3, int i4, C0653 c0653) {
        AbstractC2771 abstractC2771 = this.f49828;
        int iM36551 = 0;
        int iM36552 = C15469.m36551(abstractC2771.f53753[c0653.m2666()][abstractC2771.f53747 & i4], 0);
        int iM42641 = m42641(i3, i4);
        boolean zM2668 = c0653.m2668();
        int i5 = 256;
        C9121[] c9121Arr = this.f49827;
        if (zM2668) {
            C9121 c9121 = c9121Arr[iM42641];
            int i6 = i | 256;
            do {
                iM36551 += C15469.m36551(c9121.f51799[i6 >>> 8], (i6 >>> 7) & 1);
                i6 <<= 1;
            } while (i6 < 65536);
        } else {
            C9121 c9122 = c9121Arr[iM42641];
            int i7 = i | 256;
            do {
                i2 <<= 1;
                iM36551 += C15469.m36551(c9122.f51799[(i2 & i5) + i5 + (i7 >>> 8)], (i7 >>> 7) & 1);
                i7 <<= 1;
                i5 &= ~(i2 ^ i7);
            } while (i7 < 65536);
        }
        return iM36552 + iM36551;
    }
}
