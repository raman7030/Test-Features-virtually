package l;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C13563 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f40471;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f40472;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f40473;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f40474;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f40475;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11197[] f40476;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    @Deprecated
    public final Uri[] f40477;

    public C13563() {
        this(-1, -1, new int[0], new C11197[0], new long[0], new String[0]);
    }

    public C13563(int i, int i2, int[] iArr, C11197[] c11197Arr, long[] jArr, String[] strArr) {
        Uri uri;
        int i3 = 0;
        C22632.m50631(iArr.length == c11197Arr.length);
        this.f40471 = i;
        this.f40475 = i2;
        this.f40473 = iArr;
        this.f40476 = c11197Arr;
        this.f40472 = jArr;
        this.f40477 = new Uri[c11197Arr.length];
        while (true) {
            Uri[] uriArr = this.f40477;
            if (i3 < uriArr.length) {
                C11197 c11197 = c11197Arr[i3];
                if (c11197 == null) {
                    uri = null;
                } else {
                    C11881 c11881 = c11197.f33612;
                    c11881.getClass();
                    uri = c11881.f35426;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.f40474 = strArr;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32606(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f40473;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13563.class != obj.getClass()) {
            return false;
        }
        C13563 c13563 = (C13563) obj;
        return this.f40471 == c13563.f40471 && this.f40475 == c13563.f40475 && Arrays.equals(this.f40476, c13563.f40476) && Arrays.equals(this.f40473, c13563.f40473) && Arrays.equals(this.f40472, c13563.f40472) && Arrays.equals(this.f40474, c13563.f40474);
    }

    public final int hashCode() {
        int i = (int) 0;
        return (((((Arrays.hashCode(this.f40472) + ((Arrays.hashCode(this.f40473) + ((Arrays.hashCode(this.f40476) + (((((this.f40471 * 31) + this.f40475) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 961) + Arrays.hashCode(this.f40474)) * 31;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13563 m32607() {
        int[] iArr = this.f40473;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f40472;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C13563(0, this.f40475, iArrCopyOf, (C11197[]) Arrays.copyOf(this.f40476, 0), jArrCopyOf, (String[]) Arrays.copyOf(this.f40474, 0));
    }

    static {
        C5368.m15341(0, 1, 2, 3, 4);
        C5368.m15341(5, 6, 7, 8, 9);
        C3603.m11056(10);
    }
}
