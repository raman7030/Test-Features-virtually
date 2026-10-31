package l;

/* JADX INFO: renamed from: l.۠۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C8196 extends AbstractC14545 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25194;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20191 f25195;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13758 f25196;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25197;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C8196(C20191 c20191, int i, int i2, C13758 c13758) {
        this.f25194 = i;
        this.f25197 = i2;
        this.f25196 = c13758;
        this.f25195 = c20191;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25194;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f25194;
        C4025.m12103(i, i2);
        int i3 = this.f25197;
        C20191 c20191 = this.f25195;
        return (i == 0 || i == i2 + (-1)) ? ((C13758) c20191.f65347.get(i + i3)).m33076(this.f25196) : (C13758) c20191.f65347.get(i + i3);
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
