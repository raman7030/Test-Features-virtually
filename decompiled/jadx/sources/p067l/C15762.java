package p067l;

import java.io.File;

/* JADX INFO: renamed from: l.ܰ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C15762 extends C13102 {

    /* JADX INFO: renamed from: ۤ */
    public C19136 f45643;

    @Override // p067l.C13102, p067l.InterfaceC23140
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo29974() {
        return this;
    }

    public C15762(File file, boolean z, C19136 c19136) {
        super(file, z);
        this.f45643 = c19136;
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC17043 mo25510() {
        return new C15762(this.f36833.getAbsoluteFile(), this.f36832, this.f45643);
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo25495() {
        return this.f36833.getAbsolutePath();
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo25503() {
        if (!super.mo25503()) {
            return false;
        }
        this.f45643 = null;
        return true;
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo29990() {
        if (!super.mo29990()) {
            return false;
        }
        this.f45643 = null;
        return true;
    }

    @Override // p067l.C13102, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25502(AbstractC17043 abstractC17043) {
        if (!super.mo25502(abstractC17043)) {
            return false;
        }
        this.f45643 = null;
        return true;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ۬ۧ */
    public final void mo29991() {
        this.f45643 = null;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ۤۧ */
    public final C19136 mo29988() {
        C19136 c19136 = this.f45643;
        if (c19136 != null) {
            return c19136;
        }
        C19136 c19136Mo29988 = super.mo29988();
        this.f45643 = c19136Mo29988;
        return c19136Mo29988;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ᩺ۧ */
    public final boolean mo29999() {
        return this.f45643 != null;
    }

    @Override // p067l.C13102
    /* JADX INFO: renamed from: ۛۧ */
    public final C19136 mo29981() {
        return this.f45643;
    }
}
