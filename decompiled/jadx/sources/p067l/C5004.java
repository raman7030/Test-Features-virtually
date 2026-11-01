package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۖ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5004 {

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 f11437 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public int f11435 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public final Stack f11438 = new Stack();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f11436 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10633(C19244 c19244) {
        Boolean bool = (Boolean) this.f11437.get(c19244);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = (Boolean) this.f11437.get(c19244);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return m10632(c19244).f30577.f52996;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C11039 m10632(C19244 c19244) {
        C11039 c11039;
        ArrayList arrayList;
        boolean z;
        C17743 c17743;
        int i = this.f11435;
        this.f11435 = i + 1;
        C11039 c110310 = new C11039(c19244, i);
        Stack stack = this.f11438;
        stack.push(c110310);
        HashMap map = this.f11436;
        map.put(c19244, c110310);
        for (C2479 c2479 : c19244.getFields()) {
            if (c2479.m3539() == EnumC19915.MESSAGE) {
                C11039 c110311 = (C11039) map.get(c2479.m3548());
                if (c110311 == null) {
                    c110310.f30580 = Math.min(c110310.f30580, m10632(c2479.m3548()).f30580);
                } else if (c110311.f30577 == null) {
                    c110310.f30580 = Math.min(c110310.f30580, c110311.f30580);
                }
            }
        }
        if (c110310.f30579 == c110310.f30580) {
            C17743 c17744 = new C17743();
            do {
                c11039 = (C11039) stack.pop();
                c11039.f30577 = c17744;
                C19244 c19245 = c11039.f30578;
                arrayList = c17744.f52995;
                arrayList.add(c19245);
            } while (c11039 != c110310);
            Iterator it = arrayList.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C19244 c19246 = (C19244) it.next();
                z = true;
                if (c19246.m43843()) {
                    break;
                }
                for (C2479 c24710 : c19246.getFields()) {
                    if (c24710.m3529() || (c24710.m3539() == EnumC19915.MESSAGE && (c17743 = ((C11039) map.get(c24710.m3548())).f30577) != c17744 && c17743.f52996)) {
                        break loop2;
                    }
                }
            }
            c17744.f52996 = z;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f11437.put((C19244) it2.next(), Boolean.valueOf(c17744.f52996));
            }
        }
        return c110310;
    }
}
