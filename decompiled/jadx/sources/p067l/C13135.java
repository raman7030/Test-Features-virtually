package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13135 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f36900;

    /* JADX INFO: renamed from: ֫ */
    public final int m30045() {
        return m30041(this.f36900);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m30048() {
        return C21562.unmodifiableList(this.f36900);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30041(List list) {
        Iterator it = list.iterator();
        int iM30041 = 0;
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            if (c9522.m22165()) {
                if (c9522.m22151()) {
                    iM30041++;
                }
            } else {
                iM30041 += m30041(c9522.f26067);
            }
        }
        return iM30041;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30046(HashSet hashSet) {
        m30042(hashSet, this.f36900);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30042(HashSet hashSet, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            if (c9522.m22165()) {
                if (c9522.m22151()) {
                    hashSet.add(c9522.f26070);
                }
            } else {
                m30042(hashSet, c9522.f26067);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30049() {
        m30044(this.f36900);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m30044(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            boolean zM22165 = c9522.m22165();
            ArrayList arrayList = c9522.f26067;
            if (zM22165) {
                if (c9522.m22151()) {
                    it.remove();
                }
            } else {
                m30044(arrayList);
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30047(InterfaceC4417 interfaceC4417) {
        m30043(interfaceC4417, this.f36900);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30043(InterfaceC4417 interfaceC4417, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9522 c9522 = (C9522) it.next();
            boolean zMo9209 = interfaceC4417.mo9209();
            if (zMo9209) {
                interfaceC4417.mo9208(c9522);
            }
            if (!c9522.m22165()) {
                m30043(interfaceC4417, c9522.f26067);
            }
            if (!zMo9209) {
                interfaceC4417.mo9208(c9522);
            }
        }
    }
}
