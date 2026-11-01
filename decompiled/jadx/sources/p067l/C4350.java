package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4350 {

    /* JADX INFO: renamed from: ۧ */
    public int f9740;

    /* JADX INFO: renamed from: ܽ */
    public final C2535 f9741;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f9742 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public int f9739 = 0;

    /* JADX INFO: renamed from: ֫ */
    private void m8980(C13068 c13068) {
        if (c13068.f18864 == -1) {
            C23994 c23994 = c13068.f36744;
            HashMap map = this.f9742;
            C13068 c13069 = (C13068) map.get(c23994);
            if (c13069 != null) {
                m8980(c13069);
            }
            C15276 c15276 = c13068.f36740;
            if (c15276 != null) {
                Iterator it = new C15907(c15276.f43597).iterator();
                while (it.hasNext()) {
                    C13068 c130610 = (C13068) map.get((C23994) it.next());
                    if (c130610 != null) {
                        m8980(c130610);
                    }
                }
            }
            int i = this.f9740;
            int i2 = this.f9739;
            this.f9739 = i2 + 1;
            this.f9740 = c13068.m16566(i, i2);
            map.remove(c13068.f36742);
        }
    }

    public C4350(C2535 c2535) {
        this.f9741 = c2535;
        for (C13068 c13068 : c2535.f33192) {
            this.f9742.put(c13068.f36742, c13068);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8981(int i) {
        this.f9740 = i;
        C2535 c2535 = this.f9741;
        C5651 c5651 = c2535.f33190;
        ArrayList arrayList = c2535.f33192;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C13068) it.next()).f18864 = -1;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m8980((C13068) it2.next());
        }
        for (C13068 c13068 : this.f9742.values()) {
            arrayList.set(c13068.f18866, c13068);
        }
        return this.f9740;
    }
}
