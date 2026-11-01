package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes.dex */
public class C23773 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public final int f75603;

    /* JADX INFO: renamed from: ᩸ */
    public final int f75604;

    /* JADX INFO: renamed from: ᩹ */
    public final int f75605;

    public C23773(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f75604 = i;
        this.f75605 = C24671.m54306(i, i2, i3);
        this.f75603 = i3;
    }

    public final int getFirst() {
        return this.f75604;
    }

    public final int getLast() {
        return this.f75605;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52837() {
        return this.f75603;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21762(this.f75604, this.f75605, this.f75603);
    }

    public boolean isEmpty() {
        int i = this.f75603;
        int i2 = this.f75605;
        int i3 = this.f75604;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C23773)) {
            return false;
        }
        if (isEmpty() && ((C23773) obj).isEmpty()) {
            return true;
        }
        C23773 c23773 = (C23773) obj;
        return this.f75604 == c23773.f75604 && this.f75605 == c23773.f75605 && this.f75603 == c23773.f75603;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f75604 * 31) + this.f75605) * 31) + this.f75603;
    }

    public String toString() {
        int i = this.f75605;
        int i2 = this.f75604;
        int i3 = this.f75603;
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
