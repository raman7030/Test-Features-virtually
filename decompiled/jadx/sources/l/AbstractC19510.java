package l;

/* JADX INFO: renamed from: l.᩵ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19510 {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public abstract void clear();

    public AbstractC19510() {
        this.a = 4;
    }

    public AbstractC19510(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final long count() {
        int i = this.c;
        if (i == 0) {
            return this.b;
        }
        return this.d[i] + ((long) this.b);
    }
}
