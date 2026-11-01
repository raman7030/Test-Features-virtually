package p067l;

/* JADX INFO: renamed from: l.ۚ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C43R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7710 extends AbstractC14235 {

    /* JADX INFO: renamed from: ۧ */
    public int f20232;

    /* JADX INFO: renamed from: ܽ */
    public C21122[] f20233;

    /* JADX INFO: renamed from: ᩳ */
    public int f20234;

    /* JADX INFO: renamed from: ֫ */
    public static C7710 m17846(C8200 c8200) {
        C7710 c7710 = new C7710(c8200);
        c7710.f20232 = EnumC8055.f21261;
        c7710.f20233 = new C21122[32768];
        return c7710;
    }

    @Override // p067l.AbstractC14235
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 mo17848(char[] cArr, int i) {
        byte[] bArr = new byte[i * 3];
        return mo17847(0, C14514.m33171(bArr, 0, i, cArr), bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC14235
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12224 mo17847(int i, int i2, byte[] bArr) {
        int iM32716 = AbstractC14235.m32716(i, i2, bArr) & this.f20232;
        C21122 c21122 = this.f20233[iM32716];
        C21122 c21123 = c21122;
        C21122 c21124 = null;
        while (c21122 != null) {
            C3015 c3015 = (C3015) c21122.get();
            if (c3015 != null) {
                byte[] bArr2 = c3015.f5389;
                if (bArr2.length == i2 && AbstractC14235.m32715(0, bArr2, i, bArr, i2)) {
                    return c3015;
                }
                c21124 = c21122;
            } else if (c21123 == c21122) {
                C21122[] c21122Arr = this.f20233;
                C21122 c21125 = c21122.f66386;
                c21122Arr[iM32716] = c21125;
                c21123 = c21125;
            } else if (c21124 != null) {
                c21124.f66386 = c21122.f66386;
            } else {
                C1446.m31702("previousNonNullTableEntry cannot be null here.");
                throw null;
            }
            c21122 = c21122.f66386;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        int i3 = this.f20234;
        this.f20234 = i3 + 1;
        C3015 c3016 = new C3015(this, bArr3, i3);
        C21122 c21126 = new C21122(c3016);
        if (c21124 == null) {
            this.f20233[iM32716] = c21126;
            return c3016;
        }
        if (c21124.f66386 != null) {
            C1446.m31702("previousNonNullTableEntry.next must be null.");
            throw null;
        }
        c21124.f66386 = c21126;
        return c3016;
    }

    @Override // p067l.AbstractC14235
    /* JADX INFO: renamed from: ֫ */
    public final void mo17849() {
        this.f20233 = null;
    }
}
