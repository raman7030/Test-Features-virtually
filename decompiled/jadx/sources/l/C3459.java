package l;

/* JADX INFO: renamed from: l.ۗ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9BO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3459 extends AbstractC4870 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7755 f10954;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C6281 f10955;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f10956;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7755 f10957;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f10958;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7755 f10959;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16864 f10960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10961;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7755 f10962;

    @Override // l.AbstractC4870
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10595() {
    }

    public C3459(C6281 c6281, String str, String str2, String str3) {
        super(589824, null);
        this.f10955 = c6281;
        this.f10961 = c6281.m17326(str);
        this.f10958 = c6281.m17326(str2);
        if (str3 != null) {
            this.f10956 = c6281.m17326(str3);
        }
    }

    @Override // l.AbstractC4870
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo10594(String str, boolean z) {
        C6281 c6281 = this.f10955;
        if (z) {
            C7755 c7755M20785 = C7755.m20785(c6281, str, this.f10962);
            this.f10962 = c7755M20785;
            return c7755M20785;
        }
        C7755 c7755M20786 = C7755.m20785(c6281, str, this.f10959);
        this.f10959 = c7755M20786;
        return c7755M20786;
    }

    @Override // l.AbstractC4870
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo10593(int i, C23214 c23214, String str, boolean z) {
        C6281 c6281 = this.f10955;
        if (z) {
            C7755 c7755M20784 = C7755.m20784(c6281, i, c23214, str, this.f10954);
            this.f10954 = c7755M20784;
            return c7755M20784;
        }
        C7755 c7755M20785 = C7755.m20784(c6281, i, c23214, str, this.f10957);
        this.f10957 = c7755M20785;
        return c7755M20785;
    }

    @Override // l.AbstractC4870
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10597(C16864 c16864) {
        c16864.f51744 = this.f10960;
        this.f10960 = c16864;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m10599() {
        int i = this.f10956;
        C6281 c6281 = this.f10955;
        int iM39634 = C16864.m39634(c6281, 0, i) + 6 + C7755.m20783(this.f10962, this.f10959, this.f10954, this.f10957);
        C16864 c16864 = this.f10960;
        return c16864 != null ? iM39634 + c16864.m39636(c6281) : iM39634;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10598(C18276 c18276) {
        c18276.m42618(this.f10961);
        c18276.m42618(this.f10958);
        int i = this.f10956;
        int i2 = i != 0 ? 1 : 0;
        if (this.f10962 != null) {
            i2++;
        }
        if (this.f10959 != null) {
            i2++;
        }
        if (this.f10954 != null) {
            i2++;
        }
        if (this.f10957 != null) {
            i2++;
        }
        C16864 c16864 = this.f10960;
        if (c16864 != null) {
            int i3 = 0;
            while (c16864 != null) {
                i3++;
                c16864 = c16864.f51744;
            }
            i2 += i3;
        }
        c18276.m42618(i2);
        C6281 c6281 = this.f10955;
        C16864.m39635(c6281, 0, i, c18276);
        C7755.m20787(this.f10955, this.f10962, this.f10959, this.f10954, this.f10957, c18276);
        C16864 c16865 = this.f10960;
        if (c16865 != null) {
            c16865.m39639(c6281, c18276);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10596(C11221 c11221) {
        c11221.m27786(this.f10960);
    }
}
