package p067l;

/* JADX INFO: renamed from: l.᩵ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBF1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21007 {

    /* JADX INFO: renamed from: ֫ */
    public final C16981[] f65946;

    /* JADX INFO: renamed from: ۧ */
    public final C16981[] f65947;

    /* JADX INFO: renamed from: ܽ */
    public final C16981[] f65948;

    public C21007(C14735 c14735) {
        int iM40215 = c14735.m33676().m40215();
        this.f65948 = new C16981[iM40215];
        this.f65947 = new C16981[iM40215];
        this.f65946 = new C16981[iM40215];
        C18759 c18759M33676 = c14735.m33676();
        int size = c18759M33676.size();
        for (int i = 0; i < size; i++) {
            C18088 c18088M56522get = c18759M33676.m56522get(i);
            int iMo4636 = c18088M56522get.mo4636();
            this.f65948[iMo4636] = new C16981(c18088M56522get.m41142().m56521get(0).m39652(), false);
            C12054 c12054M39652 = c18088M56522get.m41141().m39652();
            this.f65947[iMo4636] = new C16981(c12054M39652, false);
            this.f65946[iMo4636] = new C16981(c12054M39652, false);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16981 m47350(C18088 c18088) {
        return this.f65948[c18088.mo4636()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16981 m47347(int i) {
        return this.f65948[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16981 m47349(C18088 c18088) {
        return this.f65947[c18088.mo4636()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16981 m47348(C18088 c18088) {
        return this.f65946[c18088.mo4636()];
    }
}
