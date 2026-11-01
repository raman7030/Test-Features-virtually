package p067l;

/* JADX INFO: renamed from: l.ۨܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13626 extends AbstractC4158 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f38350;

    public C13626(int i) {
        super(0);
        this.f38350 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ֫ */
    public final void mo8429() {
        this.f38350 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ܳ */
    public final String mo8432() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f38350 && (i = this.f9175.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>' && sb.toString().endsWith("-->")) {
                this.f38350 = true;
            }
        }
        return sb.toString();
    }
}
