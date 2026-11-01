package p067l;

/* JADX INFO: renamed from: l.ۛۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91H5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7972 {

    /* JADX INFO: renamed from: ֫ */
    public final C5290 f20961;

    /* JADX INFO: renamed from: ۧ */
    public int f20962;

    public C7972(C5290 c5290, int i) {
        this.f20961 = c5290;
        this.f20962 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m18455() {
        return this.f20962;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18459(int i) {
        this.f20962 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte m18458() {
        byte bM11440 = this.f20961.m11440(this.f20962);
        this.f20962++;
        return bM11440;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m18457() {
        int iM11443 = this.f20961.m11443(this.f20962);
        this.f20962++;
        return iM11443;
    }

    /* JADX INFO: renamed from: ܿ */
    public final short m18460() {
        short sM11444 = this.f20961.m11444(this.f20962);
        this.f20962 += 2;
        return sM11444;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m18463() {
        int iM11441 = this.f20961.m11441(this.f20962);
        this.f20962 += 2;
        return iM11441;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m18461() {
        int iM11442 = this.f20961.m11442(this.f20962);
        this.f20962 += 4;
        return iM11442;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m18453(int i) {
        int[] iArrM11439 = this.f20961.m11439(this.f20962, i);
        this.f20962 = (i * 4) + this.f20962;
        return iArrM11439;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m18456(int i) {
        int i2 = this.f20962;
        StringBuilder sb = new StringBuilder(16);
        int i3 = i;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            char cM11444 = (char) this.f20961.m11444(i2);
            i2 += 2;
            if (cM11444 == 0) {
                break;
            }
            sb.append(cM11444);
            i3 = i4;
        }
        String string = sb.toString();
        this.f20962 = (i * 2) + this.f20962;
        return string;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18452(byte[] bArr) {
        this.f20961.m11436(this.f20962, bArr);
        this.f20962 += bArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m18451() {
        return this.f20961.m11435(this.f20962);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m18454() {
        this.f20962 += 4;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m18462(int i) {
        this.f20962 += i;
    }
}
