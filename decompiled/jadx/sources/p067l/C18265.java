package p067l;

import java.io.File;

/* JADX INFO: renamed from: l.ܽܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R14O */
/* JADX INFO: loaded from: classes5.dex */
public final class C18265 extends C19607 {

    /* JADX INFO: renamed from: ᩺ */
    public C19136 f54542;

    @Override // p067l.C19607, p067l.C13102, p067l.InterfaceC23140
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo29974() {
        return this;
    }

    @Override // p067l.C19607, p067l.C13102, p067l.InterfaceC23140
    /* JADX INFO: renamed from: ֫ */
    public final C18265 mo29974() {
        return this;
    }

    public C18265(File file, File file2, String str, String str2, C19136 c19136) {
        super(file, file2, str, str2);
        this.f54542 = c19136;
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo25503() {
        if (!super.mo25503()) {
            return false;
        }
        this.f54542 = null;
        return true;
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo29990() {
        if (!super.mo29990()) {
            return false;
        }
        this.f54542 = null;
        return true;
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25502(AbstractC17043 abstractC17043) {
        if (!super.mo25502(abstractC17043)) {
            return false;
        }
        this.f54542 = null;
        return true;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ۬ۧ */
    public final void mo29991() {
        this.f54542 = null;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ۤۧ */
    public final C19136 mo29988() {
        C19136 c19136 = this.f54542;
        if (c19136 != null) {
            return c19136;
        }
        C19136 c19136Mo29988 = super.mo29988();
        this.f54542 = c19136Mo29988;
        return c19136Mo29988;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ᩺ۧ */
    public final boolean mo29999() {
        return this.f54542 != null;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ۛۧ */
    public final C19136 mo29981() {
        return this.f54542;
    }
}
