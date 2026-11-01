package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C8586 {

    /* JADX INFO: renamed from: ֫ */
    public final C7205 f23068;

    /* JADX INFO: renamed from: ۧ */
    public final C10832 f23069;

    /* JADX INFO: renamed from: ܽ */
    public final C4563 f23070;

    public C8586(C4563 c4563, C10832 c10832, boolean z) {
        Object objLast;
        C7205 c7205;
        C17302 c17302 = c10832.f30004;
        this.f23070 = c4563;
        this.f23069 = c10832;
        if (!z) {
            objLast = c17302.last();
        } else {
            objLast = c17302.get(0);
        }
        C24441 c24441 = (C24441) objLast;
        if (!z && !c24441.m53928()) {
            int iM31402 = c24441.f77379.m31402() + c24441.f77380;
            c7205 = new C7205(iM31402, iM31402);
        } else {
            c7205 = c24441.f77386;
        }
        this.f23068 = c7205;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8586 m19993(C4563 c4563, boolean z) {
        C10832 c10832M26557;
        C11503 c11503 = c4563.f10227;
        if (z) {
            C17302 c17302 = c11503.f32102;
            c10832M26557 = !c17302.isEmpty() ? (C10832) c17302.last() : null;
        } else {
            c10832M26557 = c11503.m26557();
        }
        if (c10832M26557 == null) {
            return null;
        }
        return new C8586(c4563, c10832M26557, z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19995() {
        return !this.f23068.equals(this.f23070.f10229);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19994() {
        Iterator it = this.f23069.f30004.iterator();
        int i = 0;
        while (true) {
            C21998 c21998 = (C21998) it;
            if (!c21998.hasNext()) {
                return false;
            }
            if (!((C24441) c21998.next()).m53928() && (i = i + 1) >= 64) {
                return true;
            }
        }
    }
}
