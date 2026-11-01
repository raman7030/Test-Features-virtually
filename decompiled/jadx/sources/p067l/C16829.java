package p067l;

/* JADX INFO: renamed from: l.ܶۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16829 {

    /* JADX INFO: renamed from: ֫ */
    public final C2748 f49820;

    /* JADX INFO: renamed from: ۧ */
    public boolean f49821 = false;

    /* JADX INFO: renamed from: ܽ */
    public final C10125 f49822;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC24206 f49823;

    public C16829(C10125 c10125, C2748 c2748) {
        AbstractC24206 abstractC24206M42027;
        this.f49822 = c10125;
        this.f49820 = c2748;
        if (c10125.m23602(EnumC3419.CONTENT_CHECKSUM)) {
            C18487.m42025();
            abstractC24206M42027 = C18487.m42027();
        } else {
            abstractC24206M42027 = null;
        }
        this.f49823 = abstractC24206M42027;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38165(EnumC3419 enumC3419) {
        return this.f49822.m23602(enumC3419);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10125 m38169() {
        return this.f49822;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2748 m38167() {
        return this.f49820;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38164(int i, byte[] bArr) {
        this.f49823.mo21958(i, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38163() {
        return this.f49823.mo21957();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38166() {
        this.f49821 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m38168() {
        return this.f49821;
    }
}
