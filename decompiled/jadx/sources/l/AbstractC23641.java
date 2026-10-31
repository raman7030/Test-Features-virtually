package l;

/* JADX INFO: renamed from: l.᩻ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23641 extends C15173 {
    public final ConcurrentMapC10942 i;
    public C0357 j;

    public AbstractC23641(C0357[] c0357Arr, int i, int i2, ConcurrentMapC10942 concurrentMapC10942) {
        super(c0357Arr, i, 0, i2);
        this.i = concurrentMapC10942;
        a();
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final void remove() {
        C0357 c0357 = this.j;
        if (c0357 == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(c0357.b, null, null);
    }
}
