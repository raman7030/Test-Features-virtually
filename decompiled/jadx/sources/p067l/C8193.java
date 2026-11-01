package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R5FO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8193 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public int f21624;

    /* JADX INFO: renamed from: ۙ */
    public C12217[] f21625;

    public C8193(C5651 c5651) {
        super(c5651);
        this.f21624 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8193 m18980(C5651 c5651) {
        ArrayList arrayList = new ArrayList(this.f21625.length);
        for (C12217 c12217 : this.f21625) {
            if (c12217 != null) {
                arrayList.add(c12217.m28197(c5651));
            }
        }
        C12217[] c12217Arr = new C12217[arrayList.size()];
        arrayList.toArray(c12217Arr);
        C8193 c8193 = new C8193(c5651);
        c8193.f21624 = 0;
        c8193.f21625 = c12217Arr;
        return (C8193) c5651.f13739.m27254(c8193);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        this.f21625 = new C12217[c12556.m28944()];
        int i = 0;
        while (true) {
            C12217[] c12217Arr = this.f21625;
            if (i >= c12217Arr.length) {
                return;
            }
            c12217Arr[i] = (C12217) c13936.m31713(EnumC16617.TYPE_ANNOTATION_SET_ITEM, c12556.m28944());
            i++;
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return (this.f21625.length * 4) + i + 4;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7531(this.f21625.length);
        for (C12217 c12217 : this.f21625) {
            c3838.m7531(c12217.f18864);
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return C1514.m34687(new StringBuilder("annotation_set_item @0x"), this.f18864);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C8193 c8193) {
        int length = this.f21625.length - c8193.f21625.length;
        if (length != 0) {
            return length;
        }
        int i = 0;
        while (true) {
            C12217[] c12217Arr = this.f21625;
            if (i >= c12217Arr.length) {
                return length;
            }
            length = c12217Arr[i].compareTo(c8193.f21625[i]);
            if (length != 0) {
                return length;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f21624 == 0) {
            this.f21624 = 0;
            for (C12217 c12217 : this.f21625) {
                this.f21624 = c12217.hashCode() + (this.f21624 * 31);
            }
        }
        return this.f21624;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8193.class.equals(obj.getClass()) && compareTo((C8193) obj) == 0;
    }
}
