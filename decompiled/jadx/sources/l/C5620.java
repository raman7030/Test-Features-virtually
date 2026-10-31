package l;

/* JADX INFO: renamed from: l.ۚ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C43R */
/* JADX INFO: loaded from: classes3.dex */
public final class C5620 extends AbstractC12486 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17388;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19732[] f17389;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17390;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5620 m15925(C6136 c6136) {
        C5620 c5620 = new C5620(c6136);
        c5620.f17388 = EnumC5983.f18409;
        c5620.f17389 = new C19732[32768];
        return c5620;
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 mo15927(char[] cArr, int i) {
        byte[] bArr = new byte[i * 3];
        return mo15926(0, C12780.m31087(bArr, 0, i, cArr), bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 mo15926(int i, int i2, byte[] bArr) {
        int iM30651 = AbstractC12486.m30651(i, i2, bArr) & this.f17388;
        C19732 c19732 = this.f17389[iM30651];
        C19732 c19733 = c19732;
        C19732 c19734 = null;
        while (c19732 != null) {
            C0680 c0680 = (C0680) c19732.get();
            if (c0680 != null) {
                byte[] bArr2 = c0680.f2616;
                if (bArr2.length == i2 && AbstractC12486.m30650(0, bArr2, i, bArr, i2)) {
                    return c0680;
                }
                c19734 = c19732;
            } else if (c19733 == c19732) {
                C19732[] c19732Arr = this.f17389;
                C19732 c19735 = c19732.f63755;
                c19732Arr[iM30651] = c19735;
                c19733 = c19735;
            } else if (c19734 != null) {
                c19734.f63755 = c19732.f63755;
            } else {
                C12171.m29640("previousNonNullTableEntry cannot be null here.");
                throw null;
            }
            c19732 = c19732.f63755;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        int i3 = this.f17390;
        this.f17390 = i3 + 1;
        C0680 c0681 = new C0680(this, bArr3, i3);
        C19732 c19736 = new C19732(c0681);
        if (c19734 == null) {
            this.f17389[iM30651] = c19736;
            return c0681;
        }
        if (c19734.f63755 != null) {
            C12171.m29640("previousNonNullTableEntry.next must be null.");
            throw null;
        }
        c19734.f63755 = c19736;
        return c0681;
    }

    @Override // l.AbstractC12486
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15928() {
        this.f17389 = null;
    }
}
