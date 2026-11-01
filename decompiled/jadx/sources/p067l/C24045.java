package p067l;

/* JADX INFO: renamed from: l.᩺ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C24045 implements InterfaceC8780 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C0990 f76372;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f76373;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f76374;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ InterfaceC24873 f76375;

    public C24045(InterfaceC24873 interfaceC24873, boolean z, C0990 c0990, String str) {
        this.f76375 = interfaceC24873;
        this.f76374 = z;
        this.f76372 = c0990;
        this.f76373 = str;
    }

    @Override // p067l.InterfaceC8780
    /* JADX INFO: renamed from: ۧ */
    public final C13457 mo20310() {
        C18483 c18483Mo30399 = this.f76375.mo30399();
        mo20309(c18483Mo30399);
        return C10792.m24859(c18483Mo30399);
    }

    @Override // p067l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo20309(C18483 c18483) {
        if (this.f76374) {
            boolean zIsChecked = this.f76372.isChecked();
            String str = this.f76373;
            if (zIsChecked) {
                C19825.m45072(str, c18483);
                return;
            }
            C19825.m45072(str, null);
        }
        InterfaceC14770 interfaceC14770PutBoolean = ApplicationC21448.f67649.edit().putString("auto_signature_key", c18483.m42021()).mo27875(c18483.m42022().ordinal(), "auto_signature_scheme").putBoolean("kv1sd", c18483.m42019());
        if (c18483.m42020() == null) {
            interfaceC14770PutBoolean.remove("v1_signature_filename");
        } else {
            interfaceC14770PutBoolean.putString("v1_signature_filename", c18483.m42020());
        }
        interfaceC14770PutBoolean.apply();
    }

    @Override // p067l.InterfaceC8780
    /* JADX INFO: renamed from: ܳ */
    public final void mo20311() {
        C18483 c18483Mo30399 = this.f76375.mo30399();
        AbstractC14973 abstractC14973M24860 = C10792.m24860(c18483Mo30399.m42021());
        if (abstractC14973M24860 == null) {
            return;
        }
        abstractC14973M24860.mo34295();
        if (!(abstractC14973M24860 instanceof C23691) || ((C23691) abstractC14973M24860).m52703() == null) {
            mo20309(c18483Mo30399);
        }
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ֫ */
    public final C18483 mo30399() {
        return this.f76375.mo30399();
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo30401() {
        return C11463.m26458(((C13987) this.f76375).f39478);
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo30403() {
        return C11463.m26461(((C13987) this.f76375).f39478);
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ܿ */
    public final C23021 mo30402() {
        return C11463.m26460(((C13987) this.f76375).f39478);
    }

    @Override // p067l.InterfaceC24873
    /* JADX INFO: renamed from: ֫ */
    public final void mo30400(Runnable runnable) {
        ((C13987) this.f76375).mo30400(runnable);
    }
}
