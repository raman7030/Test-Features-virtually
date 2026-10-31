package l;

/* JADX INFO: renamed from: l.ᩴۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18722 implements InterfaceC22747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19428 f59186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7744 f59187;

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ֫ */
    public final void mo21388() {
    }

    public C18722(C19428 c19428, C7744 c7744) {
        this.f59186 = c19428;
        this.f59187 = c7744;
    }

    @Override // l.InterfaceC22747
    public final CharSequence getText() {
        return this.f59187;
    }

    @Override // l.InterfaceC22747
    public final int start(int i) {
        return this.f59186.f62849[i * 2];
    }

    @Override // l.InterfaceC22747
    public final int end(int i) {
        return this.f59186.f62849[(i * 2) + 1];
    }

    @Override // l.InterfaceC22747
    public final int groupCount() {
        return this.f59186.f62848;
    }

    @Override // l.InterfaceC22747
    public final C11459 pattern() {
        return this.f59186.f62850;
    }

    @Override // l.InterfaceC22747
    public final String group(int i) {
        if (i < 0 || i > this.f59186.f62848) {
            return "";
        }
        int iStart = start(i);
        int iEnd = end(i);
        return (iStart < 0 || iEnd < 0) ? "" : this.f59187.subSequence(iStart, iEnd);
    }
}
