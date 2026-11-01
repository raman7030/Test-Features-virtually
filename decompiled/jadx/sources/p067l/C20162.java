package p067l;

/* JADX INFO: renamed from: l.ᩴۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20162 implements InterfaceC23987 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20833 f62410;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9729 f62411;

    @Override // p067l.InterfaceC23987
    /* JADX INFO: renamed from: ֫ */
    public final void mo23355() {
    }

    public C20162(C20833 c20833, C9729 c9729) {
        this.f62410 = c20833;
        this.f62411 = c9729;
    }

    @Override // p067l.InterfaceC23987
    public final CharSequence getText() {
        return this.f62411;
    }

    @Override // p067l.InterfaceC23987
    public final int start(int i) {
        return this.f62410.f65462[i * 2];
    }

    @Override // p067l.InterfaceC23987
    public final int end(int i) {
        return this.f62410.f65462[(i * 2) + 1];
    }

    @Override // p067l.InterfaceC23987
    public final int groupCount() {
        return this.f62410.f65461;
    }

    @Override // p067l.InterfaceC23987
    public final C13259 pattern() {
        return this.f62410.f65463;
    }

    @Override // p067l.InterfaceC23987
    public final String group(int i) {
        if (i < 0 || i > this.f62410.f65461) {
            return "";
        }
        int iStart = start(i);
        int iEnd = end(i);
        return (iStart < 0 || iEnd < 0) ? "" : this.f62411.subSequence(iStart, iEnd);
    }
}
