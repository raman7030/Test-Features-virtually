package p067l;

/* JADX INFO: renamed from: l.᩵ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20911 {

    /* JADX INFO: renamed from: a */
    public final int f65668a;

    /* JADX INFO: renamed from: b */
    public int f65669b;

    /* JADX INFO: renamed from: c */
    public int f65670c;

    /* JADX INFO: renamed from: d */
    public long[] f65671d;

    public abstract void clear();

    public AbstractC20911() {
        this.f65668a = 4;
    }

    public AbstractC20911(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f65668a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final long count() {
        int i = this.f65670c;
        if (i == 0) {
            return this.f65669b;
        }
        return this.f65671d[i] + ((long) this.f65669b);
    }
}
