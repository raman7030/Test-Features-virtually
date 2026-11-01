package p067l;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C15258 {

    /* JADX INFO: renamed from: ֫ */
    public final int f43549;

    /* JADX INFO: renamed from: ۧ */
    public final long[] f43550;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f43551;

    /* JADX INFO: renamed from: ܽ */
    public final String[] f43552;

    /* JADX INFO: renamed from: ܿ */
    public final int f43553;

    /* JADX INFO: renamed from: ᩳ */
    public final C13010[] f43554;

    /* JADX INFO: renamed from: ᩻ */
    @Deprecated
    public final Uri[] f43555;

    public C15258() {
        this(-1, -1, new int[0], new C13010[0], new long[0], new String[0]);
    }

    public C15258(int i, int i2, int[] iArr, C13010[] c13010Arr, long[] jArr, String[] strArr) {
        Uri uri;
        int i3 = 0;
        C23877.m52957(iArr.length == c13010Arr.length);
        this.f43549 = i;
        this.f43553 = i2;
        this.f43551 = iArr;
        this.f43554 = c13010Arr;
        this.f43550 = jArr;
        this.f43555 = new Uri[c13010Arr.length];
        while (true) {
            Uri[] uriArr = this.f43555;
            if (i3 < uriArr.length) {
                C13010 c13010 = c13010Arr[i3];
                if (c13010 == null) {
                    uri = null;
                } else {
                    C13660 c13660 = c13010.f36611;
                    c13660.getClass();
                    uri = c13660.f38436;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                this.f43552 = strArr;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34717(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f43551;
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
        if (obj == null || C15258.class != obj.getClass()) {
            return false;
        }
        C15258 c15258 = (C15258) obj;
        return this.f43549 == c15258.f43549 && this.f43553 == c15258.f43553 && Arrays.equals(this.f43554, c15258.f43554) && Arrays.equals(this.f43551, c15258.f43551) && Arrays.equals(this.f43550, c15258.f43550) && Arrays.equals(this.f43552, c15258.f43552);
    }

    public final int hashCode() {
        int i = (int) 0;
        return (((((Arrays.hashCode(this.f43550) + ((Arrays.hashCode(this.f43551) + ((Arrays.hashCode(this.f43554) + (((((this.f43549 * 31) + this.f43553) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 961) + Arrays.hashCode(this.f43552)) * 31;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15258 m34718() {
        int[] iArr = this.f43551;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f43550;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C15258(0, this.f43553, iArrCopyOf, (C13010[]) Arrays.copyOf(this.f43554, 0), jArrCopyOf, (String[]) Arrays.copyOf(this.f43552, 0));
    }

    static {
        C7470.m17250(0, 1, 2, 3, 4);
        C7470.m17250(5, 6, 7, 8, 9);
        C5792.m13032(10);
    }
}
