package p067l;

/* JADX INFO: renamed from: l.᩺ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes.dex */
public final class C23988 implements InterfaceC15012 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C21249 f76189;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean f76190;

    @Override // p067l.InterfaceC15012
    public final void afterFinish() {
    }

    @Override // p067l.InterfaceC15012
    public final void beforeStart() {
    }

    @Override // p067l.InterfaceC15012
    public final boolean onError(Exception exc) {
        return false;
    }

    @Override // p067l.InterfaceC15012
    public final void onFinish() {
    }

    @Override // p067l.InterfaceC15012
    public final void onStart() {
    }

    public C23988(C21249 c21249, boolean z) {
        this.f76189 = c21249;
        this.f76190 = z;
    }

    @Override // p067l.InterfaceC15012
    /* JADX INFO: renamed from: ֫ */
    public final String mo21278(String str) throws Throwable {
        String strM11020;
        String strM11021;
        C21249 c21249 = this.f76189;
        if (c21249 == null) {
            return "???";
        }
        c21249.m48006();
        String str2 = null;
        for (C5155 c5155 : c21249.m48005()) {
            if (this.f76190) {
                strM11020 = c5155.m11021();
                strM11021 = c5155.m11020();
            } else {
                strM11020 = c5155.m11020();
                strM11021 = c5155.m11021();
            }
            if (strM11020.equalsIgnoreCase(str)) {
                if (str2 == null) {
                    str2 = strM11021;
                }
                if (strM11020.equals(str)) {
                    return strM11021;
                }
            }
        }
        return str2 != null ? str2 : "???";
    }

    @Override // p067l.InterfaceC15012
    public final String getId() {
        boolean z = this.f76190;
        C21249 c21249 = this.f76189;
        if (c21249 == null) {
            return ":null:" + z;
        }
        return c21249.m48007() + ":" + z;
    }
}
