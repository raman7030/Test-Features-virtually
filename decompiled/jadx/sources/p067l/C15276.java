package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15276 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C23994[] f43597;

    /* JADX INFO: renamed from: ۙ */
    public int f43598;

    public C15276(C5651 c5651) {
        super(c5651);
        this.f43598 = 0;
    }

    public C15276(C5651 c5651, C23994[] c23994Arr) {
        super(c5651);
        this.f43598 = 0;
        this.f43597 = c23994Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15276 m34775(C5651 c5651, ArrayList arrayList) {
        C23994[] c23994Arr = new C23994[arrayList.size()];
        arrayList.toArray(c23994Arr);
        return (C15276) c5651.f13734.m27254(new C15276(c5651, c23994Arr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15276 m34778(C5651 c5651) {
        C23994[] c23994Arr;
        C23994[] c23994Arr2 = this.f43597;
        if (c23994Arr2 != null) {
            c23994Arr = new C23994[c23994Arr2.length];
            int i = 0;
            while (true) {
                C23994[] c23994Arr3 = this.f43597;
                if (i >= c23994Arr3.length) {
                    break;
                }
                c23994Arr[i] = C23994.m53164(c23994Arr3[i].m53168(), c5651);
                i++;
            }
        } else {
            c23994Arr = null;
        }
        return (C15276) c5651.f13734.m27254(new C15276(c5651, c23994Arr));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        int iM28944 = c12556.m28944();
        this.f43597 = new C23994[iM28944];
        for (int i = 0; i < iM28944; i++) {
            this.f43597[i] = (C23994) this.f18865.f13727.m3722(c12556.m28947());
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return (this.f43597.length * 2) + i + 4;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7531(this.f43597.length);
        for (C23994 c23994 : this.f43597) {
            c3838.m7533(c23994.f18866);
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "type_list: " + m34777("");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C15276 c15276) {
        if (c15276 == null) {
            return 1;
        }
        int length = this.f43597.length;
        int length2 = c15276.f43597.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = this.f43597[i].compareTo(c15276.f43597[i]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34777(String str) {
        int length = 0;
        for (C23994 c23994 : this.f43597) {
            length = str.length() + c23994.m53168().length() + length;
        }
        StringBuilder sb = new StringBuilder(length);
        for (C23994 c23995 : this.f43597) {
            sb.append(c23995.m53168());
            sb.append(str);
        }
        if (this.f43597.length > 0) {
            sb.delete(sb.length() - str.length(), sb.length());
        }
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f43598 == 0) {
            int iHashCode = 1;
            for (C23994 c23994 : this.f43597) {
                iHashCode = (iHashCode * 31) + c23994.hashCode();
            }
            this.f43598 = iHashCode;
        }
        return this.f43598;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C15276.class.equals(obj.getClass())) {
            return false;
        }
        C15276 c15276 = (C15276) obj;
        if (this.f43597.length != c15276.f43597.length) {
            return false;
        }
        int i = 0;
        while (true) {
            C23994[] c23994Arr = this.f43597;
            if (i >= c23994Arr.length) {
                return true;
            }
            if (c23994Arr[i] != c15276.f43597[i]) {
                return false;
            }
            i++;
        }
    }
}
