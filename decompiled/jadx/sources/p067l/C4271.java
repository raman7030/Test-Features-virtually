package p067l;

/* JADX INFO: renamed from: l.֫ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07MC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4271 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C6468 f9483 = new C6468();

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC9223 f9486 = new C13917(this);

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC9223 f9485 = new C7882(this);

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9223 f9484 = new C13247();

    /* JADX INFO: renamed from: ֫ */
    public static C4271 m8674(C5127 c5127) {
        C4271 c4271 = (C4271) c5127.m10905(f9483);
        return c4271 == null ? new C4271(c5127) : c4271;
    }

    public C4271(C5127 c5127) {
        c5127.m10908(f9483, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9223 m8675(InterfaceC9223 interfaceC9223) {
        InterfaceC9223 interfaceC9224 = this.f9484;
        if (interfaceC9223 == interfaceC9224) {
            return interfaceC9224;
        }
        interfaceC9224.mo18204();
        InterfaceC9223 interfaceC9225 = this.f9484;
        this.f9484 = interfaceC9223;
        interfaceC9223.mo18200();
        return interfaceC9225;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8678(C21865 c21865) {
        this.f9484.mo18203(c21865);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8677(C15828 c15828, InterfaceC8453 interfaceC8453) {
        this.f9484.mo18202(c15828, interfaceC8453);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8676(C15828 c15828) {
        this.f9484.mo18201(c15828);
    }
}
