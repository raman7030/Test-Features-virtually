package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12428 implements Comparator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f37419;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f37420;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f37421;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r8.isDirectory() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r8.isDirectory() != false) goto L27;
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
                    if (this.f37420) {
                        if (interfaceC17889.isDirectory()) {
                        }
                    }
                    long time = interfaceC17889.getTime() - interfaceC178810.getTime();
                    int i = C7489.f23073;
                    if (time > 1000000000) {
                        iCompareTo = BasicLabelFormatter.BILLION;
                    } else if (time >= -1000000000) {
                        iCompareTo = (int) time;
                    }
                    if (iCompareTo == 0) {
                        String name = interfaceC17889.getName();
                        HashMap map = this.f37421;
                        iCompareTo = ((C10312) map.get(name)).compareTo((C10312) map.get(interfaceC178810.getName()));
                    }
                    return this.f37419 ? -iCompareTo : iCompareTo;
                }
            }
            return BasicLabelFormatter.BILLION;
        }
        return -1000000000;
    }

    public C12428(HashMap map, boolean z, boolean z2) {
        this.f37421 = map;
        this.f37419 = z;
        this.f37420 = z2;
    }
}
