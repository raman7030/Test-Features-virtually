package l;

/* JADX INFO: renamed from: l.۫ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes4.dex */
public class C12199 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f36411 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f36412;

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        if (abstractC5144 == null || this.f36411 != null) {
            return;
        }
        abstractC5144.mo988(this);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1367(C1323 c1323) {
        if (c1323.f4746 == this.f36412) {
            this.f36411 = c1323;
        } else {
            m33860(c1323.f4738);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        if (c3587.f11377 == this.f36412) {
            this.f36411 = c3587;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1386(C7820 c7820) {
        if (c7820.f24200 == this.f36412) {
            this.f36411 = c7820;
        } else {
            super.mo1386(c7820);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        if (c5557.f17186 == this.f36412) {
            this.f36411 = c5557;
        } else {
            super.mo1215(c5557);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        if (c8526.f26045 == this.f36412) {
            this.f36411 = c8526;
        } else {
            super.mo1388(c8526);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        if (c9378.f28489 == this.f36412) {
            this.f36411 = c9378;
        } else {
            super.mo1392(c9378);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        AbstractC4308 abstractC4308 = c14315.f16086;
        if (abstractC4308 == null || abstractC4308.f13890 != this.f36412) {
            super.mo1403(c14315);
        } else {
            this.f36411 = c14315;
        }
    }

    public C12199(AbstractC5698 abstractC5698) {
        this.f36412 = abstractC5698;
    }
}
