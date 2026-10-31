package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13133 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f39280;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f39281;

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
                    boolean zIsDirectory = interfaceC17889.isDirectory();
                    HashMap map = this.f39280;
                    if (!zIsDirectory) {
                        boolean zM31851 = m31851(interfaceC17889.getName());
                        boolean zM31852 = m31851(interfaceC178810.getName());
                        if (!zM31851 || zM31852) {
                            iCompareTo = (zM31851 || !zM31852) ? ((C10312) map.get(interfaceC17889.getName())).compareTo((C10312) map.get(interfaceC178810.getName())) : BasicLabelFormatter.BILLION;
                        }
                    } else {
                        iCompareTo = ((C10312) map.get(interfaceC17889.getName())).compareTo((C10312) map.get(interfaceC178810.getName()));
                    }
                    return this.f39281 ? -iCompareTo : iCompareTo;
                }
            }
            return BasicLabelFormatter.BILLION;
        }
        return -1000000000;
    }

    public C13133(HashMap map, boolean z) {
        this.f39280 = map;
        this.f39281 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31851(String str) {
        if (str.equals("AndroidManifest.xml") || str.equals("resources.arsc")) {
            return true;
        }
        if (!str.startsWith("classes") || !str.endsWith(".dex")) {
            return false;
        }
        String strM36561 = C15472.m36561(4, 7, str);
        int length = strM36561.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strM36561.charAt(i);
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
