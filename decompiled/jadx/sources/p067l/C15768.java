package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15768 extends AbstractC4310 implements InterfaceC19062 {

    /* JADX INFO: renamed from: ۧ */
    public int[] f45654;

    /* JADX INFO: renamed from: ܽ */
    public int[] f45655;

    public C15768(int[] iArr, int[] iArr2) {
        super(EnumC25097.f80112);
        if (iArr.length != iArr2.length) {
            throw new RuntimeException("The number of keys and targets don't match");
        }
        if (iArr2.length == 0) {
            throw new RuntimeException("The sparse-switch data must contain at least 1 key/target");
        }
        if (iArr2.length > 65535) {
            throw new RuntimeException("The sparse-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f45654 = iArr;
        this.f45655 = iArr2;
    }

    public C15768(byte[] bArr, int i) {
        super(EnumC25097.f80112);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a SparseSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 2) {
            throw new RuntimeException("Invalid sub-opcode byte for a SparseSwitchData pseudo-instruction");
        }
        int iM30920 = C13590.m30920(i + 2, bArr);
        this.f45654 = new int[iM30920];
        this.f45655 = new int[iM30920];
        for (int i2 = 0; i2 < iM30920; i2++) {
            int i3 = i + 4;
            int i4 = i2 * 4;
            this.f45654[i2] = C13590.m30908(i3 + i4, bArr);
            this.f45655[i2] = C13590.m30908((iM30920 * 4) + i3 + i4, bArr);
        }
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۧ */
    public final void mo5082(C3838 c3838, int i) {
        c3838.m7525(4);
        c3838.m7529(0);
        c3838.m7529(2);
        int[] iArr = this.f45655;
        c3838.m7533(iArr.length);
        if (iArr.length > 0) {
            int[] iArr2 = this.f45654;
            c3838.m7531(iArr2[0]);
            for (int i2 = 1; i2 < iArr2.length; i2++) {
                c3838.m7531(iArr2[i2]);
            }
            for (int i3 : iArr) {
                c3838.m7531(i3);
            }
        }
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ۢ */
    public final EnumC25137 mo5081() {
        return EnumC25137.SparseSwitchData;
    }

    @Override // p067l.AbstractC4310
    /* JADX INFO: renamed from: ֫ */
    public final int mo8841(int i) {
        return (i % 2) + (this.f45655.length * 4) + 2;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m35837() {
        return this.f45655.length;
    }

    @Override // p067l.InterfaceC19062
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo19557() {
        return this.f45655;
    }

    /* JADX INFO: renamed from: ܺ */
    public final Iterator m35838() {
        return new C13758(this);
    }
}
