package l;

/* JADX INFO: renamed from: l.ۛ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6339 extends AbstractC2043 implements InterfaceC17565 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f19642;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f19643;

    public C6339(int i, int[] iArr) {
        super(EnumC23915.f77361);
        if (iArr.length > 65535) {
            throw new RuntimeException("The packed-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f19642 = i;
        this.f19643 = iArr;
    }

    public C6339(byte[] bArr, int i) {
        super(EnumC23915.f77361);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a PackedSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 1) {
            throw new RuntimeException("Invalid sub-opcode byte for a PackedSwitchData pseudo-instruction");
        }
        int iM28871 = C11807.m28871(i + 2, bArr);
        this.f19642 = C11807.m28859(i + 4, bArr);
        this.f19643 = new int[iM28871];
        for (int i2 = 0; i2 < iM28871; i2++) {
            this.f19643[i2] = C11807.m28859((i2 * 4) + i + 8, bArr);
        }
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5296(4);
        c1547.m5300(0);
        c1547.m5300(1);
        int[] iArr = this.f19643;
        c1547.m5304(iArr.length);
        c1547.m5302(this.f19642);
        for (int i2 : iArr) {
            c1547.m5302(i2);
        }
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.PackedSwitchData;
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ֫ */
    public final int mo6715(int i) {
        return (i % 2) + (this.f19643.length * 2) + 4;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m17616() {
        return this.f19642;
    }

    @Override // l.InterfaceC17565
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] mo17617() {
        return this.f19643;
    }
}
