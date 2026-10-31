package l;

/* JADX INFO: renamed from: l.᩵ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04RH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19625 extends AbstractC9747 implements InterfaceC4333, InterfaceC0804 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7382 f63365;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f63366;

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ܽ */
    public final int mo8424() {
        return 9;
    }

    public C19625(int i, String str) {
        super(i);
        this.f63366 = str;
    }

    @Override // l.InterfaceC4333
    /* JADX INFO: renamed from: ۜ */
    public final String mo9896() {
        return this.f63366;
    }

    @Override // l.InterfaceC4333
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15347 mo9897() {
        C7382 c7382 = this.f63365;
        if (c7382 != null) {
            return c7382;
        }
        if (this.f63366 == null) {
            return null;
        }
        return new C18919(this);
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f63365 = c19357.m44608(this.f63366);
    }
}
