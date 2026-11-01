package p067l;

/* JADX INFO: renamed from: l.ܿ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0907 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19042 {

    /* JADX INFO: renamed from: ֫ */
    public int f56783 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final StringBuilder f56784 = new StringBuilder();

    /* JADX INFO: renamed from: ֫ */
    public final void m43269(CharSequence charSequence) {
        int i = this.f56783;
        StringBuilder sb = this.f56784;
        if (i != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        this.f56783++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43268() {
        return this.f56784.toString();
    }
}
