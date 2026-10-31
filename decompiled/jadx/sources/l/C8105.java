package l;

/* JADX INFO: renamed from: l.۠ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8105 extends C14454 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f24987;

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        m43304(new C3872(c9938));
    }

    @Override // l.C14454, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        if (this.f24987 || c14169.m33819() == EnumC13706.EXPRESSION) {
            return;
        }
        this.f24987 = true;
        try {
            super.mo1217(c14169);
        } finally {
            this.f24987 = false;
        }
    }
}
