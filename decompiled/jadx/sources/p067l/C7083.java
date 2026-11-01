package p067l;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2QB */
/* JADX INFO: loaded from: classes2.dex */
public final class C7083 implements Serializable {

    /* JADX INFO: renamed from: ۙ */
    public static final C7083 f18455 = new C7083(new int[0]);

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f18456 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final int[] f18457;

    /* JADX INFO: renamed from: ᩹ */
    public final int f18458;

    /* JADX INFO: renamed from: ֫ */
    public static void m16302(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        new C7083(Arrays.copyOf(iArr, iArr.length));
    }

    public C7083(int[] iArr) {
        int length = iArr.length;
        this.f18457 = iArr;
        this.f18458 = length;
    }

    public Object readResolve() {
        return this.f18458 == 0 ? f18455 : this;
    }

    public final String toString() {
        int i = this.f18458;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f18457;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        C7083 c7083;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7083) && (i2 = this.f18458) == (i = (c7083 = (C7083) obj).f18458)) {
            for (int i3 = 0; i3 < i2; i3++) {
                C6194.m14023(i3, i2);
                int i4 = this.f18457[i3];
                C6194.m14023(i3, i);
                if (i4 == c7083.f18457[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18458; i2++) {
            i = (i * 31) + this.f18457[i2];
        }
        return i;
    }

    public Object writeReplace() {
        int[] iArr = this.f18457;
        int length = iArr.length;
        int i = this.f18458;
        return i < length ? new C7083(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
