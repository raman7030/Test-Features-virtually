package p067l;

/* JADX INFO: renamed from: l.ܿܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19001 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f56649;

    /* JADX INFO: renamed from: ۧ */
    public String f56650;

    /* JADX INFO: renamed from: ܽ */
    public final int f56651;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC4249 f56652;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f56653;

    public C19001(InterfaceC4249 interfaceC4249, C21704 c21704) {
        this.f56652 = interfaceC4249;
        this.f56651 = C25036.m54968(c21704.f68349);
        this.f56653 = c21704.f68344;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43144(String str) {
        InterfaceC4249 interfaceC4249 = this.f56652;
        boolean z = this.f56653;
        int i = this.f56651;
        if (i == 2) {
            if (this.f56649 || !z) {
                String str2 = this.f56650;
                if (str2 != null) {
                    interfaceC4249.mo8631(str2);
                    this.f56650 = null;
                }
                interfaceC4249.mo8628();
            }
            this.f56649 = false;
            this.f56650 = str;
            return;
        }
        if (!z || this.f56649) {
            if (i == 0) {
                interfaceC4249.mo8631(str);
            }
            interfaceC4249.mo8628();
            this.f56649 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43142() {
        int i = this.f56651;
        InterfaceC4249 interfaceC4249 = this.f56652;
        boolean z = this.f56653;
        if (i == 2) {
            if (this.f56649 || !z) {
                String str = this.f56650;
                if (str != null) {
                    interfaceC4249.mo8631(str);
                    this.f56650 = null;
                }
                interfaceC4249.mo8628();
                return;
            }
            return;
        }
        if (this.f56649 || !z) {
            interfaceC4249.mo8628();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43143(char c) {
        String str = this.f56650;
        InterfaceC4249 interfaceC4249 = this.f56652;
        if (str != null) {
            interfaceC4249.mo8631(str);
            this.f56650 = null;
        }
        interfaceC4249.mo8629(c);
        this.f56649 = true;
    }
}
