package p067l;

/* JADX INFO: renamed from: l.᩻ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24861 extends AbstractC4627 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f79408;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f79409;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22180 f79410;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f79411;

    public C24861(C22180 c22180, int i, int i2, int i3) {
        this.f79410 = c22180;
        this.f79408 = i;
        this.f79411 = i2;
        this.f79409 = i3;
    }

    @Override // p067l.AbstractC4627
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9142(int i) {
        return new C17484(this.f79410.f70171, (i * 8) + this.f79408, this.f79411);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f79409;
    }
}
