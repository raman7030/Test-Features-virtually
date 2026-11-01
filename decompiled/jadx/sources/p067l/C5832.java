package p067l;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۘۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 63U1 */
/* JADX INFO: loaded from: classes3.dex */
public class C5832 implements InterfaceC8422 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f14307 = 0;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20585 f14308;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final int hashCode() {
        return this.f14308.hashCode();
    }

    public final String toString() {
        return this.f14308.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5832)) {
            return false;
        }
        C5832 c5832 = (C5832) obj;
        InterfaceC20585 interfaceC20585 = this.f14308;
        if (interfaceC20585 == null) {
            return c5832.f14308 == null;
        }
        return interfaceC20585.equals(c5832.f14308);
    }
}
