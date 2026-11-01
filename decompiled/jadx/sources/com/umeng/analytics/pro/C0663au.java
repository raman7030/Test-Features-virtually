package com.umeng.analytics.pro;

/* JADX INFO: renamed from: com.umeng.analytics.pro.au */
/* JADX INFO: compiled from: 746V */
/* JADX INFO: loaded from: classes.dex */
public class C0663au extends C0671bb {

    /* JADX INFO: renamed from: a */
    public static final int f2437a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f2438b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f2439c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f2440d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f2441e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f2442f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f2443g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f2444h = 7;

    /* JADX INFO: renamed from: j */
    public static final C0695bz f2445j = new C0695bz("TApplicationException");

    /* JADX INFO: renamed from: k */
    public static final C0685bp f2446k = new C0685bp("message", (byte) 11, 1);

    /* JADX INFO: renamed from: l */
    public static final C0685bp f2447l = new C0685bp("type", (byte) 8, 2);

    /* JADX INFO: renamed from: m */
    public static final long f2448m = 1;

    /* JADX INFO: renamed from: i */
    public int f2449i;

    public C0663au() {
        this.f2449i = 0;
    }

    public C0663au(int i) {
        this.f2449i = i;
    }

    public C0663au(int i, String str) {
        super(str);
        this.f2449i = i;
    }

    public C0663au(String str) {
        super(str);
        this.f2449i = 0;
    }

    /* JADX INFO: renamed from: a */
    public int m2274a() {
        return this.f2449i;
    }

    /* JADX INFO: renamed from: a */
    public static C0663au m2273a(AbstractC0690bu abstractC0690bu) {
        abstractC0690bu.mo2385j();
        String strMo2401z = null;
        int iMo2398w = 0;
        while (true) {
            C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
            byte b = c0685bpMo2387l.f2531b;
            if (b != 0) {
                short s = c0685bpMo2387l.f2532c;
                if (s != 1) {
                    if (s != 2) {
                        C0693bx.m2431a(abstractC0690bu, b);
                    } else if (b == 8) {
                        iMo2398w = abstractC0690bu.mo2398w();
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                } else if (b == 11) {
                    strMo2401z = abstractC0690bu.mo2401z();
                } else {
                    C0693bx.m2431a(abstractC0690bu, b);
                }
                abstractC0690bu.mo2388m();
            } else {
                abstractC0690bu.mo2386k();
                return new C0663au(iMo2398w, strMo2401z);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2275b(AbstractC0690bu abstractC0690bu) {
        abstractC0690bu.mo2369a(f2445j);
        if (getMessage() != null) {
            abstractC0690bu.mo2364a(f2446k);
            abstractC0690bu.mo2370a(getMessage());
            abstractC0690bu.mo2376c();
        }
        abstractC0690bu.mo2364a(f2447l);
        abstractC0690bu.mo2362a(this.f2449i);
        abstractC0690bu.mo2376c();
        abstractC0690bu.mo2378d();
        abstractC0690bu.mo2375b();
    }
}
