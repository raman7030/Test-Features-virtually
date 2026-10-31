package l;

import java.io.File;

/* JADX INFO: renamed from: l.ᩳܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A14A */
/* JADX INFO: loaded from: classes5.dex */
public class C18138 extends C11293 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f56427;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f56428;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f56429;

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo27936() {
        if (!C22518.m50492().mo2656()) {
            throw C17432.f53288;
        }
        return super.mo27936();
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo27924() {
        if (!C22518.m50492().mo2656()) {
            throw C17432.f53288;
        }
        return super.mo27924();
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        if (!C22518.m50492().mo2656()) {
            throw C17432.f53288;
        }
        return super.mo27915(interfaceC6975);
    }

    public C18138(File file, File file2, String str, String str2) {
        super(file2, false);
        this.f56428 = file;
        this.f56427 = str;
        this.f56429 = str2;
    }

    @Override // l.C11293, l.InterfaceC21855
    /* JADX INFO: renamed from: ֫ */
    public C16726 mo27913() {
        return new C16726(this.f56428, this.f33834, this.f56427, this.f56429, null);
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo27912() {
        if (C22518.m50492().mo2656()) {
            return true;
        }
        throw C17432.f53288;
    }

    @Override // l.C11293
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15440 mo27914(C17642 c17642) {
        String strM41286 = c17642.m41286();
        File file = new File(this.f56428, strM41286);
        File file2 = new File(this.f33834, strM41286);
        String strM51498 = C23202.m51498(new StringBuilder(), this.f56427, "/", strM41286);
        C16726 c16726 = new C16726(file, file2, strM51498, this.f56429, c17642);
        C11233.m27805(strM51498, "relativePath");
        String str = this.f56429;
        C11233.m27805(str, "treePrimaryPath");
        return new C12993(file, strM51498, str, c16726, null);
    }

    @Override // l.C11293
    /* JADX INFO: renamed from: ᩶ۧ */
    public final C19697 mo27937() {
        if (!C22518.m50492().mo2656()) {
            throw C17432.f53288;
        }
        C19697 c19697Mo27937 = super.mo27937();
        if (c19697Mo27937.m45391()) {
            return c19697Mo27937;
        }
        throw C17432.f53288;
    }
}
