package l;

/* JADX INFO: renamed from: l.ۜᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6932 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0748 f21393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21707 f21394;

    public AbstractC6932(AbstractC10460 abstractC10460) {
        this.f21393 = abstractC10460;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC9922 mo8391() {
        return this.f21393.mo2869();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4277 mo8396() {
        return this.f21393.mo2874();
    }

    @Override // l.InterfaceC7099
    public InterfaceC0748 getType() {
        return this.f21393;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final String mo18742() {
        return this.f21394.m49025();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21707 mo18743() {
        return this.f21394;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final String mo18744() {
        return getType().getTypeName() + this.f21394.m49025();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m18745() {
        return new C23865(this);
    }

    @Override // l.InterfaceC7099
    public final String getPath() {
        return getType().getPath() + this.f21394.m49025();
    }

    public final String toString() {
        return getPath();
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC7099 interfaceC7099 = (InterfaceC7099) interfaceC8510;
        if (!C11003.equals(this.f21394, interfaceC7099.mo18743())) {
            throw new RuntimeException(getPath() + " " + interfaceC7099.getPath());
        }
        try {
            C10130 c10130 = new C10130();
            this.f21394.m49022(c10130);
            C3074 c3074 = new C3074(c10130.m25438());
            if (!C21707.m49000(c3074.m9403(0), this.f21394.m49021()).equals(this.f21394)) {
                try {
                    C10130 c10131 = new C10130();
                    this.f21394.m49022(c10131);
                    throw new RuntimeException(this.f21394.m49025() + " " + C21707.m49000(new C3074(c10131.m25438()).m9403(0), this.f21394.m49021()).m49025());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (mo2345() != interfaceC7099.mo2345()) {
                throw new RuntimeException(getPath());
            }
            if (mo2349() != interfaceC7099.mo2349()) {
                throw new RuntimeException(getPath());
            }
            for (int i = 0; i <= mo2344(); i++) {
                if (mo2347(i)) {
                    if (!interfaceC7099.mo2347(i)) {
                        throw new RuntimeException(getPath());
                    }
                    mo2346(i).mo12336(interfaceC7099.mo2346(i));
                } else if (interfaceC7099.mo2347(i)) {
                    throw new RuntimeException(getPath());
                }
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Iterable mo18746() {
        return m18745();
    }
}
