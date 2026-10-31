package l;

/* JADX INFO: renamed from: l.ᩴܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F62O */
/* JADX INFO: loaded from: classes5.dex */
public class C18893 extends AbstractC2665 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6898 f59554;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18893 f59555;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f59557 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f59556 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59553 = -1;

    public C18893() {
    }

    public C18893(InterfaceC6898 interfaceC6898) {
        this.f59554 = interfaceC6898;
    }

    @Override // l.InterfaceC22420
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18893 mo43622() {
        C18893 c18893 = new C18893();
        c18893.f59557 = -1;
        c18893.f59556 = -1;
        c18893.f59553 = -1;
        c18893.f59554 = this.f59554;
        c18893.f59557 = this.f59557;
        c18893.f59556 = this.f59556;
        return c18893;
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo8355() {
        return this.f59554 == null;
    }

    @Override // l.InterfaceC22420
    public int getType() {
        InterfaceC6898 interfaceC6898 = this.f59554;
        if (interfaceC6898 == null) {
            return 0;
        }
        return interfaceC6898.getType();
    }

    @Override // l.InterfaceC22420
    public String getText() {
        InterfaceC6898 interfaceC6898 = this.f59554;
        if (interfaceC6898 == null) {
            return null;
        }
        return interfaceC6898.getText();
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    public final int getLine() {
        InterfaceC6898 interfaceC6898 = this.f59554;
        if (interfaceC6898 == null || interfaceC6898.getLine() == 0) {
            if (getChildCount() > 0) {
                return mo8350(0).getLine();
            }
            return 0;
        }
        return interfaceC6898.getLine();
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    /* JADX INFO: renamed from: ֫ */
    public final int mo8349() {
        InterfaceC6898 interfaceC6898 = this.f59554;
        if (interfaceC6898 == null || interfaceC6898.mo10331() == -1) {
            if (getChildCount() > 0) {
                return mo8350(0).mo8349();
            }
            return 0;
        }
        return interfaceC6898.mo10331();
    }

    @Override // l.InterfaceC22420
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo43619() {
        InterfaceC6898 interfaceC6898;
        int i = this.f59557;
        return (i != -1 || (interfaceC6898 = this.f59554) == null) ? i : interfaceC6898.mo10336();
    }

    @Override // l.InterfaceC22420
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo43621(int i) {
        this.f59557 = i;
    }

    @Override // l.InterfaceC22420
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo43620() {
        InterfaceC6898 interfaceC6898;
        int i = this.f59556;
        return (i != -1 || (interfaceC6898 = this.f59554) == null) ? i : interfaceC6898.mo10336();
    }

    @Override // l.InterfaceC22420
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo43618(int i) {
        this.f59556 = i;
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    /* JADX INFO: renamed from: ۧ */
    public final int mo8352() {
        return this.f59553;
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    public final InterfaceC22420 getParent() {
        return this.f59555;
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    /* JADX INFO: renamed from: ۧ */
    public final void mo8353(InterfaceC22420 interfaceC22420) {
        this.f59555 = (C18893) interfaceC22420;
    }

    @Override // l.AbstractC2665, l.InterfaceC22420
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8354(int i) {
        this.f59553 = i;
    }

    public String toString() {
        if (mo8355()) {
            return "nil";
        }
        if (getType() == 0) {
            return "<errornode>";
        }
        InterfaceC6898 interfaceC6898 = this.f59554;
        if (interfaceC6898 == null) {
            return null;
        }
        return interfaceC6898.getText();
    }
}
