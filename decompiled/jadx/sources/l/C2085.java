package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2085 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6956;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0176 f6957;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f6958 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6955 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6854(C11258 c11258) {
        if (c11258.f16030 == -1) {
            C22755 c22755 = c11258.f33744;
            HashMap map = this.f6958;
            C11258 c11259 = (C11258) map.get(c22755);
            if (c11259 != null) {
                m6854(c11259);
            }
            C13582 c13582 = c11258.f33740;
            if (c13582 != null) {
                Iterator it = new C14246(c13582.f40520).iterator();
                while (it.hasNext()) {
                    C11258 c112510 = (C11258) map.get((C22755) it.next());
                    if (c112510 != null) {
                        m6854(c112510);
                    }
                }
            }
            int i = this.f6956;
            int i2 = this.f6955;
            this.f6955 = i2 + 1;
            this.f6956 = c11258.m14658(i, i2);
            map.remove(c11258.f33742);
        }
    }

    public C2085(C0176 c0176) {
        this.f6957 = c0176;
        for (C11258 c11258 : c0176.f30234) {
            this.f6958.put(c11258.f33742, c11258);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6855(int i) {
        this.f6956 = i;
        C0176 c0176 = this.f6957;
        C3454 c3454 = c0176.f30232;
        ArrayList arrayList = c0176.f30234;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C11258) it.next()).f16030 = -1;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m6854((C11258) it2.next());
        }
        for (C11258 c11258 : this.f6958.values()) {
            arrayList.set(c11258.f16032, c11258);
        }
        return this.f6956;
    }
}
