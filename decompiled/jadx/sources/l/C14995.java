package l;

/* JADX INFO: renamed from: l.ܶۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14995 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f45744;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45745;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f45746;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f45747;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12838 f45748;

    public C14995(C12838 c12838) {
        this.f45748 = c12838;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35523(int i) {
        this.f45745 |= i > 0;
        this.f45746 += i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35524(C12838 c12838) {
        this.f45745 |= this.f45748 != c12838;
        this.f45748 = c12838;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35525(int i) {
        if (this.f45747 && this.f45744 != 5) {
            C22632.m50631(i == 5);
            return;
        }
        this.f45745 = true;
        this.f45747 = true;
        this.f45744 = i;
    }
}
