package l;

/* JADX INFO: renamed from: l.᩺ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes.dex */
public final class C22748 implements InterfaceC13303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19866 f73463;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73464;

    @Override // l.InterfaceC13303
    public final void afterFinish() {
    }

    @Override // l.InterfaceC13303
    public final void beforeStart() {
    }

    @Override // l.InterfaceC13303
    public final boolean onError(Exception exc) {
        return false;
    }

    @Override // l.InterfaceC13303
    public final void onFinish() {
    }

    @Override // l.InterfaceC13303
    public final void onStart() {
    }

    public C22748(C19866 c19866, boolean z) {
        this.f73463 = c19866;
        this.f73464 = z;
    }

    @Override // l.InterfaceC13303
    /* JADX INFO: renamed from: ֫ */
    public final String mo19329(String str) throws Throwable {
        String strM8952;
        String strM8953;
        C19866 c19866 = this.f73463;
        if (c19866 == null) {
            return "???";
        }
        c19866.m45695();
        String str2 = null;
        for (C2932 c2932 : c19866.m45694()) {
            if (this.f73464) {
                strM8952 = c2932.m8953();
                strM8953 = c2932.m8952();
            } else {
                strM8952 = c2932.m8952();
                strM8953 = c2932.m8953();
            }
            if (strM8952.equalsIgnoreCase(str)) {
                if (str2 == null) {
                    str2 = strM8953;
                }
                if (strM8952.equals(str)) {
                    return strM8953;
                }
            }
        }
        return str2 != null ? str2 : "???";
    }

    @Override // l.InterfaceC13303
    public final String getId() {
        boolean z = this.f73464;
        C19866 c19866 = this.f73463;
        if (c19866 == null) {
            return ":null:" + z;
        }
        return c19866.m45696() + ":" + z;
    }
}
