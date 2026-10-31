package l;

/* JADX INFO: renamed from: l.᩻ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23667 extends AbstractC2377 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76659;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20846 f76660;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76661;

    public C23667(C20846 c20846, int i, int i2, int i3) {
        this.f76660 = c20846;
        this.f76658 = i;
        this.f76661 = i2;
        this.f76659 = i3;
    }

    @Override // l.AbstractC2377
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7047(int i) {
        return new C15905(this.f76660.f67489, (i * 8) + this.f76658, this.f76661);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f76659;
    }
}
