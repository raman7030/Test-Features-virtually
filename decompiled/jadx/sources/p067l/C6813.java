package p067l;

/* JADX INFO: renamed from: l.ۙܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6813 extends AbstractC4627 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f17690;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5472 f17691;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f17692;

    public C6813(C5472 c5472, int i, int i2) {
        this.f17691 = c5472;
        this.f17692 = i;
        this.f17690 = i2;
    }

    @Override // p067l.AbstractC4627
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9142(int i) {
        C14645 c14645 = this.f17691.f13058;
        return c14645.m33487(c14645.m33504().m13856((i * 2) + this.f17692));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17690;
    }
}
