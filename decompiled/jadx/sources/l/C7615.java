package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C7615 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23560;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23558 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4546 f23559 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f23557 = null;

    public C7615(int i) {
        this.f23560 = new ArrayList(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20405(int i, int i2) {
        int[] iArr = this.f23557;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C4546 c4546 = new C4546(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    c4546.m13357(this.f23559);
                    int[] iArr3 = this.f23557;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f23559 = c4546;
                this.f23557 = iArr2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20409(int i, C4546 c4546) {
        int iM13356 = c4546.m13356();
        m20405(i, iM13356 - 1);
        for (int i2 = 0; i2 < iM13356; i2++) {
            C21480 c21480 = this.f23559.get(i2);
            C21480 c21480M48641 = c4546.get(i2);
            if (c21480M48641 != null && c21480M48641.getType() == C7573.f23417) {
                c21480M48641 = c21480M48641.m48641(C7573.f23412);
            }
            if (c21480 == null) {
                if (c21480M48641 != null) {
                    m20410(i, c21480M48641);
                }
            } else if (c21480M48641 != null) {
                if (!c21480M48641.m48647(c21480)) {
                    m20411(i, EnumC23137.END_SIMPLY, c21480);
                    m20410(i, c21480M48641);
                }
            } else {
                m20411(i, EnumC23137.END_SIMPLY, c21480);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20410(int i, C21480 c21480) {
        C21480 c21481;
        C21480 c21482;
        int iM48652 = c21480.m48652();
        if (c21480.getType() == C7573.f23417) {
            c21480 = c21480.m48641(C7573.f23412);
        }
        m20405(i, iM48652);
        C21480 c21483 = this.f23559.get(iM48652);
        if (c21480.m48647(c21483)) {
            return;
        }
        C21480 c21480M13354 = this.f23559.m13354(c21480);
        if (c21480M13354 != null) {
            m20407(i, EnumC23137.END_MOVED, c21480M13354);
        }
        int i2 = this.f23557[iM48652];
        if (c21483 != null) {
            m20406(i, EnumC23137.END_REPLACED, c21483);
        } else if (i2 >= 0) {
            ArrayList arrayList = this.f23560;
            C13964 c13964 = (C13964) arrayList.get(i2);
            if (c13964.m33415() == i) {
                if (c13964.m33418(c21480)) {
                    arrayList.set(i2, null);
                    this.f23558++;
                    this.f23559.m13358(c21480);
                    this.f23557[iM48652] = -1;
                    return;
                }
                arrayList.set(i2, c13964.m33417(EnumC23137.END_REPLACED));
            }
        }
        if (iM48652 > 0 && (c21482 = this.f23559.get(iM48652 - 1)) != null && c21482.m48643()) {
            m20407(i, EnumC23137.END_CLOBBERED_BY_NEXT, c21482);
        }
        if (c21480.m48643() && (c21481 = this.f23559.get(iM48652 + 1)) != null) {
            m20407(i, EnumC23137.END_CLOBBERED_BY_PREV, c21481);
        }
        m20406(i, EnumC23137.START, c21480);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20411(int i, EnumC23137 enumC23137, C21480 c21480) {
        int iM48652 = c21480.m48652();
        if (c21480.getType() == C7573.f23417) {
            c21480 = c21480.m48641(C7573.f23412);
        }
        m20405(i, iM48652);
        if (this.f23557[iM48652] >= 0) {
            return;
        }
        ArrayList arrayList = this.f23560;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C13964 c13964 = (C13964) arrayList.get(size);
            if (c13964 != null) {
                if (c13964.m33415() != i) {
                    m20406(i, enumC23137, c21480);
                    return;
                } else if (c13964.m33418(c21480)) {
                    break;
                }
            }
            size--;
        }
        this.f23559.m13359(c21480);
        C13964 c13965 = null;
        arrayList.set(size, null);
        this.f23558++;
        int iM48653 = c21480.m48652();
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c13965 = (C13964) arrayList.get(size);
            if (c13965 != null && c13965.m33423().m48652() == iM48653) {
                break;
            }
        }
        if (z) {
            this.f23557[iM48653] = size;
            if (c13965.m33415() == i) {
                arrayList.set(size, c13965.m33417(EnumC23137.END_SIMPLY));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20406(int i, EnumC23137 enumC23137, C21480 c21480) {
        int iM48652 = c21480.m48652();
        C13964 c13964 = new C13964(i, enumC23137, c21480);
        ArrayList arrayList = this.f23560;
        arrayList.add(c13964);
        if (enumC23137 == EnumC23137.START) {
            this.f23559.m13358(c21480);
            this.f23557[iM48652] = -1;
        } else {
            this.f23559.m13359(c21480);
            this.f23557[iM48652] = arrayList.size() - 1;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20407(int i, EnumC23137 enumC23137, C21480 c21480) {
        if (enumC23137 == EnumC23137.START) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f23557[c21480.m48652()];
        if (i2 >= 0) {
            ArrayList arrayList = this.f23560;
            C13964 c13964 = (C13964) arrayList.get(i2);
            if (c13964.m33415() == i && c13964.m33423().equals(c21480)) {
                arrayList.set(i2, c13964.m33417(enumC23137));
                this.f23559.m13359(c21480);
                return;
            }
        }
        m20411(i, enumC23137, c21480);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1887 m20408() {
        m20405(Integer.MAX_VALUE, 0);
        ArrayList<C13964> arrayList = this.f23560;
        int size = arrayList.size();
        int i = size - this.f23558;
        if (i == 0) {
            return C1887.f6397;
        }
        C13964[] c13964Arr = new C13964[i];
        if (size == i) {
            arrayList.toArray(c13964Arr);
        } else {
            int i2 = 0;
            for (C13964 c13964 : arrayList) {
                if (c13964 != null) {
                    c13964Arr[i2] = c13964;
                    i2++;
                }
            }
        }
        Arrays.sort(c13964Arr);
        C1887 c1887 = new C1887(i);
        for (int i3 = 0; i3 < i; i3++) {
            c1887.m40985(i3, c13964Arr[i3]);
        }
        c1887.mo20349();
        return c1887;
    }
}
