package p067l;

/* JADX INFO: renamed from: l.֡ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2575 extends AbstractC22732 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C3246 f4253;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2575(C3246 c3246, C14645 c14645, int i, int i2) {
        super(c14645, i, i2);
        this.f4253 = c3246;
    }

    @Override // p067l.AbstractC22732
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3880(C20168 c20168, int i) {
        return Integer.valueOf(c20168.m45635());
    }

    @Override // p067l.AbstractC22732, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int iNextIndex = nextIndex();
        C3246 c3246 = this.f4253;
        if (iNextIndex == c3246.f6327.f27554) {
            c3246.f6326 = m50881();
        }
        return (Integer) super.next();
    }
}
