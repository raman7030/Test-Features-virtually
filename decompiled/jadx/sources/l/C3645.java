package l;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۘۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 63U1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3645 implements InterfaceC6369 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11501 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19168 f11502;

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
        return this.f11502.hashCode();
    }

    public final String toString() {
        return this.f11502.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3645)) {
            return false;
        }
        C3645 c3645 = (C3645) obj;
        InterfaceC19168 interfaceC19168 = this.f11502;
        if (interfaceC19168 == null) {
            return c3645.f11502 == null;
        }
        return interfaceC19168.equals(c3645.f11502);
    }
}
