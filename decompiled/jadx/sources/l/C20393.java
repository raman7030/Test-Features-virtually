package l;

/* JADX INFO: renamed from: l.᩶᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9BT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20393 extends AbstractC22509 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f65791;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f65792;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C18276 f65793;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18276 f65794;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C18276 f65795;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18276 f65796;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f65797;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18276 f65798;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f65799;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18276 f65800;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65801;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f65802;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f65803;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f65804;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C6281 f65805;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f65806;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f65807;

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46701() {
    }

    public C20393(C6281 c6281, int i, int i2, int i3) {
        super(589824, null);
        this.f65805 = c6281;
        this.f65799 = i;
        this.f65802 = i2;
        this.f65807 = i3;
        this.f65793 = new C18276();
        this.f65798 = new C18276();
        this.f65795 = new C18276();
        this.f65794 = new C18276();
        this.f65800 = new C18276();
        this.f65796 = new C18276();
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ֫ */
    public final void mo41755(String str) {
        this.f65803 = this.f65805.m17309(str).f39901;
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ۧ */
    public final void mo41758(String str) {
        this.f65796.m42618(this.f65805.m17322(str).f39901);
        this.f65797++;
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ֫ */
    public final void mo41754(int i, String str, String str2) {
        C6281 c6281 = this.f65805;
        int i2 = c6281.m17318(str).f39901;
        C18276 c18276 = this.f65793;
        c18276.m42618(i2);
        c18276.m42618(i);
        c18276.m42618(str2 == null ? 0 : c6281.m17326(str2));
        this.f65804++;
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ֫ */
    public final void mo41756(String str, int i, String... strArr) {
        C6281 c6281 = this.f65805;
        int i2 = c6281.m17322(str).f39901;
        C18276 c18276 = this.f65798;
        c18276.m42618(i2);
        c18276.m42618(i);
        if (strArr == null) {
            c18276.m42618(0);
        } else {
            c18276.m42618(strArr.length);
            for (String str2 : strArr) {
                c18276.m42618(c6281.m17318(str2).f39901);
            }
        }
        this.f65801++;
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ۧ */
    public final void mo41759(String str, int i, String... strArr) {
        C6281 c6281 = this.f65805;
        int i2 = c6281.m17322(str).f39901;
        C18276 c18276 = this.f65795;
        c18276.m42618(i2);
        c18276.m42618(i);
        if (strArr == null) {
            c18276.m42618(0);
        } else {
            c18276.m42618(strArr.length);
            for (String str2 : strArr) {
                c18276.m42618(c6281.m17318(str2).f39901);
            }
        }
        this.f65806++;
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ܽ */
    public final void mo41760(String str) {
        this.f65794.m42618(this.f65805.m17309(str).f39901);
        this.f65791++;
    }

    @Override // l.AbstractC22509
    /* JADX INFO: renamed from: ֫ */
    public final void mo41757(String str, String... strArr) {
        C6281 c6281 = this.f65805;
        int i = c6281.m17309(str).f39901;
        C18276 c18276 = this.f65800;
        c18276.m42618(i);
        c18276.m42618(strArr.length);
        for (String str2 : strArr) {
            c18276.m42618(c6281.m17309(str2).f39901);
        }
        this.f65792++;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m46704() {
        return (this.f65797 > 0 ? 1 : 0) + 1 + (this.f65803 > 0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46703() {
        C6281 c6281 = this.f65805;
        c6281.m17326("Module");
        int i = this.f65793.f56819 + 22 + this.f65798.f56819 + this.f65795.f56819 + this.f65794.f56819 + this.f65800.f56819;
        if (this.f65797 > 0) {
            c6281.m17326("ModulePackages");
            i += this.f65796.f56819 + 8;
        }
        if (this.f65803 <= 0) {
            return i;
        }
        c6281.m17326("ModuleMainClass");
        return i + 8;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46702(C18276 c18276) {
        C18276 c18277 = this.f65793;
        int i = c18277.f56819 + 16;
        C18276 c18278 = this.f65798;
        int i2 = i + c18278.f56819;
        C18276 c18279 = this.f65795;
        int i3 = i2 + c18279.f56819;
        C18276 c182710 = this.f65794;
        int i4 = i3 + c182710.f56819;
        C18276 c182711 = this.f65800;
        int i5 = i4 + c182711.f56819;
        C6281 c6281 = this.f65805;
        c18276.m42618(c6281.m17326("Module"));
        c18276.m42616(i5);
        c18276.m42618(this.f65799);
        c18276.m42618(this.f65802);
        c18276.m42618(this.f65807);
        c18276.m42618(this.f65804);
        c18276.m42613(0, c18277.f56819, c18277.f56818);
        c18276.m42618(this.f65801);
        c18276.m42613(0, c18278.f56819, c18278.f56818);
        c18276.m42618(this.f65806);
        c18276.m42613(0, c18279.f56819, c18279.f56818);
        c18276.m42618(this.f65791);
        c18276.m42613(0, c182710.f56819, c182710.f56818);
        c18276.m42618(this.f65792);
        c18276.m42613(0, c182711.f56819, c182711.f56818);
        if (this.f65797 > 0) {
            c18276.m42618(c6281.m17326("ModulePackages"));
            C18276 c182712 = this.f65796;
            c18276.m42616(c182712.f56819 + 2);
            c18276.m42618(this.f65797);
            c18276.m42613(0, c182712.f56819, c182712.f56818);
        }
        if (this.f65803 > 0) {
            c18276.m42618(c6281.m17326("ModuleMainClass"));
            c18276.m42616(2);
            c18276.m42618(this.f65803);
        }
    }
}
