package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes.dex */
public final class C24238 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f76822;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f76823;

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
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
        InterfaceC19370 interfaceC19371 = (InterfaceC19370) obj2;
        if (interfaceC19370 == interfaceC19371) {
            return 0;
        }
        int iCompareTo = -1000000000;
        if (!interfaceC19370.mo39148()) {
            if (!interfaceC19371.mo39148() && !interfaceC19370.mo39138()) {
                if (!interfaceC19371.mo39138()) {
                    if (interfaceC19370.isDirectory()) {
                    }
                    long size = interfaceC19370.getSize() - interfaceC19371.getSize();
                    int i = C9486.f25986;
                    if (size > 1000000000) {
                        iCompareTo = BasicLabelFormatter.BILLION;
                    } else if (size >= -1000000000) {
                        iCompareTo = (int) size;
                    }
                    if (iCompareTo == 0) {
                        String name = interfaceC19370.getName();
                        HashMap map = this.f76822;
                        iCompareTo = ((C12169) map.get(name)).compareTo((C12169) map.get(interfaceC19371.getName()));
                    }
                    return this.f76823 ? -iCompareTo : iCompareTo;
                }
            }
            return BasicLabelFormatter.BILLION;
        }
        return -1000000000;
    }

    public C24238(HashMap map, boolean z) {
        this.f76822 = map;
        this.f76823 = z;
    }
}
