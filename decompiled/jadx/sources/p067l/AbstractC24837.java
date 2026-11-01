package p067l;

/* JADX INFO: renamed from: l.᩻ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24837 extends C16789 {

    /* JADX INFO: renamed from: i */
    public final ConcurrentMapC12768 f79332i;

    /* JADX INFO: renamed from: j */
    public C2708 f79333j;

    public AbstractC24837(C2708[] c2708Arr, int i, int i2, ConcurrentMapC12768 concurrentMapC12768) {
        super(c2708Arr, i, 0, i2);
        this.f79332i = concurrentMapC12768;
        m38035a();
    }

    public final boolean hasNext() {
        return this.f49473b != null;
    }

    public final boolean hasMoreElements() {
        return this.f49473b != null;
    }

    public final void remove() {
        C2708 c2708 = this.f79333j;
        if (c2708 == null) {
            throw new IllegalStateException();
        }
        this.f79333j = null;
        this.f79332i.m29319g(c2708.f4545b, null, null);
    }
}
