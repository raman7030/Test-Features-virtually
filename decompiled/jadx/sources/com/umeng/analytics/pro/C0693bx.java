package com.umeng.analytics.pro;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bx */
/* JADX INFO: compiled from: S4JL */
/* JADX INFO: loaded from: classes.dex */
public class C0693bx {

    /* JADX INFO: renamed from: a */
    public static int f2554a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public static void m2430a(int i) {
        f2554a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m2431a(AbstractC0690bu abstractC0690bu, byte b) {
        m2432a(abstractC0690bu, b, f2554a);
    }

    /* JADX INFO: renamed from: a */
    public static void m2432a(AbstractC0690bu abstractC0690bu, byte b, int i) throws C0671bb {
        if (i <= 0) {
            throw new C0671bb("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                abstractC0690bu.mo2395t();
                return;
            case 3:
                abstractC0690bu.mo2396u();
                return;
            case 4:
                abstractC0690bu.mo2400y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                abstractC0690bu.mo2397v();
                return;
            case 8:
                abstractC0690bu.mo2398w();
                return;
            case 10:
                abstractC0690bu.mo2399x();
                return;
            case 11:
                abstractC0690bu.mo2358A();
                return;
            case 12:
                abstractC0690bu.mo2385j();
                while (true) {
                    byte b2 = abstractC0690bu.mo2387l().f2531b;
                    if (b2 != 0) {
                        m2432a(abstractC0690bu, b2, i - 1);
                        abstractC0690bu.mo2388m();
                    } else {
                        abstractC0690bu.mo2386k();
                        return;
                    }
                }
                break;
            case 13:
                C0687br c0687brMo2389n = abstractC0690bu.mo2389n();
                while (i2 < c0687brMo2389n.f2537c) {
                    int i3 = i - 1;
                    m2432a(abstractC0690bu, c0687brMo2389n.f2535a, i3);
                    m2432a(abstractC0690bu, c0687brMo2389n.f2536b, i3);
                    i2++;
                }
                abstractC0690bu.mo2390o();
                return;
            case 14:
                C0694by c0694byMo2393r = abstractC0690bu.mo2393r();
                while (i2 < c0694byMo2393r.f2556b) {
                    m2432a(abstractC0690bu, c0694byMo2393r.f2555a, i - 1);
                    i2++;
                }
                abstractC0690bu.mo2394s();
                return;
            case 15:
                C0686bq c0686bqMo2391p = abstractC0690bu.mo2391p();
                while (i2 < c0686bqMo2391p.f2534b) {
                    m2432a(abstractC0690bu, c0686bqMo2391p.f2533a, i - 1);
                    i2++;
                }
                abstractC0690bu.mo2392q();
                return;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0692bw m2429a(byte[] bArr, InterfaceC0692bw interfaceC0692bw) {
        if (bArr[0] > 16) {
            return new C0684bo.a();
        }
        return (bArr.length <= 1 || (bArr[1] & GCMSIVBlockCipher.MASK) == 0) ? interfaceC0692bw : new C0684bo.a();
    }
}
