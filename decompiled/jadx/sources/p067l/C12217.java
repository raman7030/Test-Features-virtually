package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12217 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public int f34149;

    /* JADX INFO: renamed from: ۙ */
    public C14898[] f34150;

    public C12217(C5651 c5651) {
        super(c5651);
        this.f34149 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12217 m28197(C5651 c5651) {
        ArrayList arrayList = new ArrayList(this.f34150.length);
        for (C14898 c14898 : this.f34150) {
            arrayList.add(c14898.m34106(c5651));
        }
        C14898[] c14898Arr = new C14898[arrayList.size()];
        arrayList.toArray(c14898Arr);
        C12217 c12217 = new C12217(c5651);
        c12217.f34149 = 0;
        c12217.f34150 = c14898Arr;
        return (C12217) c5651.f13744.m27254(c12217);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        this.f34150 = new C14898[c12556.m28944()];
        int i = 0;
        while (true) {
            C14898[] c14898Arr = this.f34150;
            if (i >= c14898Arr.length) {
                return;
            }
            c14898Arr[i] = (C14898) c13936.m31709(EnumC16617.TYPE_ANNOTATION_ITEM, c12556.m28944());
            i++;
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return (this.f34150.length * 4) + i + 4;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        Arrays.sort(this.f34150, new C14228());
        c3838.m7531(this.f34150.length);
        for (C14898 c14898 : this.f34150) {
            c3838.m7531(c14898.f18864);
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return C1514.m34687(new StringBuilder("annotation_set_item @0x"), this.f18864);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C12217 c12217) {
        if (c12217 == null) {
            return 1;
        }
        int length = this.f34150.length - c12217.f34150.length;
        if (length == 0) {
            int i = 0;
            while (true) {
                C14898[] c14898Arr = this.f34150;
                if (i >= c14898Arr.length) {
                    break;
                }
                length = c14898Arr[i].compareTo(c12217.f34150[i]);
                if (length != 0) {
                    return length;
                }
                i++;
            }
        }
        return length;
    }

    public final int hashCode() {
        if (this.f34149 == 0) {
            this.f34149 = 0;
            for (C14898 c14898 : this.f34150) {
                this.f34149 = c14898.hashCode() + (this.f34149 * 31);
            }
        }
        return this.f34149;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C12217.class.equals(obj.getClass()) && compareTo((C12217) obj) == 0;
    }
}
