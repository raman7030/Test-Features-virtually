package p067l;

/* JADX INFO: renamed from: l.᩶ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21352 extends AbstractC4627 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14645 f67331;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f67332;

    public C21352(C14645 c14645, int i) {
        this.f67331 = c14645;
        this.f67332 = i;
    }

    @Override // p067l.AbstractC4627
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9142(int i) {
        C14645 c14645 = this.f67331;
        return new C3460(c14645, (i * 12) + c14645.f41822 + 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f67332;
    }
}
