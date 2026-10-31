package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes.dex */
public final class C23011 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f74083;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f74084;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r8.isDirectory() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r8.isDirectory() != false) goto L25;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        InterfaceC17889 interfaceC178810 = (InterfaceC17889) obj2;
        if (interfaceC17889 == interfaceC178810) {
            return 0;
        }
        int iCompareTo = -1000000000;
        if (!interfaceC17889.mo36982()) {
            if (!interfaceC178810.mo36982() && !interfaceC17889.mo36972()) {
                if (!interfaceC178810.mo36972()) {
                    if (interfaceC17889.isDirectory()) {
                    }
                    long size = interfaceC17889.getSize() - interfaceC178810.getSize();
                    int i = C7489.f23073;
                    if (size > 1000000000) {
                        iCompareTo = BasicLabelFormatter.BILLION;
                    } else if (size >= -1000000000) {
                        iCompareTo = (int) size;
                    }
                    if (iCompareTo == 0) {
                        String name = interfaceC17889.getName();
                        HashMap map = this.f74083;
                        iCompareTo = ((C10312) map.get(name)).compareTo((C10312) map.get(interfaceC178810.getName()));
                    }
                    return this.f74084 ? -iCompareTo : iCompareTo;
                }
            }
            return BasicLabelFormatter.BILLION;
        }
        return -1000000000;
    }

    public C23011(HashMap map, boolean z) {
        this.f74083 = map;
        this.f74084 = z;
    }
}
