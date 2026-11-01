package p067l;

/* JADX INFO: renamed from: l.ۛ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8393 extends AbstractC4310 implements InterfaceC19062 {

    /* JADX INFO: renamed from: ۧ */
    public int f22514;

    /* JADX INFO: renamed from: ܽ */
    public int[] f22515;

    public C8393(int i, int[] iArr) {
        super(EnumC25097.f80112);
        if (iArr.length > 65535) {
            throw new RuntimeException("The packed-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f22514 = i;
        this.f22515 = iArr;
    }

    public C8393(byte[] bArr, int i) {
        super(EnumC25097.f80112);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a PackedSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 1) {
            throw new RuntimeException("Invalid sub-opcode byte for a PackedSwitchData pseudo-instruction");
        }
        int iM30920 = C13590.m30920(i + 2, bArr);
        this.f22514 = C13590.m30908(i + 4, bArr);
        this.f22515 = new int[iM30920];
        for (int i2 = 0; i2 < iM30920; i2++) {
            this.f22515[i2] = C13590.m30908((i2 * 4) + i + 8, bArr);
        }
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7525(4);
        c3838.m7529(0);
        c3838.m7529(1);
        int[] iArr = this.f22515;
        c3838.m7533(iArr.length);
        c3838.m7531(this.f22514);
        for (int i2 : iArr) {
            c3838.m7531(i2);
        }
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.PackedSwitchData;
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ֫ */
    public final int mo8841(int i) {
        return (i % 2) + (this.f22515.length * 2) + 4;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m19556() {
        return this.f22514;
    }

    @Override // p067l.InterfaceC19062
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo19557() {
        return this.f22515;
    }
}
