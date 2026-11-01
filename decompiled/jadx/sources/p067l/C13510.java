package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13510 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f37980;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f37981;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
        InterfaceC19370 interfaceC19371 = (InterfaceC19370) obj2;
        if (interfaceC19370 == interfaceC19371) {
            return 0;
        }
        int iMo26443 = interfaceC19370.mo26443();
        int iMo26444 = interfaceC19371.mo26443();
        if (iMo26443 != iMo26444) {
            if (iMo26443 < iMo26444) {
                return -1000000000;
            }
            return BasicLabelFormatter.BILLION;
        }
        String name = interfaceC19370.getName();
        HashMap map = this.f37980;
        int iCompareTo = ((C12169) map.get(name)).compareTo((C12169) map.get(interfaceC19371.getName()));
        return this.f37981 ? -iCompareTo : iCompareTo;
    }

    public C13510(HashMap map, boolean z) {
        this.f37980 = map;
        this.f37981 = z;
    }
}
