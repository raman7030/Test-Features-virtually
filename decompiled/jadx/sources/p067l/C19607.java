package p067l;

import java.io.File;

/* JADX INFO: renamed from: l.ᩳܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A14A */
/* JADX INFO: loaded from: classes5.dex */
public class C19607 extends C13102 {

    /* JADX INFO: renamed from: ۛ */
    public String f59641;

    /* JADX INFO: renamed from: ۤ */
    public final File f59642;

    /* JADX INFO: renamed from: ۨ */
    public String f59643;

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo29997() {
        if (!C23770.m52834().mo4996()) {
            throw C18936.f56475;
        }
        return super.mo29997();
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo29985() {
        if (!C23770.m52834().mo4996()) {
            throw C18936.f56475;
        }
        return super.mo29985();
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22410 mo29976(InterfaceC8998 interfaceC8998) {
        if (!C23770.m52834().mo4996()) {
            throw C18936.f56475;
        }
        return super.mo29976(interfaceC8998);
    }

    public C19607(File file, File file2, String str, String str2) {
        super(file2, false);
        this.f59642 = file;
        this.f59641 = str;
        this.f59643 = str2;
    }

    @Override // p067l.C13102, p067l.InterfaceC23140
    /* JADX INFO: renamed from: ֫ */
    public C18265 mo29974() {
        return new C18265(this.f59642, this.f36833, this.f59641, this.f59643, null);
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo29973() {
        if (C23770.m52834().mo4996()) {
            return true;
        }
        throw C18936.f56475;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo29975(C19136 c19136) {
        String strM43532 = c19136.m43532();
        File file = new File(this.f59642, strM43532);
        File file2 = new File(this.f36833, strM43532);
        String strM53894 = C24420.m53894(new StringBuilder(), this.f59641, "/", strM43532);
        C18265 c18265 = new C18265(file, file2, strM53894, this.f59643, c19136);
        C13045.m29867(strM53894, "relativePath");
        String str = this.f59643;
        C13045.m29867(str, "treePrimaryPath");
        return new C14717(file, strM53894, str, c18265, null);
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ᩶ۧ */
    public final C21089 mo29998() {
        if (!C23770.m52834().mo4996()) {
            throw C18936.f56475;
        }
        C21089 c21089Mo29998 = super.mo29998();
        if (c21089Mo29998.m47688()) {
            return c21089Mo29998;
        }
        throw C18936.f56475;
    }
}
