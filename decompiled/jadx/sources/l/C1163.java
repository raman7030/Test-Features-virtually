package l;

/* JADX INFO: renamed from: l.֨ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1163 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5397 f4201;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4202;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4203;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4204;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f4205 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4206;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21625 f4207;

    public C1163(C21625 c21625) {
        this.f4207 = c21625;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m3964(int i) {
        if (i < 0) {
            return false;
        }
        C21625 c21625 = this.f4207;
        if (i >= c21625.f69418) {
            return false;
        }
        if (this.f4205 != c21625.f69417 || i < this.f4203 || i >= this.f4204) {
            this.f4202 = c21625.m48851(i);
            this.f4201 = (C5397) c21625.f69419.get(this.f4202);
            int iM48847 = c21625.m48847(this.f4202);
            this.f4203 = iM48847;
            this.f4204 = iM48847 + this.f4201.f16805;
            this.f4205 = c21625.f69417;
        }
        this.f4206 = i - this.f4203;
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m3963() {
        return this.f4201.f16802[this.f4206] & 65535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m3959() {
        return (char) (this.f4201.f16802[this.f4206] >>> 16);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3961() {
        return this.f4201.m15403(this.f4206) - this.f4201.m15405(this.f4206);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3962(int i) {
        C5397 c5397 = this.f4201;
        return c5397.f16803[C11003.checkIndex(i, m3961()) + c5397.m15405(this.f4206)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3960(int i) {
        int iM15403 = this.f4201.m15403(this.f4206);
        for (int iM15405 = this.f4201.m15405(this.f4206); iM15405 < iM15403; iM15405++) {
            if (this.f4201.f16803[iM15405] == i) {
                return true;
            }
        }
        return false;
    }
}
