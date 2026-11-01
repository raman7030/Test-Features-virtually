package p067l;

/* JADX INFO: renamed from: l.۠ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10167 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5473 f28128;

    public final String toString() {
        return "mainCompleter";
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo9173() {
        return false;
    }

    public C10167(C5473 c5473) {
        this.f28128 = c5473;
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        C5473 c5473 = this.f28128;
        C2417 c2417 = (C2417) abstractC7783;
        c5473.f13089.m19109(c2417);
        if (c2417.f20405 == EnumC3600.f7353) {
            c2417.f3696 = C4848.m10283();
            c2417.f3697 = C4848.m10283();
            c2417.f3701 = C4848.m10283();
            c2417.f3705 = C4848.m10283();
            c2417.f3693 = C4848.m10283();
        } else if ((c2417.f20409 & 4503599627370496L) != 0) {
            C5473.m12086(c5473, c2417);
        } else {
            try {
                c2417.f3687.mo18020();
            } catch (C21865 e) {
                c2417.f20405 = EnumC3600.f7353;
                c2417.f3696 = C4848.m10283();
                c2417.f3697 = C4848.m10283();
                c2417.f3701 = C4848.m10283();
                c2417.f3705 = C4848.m10283();
                c2417.f3693 = C4848.m10283();
                c5473.m12081(c2417);
                throw e;
            }
        }
        InterfaceC19740 interfaceC19740 = c2417.f3687.f45854;
        if (interfaceC19740 == null || interfaceC19740.mo23287() == EnumC18398.CLASS) {
            c5473.m12081(c2417);
        }
    }
}
