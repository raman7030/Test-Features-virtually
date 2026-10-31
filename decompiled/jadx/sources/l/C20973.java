package l;

/* JADX INFO: renamed from: l.᩷ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75MN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20973 extends C14658 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f67750;

    public C20973(InterfaceC11858 interfaceC11858, String str, Object... objArr) {
        super(interfaceC11858);
        this.f67750 = String.format(str, objArr);
    }

    public C20973(C19599 c19599, Exception exc) {
        super(c19599);
        this.f67750 = exc.getMessage();
    }

    public C20973(InterfaceC11858 interfaceC11858, C18893 c18893, String str, Object... objArr) {
        this.f44796 = interfaceC11858;
        InterfaceC6898 interfaceC6898 = c18893.f59554;
        this.f44795 = interfaceC6898;
        this.f44794 = interfaceC6898.getLine();
        this.f44798 = this.f44795.mo10331();
        this.f67750 = String.format(str, objArr);
    }

    public C20973(C13268 c13268, InterfaceC6898 interfaceC6898, String str, Object... objArr) {
        this.f44796 = c13268;
        this.f44795 = interfaceC6898;
        ((C3391) interfaceC6898).getClass();
        this.f44794 = interfaceC6898.getLine();
        this.f44798 = interfaceC6898.mo10331();
        this.f67750 = String.format(str, objArr);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f67750;
    }
}
