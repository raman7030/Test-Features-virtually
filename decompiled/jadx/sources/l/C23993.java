package l;

/* JADX INFO: renamed from: l.᩻᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6VE */
/* JADX INFO: loaded from: classes.dex */
public final class C23993 extends AbstractC20466 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC20466[] f77779;

    public C23993(Object obj, AbstractC20466[] abstractC20466Arr) {
        super(abstractC20466Arr[0].f65975 + 1, obj);
        this.f77779 = abstractC20466Arr;
        m52832();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52832() {
        this.f65978 = -1L;
        long j = 0;
        long j2 = 0;
        for (AbstractC20466 abstractC20466 : this.f77779) {
            j += (long) abstractC20466.f65976;
            j2 += (long) abstractC20466.f65977;
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Text exceeds UTF-16 coordinate limit");
        }
        this.f65976 = (int) j;
        this.f65977 = (int) j2;
    }
}
