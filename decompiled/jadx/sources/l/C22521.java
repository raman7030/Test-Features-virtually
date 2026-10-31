package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes.dex */
public class C22521 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f72876;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f72877;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f72878;

    public C22521(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f72877 = i;
        this.f72878 = C23467.m51904(i, i2, i3);
        this.f72876 = i3;
    }

    public final int getFirst() {
        return this.f72877;
    }

    public final int getLast() {
        return this.f72878;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50495() {
        return this.f72876;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20405(this.f72877, this.f72878, this.f72876);
    }

    public boolean isEmpty() {
        int i = this.f72876;
        int i2 = this.f72878;
        int i3 = this.f72877;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22521)) {
            return false;
        }
        if (isEmpty() && ((C22521) obj).isEmpty()) {
            return true;
        }
        C22521 c22521 = (C22521) obj;
        return this.f72877 == c22521.f72877 && this.f72878 == c22521.f72878 && this.f72876 == c22521.f72876;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f72877 * 31) + this.f72878) * 31) + this.f72876;
    }

    public String toString() {
        int i = this.f72878;
        int i2 = this.f72877;
        int i3 = this.f72876;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        if (i3 > 0) {
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
