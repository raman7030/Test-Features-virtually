package l;

/* JADX INFO: renamed from: l.ᩴ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58K */
/* JADX INFO: loaded from: classes5.dex */
public final class C18982 extends AbstractC4165 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6281 f59844;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7755 f59845;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f59846;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C7755 f59847;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16864 f59848;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f59849;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f59850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f59851;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f59852;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7755 f59853;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7755 f59854;

    @Override // l.AbstractC4165
    /* JADX INFO: renamed from: ֫ */
    public final void mo12599() {
    }

    public C18982(C6281 c6281, int i, String str, String str2, String str3, Object obj) {
        super(589824, null);
        this.f59844 = c6281;
        this.f59850 = i;
        this.f59846 = c6281.m17326(str);
        this.f59851 = c6281.m17326(str2);
        if (str3 != null) {
            this.f59849 = c6281.m17326(str3);
        }
        if (obj != null) {
            this.f59852 = c6281.m17308(obj).f39901;
        }
    }

    @Override // l.AbstractC4165
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo5447(String str, boolean z) {
        C6281 c6281 = this.f59844;
        if (z) {
            C7755 c7755M20785 = C7755.m20785(c6281, str, this.f59853);
            this.f59853 = c7755M20785;
            return c7755M20785;
        }
        C7755 c7755M20786 = C7755.m20785(c6281, str, this.f59854);
        this.f59854 = c7755M20786;
        return c7755M20786;
    }

    @Override // l.AbstractC4165
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo5446(int i, C23214 c23214, String str, boolean z) {
        C6281 c6281 = this.f59844;
        if (z) {
            C7755 c7755M20784 = C7755.m20784(c6281, i, c23214, str, this.f59847);
            this.f59847 = c7755M20784;
            return c7755M20784;
        }
        C7755 c7755M20785 = C7755.m20784(c6281, i, c23214, str, this.f59845);
        this.f59845 = c7755M20785;
        return c7755M20785;
    }

    @Override // l.AbstractC4165
    /* JADX INFO: renamed from: ֫ */
    public final void mo12600(C16864 c16864) {
        c16864.f51744 = this.f59848;
        this.f59848 = c16864;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43817() {
        int i;
        int i2 = this.f59852;
        C6281 c6281 = this.f59844;
        if (i2 != 0) {
            c6281.m17326("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int iM39634 = i + C16864.m39634(c6281, this.f59850, this.f59849) + C7755.m20783(this.f59853, this.f59854, this.f59847, this.f59845);
        C16864 c16864 = this.f59848;
        return c16864 != null ? iM39634 + c16864.m39636(c6281) : iM39634;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43816(C18276 c18276) {
        C6281 c6281 = this.f59844;
        int i = 0;
        boolean z = c6281.m17323() < 49;
        int i2 = ~(z ? 4096 : 0);
        int i3 = this.f59850;
        c18276.m42618(i2 & i3);
        c18276.m42618(this.f59846);
        c18276.m42618(this.f59851);
        int i4 = this.f59852;
        int i5 = i4 == 0 ? 0 : 1;
        if ((i3 & 4096) != 0 && z) {
            i5++;
        }
        int i6 = this.f59849;
        if (i6 != 0) {
            i5++;
        }
        if ((131072 & i3) != 0) {
            i5++;
        }
        if (this.f59853 != null) {
            i5++;
        }
        if (this.f59854 != null) {
            i5++;
        }
        if (this.f59847 != null) {
            i5++;
        }
        if (this.f59845 != null) {
            i5++;
        }
        C16864 c16864 = this.f59848;
        if (c16864 != null) {
            while (c16864 != null) {
                i++;
                c16864 = c16864.f51744;
            }
            i5 += i;
        }
        c18276.m42618(i5);
        if (i4 != 0) {
            c18276.m42618(c6281.m17326("ConstantValue"));
            c18276.m42616(2);
            c18276.m42618(i4);
        }
        C16864.m39635(c6281, i3, i6, c18276);
        C7755.m20787(this.f59844, this.f59853, this.f59854, this.f59847, this.f59845, c18276);
        C16864 c16865 = this.f59848;
        if (c16865 != null) {
            c16865.m39639(c6281, c18276);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43815(C11221 c11221) {
        c11221.m27786(this.f59848);
    }
}
