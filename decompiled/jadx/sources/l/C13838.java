package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13838 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f41279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f41280;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        InterfaceC17889 interfaceC178810 = (InterfaceC17889) obj2;
        int iCompareTo = 0;
        if (interfaceC17889 == interfaceC178810) {
            return 0;
        }
        if (interfaceC17889.mo36982()) {
            return -1000000000;
        }
        if (interfaceC178810.mo36982() || interfaceC17889.mo36972()) {
            return BasicLabelFormatter.BILLION;
        }
        if (interfaceC178810.mo36972()) {
            return -1000000000;
        }
        if (interfaceC17889.isDirectory()) {
            if (!interfaceC178810.isDirectory()) {
                return -1000000000;
            }
        } else if (interfaceC178810.isDirectory()) {
            return BasicLabelFormatter.BILLION;
        }
        if (!interfaceC17889.isDirectory()) {
            String name = interfaceC17889.getName();
            int i = C7489.f23073;
            int iLastIndexOf = name.lastIndexOf(46);
            String strSubstring = "";
            String strSubstring2 = (iLastIndexOf == -1 || iLastIndexOf == 0) ? "" : name.substring(iLastIndexOf + 1);
            String name2 = interfaceC178810.getName();
            int iLastIndexOf2 = name2.lastIndexOf(46);
            if (iLastIndexOf2 != -1 && iLastIndexOf2 != 0) {
                strSubstring = name2.substring(iLastIndexOf2 + 1);
            }
            iCompareTo = strSubstring2.compareToIgnoreCase(strSubstring);
        }
        if (iCompareTo == 0) {
            String name3 = interfaceC17889.getName();
            HashMap map = this.f41279;
            iCompareTo = ((C10312) map.get(name3)).compareTo((C10312) map.get(interfaceC178810.getName()));
        }
        return this.f41280 ? -iCompareTo : iCompareTo;
    }

    public C13838(HashMap map, boolean z) {
        this.f41279 = map;
        this.f41280 = z;
    }
}
