package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10363 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f31187;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13184[] f31188;

    public C10363(C3454 c3454) {
        super(c3454);
        this.f31187 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10363 m26169(C3454 c3454) {
        ArrayList arrayList = new ArrayList(this.f31188.length);
        for (C13184 c13184 : this.f31188) {
            arrayList.add(c13184.m32008(c3454));
        }
        C13184[] c13184Arr = new C13184[arrayList.size()];
        arrayList.toArray(c13184Arr);
        C10363 c10363 = new C10363(c3454);
        c10363.f31187 = 0;
        c10363.f31188 = c13184Arr;
        return (C10363) c3454.f10943.m25237(c10363);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        this.f31188 = new C13184[c10720.m26904()];
        int i = 0;
        while (true) {
            C13184[] c13184Arr = this.f31188;
            if (i >= c13184Arr.length) {
                return;
            }
            c13184Arr[i] = (C13184) c12172.m29647(EnumC14993.TYPE_ANNOTATION_ITEM, c10720.m26904());
            i++;
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return (this.f31188.length * 4) + i + 4;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        Arrays.sort(this.f31188, new C12479());
        c1547.m5302(this.f31188.length);
        for (C13184 c13184 : this.f31188) {
            c1547.m5302(c13184.f16030);
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return C13540.m32584(new StringBuilder("annotation_set_item @0x"), this.f16030);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C10363 c10363) {
        if (c10363 == null) {
            return 1;
        }
        int length = this.f31188.length - c10363.f31188.length;
        if (length == 0) {
            int i = 0;
            while (true) {
                C13184[] c13184Arr = this.f31188;
                if (i >= c13184Arr.length) {
                    break;
                }
                length = c13184Arr[i].compareTo(c10363.f31188[i]);
                if (length != 0) {
                    return length;
                }
                i++;
            }
        }
        return length;
    }

    public final int hashCode() {
        if (this.f31187 == 0) {
            this.f31187 = 0;
            for (C13184 c13184 : this.f31188) {
                this.f31187 = c13184.hashCode() + (this.f31187 * 31);
            }
        }
        return this.f31187;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C10363.class.equals(obj.getClass()) && compareTo((C10363) obj) == 0;
    }
}
