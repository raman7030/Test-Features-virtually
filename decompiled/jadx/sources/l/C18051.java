package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18051 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f56258;

    public C18051(int i) {
        byte[] bArr = new byte[i + 1];
        this.f56258 = bArr;
        Arrays.fill(bArr, (byte) 5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42105(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) it.next();
            if (interfaceC0463.getType() == 44 || interfaceC0463.getType() == 40) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42107(int i) {
        return (this.f56258[i] & 1) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m42110(int i) {
        return (this.f56258[i] & 2) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m42109(int i) {
        return (this.f56258[i] & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42108(C18051 c18051, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) it.next();
            C18757.m43430();
            if (interfaceC0463.getType() == 44 || interfaceC0463.getType() == 40) {
                int iMo2054 = interfaceC0463.mo2054();
                if (this.f56258[iMo2054] != c18051.f56258[iMo2054]) {
                    return false;
                }
            }
        }
        return true;
    }
}
