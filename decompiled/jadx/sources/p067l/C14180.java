package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14180 implements Comparator {

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f40436;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f40437;

    /* JADX INFO: renamed from: ᩹ */
    public final HashMap f40438;

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
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
        InterfaceC19370 interfaceC19371 = (InterfaceC19370) obj2;
        if (interfaceC19370 == interfaceC19371) {
            return 0;
        }
        int iCompareTo = -1000000000;
        if (!interfaceC19370.mo39148()) {
            if (!interfaceC19371.mo39148() && !interfaceC19370.mo39138()) {
                if (!interfaceC19371.mo39138()) {
                    if (this.f40437) {
                        if (interfaceC19370.isDirectory()) {
                        }
                    }
                    long time = interfaceC19370.getTime() - interfaceC19371.getTime();
                    int i = C9486.f25986;
                    if (time > 1000000000) {
                        iCompareTo = BasicLabelFormatter.BILLION;
                    } else if (time >= -1000000000) {
                        iCompareTo = (int) time;
                    }
                    if (iCompareTo == 0) {
                        String name = interfaceC19370.getName();
                        HashMap map = this.f40438;
                        iCompareTo = ((C12169) map.get(name)).compareTo((C12169) map.get(interfaceC19371.getName()));
                    }
                    return this.f40436 ? -iCompareTo : iCompareTo;
                }
            }
            return BasicLabelFormatter.BILLION;
        }
        return -1000000000;
    }

    public C14180(HashMap map, boolean z, boolean z2) {
        this.f40438 = map;
        this.f40436 = z;
        this.f40437 = z2;
    }
}
