package l;

/* JADX INFO: renamed from: l.ۗ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3539 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f11234;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f11235;

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo10758(AbstractC5144 abstractC5144) {
        if (abstractC5144 == null || this.f11235 == null) {
            return;
        }
        abstractC5144.mo988(this);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        if (C7260.m19472(c9791.f29619) == this.f11235) {
            this.f11234 = true;
        } else {
            super.mo1393(c9791);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        if (C7260.m19472(c6555.f20226) != this.f11235) {
            mo10758(c6555.f20226);
        } else {
            this.f11234 = true;
        }
    }
}
