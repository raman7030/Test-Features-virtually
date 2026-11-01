package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17897 {

    /* JADX INFO: renamed from: ֫ */
    public final C6644 f53471;

    /* JADX INFO: renamed from: ۧ */
    public final C6644 f53472;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f53473;

    /* JADX INFO: renamed from: ܽ */
    public final C6644 f53474;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f53475;

    /* JADX INFO: renamed from: ᩳ */
    public final C6644 f53476;

    public C17897(ArrayList arrayList, ArrayList arrayList2, C6644 c6644, C6644 c6645, C6644 c6646, C6644 c6647, int i, int i2) {
        this.f53475 = C19239.m43821(arrayList);
        this.f53473 = C19239.m43821(arrayList2);
        this.f53471 = C19239.m43816(c6644);
        this.f53472 = C19239.m43816(c6645);
        this.f53474 = c6646 == null ? new C6644(0, i) : C19239.m43816(c6646);
        this.f53476 = c6647 == null ? new C6644(0, i2) : C19239.m43816(c6647);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40698(C17897 c17897) {
        return m40696(this.f53475, c17897.f53475) && m40696(this.f53473, c17897.f53473) && m40697(this.f53471, c17897.f53471) && m40697(this.f53472, c17897.f53472) && m40697(this.f53474, c17897.f53474) && m40697(this.f53476, c17897.f53476);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40696(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() == arrayList2.size()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (m40697((C6644) arrayList.get(i), (C6644) arrayList2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40697(C6644 c6644, C6644 c6645) {
        if (c6644 == null || c6645 == null) {
            return c6644 == c6645;
        }
        return c6644.f17145 == c6645.f17145 && c6644.f17144 == c6645.f17144;
    }
}
