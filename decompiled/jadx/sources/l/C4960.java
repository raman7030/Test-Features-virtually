package l;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2QB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4960 implements Serializable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C4960 f15621 = new C4960(new int[0]);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15622 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f15623;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f15624;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14399(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        new C4960(Arrays.copyOf(iArr, iArr.length));
    }

    public C4960(int[] iArr) {
        int length = iArr.length;
        this.f15623 = iArr;
        this.f15624 = length;
    }

    public Object readResolve() {
        return this.f15624 == 0 ? f15621 : this;
    }

    public final String toString() {
        int i = this.f15624;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f15623;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        C4960 c4960;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4960) && (i2 = this.f15624) == (i = (c4960 = (C4960) obj).f15624)) {
            for (int i3 = 0; i3 < i2; i3++) {
                C4025.m12103(i3, i2);
                int i4 = this.f15623[i3];
                C4025.m12103(i3, i);
                if (i4 == c4960.f15623[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15624; i2++) {
            i = (i * 31) + this.f15623[i2];
        }
        return i;
    }

    public Object writeReplace() {
        int[] iArr = this.f15623;
        int length = iArr.length;
        int i = this.f15624;
        return i < length ? new C4960(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
