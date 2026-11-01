package p067l;

/* JADX INFO: renamed from: l.۠۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C10158 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f28105;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C21558 f28106;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C15444 f28107;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ int f28108;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

    public C10158(C21558 c21558, int i, int i2, C15444 c15444) {
        this.f28105 = i;
        this.f28108 = i2;
        this.f28107 = c15444;
        this.f28106 = c21558;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28105;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f28105;
        C6194.m14023(i, i2);
        int i3 = this.f28108;
        C21558 c21558 = this.f28106;
        return (i == 0 || i == i2 + (-1)) ? ((C15444) c21558.f67995.get(i + i3)).m35191(this.f28107) : (C15444) c21558.f67995.get(i + i3);
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
