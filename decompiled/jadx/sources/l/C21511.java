package l;

/* JADX INFO: renamed from: l.᩸ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21511 extends C5283 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2609 f69174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f69175;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f69176;

    @Override // l.C5283, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21511(C10222 c10222) {
        super(c10222);
        this.f69175 = c10222;
    }

    @Override // l.C5283, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        AbstractC4308 abstractC4308 = c14169.f16086;
        if ((abstractC4308 == null || !abstractC4308.mo12948()) && !this.f69176) {
            C2609 c2609 = this.f16515;
            C2609 c26010 = this.f16516;
            C18837 c18837 = this.f59097;
            this.f69176 = true;
            try {
                this.f59097 = new C18837();
                this.f16515 = C2609.of((Object) this.f69175.f30704.f66479);
                this.f16516 = C2609.m8239();
                mo10758(c14169.f42776);
                this.f69174 = this.f16516;
            } finally {
                this.f59097 = c18837;
                this.f16515 = c2609;
                this.f16516 = c26010;
                this.f69176 = false;
            }
        }
    }
}
