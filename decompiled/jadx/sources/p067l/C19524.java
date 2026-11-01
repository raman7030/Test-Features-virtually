package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19524 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f59460;

    public C19524(int i) {
        byte[] bArr = new byte[i + 1];
        this.f59460 = bArr;
        Arrays.fill(bArr, (byte) 5);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m44356(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) it.next();
            if (interfaceC2808.getType() == 44 || interfaceC2808.getType() == 40) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44358(int i) {
        return (this.f59460[i] & 1) != 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44361(int i) {
        return (this.f59460[i] & 2) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m44360(int i) {
        return (this.f59460[i] & 4) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44359(C19524 c19524, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) it.next();
            C20195.m45697();
            if (interfaceC2808.getType() == 44 || interfaceC2808.getType() == 40) {
                int iMo4434 = interfaceC2808.mo4434();
                if (this.f59460[iMo4434] != c19524.f59460[iMo4434]) {
                    return false;
                }
            }
        }
        return true;
    }
}
