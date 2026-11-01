package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BES */
/* JADX INFO: loaded from: classes4.dex */
public final class C21677 {

    /* JADX INFO: renamed from: ֫ */
    public C10277 f68285;

    /* JADX INFO: renamed from: ۧ */
    public C5583 f68286;

    /* JADX INFO: renamed from: ܳ */
    public C24949 f68287;

    /* JADX INFO: renamed from: ܽ */
    public C4162 f68288;

    /* JADX INFO: renamed from: ܿ */
    public C20927 f68289;

    /* JADX INFO: renamed from: ᩳ */
    public C22268 f68290;

    public C21677(C24949 c24949, C20927 c20927) {
        if (c24949 == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        this.f68287 = c24949;
        this.f68289 = c20927;
        this.f68285 = null;
        this.f68290 = null;
        this.f68288 = null;
        this.f68286 = null;
    }

    /* JADX INFO: renamed from: ۢ */
    private void m48919() {
        if (this.f68286 != null) {
            return;
        }
        C5583 c5583M54824 = this.f68287.m54824();
        this.f68286 = c5583M54824;
        this.f68290 = C22268.m50090(c5583M54824);
        C5583 c5583 = this.f68286;
        C4162 c4162 = C4162.f9179;
        int size = c5583.size();
        C9606 c9606 = new C9606(size);
        for (int i = 0; i < size; i++) {
            AbstractC6924 abstractC6924M56513get = c5583.m56513get(i);
            if (abstractC6924M56513get instanceof C12880) {
                c9606.m22388(abstractC6924M56513get.m15870(), ((C12880) abstractC6924M56513get).m29508());
            } else if (abstractC6924M56513get instanceof C18243) {
                c9606.m22389(abstractC6924M56513get.m15870(), ((C18243) abstractC6924M56513get).m41505());
            }
        }
        this.f68288 = c9606.m22387();
        this.f68285 = this.f68289.m47228();
        this.f68287 = null;
        this.f68289 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48921(InterfaceC23688 interfaceC23688) {
        this.f68287.m54828(interfaceC23688);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m48928() {
        return this.f68287.m54832();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m48922() {
        return this.f68287.m54830();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m48929() {
        return this.f68289.m47230();
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashSet m48920() {
        return this.f68289.m47229();
    }

    /* JADX INFO: renamed from: ܽ */
    public final HashSet m48925() {
        return this.f68287.m54829();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C5583 m48927() {
        m48919();
        return this.f68286;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10277 m48923() {
        m48919();
        return this.f68285;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C22268 m48924() {
        m48919();
        return this.f68290;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4162 m48926() {
        m48919();
        return this.f68288;
    }
}
