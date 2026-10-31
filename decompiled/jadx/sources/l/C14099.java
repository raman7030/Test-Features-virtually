package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14099 extends AbstractC2043 implements InterfaceC17565 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f42568;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f42569;

    public C14099(int[] iArr, int[] iArr2) {
        super(EnumC23915.f77361);
        if (iArr.length != iArr2.length) {
            throw new RuntimeException("The number of keys and targets don't match");
        }
        if (iArr2.length == 0) {
            throw new RuntimeException("The sparse-switch data must contain at least 1 key/target");
        }
        if (iArr2.length > 65535) {
            throw new RuntimeException("The sparse-switch data contains too many elements. The maximum number of switch elements is 65535");
        }
        this.f42568 = iArr;
        this.f42569 = iArr2;
    }

    public C14099(byte[] bArr, int i) {
        super(EnumC23915.f77361);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for a SparseSwitchData pseudo-instruction");
        }
        if (bArr[i + 1] != 2) {
            throw new RuntimeException("Invalid sub-opcode byte for a SparseSwitchData pseudo-instruction");
        }
        int iM28871 = C11807.m28871(i + 2, bArr);
        this.f42568 = new int[iM28871];
        this.f42569 = new int[iM28871];
        for (int i2 = 0; i2 < iM28871; i2++) {
            int i3 = i + 4;
            int i4 = i2 * 4;
            this.f42568[i2] = C11807.m28859(i3 + i4, bArr);
            this.f42569[i2] = C11807.m28859((iM28871 * 4) + i3 + i4, bArr);
        }
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۧ */
    public final void mo2743(C1547 c1547, int i) {
        c1547.m5296(4);
        c1547.m5300(0);
        c1547.m5300(2);
        int[] iArr = this.f42569;
        c1547.m5304(iArr.length);
        if (iArr.length > 0) {
            int[] iArr2 = this.f42568;
            c1547.m5302(iArr2[0]);
            for (int i2 = 1; i2 < iArr2.length; i2++) {
                c1547.m5302(iArr2[i2]);
            }
            for (int i3 : iArr) {
                c1547.m5302(i3);
            }
        }
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ۢ */
    public final EnumC23957 mo2742() {
        return EnumC23957.SparseSwitchData;
    }

    @Override // l.AbstractC2043
    /* JADX INFO: renamed from: ֫ */
    public final int mo6715(int i) {
        return (i % 2) + (this.f42569.length * 4) + 2;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m33711() {
        return this.f42569.length;
    }

    @Override // l.InterfaceC17565
    /* JADX INFO: renamed from: ᩷ */
    public final int[] mo17617() {
        return this.f42569;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator m33712() {
        return new C11984(this);
    }
}
