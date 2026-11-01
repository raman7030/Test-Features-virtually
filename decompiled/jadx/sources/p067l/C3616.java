package p067l;

/* JADX INFO: renamed from: l.֨ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L9VN */
/* JADX INFO: loaded from: classes3.dex */
public final class C3616 extends AbstractC19710 {

    /* JADX INFO: renamed from: ܿۧ */
    public int f7484;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    public C3616(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341, (byte) 50, (byte) 3);
        this.f7484 = i;
        this.f59932 = 2;
        this.f59926 = 0;
        this.f59920 = 0;
        this.f59934 = 800;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        int i;
        int i2 = this.f7484;
        if (i2 == -1) {
            i = 1;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException("Unhandled information level");
            }
            i = 259;
        }
        C3775.m7364(i, 0, bArr);
        return 2;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + C13854.m31529(this.f7484, 3) + "]");
    }
}
