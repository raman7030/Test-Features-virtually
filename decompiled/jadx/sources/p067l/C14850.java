package p067l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14850 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f42335;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f42336;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r6.isDirectory() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r6.isDirectory() != false) goto L25;
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
                    boolean zIsDirectory = interfaceC19370.isDirectory();
                    HashMap map = this.f42335;
                    if (!zIsDirectory) {
                        boolean zM33943 = m33943(interfaceC19370.getName());
                        boolean zM33944 = m33943(interfaceC19371.getName());
                        if (!zM33943 || zM33944) {
                            iCompareTo = (zM33943 || !zM33944) ? ((C12169) map.get(interfaceC19370.getName())).compareTo((C12169) map.get(interfaceC19371.getName())) : BasicLabelFormatter.BILLION;
                        }
                    } else {
                        iCompareTo = ((C12169) map.get(interfaceC19370.getName())).compareTo((C12169) map.get(interfaceC19371.getName()));
                    }
                    return this.f42336 ? -iCompareTo : iCompareTo;
                }
            }
            return BasicLabelFormatter.BILLION;
        }
        return -1000000000;
    }

    public C14850(HashMap map, boolean z) {
        this.f42335 = map;
        this.f42336 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33943(String str) {
        if (str.equals("AndroidManifest.xml") || str.equals("resources.arsc")) {
            return true;
        }
        if (!str.startsWith("classes") || !str.endsWith(".dex")) {
            return false;
        }
        String strM38720 = C17073.m38720(4, 7, str);
        int length = strM38720.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strM38720.charAt(i);
            if (i != 0) {
                if (cCharAt < '0' || cCharAt > '9') {
                    return false;
                }
            } else if (length == 1) {
                if (cCharAt < '2' || cCharAt > '9') {
                    return false;
                }
            } else if (cCharAt < '1' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }
}
