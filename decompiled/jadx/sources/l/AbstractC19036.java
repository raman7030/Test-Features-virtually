package l;

/* JADX INFO: renamed from: l.ᩴ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19036 extends AbstractC2808 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11791 f59967;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f59968;

    public AbstractC19036(InterfaceC11791 interfaceC11791, InterfaceC14801 interfaceC14801) {
        super(interfaceC11791);
        this.f59968 = interfaceC14801;
    }

    public AbstractC19036(InterfaceC11791 interfaceC11791) {
        this(interfaceC11791, interfaceC11791 != null ? interfaceC11791.getContext() : null);
    }

    @Override // l.InterfaceC11791
    public InterfaceC14801 getContext() {
        InterfaceC14801 interfaceC14801 = this.f59968;
        C11233.m27799(interfaceC14801);
        return interfaceC14801;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11791 m43887() {
        InterfaceC11791 interfaceC11791Mo9081 = this.f59967;
        if (interfaceC11791Mo9081 == null) {
            InterfaceC7557 interfaceC7557 = (InterfaceC7557) getContext().mo9082(InterfaceC7557.f23344);
            interfaceC11791Mo9081 = interfaceC7557 != null ? interfaceC7557.mo9081(this) : this;
            this.f59967 = interfaceC11791Mo9081;
        }
        return interfaceC11791Mo9081;
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ᩻ */
    public void mo8687() {
        InterfaceC11791 interfaceC11791 = this.f59967;
        if (interfaceC11791 != null && interfaceC11791 != this) {
            InterfaceC18330 interfaceC18330Mo9082 = getContext().mo9082(InterfaceC7557.f23344);
            C11233.m27799(interfaceC18330Mo9082);
            ((InterfaceC7557) interfaceC18330Mo9082).mo9083(interfaceC11791);
        }
        this.f59967 = C4219.f13692;
    }
}
