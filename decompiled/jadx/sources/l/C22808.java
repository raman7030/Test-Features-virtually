package l;

/* JADX INFO: renamed from: l.᩺ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C22808 implements InterfaceC6746 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f73642;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73644;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23679 f73645;

    public C22808(InterfaceC23679 interfaceC23679, boolean z, C2978 c2978, String str) {
        this.f73645 = interfaceC23679;
        this.f73644 = z;
        this.f73642 = c2978;
        this.f73643 = str;
    }

    @Override // l.InterfaceC6746
    /* JADX INFO: renamed from: ۧ */
    public final C11667 mo18362() {
        C16955 c16955Mo28353 = this.f73645.mo28353();
        mo18361(c16955Mo28353);
        return C8863.m22888(c16955Mo28353);
    }

    @Override // l.InterfaceC6746
    /* JADX INFO: renamed from: ֫ */
    public final void mo18361(C16955 c16955) {
        if (this.f73644) {
            boolean zIsChecked = this.f73642.isChecked();
            String str = this.f73643;
            if (zIsChecked) {
                C18367.m42800(str, c16955);
                return;
            }
            C18367.m42800(str, null);
        }
        InterfaceC13049 interfaceC13049PutBoolean = ApplicationC20075.f65008.edit().putString("auto_signature_key", c16955.m39780()).mo25853(c16955.m39781().ordinal(), "auto_signature_scheme").putBoolean("kv1sd", c16955.m39778());
        if (c16955.m39779() == null) {
            interfaceC13049PutBoolean.remove("v1_signature_filename");
        } else {
            interfaceC13049PutBoolean.putString("v1_signature_filename", c16955.m39779());
        }
        interfaceC13049PutBoolean.apply();
    }

    @Override // l.InterfaceC6746
    /* JADX INFO: renamed from: ܳ */
    public final void mo18363() {
        C16955 c16955Mo28353 = this.f73645.mo28353();
        AbstractC13262 abstractC13262M22889 = C8863.m22889(c16955Mo28353.m39780());
        if (abstractC13262M22889 == null) {
            return;
        }
        abstractC13262M22889.mo32196();
        if (!(abstractC13262M22889 instanceof C22435) || ((C22435) abstractC13262M22889).m50362() == null) {
            mo18361(c16955Mo28353);
        }
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ֫ */
    public final C16955 mo28353() {
        return this.f73645.mo28353();
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo28355() {
        return C9569.m24446(((C12225) this.f73645).f36464);
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo28357() {
        return C9569.m24449(((C12225) this.f73645).f36464);
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ܿ */
    public final C21730 mo28356() {
        return C9569.m24448(((C12225) this.f73645).f36464);
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ֫ */
    public final void mo28354(Runnable runnable) {
        ((C12225) this.f73645).mo28354(runnable);
    }
}
