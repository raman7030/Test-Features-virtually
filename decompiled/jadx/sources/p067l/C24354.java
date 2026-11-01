package p067l;

/* JADX INFO: renamed from: l.᩺ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes.dex */
public final class C24354 extends AbstractC4158 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f77126;

    public C24354(int i) {
        super(0);
        this.f77126 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ֫ */
    public final void mo8429() {
        this.f77126 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ܳ */
    public final String mo8432() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f77126 && (i = this.f9175.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>') {
                this.f77126 = true;
            }
        }
        return sb.toString();
    }
}
