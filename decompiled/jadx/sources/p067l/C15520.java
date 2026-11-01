package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C15520 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f44358;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f44359;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
        InterfaceC19370 interfaceC19371 = (InterfaceC19370) obj2;
        int iCompareTo = 0;
        if (interfaceC19370 == interfaceC19371) {
            return 0;
        }
        if (interfaceC19370.mo39148()) {
            return -1000000000;
        }
        if (interfaceC19371.mo39148() || interfaceC19370.mo39138()) {
            return BasicLabelFormatter.BILLION;
        }
        if (interfaceC19371.mo39138()) {
            return -1000000000;
        }
        if (interfaceC19370.isDirectory()) {
            if (!interfaceC19371.isDirectory()) {
                return -1000000000;
            }
        } else if (interfaceC19371.isDirectory()) {
            return BasicLabelFormatter.BILLION;
        }
        if (!interfaceC19370.isDirectory()) {
            String name = interfaceC19370.getName();
            int i = C9486.f25986;
            int iLastIndexOf = name.lastIndexOf(46);
            String strSubstring = "";
            String strSubstring2 = (iLastIndexOf == -1 || iLastIndexOf == 0) ? "" : name.substring(iLastIndexOf + 1);
            String name2 = interfaceC19371.getName();
            int iLastIndexOf2 = name2.lastIndexOf(46);
            if (iLastIndexOf2 != -1 && iLastIndexOf2 != 0) {
                strSubstring = name2.substring(iLastIndexOf2 + 1);
            }
            iCompareTo = strSubstring2.compareToIgnoreCase(strSubstring);
        }
        if (iCompareTo == 0) {
            String name3 = interfaceC19370.getName();
            HashMap map = this.f44358;
            iCompareTo = ((C12169) map.get(name3)).compareTo((C12169) map.get(interfaceC19371.getName()));
        }
        return this.f44359 ? -iCompareTo : iCompareTo;
    }

    public C15520(HashMap map, boolean z) {
        this.f44358 = map;
        this.f44359 = z;
    }
}
