package p067l;

import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܽ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6Q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18182 {

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f54275 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۧ */
    public int[] f54276 = new int[24];

    /* JADX INFO: renamed from: ܽ */
    public int f54277;

    /* JADX INFO: renamed from: ֫ */
    public final void m41399(C10856 c10856) {
        if ((c10856 instanceof C11223) || (c10856 instanceof C6568) || (c10856 instanceof C12564) || (c10856 instanceof C13905)) {
            this.f54275.put(c10856, new C12819(0));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41400(C10856 c10856, InterfaceC2808 interfaceC2808) {
        boolean z = c10856 instanceof C23293;
        if (z || (c10856 instanceof C11223) || (c10856 instanceof C6568)) {
            C12819 c12819 = (C12819) this.f54275.get(z ? c10856.f65695 : c10856);
            if (c12819 == null) {
                return;
            }
            if (interfaceC2808.getType() == 45) {
                c12819.f36055 = (byte) (c12819.f36055 | 1);
            }
            if (interfaceC2808.getType() != 127 || (c10856 instanceof C6568)) {
                return;
            }
            c12819.f36055 = (byte) (c12819.f36055 | 2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41397(int i, int i2, byte b) {
        if (i < 0 || i2 <= i) {
            return;
        }
        int i3 = this.f54277 + 3;
        int[] iArr = this.f54276;
        if (i3 > iArr.length) {
            this.f54276 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f54276;
        int i4 = this.f54277;
        int i5 = i4 + 1;
        this.f54277 = i5;
        iArr2[i4] = i;
        int i6 = i4 + 2;
        this.f54277 = i6;
        iArr2[i5] = i2;
        this.f54277 = i4 + 3;
        iArr2[i6] = b;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19524 m41398(int i) {
        C19524 c19524 = new C19524(i);
        int i2 = this.f54277;
        while (true) {
            i2 -= 3;
            if (i2 < 0) {
                return c19524;
            }
            C20195.m45697();
            int iMax = Math.max(0, this.f54276[i2]);
            int iMin = Math.min(c19524.f59460.length, this.f54276[i2 + 1]);
            if (iMin > iMax) {
                Arrays.fill(c19524.f59460, iMax, iMin, (byte) this.f54276[i2 + 2]);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41401(C10856 c10856) {
        InterfaceC2808 interfaceC2808;
        C10856 c10857 = c10856.f65695;
        IdentityHashMap identityHashMap = this.f54275;
        C12819 c12819 = (C12819) identityHashMap.get(c10857);
        if (c12819 != null && (interfaceC2808 = c10856.f30091) != null && c10856.f30090 != null) {
            int iMo4434 = interfaceC2808.mo4434();
            int iMo4433 = c10856.f30090.mo4433() + 1;
            if (c10856 instanceof C7870) {
                c12819.f36057 = iMo4434;
                c12819.f36053 = iMo4433;
            }
            if (c10856 instanceof C15284) {
                c12819.f36056 = iMo4434;
                c12819.f36054 = iMo4433;
            }
            if (c10856 instanceof C5227) {
                c12819.f36052 = iMo4434;
                c12819.f36051 = iMo4433;
            }
        }
        C12819 c128110 = (C12819) identityHashMap.remove(c10856);
        if (c128110 == null) {
            return;
        }
        if ((c10856 instanceof C11223) || (c10856 instanceof C6568)) {
            InterfaceC2808 interfaceC2809 = c10856.f30091;
            if (interfaceC2809 == null || c10856.f30090 == null) {
                return;
            }
            m41397(interfaceC2809.mo4434(), c10856.f30090.mo4433() + 1, c128110.f36055);
            return;
        }
        boolean z = c10856 instanceof C12564;
        if (z || c128110.f36057 >= 0) {
            m41397(c128110.f36057, c128110.f36053, c128110.f36055);
            m41397(c128110.f36056, c128110.f36054, c128110.f36055);
            if (z) {
                m41397(c128110.f36052, c128110.f36051, (byte) 0);
            }
        }
    }
}
