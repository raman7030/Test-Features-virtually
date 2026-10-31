package l;

/* JADX INFO: renamed from: l.֫۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes3.dex */
public final class C1826 extends AbstractC15956 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18054 f6259;

    public C1826(C18054 c18054) {
        this.f6259 = c18054;
    }

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return mo16996().listIterator(0);
    }

    @Override // l.AbstractC6079
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 mo6050() {
        return new C7490(this);
    }

    @Override // l.AbstractC15956
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18054 mo6049() {
        return this.f6259;
    }

    @Override // l.AbstractC15956, l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
