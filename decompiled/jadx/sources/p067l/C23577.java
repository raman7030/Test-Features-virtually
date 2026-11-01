package p067l;

/* JADX INFO: renamed from: l.᩹ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes.dex */
public final class C23577 extends AbstractC4627 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f75060;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21566 f75061;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f75062;

    public C23577(C21566 c21566, int i, int i2) {
        this.f75061 = c21566;
        this.f75062 = i;
        this.f75060 = i2;
    }

    @Override // p067l.AbstractC4627
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9142(int i) {
        C14645 c14645 = this.f75061.f68005;
        return c14645.m33487(c14645.m33504().m13856((i * 2) + this.f75062));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f75060;
    }
}
