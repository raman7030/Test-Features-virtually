package l;

/* JADX INFO: renamed from: l.᩺ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes.dex */
public final class C23133 extends AbstractC1883 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f74380;

    public C23133(int i) {
        super(0);
        this.f74380 = false;
    }

    @Override // l.AbstractC1883
    /* JADX INFO: renamed from: ֫ */
    public final void mo6227() {
        this.f74380 = false;
    }

    @Override // l.AbstractC1883
    /* JADX INFO: renamed from: ܳ */
    public final String mo6230() {
        int i;
        StringBuilder sb = new StringBuilder();
        while (!this.f74380 && (i = this.f6393.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '>') {
                this.f74380 = true;
            }
        }
        return sb.toString();
    }
}
