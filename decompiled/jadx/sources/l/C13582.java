package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13582 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22755[] f40520;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40521;

    public C13582(C3454 c3454) {
        super(c3454);
        this.f40521 = 0;
    }

    public C13582(C3454 c3454, C22755[] c22755Arr) {
        super(c3454);
        this.f40521 = 0;
        this.f40520 = c22755Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13582 m32663(C3454 c3454, ArrayList arrayList) {
        C22755[] c22755Arr = new C22755[arrayList.size()];
        arrayList.toArray(c22755Arr);
        return (C13582) c3454.f10933.m25237(new C13582(c3454, c22755Arr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13582 m32666(C3454 c3454) {
        C22755[] c22755Arr;
        C22755[] c22755Arr2 = this.f40520;
        if (c22755Arr2 != null) {
            c22755Arr = new C22755[c22755Arr2.length];
            int i = 0;
            while (true) {
                C22755[] c22755Arr3 = this.f40520;
                if (i >= c22755Arr3.length) {
                    break;
                }
                c22755Arr[i] = C22755.m50831(c22755Arr3[i].m50835(), c3454);
                i++;
            }
        } else {
            c22755Arr = null;
        }
        return (C13582) c3454.f10933.m25237(new C13582(c3454, c22755Arr));
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        int iM26904 = c10720.m26904();
        this.f40520 = new C22755[iM26904];
        for (int i = 0; i < iM26904; i++) {
            this.f40520[i] = (C22755) this.f16031.f10926.m1314(c10720.m26907());
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return (this.f40520.length * 2) + i + 4;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5302(this.f40520.length);
        for (C22755 c22755 : this.f40520) {
            c1547.m5304(c22755.f16032);
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "type_list: " + m32665("");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C13582 c13582) {
        if (c13582 == null) {
            return 1;
        }
        int length = this.f40520.length;
        int length2 = c13582.f40520.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = this.f40520[i].compareTo(c13582.f40520[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32665(String str) {
        int length = 0;
        for (C22755 c22755 : this.f40520) {
            length = str.length() + c22755.m50835().length() + length;
        }
        StringBuilder sb = new StringBuilder(length);
        for (C22755 c22756 : this.f40520) {
            sb.append(c22756.m50835());
            sb.append(str);
        }
        if (this.f40520.length > 0) {
            sb.delete(sb.length() - str.length(), sb.length());
        }
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f40521 == 0) {
            int iHashCode = 1;
            for (C22755 c22755 : this.f40520) {
                iHashCode = (iHashCode * 31) + c22755.hashCode();
            }
            this.f40521 = iHashCode;
        }
        return this.f40521;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C13582.class.equals(obj.getClass())) {
            return false;
        }
        C13582 c13582 = (C13582) obj;
        if (this.f40520.length != c13582.f40520.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C22755[] c22755Arr = this.f40520;
            if (i >= c22755Arr.length) {
                return true;
            }
            if (c22755Arr[i] != c13582.f40520[i]) {
                return false;
            }
            i++;
        }
    }
}
