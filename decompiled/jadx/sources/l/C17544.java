package l;

/* JADX INFO: renamed from: l.ܿ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0907 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17544 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53593 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53594 = new StringBuilder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41024(CharSequence charSequence) {
        int i = this.f53593;
        StringBuilder sb = this.f53594;
        if (i != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        this.f53593++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41023() {
        return this.f53594.toString();
    }
}
