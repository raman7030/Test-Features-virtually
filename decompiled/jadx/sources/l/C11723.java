package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11723 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f34980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f34981;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        InterfaceC17889 interfaceC178810 = (InterfaceC17889) obj2;
        if (interfaceC17889 == interfaceC178810) {
            return 0;
        }
        int iMo24431 = interfaceC17889.mo24431();
        int iMo24432 = interfaceC178810.mo24431();
        if (iMo24431 != iMo24432) {
            if (iMo24431 < iMo24432) {
                return -1000000000;
            }
            return BasicLabelFormatter.BILLION;
        }
        String name = interfaceC17889.getName();
        HashMap map = this.f34980;
        int iCompareTo = ((C10312) map.get(name)).compareTo((C10312) map.get(interfaceC178810.getName()));
        return this.f34981 ? -iCompareTo : iCompareTo;
    }

    public C11723(HashMap map, boolean z) {
        this.f34980 = map;
        this.f34981 = z;
    }
}
