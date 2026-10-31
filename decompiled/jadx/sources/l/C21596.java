package l;

/* JADX INFO: renamed from: l.᩸۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7DP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21596 extends AbstractC15244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f69346 = new StringBuilder();

    @Override // l.InterfaceC1134
    public final void flush() {
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1134 mo21691() {
        return this;
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1134 mo21692() {
        return this;
    }

    public final String toString() {
        return this.f69346.toString();
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ܽ */
    public final void mo1973(String str) {
        StringBuilder sb = this.f69346;
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1968(String str) {
        this.f69346.append(str);
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ܿ */
    public final void mo21693(String str) {
        StringBuilder sb = this.f69346;
        sb.append(str);
        sb.append(System.lineSeparator());
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21694(String str) {
        this.f69346.append(str);
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ֫ */
    public final void mo21690(Throwable th) {
        this.f69346.append(C5368.m15338(th));
    }
}
