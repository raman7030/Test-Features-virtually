package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R5FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6129 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f18766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10363[] f18767;

    public C6129(C3454 c3454) {
        super(c3454);
        this.f18766 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6129 m17049(C3454 c3454) {
        ArrayList arrayList = new ArrayList(this.f18767.length);
        for (C10363 c10363 : this.f18767) {
            if (c10363 != null) {
                arrayList.add(c10363.m26169(c3454));
            }
        }
        C10363[] c10363Arr = new C10363[arrayList.size()];
        arrayList.toArray(c10363Arr);
        C6129 c6129 = new C6129(c3454);
        c6129.f18766 = 0;
        c6129.f18767 = c10363Arr;
        return (C6129) c3454.f10938.m25237(c6129);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        this.f18767 = new C10363[c10720.m26904()];
        int i = 0;
        while (true) {
            C10363[] c10363Arr = this.f18767;
            if (i >= c10363Arr.length) {
                return;
            }
            c10363Arr[i] = (C10363) c12172.m29651(EnumC14993.TYPE_ANNOTATION_SET_ITEM, c10720.m26904());
            i++;
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return (this.f18767.length * 4) + i + 4;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5302(this.f18767.length);
        for (C10363 c10363 : this.f18767) {
            c1547.m5302(c10363.f16030);
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return C13540.m32584(new StringBuilder("annotation_set_item @0x"), this.f16030);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C6129 c6129) {
        int length = this.f18767.length - c6129.f18767.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            C10363[] c10363Arr = this.f18767;
            if (i >= c10363Arr.length) {
                return length;
            }
            length = c10363Arr[i].compareTo(c6129.f18767[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f18766 == 0) {
            this.f18766 = 0;
            for (C10363 c10363 : this.f18767) {
                this.f18766 = c10363.hashCode() + (this.f18766 * 31);
            }
        }
        return this.f18766;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6129.class.equals(obj.getClass()) && compareTo((C6129) obj) == 0;
    }
}
