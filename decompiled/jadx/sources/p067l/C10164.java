package p067l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10164 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f28119 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m23669(AbstractActivityC5549 abstractActivityC5549, int i) {
        C3458 c3458;
        ArrayList arrayList = this.f28119;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                c3458 = null;
                break;
            }
            c3458 = (C3458) it.next();
        } while (c3458.f6927 != i);
        if (c3458 == null) {
            c3458 = new C3458(i);
            arrayList.add(c3458);
        }
        if (c3458.f6928 == null) {
            c3458.f6928 = abstractActivityC5549.m12252(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m23668(int i) {
        for (C3458 c3458 : this.f28119) {
            if (c3458.f6927 == i) {
                View view = c3458.f6928;
                if (view == null) {
                    break;
                }
                c3458.f6928 = null;
                return view;
            }
        }
        return null;
    }
}
