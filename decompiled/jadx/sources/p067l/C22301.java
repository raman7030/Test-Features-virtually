package p067l;

/* JADX INFO: renamed from: l.᩷ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75MN */
/* JADX INFO: loaded from: classes5.dex */
public final class C22301 extends C16299 {

    /* JADX INFO: renamed from: ۫ */
    public String f70436;

    public C22301(InterfaceC13638 interfaceC13638, String str, Object... objArr) {
        super(interfaceC13638);
        this.f70436 = String.format(str, objArr);
    }

    public C22301(C20995 c20995, Exception exc) {
        super(c20995);
        this.f70436 = exc.getMessage();
    }

    public C22301(InterfaceC13638 interfaceC13638, C20324 c20324, String str, Object... objArr) {
        this.f47906 = interfaceC13638;
        InterfaceC8924 interfaceC8924 = c20324.f62784;
        this.f47905 = interfaceC8924;
        this.f47904 = interfaceC8924.getLine();
        this.f47908 = this.f47905.mo12370();
        this.f70436 = String.format(str, objArr);
    }

    public C22301(C14978 c14978, InterfaceC8924 interfaceC8924, String str, Object... objArr) {
        this.f47906 = c14978;
        this.f47905 = interfaceC8924;
        ((C5591) interfaceC8924).getClass();
        this.f47904 = interfaceC8924.getLine();
        this.f47908 = interfaceC8924.mo12370();
        this.f70436 = String.format(str, objArr);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f70436;
    }
}
