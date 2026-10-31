package l;

import java.io.File;

/* JADX INFO: renamed from: l.ܰ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: P17O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14092 extends C11293 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17642 f42557;

    @Override // l.C11293, l.InterfaceC21855
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15440 mo27913() {
        return this;
    }

    public C14092(File file, boolean z, C17642 c17642) {
        super(file, z);
        this.f42557 = c17642;
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC15440 mo23559() {
        return new C14092(this.f33834.getAbsoluteFile(), this.f33833, this.f42557);
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo23544() {
        return this.f33834.getAbsolutePath();
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo23552() {
        if (!super.mo23552()) {
            return false;
        }
        this.f42557 = null;
        return true;
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo27929() {
        if (!super.mo27929()) {
            return false;
        }
        this.f42557 = null;
        return true;
    }

    @Override // l.C11293, l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23551(AbstractC15440 abstractC15440) {
        if (!super.mo23551(abstractC15440)) {
            return false;
        }
        this.f42557 = null;
        return true;
    }

    @Override // l.C11293
    /* JADX INFO: renamed from: ۬ۧ */
    public final void mo27930() {
        this.f42557 = null;
    }

    @Override // l.C11293
    /* JADX INFO: renamed from: ۤۧ */
    public final C17642 mo27927() {
        C17642 c17642 = this.f42557;
        if (c17642 != null) {
            return c17642;
        }
        C17642 c17642Mo27927 = super.mo27927();
        this.f42557 = c17642Mo27927;
        return c17642Mo27927;
    }

    @Override // l.C11293
    /* JADX INFO: renamed from: ᩺ۧ */
    public final boolean mo27938() {
        return this.f42557 != null;
    }

    @Override // l.C11293
    /* JADX INFO: renamed from: ۛۧ */
    public final C17642 mo27920() {
        return this.f42557;
    }
}
