package p067l;

/* JADX INFO: renamed from: l.᩻᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6VE */
/* JADX INFO: loaded from: classes.dex */
public final class C25172 extends AbstractC21820 {

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC21820[] f80530;

    public C25172(Object obj, AbstractC21820[] abstractC21820Arr) {
        super(abstractC21820Arr[0].f68651 + 1, obj);
        this.f80530 = abstractC21820Arr;
        m55238();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55238() {
        this.f68654 = -1L;
        long j = 0;
        long j2 = 0;
        for (AbstractC21820 abstractC21820 : this.f80530) {
            j += (long) abstractC21820.f68652;
            j2 += (long) abstractC21820.f68653;
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
        this.f68652 = (int) j;
        this.f68653 = (int) j2;
    }
}
